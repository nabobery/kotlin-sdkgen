package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineReportingReportRunResultXb663d9c3Branch {
    File,
}

public sealed class InlineReportingReportRunResultXb663d9c3DecodingException(
    message: String,
) : SerializationException(message)

public class InlineReportingReportRunResultXb663d9c3NoMatchException(
    message: String,
) : InlineReportingReportRunResultXb663d9c3DecodingException(message)

internal data class InlineReportingReportRunResultXb663d9c3Inspection(
    public val matchesFile: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesFile).count { it }
}

/**
 * The file object representing the result of the report run (populated when
 * `status=succeeded`).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/reporting.report_run/properties/result
 */
@Serializable(with = InlineReportingReportRunResultXb663d9c3.Serializer::class)
public class InlineReportingReportRunResultXb663d9c3 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineReportingReportRunResultXb663d9c3Inspection,
) {
    public val `file`: FileView? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesFile) json.decodeFromJsonElement<FileView>(raw) else null }

    public val matchedBranches: Set<InlineReportingReportRunResultXb663d9c3Branch>
        get() =
            buildSet {
                if (inspection.matchesFile) add(InlineReportingReportRunResultXb663d9c3Branch.File)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineReportingReportRunResultXb663d9c3 {
            val inspection = inspectInlineReportingReportRunResultXb663d9c3(raw)
            if (inspection.matchCount == 0) {
                throw InlineReportingReportRunResultXb663d9c3NoMatchException(
                    "InlineReportingReportRunResultXb663d9c3 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineReportingReportRunResultXb663d9c3(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineReportingReportRunResultXb663d9c3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineReportingReportRunResultXb663d9c3 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineReportingReportRunResultXb663d9c3")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineReportingReportRunResultXb663d9c3,
        ) {
            encoder.requireJsonEncoder("InlineReportingReportRunResultXb663d9c3").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineReportingReportRunResultXb663d9c3(
    element: JsonElement,
): InlineReportingReportRunResultXb663d9c3Inspection {
    val raw =
        element as? JsonObject ?: return InlineReportingReportRunResultXb663d9c3Inspection(
            matchesFile = false,
            failures = listOf("File: expected JSON object"),
        )
    val matchesFile =
        raw["created"] != null && raw["id"].isString() && raw["object"] != null && raw["purpose"] != null &&
            raw["size"] != null
    return InlineReportingReportRunResultXb663d9c3Inspection(
        matchesFile = matchesFile,
        failures =
            buildList {
                if (!matchesFile) {
                    add(
                        "File: required properties 'created', 'id', 'object', 'purpose', 'size' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
