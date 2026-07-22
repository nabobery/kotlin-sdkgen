package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1Branch {
    InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305,
    InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X2003e6b9,
}

public sealed class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1NoMatchException(
    message: String,
) : InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1DecodingException(message)

internal data class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1Inspection(
    public val matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305: Boolean,
    public val matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X2003e6b9: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305,
                matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X2003e6b9,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/shipping.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/shipping
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1.Serializer::class)
public class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1Inspection,
) {
    public val inlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305:
        InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X2003e6b9:
        InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X2003e6b9? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X2003e6b9) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X2003e6b9>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305) {
                    add(
                        InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1Branch.InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X2003e6b9) {
                    add(
                        InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1Branch.InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X2003e6b9,
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
        ): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1 {
            val inspection = inspectInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1NoMatchException(
                    "InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1(
    element: JsonElement,
): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1Inspection {
    val matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305>()
    val matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X2003e6b9 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X2003e6b9>()
    return InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingX0767b4c1Inspection(
        matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305 = matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305,
        matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X2003e6b9 = matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X2003e6b9,
        failures =
            buildList {
                if (!matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305) {
                    add(
                        "InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305: value does not match InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf1X8c854305",
                    )
                }
                if (!matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X2003e6b9) {
                    add(
                        "InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X2003e6b9: value does not match InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2X2003e6b9",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
