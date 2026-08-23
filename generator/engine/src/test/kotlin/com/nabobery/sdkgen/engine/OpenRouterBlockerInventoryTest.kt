package com.nabobery.sdkgen.engine

import com.nabobery.sdkgen.engine.config.ConfigLoader
import java.nio.file.Path
import java.security.MessageDigest
import kotlin.io.path.readBytes
import kotlin.io.path.readText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class OpenRouterBlockerInventoryTest {
    @Test
    fun productionPipelineHoldsOpenRouterAtTheZeroBlockerBaseline() {
        val sourcePath = Path.of(requireNotNull(System.getProperty("engine.openRouterFile")))
        val sourceBytes = sourcePath.readBytes()
        val sha256 = MessageDigest.getInstance("SHA-256").digest(sourceBytes).toHex()
        val source =
            ResolvedSource(
                path = sourcePath,
                canonicalUri = "sdkgen://openrouter/openapi.yaml",
                sha256 = sha256,
                contentLength = sourceBytes.size.toLong(),
            )
        val configPath = sourcePath.parent.resolve("sdkgen.yaml")
        // Full production binding: resolve EXACTLY the overlay list sdkgen.yaml declares (audit first, compat
        // second) so this inventory describes the TRUE production document, not a single-overlay seam probe.
        val config = ConfigLoader.decodeYaml(configPath.readText(), configPath.toString())
        val overlays =
            config.overlays.map { overlay ->
                val path = sourcePath.parent.resolve(overlay.uri)
                val sha256 = MessageDigest.getInstance("SHA-256").digest(path.readBytes()).toHex()
                assertEquals(
                    overlay.sha256,
                    sha256,
                    "committed sdkgen.yaml digest for '${overlay.id}' must match the overlay bytes",
                )
                ResolvedGenerationOverlay(
                    id = overlay.id,
                    path = path,
                    canonicalUri = "sdkgen://overlay/${overlay.id}",
                    sha256 = sha256,
                )
            }
        val pipeline = GenerationPipeline("conformance-test")
        val validation = pipeline.validate(config, source, overlays)

        val exclusionCategoryCounts =
            validation.exclusions.groupingBy { exclusion -> blockerCategory(exclusion.reason) }.eachCount()

        // Focused blocker-transition contracts FIRST: each named constant drives exactly one assertion with a
        // category-specific message, so a later 0.3.0 task that regresses a single category REDs that category's
        // own contract (not an aggregate line that hides which category moved). The frozen 0.3.0 baseline is the
        // ZERO-blocker state: all four categories are pinned at 0 against the TRUE production document.
        // Contract 1 — strict-intersection direct blockers: the audited overlays drive this to 0. An eliminated
        // category is absent from eachCount(); it must compare as 0 so a regression cannot hide behind absence.
        assertEquals(
            EXPECTED_CONFLICTING_ALL_OF,
            exclusionCategoryCounts["conflicting-allOf"] ?: 0,
            "strict-intersection direct blocker count (conflicting-allOf) drifted from the frozen baseline",
        )
        // Contract 2 — legacy-null primitive-oneOf, asserted independently so it can regress on its own.
        assertEquals(
            EXPECTED_PRIMITIVE_ONEOF,
            exclusionCategoryCounts["primitive-oneOf"] ?: 0,
            "legacy-null primitive-oneOf blocker count drifted from the frozen baseline",
        )
        // Contract 3 — incompatible request media, asserted independently so it can regress on its own.
        assertEquals(
            EXPECTED_INCOMPATIBLE_REQUEST_MEDIA,
            exclusionCategoryCounts["incompatible-request-media"] ?: 0,
            "incompatible-request-media blocker count drifted from the frozen baseline",
        )
        // Contract 4 — dependent missing-declaration closure, asserted independently so it can regress on its own.
        assertEquals(
            EXPECTED_MISSING_DECLARATION,
            exclusionCategoryCounts["missing-declaration"] ?: 0,
            "dependent missing-declaration closure size drifted from the frozen baseline",
        )

        // No novel categories: the observed key-set must be exactly the known categories that still expect a
        // nonzero count (an eliminated category legitimately disappears from the histogram). Combined with
        // blockerCategory()'s hard error on an unrecognized message, this preserves the old unknown-message trip.
        val expectedPresentCategories =
            mapOf(
                "conflicting-allOf" to EXPECTED_CONFLICTING_ALL_OF,
                "missing-declaration" to EXPECTED_MISSING_DECLARATION,
                "primitive-oneOf" to EXPECTED_PRIMITIVE_ONEOF,
                "incompatible-request-media" to EXPECTED_INCOMPATIBLE_REQUEST_MEDIA,
            ).filterValues { expected -> expected > 0 }.keys
        assertEquals(
            expectedPresentCategories,
            exclusionCategoryCounts.keys,
            "observed OpenRouter blocker categories drifted from the expected set",
        )

        // The ERROR diagnostics and the generation exclusions are two views of the same blockers. At the zero
        // baseline BOTH must be empty — asserted directly (not merely via an all-zero histogram) so the frozen
        // state is a positive claim about the validation report's completeness, never a vacuous empty-map pass.
        assertTrue(validation.exclusions.isEmpty(), "the production document must generate without exclusions")
        val blockingDiagnostics = validation.diagnostics.filter { diagnostic -> diagnostic.severity.name == "ERROR" }
        assertTrue(blockingDiagnostics.isEmpty(), "the production document must report no blocking diagnostics")
        assertEquals(
            emptyMap(),
            blockingDiagnostics.groupingBy { diagnostic -> diagnostic.code }.eachCount(),
            "the frozen zero-blocker baseline has an empty diagnostic-code histogram",
        )

        // The zero-blocker baseline is only meaningful if generation itself completes: run the pipeline
        // end-to-end into the Gradle-provided tmp output dir and assert it publishes a real SDK without ever
        // raising GenerationBlockedException. (Deliberately NOT diffed against conformance/openrouter/generated/
        // — that snapshot regen is fenced to the corpus-regeneration lane.)
        val output = Path.of(requireNotNull(System.getProperty("engine.openRouterGeneratedOutput"))).resolve("current")
        val result = pipeline.generate(config, source, overlays, output)
        assertTrue(result.generatedFiles > 0, "generation must publish emitted sources, not an empty snapshot")
        assertTrue(result.manifestBytes > 0, "generation must publish a non-empty manifest")
        assertTrue(result.exclusions.isEmpty(), "a completed generation must carry no exclusions")
    }

    private companion object {
        // Frozen 0.3.0 ZERO-blocker baseline (verified 2026-08-22 against the true production document:
        // openrouter-allof-resolution-audit + trimmed openrouter-full-spec-compat, exactly as sdkgen.yaml
        // declares). The strict-intersection resolver cleared the 14 direct conflicting-allOf parents;
        // the audited overlays resolved the 6 surfaced object-merge latent roots, which un-stranded the
        // entire 14-schema missing-declaration closure and let the previously-removed /messages and /responses
        // schemas project again. The incompatible-request-media count is 0 because the compat overlay removes
        // the offending /audio/transcriptions operation outright (a pre-existing production removal; the raw
        // document still carries the conflict until the full-surface config restores that endpoint). All four categories are
        // pinned at 0; each remains the sole knob a later task flips if its category regresses.
        const val EXPECTED_CONFLICTING_ALL_OF = 0
        const val EXPECTED_MISSING_DECLARATION = 0
        const val EXPECTED_PRIMITIVE_ONEOF = 0
        const val EXPECTED_INCOMPATIBLE_REQUEST_MEDIA = 0
    }

    private fun blockerCategory(message: String): String =
        when {
            "conflicting allOf property" in message -> "conflicting-allOf"
            "has no emitted declaration" in message -> "missing-declaration"
            "has no exact JSON kind" in message -> "primitive-oneOf"
            "incompatible request schemas" in message -> "incompatible-request-media"
            else -> error("Unexpected OpenRouter blocker: $message")
        }

    private fun ByteArray.toHex(): String = joinToString("") { byte -> "%02x".format(byte) }
}
