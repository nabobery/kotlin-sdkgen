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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/naver_pay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/naver_pay
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNaverPayXf6a0a08b.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNaverPayXf6a0a08b(
  public val funding:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFundingX5d9499fe? = null,
) {
  public class Builder {
    public var funding:
        InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFundingX5d9499fe? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNaverPayXf6a0a08b = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNaverPayXf6a0a08b(
      funding = funding,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNaverPayXf6a0a08b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNaverPayXf6a0a08b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNaverPayXf6a0a08b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNaverPayXf6a0a08b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNaverPayXf6a0a08b must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNaverPayXf6a0a08b(
        funding = rawObject["funding"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataFundingX5d9499fe>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNaverPayXf6a0a08b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNaverPayXf6a0a08b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.funding?.let { put("funding", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNaverPayXf6a0a08b(block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNaverPayXf6a0a08b.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNaverPayXf6a0a08b = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNaverPayXf6a0a08b.build(block)
