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

public enum class InlineTerminalReaderActionXc2e18526Branch {
    TerminalReaderReaderResourceReaderAction,
}

public sealed class InlineTerminalReaderActionXc2e18526DecodingException(
    message: String,
) : SerializationException(message)

public class InlineTerminalReaderActionXc2e18526NoMatchException(
    message: String,
) : InlineTerminalReaderActionXc2e18526DecodingException(message)

internal data class InlineTerminalReaderActionXc2e18526Inspection(
    public val matchesTerminalReaderReaderResourceReaderAction: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesTerminalReaderReaderResourceReaderAction).count { it }
}

/**
 * The most recent action performed by the reader.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal.reader/properties/action
 */
@Serializable(with = InlineTerminalReaderActionXc2e18526.Serializer::class)
public class InlineTerminalReaderActionXc2e18526 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineTerminalReaderActionXc2e18526Inspection,
) {
    public val terminalReaderReaderResourceReaderAction: TerminalReaderReaderResourceReaderActionView?
        by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesTerminalReaderReaderResourceReaderAction) {
                json
                    .decodeFromJsonElement<TerminalReaderReaderResourceReaderActionView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineTerminalReaderActionXc2e18526Branch>
        get() =
            buildSet {
                if (inspection.matchesTerminalReaderReaderResourceReaderAction) {
                    add(
                        InlineTerminalReaderActionXc2e18526Branch.TerminalReaderReaderResourceReaderAction,
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
        ): InlineTerminalReaderActionXc2e18526 {
            val inspection = inspectInlineTerminalReaderActionXc2e18526(raw)
            if (inspection.matchCount == 0) {
                throw InlineTerminalReaderActionXc2e18526NoMatchException(
                    "InlineTerminalReaderActionXc2e18526 matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineTerminalReaderActionXc2e18526(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineTerminalReaderActionXc2e18526> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineTerminalReaderActionXc2e18526 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineTerminalReaderActionXc2e18526")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTerminalReaderActionXc2e18526,
        ) {
            encoder.requireJsonEncoder("InlineTerminalReaderActionXc2e18526").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineTerminalReaderActionXc2e18526(
    element: JsonElement,
): InlineTerminalReaderActionXc2e18526Inspection {
    val raw =
        element as? JsonObject ?: return InlineTerminalReaderActionXc2e18526Inspection(
            matchesTerminalReaderReaderResourceReaderAction = false,
            failures = listOf("TerminalReaderReaderResourceReaderAction: expected JSON object"),
        )
    val matchesTerminalReaderReaderResourceReaderAction = raw["status"] != null && raw["type"] != null
    return InlineTerminalReaderActionXc2e18526Inspection(
        matchesTerminalReaderReaderResourceReaderAction = matchesTerminalReaderReaderResourceReaderAction,
        failures =
            buildList {
                if (!matchesTerminalReaderReaderResourceReaderAction) {
                    add(
                        "TerminalReaderReaderResourceReaderAction: required properties 'status', 'type' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
