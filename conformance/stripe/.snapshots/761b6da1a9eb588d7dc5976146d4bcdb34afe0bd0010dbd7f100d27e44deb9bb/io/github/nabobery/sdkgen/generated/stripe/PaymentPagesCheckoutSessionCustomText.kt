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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_custom_text
 */
@Serializable(with = PaymentPagesCheckoutSessionCustomText.Serializer::class)
public class PaymentPagesCheckoutSessionCustomText(
  /**
   * Custom text that should be displayed after the payment confirmation button.
   */
  public val afterSubmit: InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56b? = null,
  /**
   * Custom text that should be displayed alongside shipping address collection.
   */
  public val shippingAddress:
      InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680? = null,
  /**
   * Custom text that should be displayed alongside the payment confirmation button.
   */
  public val submit: InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9? = null,
  /**
   * Custom text that should be displayed in place of the default terms of service agreement text.
   */
  public val termsOfServiceAcceptance:
      InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417? = null,
) {
  public class Builder {
    /**
     * Custom text that should be displayed after the payment confirmation button.
     */
    public var afterSubmit: InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56b? = null

    /**
     * Custom text that should be displayed alongside shipping address collection.
     */
    public var shippingAddress: InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680?
        = null

    /**
     * Custom text that should be displayed alongside the payment confirmation button.
     */
    public var submit: InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9? = null

    /**
     * Custom text that should be displayed in place of the default terms of service agreement text.
     */
    public var termsOfServiceAcceptance:
        InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417? = null

    public fun build(): PaymentPagesCheckoutSessionCustomText = PaymentPagesCheckoutSessionCustomText(
      afterSubmit = afterSubmit,
      shippingAddress = shippingAddress,
      submit = submit,
      termsOfServiceAcceptance = termsOfServiceAcceptance,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionCustomText = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentPagesCheckoutSessionCustomText> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionCustomText {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionCustomText")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionCustomText must be a JSON object")
      return PaymentPagesCheckoutSessionCustomText(
        afterSubmit = rawObject["after_submit"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentPagesCheckoutSessionCustomTextAfterSubmitX3b97e56b?>(element) },
        shippingAddress = rawObject["shipping_address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentPagesCheckoutSessionCustomTextShippingAddressX3fca2680?>(element) },
        submit = rawObject["submit"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentPagesCheckoutSessionCustomTextSubmitXe5018cd9?>(element) },
        termsOfServiceAcceptance = rawObject["terms_of_service_acceptance"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentPagesCheckoutSessionCustomTextTermsOfServiceAcceptanceXa831c417?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionCustomText) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionCustomText")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.afterSubmit?.let { put("after_submit", json.encodeToJsonElement(it)) }
        value.shippingAddress?.let { put("shipping_address", json.encodeToJsonElement(it)) }
        value.submit?.let { put("submit", json.encodeToJsonElement(it)) }
        value.termsOfServiceAcceptance?.let { put("terms_of_service_acceptance", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionCustomText(block: PaymentPagesCheckoutSessionCustomText.Builder.() -> Unit): PaymentPagesCheckoutSessionCustomText = PaymentPagesCheckoutSessionCustomText.build(block)
