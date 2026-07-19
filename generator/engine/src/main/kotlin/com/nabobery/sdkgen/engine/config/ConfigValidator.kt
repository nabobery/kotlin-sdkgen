package com.nabobery.sdkgen.engine.config

import com.nabobery.sdkgen.engine.spi.PluginSpiRange

internal object ConfigValidator {
    fun validate(
        config: SdkgenConfigV1Alpha1,
        file: String,
    ) {
        requireNonEmpty(config.source.uri, "$.source.uri", "source URI", file)
        config.source.sha256?.let { requireSha256(it, "$.source.sha256", file) }
        validateAcquisition(config.source.acquisition, file)
        validateOverlays(config.overlays, file)
        validateCompatibilityProfiles(config.compatibilityProfiles, file)
        validateKotlin(config.kotlin, file)
        validateRuntime(config.runtime, file)
        validateRules(config.rules, file)
        validatePlugins(config.plugins, file)
        validateOutput(config.output, file)
        validateDiagnostics(config.diagnostics, file)
        requireUnique(config.verification.gates, "$.verification.gates", "verification gate", file)
    }

    private fun validateAcquisition(
        acquisition: AcquisitionPolicy,
        file: String,
    ) {
        requireConstraint(
            acquisition.maxRedirects >= 0,
            "$.source.acquisition.maxRedirects",
            "maxRedirects must be zero or greater.",
            file,
        )
        requireConstraint(
            acquisition.maxBytes > 0,
            "$.source.acquisition.maxBytes",
            "maxBytes must be greater than zero.",
            file,
        )
        requireConstraint(
            acquisition.timeoutSeconds > 0,
            "$.source.acquisition.timeoutSeconds",
            "timeoutSeconds must be greater than zero.",
            file,
        )
        requireNonEmpty(
            acquisition.cacheDirectory,
            "$.source.acquisition.cacheDirectory",
            "cache directory",
            file,
        )
        requireNonEmptyItems(acquisition.allowedHosts, "$.source.acquisition.allowedHosts", "allowed host", file)
        requireUnique(acquisition.allowedHosts, "$.source.acquisition.allowedHosts", "allowed host", file)
        requireNonEmptyItems(
            acquisition.allowedLocalRoots,
            "$.source.acquisition.allowedLocalRoots",
            "allowed local root",
            file,
        )
        requireUnique(
            acquisition.allowedLocalRoots,
            "$.source.acquisition.allowedLocalRoots",
            "allowed local root",
            file,
        )
    }

    private fun validateOverlays(
        overlays: List<OverlayConfig>,
        file: String,
    ) {
        overlays.forEachIndexed { index, overlay ->
            requireNonEmpty(overlay.id, "$.overlays[$index].id", "overlay ID", file)
            requireNonEmpty(overlay.uri, "$.overlays[$index].uri", "overlay URI", file)
            overlay.sha256?.let { requireSha256(it, "$.overlays[$index].sha256", file) }
        }
        requireUniqueBy(overlays, "$.overlays", "overlay ID", file, OverlayConfig::id)
    }

    private fun validateCompatibilityProfiles(
        profiles: List<CompatibilityProfileConfig>,
        file: String,
    ) {
        profiles.forEachIndexed { index, profile ->
            requireNonEmpty(profile.id, "$.compatibilityProfiles[$index].id", "compatibility profile ID", file)
            requireNonEmpty(
                profile.version,
                "$.compatibilityProfiles[$index].version",
                "compatibility profile version",
                file,
            )
        }
        requireUniqueBy(
            profiles,
            "$.compatibilityProfiles",
            "compatibility profile ID",
            file,
            CompatibilityProfileConfig::id,
        )
    }

    private fun validateKotlin(
        kotlin: KotlinGenerationConfig,
        file: String,
    ) {
        requireConstraint(
            PACKAGE_NAME.matches(kotlin.packageName),
            "$.kotlin.packageName",
            "packageName must contain at least two valid Kotlin identifier segments.",
            file,
        )
        requireNonEmpty(kotlin.coordinates.groupId, "$.kotlin.coordinates.groupId", "group ID", file)
        requireNonEmpty(kotlin.coordinates.artifactId, "$.kotlin.coordinates.artifactId", "artifact ID", file)
        requireConstraint(
            IDENTIFIER.matches(kotlin.naming.clientName),
            "$.kotlin.naming.clientName",
            "clientName must be a valid Kotlin identifier.",
            file,
        )
        kotlin.naming.modelPrefix?.let { prefix ->
            requireConstraint(
                IDENTIFIER.matches(prefix),
                "$.kotlin.naming.modelPrefix",
                "modelPrefix must be a valid Kotlin identifier.",
                file,
            )
        }
        kotlin.naming.operationPrefix?.let { prefix ->
            requireConstraint(
                IDENTIFIER.matches(prefix),
                "$.kotlin.naming.operationPrefix",
                "operationPrefix must be a valid Kotlin identifier.",
                file,
            )
        }
        requireConstraint(
            kotlin.targets.isNotEmpty(),
            "$.kotlin.targets",
            "At least one Kotlin target is required.",
            file,
        )
        requireUnique(kotlin.targets, "$.kotlin.targets", "Kotlin target", file)
    }

    private fun validateRuntime(
        runtime: RuntimeDefaults,
        file: String,
    ) {
        requireConstraint(
            runtime.requestTimeoutMillis > 0,
            "$.runtime.requestTimeoutMillis",
            "requestTimeoutMillis must be greater than zero.",
            file,
        )
        requireConstraint(
            runtime.retries.maxAttempts > 0,
            "$.runtime.retries.maxAttempts",
            "maxAttempts must be greater than zero.",
            file,
        )
        requireConstraint(
            runtime.retries.initialDelayMillis >= 0,
            "$.runtime.retries.initialDelayMillis",
            "initialDelayMillis must be zero or greater.",
            file,
        )
        requireConstraint(
            runtime.retries.maxDelayMillis >= 0,
            "$.runtime.retries.maxDelayMillis",
            "maxDelayMillis must be zero or greater.",
            file,
        )
        requireConstraint(
            runtime.retries.jitterRatio in 0.0..1.0,
            "$.runtime.retries.jitterRatio",
            "jitterRatio must be between zero and one inclusive.",
            file,
        )
    }

    private fun validateRules(
        rules: List<RuleConfig>,
        file: String,
    ) {
        rules.forEachIndexed { index, rule ->
            requireNonEmpty(rule.id, "$.rules[$index].id", "rule ID", file)
        }
        requireUniqueBy(rules, "$.rules", "rule ID", file, RuleConfig::id)
    }

    private fun validatePlugins(
        plugins: List<PluginConfig>,
        file: String,
    ) {
        plugins.forEachIndexed { index, plugin ->
            requireNonEmpty(plugin.id, "$.plugins[$index].id", "plugin ID", file)
            requireNonEmpty(plugin.version, "$.plugins[$index].version", "plugin version", file)
            requireNonEmpty(plugin.spiRange, "$.plugins[$index].spiRange", "plugin SPI range", file)
            when (PluginSpiRange.validate(plugin.spiRange)) {
                PluginSpiRange.Validation.INVALID_SYNTAX -> {
                    requireConstraint(
                        condition = false,
                        path = "$.plugins[$index].spiRange",
                        message =
                            "spiRange must use the canonical syntax '>=0.1 <0.2' with numeric major and minor " +
                                "versions.",
                        file = file,
                    )
                }

                PluginSpiRange.Validation.INCOMPATIBLE -> {
                    requireConstraint(
                        condition = false,
                        path = "$.plugins[$index].spiRange",
                        message =
                            "spiRange must include the current engine SPI version " +
                                "${PluginSpiRange.CURRENT_ENGINE_SPI_VERSION}.",
                        file = file,
                    )
                }

                PluginSpiRange.Validation.VALID -> {
                    Unit
                }
            }
        }
        requireUniqueBy(plugins, "$.plugins", "plugin ID", file, PluginConfig::id)
    }

    private fun validateOutput(
        output: OutputConfig,
        file: String,
    ) {
        requireNonEmpty(output.sources, "$.output.sources", "source output path", file)
        requireNonEmpty(output.resources, "$.output.resources", "resource output path", file)
        requireNonEmpty(output.manifest, "$.output.manifest", "manifest output path", file)
        requireNonEmpty(output.lock, "$.output.lock", "lock output path", file)
    }

    private fun validateDiagnostics(
        diagnostics: DiagnosticsConfig,
        file: String,
    ) {
        diagnostics.warningAllowlist.forEachIndexed { index, code ->
            requireConstraint(
                DIAGNOSTIC_CODE.matches(code),
                "$.diagnostics.warningAllowlist[$index]",
                "Diagnostic allowlist entries must use the SDKGEN-... code format.",
                file,
            )
        }
        requireUnique(
            diagnostics.warningAllowlist,
            "$.diagnostics.warningAllowlist",
            "diagnostic code",
            file,
        )
    }

    private fun requireSha256(
        value: String,
        path: String,
        file: String,
    ) {
        requireConstraint(
            SHA_256.matches(value),
            path,
            "SHA-256 values must contain exactly 64 lowercase hexadecimal characters.",
            file,
        )
    }

    private fun requireNonEmptyItems(
        values: List<String>,
        path: String,
        label: String,
        file: String,
    ) {
        values.forEachIndexed { index, value -> requireNonEmpty(value, "$path[$index]", label, file) }
    }

    private fun requireNonEmpty(
        value: String,
        path: String,
        label: String,
        file: String,
    ) {
        requireConstraint(value.isNotEmpty(), path, "The $label must not be empty.", file)
    }

    private fun <T> requireUnique(
        values: List<T>,
        path: String,
        label: String,
        file: String,
    ) {
        val seen = mutableSetOf<T>()
        values.forEachIndexed { index, value ->
            requireConstraint(seen.add(value), "$path[$index]", "Duplicate $label '$value'.", file)
        }
    }

    private fun <T> requireUniqueBy(
        values: List<T>,
        path: String,
        label: String,
        file: String,
        key: (T) -> String,
    ) {
        val seen = mutableSetOf<String>()
        values.forEachIndexed { index, value ->
            val identity = key(value)
            requireConstraint(seen.add(identity), "$path[$index].id", "Duplicate $label '$identity'.", file)
        }
    }

    private fun requireConstraint(
        condition: Boolean,
        path: String,
        message: String,
        file: String,
    ) {
        if (condition) return
        throw ConfigValidationException(
            Diagnostic(
                code = "SDKGEN-CONFIG-CONSTRAINT",
                severity = DiagnosticSeverity.ERROR,
                path = DiagnosticPath(file, path),
                phase = DiagnosticPhase.CONFIGURATION,
                message = message,
                remediation = "Correct the value at '$path' using the published v1alpha1 schema.",
            ),
        )
    }

    private val SHA_256 = Regex("^[0-9a-f]{64}$")
    private val IDENTIFIER = Regex("^[A-Za-z_][A-Za-z0-9_]*$")
    private val PACKAGE_NAME = Regex("^[A-Za-z_][A-Za-z0-9_]*(\\.[A-Za-z_][A-Za-z0-9_]*)+$")
    private val DIAGNOSTIC_CODE = Regex("^SDKGEN-[A-Z0-9-]+$")
}
