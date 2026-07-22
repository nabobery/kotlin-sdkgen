@file:OptIn(ExperimentalSdkGenApi::class)

package com.nabobery.sdkgen.engine.spi

import com.nabobery.sdkgen.engine.config.ConfigDigest
import com.nabobery.sdkgen.engine.config.PluginConfig
import com.nabobery.sdkgen.engine.config.SdkgenConfigV1Alpha1
import com.nabobery.sdkgen.engine.declarations.AnyOfBranchShape
import com.nabobery.sdkgen.engine.declarations.AnyOfDeclaration
import com.nabobery.sdkgen.engine.declarations.Declaration
import com.nabobery.sdkgen.engine.declarations.GenerationDiagnostic
import com.nabobery.sdkgen.engine.declarations.GenerationDiagnosticCode
import com.nabobery.sdkgen.engine.declarations.KotlinDeclarationModel
import com.nabobery.sdkgen.engine.declarations.KotlinFileDeclaration
import com.nabobery.sdkgen.engine.declarations.KotlinNameResolver
import com.nabobery.sdkgen.engine.declarations.ModelDeclaration
import com.nabobery.sdkgen.engine.declarations.OneOfDeclaration
import com.nabobery.sdkgen.engine.declarations.OpenEnumDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationClientDeclaration
import com.nabobery.sdkgen.engine.declarations.PrimitiveOneOfDeclaration
import com.nabobery.sdkgen.engine.declarations.SupportDeclaration
import com.nabobery.sdkgen.engine.declarations.SupportKind
import com.nabobery.sdkgen.engine.declarations.rewriteTypeReferences
import com.nabobery.sdkgen.model.DiagnosticPhase
import com.nabobery.sdkgen.model.DiagnosticSeverity
import com.nabobery.sdkgen.model.SemanticDocument
import com.nabobery.sdkgen.model.SourcePointer
import java.util.Locale
import kotlin.coroutines.cancellation.CancellationException

/** Executes the preview phases in configured list order, without implicit discovery. */
@ExperimentalSdkGenApi
public class SdkGenPluginEngine(
    registry: SdkGenPluginRegistry = BuiltInSdkGenPlugins.registry(),
) {
    public val registry: SdkGenPluginRegistry = registry

    /**
     * Runs [from] and every later phase for which an input value is present. This staged form lets
     * the generation pipeline run declaration plugins after projection and output plugins after
     * rendering without repeating earlier transformations. Configuration-invalid plugins, and
     * plugins that reject or return an invalid phase value, are diagnosed and skipped thereafter.
     */
    public fun run(
        config: SdkgenConfigV1Alpha1,
        input: PluginPipelineInput,
        from: SdkGenPluginPhase = SdkGenPluginPhase.VALIDATION,
    ): PluginPipelineResult {
        val invocations = resolve(config, input.source)
        val configuration = validateConfiguration(invocations, input.source)
        val executableInvocations =
            invocations.filter { invocation ->
                invocation.config.enabled && invocation.index !in configuration.invalidInvocationIndexes
            }
        val skippedInvocationIndexes = configuration.invalidInvocationIndexes.toMutableSet()
        skippedInvocationIndexes +=
            invocations
                .filter { invocation ->
                    invocation.config.enabled && invocation.config.id in input.skippedPluginIds
                }.map { invocation -> invocation.index }
        val diagnostics = input.initialDiagnostics.toMutableList()
        diagnostics += configuration.diagnostics
        var document = input.document
        var naming = input.naming
        var declarations = input.declarations
        var output = input.output

        if (from.ordinal <= SdkGenPluginPhase.VALIDATION.ordinal) {
            var validation = ValidationPhaseValue(document)
            executableInvocations.filterNot { it.index in skippedInvocationIndexes }.forEach { invocation ->
                val plugin = invocation.plugin as? ValidationPlugin ?: return@forEach
                val before = validation.diagnostics.toSet()
                val diagnosticsBefore = diagnostics.size
                when (val result = invokeValidation(plugin, validation, invocation.context)) {
                    is PluginPhaseResult.Applied -> {
                        val candidate = result.value
                        val invalid =
                            validateValidation(
                                candidate,
                                validation.document,
                                validation.diagnostics,
                                invocation.context,
                            )
                        diagnostics += invalid
                        if (invalid.isEmpty()) {
                            validation = candidate
                            document = candidate.document
                            diagnostics +=
                                candidate.diagnostics
                                    .filterNot(before::contains)
                                    .map { diagnostic ->
                                        normalize(diagnostic, invocation.context, SdkGenPluginPhase.VALIDATION)
                                    }
                        } else {
                            skippedInvocationIndexes += invocation.index
                        }
                    }

                    is PluginPhaseResult.Rejected -> {
                        diagnostics +=
                            rejectedDiagnostics(result, plugin, SdkGenPluginPhase.VALIDATION, invocation.context)
                        skippedInvocationIndexes += invocation.index
                    }
                }
                if (hasBlockingDiagnosticSince(diagnostics, diagnosticsBefore)) {
                    skippedInvocationIndexes += invocation.index
                }
            }
        }

        if (from.ordinal <= SdkGenPluginPhase.SEMANTIC_TRANSFORM.ordinal) {
            executableInvocations.filterNot { it.index in skippedInvocationIndexes }.forEach { invocation ->
                val plugin = invocation.plugin as? SemanticTransformPlugin ?: return@forEach
                val diagnosticsBefore = diagnostics.size
                val inputValue = SemanticTransformPhaseValue(document)
                when (val result = invokeSemantic(plugin, inputValue, invocation.context)) {
                    is PluginPhaseResult.Applied -> {
                        val candidate = result.value
                        val invalid = validateSemantic(candidate, invocation.context)
                        diagnostics += invalid
                        if (invalid.isEmpty()) {
                            document = candidate.document
                        } else {
                            skippedInvocationIndexes += invocation.index
                        }
                    }

                    is PluginPhaseResult.Rejected -> {
                        diagnostics +=
                            rejectedDiagnostics(
                                result,
                                plugin,
                                SdkGenPluginPhase.SEMANTIC_TRANSFORM,
                                invocation.context,
                            )
                        skippedInvocationIndexes += invocation.index
                    }
                }
                if (hasBlockingDiagnosticSince(diagnostics, diagnosticsBefore)) {
                    skippedInvocationIndexes += invocation.index
                }
            }
        }

        if (from.ordinal <= SdkGenPluginPhase.NAMING_TYPE_MAPPING.ordinal) {
            naming = runNaming(executableInvocations, naming, diagnostics, skippedInvocationIndexes)
        }

        if (from.ordinal <= SdkGenPluginPhase.DECLARATION_AUGMENTATION.ordinal) {
            if (declarations == null && from == SdkGenPluginPhase.DECLARATION_AUGMENTATION) {
                error("Declaration augmentation requires a declaration phase value")
            }
            declarations?.let { initial ->
                declarations = runDeclarations(executableInvocations, initial, diagnostics, skippedInvocationIndexes)
            }
        }

        if (from.ordinal <= SdkGenPluginPhase.OUTPUT_VERIFICATION.ordinal) {
            if (output == null && from == SdkGenPluginPhase.OUTPUT_VERIFICATION) {
                error("Output verification requires an output phase value")
            }
            output?.let { initial ->
                output = runOutputVerification(executableInvocations, initial, diagnostics, skippedInvocationIndexes)
            }
        }

        return PluginPipelineResult(
            document = document,
            naming = naming,
            declarations = declarations,
            output = output,
            diagnostics =
                diagnostics
                    .distinct()
                    .sortedWith(
                        compareBy(
                            PluginDiagnostic::phase,
                            { diagnostic -> diagnostic.source.documentUri },
                            { diagnostic -> diagnostic.source.jsonPointer },
                            PluginDiagnostic::code,
                            PluginDiagnostic::pluginId,
                            PluginDiagnostic::message,
                        ),
                    ),
            records = records(executableInvocations),
            executionOrder = executableInvocations.map { invocation -> invocation.config.id },
        ).also { result ->
            result.skippedPluginIds =
                invocations
                    .filter { invocation -> invocation.config.enabled && invocation.index in skippedInvocationIndexes }
                    .map { invocation -> invocation.config.id }
                    .distinct()
        }
    }

    private fun runNaming(
        executableInvocations: List<Invocation>,
        initial: NamingTypeMappingPhaseValue,
        diagnostics: MutableList<PluginDiagnostic>,
        skippedInvocationIndexes: MutableSet<Int>,
    ): NamingTypeMappingPhaseValue {
        val applied = linkedMapOf<String, AppliedNaming>()
        var current = initial
        initial.overrides.forEach { override ->
            mergeNaming(override, "", applied, diagnostics)
        }
        current = effectiveNaming(current, applied)
        executableInvocations.filterNot { it.index in skippedInvocationIndexes }.forEach { invocation ->
            val plugin = invocation.plugin as? NamingTypeMappingPlugin ?: return@forEach
            val context = requireNotNull(invocation.context)
            val diagnosticsBefore = diagnostics.size
            when (val result = invokeNaming(plugin, current, context)) {
                is PluginPhaseResult.Applied -> {
                    val candidate = result.value
                    val invalid = validateNaming(candidate, invocation.context)
                    diagnostics += invalid
                    if (invalid.isEmpty()) {
                        candidate.overrides.forEach { override ->
                            mergeNaming(override, context.descriptor.id, applied, diagnostics)
                        }
                        directNamingOverrides(current, candidate, context).forEach { override ->
                            mergeNaming(override, context.descriptor.id, applied, diagnostics)
                        }
                        current = effectiveNaming(candidate, applied)
                    } else {
                        skippedInvocationIndexes += invocation.index
                    }
                }

                is PluginPhaseResult.Rejected -> {
                    diagnostics +=
                        rejectedDiagnostics(
                            result,
                            plugin,
                            SdkGenPluginPhase.NAMING_TYPE_MAPPING,
                            invocation.context,
                        )
                    skippedInvocationIndexes += invocation.index
                }
            }
            if (hasBlockingDiagnosticSince(diagnostics, diagnosticsBefore)) {
                skippedInvocationIndexes += invocation.index
            }
        }
        return current
    }

    private fun runDeclarations(
        executableInvocations: List<Invocation>,
        initial: DeclarationAugmentationPhaseValue,
        diagnostics: MutableList<PluginDiagnostic>,
        skippedInvocationIndexes: MutableSet<Int>,
    ): DeclarationAugmentationPhaseValue {
        val knownDeclarations = initial.declarations.associateBy(DeclarationSnapshot::symbolId)
        val applied = linkedMapOf<String, DeclarationAugmentation>()
        val initialInvalid =
            validateAugmentations(
                augmentations = initial.augmentations,
                knownDeclarations = knownDeclarations,
                existing = emptyMap(),
                pluginId = "",
            )
        diagnostics += initialInvalid
        if (initialInvalid.isEmpty()) {
            initial.augmentations.forEach { augmentation ->
                mergeDeclaration(augmentation, knownDeclarations, applied, diagnostics, "")
            }
        }
        var current = initial.copy(augmentations = applied.values.toList())
        executableInvocations.filterNot { it.index in skippedInvocationIndexes }.forEach { invocation ->
            val plugin = invocation.plugin as? DeclarationAugmentationPlugin ?: return@forEach
            val context = requireNotNull(invocation.context)
            val diagnosticsBefore = diagnostics.size
            when (val result = invokeDeclarations(plugin, current, context)) {
                is PluginPhaseResult.Applied -> {
                    val candidate = result.value
                    val invalid =
                        validateDeclarations(candidate, current.declarations, invocation.context) +
                            validateAugmentations(
                                augmentations = candidate.augmentations,
                                knownDeclarations = knownDeclarations,
                                existing = applied,
                                pluginId = context.descriptor.id,
                            )
                    diagnostics += invalid
                    if (invalid.isEmpty()) {
                        candidate.augmentations.forEach { augmentation ->
                            mergeDeclaration(
                                augmentation,
                                knownDeclarations,
                                applied,
                                diagnostics,
                                context.descriptor.id,
                            )
                        }
                        current = candidate.copy(augmentations = applied.values.toList())
                    } else {
                        skippedInvocationIndexes += invocation.index
                    }
                }

                is PluginPhaseResult.Rejected -> {
                    diagnostics +=
                        rejectedDiagnostics(
                            result,
                            plugin,
                            SdkGenPluginPhase.DECLARATION_AUGMENTATION,
                            invocation.context,
                        )
                    skippedInvocationIndexes += invocation.index
                }
            }
            if (hasBlockingDiagnosticSince(diagnostics, diagnosticsBefore)) {
                skippedInvocationIndexes += invocation.index
            }
        }
        return current
    }

    private fun runOutputVerification(
        executableInvocations: List<Invocation>,
        initial: OutputVerificationPhaseValue,
        diagnostics: MutableList<PluginDiagnostic>,
        skippedInvocationIndexes: MutableSet<Int>,
    ): OutputVerificationPhaseValue {
        var current = initial
        executableInvocations.filterNot { it.index in skippedInvocationIndexes }.forEach { invocation ->
            val plugin = invocation.plugin as? OutputVerificationPlugin ?: return@forEach
            val before = current.diagnostics.toSet()
            val diagnosticsBefore = diagnostics.size
            when (val result = invokeOutput(plugin, current, invocation.context)) {
                is PluginPhaseResult.Applied -> {
                    val candidate = result.value
                    val invalid =
                        validateOutput(candidate, current.files, current.diagnostics, invocation.context)
                    diagnostics += invalid
                    if (invalid.isEmpty()) {
                        current = candidate
                        diagnostics +=
                            candidate.diagnostics
                                .filterNot(before::contains)
                                .map { diagnostic ->
                                    normalize(diagnostic, invocation.context, SdkGenPluginPhase.OUTPUT_VERIFICATION)
                                }
                    } else {
                        skippedInvocationIndexes += invocation.index
                    }
                }

                is PluginPhaseResult.Rejected -> {
                    diagnostics +=
                        rejectedDiagnostics(
                            result,
                            plugin,
                            SdkGenPluginPhase.OUTPUT_VERIFICATION,
                            invocation.context,
                        )
                    skippedInvocationIndexes += invocation.index
                }
            }
            if (hasBlockingDiagnosticSince(diagnostics, diagnosticsBefore)) {
                skippedInvocationIndexes += invocation.index
            }
        }
        return current
    }

    private fun resolve(
        config: SdkgenConfigV1Alpha1,
        source: SourcePointer,
    ): List<Invocation> =
        config.plugins.mapIndexed { index, pluginConfig ->
            if (!pluginConfig.enabled) {
                Invocation(index, pluginConfig, null, null)
            } else {
                val plugin = registry.find(pluginConfig.id)
                val context =
                    plugin?.let {
                        PluginContext(
                            descriptor = it.descriptor,
                            config = pluginConfig.config,
                            source = source.copy(jsonPointer = "/plugins/$index"),
                        )
                    }
                Invocation(index, pluginConfig, plugin, context)
            }
        }

    private fun records(invocations: List<Invocation>): List<PluginRecord> =
        invocations.map { invocation ->
            val plugin = invocation.config
            PluginRecord(
                id = plugin.id,
                version = plugin.version,
                spiRange = plugin.spiRange,
                configDigest = ConfigDigest.sha256(plugin.config),
                phases = requireNotNull(invocation.plugin).descriptor.phases,
            )
        }

    private fun implementedPhases(plugin: SdkGenPlugin): Set<SdkGenPluginPhase> =
        buildSet {
            if (plugin is ValidationPlugin) add(SdkGenPluginPhase.VALIDATION)
            if (plugin is SemanticTransformPlugin) add(SdkGenPluginPhase.SEMANTIC_TRANSFORM)
            if (plugin is NamingTypeMappingPlugin) add(SdkGenPluginPhase.NAMING_TYPE_MAPPING)
            if (plugin is DeclarationAugmentationPlugin) add(SdkGenPluginPhase.DECLARATION_AUGMENTATION)
            if (plugin is OutputVerificationPlugin) add(SdkGenPluginPhase.OUTPUT_VERIFICATION)
        }

    private fun validateConfiguration(
        invocations: List<Invocation>,
        source: SourcePointer,
    ): ConfigurationValidation {
        val enabledCounts =
            invocations
                .filter { invocation -> invocation.config.enabled }
                .groupingBy { invocation -> invocation.config.id }
                .eachCount()
        val invalidInvocationIndexes = mutableSetOf<Int>()
        val diagnostics =
            invocations.flatMap { invocation ->
                if (!invocation.config.enabled) return@flatMap emptyList()
                val path = source.copy(jsonPointer = "/plugins/${invocation.index}")
                val plugin = invocation.plugin
                val pluginDiagnostics =
                    buildList {
                        if ((enabledCounts[invocation.config.id] ?: 0) > 1) {
                            add(
                                pluginDiagnostic(
                                    code = "SDKGEN-PLUGIN-DUPLICATE",
                                    phase = SdkGenPluginPhase.VALIDATION,
                                    message = "Plugin '${invocation.config.id}' is configured more than once.",
                                    remediation =
                                        "Keep one plugin entry and make its ordering explicit in the config list.",
                                    source = path,
                                    pluginId = invocation.config.id,
                                ),
                            )
                        }
                        if (invocation.config.id.isBlank()) {
                            add(
                                pluginDiagnostic(
                                    code = "SDKGEN-PLUGIN-ID-INVALID",
                                    phase = SdkGenPluginPhase.VALIDATION,
                                    message = "Configured plugin ID must not be blank.",
                                    remediation = "Set the plugin ID to a registered descriptor ID.",
                                    source = path,
                                    pluginId = invocation.config.id,
                                ),
                            )
                        }
                        if (invocation.config.version.isBlank()) {
                            add(
                                pluginDiagnostic(
                                    code = "SDKGEN-PLUGIN-VERSION-INVALID",
                                    phase = SdkGenPluginPhase.VALIDATION,
                                    message = "Configured plugin version must not be blank.",
                                    remediation = "Set the version to the registered descriptor version.",
                                    source = path,
                                    pluginId = invocation.config.id,
                                ),
                            )
                        }
                        if (invocation.config.spiRange.isBlank()) {
                            add(
                                pluginDiagnostic(
                                    code = "SDKGEN-PLUGIN-SPI-RANGE-INVALID",
                                    phase = SdkGenPluginPhase.VALIDATION,
                                    message = "Configured plugin SPI range must not be blank.",
                                    remediation = "Set the SPI range to the registered descriptor range.",
                                    source = path,
                                    pluginId = invocation.config.id,
                                ),
                            )
                        } else {
                            when (PluginSpiRange.validate(invocation.config.spiRange)) {
                                PluginSpiRange.Validation.INVALID_SYNTAX -> {
                                    add(
                                        pluginDiagnostic(
                                            code = "SDKGEN-PLUGIN-SPI-RANGE-INVALID",
                                            phase = SdkGenPluginPhase.VALIDATION,
                                            message =
                                                "Configured plugin SPI range '${invocation.config.spiRange}' " +
                                                    "has invalid syntax; expected a canonical exclusive upper range " +
                                                    "such as '>=0.1 <0.2'.",
                                            remediation = "Use the published SPI range syntax for the current engine.",
                                            source = path,
                                            pluginId = invocation.config.id,
                                        ),
                                    )
                                }

                                PluginSpiRange.Validation.INCOMPATIBLE -> {
                                    add(
                                        pluginDiagnostic(
                                            code = "SDKGEN-PLUGIN-SPI-RANGE-INCOMPATIBLE",
                                            phase = SdkGenPluginPhase.VALIDATION,
                                            message =
                                                "Configured plugin SPI range '${invocation.config.spiRange}' does " +
                                                    "not include engine SPI " +
                                                    "${PluginSpiRange.CURRENT_ENGINE_SPI_VERSION}.",
                                            remediation =
                                                "Declare a range that includes the current engine SPI version " +
                                                    "${PluginSpiRange.CURRENT_ENGINE_SPI_VERSION}.",
                                            source = path,
                                            pluginId = invocation.config.id,
                                        ),
                                    )
                                }

                                PluginSpiRange.Validation.VALID -> {
                                    Unit
                                }
                            }
                        }
                        if (plugin == null) {
                            add(
                                pluginDiagnostic(
                                    code = "SDKGEN-PLUGIN-NOT-FOUND",
                                    phase = SdkGenPluginPhase.VALIDATION,
                                    message =
                                        "Configured plugin '${invocation.config.id}' is not registered; " +
                                            "StandardProjection is now the general projection path.",
                                    remediation =
                                        "Use one of the registered built-in plugins, or rely on StandardProjection " +
                                            "instead of the removed OpenRouter phase-1 projection.",
                                    source = path,
                                    pluginId = invocation.config.id,
                                ),
                            )
                        } else {
                            when (PluginSpiRange.validate(plugin.descriptor.spiRange)) {
                                PluginSpiRange.Validation.INVALID_SYNTAX -> {
                                    add(
                                        pluginDiagnostic(
                                            code = "SDKGEN-PLUGIN-SPI-RANGE-INVALID",
                                            phase = SdkGenPluginPhase.VALIDATION,
                                            message =
                                                "Registered plugin SPI range '${plugin.descriptor.spiRange}' " +
                                                    "has invalid syntax.",
                                            remediation =
                                                "Fix the plugin descriptor to use the published SPI range syntax.",
                                            source = path,
                                            pluginId = invocation.config.id,
                                        ),
                                    )
                                }

                                PluginSpiRange.Validation.INCOMPATIBLE -> {
                                    add(
                                        pluginDiagnostic(
                                            code = "SDKGEN-PLUGIN-SPI-RANGE-INCOMPATIBLE",
                                            phase = SdkGenPluginPhase.VALIDATION,
                                            message =
                                                "Registered plugin SPI range '${plugin.descriptor.spiRange}' does " +
                                                    "not include engine SPI " +
                                                    "${PluginSpiRange.CURRENT_ENGINE_SPI_VERSION}.",
                                            remediation =
                                                "Fix the plugin descriptor to include the current engine SPI version.",
                                            source = path,
                                            pluginId = invocation.config.id,
                                        ),
                                    )
                                }

                                PluginSpiRange.Validation.VALID -> {
                                    Unit
                                }
                            }
                            if (plugin.descriptor.version != invocation.config.version) {
                                add(
                                    pluginDiagnostic(
                                        code = "SDKGEN-PLUGIN-VERSION-MISMATCH",
                                        phase = SdkGenPluginPhase.VALIDATION,
                                        message =
                                            "Plugin '${invocation.config.id}' requested version " +
                                                "'${invocation.config.version}' but registered version is " +
                                                "'${plugin.descriptor.version}'.",
                                        remediation = "Align the config entry with the registered plugin version.",
                                        source = path,
                                        pluginId = invocation.config.id,
                                    ),
                                )
                            }
                            if (plugin.descriptor.spiRange != invocation.config.spiRange) {
                                add(
                                    pluginDiagnostic(
                                        code = "SDKGEN-PLUGIN-SPI-RANGE-MISMATCH",
                                        phase = SdkGenPluginPhase.VALIDATION,
                                        message =
                                            "Plugin '${invocation.config.id}' requested SPI range " +
                                                "'${invocation.config.spiRange}' but registered range is " +
                                                "'${plugin.descriptor.spiRange}'.",
                                        remediation =
                                            "Use the plugin's declared SPI range or upgrade the plugin " +
                                                "implementation.",
                                        source = path,
                                        pluginId = invocation.config.id,
                                    ),
                                )
                            }
                            val implementedPhases = implementedPhases(plugin)
                            if (implementedPhases != plugin.descriptor.phases.toSet()) {
                                add(
                                    pluginDiagnostic(
                                        code = "SDKGEN-PLUGIN-PHASE-MISMATCH",
                                        phase = SdkGenPluginPhase.VALIDATION,
                                        message =
                                            "Plugin '${invocation.config.id}' declares phases " +
                                                "${plugin.descriptor.phases} but implements $implementedPhases.",
                                        remediation =
                                            "Declare exactly the phases implemented by the plugin interface.",
                                        source = path,
                                        pluginId = invocation.config.id,
                                    ),
                                )
                            }
                        }
                    }
                if (pluginDiagnostics.isNotEmpty()) invalidInvocationIndexes += invocation.index
                pluginDiagnostics
            }
        return ConfigurationValidation(diagnostics, invalidInvocationIndexes)
    }

    private fun validateValidation(
        value: ValidationPhaseValue,
        expectedDocument: SemanticDocument,
        expectedDiagnostics: List<PluginDiagnostic>,
        context: PluginContext?,
    ): List<PluginDiagnostic> {
        if (context == null) return emptyList()
        return buildList {
            if (value.document != expectedDocument) {
                add(
                    context.diagnostic(
                        code = "SDKGEN-PLUGIN-INVALID-RESULT",
                        phase = SdkGenPluginPhase.VALIDATION,
                        message = "A validation plugin changed the semantic document.",
                        remediation =
                            "Return the supplied semantic document unchanged; use the semantic " +
                                "transform phase to replace it.",
                    ),
                )
            }
            if (value.diagnostics.take(expectedDiagnostics.size) != expectedDiagnostics) {
                add(
                    context.diagnostic(
                        code = "SDKGEN-PLUGIN-INVALID-RESULT",
                        phase = SdkGenPluginPhase.VALIDATION,
                        message = "A validation plugin removed or reordered accumulated diagnostics.",
                        remediation = "Preserve existing diagnostics and append new diagnostics in order.",
                    ),
                )
            }
            if (value.document.documentUri.isBlank()) {
                add(
                    context.diagnostic(
                        code = "SDKGEN-PLUGIN-INVALID-RESULT",
                        phase = SdkGenPluginPhase.VALIDATION,
                        message = "A validation plugin returned a document without a document URI.",
                        remediation = "Return a complete immutable SemanticDocument value.",
                    ),
                )
            }
        }
    }

    private fun validateSemantic(
        value: SemanticTransformPhaseValue,
        context: PluginContext?,
    ): List<PluginDiagnostic> =
        if (context == null || value.document.documentUri.isNotBlank()) {
            emptyList()
        } else {
            listOf(
                context.diagnostic(
                    code = "SDKGEN-PLUGIN-INVALID-RESULT",
                    phase = SdkGenPluginPhase.SEMANTIC_TRANSFORM,
                    message = "A semantic transform returned a document without a document URI.",
                    remediation = "Return a complete immutable SemanticDocument value.",
                ),
            )
        }

    private fun validateNaming(
        value: NamingTypeMappingPhaseValue,
        context: PluginContext?,
    ): List<PluginDiagnostic> {
        if (context == null) return emptyList()
        return buildList {
            if (!isValidKotlinIdentifier(value.clientName)) {
                add(
                    context.diagnostic(
                        code = "SDKGEN-PLUGIN-INVALID-RESULT",
                        phase = SdkGenPluginPhase.NAMING_TYPE_MAPPING,
                        message = "A naming plugin returned invalid Kotlin client name '${value.clientName}'.",
                        remediation = "Return a non-keyword Kotlin identifier for the client name.",
                    ),
                )
            }
            listOfNotNull(
                "modelPrefix" to value.modelPrefix,
                "operationPrefix" to value.operationPrefix,
            ).filter { (_, prefix) -> prefix != null && !isValidKotlinIdentifier(prefix) }.forEach { (key, prefix) ->
                add(
                    context.diagnostic(
                        code = "SDKGEN-PLUGIN-INVALID-RESULT",
                        phase = SdkGenPluginPhase.NAMING_TYPE_MAPPING,
                        message = "A naming plugin returned invalid Kotlin $key '$prefix'.",
                        remediation = "Return a non-keyword Kotlin identifier or null for the prefix.",
                    ),
                )
            }
            value.overrides.forEach { override ->
                when {
                    override.value.isBlank() -> {
                        add(
                            context.diagnostic(
                                code = "SDKGEN-PLUGIN-INVALID-RESULT",
                                phase = SdkGenPluginPhase.NAMING_TYPE_MAPPING,
                                message = "Naming override '${override.key}' has a blank value.",
                                remediation = "Return a non-empty naming override value.",
                                source = override.source,
                            ),
                        )
                    }

                    override.key in SUPPORTED_NAMING_KEYS && !isValidKotlinIdentifier(override.value) -> {
                        add(
                            context.diagnostic(
                                code = "SDKGEN-PLUGIN-INVALID-RESULT",
                                phase = SdkGenPluginPhase.NAMING_TYPE_MAPPING,
                                message =
                                    "Naming override '${override.key}' has invalid Kotlin identifier " +
                                        "'${override.value}'.",
                                remediation =
                                    "Return a non-keyword Kotlin identifier for supported naming overrides.",
                                source = override.source,
                            ),
                        )
                    }
                }
            }
        }
    }

    private fun validateDeclarations(
        value: DeclarationAugmentationPhaseValue,
        expectedDeclarations: List<DeclarationSnapshot>,
        context: PluginContext?,
    ): List<PluginDiagnostic> {
        if (context == null) return emptyList()
        val duplicateSymbols =
            value.declarations
                .groupingBy(DeclarationSnapshot::symbolId)
                .eachCount()
                .filterValues { count -> count > 1 }
                .keys
                .sorted()
        return buildList {
            if (value.declarations != expectedDeclarations) {
                add(
                    context.diagnostic(
                        code = "SDKGEN-PLUGIN-INVALID-RESULT",
                        phase = SdkGenPluginPhase.DECLARATION_AUGMENTATION,
                        message = "A declaration plugin changed the immutable declaration snapshots.",
                        remediation = "Return the supplied declaration snapshots unchanged.",
                    ),
                )
            }
            duplicateSymbols.forEach { symbolId ->
                add(
                    context.diagnostic(
                        code = "SDKGEN-PLUGIN-INVALID-RESULT",
                        phase = SdkGenPluginPhase.DECLARATION_AUGMENTATION,
                        message = "Declaration snapshots contain duplicate symbol '$symbolId'.",
                        remediation = "Return one snapshot for each declaration symbol.",
                    ),
                )
            }
        }
    }

    private fun validateOutput(
        value: OutputVerificationPhaseValue,
        expectedFiles: List<GeneratedFileSnapshot>,
        expectedDiagnostics: List<PluginDiagnostic>,
        context: PluginContext?,
    ): List<PluginDiagnostic> {
        if (context == null) return emptyList()
        val duplicatePaths =
            value.files
                .groupingBy(GeneratedFileSnapshot::path)
                .eachCount()
                .filterValues { count -> count > 1 }
                .keys
                .sorted()
        return buildList {
            if (value.diagnostics.take(expectedDiagnostics.size) != expectedDiagnostics) {
                add(
                    context.diagnostic(
                        code = "SDKGEN-PLUGIN-INVALID-RESULT",
                        phase = SdkGenPluginPhase.OUTPUT_VERIFICATION,
                        message = "An output verification plugin removed or reordered accumulated diagnostics.",
                        remediation = "Preserve existing diagnostics and append new diagnostics in order.",
                    ),
                )
            }
            if (value.files != expectedFiles) {
                add(
                    context.diagnostic(
                        code = "SDKGEN-PLUGIN-INVALID-RESULT",
                        phase = SdkGenPluginPhase.OUTPUT_VERIFICATION,
                        message = "An output verification plugin changed the rendered file snapshots.",
                        remediation = "Return the supplied rendered file snapshots unchanged.",
                    ),
                )
            }
            duplicatePaths.forEach { path ->
                add(
                    context.diagnostic(
                        code = "SDKGEN-PLUGIN-INVALID-RESULT",
                        phase = SdkGenPluginPhase.OUTPUT_VERIFICATION,
                        message = "Output verification received duplicate file path '$path'.",
                        remediation = "Return one immutable snapshot for each rendered file.",
                    ),
                )
            }
        }
    }

    private fun validateAugmentations(
        augmentations: List<DeclarationAugmentation>,
        knownDeclarations: Map<String, DeclarationSnapshot>,
        existing: Map<String, DeclarationAugmentation>,
        pluginId: String,
    ): List<PluginDiagnostic> {
        val valid = mutableListOf<DeclarationAugmentation>()
        val diagnostics =
            buildList {
                augmentations
                    .groupingBy(DeclarationAugmentation::symbolId)
                    .eachCount()
                    .filterValues { count -> count > 1 }
                    .keys
                    .sorted()
                    .forEach { symbolId ->
                        val augmentation = augmentations.first { it.symbolId == symbolId }
                        add(
                            pluginDiagnostic(
                                code = "SDKGEN-PLUGIN-DUPLICATE-AUGMENTATION",
                                phase = SdkGenPluginPhase.DECLARATION_AUGMENTATION,
                                message = "Declaration '$symbolId' is augmented more than once by one phase result.",
                                remediation = "Return at most one augmentation for each declaration symbol.",
                                source = augmentation.source,
                                pluginId = pluginId,
                            ),
                        )
                    }
                augmentations.forEach { augmentation ->
                    val requestedName = augmentation.resolvedName
                    when {
                        augmentation.symbolId.isBlank() -> {
                            add(
                                pluginDiagnostic(
                                    code = "SDKGEN-PLUGIN-AUGMENTATION-IDENTIFIER-INVALID",
                                    phase = SdkGenPluginPhase.DECLARATION_AUGMENTATION,
                                    message = "Declaration augmentation symbol ID must not be blank.",
                                    remediation = "Target a non-empty symbol ID from the declaration snapshot.",
                                    source = augmentation.source,
                                    pluginId = pluginId,
                                ),
                            )
                        }

                        augmentation.symbolId !in knownDeclarations -> {
                            add(
                                pluginDiagnostic(
                                    code = "SDKGEN-PLUGIN-UNKNOWN-DECLARATION",
                                    phase = SdkGenPluginPhase.DECLARATION_AUGMENTATION,
                                    message =
                                        "Declaration augmentation targets unknown symbol '${augmentation.symbolId}'.",
                                    remediation = "Target a symbol present in the declaration snapshot.",
                                    source = augmentation.source,
                                    pluginId = pluginId,
                                ),
                            )
                        }

                        augmentation.symbolId.startsWith("support:") &&
                            requestedName != null &&
                            requestedName != knownDeclarations[augmentation.symbolId]?.resolvedName -> {
                            add(
                                pluginDiagnostic(
                                    code = "SDKGEN-PLUGIN-SUPPORT-RENAME-UNSUPPORTED",
                                    phase = SdkGenPluginPhase.DECLARATION_AUGMENTATION,
                                    message =
                                        "Support declaration '${augmentation.symbolId}' cannot be renamed " +
                                            "in the preview SPI because generated sources reference its " +
                                            "hardcoded support names.",
                                    remediation =
                                        "Omit resolvedName for support declarations until support-name " +
                                            "mapping is wired through every emitter reference.",
                                    source = augmentation.source,
                                    pluginId = pluginId,
                                ),
                            )
                        }

                        requestedName != null && !isValidKotlinIdentifier(requestedName) -> {
                            add(
                                pluginDiagnostic(
                                    code = "SDKGEN-PLUGIN-AUGMENTATION-IDENTIFIER-INVALID",
                                    phase = SdkGenPluginPhase.DECLARATION_AUGMENTATION,
                                    message =
                                        "Declaration '${augmentation.symbolId}' requested invalid Kotlin name " +
                                            "'${augmentation.resolvedName}'.",
                                    remediation =
                                        "Use a non-keyword Kotlin identifier beginning with a letter or underscore.",
                                    source = augmentation.source,
                                    pluginId = pluginId,
                                ),
                            )
                        }

                        else -> {
                            valid += augmentation
                        }
                    }
                }

                val merged = linkedMapOf<String, DeclarationAugmentation>()
                existing.forEach { (symbolId, augmentation) -> merged[symbolId] = augmentation }
                valid.forEach { augmentation -> merged.putIfAbsent(augmentation.symbolId, augmentation) }
                val validSymbols = valid.mapTo(mutableSetOf(), DeclarationAugmentation::symbolId)
                val emittedNames =
                    knownDeclarations.flatMap { (symbolId, declaration) ->
                        val resolvedName = merged[symbolId]?.resolvedName ?: declaration.resolvedName
                        declaration.emittedNamesFor(resolvedName).distinct().map { name ->
                            EmittedName(symbolId, declaration, name)
                        }
                    }
                emittedNames
                    .groupBy { emittedName -> "${emittedName.declaration.packageName}:${emittedName.name}" }
                    .filterValues { entries -> entries.map(EmittedName::symbolId).distinct().size > 1 }
                    .values
                    .flatten()
                    .filter { emittedName -> emittedName.symbolId in validSymbols }
                    .forEach { emittedName ->
                        val augmentation = requireNotNull(merged[emittedName.symbolId])
                        add(
                            pluginDiagnostic(
                                code = "SDKGEN-PLUGIN-NAME-COLLISION",
                                phase = SdkGenPluginPhase.DECLARATION_AUGMENTATION,
                                message =
                                    "Declaration augmentation would emit top-level name '${emittedName.name}' more " +
                                        "than once in package '${emittedName.declaration.packageName}'.",
                                remediation = "Choose a unique resolvedName for every declaration and emitted helper.",
                                source = augmentation.source,
                                pluginId = pluginId,
                            ),
                        )
                    }
            }
        return diagnostics
    }

    private fun isValidKotlinIdentifier(value: String): Boolean =
        value.matches(KOTLIN_IDENTIFIER) && value !in KOTLIN_KEYWORDS

    private fun directNamingOverrides(
        before: NamingTypeMappingPhaseValue,
        after: NamingTypeMappingPhaseValue,
        context: PluginContext,
    ): List<NamingOverride> =
        buildList {
            if (before.clientName != after.clientName) {
                add(NamingOverride("clientName", after.clientName, context.source))
            }
            if (before.modelPrefix != after.modelPrefix && after.modelPrefix != null) {
                add(NamingOverride("modelPrefix", after.modelPrefix, context.source))
            }
            if (before.operationPrefix != after.operationPrefix && after.operationPrefix != null) {
                add(NamingOverride("operationPrefix", after.operationPrefix, context.source))
            }
        }

    private fun mergeNaming(
        candidate: NamingOverride,
        pluginId: String,
        applied: MutableMap<String, AppliedNaming>,
        diagnostics: MutableList<PluginDiagnostic>,
    ) {
        if (candidate.key !in SUPPORTED_NAMING_KEYS) {
            diagnostics +=
                pluginDiagnostic(
                    code = "SDKGEN-PLUGIN-UNKNOWN-NAMING-KEY",
                    phase = SdkGenPluginPhase.NAMING_TYPE_MAPPING,
                    message = "Naming plugin requested unsupported key '${candidate.key}'.",
                    remediation = "Use one of clientName, modelPrefix, or operationPrefix.",
                    source = candidate.source,
                    pluginId = pluginId,
                )
            return
        }
        val prior = applied[candidate.key]
        if (prior == null) {
            applied[candidate.key] = AppliedNaming(candidate, pluginId)
        } else if (prior.override.value != candidate.value) {
            diagnostics +=
                pluginDiagnostic(
                    code = "SDKGEN-PLUGIN-CONFLICT",
                    phase = SdkGenPluginPhase.NAMING_TYPE_MAPPING,
                    message =
                        "Naming key '${candidate.key}' has conflicting values '${prior.override.value}' and " +
                            "'${candidate.value}'; the first configured value is retained. " +
                            "Earlier source: ${prior.override.source.documentUri}#" +
                            "${prior.override.source.jsonPointer}.",
                    remediation = "Remove the conflicting override or make plugin order intentional.",
                    source = candidate.source,
                    pluginId = pluginId,
                )
        }
    }

    private fun effectiveNaming(
        value: NamingTypeMappingPhaseValue,
        applied: Map<String, AppliedNaming>,
    ): NamingTypeMappingPhaseValue =
        value.copy(
            clientName = applied["clientName"]?.override?.value ?: value.clientName,
            modelPrefix = applied["modelPrefix"]?.override?.value ?: value.modelPrefix,
            operationPrefix = applied["operationPrefix"]?.override?.value ?: value.operationPrefix,
            overrides = applied.values.map(AppliedNaming::override),
        )

    private fun mergeDeclaration(
        candidate: DeclarationAugmentation,
        knownDeclarations: Map<String, DeclarationSnapshot>,
        applied: MutableMap<String, DeclarationAugmentation>,
        diagnostics: MutableList<PluginDiagnostic>,
        pluginId: String,
    ) {
        if (candidate.symbolId !in knownDeclarations) {
            diagnostics +=
                pluginDiagnostic(
                    code = "SDKGEN-PLUGIN-UNKNOWN-DECLARATION",
                    phase = SdkGenPluginPhase.DECLARATION_AUGMENTATION,
                    message = "Declaration augmentation targets unknown symbol '${candidate.symbolId}'.",
                    remediation = "Target a symbol present in the declaration snapshot.",
                    source = candidate.source,
                    pluginId = pluginId,
                )
            return
        }
        val prior = applied[candidate.symbolId]
        if (prior == null) {
            applied[candidate.symbolId] = candidate
            return
        }
        val nameConflict =
            prior.resolvedName != null &&
                candidate.resolvedName != null &&
                prior.resolvedName != candidate.resolvedName
        val kdocConflict = prior.kdoc != null && candidate.kdoc != null && prior.kdoc != candidate.kdoc
        if (nameConflict || kdocConflict) {
            diagnostics +=
                pluginDiagnostic(
                    code = "SDKGEN-PLUGIN-CONFLICT",
                    phase = SdkGenPluginPhase.DECLARATION_AUGMENTATION,
                    message =
                        "Declaration '${candidate.symbolId}' received conflicting augmentations; the first " +
                            "configured value is retained. Earlier source: ${prior.source.documentUri}#" +
                            "${prior.source.jsonPointer}.",
                    remediation = "Remove the conflicting augmentation or make plugin order intentional.",
                    source = candidate.source,
                    pluginId = pluginId,
                )
        }
        applied[candidate.symbolId] =
            prior.copy(
                resolvedName = prior.resolvedName ?: candidate.resolvedName,
                kdoc = prior.kdoc ?: candidate.kdoc,
            )
    }

    private fun normalize(
        diagnostic: PluginDiagnostic,
        context: PluginContext?,
        phase: SdkGenPluginPhase,
    ): PluginDiagnostic {
        val pluginId = context?.descriptor?.id ?: diagnostic.pluginId
        val code =
            if (diagnostic.code.startsWith("SDKGEN-")) {
                diagnostic.code
            } else {
                "SDKGEN-PLUGIN-${diagnostic.code.replace(Regex("[^A-Za-z0-9]+"), "-").uppercase(Locale.ROOT)}"
            }
        return diagnostic.copy(code = code, phase = phase, pluginId = pluginId)
    }

    private fun rejectedDiagnostics(
        result: PluginPhaseResult.Rejected,
        plugin: SdkGenPlugin,
        phase: SdkGenPluginPhase,
        context: PluginContext?,
    ): List<PluginDiagnostic> {
        val diagnostics =
            result.diagnostics.ifEmpty {
                listOf(
                    pluginDiagnostic(
                        code = "SDKGEN-PLUGIN-REJECTED",
                        phase = phase,
                        message =
                            "Plugin '${plugin.descriptor.id}' rejected its phase without a diagnostic.",
                        remediation = "Return a source-linked diagnostic explaining why the phase was rejected.",
                        source = requireNotNull(context).source,
                        pluginId = plugin.descriptor.id,
                    ),
                )
            }
        return diagnostics.map { diagnostic -> normalize(diagnostic, context, phase) }
    }

    private fun pluginDiagnostic(
        code: String,
        phase: SdkGenPluginPhase,
        message: String,
        remediation: String,
        source: SourcePointer,
        pluginId: String,
        severity: DiagnosticSeverity = DiagnosticSeverity.ERROR,
    ): PluginDiagnostic = PluginDiagnostic(code, severity, phase, message, remediation, source, pluginId)

    private fun invokeValidation(
        plugin: ValidationPlugin,
        input: ValidationPhaseValue,
        context: PluginContext?,
    ): PluginPhaseResult<ValidationPhaseValue> =
        try {
            plugin.validate(input, requireNotNull(context))
        } catch (cancellation: CancellationException) {
            throw cancellation
        } catch (failure: Throwable) {
            PluginPhaseResult.Rejected(
                listOf(failureDiagnostic(plugin, SdkGenPluginPhase.VALIDATION, context, failure)),
            )
        }

    private fun invokeSemantic(
        plugin: SemanticTransformPlugin,
        input: SemanticTransformPhaseValue,
        context: PluginContext?,
    ): PluginPhaseResult<SemanticTransformPhaseValue> =
        try {
            plugin.transformSemantic(input, requireNotNull(context))
        } catch (cancellation: CancellationException) {
            throw cancellation
        } catch (failure: Throwable) {
            PluginPhaseResult.Rejected(
                listOf(failureDiagnostic(plugin, SdkGenPluginPhase.SEMANTIC_TRANSFORM, context, failure)),
            )
        }

    private fun invokeNaming(
        plugin: NamingTypeMappingPlugin,
        input: NamingTypeMappingPhaseValue,
        context: PluginContext?,
    ): PluginPhaseResult<NamingTypeMappingPhaseValue> =
        try {
            plugin.mapNamesAndTypes(input, requireNotNull(context))
        } catch (cancellation: CancellationException) {
            throw cancellation
        } catch (failure: Throwable) {
            PluginPhaseResult.Rejected(
                listOf(failureDiagnostic(plugin, SdkGenPluginPhase.NAMING_TYPE_MAPPING, context, failure)),
            )
        }

    private fun invokeDeclarations(
        plugin: DeclarationAugmentationPlugin,
        input: DeclarationAugmentationPhaseValue,
        context: PluginContext?,
    ): PluginPhaseResult<DeclarationAugmentationPhaseValue> =
        try {
            plugin.augmentDeclarations(input, requireNotNull(context))
        } catch (cancellation: CancellationException) {
            throw cancellation
        } catch (failure: Throwable) {
            PluginPhaseResult.Rejected(
                listOf(failureDiagnostic(plugin, SdkGenPluginPhase.DECLARATION_AUGMENTATION, context, failure)),
            )
        }

    private fun invokeOutput(
        plugin: OutputVerificationPlugin,
        input: OutputVerificationPhaseValue,
        context: PluginContext?,
    ): PluginPhaseResult<OutputVerificationPhaseValue> =
        try {
            plugin.verifyOutput(input, requireNotNull(context))
        } catch (cancellation: CancellationException) {
            throw cancellation
        } catch (failure: Throwable) {
            PluginPhaseResult.Rejected(
                listOf(failureDiagnostic(plugin, SdkGenPluginPhase.OUTPUT_VERIFICATION, context, failure)),
            )
        }

    private fun hasBlockingDiagnosticSince(
        diagnostics: List<PluginDiagnostic>,
        startIndex: Int,
    ): Boolean =
        diagnostics
            .subList(startIndex, diagnostics.size)
            .any { diagnostic -> diagnostic.severity == DiagnosticSeverity.ERROR }

    private fun failureDiagnostic(
        plugin: SdkGenPlugin,
        phase: SdkGenPluginPhase,
        context: PluginContext?,
        failure: Throwable,
    ): PluginDiagnostic =
        pluginDiagnostic(
            code = "SDKGEN-PLUGIN-FAILED",
            phase = phase,
            message =
                "Plugin '${plugin.descriptor.id}' failed in ${phase.name.lowercase(Locale.ROOT)}: " +
                    (failure.message ?: failure::class.qualifiedName.orEmpty()),
            remediation = "Fix the plugin failure; generation will not silently omit its phase.",
            source = requireNotNull(context).source,
            pluginId = plugin.descriptor.id,
        )

    private data class Invocation(
        val index: Int,
        val config: PluginConfig,
        val plugin: SdkGenPlugin?,
        val context: PluginContext?,
    )

    private data class ConfigurationValidation(
        val diagnostics: List<PluginDiagnostic>,
        val invalidInvocationIndexes: Set<Int>,
    )

    private data class AppliedNaming(
        val override: NamingOverride,
        val pluginId: String,
    )

    private data class EmittedName(
        val symbolId: String,
        val declaration: DeclarationSnapshot,
        val name: String,
    )

    private companion object {
        val SUPPORTED_NAMING_KEYS = setOf("clientName", "modelPrefix", "operationPrefix")
        val KOTLIN_IDENTIFIER = Regex("^[A-Za-z_][A-Za-z0-9_]*$")
        val KOTLIN_KEYWORDS =
            setOf(
                "as",
                "break",
                "class",
                "continue",
                "do",
                "else",
                "false",
                "for",
                "fun",
                "if",
                "in",
                "interface",
                "is",
                "null",
                "object",
                "package",
                "return",
                "super",
                "this",
                "throw",
                "true",
                "try",
                "typealias",
                "typeof",
                "val",
                "var",
                "when",
                "while",
            )
    }
}

internal fun PluginDiagnostic.toGenerationDiagnostic(): GenerationDiagnostic =
    GenerationDiagnostic(
        code = GenerationDiagnosticCode.SEMANTIC,
        message = if (pluginId.isBlank()) message else "[$pluginId] $message",
        source = source,
        symbolId = "plugin:${pluginId.ifBlank { "unknown" }}:$code:${source.jsonPointer}",
        sourceCode = code,
        severity = severity,
        phase = DiagnosticPhase.NORMALIZATION,
        pluginPhase = phase,
        remediation = remediation,
    )

private fun emittedTopLevelNames(
    declaration: Declaration,
    resolvedName: String,
): List<String> =
    when (declaration) {
        is ModelDeclaration -> {
            listOf(resolvedName) + declaration.auxiliaryModels.map { auxiliary -> auxiliary.resolvedName }
        }

        is OpenEnumDeclaration -> {
            listOf(resolvedName)
        }

        is OneOfDeclaration -> {
            listOf(
                resolvedName,
                "${resolvedName}DecodingException",
                "${resolvedName}NoMatchException",
                "${resolvedName}AmbiguityException",
                "${resolvedName}Inspection",
            )
        }

        is PrimitiveOneOfDeclaration -> {
            listOf(
                resolvedName,
                "${resolvedName}DecodingException",
                "${resolvedName}NoMatchException",
                "${resolvedName}AmbiguityException",
            )
        }

        is AnyOfDeclaration -> {
            val branchEnumName =
                declaration.branchEnumName.takeIf { name -> name != "${declaration.resolvedName}Branch" }
                    ?: "${resolvedName}Branch"
            val inspectionName =
                declaration.inspectionName.takeIf { name -> name != "${declaration.resolvedName}Inspection" }
                    ?: "${resolvedName}Inspection"
            val branchViews =
                if (declaration.branches.all { branch -> branch.shape == AnyOfBranchShape.OBJECT }) {
                    declaration.branches.map { branch -> branch.viewTypeName }
                } else {
                    emptyList()
                }
            listOf(
                resolvedName,
                branchEnumName,
                inspectionName,
                "${resolvedName}DecodingException",
                "${resolvedName}NoMatchException",
            ) + branchViews
        }

        is SupportDeclaration -> {
            when (declaration.kind) {
                SupportKind.FieldPresence -> listOf(resolvedName, "FieldState")
                SupportKind.Serialization -> listOf(resolvedName, "SdkJson")
            }
        }

        is OperationClientDeclaration -> {
            val codecsName =
                if (resolvedName == declaration.resolvedName) {
                    declaration.codecsObjectName
                } else {
                    "${resolvedName.removeSuffix("Client")}Codecs"
                }
            listOf(resolvedName, codecsName)
        }
    }

internal fun declarationSnapshots(
    model: KotlinDeclarationModel,
    source: SourcePointer,
): List<DeclarationSnapshot> =
    model.files
        .flatMap { file -> file.declarations }
        .map { declaration ->
            DeclarationSnapshot(
                symbolId = declaration.symbolId,
                resolvedName = declaration.resolvedName,
                packageName = declaration.packageName,
                fileName = declaration.fileName,
                source = source,
            ).also { snapshot ->
                snapshot.emittedNamesFor = { resolvedName -> emittedTopLevelNames(declaration, resolvedName) }
            }
        }.sortedBy(DeclarationSnapshot::symbolId)

internal fun applyDeclarationAugmentations(
    model: KotlinDeclarationModel,
    augmentations: List<DeclarationAugmentation>,
): KotlinDeclarationModel {
    val bySymbol = augmentations.associateBy(DeclarationAugmentation::symbolId)
    val typeRenames =
        model.files
            .flatMap { file -> file.declarations }
            .mapNotNull { declaration ->
                val requestedName = bySymbol[declaration.symbolId]?.resolvedName
                if (
                    declaration !is SupportDeclaration &&
                    requestedName != null &&
                    requestedName != declaration.resolvedName
                ) {
                    (declaration.packageName to declaration.resolvedName) to requestedName
                } else {
                    null
                }
            }.toMap()

    fun apply(declaration: Declaration): Declaration {
        val augmentation = bySymbol[declaration.symbolId] ?: return declaration
        val requestedName = augmentation.resolvedName?.takeUnless { declaration is SupportDeclaration }
        val name = requestedName ?: declaration.resolvedName
        val fileName = requestedName ?: declaration.fileName
        val kdoc = augmentation.kdoc ?: declaration.kdoc
        return when (declaration) {
            is ModelDeclaration -> {
                declaration.copy(
                    fileName = fileName,
                    resolvedName = name,
                    kdoc = kdoc,
                    dslFunctionName =
                        requestedName?.let(KotlinNameResolver::memberName)
                            ?: declaration.dslFunctionName,
                )
            }

            is OpenEnumDeclaration -> {
                declaration.copy(fileName = fileName, resolvedName = name, kdoc = kdoc)
            }

            is OneOfDeclaration -> {
                declaration.copy(fileName = fileName, resolvedName = name, kdoc = kdoc)
            }

            is PrimitiveOneOfDeclaration -> {
                declaration.copy(fileName = fileName, resolvedName = name, kdoc = kdoc)
            }

            is AnyOfDeclaration -> {
                declaration.copy(
                    fileName = fileName,
                    resolvedName = name,
                    kdoc = kdoc,
                    branchEnumName =
                        declaration.branchEnumName.takeIf { it != "${declaration.resolvedName}Branch" }
                            ?: "${name}Branch",
                    inspectionName =
                        declaration.inspectionName.takeIf { it != "${declaration.resolvedName}Inspection" }
                            ?: "${name}Inspection",
                )
            }

            is SupportDeclaration -> {
                // Validation rejects support renames; keep the direct application helper safe as well.
                declaration.copy(kdoc = kdoc)
            }

            is OperationClientDeclaration -> {
                declaration.copy(
                    fileName = fileName,
                    resolvedName = name,
                    kdoc = kdoc,
                    codecsObjectName =
                        requestedName?.let { "${it.removeSuffix("Client")}Codecs" }
                            ?: declaration.codecsObjectName,
                )
            }
        }
    }
    val renamed =
        model.copy(
            files =
                model.files.map { file: KotlinFileDeclaration ->
                    val declarations = file.declarations.map(::apply)
                    val fileName = declarations.map(Declaration::fileName).distinct().singleOrNull() ?: file.fileName
                    file.copy(fileName = fileName, declarations = declarations)
                },
        )
    return renamed.rewriteTypeReferences(typeRenames)
}
