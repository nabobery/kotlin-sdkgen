package com.nabobery.sdkgen.cli

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.ProgramResult
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.required
import com.github.ajalt.clikt.parameters.types.choice
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import java.nio.file.Path

/**
 * The `compat` command renders the ADR 0013 ("Report generated-SDK compatibility through five independent
 * evidence layers") five-layer compatibility report between two bounded, versioned compatibility manifests.
 *
 * It is a deliberately separate command from the frozen `v1alpha1` `diff`/`explain` snapshot commands: those
 * commands compare `DiffSnapshot`s decoded by [readDiffOperand] and their exact JSON/text output shapes never
 * change. `compat` reads [CompatibilityManifestSnapshot]s through [CompatibilityManifestReader] and reports the
 * separate, versioned five-layer contract this ADR establishes; it never reinterprets or alters legacy `diff`
 * output.
 *
 * Per the ADR's "CLI contract and exit policy" section, the classification and exit-code decision are made
 * before rendering and never by a renderer: [CompatibilityExitPolicy.exitCode] is the single source of the exit
 * code, called with the already-derived [CompatibilityReport] and the selected [CompatibilityFailOn] threshold.
 * `--format` only selects how [CompatibilityReportRenderer] renders that same report; it plays no part in the
 * exit-code decision. Exit codes: `0` complete evidence, no selected threshold reached; `1` invalid input or
 * incomplete required evidence; `2` CLI usage error (handled by [main] itself via `CliktError`); `3` complete
 * evidence and the selected threshold was reached.
 */
internal class CompatCommand : CliktCommand(name = "compat") {
    private val fromPath: String by option(
        "--from",
        help = "Compatibility manifest to compare from",
    ).required()
    private val toPath: String by option(
        "--to",
        help = "Compatibility manifest to compare to",
    ).required()
    private val format: CompatibilityOutputFormat by option(
        "--format",
        help = "Compatibility report output format",
    ).choice(
        "human" to CompatibilityOutputFormat.HUMAN,
        "json" to CompatibilityOutputFormat.JSON,
        "markdown" to CompatibilityOutputFormat.MARKDOWN,
    ).default(CompatibilityOutputFormat.HUMAN)
    private val failOn: CompatibilityFailOn by option(
        "--fail-on",
        help = "Compatibility threshold that selects the command's exit code",
    ).choice(
        "breaking" to CompatibilityFailOn.BREAKING,
        "behaviorally-risky" to CompatibilityFailOn.BEHAVIORALLY_RISKY,
        "any-change" to CompatibilityFailOn.ANY_CHANGE,
        "never" to CompatibilityFailOn.NEVER,
    ).default(CompatibilityFailOn.BREAKING)
    private val behaviorEvidenceFromPath: String? by option(
        "--behavior-evidence-from",
        help = "Parity behavior evidence to compare from; omit when unavailable",
    )
    private val behaviorEvidenceToPath: String? by option(
        "--behavior-evidence-to",
        help = "Parity behavior evidence to compare to; omit when unavailable",
    )
    private val abiEvidenceFromPath: String? by option(
        "--abi-evidence-from",
        help = "Staged generated-SDK ABI evidence manifest to compare from; omit to leave abi unavailable",
    )
    private val abiEvidenceToPath: String? by option(
        "--abi-evidence-to",
        help = "Staged generated-SDK ABI evidence manifest to compare to; omit to leave abi unavailable",
    )

    /**
     * The `kotlinApi` layer reads a staged projection of the API a generation actually *emitted*, produced by
     * `sdkgen generate --kotlin-api-projection`. It is supplied rather than read from the manifest because a
     * manifest cannot establish emitted API: `kotlinApiSha256` is computed from the declaration model, upstream
     * of emission, and stayed byte-identical across ADR 0015's regression that deleted 518 public symbols.
     * Omitting these flags leaves the layer `unavailable`, which is the honest answer.
     */
    private val kotlinApiFromPath: String? by option(
        "--kotlin-api-from",
        help = "Staged emitted public-API projection to compare from; omit to leave kotlinApi unavailable",
    )
    private val kotlinApiToPath: String? by option(
        "--kotlin-api-to",
        help = "Staged emitted public-API projection to compare to; omit to leave kotlinApi unavailable",
    )

    override fun run() {
        executeCliAction(
            action = {
                val from = CompatibilityManifestReader.read(Path.of(fromPath))
                val to = CompatibilityManifestReader.read(Path.of(toPath))
                val behaviorEvidence =
                    behaviorEvidenceFromPath?.let { BehaviorEvidenceReader.read(Path.of(it)) } to
                        behaviorEvidenceToPath?.let { BehaviorEvidenceReader.read(Path.of(it)) }
                val abiEvidence =
                    abiEvidenceFromPath?.let { AbiEvidenceReader.read(Path.of(it)) } to
                        abiEvidenceToPath?.let { AbiEvidenceReader.read(Path.of(it)) }
                val kotlinApiEvidence =
                    kotlinApiFromPath?.let { KotlinApiProjectionReader.read(Path.of(it), from) } to
                        kotlinApiToPath?.let { KotlinApiProjectionReader.read(Path.of(it), to) }
                val report =
                    CompatibilityReport.compare(from, to, behaviorEvidence, abiEvidence, kotlinApiEvidence)
                val exitCode = CompatibilityExitPolicy.exitCode(report, failOn)
                echo(CompatibilityReportRenderer.render(report, format))
                if (exitCode != SDKGEN_EXIT_OK) throw ProgramResult(exitCode)
            },
            failureHandler = { failure -> failCompat(failure) },
        )
    }

    /**
     * Invalid or unreadable manifest input (for example [CompatibilityManifestInputException] or a missing file)
     * is reported as exit `1`, matching the ADR's "invalid input or incomplete required evidence" exit code. This
     * never overlaps with [CompatibilityExitPolicy]'s own `1` for a successfully-read but evidence-incomplete
     * report: both are the same exit code for the same reason -- the caller does not have a trustworthy report.
     */
    private fun failCompat(failure: Throwable): Nothing {
        val message = failure.message ?: failure::class.simpleName.orEmpty()
        if (format == CompatibilityOutputFormat.JSON) {
            echo(
                COMPACT_JSON.encodeToString(
                    buildJsonObject {
                        put("contractVersion", SDKGEN_CLI_CONTRACT_VERSION)
                        put("status", "invalid")
                        put("command", "compat")
                        put("message", message)
                    },
                ),
            )
        } else {
            echo(message, err = true)
        }
        throw ProgramResult(SDKGEN_EXIT_DIAGNOSTICS)
    }
}
