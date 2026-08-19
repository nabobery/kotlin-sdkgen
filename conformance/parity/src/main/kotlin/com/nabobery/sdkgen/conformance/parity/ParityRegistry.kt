package com.nabobery.sdkgen.conformance.parity

import java.io.File

internal object ParityRegistry {
    const val GITHUB_CORPUS_SHA256: String = "350102b39f8575f9ef0eb7db96fc2f80f5cbfefbfbaf64d243bc696348d00b63"
    const val GITHUB_EFFECTIVE_CONFIG_SHA256: String =
        "d06b28d6d4a751f780ff38119ce361bb0aac623c69d16bd11980b883573b7c49"
    const val STRIPE_CORPUS_SHA256: String = "e24a26de4188fd64dec4c043d5d3726277fdcb07556a493ea481c305b0a223d8"
    const val STRIPE_EFFECTIVE_CONFIG_SHA256: String =
        "09c792d932d37ad2f6db6b761977fa2d754e1a3fa78dccabbe3532c1ed4a9918"
    const val GITHUB_CONFIG_FILE_SHA256: String = "d285a8579aa5defae335b0207f4c5aecfe312cf4034c3dbaac2d916ee134d1de"
    const val GITHUB_LOCK_FILE_SHA256: String = "0a43bce30f2756618be7cb7608d721d8e820967d65de57ad29231f346da00462"
    const val GITHUB_OVERLAY_SHA256: String = "4bb4eb28ee5b424cea50c9ea92047ed35e49282273800ab7e1ab4cd83b083288"
    const val STRIPE_CONFIG_FILE_SHA256: String = "71928294e15d61a94b623cc4aa740616ad755d0be1b97539f5e363aaeb9e8407"
    const val STRIPE_LOCK_FILE_SHA256: String = "52457ea9e6b03bcbb4b3d2612a179244d96c760c880c2e770c2a9ea854ecce1b"
    const val OPENROUTER_OVERLAY_SHA256: String =
        "f6f1916254474e974484ab516e3cd29f81902783f617a48f3034652b6628f8c2"
    const val OPENROUTER_CORPUS_SHA256: String =
        "b901d462e355e54b90ee2320bf7f18d0cb8edea857d5cdd8623d704f77a9eb47"
    const val OPENROUTER_EFFECTIVE_CONFIG_SHA256: String =
        "4c2395b17adf82080ab66a7f833880f76c7f58fae4397eafdf226386c57901a1"
    const val OPENROUTER_CONFIG_FILE_SHA256: String =
        "82e71e0acfba994b20c63f86ba758dbc9f77b6c65ae6e579b1583212eaedf2c3"
    const val OPENROUTER_LOCK_FILE_SHA256: String =
        "c91abda228837b2925cda9562f0e56a138d2ac3a47f677e6dd42e09f53c97da1"
    const val STREAMING_STRESS_CORPUS_SHA256: String =
        "dded4479630d80330121116f80bba85040ec52f0f85e5530691e40a5c7698dd5"
    const val STREAMING_STRESS_EFFECTIVE_CONFIG_SHA256: String =
        "ba6d17a24068ede752c2875b773a2d007209a20fe250ed207a774e9ac6ac5c77"
    const val STREAMING_STRESS_CONFIG_FILE_SHA256: String =
        "86d9109d162a38b72a5c5e04b1a488a7a3630246c34c3f6ca0888f68774b95c3"
    const val STREAMING_STRESS_LOCK_FILE_SHA256: String =
        "5c51196d1ebeee98d0f86f7719833b7ea466048c2cafb040d72cfd6937fd304b"
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
    private val expectedOverlayDigests =
        mapOf(
            "github" to GITHUB_OVERLAY_SHA256,
            "openrouter" to OPENROUTER_OVERLAY_SHA256,
            "stress-streaming" to ABSENT_OVERLAY_SHA256,
        )

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
