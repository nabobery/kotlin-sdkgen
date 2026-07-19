@file:OptIn(com.nabobery.sdkgen.engine.spi.ExperimentalSdkGenApi::class)

package com.nabobery.sdkgen.engine

import com.nabobery.sdkgen.engine.config.ConfigDigest
import com.nabobery.sdkgen.engine.config.ConfigVersion
import com.nabobery.sdkgen.engine.config.KotlinGenerationConfig
import com.nabobery.sdkgen.engine.config.LockCodec
import com.nabobery.sdkgen.engine.config.LockVersion
import com.nabobery.sdkgen.engine.config.LockedGenerator
import com.nabobery.sdkgen.engine.config.LockedPlugin
import com.nabobery.sdkgen.engine.config.LockedSource
import com.nabobery.sdkgen.engine.config.NamingConfig
import com.nabobery.sdkgen.engine.config.OutputConfig
import com.nabobery.sdkgen.engine.config.PackageCoordinates
import com.nabobery.sdkgen.engine.config.PluginConfig
import com.nabobery.sdkgen.engine.config.SdkgenConfigV1Alpha1
import com.nabobery.sdkgen.engine.config.SdkgenLockV1Alpha1
import com.nabobery.sdkgen.engine.config.SourceConfig
import com.nabobery.sdkgen.engine.config.TargetFamily
import com.nabobery.sdkgen.engine.declarations.KotlinDeclarationModel
import com.nabobery.sdkgen.engine.declarations.KotlinFileDeclaration
import com.nabobery.sdkgen.engine.declarations.ModelDeclaration
import com.nabobery.sdkgen.engine.declarations.OneOfDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationClientDeclaration
import com.nabobery.sdkgen.engine.spi.BuiltInSdkGenPlugins
import com.nabobery.sdkgen.engine.spi.DeclarationAugmentation
import com.nabobery.sdkgen.engine.spi.DeclarationAugmentationPhaseValue
import com.nabobery.sdkgen.engine.spi.DeclarationAugmentationPlugin
import com.nabobery.sdkgen.engine.spi.DeclarationSnapshot
import com.nabobery.sdkgen.engine.spi.GeneratedFileSnapshot
import com.nabobery.sdkgen.engine.spi.NamingOverride
import com.nabobery.sdkgen.engine.spi.NamingTypeMappingPhaseValue
import com.nabobery.sdkgen.engine.spi.NamingTypeMappingPlugin
import com.nabobery.sdkgen.engine.spi.OutputVerificationPhaseValue
import com.nabobery.sdkgen.engine.spi.OutputVerificationPlugin
import com.nabobery.sdkgen.engine.spi.PluginContext
import com.nabobery.sdkgen.engine.spi.PluginDescriptor
import com.nabobery.sdkgen.engine.spi.PluginDiagnostic
import com.nabobery.sdkgen.engine.spi.PluginPhaseResult
import com.nabobery.sdkgen.engine.spi.PluginPipelineInput
import com.nabobery.sdkgen.engine.spi.SdkGenPlugin
import com.nabobery.sdkgen.engine.spi.SdkGenPluginEngine
import com.nabobery.sdkgen.engine.spi.SdkGenPluginPhase
import com.nabobery.sdkgen.engine.spi.SdkGenPluginRegistry
import com.nabobery.sdkgen.engine.spi.SemanticTransformPhaseValue
import com.nabobery.sdkgen.engine.spi.SemanticTransformPlugin
import com.nabobery.sdkgen.engine.spi.ValidationPhaseValue
import com.nabobery.sdkgen.engine.spi.ValidationPlugin
import com.nabobery.sdkgen.engine.spi.declarationSnapshots
import com.nabobery.sdkgen.model.DiagnosticSeverity
import com.nabobery.sdkgen.model.JsonValue
import com.nabobery.sdkgen.model.SemanticDocument
import com.nabobery.sdkgen.model.SourceLocation
import com.nabobery.sdkgen.model.SourcePointer
import java.nio.file.Files
import java.nio.file.Path
import java.security.MessageDigest
import kotlin.coroutines.cancellation.CancellationException
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertSame
import kotlin.test.assertTrue

class PluginSpiTest {
    @Test
    fun `configured plugin order is explicit across all five phases`() {
        val calls = mutableListOf<String>()
        val plugin = RecordingPlugin(calls)
        val config = config(listOf(PluginConfig(plugin.descriptor.id, "0.1.0", ">=0.1 <0.2")))
        val document = document()
        val result =
            SdkGenPluginEngine(
                com.nabobery.sdkgen.engine.spi
                    .SdkGenPluginRegistry(listOf(plugin)),
            ).run(
                config,
                PluginPipelineInput(
                    source = sourcePointer(),
                    document = document,
                    naming = NamingTypeMappingPhaseValue("Api"),
                    declarations = DeclarationAugmentationPhaseValue(emptyList()),
                    output =
                        OutputVerificationPhaseValue(
                            listOf(GeneratedFileSnapshot("Api.kt", "a".repeat(64), 1)),
                        ),
                ),
            )

        assertEquals(
            listOf("validation", "semantic", "naming", "declarations", "output"),
            calls,
        )
        assertEquals(listOf(plugin.descriptor.id), result.executionOrder)
        assertEquals("Transformed", result.document.title)
        assertEquals("Preview", document.title)
    }

    @Test
    fun `phase collections are defensively copied`() {
        val overrides = mutableListOf<NamingOverride>()
        val value = NamingTypeMappingPhaseValue("Api", overrides = overrides)
        overrides += NamingOverride("clientName", "Other", sourcePointer())

        assertTrue(value.overrides.isEmpty())
        assertFailsWith<UnsupportedOperationException> {
            (value.overrides as MutableList<*>).clear()
        }

        val files = mutableListOf(GeneratedFileSnapshot("Api.kt", "a".repeat(64), 1))
        val output = OutputVerificationPhaseValue(files)
        files += GeneratedFileSnapshot("Other.kt", "b".repeat(64), 1)

        assertEquals(1, output.files.size)
    }

    @Test
    fun `plugin descriptors require canonical phase order`() {
        assertFailsWith<IllegalArgumentException> {
            PluginDescriptor(
                id = "unordered",
                version = "0.1.0",
                spiRange = ">=0.1 <0.2",
                phases =
                    listOf(
                        SdkGenPluginPhase.OUTPUT_VERIFICATION,
                        SdkGenPluginPhase.VALIDATION,
                    ),
            )
        }
    }

    @Test
    fun `phase metadata mismatch is reported without executing the implementation`() {
        val calls = mutableListOf<String>()
        val plugin =
            object : NamingTypeMappingPlugin {
                override val descriptor = PluginDescriptor("bad-phases", "0.1.0", ">=0.1 <0.2")

                override fun mapNamesAndTypes(
                    input: NamingTypeMappingPhaseValue,
                    context: PluginContext,
                ): PluginPhaseResult<NamingTypeMappingPhaseValue> {
                    calls += "naming"
                    return PluginPhaseResult.Applied(input)
                }
            }
        val result =
            SdkGenPluginEngine(
                com.nabobery.sdkgen.engine.spi
                    .SdkGenPluginRegistry(listOf(plugin)),
            ).run(
                config(listOf(PluginConfig("bad-phases", "0.1.0", ">=0.1 <0.2"))),
                PluginPipelineInput(sourcePointer(), document(), NamingTypeMappingPhaseValue("Api")),
                from = SdkGenPluginPhase.NAMING_TYPE_MAPPING,
            )

        assertTrue(calls.isEmpty())
        assertEquals("SDKGEN-PLUGIN-PHASE-MISMATCH", result.diagnostics.single().code)
        assertTrue(result.executionOrder.isEmpty())
    }

    @Test
    fun `version and SPI metadata mismatches never execute the plugin`() {
        val calls = mutableListOf<String>()
        val plugin = ConflictNamingPlugin("metadata", "Ignored", calls)
        val result =
            SdkGenPluginEngine(
                com.nabobery.sdkgen.engine.spi
                    .SdkGenPluginRegistry(listOf(plugin)),
            ).run(
                config(listOf(PluginConfig("metadata", "0.2.0", ">=0.2 <0.3"))),
                PluginPipelineInput(sourcePointer(), document(), NamingTypeMappingPhaseValue("Api")),
                from = SdkGenPluginPhase.NAMING_TYPE_MAPPING,
            )

        assertTrue(calls.isEmpty())
        assertTrue(result.diagnostics.any { it.code == "SDKGEN-PLUGIN-VERSION-MISMATCH" })
        assertTrue(result.diagnostics.any { it.code == "SDKGEN-PLUGIN-SPI-RANGE-MISMATCH" })
        assertTrue(result.executionOrder.isEmpty())
    }

    @Test
    fun `nested semantic snapshots cannot be mutated through plugin casts`() {
        val values = mutableListOf<JsonValue>(JsonValue.StringValue("before"))
        val extensions = linkedMapOf<String, JsonValue>("values" to JsonValue.ArrayValue(values))
        val original = document().copy(extensions = extensions)
        val input = PluginPipelineInput(sourcePointer(), original, NamingTypeMappingPhaseValue("Api"))
        extensions["after"] = JsonValue.StringValue("outside")

        assertFalse(input.document.extensions.containsKey("after"))
        val result =
            SdkGenPluginEngine(
                com.nabobery.sdkgen.engine.spi
                    .SdkGenPluginRegistry(listOf(MutatingSemanticPlugin)),
            ).run(
                config(listOf(PluginConfig("mutating", "0.1.0", ">=0.1 <0.2"))),
                input,
                from = SdkGenPluginPhase.SEMANTIC_TRANSFORM,
            )

        assertTrue(result.diagnostics.any { it.code == "SDKGEN-PLUGIN-FAILED" })
        assertEquals(1, (input.document.extensions.getValue("values") as JsonValue.ArrayValue).values.size)
        assertFailsWith<UnsupportedOperationException> {
            (result.document.extensions as MutableMap<*, *>).clear()
        }
    }

    @Test
    fun `augmentation identifiers and name collisions are rejected before application`() {
        val result =
            SdkGenPluginEngine(
                com.nabobery.sdkgen.engine.spi
                    .SdkGenPluginRegistry(listOf(CollidingAugmentationPlugin)),
            ).run(
                config(listOf(PluginConfig("colliding", "0.1.0", ">=0.1 <0.2"))),
                PluginPipelineInput(
                    sourcePointer(),
                    document(),
                    NamingTypeMappingPhaseValue("Api"),
                    declarations =
                        DeclarationAugmentationPhaseValue(
                            declarations =
                                listOf(
                                    DeclarationSnapshot("schema:a", "Alpha", "com.example", "Alpha", sourcePointer()),
                                    DeclarationSnapshot("schema:b", "Beta", "com.example", "Beta", sourcePointer()),
                                ),
                        ),
                ),
                from = SdkGenPluginPhase.DECLARATION_AUGMENTATION,
            )

        assertTrue(result.diagnostics.any { it.code == "SDKGEN-PLUGIN-NAME-COLLISION" })
        assertTrue(result.diagnostics.any { it.code == "SDKGEN-PLUGIN-AUGMENTATION-IDENTIFIER-INVALID" })
        assertTrue(
            result.declarations
                ?.augmentations
                .orEmpty()
                .isEmpty(),
        )
    }

    @Test
    fun `renamed declarations update their generated file identity`() {
        val model =
            KotlinDeclarationModel(
                listOf(
                    KotlinFileDeclaration(
                        packageName = "com.example",
                        fileName = "Payload",
                        declarations =
                            listOf(
                                ModelDeclaration(
                                    symbolId = "schema:payload",
                                    order = 0,
                                    packageName = "com.example",
                                    fileName = "Payload",
                                    resolvedName = "Payload",
                                    kdoc = "model",
                                    fields = emptyList(),
                                    dslFunctionName = "payload",
                                ),
                            ),
                    ),
                ),
            )

        val renamed =
            com.nabobery.sdkgen.engine.spi.applyDeclarationAugmentations(
                model,
                listOf(
                    DeclarationAugmentation(
                        symbolId = "schema:payload",
                        resolvedName = "Renamed",
                        source = sourcePointer(),
                    ),
                ),
            )
        val declaration =
            renamed.files
                .single()
                .declarations
                .single()

        assertEquals("Renamed", declaration.resolvedName)
        assertEquals("Renamed", declaration.fileName)
        assertEquals("com/example/Renamed.kt", renamed.files.single().path)
    }

    @Test
    fun `support declaration renames are rejected before application`() {
        val support =
            DeclarationSnapshot(
                symbolId = "support:field-presence",
                resolvedName = "FieldPresence",
                packageName = "com.example",
                fileName = "FieldPresence",
                source = sourcePointer(),
            )
        val result =
            SdkGenPluginEngine(SdkGenPluginRegistry(emptyList())).run(
                config(emptyList()),
                PluginPipelineInput(
                    source = sourcePointer(),
                    document = document(),
                    naming = NamingTypeMappingPhaseValue("Api"),
                    declarations =
                        DeclarationAugmentationPhaseValue(
                            declarations = listOf(support),
                            augmentations =
                                listOf(
                                    DeclarationAugmentation(
                                        symbolId = support.symbolId,
                                        resolvedName = "RenamedPresence",
                                        source = sourcePointer(),
                                    ),
                                ),
                        ),
                ),
                from = SdkGenPluginPhase.DECLARATION_AUGMENTATION,
            )

        val diagnostic = result.diagnostics.single()
        assertEquals("SDKGEN-PLUGIN-SUPPORT-RENAME-UNSUPPORTED", diagnostic.code)
        assertEquals(DiagnosticSeverity.ERROR, diagnostic.severity)
        assertTrue(
            result.declarations
                ?.augmentations
                .orEmpty()
                .isEmpty(),
        )
    }

    @Test
    fun `conflicting naming overrides retain first value and link the later source`() {
        val first = ConflictNamingPlugin("first", "FirstApi")
        val second = ConflictNamingPlugin("second", "SecondApi")
        val config =
            config(
                listOf(
                    PluginConfig("first", "0.1.0", ">=0.1 <0.2"),
                    PluginConfig("second", "0.1.0", ">=0.1 <0.2"),
                ),
            )
        val result =
            SdkGenPluginEngine(
                com.nabobery.sdkgen.engine.spi
                    .SdkGenPluginRegistry(listOf(first, second)),
            ).run(
                config,
                PluginPipelineInput(sourcePointer(), document(), NamingTypeMappingPhaseValue("Api")),
                from = SdkGenPluginPhase.NAMING_TYPE_MAPPING,
            )

        assertEquals("FirstApi", result.naming.clientName)
        val conflict = result.diagnostics.single { it.code == "SDKGEN-PLUGIN-CONFLICT" }
        assertEquals("/plugins/1", conflict.source.jsonPointer)
        assertEquals("second", conflict.pluginId)
    }

    @Test
    fun `invalid naming override is rejected instead of being sanitized into output`() {
        val result =
            SdkGenPluginEngine(
                com.nabobery.sdkgen.engine.spi
                    .SdkGenPluginRegistry(listOf(ConflictNamingPlugin("invalid", "not valid"))),
            ).run(
                config(listOf(PluginConfig("invalid", "0.1.0", ">=0.1 <0.2"))),
                PluginPipelineInput(sourcePointer(), document(), NamingTypeMappingPhaseValue("Api")),
                from = SdkGenPluginPhase.NAMING_TYPE_MAPPING,
            )

        assertEquals("Api", result.naming.clientName)
        assertTrue(result.diagnostics.any { it.code == "SDKGEN-PLUGIN-INVALID-RESULT" })
    }

    @Test
    fun `unknown plugin is a blocking source-linked diagnostic rather than an omission`() {
        val config = config(listOf(PluginConfig("missing", "0.1.0", ">=0.1 <0.2")))
        val result =
            SdkGenPluginEngine(
                com.nabobery.sdkgen.engine.spi
                    .SdkGenPluginRegistry(emptyList()),
            ).run(
                config,
                PluginPipelineInput(sourcePointer(), document(), NamingTypeMappingPhaseValue("Api")),
            )

        val diagnostic = result.diagnostics.single { it.code == "SDKGEN-PLUGIN-NOT-FOUND" }
        assertEquals(DiagnosticSeverity.ERROR, diagnostic.severity)
        assertEquals("/plugins/0", diagnostic.source.jsonPointer)
        assertTrue(diagnostic.message.contains("StandardProjection"))
        assertTrue(result.records.isEmpty())
    }

    @Test
    fun `plugin config digest and lock encoding remain deterministic`() {
        val firstConfig = linkedMapOf("alpha" to "1", "beta" to "2")
        val secondConfig = linkedMapOf("beta" to "2", "alpha" to "1")
        val firstDigest = ConfigDigest.sha256(firstConfig)
        val secondDigest = ConfigDigest.sha256(secondConfig)
        val plugin = LockedPlugin("plugin", "0.1.0", ">=0.1 <0.2", firstDigest)
        val lock =
            SdkgenLockV1Alpha1(
                version = LockVersion.V1_ALPHA_1,
                configDigest = "c".repeat(64),
                source = LockedSource("sdkgen://source", "a".repeat(64), 1),
                overlays = emptyList(),
                generator = LockedGenerator("0.1.0", "community"),
                plugins = listOf(plugin),
            )

        assertEquals(firstDigest, secondDigest)
        assertEquals(LockCodec.encode(lock), LockCodec.encode(lock.copy(plugins = listOf(plugin))))
    }

    @Test
    fun `plugin rejected in an early phase is skipped in later phases`() {
        val calls = mutableListOf<String>()
        val result =
            SdkGenPluginEngine(
                com.nabobery.sdkgen.engine.spi
                    .SdkGenPluginRegistry(listOf(EarlyRejectedPlugin(calls))),
            ).run(
                config(listOf(PluginConfig("early-rejected", "0.1.0", ">=0.1 <0.2"))),
                PluginPipelineInput(sourcePointer(), document(), NamingTypeMappingPhaseValue("Api")),
            )

        assertEquals(listOf("validation"), calls)
        assertTrue(result.diagnostics.any { it.code == "SDKGEN-PLUGIN-REJECTED" })
    }

    @Test
    fun `plugin failures become diagnostics and cancellation preserves identity`() {
        val failure = FailurePlugin()
        val failureResult =
            SdkGenPluginEngine(
                com.nabobery.sdkgen.engine.spi
                    .SdkGenPluginRegistry(listOf(failure)),
            ).run(
                config(listOf(PluginConfig("failure", "0.1.0", ">=0.1 <0.2"))),
                PluginPipelineInput(sourcePointer(), document(), NamingTypeMappingPhaseValue("Api")),
                from = SdkGenPluginPhase.NAMING_TYPE_MAPPING,
            )
        assertTrue(failureResult.diagnostics.any { it.code == "SDKGEN-PLUGIN-FAILED" })

        val cancellation = CancellationException("cancelled")
        val thrown =
            assertFailsWith<CancellationException> {
                SdkGenPluginEngine(
                    com.nabobery.sdkgen.engine.spi
                        .SdkGenPluginRegistry(listOf(CancellationPlugin(cancellation))),
                ).run(
                    config(listOf(PluginConfig("cancel", "0.1.0", ">=0.1 <0.2"))),
                    PluginPipelineInput(sourcePointer(), document(), NamingTypeMappingPhaseValue("Api")),
                    from = SdkGenPluginPhase.NAMING_TYPE_MAPPING,
                )
            }
        assertSame(cancellation, thrown)
    }

    @Test
    fun `rejected plugin remains skipped across GenerationPipeline phase runs`() {
        val calls = mutableListOf<String>()
        val plugin = EarlyRejectedPlugin(calls)
        val sourcePath = Path.of(requireNotNull(System.getProperty("engine.basicOpenApiFile")))
        val bytes = sourcePath.toFile().readBytes()
        val source =
            ResolvedSource(
                path = sourcePath,
                canonicalUri = "sdkgen://fixtures/basic-openapi.yaml",
                sha256 = bytes.sha256(),
                contentLength = bytes.size.toLong(),
            )
        val config =
            config(listOf(PluginConfig(plugin.descriptor.id, "0.1.0", ">=0.1 <0.2")))
                .copy(source = SourceConfig(source.canonicalUri, source.sha256))

        val validation =
            GenerationPipeline(
                generatorVersion = "0.1.0-test",
                pluginRegistry = SdkGenPluginRegistry(listOf(plugin)),
            ).validate(config, source, emptyList())

        assertEquals(listOf("validation"), calls)
        assertTrue(validation.diagnostics.any { it.code == "SDKGEN-PLUGIN-REJECTED" })
    }

    @Test
    fun `failed plugin remains skipped across GenerationPipeline phase runs`() {
        val calls = mutableListOf<String>()
        val plugin = EarlyFailurePlugin(calls)
        val sourcePath = Path.of(requireNotNull(System.getProperty("engine.basicOpenApiFile")))
        val bytes = sourcePath.toFile().readBytes()
        val source =
            ResolvedSource(
                path = sourcePath,
                canonicalUri = "sdkgen://fixtures/basic-openapi.yaml",
                sha256 = bytes.sha256(),
                contentLength = bytes.size.toLong(),
            )
        val config =
            config(listOf(PluginConfig(plugin.descriptor.id, "0.1.0", ">=0.1 <0.2")))
                .copy(source = SourceConfig(source.canonicalUri, source.sha256))

        val validation =
            GenerationPipeline(
                generatorVersion = "0.1.0-test",
                pluginRegistry = SdkGenPluginRegistry(listOf(plugin)),
            ).validate(config, source, emptyList())

        assertEquals(listOf("validation"), calls)
        assertTrue(validation.diagnostics.any { it.code == "SDKGEN-PLUGIN-FAILED" })
    }

    @Test
    fun `malformed and incompatible SPI ranges are rejected before plugin execution`() {
        val calls = mutableListOf<String>()
        val plugin = ConflictNamingPlugin("spi-range", "Ignored", calls)
        val engine = SdkGenPluginEngine(SdkGenPluginRegistry(listOf(plugin)))

        val malformed =
            engine.run(
                config(listOf(PluginConfig("spi-range", "0.1.0", ">=0.1 <0.2 trailing"))),
                PluginPipelineInput(sourcePointer(), document(), NamingTypeMappingPhaseValue("Api")),
                from = SdkGenPluginPhase.NAMING_TYPE_MAPPING,
            )
        val incompatible =
            engine.run(
                config(listOf(PluginConfig("spi-range", "0.1.0", ">=0.2 <0.3"))),
                PluginPipelineInput(sourcePointer(), document(), NamingTypeMappingPhaseValue("Api")),
                from = SdkGenPluginPhase.NAMING_TYPE_MAPPING,
            )
        val incompatibleDescriptor =
            ConflictNamingPlugin(
                "descriptor-range",
                "Ignored",
                descriptorSpiRange = ">=0.2 <0.3",
            )
        val descriptorResult =
            SdkGenPluginEngine(SdkGenPluginRegistry(listOf(incompatibleDescriptor))).run(
                config(listOf(PluginConfig("descriptor-range", "0.1.0", ">=0.1 <0.2"))),
                PluginPipelineInput(sourcePointer(), document(), NamingTypeMappingPhaseValue("Api")),
                from = SdkGenPluginPhase.NAMING_TYPE_MAPPING,
            )

        assertTrue(malformed.diagnostics.any { it.code == "SDKGEN-PLUGIN-SPI-RANGE-INVALID" })
        assertTrue(incompatible.diagnostics.any { it.code == "SDKGEN-PLUGIN-SPI-RANGE-INCOMPATIBLE" })
        assertTrue(descriptorResult.diagnostics.any { it.code == "SDKGEN-PLUGIN-SPI-RANGE-INCOMPATIBLE" })
        assertTrue(calls.isEmpty())
    }

    @Test
    fun `declaration collisions reserve union exceptions and client codec objects`() {
        val snapshots = declarationSnapshots(collisionDeclarationModel(), sourcePointer())
        listOf("PayloadDecodingException", "ApiCodecs").forEach { requestedName ->
            val plugin = RenameDeclarationPlugin(requestedName)
            val result =
                SdkGenPluginEngine(SdkGenPluginRegistry(listOf(plugin))).run(
                    config(listOf(PluginConfig(plugin.descriptor.id, "0.1.0", ">=0.1 <0.2"))),
                    PluginPipelineInput(
                        source = sourcePointer(),
                        document = document(),
                        naming = NamingTypeMappingPhaseValue("Api"),
                        declarations =
                            DeclarationAugmentationPhaseValue(
                                declarations = snapshots,
                            ),
                    ),
                    from = SdkGenPluginPhase.DECLARATION_AUGMENTATION,
                )

            assertTrue(
                result.diagnostics.any {
                    it.code == "SDKGEN-PLUGIN-NAME-COLLISION" && requestedName in it.message
                },
            )
        }
    }

    @Test
    fun `plugin phase survives conversion to pipeline diagnostics`() {
        val sourcePath = Path.of(requireNotNull(System.getProperty("engine.basicOpenApiFile")))
        val bytes = sourcePath.toFile().readBytes()
        val source =
            ResolvedSource(
                path = sourcePath,
                canonicalUri = "sdkgen://fixtures/basic-openapi.yaml",
                sha256 = bytes.sha256(),
                contentLength = bytes.size.toLong(),
            )
        val plugin =
            object : OutputVerificationPlugin {
                override val descriptor =
                    PluginDescriptor(
                        id = "test-plugin",
                        version = "0.1.0",
                        spiRange = ">=0.1 <0.2",
                        phases = listOf(SdkGenPluginPhase.OUTPUT_VERIFICATION),
                    )

                override fun verifyOutput(
                    input: OutputVerificationPhaseValue,
                    context: PluginContext,
                ): PluginPhaseResult<OutputVerificationPhaseValue> =
                    PluginPhaseResult.Applied(
                        input.copy(
                            diagnostics =
                                listOf(
                                    PluginDiagnostic(
                                        code = "SDKGEN-PLUGIN-TEST",
                                        severity = DiagnosticSeverity.ERROR,
                                        phase = SdkGenPluginPhase.OUTPUT_VERIFICATION,
                                        message = "test",
                                        remediation = "test",
                                        source = context.source,
                                        pluginId = descriptor.id,
                                    ),
                                ),
                        ),
                    )
            }
        val config =
            config(listOf(PluginConfig("test-plugin", "0.1.0", ">=0.1 <0.2")))
                .copy(source = SourceConfig(source.canonicalUri, source.sha256))

        val failure =
            assertFailsWith<GenerationBlockedException> {
                GenerationPipeline(
                    generatorVersion = "0.1.0-test",
                    pluginRegistry =
                        com.nabobery.sdkgen.engine.spi
                            .SdkGenPluginRegistry(listOf(plugin)),
                ).generate(
                    config = config,
                    source = source,
                    overlays = emptyList(),
                    destination = Files.createTempDirectory("sdkgen-plugin-diagnostic").resolve("current"),
                )
            }
        val diagnostic = failure.validation.diagnostics.single { it.code == "SDKGEN-PLUGIN-TEST" }
        assertEquals(SdkGenPluginPhase.OUTPUT_VERIFICATION, diagnostic.pluginPhase)
    }

    @Test
    fun `plugin diagnostics are attributed to the invoked phase and descriptor`() {
        val result =
            SdkGenPluginEngine(
                com.nabobery.sdkgen.engine.spi
                    .SdkGenPluginRegistry(listOf(WrongPhaseDiagnosticPlugin)),
            ).run(
                config(listOf(PluginConfig("wrong-phase", "0.1.0", ">=0.1 <0.2"))),
                PluginPipelineInput(sourcePointer(), document(), NamingTypeMappingPhaseValue("Api")),
                from = SdkGenPluginPhase.NAMING_TYPE_MAPPING,
            )

        val diagnostic = result.diagnostics.single { it.code == "SDKGEN-PLUGIN-WRONG" }
        assertEquals(SdkGenPluginPhase.NAMING_TYPE_MAPPING, diagnostic.phase)
        assertEquals("wrong-phase", diagnostic.pluginId)
    }

    @Test
    fun `built-in naming and output verification plugins integrate with generation`() {
        val sourcePath = Path.of(requireNotNull(System.getProperty("engine.basicOpenApiFile")))
        val bytes = sourcePath.toFile().readBytes()
        val source =
            ResolvedSource(
                sourcePath,
                "sdkgen://fixtures/basic-openapi.yaml",
                bytes.sha256(),
                bytes.size.toLong(),
            )
        val config =
            config(
                plugins =
                    listOf(
                        PluginConfig(
                            BuiltInSdkGenPlugins.NAMING_OVERRIDE_ID,
                            "0.1.0",
                            ">=0.1 <0.2",
                            config = mapOf("clientName" to "PreviewClient"),
                        ),
                        PluginConfig(BuiltInSdkGenPlugins.OUTPUT_VERIFICATION_ID, "0.1.0", ">=0.1 <0.2"),
                    ),
            ).copy(source = SourceConfig("sdkgen://fixtures/basic-openapi.yaml", source.sha256))
        val output = Files.createTempDirectory("sdkgen-plugin-spi").resolve("current")
        val lockPath = output.parent.resolve("sdkgen.lock")
        val lock =
            SdkgenLockV1Alpha1(
                configDigest = ConfigDigest.sha256(config),
                source = LockedSource(source.canonicalUri, source.sha256, source.contentLength),
                overlays = emptyList(),
                generator = LockedGenerator("0.1.0-test", "community"),
                plugins =
                    config.plugins.map { plugin ->
                        LockedPlugin(
                            id = plugin.id,
                            version = plugin.version,
                            spiRange = plugin.spiRange,
                            configSha256 = ConfigDigest.sha256(plugin.config),
                            phases =
                                BuiltInSdkGenPlugins
                                    .registry()
                                    .find(plugin.id)
                                    ?.descriptor
                                    ?.phases
                                    ?.map { phase -> phase.name.lowercase() }
                                    .orEmpty(),
                        )
                    },
            )

        val result =
            GenerationPipeline("0.1.0-test").generate(
                config,
                source,
                emptyList(),
                output,
                lock = GenerationLockPublication(lockPath, LockCodec.encode(lock)),
            )
        val manifest = Files.readString(output.resolve("manifest.json"))
        val encodedLock = Files.readString(lockPath)
        val namingDigest = ConfigDigest.sha256(mapOf("clientName" to "PreviewClient"))

        assertTrue(result.diagnostics.isEmpty())
        assertTrue(manifest.contains(BuiltInSdkGenPlugins.NAMING_OVERRIDE_ID))
        assertTrue(manifest.contains(namingDigest))
        assertTrue(manifest.contains("\"order\": 0"))
        assertTrue(manifest.contains("naming_type_mapping"))
        assertTrue(encodedLock.contains(BuiltInSdkGenPlugins.OUTPUT_VERIFICATION_ID))
        assertTrue(encodedLock.contains("naming_type_mapping"))
        assertTrue(encodedLock.contains(namingDigest))
        val publishedRoot =
            if (Files.isSymbolicLink(output)) {
                output.parent.resolve(Files.readSymbolicLink(output)).normalize()
            } else {
                output
            }
        assertTrue(
            Files.walk(publishedRoot).use { paths ->
                paths.anyMatch { it.fileName.toString() == "PreviewClient.kt" }
            },
        )
    }

    private class RecordingPlugin(
        private val calls: MutableList<String>,
    ) : SdkGenPlugin,
        ValidationPlugin,
        SemanticTransformPlugin,
        NamingTypeMappingPlugin,
        DeclarationAugmentationPlugin,
        OutputVerificationPlugin {
        override val descriptor: PluginDescriptor =
            PluginDescriptor(
                "recording",
                "0.1.0",
                ">=0.1 <0.2",
                SdkGenPluginPhase.entries,
            )

        override fun validate(
            input: ValidationPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<ValidationPhaseValue> {
            calls += "validation"
            return PluginPhaseResult.Applied(input)
        }

        override fun transformSemantic(
            input: SemanticTransformPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<SemanticTransformPhaseValue> {
            calls += "semantic"
            return PluginPhaseResult.Applied(input.copy(document = input.document.copy(title = "Transformed")))
        }

        override fun mapNamesAndTypes(
            input: NamingTypeMappingPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<NamingTypeMappingPhaseValue> {
            calls += "naming"
            return PluginPhaseResult.Applied(input)
        }

        override fun augmentDeclarations(
            input: DeclarationAugmentationPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<DeclarationAugmentationPhaseValue> {
            calls += "declarations"
            return PluginPhaseResult.Applied(input)
        }

        override fun verifyOutput(
            input: OutputVerificationPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<OutputVerificationPhaseValue> {
            calls += "output"
            return PluginPhaseResult.Applied(input)
        }
    }

    private class ConflictNamingPlugin(
        id: String,
        private val value: String,
        private val calls: MutableList<String>? = null,
        private val descriptorSpiRange: String = ">=0.1 <0.2",
    ) : NamingTypeMappingPlugin {
        override val descriptor =
            PluginDescriptor(
                id,
                "0.1.0",
                descriptorSpiRange,
                listOf(SdkGenPluginPhase.NAMING_TYPE_MAPPING),
            )

        override fun mapNamesAndTypes(
            input: NamingTypeMappingPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<NamingTypeMappingPhaseValue> {
            calls?.add("naming")
            return PluginPhaseResult.Applied(
                input.copy(overrides = input.overrides + NamingOverride("clientName", value, context.source)),
            )
        }
    }

    private class EarlyRejectedPlugin(
        private val calls: MutableList<String>,
    ) : SdkGenPlugin,
        ValidationPlugin,
        NamingTypeMappingPlugin,
        DeclarationAugmentationPlugin {
        override val descriptor =
            PluginDescriptor(
                "early-rejected",
                "0.1.0",
                ">=0.1 <0.2",
                listOf(
                    SdkGenPluginPhase.VALIDATION,
                    SdkGenPluginPhase.NAMING_TYPE_MAPPING,
                    SdkGenPluginPhase.DECLARATION_AUGMENTATION,
                ),
            )

        override fun validate(
            input: ValidationPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<ValidationPhaseValue> {
            calls += "validation"
            return PluginPhaseResult.Rejected(emptyList())
        }

        override fun mapNamesAndTypes(
            input: NamingTypeMappingPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<NamingTypeMappingPhaseValue> {
            calls += "naming"
            return PluginPhaseResult.Applied(input)
        }

        override fun augmentDeclarations(
            input: DeclarationAugmentationPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<DeclarationAugmentationPhaseValue> {
            calls += "declarations"
            return PluginPhaseResult.Applied(input)
        }
    }

    private class EarlyFailurePlugin(
        private val calls: MutableList<String>,
    ) : SdkGenPlugin,
        ValidationPlugin,
        NamingTypeMappingPlugin,
        DeclarationAugmentationPlugin {
        override val descriptor =
            PluginDescriptor(
                "early-failure",
                "0.1.0",
                ">=0.1 <0.2",
                listOf(
                    SdkGenPluginPhase.VALIDATION,
                    SdkGenPluginPhase.NAMING_TYPE_MAPPING,
                    SdkGenPluginPhase.DECLARATION_AUGMENTATION,
                ),
            )

        override fun validate(
            input: ValidationPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<ValidationPhaseValue> {
            calls += "validation"
            error("validation failure")
        }

        override fun mapNamesAndTypes(
            input: NamingTypeMappingPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<NamingTypeMappingPhaseValue> {
            calls += "naming"
            return PluginPhaseResult.Applied(input)
        }

        override fun augmentDeclarations(
            input: DeclarationAugmentationPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<DeclarationAugmentationPhaseValue> {
            calls += "declarations"
            return PluginPhaseResult.Applied(input)
        }
    }

    private class FailurePlugin : NamingTypeMappingPlugin {
        override val descriptor =
            PluginDescriptor(
                "failure",
                "0.1.0",
                ">=0.1 <0.2",
                listOf(SdkGenPluginPhase.NAMING_TYPE_MAPPING),
            )

        override fun mapNamesAndTypes(
            input: NamingTypeMappingPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<NamingTypeMappingPhaseValue> {
            error("plugin failure")
        }
    }

    private class CancellationPlugin(
        private val cancellation: CancellationException,
    ) : NamingTypeMappingPlugin {
        override val descriptor =
            PluginDescriptor(
                "cancel",
                "0.1.0",
                ">=0.1 <0.2",
                listOf(SdkGenPluginPhase.NAMING_TYPE_MAPPING),
            )

        override fun mapNamesAndTypes(
            input: NamingTypeMappingPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<NamingTypeMappingPhaseValue> = throw cancellation
    }

    private object WrongPhaseDiagnosticPlugin : NamingTypeMappingPlugin {
        override val descriptor =
            PluginDescriptor(
                "wrong-phase",
                "0.1.0",
                ">=0.1 <0.2",
                listOf(SdkGenPluginPhase.NAMING_TYPE_MAPPING),
            )

        override fun mapNamesAndTypes(
            input: NamingTypeMappingPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<NamingTypeMappingPhaseValue> =
            PluginPhaseResult.Rejected(
                listOf(
                    PluginDiagnostic(
                        code = "SDKGEN-PLUGIN-WRONG",
                        severity = DiagnosticSeverity.ERROR,
                        phase = SdkGenPluginPhase.OUTPUT_VERIFICATION,
                        message = "wrong phase",
                        remediation = "test",
                        source = context.source,
                        pluginId = "forged",
                    ),
                ),
            )
    }

    private object MutatingSemanticPlugin : SemanticTransformPlugin {
        override val descriptor =
            PluginDescriptor(
                "mutating",
                "0.1.0",
                ">=0.1 <0.2",
                listOf(SdkGenPluginPhase.SEMANTIC_TRANSFORM),
            )

        override fun transformSemantic(
            input: SemanticTransformPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<SemanticTransformPhaseValue> {
            ((input.document.extensions.getValue("values") as JsonValue.ArrayValue).values as MutableList<*>).clear()
            (input.document.extensions as MutableMap<*, *>).clear()
            return PluginPhaseResult.Applied(input)
        }
    }

    private object CollidingAugmentationPlugin : DeclarationAugmentationPlugin {
        override val descriptor =
            PluginDescriptor(
                "colliding",
                "0.1.0",
                ">=0.1 <0.2",
                listOf(SdkGenPluginPhase.DECLARATION_AUGMENTATION),
            )

        override fun augmentDeclarations(
            input: DeclarationAugmentationPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<DeclarationAugmentationPhaseValue> =
            PluginPhaseResult.Applied(
                input.copy(
                    augmentations =
                        listOf(
                            DeclarationAugmentation(
                                symbolId = "schema:a",
                                resolvedName = "Beta",
                                source = context.source,
                            ),
                            DeclarationAugmentation(
                                symbolId = "schema:b",
                                resolvedName = "not valid",
                                source = context.source,
                            ),
                        ),
                ),
            )
    }

    private class RenameDeclarationPlugin(
        requestedName: String,
    ) : DeclarationAugmentationPlugin {
        override val descriptor =
            PluginDescriptor(
                id = "rename-${requestedName.replace(Regex("[^A-Za-z0-9]+"), "-")}",
                version = "0.1.0",
                spiRange = ">=0.1 <0.2",
                phases = listOf(SdkGenPluginPhase.DECLARATION_AUGMENTATION),
            )

        private val requestedName = requestedName

        override fun augmentDeclarations(
            input: DeclarationAugmentationPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<DeclarationAugmentationPhaseValue> =
            PluginPhaseResult.Applied(
                input.copy(
                    augmentations =
                        listOf(
                            DeclarationAugmentation(
                                symbolId = "schema:model",
                                resolvedName = requestedName,
                                source = context.source,
                            ),
                        ),
                ),
            )
    }

    private fun collisionDeclarationModel(): KotlinDeclarationModel =
        KotlinDeclarationModel(
            listOf(
                KotlinFileDeclaration(
                    packageName = "com.example",
                    fileName = "Payload",
                    declarations =
                        listOf(
                            OneOfDeclaration(
                                symbolId = "schema:union",
                                order = 0,
                                packageName = "com.example",
                                fileName = "Payload",
                                resolvedName = "Payload",
                                kdoc = "union",
                                cases = emptyList(),
                            ),
                        ),
                ),
                KotlinFileDeclaration(
                    packageName = "com.example",
                    fileName = "Model",
                    declarations =
                        listOf(
                            ModelDeclaration(
                                symbolId = "schema:model",
                                order = 1,
                                packageName = "com.example",
                                fileName = "Model",
                                resolvedName = "Model",
                                kdoc = "model",
                                fields = emptyList(),
                                dslFunctionName = "model",
                            ),
                        ),
                ),
                KotlinFileDeclaration(
                    packageName = "com.example",
                    fileName = "Api",
                    declarations =
                        listOf(
                            OperationClientDeclaration(
                                symbolId = "client:api",
                                order = 2,
                                packageName = "com.example",
                                fileName = "Api",
                                resolvedName = "Api",
                                kdoc = "client",
                                codecsObjectName = "ApiCodecs",
                                operations = emptyList(),
                            ),
                        ),
                ),
            ),
        )

    private fun config(plugins: List<PluginConfig>): SdkgenConfigV1Alpha1 =
        SdkgenConfigV1Alpha1(
            version = ConfigVersion.V1_ALPHA_1,
            source = SourceConfig("sdkgen://source"),
            kotlin =
                KotlinGenerationConfig(
                    packageName = "com.example.generated",
                    coordinates = PackageCoordinates("com.example", "generated"),
                    naming = NamingConfig("Api"),
                    targets = listOf(TargetFamily.JVM),
                ),
            plugins = plugins,
            output = OutputConfig("sources", "resources", "manifest.json"),
        )

    private fun document(): SemanticDocument =
        SemanticDocument(
            documentUri = "sdkgen://source",
            title = "Preview",
            version = "1",
            sourceDocuments = emptyList(),
            schemas = emptyMap(),
            operations = emptyList(),
            securityAlternatives = emptyList(),
            extensions = emptyMap(),
            diagnostics = emptyList(),
            source = sourcePointer(),
        )

    private fun sourcePointer(): SourcePointer = SourcePointer("sdkgen://source", "/", SourceLocation(1, 1, 0))
}

private fun ByteArray.sha256(): String =
    MessageDigest.getInstance("SHA-256").digest(this).joinToString("") { byte -> "%02x".format(byte) }
