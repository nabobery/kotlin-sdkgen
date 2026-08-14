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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/naver_pay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/naver_pay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayX7d9d99f0.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayX7d9d99f0(
  public val funding:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayFundingX4a40eefb? = null,
) {
  public class Builder {
    public var funding:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayFundingX4a40eefb? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayX7d9d99f0 = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayX7d9d99f0(
      funding = funding,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayX7d9d99f0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayX7d9d99f0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayX7d9d99f0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayX7d9d99f0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayX7d9d99f0 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayX7d9d99f0(
        funding = rawObject["funding"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayFundingX4a40eefb>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayX7d9d99f0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayX7d9d99f0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.funding?.let { put("funding", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayX7d9d99f0(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayX7d9d99f0.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayX7d9d99f0 = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayX7d9d99f0.build(block)
