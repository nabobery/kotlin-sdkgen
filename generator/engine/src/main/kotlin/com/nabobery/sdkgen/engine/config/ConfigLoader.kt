package com.nabobery.sdkgen.engine.config

import com.charleskorn.kaml.UnknownPropertyException
import com.charleskorn.kaml.Yaml
import com.charleskorn.kaml.YamlConfiguration
import com.charleskorn.kaml.YamlException
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonDecodingException

internal object ConfigFormats {
    internal val json: Json =
        Json {
            encodeDefaults = true
            explicitNulls = true
            ignoreUnknownKeys = false
        }

    internal val versionJson: Json =
        Json {
            ignoreUnknownKeys = true
        }

    internal val yaml: Yaml =
        Yaml(
            configuration = YamlConfiguration(strictMode = true),
        )

    internal val versionYaml: Yaml =
        Yaml(
            configuration = YamlConfiguration(strictMode = false),
        )
}

@OptIn(kotlinx.serialization.ExperimentalSerializationApi::class)
public object ConfigLoader {
    public fun decodeYaml(
        text: String,
        file: String,
    ): SdkgenConfigV1Alpha1 {
        requireSupportedVersion(readYamlVersion(text, file), file)
        return try {
            ConfigFormats.yaml
                .decodeFromString(SdkgenConfigV1Alpha1.serializer(), text)
                .also { config -> ConfigValidator.validate(config, file) }
        } catch (error: UnknownPropertyException) {
            throw ConfigDecodeException(
                diagnostic =
                    unknownFieldDiagnostic(
                        file = file,
                        path = yamlPath(error.path.toHumanReadableString()),
                        field = error.propertyName,
                        line = error.line,
                        column = error.column,
                    ),
                cause = error,
            )
        } catch (error: YamlException) {
            val unknown = error.findCause<UnknownPropertyException>()
            val diagnostic =
                if (unknown == null) {
                    decodeDiagnostic(
                        file = file,
                        path = yamlPath(error.path.toHumanReadableString()),
                        line = error.line,
                        column = error.column,
                        message = error.message,
                    )
                } else {
                    unknownFieldDiagnostic(
                        file = file,
                        path = yamlPath(unknown.path.toHumanReadableString()),
                        field = unknown.propertyName,
                        line = unknown.line,
                        column = unknown.column,
                    )
                }
            throw ConfigDecodeException(diagnostic = diagnostic, cause = error)
        } catch (error: SerializationException) {
            throw ConfigDecodeException(decodeDiagnostic(file, "$", message = error.message.orEmpty()), error)
        }
    }

    public fun decodeJson(
        text: String,
        file: String,
    ): SdkgenConfigV1Alpha1 {
        requireSupportedVersion(readJsonVersion(text, file), file)
        return try {
            ConfigFormats.json
                .decodeFromString(SdkgenConfigV1Alpha1.serializer(), text)
                .also { config -> ConfigValidator.validate(config, file) }
        } catch (error: JsonDecodingException) {
            val unknown = unknownJsonField(error.message.orEmpty())
            val diagnostic =
                if (unknown == null) {
                    decodeDiagnostic(file, jsonPath(error.message.orEmpty()), message = error.message.orEmpty())
                } else {
                    unknownFieldDiagnostic(file, unknown.path, unknown.field)
                }
            throw ConfigDecodeException(diagnostic, error)
        } catch (error: SerializationException) {
            throw ConfigDecodeException(decodeDiagnostic(file, "$", message = error.message.orEmpty()), error)
        }
    }

    private fun readYamlVersion(
        text: String,
        file: String,
    ): String? =
        try {
            ConfigFormats.versionYaml.decodeFromString(VersionEnvelope.serializer(), text).version
        } catch (error: YamlException) {
            throw ConfigDecodeException(
                decodeDiagnostic(
                    file = file,
                    path = yamlPath(error.path.toHumanReadableString()),
                    line = error.line,
                    column = error.column,
                    message = error.message,
                ),
                error,
            )
        }

    private fun readJsonVersion(
        text: String,
        file: String,
    ): String? =
        try {
            ConfigFormats.versionJson.decodeFromString(VersionEnvelope.serializer(), text).version
        } catch (error: SerializationException) {
            throw ConfigDecodeException(
                decodeDiagnostic(file, jsonPath(error.message.orEmpty()), message = error.message.orEmpty()),
                error,
            )
        }

    private fun requireSupportedVersion(
        version: String?,
        file: String,
    ) {
        if (version == null) {
            throw MissingConfigVersionException(
                Diagnostic(
                    code = "SDKGEN-CONFIG-VERSION-MISSING",
                    severity = DiagnosticSeverity.ERROR,
                    path = DiagnosticPath(file, "$.version"),
                    phase = DiagnosticPhase.CONFIGURATION,
                    message = "The required configuration version discriminator is missing.",
                    remediation = "Add 'version: v1alpha1' at the document root.",
                ),
            )
        }
        if (version != "v1alpha1") {
            throw UnsupportedConfigVersionException(
                actualVersion = version,
                diagnostic =
                    Diagnostic(
                        code = "SDKGEN-CONFIG-VERSION-UNSUPPORTED",
                        severity = DiagnosticSeverity.ERROR,
                        path = DiagnosticPath(file, "$.version"),
                        phase = DiagnosticPhase.CONFIGURATION,
                        message = "Unsupported SDKGen configuration version '$version'.",
                        remediation = "Use version 'v1alpha1' or run the migration command for a supported version.",
                    ),
            )
        }
    }

    private fun unknownFieldDiagnostic(
        file: String,
        path: String,
        field: String,
        line: Int? = null,
        column: Int? = null,
    ): Diagnostic =
        Diagnostic(
            code = "SDKGEN-CONFIG-UNKNOWN-FIELD",
            severity = DiagnosticSeverity.ERROR,
            path = DiagnosticPath(file, path, line, column),
            phase = DiagnosticPhase.CONFIGURATION,
            message = "Unknown SDKGen configuration field '$field'.",
            remediation = "Remove '$field' or migrate it to a field defined by the v1alpha1 schema.",
        )

    private fun decodeDiagnostic(
        file: String,
        path: String,
        line: Int? = null,
        column: Int? = null,
        message: String,
    ): Diagnostic =
        Diagnostic(
            code = "SDKGEN-CONFIG-DECODE-FAILED",
            severity = DiagnosticSeverity.ERROR,
            path = DiagnosticPath(file, path, line, column),
            phase = DiagnosticPhase.CONFIGURATION,
            message = message.ifBlank { "The configuration could not be decoded." },
            remediation = "Correct the value at the reported path using the published v1alpha1 schema.",
        )

    private fun yamlPath(path: String): String = if (path == "<root>") "$" else "$.$path"

    private fun jsonPath(message: String): String =
        JSON_PATH
            .find(message)
            ?.groupValues
            ?.get(1)
            ?.trimEnd('.') ?: "$"

    private fun unknownJsonField(message: String): UnknownJsonField? {
        val field = UNKNOWN_JSON_KEY.find(message)?.groupValues?.get(1) ?: return null
        val parent = jsonPath(message)
        val path =
            when {
                parent == "$" -> "$.$field"
                parent.endsWith(".$field") -> parent
                else -> "$parent.$field"
            }
        return UnknownJsonField(field, path)
    }

    @Serializable
    private data class VersionEnvelope(
        val version: String? = null,
    )

    private data class UnknownJsonField(
        val field: String,
        val path: String,
    )

    private val UNKNOWN_JSON_KEY = Regex("unknown key '([^']+)'")
    private val JSON_PATH = Regex("path: (\\$[^\\n]+)")
}

private inline fun <reified T : Throwable> Throwable.findCause(): T? {
    var current: Throwable? = this
    while (current != null) {
        if (current is T) return current
        current = current.cause
    }
    return null
}
