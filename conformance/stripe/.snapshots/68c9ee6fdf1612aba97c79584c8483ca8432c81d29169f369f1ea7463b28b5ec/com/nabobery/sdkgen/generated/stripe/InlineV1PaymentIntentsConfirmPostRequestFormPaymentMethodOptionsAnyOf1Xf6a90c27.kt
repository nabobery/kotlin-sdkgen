package com.nabobery.sdkgen.generated.stripe

import kotlin.String
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
 * www-form-urlencoded/schema/properties/payment_method_options/properties/affirm/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/affirm/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf6a90c27.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf6a90c27(
  public val captureMethod:
      InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX38f25763? = null,
  public val preferredLocale: String? = null,
  public val setupFutureUsage:
      InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX8b9c1b4b? = null,
) {
  public class Builder {
    public var captureMethod: InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX38f25763? =
        null

    public var preferredLocale: String? = null

    public var setupFutureUsage:
        InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX8b9c1b4b? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf6a90c27 = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf6a90c27(
      captureMethod = captureMethod,
      preferredLocale = preferredLocale,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf6a90c27 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf6a90c27> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf6a90c27 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf6a90c27")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf6a90c27 must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf6a90c27(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX38f25763>(it) },
        preferredLocale = rawObject["preferred_locale"]?.let { json.decodeFromJsonElement<String>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX8b9c1b4b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf6a90c27) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf6a90c27")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
        value.preferredLocale?.let { put("preferred_locale", it) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf6a90c27(block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf6a90c27.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf6a90c27 = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xf6a90c27.build(block)
