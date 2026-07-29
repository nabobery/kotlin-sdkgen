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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/custom_text
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormCustomTextXeef1566c.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormCustomTextXeef1566c(
  public val afterSubmit:
      InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958b? = null,
  public val shippingAddress:
      InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085? = null,
  public val submit: InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00f? = null,
  public val termsOfServiceAcceptance:
      InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181b? = null,
) {
  public class Builder {
    public var afterSubmit: InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958b? =
        null

    public var shippingAddress:
        InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085? = null

    public var submit: InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00f? = null

    public var termsOfServiceAcceptance:
        InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181b? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormCustomTextXeef1566c = InlineV1CheckoutSessionsPostRequestFormCustomTextXeef1566c(
      afterSubmit = afterSubmit,
      shippingAddress = shippingAddress,
      submit = submit,
      termsOfServiceAcceptance = termsOfServiceAcceptance,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormCustomTextXeef1566c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormCustomTextXeef1566c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormCustomTextXeef1566c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormCustomTextXeef1566c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormCustomTextXeef1566c must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormCustomTextXeef1566c(
        afterSubmit = rawObject["after_submit"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCustomTextAfterSubmitX0bfe958b>(it) },
        shippingAddress = rawObject["shipping_address"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085>(it) },
        submit = rawObject["submit"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitX5dd8d00f>(it) },
        termsOfServiceAcceptance = rawObject["terms_of_service_acceptance"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormCustomTextXeef1566c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormCustomTextXeef1566c")
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

public fun inlineV1CheckoutSessionsPostRequestFormCustomTextXeef1566c(block: InlineV1CheckoutSessionsPostRequestFormCustomTextXeef1566c.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormCustomTextXeef1566c = InlineV1CheckoutSessionsPostRequestFormCustomTextXeef1566c.build(block)
