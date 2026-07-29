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
 * Payment-method-specific configuration for this ConfirmationToken.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_options
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsXe1c12396.Serializer::class)
public class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsXe1c12396(
  public val card:
      InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsCardXa1246352? = null,
) {
  public class Builder {
    public var card: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsCardXa1246352?
        = null

    public fun build(): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsXe1c12396 = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsXe1c12396(
      card = card,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsXe1c12396 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsXe1c12396> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsXe1c12396 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsXe1c12396")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsXe1c12396 must be a JSON object")
      return InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsXe1c12396(
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsCardXa1246352>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsXe1c12396) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsXe1c12396")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsXe1c12396(block: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsXe1c12396.Builder.() -> Unit): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsXe1c12396 = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsXe1c12396.build(block)
