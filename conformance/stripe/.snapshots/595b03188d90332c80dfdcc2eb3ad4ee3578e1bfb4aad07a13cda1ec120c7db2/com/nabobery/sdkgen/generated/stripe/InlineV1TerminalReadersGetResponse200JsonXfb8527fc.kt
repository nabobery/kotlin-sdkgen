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

public enum class InlineV1TerminalReadersGetResponse200JsonXfb8527fcBranch {
    TerminalReader,
    DeletedTerminalReader,
}

public sealed class InlineV1TerminalReadersGetResponse200JsonXfb8527fcDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TerminalReadersGetResponse200JsonXfb8527fcNoMatchException(
    message: String,
) : InlineV1TerminalReadersGetResponse200JsonXfb8527fcDecodingException(message)

internal data class InlineV1TerminalReadersGetResponse200JsonXfb8527fcInspection(
    public val matchesTerminalReader: Boolean,
    public val matchesDeletedTerminalReader: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesTerminalReader, matchesDeletedTerminalReader).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}/get/responses/200/content/application~1json/sch
 * ema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}/get/responses/200/content/application~1json/sch
 * ema
 */
@Serializable(with = InlineV1TerminalReadersGetResponse200JsonXfb8527fc.Serializer::class)
public class InlineV1TerminalReadersGetResponse200JsonXfb8527fc internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TerminalReadersGetResponse200JsonXfb8527fcInspection,
) {
    public val terminalReader: TerminalReaderView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesTerminalReader) json.decodeFromJsonElement<TerminalReaderView>(raw) else null
        }

    public val deletedTerminalReader: DeletedTerminalReaderView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesDeletedTerminalReader) {
                json.decodeFromJsonElement<DeletedTerminalReaderView>(
                    raw,
                )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1TerminalReadersGetResponse200JsonXfb8527fcBranch>
        get() =
            buildSet {
                if (inspection.matchesTerminalReader) {
                    add(
                        InlineV1TerminalReadersGetResponse200JsonXfb8527fcBranch.TerminalReader,
                    )
                }
                if (inspection.matchesDeletedTerminalReader) {
                    add(
                        InlineV1TerminalReadersGetResponse200JsonXfb8527fcBranch.DeletedTerminalReader,
                    )
                }
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineV1TerminalReadersGetResponse200JsonXfb8527fc {
            val inspection = inspectInlineV1TerminalReadersGetResponse200JsonXfb8527fc(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TerminalReadersGetResponse200JsonXfb8527fcNoMatchException(
                    "InlineV1TerminalReadersGetResponse200JsonXfb8527fc matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TerminalReadersGetResponse200JsonXfb8527fc(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TerminalReadersGetResponse200JsonXfb8527fc> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TerminalReadersGetResponse200JsonXfb8527fc {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalReadersGetResponse200JsonXfb8527fc")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TerminalReadersGetResponse200JsonXfb8527fc,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TerminalReadersGetResponse200JsonXfb8527fc",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TerminalReadersGetResponse200JsonXfb8527fc(
    element: JsonElement,
): InlineV1TerminalReadersGetResponse200JsonXfb8527fcInspection {
    val raw =
        element as? JsonObject ?: return InlineV1TerminalReadersGetResponse200JsonXfb8527fcInspection(
            matchesTerminalReader = false,
            matchesDeletedTerminalReader = false,
            failures = listOf("TerminalReader: expected JSON object", "DeletedTerminalReader: expected JSON object"),
        )
    val matchesTerminalReader =
        raw["device_type"] != null && raw["id"].isString() && raw["label"].isString() && raw["livemode"] != null &&
            raw["metadata"] != null &&
            raw["object"] != null &&
            raw["serial_number"].isString()
    val matchesDeletedTerminalReader =
        raw["deleted"] != null && raw["device_type"] != null && raw["id"].isString() && raw["object"] != null &&
            raw["serial_number"].isString()
    return InlineV1TerminalReadersGetResponse200JsonXfb8527fcInspection(
        matchesTerminalReader = matchesTerminalReader,
        matchesDeletedTerminalReader = matchesDeletedTerminalReader,
        failures =
            buildList {
                if (!matchesTerminalReader) {
                    add(
                        "TerminalReader: required properties 'device_type', 'id', 'label', 'livemode', 'metadata', 'object', 'serial_number' do not match their declared types",
                    )
                }
                if (!matchesDeletedTerminalReader) {
                    add(
                        "DeletedTerminalReader: required properties 'deleted', 'device_type', 'id', 'object', 'serial_number' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
