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

public enum class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1Branch {
    Branch1,
    InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa63e005d,
}

public sealed class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1NoMatchException(
    message: String,
) : InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1DecodingException(message)

internal data class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa63e005d: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa63e005d,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/shipping/anyOf/0/properties/amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/shipping/anyOf/0/properties/amount
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1.Serializer::class)
public class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1Inspection,
) {
    public val branch1: Int? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

    public val inlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa63e005d:
        InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa63e005d? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa63e005d) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa63e005d>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa63e005d) {
                    add(
                        InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1Branch.InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa63e005d,
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
        ): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1 {
            val inspection =
                inspectInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1NoMatchException(
                    "InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1(
    element: JsonElement,
): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1Inspection {
    val matchesBranch1 = element.isJsonDecodable<Int>()
    val matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa63e005d =
        element
            .isJsonDecodable<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa63e005d>()
    return InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAmountXe26f4aa1Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa63e005d = matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa63e005d,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match Int")
                if (!matchesInlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa63e005d) {
                    add(
                        "InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa63e005d: value does not match InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsShippingAnyOf2Xa63e005d",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
