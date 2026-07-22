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

public enum class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41Branch {
    Branch1,
    InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X40b4e516,
}

public sealed class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41NoMatchException(
    message: String,
) : InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41DecodingException(message)

internal data class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X40b4e516: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X40b4e516,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/discount_amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/discount_amount
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41.Serializer::class)
public class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41Inspection,
) {
    public val branch1: Int? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

    public val inlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X40b4e516:
        InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X40b4e516? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X40b4e516) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X40b4e516>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X40b4e516) {
                    add(
                        InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41Branch.InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X40b4e516,
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
        ): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41 {
            val inspection =
                inspectInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41NoMatchException(
                    "InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41(
    element: JsonElement,
): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41Inspection {
    val matchesBranch1 = element.isJsonDecodable<Int>()
    val matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X40b4e516 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X40b4e516>()
    return InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsDiscountAmountX3f750e41Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X40b4e516 = matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X40b4e516,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Int")
                if (!matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X40b4e516) {
                    add(
                        "InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X40b4e516: value does not match InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsAnyOf2X40b4e516",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
