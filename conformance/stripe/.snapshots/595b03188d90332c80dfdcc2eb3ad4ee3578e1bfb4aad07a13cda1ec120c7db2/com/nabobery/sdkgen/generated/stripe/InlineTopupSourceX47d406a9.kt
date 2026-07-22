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

public enum class InlineTopupSourceX47d406a9Branch {
    Source,
}

public sealed class InlineTopupSourceX47d406a9DecodingException(
    message: String,
) : SerializationException(message)

public class InlineTopupSourceX47d406a9NoMatchException(
    message: String,
) : InlineTopupSourceX47d406a9DecodingException(message)

internal data class InlineTopupSourceX47d406a9Inspection(
    public val matchesSource: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesSource).count { it }
}

/**
 * The source field is deprecated. It might not always be present in the API response.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/topup/properties/source
 */
@Serializable(with = InlineTopupSourceX47d406a9.Serializer::class)
public class InlineTopupSourceX47d406a9 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineTopupSourceX47d406a9Inspection,
) {
    public val source: SourceView? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesSource) json.decodeFromJsonElement<SourceView>(raw) else null }

    public val matchedBranches: Set<InlineTopupSourceX47d406a9Branch>
        get() =
            buildSet {
                if (inspection.matchesSource) add(InlineTopupSourceX47d406a9Branch.Source)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineTopupSourceX47d406a9 {
            val inspection = inspectInlineTopupSourceX47d406a9(raw)
            if (inspection.matchCount == 0) {
                throw InlineTopupSourceX47d406a9NoMatchException(
                    "InlineTopupSourceX47d406a9 matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineTopupSourceX47d406a9(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineTopupSourceX47d406a9> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineTopupSourceX47d406a9 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineTopupSourceX47d406a9")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTopupSourceX47d406a9,
        ) {
            encoder.requireJsonEncoder("InlineTopupSourceX47d406a9").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineTopupSourceX47d406a9(element: JsonElement): InlineTopupSourceX47d406a9Inspection {
    val raw =
        element as? JsonObject ?: return InlineTopupSourceX47d406a9Inspection(
            matchesSource = false,
            failures = listOf("Source: expected JSON object"),
        )
    val matchesSource =
        raw["client_secret"].isString() && raw["created"] != null && raw["flow"].isString() && raw["id"].isString() &&
            raw["livemode"] != null &&
            raw["object"] != null &&
            raw["status"].isString() &&
            raw["type"] != null
    return InlineTopupSourceX47d406a9Inspection(
        matchesSource = matchesSource,
        failures =
            buildList {
                if (!matchesSource) {
                    add(
                        "Source: required properties 'client_secret', 'created', 'flow', 'id', 'livemode', 'object', 'status', 'type' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
