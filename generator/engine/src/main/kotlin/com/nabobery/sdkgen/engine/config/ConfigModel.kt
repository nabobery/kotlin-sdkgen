package com.nabobery.sdkgen.engine.config

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The `sdkgen.yaml`/`sdkgen.json` `v1alpha1` configuration contract. [ConfigVersion.V1_ALPHA_1] is
 * the only supported version; [com.nabobery.sdkgen.engine.config.ConfigLoader] rejects any other
 * discriminator value before this type is even constructed. Every field with a default value is
 * part of the contract too — [ConfigDigest] hashes the fully-defaulted value, so two config files
 * that differ only in whether a default-valued field was written explicitly digest identically.
 */
@Serializable
public data class SdkgenConfigV1Alpha1(
    public val version: ConfigVersion,
    public val source: SourceConfig,
    public val overlays: List<OverlayConfig> = emptyList(),
    public val compatibilityProfiles: List<CompatibilityProfileConfig> = emptyList(),
    public val kotlin: KotlinGenerationConfig,
    public val runtime: RuntimeDefaults = RuntimeDefaults(),
    public val rules: List<RuleConfig> = emptyList(),
    public val plugins: List<PluginConfig> = emptyList(),
    public val output: OutputConfig,
    public val diagnostics: DiagnosticsConfig = DiagnosticsConfig(),
    public val verification: VerificationConfig = VerificationConfig(),
    public val acceptedWaivers: List<AcceptedWaiverConfig> = emptyList(),
) {
    /** Retains the pre-waiver JVM constructor descriptor for already-compiled consumers. */
    public constructor(
        version: ConfigVersion,
        source: SourceConfig,
        overlays: List<OverlayConfig>,
        compatibilityProfiles: List<CompatibilityProfileConfig>,
        kotlin: KotlinGenerationConfig,
        runtime: RuntimeDefaults,
        rules: List<RuleConfig>,
        plugins: List<PluginConfig>,
        output: OutputConfig,
        diagnostics: DiagnosticsConfig,
        verification: VerificationConfig,
    ) : this(
        version,
        source,
        overlays,
        compatibilityProfiles,
        kotlin,
        runtime,
        rules,
        plugins,
        output,
        diagnostics,
        verification,
        emptyList(),
    )

    /** Retains the waiver-era JVM constructor descriptor for already-compiled consumers. */
    public constructor(
        waiverEraVersion: ConfigVersion,
        waiverEraSource: SourceConfig,
        waiverEraOverlays: List<OverlayConfig>,
        waiverEraCompatibilityProfiles: List<CompatibilityProfileConfig>,
        waiverEraKotlin: KotlinGenerationConfig,
        waiverEraRuntime: RuntimeDefaults,
        waiverEraRules: List<RuleConfig>,
        waiverEraPlugins: List<PluginConfig>,
        waiverEraAcceptedWaivers: List<AcceptedWaiverConfig>,
        waiverEraOutput: OutputConfig,
        waiverEraDiagnostics: DiagnosticsConfig,
        waiverEraVerification: VerificationConfig,
    ) : this(
        version = waiverEraVersion,
        source = waiverEraSource,
        overlays = waiverEraOverlays,
        compatibilityProfiles = waiverEraCompatibilityProfiles,
        kotlin = waiverEraKotlin,
        runtime = waiverEraRuntime,
        rules = waiverEraRules,
        plugins = waiverEraPlugins,
        output = waiverEraOutput,
        diagnostics = waiverEraDiagnostics,
        verification = waiverEraVerification,
        acceptedWaivers = waiverEraAcceptedWaivers,
    )
}

@Serializable
public enum class ConfigVersion {
    @SerialName("v1alpha1")
    V1_ALPHA_1,
}

/** [sha256], if set, pins the expected digest of the resolved root document; a mismatch refuses generation. */
@Serializable
public data class SourceConfig(
    public val uri: String,
    public val sha256: String? = null,
    public val acquisition: AcquisitionPolicy = AcquisitionPolicy(),
)

/**
 * Phase 1 supports [AcquisitionMode.LOCAL] only; [AcquisitionMode.HTTPS] is accepted by the schema
 * for forward compatibility but not yet implemented. [allowedLocalRoots] are additional filesystem
 * roots (beyond the config file's own directory) that referenced documents may be staged from —
 * without an entry here, a reference that escapes the root document's directory is refused.
 */
@Serializable
public data class AcquisitionPolicy(
    public val mode: AcquisitionMode = AcquisitionMode.LOCAL,
    public val offline: Boolean = false,
    public val allowedHosts: List<String> = emptyList(),
    public val followRedirects: Boolean = false,
    public val maxRedirects: Int = 0,
    public val maxBytes: Long = 20L * 1024L * 1024L,
    public val timeoutSeconds: Int = 30,
    public val cacheDirectory: String = ".sdkgen/cache",
    public val allowedLocalRoots: List<String> = emptyList(),
)

@Serializable
public enum class AcquisitionMode {
    @SerialName("local")
    LOCAL,

    @SerialName("https")
    HTTPS,
}

/** Overlays apply in list order; [id] must be unique and is what a lock file keys on for drift detection. */
@Serializable
public data class OverlayConfig(
    public val id: String,
    public val uri: String,
    public val sha256: String? = null,
    public val zeroMatchPolicy: ZeroMatchPolicy = ZeroMatchPolicy.FAIL,
    public val conflictPolicy: OverlayConflictPolicy = OverlayConflictPolicy.FAIL,
)

/** Whether an overlay action whose JSONPath target matches nothing in the source document is an error ([FAIL]) or a no-op ([ALLOW]). */
@Serializable
public enum class ZeroMatchPolicy {
    @SerialName("fail")
    FAIL,

    @SerialName("allow")
    ALLOW,
}

/** Whether two overlay actions targeting the same location is an error ([FAIL]) or resolved by applying them in list order ([LAST_WINS]). */
@Serializable
public enum class OverlayConflictPolicy {
    @SerialName("fail")
    FAIL,

    @SerialName("last-wins")
    LAST_WINS,
}

@Serializable
public data class CompatibilityProfileConfig(
    public val id: String,
    public val version: String,
)

@Serializable
public data class KotlinGenerationConfig(
    public val packageName: String,
    public val coordinates: PackageCoordinates,
    public val naming: NamingConfig,
    public val targets: List<TargetFamily>,
)

@Serializable
public data class PackageCoordinates(
    public val groupId: String,
    public val artifactId: String,
)

@Serializable
public data class NamingConfig(
    public val clientName: String,
    public val modelPrefix: String? = null,
    public val operationPrefix: String? = null,
)

@Serializable
public enum class TargetFamily {
    @SerialName("jvm")
    JVM,

    @SerialName("android")
    ANDROID,

    @SerialName("ios")
    IOS,

    @SerialName("macos")
    MACOS,

    @SerialName("js")
    JS,

    @SerialName("linux")
    LINUX,

    @SerialName("windows")
    WINDOWS,
}

@Serializable
public data class RuntimeDefaults(
    public val requestTimeoutMillis: Long = 60_000,
    public val retries: RetryDefaults = RetryDefaults(),
    public val userAgentSuffix: String? = null,
    public val defaultServer: String? = null,
)

@Serializable
public data class RetryDefaults(
    public val maxAttempts: Int = 1,
    public val initialDelayMillis: Long = 250,
    public val maxDelayMillis: Long = 5_000,
    public val jitterRatio: Double = 0.2,
)

@Serializable
public data class RuleConfig(
    public val id: String,
    public val enabled: Boolean = true,
    public val severity: DiagnosticSeverity = DiagnosticSeverity.ERROR,
)

@Serializable
public data class PluginConfig(
    public val id: String,
    public val version: String,
    public val spiRange: String,
    public val enabled: Boolean = true,
    public val config: Map<String, String> = emptyMap(),
)

/** Paths are relative to the config file's own directory, not the process working directory. */
@Serializable
public data class AcceptedWaiverConfig(
    public val id: String,
    public val category: String,
    public val match: WaiverMatchConfig,
    public val rationale: String,
    public val owner: String,
    public val disposition: WaiverDisposition,
)

@Serializable
public data class WaiverMatchConfig(
    public val kind: WaivedSymbolKind,
    public val symbolId: String,
    public val diagnosticCode: String,
    public val documentUri: String,
    public val jsonPointer: String,
    public val reasonSha256: String,
)

@Serializable
public enum class WaivedSymbolKind {
    @SerialName("schema")
    SCHEMA,

    @SerialName("operation")
    OPERATION,
}

@Serializable
public enum class WaiverDisposition {
    @SerialName("omit")
    OMIT,
}

@Serializable
public data class OutputConfig(
    public val sources: String,
    public val resources: String,
    public val manifest: String,
    public val lock: String = "sdkgen.lock",
    public val checkedInSources: Boolean = false,
)

@Serializable
public data class DiagnosticsConfig(
    public val warningsAsErrors: Boolean = false,
    public val warningAllowlist: List<String> = emptyList(),
    public val format: DiagnosticFormat = DiagnosticFormat.HUMAN,
)

@Serializable
public enum class DiagnosticFormat {
    @SerialName("human")
    HUMAN,

    @SerialName("json")
    JSON,

    @SerialName("both")
    BOTH,
}

@Serializable
public data class VerificationConfig(
    public val gates: List<VerificationGate> = listOf(VerificationGate.SCHEMA, VerificationGate.COMPILE),
)

@Serializable
public enum class VerificationGate {
    @SerialName("schema")
    SCHEMA,

    @SerialName("compile")
    COMPILE,

    @SerialName("determinism")
    DETERMINISM,

    @SerialName("api")
    API,
}
