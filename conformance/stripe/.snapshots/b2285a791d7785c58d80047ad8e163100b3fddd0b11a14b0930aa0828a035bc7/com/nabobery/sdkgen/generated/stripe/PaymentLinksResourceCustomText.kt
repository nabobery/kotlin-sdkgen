package com.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_custom_text
 */
@Serializable(with = PaymentLinksResourceCustomText.Serializer::class)
public class PaymentLinksResourceCustomText(
  /**
   * Custom text that should be displayed after the payment confirmation button.
   */
  public val afterSubmit: InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7c? = null,
  /**
   * Custom text that should be displayed alongside shipping address collection.
   */
  public val shippingAddress: InlinePaymentLinksResourceCustomTextShippingAddressX7b901563? = null,
  /**
   * Custom text that should be displayed alongside the payment confirmation button.
   */
  public val submit: InlinePaymentLinksResourceCustomTextSubmitX46160aa5? = null,
  /**
   * Custom text that should be displayed in place of the default terms of service agreement text.
   */
  public val termsOfServiceAcceptance:
      InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6d? = null,
) {
  public class Builder {
    /**
     * Custom text that should be displayed after the payment confirmation button.
     */
    public var afterSubmit: InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7c? = null

    /**
     * Custom text that should be displayed alongside shipping address collection.
     */
    public var shippingAddress: InlinePaymentLinksResourceCustomTextShippingAddressX7b901563? = null

    /**
     * Custom text that should be displayed alongside the payment confirmation button.
     */
    public var submit: InlinePaymentLinksResourceCustomTextSubmitX46160aa5? = null

    /**
     * Custom text that should be displayed in place of the default terms of service agreement text.
     */
    public var termsOfServiceAcceptance:
        InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6d? = null

    public fun build(): PaymentLinksResourceCustomText = PaymentLinksResourceCustomText(
      afterSubmit = afterSubmit,
      shippingAddress = shippingAddress,
      submit = submit,
      termsOfServiceAcceptance = termsOfServiceAcceptance,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLinksResourceCustomText = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentLinksResourceCustomText> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourceCustomText {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceCustomText")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourceCustomText must be a JSON object")
      return PaymentLinksResourceCustomText(
        afterSubmit = rawObject["after_submit"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7c?>(element) },
        shippingAddress = rawObject["shipping_address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinksResourceCustomTextShippingAddressX7b901563?>(element) },
        submit = rawObject["submit"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinksResourceCustomTextSubmitX46160aa5?>(element) },
        termsOfServiceAcceptance = rawObject["terms_of_service_acceptance"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinksResourceCustomTextTermsOfServiceAcceptanceX43755f6d?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourceCustomText) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceCustomText")
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

public fun paymentLinksResourceCustomText(block: PaymentLinksResourceCustomText.Builder.() -> Unit): PaymentLinksResourceCustomText = PaymentLinksResourceCustomText.build(block)
