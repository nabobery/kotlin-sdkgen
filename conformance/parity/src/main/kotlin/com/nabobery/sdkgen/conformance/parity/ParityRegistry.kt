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
    const val GITHUB_LOCK_FILE_SHA256: String = "70fd5824ac03acde1d887716236c8104c62feb39cb63c715adbf53fe5ec584a1"
    const val GITHUB_OVERLAY_SHA256: String = "4bb4eb28ee5b424cea50c9ea92047ed35e49282273800ab7e1ab4cd83b083288"
    const val GITHUB_AUDIT_OVERLAY_SHA256: String =
        "3f190ddaa20e9b0ca074e6c82b61d7ff1911df25586cc1f1ffa38a18b35e78f3"
    const val OPENROUTER_AUDIT_OVERLAY_SHA256: String =
        "f8bc7a924cf9bc0af7ac54abc8a933037d0c30631b7bf690884ba3dfcd5cb6d0"
    const val STRIPE_CONFIG_FILE_SHA256: String = "71928294e15d61a94b623cc4aa740616ad755d0be1b97539f5e363aaeb9e8407"
    const val STRIPE_LOCK_FILE_SHA256: String = "dbe826b61dfbc9124e8719ff5298816d9304e25fc14c78637da7cb54f4f74855"
    const val OPENROUTER_OVERLAY_SHA256: String =
        "798d9e434ff3d7e3334cae329192d1e9f7eafbb5e69f8cb3182df41d6441cfa0"
    const val OPENROUTER_CORPUS_SHA256: String =
        "b901d462e355e54b90ee2320bf7f18d0cb8edea857d5cdd8623d704f77a9eb47"
    const val OPENROUTER_EFFECTIVE_CONFIG_SHA256: String =
        "473455561080a53bc4850ce148a9449d68ceb17a56013adaf6e3194e3990682a"
    const val OPENROUTER_CONFIG_FILE_SHA256: String =
        "07d5dcea6ed808bf585ca3665c8c2979bc551b86a4768ce3124201284230a332"
    const val OPENROUTER_LOCK_FILE_SHA256: String =
        "e3d8b5c0f83181619615c430ff593fce09e6bee29f67a23cbbb966b0eafd3326"
    const val STREAMING_STRESS_CORPUS_SHA256: String =
        "e82c9040600b8c744cd35869ffe26aab1554136ab352da7686b92b3560ff075f"
    const val STREAMING_STRESS_EFFECTIVE_CONFIG_SHA256: String =
        "efe5aeb43ada0b4f91d399c307432c56640a411d15283b5b7b84fb767d5303c5"
    const val STREAMING_STRESS_CONFIG_FILE_SHA256: String =
        "2e13917ab8e62b54fcf3b24ac4bf9f599a3c08037796c586f0448d808786d6ea"
    const val STREAMING_STRESS_LOCK_FILE_SHA256: String =
        "70393997b71973c281b5f2cdc2e68993841547e1463724274a02f184fd635c7c"
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
