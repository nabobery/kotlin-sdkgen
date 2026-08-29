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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_options/properties/card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_options/properties/card
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsCardXa1246352.Serializer::class)
public class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsCardXa1246352(
  public val installments:
      InlineV1TestHelpersConfirmafd4PostRequestFormInstallmentsX5de87e58? = null,
) {
  public class Builder {
    public var installments: InlineV1TestHelpersConfirmafd4PostRequestFormInstallmentsX5de87e58? =
        null

    public fun build(): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsCardXa1246352 = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsCardXa1246352(
      installments = installments,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsCardXa1246352 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsCardXa1246352> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsCardXa1246352 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsCardXa1246352")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsCardXa1246352 must be a JSON object")
      return InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsCardXa1246352(
        installments = rawObject["installments"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersConfirmafd4PostRequestFormInstallmentsX5de87e58>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsCardXa1246352) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsCardXa1246352")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.installments?.let { put("installments", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsCardXa1246352(block: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsCardXa1246352.Builder.() -> Unit): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsCardXa1246352 = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodOptionsCardXa1246352.build(block)
