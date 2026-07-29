package com.nabobery.sdkgen.engine

import com.nabobery.sdkgen.engine.config.AcceptedWaiverConfig
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
import kotlin.io.path.readBytes
import kotlin.io.path.readText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class StripeConformanceGenerationTest {
    /**
     * Asserts that `conformance/stripe/sdkgen.yaml`'s waiver ledger exactly covers the exclusions the
     * pinned Stripe specification actually produces — no stale waiver, no uncovered exclusion.
     *
     * Until ADR-0014 this test asserted the ledger equalled the recorded historical-plus-parity partition (157 historical
     * waivers plus 4 release-candidate delta waivers, 161 total). ADR-0014 reclaimed 93 operations by treating an
     * absent `additionalProperties` on a form object that declares properties as closed, and gave each
     * remaining rejected state its own reason text — so 55 waivers carry new reason hashes and the frozen
     * partition no longer describes the tree. The historical/parity ledgers stay as dated historical records and are
     * not rewritten; the 9 form-composition waivers that survived ADR-0014 untouched are still asserted
     * against the frozen ledger byte-for-byte, id and rationale included.
     *
     * This still fails closed on drift in both directions: a waiver whose tuple stops matching anything,
     * or an exclusion that no waiver covers, breaks the set equality below.
     */
    @Test
    fun currentWaiverLedgerExactlyCoversCurrentStripeExclusions() {
        val source = source()
        val pipeline = GenerationPipeline("sdkgen-maintainers")
        val baseline = pipeline.validate(baseConfig(source), source, emptyList())
        val frozen = frozenInventory()
        val config = config()

        assertEquals(68, baseline.exclusions.size)

        // Every accepted waiver must correspond to an exclusion that actually occurs, and every exclusion
        // must be covered by exactly one waiver. Set equality gives both directions at once: a stale waiver
        // whose tuple no longer matches anything would silently keep its fail-closed meaning while guarding
        // nothing, and an uncovered exclusion would block generation.
        val exclusionIdentities =
            baseline.exclusions
                .map { exclusion ->
                    WaiverIdentity(
                        kind = exclusion.kind.name.lowercase(),
                        symbolId = exclusion.symbolId,
                        diagnosticCode = exclusion.diagnosticCode,
                        documentUri = exclusion.documentUri,
                        jsonPointer = exclusion.jsonPointer,
                        reasonSha256 = exclusion.reasonSha256,
                        category = "",
                        owner = "",
                        disposition = "",
                    )
                }.toSet()
        assertEquals(68, exclusionIdentities.size)
        assertEquals(68, config.acceptedWaivers.size)
        assertEquals(
            config.acceptedWaivers.size,
            config.acceptedWaivers
                .map { it.id }
                .toSet()
                .size,
        )
        assertEquals(
            exclusionIdentities,
            config.acceptedWaivers
                .map { waiver -> ledgerIdentity(waiver).copy(category = "", owner = "", disposition = "") }
                .toSet(),
        )

        // ADR-0014 reclaimed 93 operations and changed the reason text of the states that remain rejected,
        // so the ledger is no longer the recorded historical-plus-parity set. The waivers that survived it unchanged must
        // still match the frozen T11 ledger exactly, including id and rationale -- those entries were not
        // touched and any drift in them would be a real regression.
        val frozenIdentities = frozen.map { row -> ledgerIdentity(row) }.toSet()
        val surviving =
            config.acceptedWaivers.filter { waiver -> ledgerIdentity(waiver) in frozenIdentities }
        assertEquals(9, surviving.size)
        assertEquals(
            frozen
                .map { row -> row.waiverConfigEntry() }
                .filter { entry ->
                    ledgerIdentity(entry) in
                        surviving.map { waiver -> ledgerIdentity(waiver) }.toSet()
                }.toSet(),
            surviving.map(::configEntry).toSet(),
        )

        // Fail-closed still holds end to end: with the ledger applied there is no residual exclusion, and
        // generation succeeds.
        val validation = pipeline.validate(config, source, emptyList())
        assertEquals(
            emptySet<ConformanceExclusionIdentity>(),
            validation.exclusions.map(GenerationExclusionView::conformanceIdentity).toSet(),
        )
        assertEquals(68, validation.acceptedWaivers.size)

        val outputRoot = Files.createTempDirectory("stripe-conformance-adr0014-accepted")
        try {
            val output = outputRoot.resolve("current")
            val result = pipeline.generate(config, source, emptyList(), output)
            assertTrue(result.exclusions.isEmpty())
            assertEquals(68, result.acceptedWaivers.size)
            assertTrue(result.generatedFiles > 0)
        } finally {
            outputRoot.toFile().deleteRecursively()
        }
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

    private fun configEntry(waiver: AcceptedWaiverConfig): ConfigEntry =
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

    /** [ConfigEntry] minus the freeform `waiverId`/`rationale` text, so historical and parity-delta
     * waivers (the latter's rationale/id only ever existing in `sdkgen.yaml`, not in any ledger
     * TSV) can be compared for exact identity/governance equality on common ground. */
    private fun ledgerIdentity(entry: ConfigEntry): WaiverIdentity =
        WaiverIdentity(
            kind = entry.kind,
            symbolId = entry.symbolId,
            diagnosticCode = entry.diagnosticCode,
            documentUri = entry.documentUri,
            jsonPointer = entry.jsonPointer,
            reasonSha256 = entry.reasonSha256,
            category = entry.category,
            owner = entry.owner,
            disposition = entry.disposition,
        )

    private fun ledgerIdentity(row: FrozenExclusion): WaiverIdentity = ledgerIdentity(row.waiverConfigEntry())

    private fun ledgerIdentity(waiver: AcceptedWaiverConfig): WaiverIdentity = ledgerIdentity(configEntry(waiver))

    private fun ledgerIdentity(waiver: AcceptedWaiverView): WaiverIdentity =
        WaiverIdentity(
            kind = waiver.kind.name.lowercase(),
            symbolId = waiver.symbolId,
            diagnosticCode = waiver.diagnosticCode,
            documentUri = waiver.documentUri,
            jsonPointer = waiver.jsonPointer,
            reasonSha256 = waiver.reasonSha256,
            category = waiver.category,
            owner = waiver.owner,
            disposition = waiver.disposition,
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

    /** [ConfigEntry] without `waiverId`/`rationale` - see [ConfigEntry.ledgerIdentity]. */
    private data class WaiverIdentity(
        val kind: String,
        val symbolId: String,
        val diagnosticCode: String,
        val documentUri: String,
        val jsonPointer: String,
        val reasonSha256: String,
        val category: String,
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
