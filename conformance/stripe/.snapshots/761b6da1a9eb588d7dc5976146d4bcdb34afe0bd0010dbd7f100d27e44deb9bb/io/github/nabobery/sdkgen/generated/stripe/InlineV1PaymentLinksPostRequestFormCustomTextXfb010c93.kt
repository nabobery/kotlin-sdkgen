package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Display additional text for your customers using custom text. You can't set this parameter if `ui_mode` is `custom`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_text
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomTextXfb010c93.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormCustomTextXfb010c93(
  public val afterSubmit: InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682e? = null,
  public val shippingAddress:
      InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20e? = null,
  public val submit: InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2d? = null,
  public val termsOfServiceAcceptance:
      InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1d? = null,
) {
  public class Builder {
    public var afterSubmit: InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682e? =
        null

    public var shippingAddress:
        InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20e? = null

    public var submit: InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2d? = null

    public var termsOfServiceAcceptance:
        InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1d? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormCustomTextXfb010c93 = InlineV1PaymentLinksPostRequestFormCustomTextXfb010c93(
      afterSubmit = afterSubmit,
      shippingAddress = shippingAddress,
      submit = submit,
      termsOfServiceAcceptance = termsOfServiceAcceptance,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormCustomTextXfb010c93 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomTextXfb010c93> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomTextXfb010c93 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormCustomTextXfb010c93")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormCustomTextXfb010c93 must be a JSON object")
      return InlineV1PaymentLinksPostRequestFormCustomTextXfb010c93(
        afterSubmit = rawObject["after_submit"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa0b9682e>(it) },
        shippingAddress = rawObject["shipping_address"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXc8eae20e>(it) },
        submit = rawObject["submit"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2d>(it) },
        termsOfServiceAcceptance = rawObject["terms_of_service_acceptance"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceXac2bcc1d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormCustomTextXfb010c93) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormCustomTextXfb010c93")
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

public fun inlineV1PaymentLinksPostRequestFormCustomTextXfb010c93(block: InlineV1PaymentLinksPostRequestFormCustomTextXfb010c93.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormCustomTextXfb010c93 = InlineV1PaymentLinksPostRequestFormCustomTextXfb010c93.build(block)
