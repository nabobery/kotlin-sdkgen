package com.nabobery.sdkgen.conformance.parity

import java.io.File

internal object ParityRegistry {
    const val GITHUB_CORPUS_SHA256: String = "350102b39f8575f9ef0eb7db96fc2f80f5cbfefbfbaf64d243bc696348d00b63"
    const val GITHUB_EFFECTIVE_CONFIG_SHA256: String =
        "18da2c4ae6c2135ceff60e28069ed86304088884f9b58af7a671a3d33e34074e"
    const val STRIPE_CORPUS_SHA256: String = "e24a26de4188fd64dec4c043d5d3726277fdcb07556a493ea481c305b0a223d8"
    const val STRIPE_EFFECTIVE_CONFIG_SHA256: String =
        "09c792d932d37ad2f6db6b761977fa2d754e1a3fa78dccabbe3532c1ed4a9918"
    const val GITHUB_CONFIG_FILE_SHA256: String = "fe108f09397631881d22069bc82c9956acfa513c2828972ef491f18eca04d7e1"
    const val GITHUB_LOCK_FILE_SHA256: String = "af679707dece4abf901679c2f21fca2eefdfa4ea2a67b27e93231e2d172a250b"
    const val GITHUB_OVERLAY_SHA256: String = "4bb4eb28ee5b424cea50c9ea92047ed35e49282273800ab7e1ab4cd83b083288"
    const val GITHUB_AUDIT_OVERLAY_SHA256: String =
        "3f190ddaa20e9b0ca074e6c82b61d7ff1911df25586cc1f1ffa38a18b35e78f3"
    const val OPENROUTER_AUDIT_OVERLAY_SHA256: String =
        "f8bc7a924cf9bc0af7ac54abc8a933037d0c30631b7bf690884ba3dfcd5cb6d0"
    const val STRIPE_CONFIG_FILE_SHA256: String = "71928294e15d61a94b623cc4aa740616ad755d0be1b97539f5e363aaeb9e8407"
    const val STRIPE_LOCK_FILE_SHA256: String = "c7c1d20505a449377c23ddc3d46dbbc5cf22c62d49bf351b330db340ff07b741"
    const val OPENROUTER_OVERLAY_SHA256: String =
        "0ced3f18aa83e29f6aadc41d82d302e0312f3736c5c4914e27250dab964fb5c5"
    const val OPENROUTER_CORPUS_SHA256: String =
        "b901d462e355e54b90ee2320bf7f18d0cb8edea857d5cdd8623d704f77a9eb47"
    const val OPENROUTER_EFFECTIVE_CONFIG_SHA256: String =
        "b679f33544b38bbad5dc928d836a1c32ee2cc2fb1b6a09539216d4cfce475c13"
    const val OPENROUTER_CONFIG_FILE_SHA256: String =
        "ce9a26ff29f1258f21735d3b9cc07012b91a82ec5942ecfefdc9da94b1ad0a2e"
    const val OPENROUTER_LOCK_FILE_SHA256: String =
        "c4ff5e5890388f3a0a578d244ddba6b45bf09b3b4c67087bdf3e7cc5edfce7a1"
    const val STREAMING_STRESS_CORPUS_SHA256: String =
        "dded4479630d80330121116f80bba85040ec52f0f85e5530691e40a5c7698dd5"
    const val STREAMING_STRESS_EFFECTIVE_CONFIG_SHA256: String =
        "ba6d17a24068ede752c2875b773a2d007209a20fe250ed207a774e9ac6ac5c77"
    const val STREAMING_STRESS_CONFIG_FILE_SHA256: String =
        "86d9109d162a38b72a5c5e04b1a488a7a3630246c34c3f6ca0888f68774b95c3"
    const val STREAMING_STRESS_LOCK_FILE_SHA256: String =
        "7e1d6f7463bf4845668f80450bd44f0db47a41a5d0344621f0db272be6814f7f"
    const val TOOLCHAIN_SHA256: String = "14524001f6ba12986dc3f7766d59080b82f8278f8c81abe7734fd1f0347cbb20"

    private val expectedCorpusDigests =
        mapOf(
            "github" to GITHUB_CORPUS_SHA256,
            "stripe" to STRIPE_CORPUS_SHA256,
            "openrouter" to OPENROUTER_CORPUS_SHA256,
            "stress-streaming" to STREAMING_STRESS_CORPUS_SHA256,
        )

    private val expectedConfigDigests =
        mapOf(
            "github" to GITHUB_EFFECTIVE_CONFIG_SHA256,
            "stripe" to STRIPE_EFFECTIVE_CONFIG_SHA256,
            "openrouter" to OPENROUTER_EFFECTIVE_CONFIG_SHA256,
            "stress-streaming" to STREAMING_STRESS_EFFECTIVE_CONFIG_SHA256,
        )

    private val expectedConfigFileDigests =
        mapOf(
            "github" to GITHUB_CONFIG_FILE_SHA256,
            "stripe" to STRIPE_CONFIG_FILE_SHA256,
            "openrouter" to OPENROUTER_CONFIG_FILE_SHA256,
            "stress-streaming" to STREAMING_STRESS_CONFIG_FILE_SHA256,
        )
    private val expectedLockFileDigests =
        mapOf(
            "github" to GITHUB_LOCK_FILE_SHA256,
            "stripe" to STRIPE_LOCK_FILE_SHA256,
            "openrouter" to OPENROUTER_LOCK_FILE_SHA256,
            "stress-streaming" to STREAMING_STRESS_LOCK_FILE_SHA256,
        )

    /**
     * The ordered per-file SHA-256s of each subject's configured overlays, in exact `sdkgen.yaml` application
     * order. The parity row digest binds the whole ordered set through [overlaySetDigest], so an audit-overlay
     * edit (or a reordering) can never escape parity input hashing.
     */
    private val expectedOverlayFileDigests =
        mapOf(
            "github" to listOf(GITHUB_OVERLAY_SHA256, GITHUB_AUDIT_OVERLAY_SHA256),
            "openrouter" to listOf(OPENROUTER_AUDIT_OVERLAY_SHA256, OPENROUTER_OVERLAY_SHA256),
        )

    private val expectedOverlayDigests =
        mapOf(
            "github" to requireNotNull(overlaySetDigest(expectedOverlayFileDigests.getValue("github"))),
            "openrouter" to requireNotNull(overlaySetDigest(expectedOverlayFileDigests.getValue("openrouter"))),
            "stress-streaming" to ABSENT_OVERLAY_SHA256,
        )

    /**
     * Canonical digest of an ordered overlay set: `null` for no overlays (callers substitute the explicit
     * absent-overlay marker), the file's own SHA-256 for a single overlay (identical to the pre-set-binding
     * value), and for several overlays the SHA-256 of the newline-joined per-file digests under a versioned
     * prefix — order-sensitive by construction.
     */
    fun overlaySetDigest(orderedFileShas: List<String>): String? =
        when (orderedFileShas.size) {
            0 -> {
                null
            }

            1 -> {
                orderedFileShas.single()
            }

            else -> {
                ("sdkgen:overlay-set:v1\n" + orderedFileShas.joinToString("\n", postfix = "\n"))
                    .toByteArray()
                    .sha256()
            }
        }

    fun expectedCorpusDigest(subject: String): String? = expectedCorpusDigests[subject]

    fun expectedConfigDigest(subject: String): String? = expectedConfigDigests[subject]

    fun expectedConfigFileDigest(subject: String): String? = expectedConfigFileDigests[subject]

    fun expectedLockFileDigest(subject: String): String? = expectedLockFileDigests[subject]

    fun expectedOverlayDigest(subject: String): String? = expectedOverlayDigests[subject]

    fun repositoryInputErrors(root: File): List<String> =
        buildList {
            checkSha(root, "conformance/github/openapi.yaml", GITHUB_CORPUS_SHA256)?.let(::add)
            checkSha(root, "conformance/stripe/openapi.json", STRIPE_CORPUS_SHA256)?.let(::add)
            checkSha(root, "conformance/openrouter/openapi.yaml", OPENROUTER_CORPUS_SHA256)?.let(::add)
            checkSha(
                root,
                "conformance/streaming-fixture/openapi.yaml",
                STREAMING_STRESS_CORPUS_SHA256,
            )?.let(::add)
            checkSha(root, "gradle/libs.versions.toml", TOOLCHAIN_SHA256)?.let(::add)
            checkSha(root, "conformance/github/sdkgen.yaml", GITHUB_CONFIG_FILE_SHA256)?.let(::add)
            checkSha(root, "conformance/github/sdkgen.lock", GITHUB_LOCK_FILE_SHA256)?.let(::add)
            checkSha(
                root,
                "conformance/github/overlays/code-search-runtime-semantics.yaml",
                GITHUB_OVERLAY_SHA256,
            )?.let(::add)
            checkSha(
                root,
                "conformance/github/overlays/allof-resolution-audit.yaml",
                GITHUB_AUDIT_OVERLAY_SHA256,
            )?.let(::add)
            checkSha(
                root,
                "conformance/openrouter/overlays/allof-resolution-audit.yaml",
                OPENROUTER_AUDIT_OVERLAY_SHA256,
            )?.let(::add)
            checkSha(
                root,
                "conformance/openrouter/overlays/full-spec-compat.yaml",
                OPENROUTER_OVERLAY_SHA256,
            )?.let(::add)
            checkSha(root, "conformance/openrouter/sdkgen.yaml", OPENROUTER_CONFIG_FILE_SHA256)?.let(::add)
            checkSha(root, "conformance/openrouter/sdkgen.lock", OPENROUTER_LOCK_FILE_SHA256)?.let(::add)
            checkSha(root, "conformance/stripe/sdkgen.yaml", STRIPE_CONFIG_FILE_SHA256)?.let(::add)
            checkSha(root, "conformance/stripe/sdkgen.lock", STRIPE_LOCK_FILE_SHA256)?.let(::add)
            checkSha(
                root,
                "conformance/streaming-fixture/sdkgen.yaml",
                STREAMING_STRESS_CONFIG_FILE_SHA256,
            )?.let(::add)
            checkSha(
                root,
                "conformance/streaming-fixture/sdkgen.lock",
                STREAMING_STRESS_LOCK_FILE_SHA256,
            )?.let(::add)
        }.sorted()

    fun currentCommitSha(root: File): String {
        val statusProcess =
            ProcessBuilder("git", "status", "--porcelain=v1", "--untracked-files=all")
                .directory(root)
                .redirectErrorStream(true)
                .start()
        val status =
            statusProcess.inputStream
                .bufferedReader()
                .readText()
                .trim()
        require(statusProcess.waitFor() == 0) {
            "Unable to inspect repository status before binding parity evidence: $status"
        }
        require(status.isEmpty()) {
            "Passed parity evidence requires a clean worktree; commit or remove these changes:\n$status"
        }

        val process =
            ProcessBuilder("git", "rev-parse", "HEAD")
                .directory(root)
                .redirectErrorStream(true)
                .start()
        val output =
            process.inputStream
                .bufferedReader()
                .readText()
                .trim()
        require(process.waitFor() == 0 && output.matches(Regex("[0-9a-f]{40}"))) {
            "Unable to resolve repository commit SHA: $output"
        }
        return output
    }

    private fun checkSha(
        root: File,
        relativePath: String,
        expected: String,
    ): String? {
        val file = root.resolve(relativePath)
        if (!file.isFile) return "Required parity input is missing: $relativePath"
        val actual = file.readBytes().sha256()
        return if (actual == expected) null else "Stale parity input $relativePath: expected $expected, actual $actual"
    }
}
