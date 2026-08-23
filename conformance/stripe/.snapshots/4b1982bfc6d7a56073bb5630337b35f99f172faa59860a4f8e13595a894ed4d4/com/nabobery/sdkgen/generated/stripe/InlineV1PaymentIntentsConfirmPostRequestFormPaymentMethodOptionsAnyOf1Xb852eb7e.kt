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
 * www-form-urlencoded/schema/properties/payment_method_options/properties/satispay/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/satispay/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e(
  public val captureMethod:
      InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodXc7ace135? = null,
  public val setupFutureUsage:
      InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX31f6cbb5? = null,
) {
  public class Builder {
    public var captureMethod: InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodXc7ace135? =
        null

    public var setupFutureUsage:
        InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX31f6cbb5? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e(
      captureMethod = captureMethod,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodXc7ace135>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX31f6cbb5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e(block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e.build(block)
