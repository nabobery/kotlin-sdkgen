package com.nabobery.sdkgen.engine.config

internal object TestFixtures {
    fun text(path: String): String =
        requireNotNull(javaClass.getResource(path)) { "Missing test resource $path" }.readText()

    val config: SdkgenConfigV1Alpha1 by lazy {
        ConfigLoader.decodeYaml(text("/fixtures/sdkgen.yaml"), "sdkgen.yaml")
    }

    fun lock(config: SdkgenConfigV1Alpha1 = this.config): SdkgenLockV1Alpha1 =
        SdkgenLockV1Alpha1(
            configDigest = ConfigDigest.sha256(config),
            source =
                LockedSource(
                    canonicalUri = "file:///workspace/openapi/openapi.yaml",
                    sha256 = "a".repeat(64),
                    contentLength = 42,
                    references =
                        listOf(
                            LockedReference(
                                canonicalUri = "file:///workspace/openapi/components.yaml",
                                sha256 = "c".repeat(64),
                                contentLength = 21,
                            ),
                        ),
                ),
            overlays =
                listOf(
                    LockedOverlay(
                        id = "compatibility",
                        canonicalUri = "file:///workspace/openapi/overlays/compatibility.yaml",
                        sha256 = "b".repeat(64),
                    ),
                ),
            generator = LockedGenerator(version = "0.1.0", edition = "2026.1"),
            compatibilityProfiles = listOf(LockedCompatibilityProfile("openapi-3.0-nullable", "1")),
            plugins =
                listOf(
                    LockedPlugin(
                        id = "com.nabobery.sdkgen.builtin.openrouter",
                        version = "0.1.0",
                        spiRange = ">=0.1 <0.2",
                        configSha256 = ConfigDigest.sha256(config.plugins.single().config),
                    ),
                ),
            tools = listOf(LockedTool(id = "ktlint", version = "1.8.0")),
        )

    fun resolvedInputs(): ResolvedInputs =
        ResolvedInputs(
            source =
                ResolvedInput(
                    canonicalUri = "file:///workspace/openapi/openapi.yaml",
                    sha256 = "a".repeat(64),
                    contentLength = 42,
                ),
            references =
                listOf(
                    ResolvedInput(
                        canonicalUri = "file:///workspace/openapi/components.yaml",
                        sha256 = "c".repeat(64),
                        contentLength = 21,
                    ),
                ),
            overlays =
                listOf(
                    ResolvedOverlay(
                        id = "compatibility",
                        canonicalUri = "file:///workspace/openapi/overlays/compatibility.yaml",
                        sha256 = "b".repeat(64),
                    ),
                ),
        )
}
