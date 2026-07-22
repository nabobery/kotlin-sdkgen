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

public enum class InlineIssuingCardShippingX3a68ab2fBranch {
    IssuingCardShipping,
}

public sealed class InlineIssuingCardShippingX3a68ab2fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineIssuingCardShippingX3a68ab2fNoMatchException(
    message: String,
) : InlineIssuingCardShippingX3a68ab2fDecodingException(message)

internal data class InlineIssuingCardShippingX3a68ab2fInspection(
    public val matchesIssuingCardShipping: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesIssuingCardShipping).count { it }
}

/**
 * Where and how the card will be shipped.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.card/properties/shipping
 */
@Serializable(with = InlineIssuingCardShippingX3a68ab2f.Serializer::class)
public class InlineIssuingCardShippingX3a68ab2f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineIssuingCardShippingX3a68ab2fInspection,
) {
    public val issuingCardShipping: IssuingCardShippingView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesIssuingCardShipping) {
                json.decodeFromJsonElement<IssuingCardShippingView>(
                    raw,
                )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineIssuingCardShippingX3a68ab2fBranch>
        get() =
            buildSet {
                if (inspection.matchesIssuingCardShipping) {
                    add(
                        InlineIssuingCardShippingX3a68ab2fBranch.IssuingCardShipping,
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
        ): InlineIssuingCardShippingX3a68ab2f {
            val inspection = inspectInlineIssuingCardShippingX3a68ab2f(raw)
            if (inspection.matchCount == 0) {
                throw InlineIssuingCardShippingX3a68ab2fNoMatchException(
                    "InlineIssuingCardShippingX3a68ab2f matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineIssuingCardShippingX3a68ab2f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineIssuingCardShippingX3a68ab2f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineIssuingCardShippingX3a68ab2f {
            val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingCardShippingX3a68ab2f")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingCardShippingX3a68ab2f,
        ) {
            encoder.requireJsonEncoder("InlineIssuingCardShippingX3a68ab2f").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineIssuingCardShippingX3a68ab2f(
    element: JsonElement,
): InlineIssuingCardShippingX3a68ab2fInspection {
    val raw =
        element as? JsonObject ?: return InlineIssuingCardShippingX3a68ab2fInspection(
            matchesIssuingCardShipping = false,
            failures = listOf("IssuingCardShipping: expected JSON object"),
        )
    val matchesIssuingCardShipping =
        raw["address"] != null && raw["name"].isString() && raw["service"] != null && raw["type"] != null
    return InlineIssuingCardShippingX3a68ab2fInspection(
        matchesIssuingCardShipping = matchesIssuingCardShipping,
        failures =
            buildList {
                if (!matchesIssuingCardShipping) {
                    add(
                        "IssuingCardShipping: required properties 'address', 'name', 'service', 'type' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
