package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentPagesCheckoutSessionPaymentMethodReuseAgreementView(
  public val position:
      InlinePaymentPagesCheckoutSessionPaymentMethodReuseAgreementPositionX2a885d55,
)

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_payment_method_reuse_agreement
 */
@Serializable(with = PaymentPagesCheckoutSessionPaymentMethodReuseAgreement.Serializer::class)
public class PaymentPagesCheckoutSessionPaymentMethodReuseAgreement(
  /**
   * Determines the position and visibility of the payment method reuse agreement in the UI. When set to `auto`,
   * Stripe's defaults will be used.
   *
   * When set to `hidden`, the payment method reuse agreement text will always be hidden in the UI.
   */
  public val position:
      InlinePaymentPagesCheckoutSessionPaymentMethodReuseAgreementPositionX2a885d55,
) {
  public class Builder {
    private var positionValue:
        InlinePaymentPagesCheckoutSessionPaymentMethodReuseAgreementPositionX2a885d55? = null

    public var position:
        InlinePaymentPagesCheckoutSessionPaymentMethodReuseAgreementPositionX2a885d55
      get() = requireNotNull(positionValue) { "position is required" }
      set(`value`) {
        positionValue = value
      }

    public fun build(): PaymentPagesCheckoutSessionPaymentMethodReuseAgreement {
      check(positionValue != null) { "position is required" }
      return PaymentPagesCheckoutSessionPaymentMethodReuseAgreement(
        position = position,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionPaymentMethodReuseAgreement = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentPagesCheckoutSessionPaymentMethodReuseAgreement> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionPaymentMethodReuseAgreement {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionPaymentMethodReuseAgreement")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionPaymentMethodReuseAgreement must be a JSON object")
      val position = json.decodeRequired<InlinePaymentPagesCheckoutSessionPaymentMethodReuseAgreementPositionX2a885d55>(rawObject, "position")
      return PaymentPagesCheckoutSessionPaymentMethodReuseAgreement(
        position = position,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionPaymentMethodReuseAgreement) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionPaymentMethodReuseAgreement")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("position", json.encodeToJsonElement(value.position))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionPaymentMethodReuseAgreement(block: PaymentPagesCheckoutSessionPaymentMethodReuseAgreement.Builder.() -> Unit): PaymentPagesCheckoutSessionPaymentMethodReuseAgreement = PaymentPagesCheckoutSessionPaymentMethodReuseAgreement.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentPagesCheckoutSessionPaymentMethodReuseAgreement is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
