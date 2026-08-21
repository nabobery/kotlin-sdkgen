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
 * If this is a `naver_pay` PaymentMethod, this hash contains details about the Naver Pay payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/naver_pay
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormNaverPayX82f49041.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormNaverPayX82f49041(
  public val funding: InlineV1PaymentMethodsPostRequestFormNaverPayFundingXf4381218? = null,
) {
  public class Builder {
    public var funding: InlineV1PaymentMethodsPostRequestFormNaverPayFundingXf4381218? = null

    public fun build(): InlineV1PaymentMethodsPostRequestFormNaverPayX82f49041 = InlineV1PaymentMethodsPostRequestFormNaverPayX82f49041(
      funding = funding,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormNaverPayX82f49041 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormNaverPayX82f49041> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormNaverPayX82f49041 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormNaverPayX82f49041")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormNaverPayX82f49041 must be a JSON object")
      return InlineV1PaymentMethodsPostRequestFormNaverPayX82f49041(
        funding = rawObject["funding"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormNaverPayFundingXf4381218>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormNaverPayX82f49041) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormNaverPayX82f49041")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.funding?.let { put("funding", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodsPostRequestFormNaverPayX82f49041(block: InlineV1PaymentMethodsPostRequestFormNaverPayX82f49041.Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormNaverPayX82f49041 = InlineV1PaymentMethodsPostRequestFormNaverPayX82f49041.build(block)
