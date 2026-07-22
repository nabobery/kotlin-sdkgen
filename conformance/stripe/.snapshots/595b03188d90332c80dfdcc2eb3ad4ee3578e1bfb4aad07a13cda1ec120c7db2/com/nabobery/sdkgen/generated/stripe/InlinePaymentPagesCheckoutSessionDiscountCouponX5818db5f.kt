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

public enum class InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5fBranch {
    Branch1,
    Coupon,
}

public sealed class InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5fDecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5fNoMatchException(
    message: String,
) : InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5fDecodingException(message)

internal data class InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5fInspection(
    public val matchesBranch1: Boolean,
    public val matchesCoupon: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesCoupon).count { it }
}

/**
 * Coupon attached to the Checkout Session.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_discount/properties/coupon
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5f.Serializer::class)
public class InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5fInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val coupon: Coupon? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesCoupon) json.decodeFromJsonElement<Coupon>(raw) else null }

    public val matchedBranches: Set<InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5fBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5fBranch.Branch1,
                    )
                }
                if (inspection.matchesCoupon) add(InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5fBranch.Coupon)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5f {
            val inspection = inspectInlinePaymentPagesCheckoutSessionDiscountCouponX5818db5f(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5fNoMatchException(
                    "InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5f {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5f")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentPagesCheckoutSessionDiscountCouponX5818db5f(
    element: JsonElement,
): InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5fInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesCoupon = element.isJsonDecodable<Coupon>()
    return InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5fInspection(
        matchesBranch1 = matchesBranch1,
        matchesCoupon = matchesCoupon,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesCoupon) add("Coupon: value does not match Coupon")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
