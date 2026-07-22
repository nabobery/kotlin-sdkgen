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

public enum class InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5Branch {
    Branch1,
    PromotionCode,
}

public sealed class InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5NoMatchException(
    message: String,
) : InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5DecodingException(message)

internal data class InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5Inspection(
    public val matchesBranch1: Boolean,
    public val matchesPromotionCode: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesPromotionCode).count { it }
}

/**
 * Promotion code attached to the Checkout Session.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_discount/properties/promotion_code
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5.Serializer::class)
public class InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val promotionCode: PromotionCode? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPromotionCode) json.decodeFromJsonElement<PromotionCode>(raw) else null
        }

    public val matchedBranches:
        Set<InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5Branch.Branch1,
                    )
                }
                if (inspection.matchesPromotionCode) {
                    add(
                        InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5Branch.PromotionCode,
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
        ): InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5 {
            val inspection = inspectInlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5NoMatchException(
                    "InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5(
    element: JsonElement,
): InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesPromotionCode = element.isJsonDecodable<PromotionCode>()
    return InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5Inspection(
        matchesBranch1 = matchesBranch1,
        matchesPromotionCode = matchesPromotionCode,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesPromotionCode) add("PromotionCode: value does not match PromotionCode")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
