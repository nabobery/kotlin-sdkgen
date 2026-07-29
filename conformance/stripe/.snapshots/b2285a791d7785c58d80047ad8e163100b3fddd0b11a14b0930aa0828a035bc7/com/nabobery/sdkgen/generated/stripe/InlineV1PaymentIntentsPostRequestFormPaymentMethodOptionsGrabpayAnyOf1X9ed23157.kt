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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/grabpay/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/grabpay/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157(
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX746d5ea4? = null,
) {
  public class Builder {
    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX746d5ea4? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157(
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157(
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX746d5ea4>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayAnyOf1X9ed23157.build(block)
