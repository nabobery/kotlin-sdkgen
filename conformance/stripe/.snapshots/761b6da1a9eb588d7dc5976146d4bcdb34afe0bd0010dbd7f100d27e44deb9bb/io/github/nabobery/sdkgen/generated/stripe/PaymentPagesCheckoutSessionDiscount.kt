package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_discount
 */
@Serializable(with = PaymentPagesCheckoutSessionDiscount.Serializer::class)
public class PaymentPagesCheckoutSessionDiscount(
  /**
   * Coupon attached to the Checkout Session.
   */
  public val coupon: InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5f? = null,
  /**
   * Promotion code attached to the Checkout Session.
   */
  public val promotionCode: InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5? = null,
) {
  public class Builder {
    /**
     * Coupon attached to the Checkout Session.
     */
    public var coupon: InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5f? = null

    /**
     * Promotion code attached to the Checkout Session.
     */
    public var promotionCode: InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5? =
        null

    public fun build(): PaymentPagesCheckoutSessionDiscount = PaymentPagesCheckoutSessionDiscount(
      coupon = coupon,
      promotionCode = promotionCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionDiscount = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentPagesCheckoutSessionDiscount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionDiscount {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionDiscount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionDiscount must be a JSON object")
      return PaymentPagesCheckoutSessionDiscount(
        coupon = rawObject["coupon"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentPagesCheckoutSessionDiscountCouponX5818db5f?>(element) },
        promotionCode = rawObject["promotion_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentPagesCheckoutSessionDiscountPromotionCodeX93f0a9f5?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionDiscount) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionDiscount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.coupon?.let { put("coupon", json.encodeToJsonElement(it)) }
        value.promotionCode?.let { put("promotion_code", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionDiscount(block: PaymentPagesCheckoutSessionDiscount.Builder.() -> Unit): PaymentPagesCheckoutSessionDiscount = PaymentPagesCheckoutSessionDiscount.build(block)
