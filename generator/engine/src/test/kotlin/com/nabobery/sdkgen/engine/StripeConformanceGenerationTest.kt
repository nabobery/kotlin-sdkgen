package com.nabobery.sdkgen.engine

import com.nabobery.sdkgen.engine.config.ConfigLoader
import com.nabobery.sdkgen.engine.config.ConfigVersion
import com.nabobery.sdkgen.engine.config.KotlinGenerationConfig
import com.nabobery.sdkgen.engine.config.NamingConfig
import com.nabobery.sdkgen.engine.config.OutputConfig
import com.nabobery.sdkgen.engine.config.PackageCoordinates
import com.nabobery.sdkgen.engine.config.SdkgenConfigV1Alpha1
import com.nabobery.sdkgen.engine.config.SourceConfig
import com.nabobery.sdkgen.engine.config.TargetFamily
import java.nio.file.Files
import java.nio.file.Path
import java.security.MessageDigest
import kotlin.io.path.createDirectories
import kotlin.io.path.readBytes
import kotlin.io.path.readText
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class StripeConformanceGenerationTest {
    @Test
    fun checkedInWaiversExactlyAcceptEveryResidualStripeExclusion() {
        val source = source()
        val pipeline = GenerationPipeline("phase3-t11")
        val baseline = pipeline.validate(baseConfig(source), source, emptyList())
        if (System.getenv("UPDATE_T11_STRIPE_WAIVERS") == "1") {
            writeWaiverArtifacts(baseline.exclusions)
        }
        val frozen = frozenInventory()
        val config = config()

        assertEquals(157, baseline.exclusions.size)
        assertEquals(frozen.map(FrozenExclusion::identity).toSet(), baseline.exclusions.map(::identity).toSet())
        assertEquals(
            frozen
                .map { row ->
                    row.waiverConfigEntry()
                }.toSet(),
            config.acceptedWaivers.map(::configEntry).toSet(),
        )

        val validation = pipeline.validate(config, source, emptyList())
        assertTrue(validation.exclusions.isEmpty())
        assertFalse(validation.diagnostics.any { diagnostic -> diagnostic.severity.name == "ERROR" })
        assertEquals(
            frozen.associateBy(FrozenExclusion::waiverId),
            validation.acceptedWaivers.map(::frozen).associateBy(FrozenExclusion::waiverId),
        )

        val output = Files.createTempDirectory("stripe-conformance-waived").resolve("current")
        try {
            val result = pipeline.generate(config, source, emptyList(), output)
            assertTrue(result.exclusions.isEmpty())
            assertEquals(frozen.size, result.acceptedWaivers.size)
            assertTrue(
                output
                    .resolve("com/nabobery/sdkgen/generated/stripe/v1/V1Client.kt")
                    .readText()
                    .contains("Form map values encoded from a raw JSON object must be JSON primitives"),
            )
            assertTrue(
                output
                    .resolve("com/nabobery/sdkgen/generated/stripe/v1/V1Client.kt")
                    .readText()
                    .contains("by lazy(LazyThreadSafetyMode.PUBLICATION)"),
            )
        } finally {
            output.parent.toFile().deleteRecursively()
        }

        val missing = config.copy(acceptedWaivers = config.acceptedWaivers.drop(1))
        val missingOutput = Files.createTempDirectory("stripe-conformance-missing").resolve("current")
        try {
            assertEquals(1, pipeline.validate(missing, source, emptyList()).exclusions.size)
            assertFailsWith<GenerationBlockedException> {
                pipeline.generate(missing, source, emptyList(), missingOutput)
            }
        } finally {
            missingOutput.parent.toFile().deleteRecursively()
        }
    }

    private fun writeWaiverArtifacts(exclusions: List<GenerationExclusionView>) {
        val rows = exclusions.sortedBy(GenerationExclusionView::symbolId).map(::frozen)
        val inventory = Path.of(requireNotNull(System.getProperty("engine.t11StripeWaiverInventory")))
        inventory.parent.createDirectories()
        inventory.writeText(
            buildString {
                append(FROZEN_HEADER.joinToString("\t"))
                append('\n')
                rows.forEach { row ->
                    append(
                        listOf(
                            row.kind,
                            row.symbolId,
                            row.diagnosticCode,
                            row.documentUri,
                            row.jsonPointer,
                            row.reason.replace('\t', ' ').replace('\n', ' '),
                            row.reasonSha256,
                            row.category,
                            row.waiverId,
                            row.rationale,
                            row.owner,
                            row.disposition,
                        ).joinToString("\t"),
                    )
                    append('\n')
                }
            },
        )

        val config = Path.of(requireNotNull(System.getProperty("engine.t11StripeConfig")))
        config.writeText(
            buildString {
                appendLine("version: v1alpha1")
                appendLine("source:")
                appendLine("  uri: openapi.json")
                appendLine("  sha256: ${source().sha256}")
                appendLine("  acquisition:")
                appendLine("    mode: local")
                appendLine("    offline: true")
                appendLine("    allowedHosts: []")
                appendLine("    followRedirects: false")
                appendLine("    maxRedirects: 0")
                appendLine("    maxBytes: 16777216")
                appendLine("    timeoutSeconds: 30")
                appendLine("    cacheDirectory: .sdkgen/cache")
                appendLine("    allowedLocalRoots:")
                appendLine("      - .")
                appendLine("kotlin:")
                appendLine("  packageName: com.nabobery.sdkgen.generated.stripe")
                appendLine("  coordinates:")
                appendLine("    groupId: com.nabobery.sdkgen")
                appendLine("    artifactId: stripe-conformance")
                appendLine("  naming:")
                appendLine("    clientName: StripeClient")
                appendLine("    resourceGrouping: tags")
                appendLine("  targets:")
                appendLine("    - jvm")
                appendLine("    - js")
                appendLine("    - macos")
                appendLine("output:")
                appendLine("  sources: generated")
                appendLine("  resources: generated-resources")
                appendLine("  manifest: manifest.json")
                appendLine("  lock: sdkgen.lock")
                appendLine("  checkedInSources: true")
                appendLine("diagnostics:")
                appendLine("  warningsAsErrors: false")
                appendLine("  warningAllowlist: []")
                appendLine("  format: json")
                appendLine("verification:")
                appendLine("  gates:")
                appendLine("    - schema")
                appendLine("    - determinism")
                appendLine("    - api")
                appendLine("acceptedWaivers:")
                rows.forEach { row ->
                    appendLine("  - id: ${row.waiverId}")
                    appendLine("    category: ${row.category}")
                    appendLine("    match:")
                    appendLine("      kind: ${row.kind}")
                    appendLine("      symbolId: ${row.symbolId.yamlString()}")
                    appendLine("      diagnosticCode: ${row.diagnosticCode.yamlString()}")
                    appendLine("      documentUri: ${row.documentUri.yamlString()}")
                    appendLine("      jsonPointer: ${row.jsonPointer.yamlString()}")
                    appendLine("      reasonSha256: ${row.reasonSha256.yamlString()}")
                    appendLine("    rationale: ${row.rationale.yamlString()}")
                    appendLine("    owner: ${row.owner}")
                    appendLine("    disposition: ${row.disposition}")
                }
            },
        )
    }

    private fun frozen(exclusion: GenerationExclusionView): FrozenExclusion {
        val category = category(exclusion.reason)
        return FrozenExclusion(
            kind = exclusion.kind.name.lowercase(),
            symbolId = exclusion.symbolId,
            diagnosticCode = exclusion.diagnosticCode,
            documentUri = exclusion.documentUri,
            jsonPointer = exclusion.jsonPointer,
            reason = exclusion.reason,
            reasonSha256 = exclusion.reasonSha256,
            category = category,
            waiverId = "stripe-${exclusion.jsonPointer.lowercase().replace(
                Regex("[^a-z0-9]+"),
                "-",
            ).trim('-')}-${exclusion.reasonSha256.take(12)}",
            rationale =
                "Exact Stripe T11 waiver for this ${category.replace(
                    '-',
                    ' ',
                )} operation: ${exclusion.reason}. Omit only this source-proven tuple rather than weaken the generated SDK contract.",
            owner = "phase3-t11",
            disposition = "omit",
        )
    }

    private fun category(reason: String): String =
        when {
            "form object must declare additionalProperties: false" in reason -> "dynamic-object-keys"
            "form anyOf branches overlap by wire kind" in reason -> "form-composition"
            else -> error("Unexpected Stripe waiver category: $reason")
        }

    private fun String.yamlString(): String =
        buildString {
            append('"')
            this@yamlString.forEach { character ->
                when (character) {
                    '\\' -> append("\\\\")
                    '"' -> append("\\\"")
                    '\n' -> append("\\n")
                    '\r' -> append("\\r")
                    '\t' -> append("\\t")
                    else -> append(character)
                }
            }
            append('"')
        }

    private fun source(): ResolvedSource {
        val sourcePath = Path.of(requireNotNull(System.getProperty("engine.stripeFile")))
        val bytes = sourcePath.readBytes()
        return ResolvedSource(
            path = sourcePath,
            canonicalUri = "sdkgen://source/openapi.json",
            sha256 = bytes.sha256(),
            contentLength = bytes.size.toLong(),
        )
    }

    private fun baseConfig(source: ResolvedSource): SdkgenConfigV1Alpha1 =
        SdkgenConfigV1Alpha1(
            version = ConfigVersion.V1_ALPHA_1,
            source = SourceConfig(source.canonicalUri, source.sha256),
            kotlin =
                KotlinGenerationConfig(
                    packageName = "com.nabobery.sdkgen.generated.stripe",
                    coordinates = PackageCoordinates("com.nabobery.sdkgen", "stripe-generated"),
                    naming = NamingConfig(clientName = "StripeClient"),
                    targets = listOf(TargetFamily.JVM, TargetFamily.JS, TargetFamily.MACOS),
                ),
            output = OutputConfig("sources", "resources", "manifest.json"),
        )

    private fun config(): SdkgenConfigV1Alpha1 {
        val configPath = Path.of(requireNotNull(System.getProperty("engine.t11StripeConfig")))
        return ConfigLoader.decodeYaml(configPath.readText(), configPath.toString())
    }

    private fun frozenInventory(): List<FrozenExclusion> {
        val inventory = Path.of(requireNotNull(System.getProperty("engine.t11StripeWaiverInventory")))
        val lines =
            inventory
                .readText()
                .lineSequence()
                .filter(String::isNotBlank)
                .toList()
        assertEquals(FROZEN_HEADER, lines.first().split('\t'))
        return lines.drop(1).map(::frozen).also { rows ->
            assertEquals(157, rows.size)
            assertEquals(157, rows.map(FrozenExclusion::waiverId).toSet().size)
        }
    }

    private fun frozen(line: String): FrozenExclusion {
        val values = line.split('\t')
        assertEquals(FROZEN_HEADER.size, values.size)
        return FrozenExclusion(
            kind = values[0],
            symbolId = values[1],
            diagnosticCode = values[2],
            documentUri = values[3],
            jsonPointer = values[4],
            reason = values[5],
            reasonSha256 = values[6],
            category = values[7],
            waiverId = values[8],
            rationale = values[9],
            owner = values[10],
            disposition = values[11],
        )
    }

    private fun identity(exclusion: GenerationExclusionView): ExclusionIdentity =
        ExclusionIdentity(
            kind = exclusion.kind.name.lowercase(),
            symbolId = exclusion.symbolId,
            diagnosticCode = exclusion.diagnosticCode,
            documentUri = exclusion.documentUri,
            jsonPointer = exclusion.jsonPointer,
            reason = exclusion.reason,
            reasonSha256 = exclusion.reasonSha256,
        )

    private fun frozen(waiver: AcceptedWaiverView): FrozenExclusion =
        FrozenExclusion(
            kind = waiver.kind.name.lowercase(),
            symbolId = waiver.symbolId,
            diagnosticCode = waiver.diagnosticCode,
            documentUri = waiver.documentUri,
            jsonPointer = waiver.jsonPointer,
            reason = waiver.reason,
            reasonSha256 = waiver.reasonSha256,
            category = waiver.category,
            waiverId = waiver.id,
            rationale = waiver.rationale,
            owner = waiver.owner,
            disposition = waiver.disposition,
        )

    private fun configEntry(waiver: com.nabobery.sdkgen.engine.config.AcceptedWaiverConfig): ConfigEntry =
        ConfigEntry(
            kind =
                waiver.match.kind.name
                    .lowercase(),
            symbolId = waiver.match.symbolId,
            diagnosticCode = waiver.match.diagnosticCode,
            documentUri = waiver.match.documentUri,
            jsonPointer = waiver.match.jsonPointer,
            reasonSha256 = waiver.match.reasonSha256,
            category = waiver.category,
            waiverId = waiver.id,
            rationale = waiver.rationale,
            owner = waiver.owner,
            disposition = waiver.disposition.name.lowercase(),
        )

    private fun FrozenExclusion.waiverConfigEntry(): ConfigEntry =
        ConfigEntry(
            kind = kind,
            symbolId = symbolId,
            diagnosticCode = diagnosticCode,
            documentUri = documentUri,
            jsonPointer = jsonPointer,
            reasonSha256 = reasonSha256,
            category = category,
            waiverId = waiverId,
            rationale = rationale,
            owner = owner,
            disposition = disposition,
        )

    private fun ByteArray.sha256(): String = MessageDigest.getInstance("SHA-256").digest(this).toHex()

    private fun ByteArray.toHex(): String = joinToString("") { byte -> "%02x".format(byte) }

    private data class ExclusionIdentity(
        val kind: String,
        val symbolId: String,
        val diagnosticCode: String,
        val documentUri: String,
        val jsonPointer: String,
        val reason: String,
        val reasonSha256: String,
    )

    private data class ConfigEntry(
        val kind: String,
        val symbolId: String,
        val diagnosticCode: String,
        val documentUri: String,
        val jsonPointer: String,
        val reasonSha256: String,
        val category: String,
        val waiverId: String,
        val rationale: String,
        val owner: String,
        val disposition: String,
    )

    private data class FrozenExclusion(
        val kind: String,
        val symbolId: String,
        val diagnosticCode: String,
        val documentUri: String,
        val jsonPointer: String,
        val reason: String,
        val reasonSha256: String,
        val category: String,
        val waiverId: String,
        val rationale: String,
        val owner: String,
        val disposition: String,
    ) {
        fun identity(): ExclusionIdentity =
            ExclusionIdentity(kind, symbolId, diagnosticCode, documentUri, jsonPointer, reason, reasonSha256)
    }

    private companion object {
        val FROZEN_HEADER =
            listOf(
                "kind",
                "symbolId",
                "diagnosticCode",
                "documentUri",
                "jsonPointer",
                "reason",
                "reasonSha256",
                "category",
                "waiverId",
                "rationale",
                "owner",
                "disposition",
            )
    }
}
