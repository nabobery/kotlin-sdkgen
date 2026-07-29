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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/naver_pay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/naver_pay
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNaverPayX4dc59c8c.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNaverPayX4dc59c8c(
  public val funding:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFundingX107fe18b? = null,
) {
  public class Builder {
    public var funding: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFundingX107fe18b?
        = null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNaverPayX4dc59c8c = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNaverPayX4dc59c8c(
      funding = funding,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNaverPayX4dc59c8c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNaverPayX4dc59c8c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNaverPayX4dc59c8c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNaverPayX4dc59c8c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNaverPayX4dc59c8c must be a JSON object")
      return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNaverPayX4dc59c8c(
        funding = rawObject["funding"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataFundingX107fe18b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNaverPayX4dc59c8c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNaverPayX4dc59c8c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.funding?.let { put("funding", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNaverPayX4dc59c8c(block: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNaverPayX4dc59c8c.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNaverPayX4dc59c8c = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataNaverPayX4dc59c8c.build(block)
