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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/giropay/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/giropay/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xba88af7b.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xba88af7b(
  public val setupFutureUsage:
      InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXfc47f52c? = null,
) {
  public class Builder {
    public var setupFutureUsage:
        InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXfc47f52c? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xba88af7b = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xba88af7b(
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xba88af7b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xba88af7b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xba88af7b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xba88af7b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xba88af7b must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xba88af7b(
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXfc47f52c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xba88af7b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xba88af7b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xba88af7b(block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xba88af7b.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xba88af7b = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xba88af7b.build(block)
