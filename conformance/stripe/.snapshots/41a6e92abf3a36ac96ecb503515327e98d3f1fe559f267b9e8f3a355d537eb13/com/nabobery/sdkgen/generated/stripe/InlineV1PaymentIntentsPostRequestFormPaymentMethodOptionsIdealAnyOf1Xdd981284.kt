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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/ideal/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/ideal/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284(
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXd798a106? = null,
) {
  public class Builder {
    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXd798a106? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284(
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284(
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXd798a106>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealAnyOf1Xdd981284.build(block)
