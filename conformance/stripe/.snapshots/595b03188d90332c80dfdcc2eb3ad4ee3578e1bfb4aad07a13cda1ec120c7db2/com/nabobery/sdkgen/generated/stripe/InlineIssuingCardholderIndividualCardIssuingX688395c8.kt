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

public enum class InlineIssuingCardholderIndividualCardIssuingX688395c8Branch {
    IssuingCardholderCardIssuing,
}

public sealed class InlineIssuingCardholderIndividualCardIssuingX688395c8DecodingException(
    message: String,
) : SerializationException(message)

public class InlineIssuingCardholderIndividualCardIssuingX688395c8NoMatchException(
    message: String,
) : InlineIssuingCardholderIndividualCardIssuingX688395c8DecodingException(message)

internal data class InlineIssuingCardholderIndividualCardIssuingX688395c8Inspection(
    public val matchesIssuingCardholderCardIssuing: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesIssuingCardholderCardIssuing).count { it }
}

/**
 * Information related to the card_issuing program for this cardholder.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_individual/properties/card_issuing
 */
@Serializable(with = InlineIssuingCardholderIndividualCardIssuingX688395c8.Serializer::class)
public class InlineIssuingCardholderIndividualCardIssuingX688395c8 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineIssuingCardholderIndividualCardIssuingX688395c8Inspection,
) {
    public val issuingCardholderCardIssuing: IssuingCardholderCardIssuingView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesIssuingCardholderCardIssuing) {
                json
                    .decodeFromJsonElement<IssuingCardholderCardIssuingView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineIssuingCardholderIndividualCardIssuingX688395c8Branch>
        get() =
            buildSet {
                if (inspection.matchesIssuingCardholderCardIssuing) {
                    add(
                        InlineIssuingCardholderIndividualCardIssuingX688395c8Branch.IssuingCardholderCardIssuing,
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
        ): InlineIssuingCardholderIndividualCardIssuingX688395c8 {
            val inspection = inspectInlineIssuingCardholderIndividualCardIssuingX688395c8(raw)
            if (inspection.matchCount == 0) {
                throw InlineIssuingCardholderIndividualCardIssuingX688395c8NoMatchException(
                    "InlineIssuingCardholderIndividualCardIssuingX688395c8 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineIssuingCardholderIndividualCardIssuingX688395c8(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineIssuingCardholderIndividualCardIssuingX688395c8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineIssuingCardholderIndividualCardIssuingX688395c8 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingCardholderIndividualCardIssuingX688395c8")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingCardholderIndividualCardIssuingX688395c8,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineIssuingCardholderIndividualCardIssuingX688395c8",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineIssuingCardholderIndividualCardIssuingX688395c8(
    element: JsonElement,
): InlineIssuingCardholderIndividualCardIssuingX688395c8Inspection {
    val raw =
        element as? JsonObject ?: return InlineIssuingCardholderIndividualCardIssuingX688395c8Inspection(
            matchesIssuingCardholderCardIssuing = false,
            failures = listOf("IssuingCardholderCardIssuing: expected JSON object"),
        )
    val matchesIssuingCardholderCardIssuing = true
    return InlineIssuingCardholderIndividualCardIssuingX688395c8Inspection(
        matchesIssuingCardholderCardIssuing = matchesIssuingCardholderCardIssuing,
        failures =
            buildList {
                if (!matchesIssuingCardholderCardIssuing) {
                    add(
                        "IssuingCardholderCardIssuing: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
