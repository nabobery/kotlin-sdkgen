package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/custom_text
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomTextX046c5ba3.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormCustomTextX046c5ba3(
  public val afterSubmit: InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2? = null,
  public val shippingAddress:
      InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608d? = null,
  public val submit: InlineV1PaymentLinksPostRequestFormCustomTextSubmitX2b15c8c6? = null,
  public val termsOfServiceAcceptance:
      InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184? = null,
) {
  public class Builder {
    public var afterSubmit: InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2? =
        null

    public var shippingAddress:
        InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608d? = null

    public var submit: InlineV1PaymentLinksPostRequestFormCustomTextSubmitX2b15c8c6? = null

    public var termsOfServiceAcceptance:
        InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormCustomTextX046c5ba3 = InlineV1PaymentLinksPostRequestFormCustomTextX046c5ba3(
      afterSubmit = afterSubmit,
      shippingAddress = shippingAddress,
      submit = submit,
      termsOfServiceAcceptance = termsOfServiceAcceptance,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormCustomTextX046c5ba3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomTextX046c5ba3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomTextX046c5ba3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormCustomTextX046c5ba3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormCustomTextX046c5ba3 must be a JSON object")
      return InlineV1PaymentLinksPostRequestFormCustomTextX046c5ba3(
        afterSubmit = rawObject["after_submit"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitXa12c14c2>(it) },
        shippingAddress = rawObject["shipping_address"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextShippingAddressXaa09608d>(it) },
        submit = rawObject["submit"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextSubmitX2b15c8c6>(it) },
        termsOfServiceAcceptance = rawObject["terms_of_service_acceptance"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextTermsOfServiceAcceptanceX4fe3a184>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormCustomTextX046c5ba3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormCustomTextX046c5ba3")
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

public fun inlineV1PaymentLinksPostRequestFormCustomTextX046c5ba3(block: InlineV1PaymentLinksPostRequestFormCustomTextX046c5ba3.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormCustomTextX046c5ba3 = InlineV1PaymentLinksPostRequestFormCustomTextX046c5ba3.build(block)
