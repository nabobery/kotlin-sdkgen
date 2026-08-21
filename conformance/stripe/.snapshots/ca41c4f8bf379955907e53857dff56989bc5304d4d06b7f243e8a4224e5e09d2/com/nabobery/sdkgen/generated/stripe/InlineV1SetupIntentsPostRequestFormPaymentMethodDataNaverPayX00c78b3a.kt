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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/naver_pay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/naver_pay
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayX00c78b3a.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayX00c78b3a(
  public val funding:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayFundingXa0a0b21c? = null,
) {
  public class Builder {
    public var funding:
        InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayFundingXa0a0b21c? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayX00c78b3a = InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayX00c78b3a(
      funding = funding,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayX00c78b3a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayX00c78b3a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayX00c78b3a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayX00c78b3a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayX00c78b3a must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayX00c78b3a(
        funding = rawObject["funding"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayFundingXa0a0b21c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayX00c78b3a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayX00c78b3a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.funding?.let { put("funding", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayX00c78b3a(block: InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayX00c78b3a.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayX00c78b3a = InlineV1SetupIntentsPostRequestFormPaymentMethodDataNaverPayX00c78b3a.build(block)
