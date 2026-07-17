package com.nabobery.sdkgen.engine.config

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class Diagnostic(
    public val code: String,
    public val severity: DiagnosticSeverity,
    public val path: DiagnosticPath,
    public val phase: DiagnosticPhase,
    public val message: String,
    public val remediation: String,
)

@Serializable
public data class DiagnosticPath(
    public val file: String,
    public val yamlPath: String,
    public val line: Int? = null,
    public val column: Int? = null,
)

@Serializable
public enum class DiagnosticSeverity {
    @SerialName("info")
    INFO,

    @SerialName("warning")
    WARNING,

    @SerialName("error")
    ERROR,
}

@Serializable
public enum class DiagnosticPhase {
    @SerialName("configuration")
    CONFIGURATION,

    @SerialName("acquisition")
    ACQUISITION,

    @SerialName("lock")
    LOCK,

    @SerialName("verification")
    VERIFICATION,
}

public sealed class ConfigContractException(
    public open val diagnostic: Diagnostic,
    cause: Throwable? = null,
) : RuntimeException(diagnostic.message, cause)

public class MissingConfigVersionException(
    public override val diagnostic: Diagnostic,
) : ConfigContractException(diagnostic)

public class UnsupportedConfigVersionException(
    public val actualVersion: String,
    public override val diagnostic: Diagnostic,
) : ConfigContractException(diagnostic)

public class ConfigDecodeException(
    public override val diagnostic: Diagnostic,
    cause: Throwable? = null,
) : ConfigContractException(diagnostic, cause)

public class ConfigValidationException(
    public override val diagnostic: Diagnostic,
) : ConfigContractException(diagnostic)

public class AcquisitionException(
    public override val diagnostic: Diagnostic,
    cause: Throwable? = null,
) : ConfigContractException(diagnostic, cause)

public sealed class LockContractException(
    public open val diagnostic: Diagnostic,
    cause: Throwable? = null,
) : RuntimeException(diagnostic.message, cause)

public class LockDecodeException(
    public override val diagnostic: Diagnostic,
    cause: Throwable,
) : LockContractException(diagnostic, cause)

public class MissingLockVersionException(
    public override val diagnostic: Diagnostic,
) : LockContractException(diagnostic)

public class UnsupportedLockVersionException(
    public val actualVersion: String,
    public override val diagnostic: Diagnostic,
) : LockContractException(diagnostic)
