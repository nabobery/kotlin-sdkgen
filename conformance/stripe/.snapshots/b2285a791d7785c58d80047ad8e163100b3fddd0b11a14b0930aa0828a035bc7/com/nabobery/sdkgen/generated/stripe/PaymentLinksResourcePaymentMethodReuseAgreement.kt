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
public data class PaymentLinksResourcePaymentMethodReuseAgreementView(
  public val position: InlinePaymentLinksResourcePaymentMethodReuseAgreementPositionXc5c0f0fb,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_payment_method_reuse_agreement
 */
@Serializable(with = PaymentLinksResourcePaymentMethodReuseAgreement.Serializer::class)
public class PaymentLinksResourcePaymentMethodReuseAgreement(
  /**
   * Determines the position and visibility of the payment method reuse agreement in the UI. When set to `auto`,
   * Stripe's defaults will be used.
   *
   * When set to `hidden`, the payment method reuse agreement text will always be hidden in the UI.
   */
  public val position: InlinePaymentLinksResourcePaymentMethodReuseAgreementPositionXc5c0f0fb,
) {
  public class Builder {
    private var positionValue:
        InlinePaymentLinksResourcePaymentMethodReuseAgreementPositionXc5c0f0fb? = null

    public var position: InlinePaymentLinksResourcePaymentMethodReuseAgreementPositionXc5c0f0fb
      get() = requireNotNull(positionValue) { "position is required" }
      set(`value`) {
        positionValue = value
      }

    public fun build(): PaymentLinksResourcePaymentMethodReuseAgreement {
      check(positionValue != null) { "position is required" }
      return PaymentLinksResourcePaymentMethodReuseAgreement(
        position = position,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLinksResourcePaymentMethodReuseAgreement = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentLinksResourcePaymentMethodReuseAgreement> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourcePaymentMethodReuseAgreement {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourcePaymentMethodReuseAgreement")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourcePaymentMethodReuseAgreement must be a JSON object")
      val position = json.decodeRequired<InlinePaymentLinksResourcePaymentMethodReuseAgreementPositionXc5c0f0fb>(rawObject, "position")
      return PaymentLinksResourcePaymentMethodReuseAgreement(
        position = position,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourcePaymentMethodReuseAgreement) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourcePaymentMethodReuseAgreement")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("position", json.encodeToJsonElement(value.position))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentLinksResourcePaymentMethodReuseAgreement(block: PaymentLinksResourcePaymentMethodReuseAgreement.Builder.() -> Unit): PaymentLinksResourcePaymentMethodReuseAgreement = PaymentLinksResourcePaymentMethodReuseAgreement.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentLinksResourcePaymentMethodReuseAgreement is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
