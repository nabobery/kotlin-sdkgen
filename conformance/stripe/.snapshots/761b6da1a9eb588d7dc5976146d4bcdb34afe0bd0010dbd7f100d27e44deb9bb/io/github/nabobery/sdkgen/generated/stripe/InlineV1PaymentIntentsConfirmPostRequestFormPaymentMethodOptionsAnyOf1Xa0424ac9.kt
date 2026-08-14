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
 * www-form-urlencoded/schema/properties/payment_method_options/properties/klarna/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/klarna/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9(
  public val captureMethod:
      InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX40a96fbd? = null,
  public val onDemand: InlineV1PaymentIntentsConfirmPostRequestFormOnDemandXbb76dfc9? = null,
  public val preferredLocale:
      InlineV1PaymentIntentsConfirmPostRequestFormPreferredLocaleXf6b51169? = null,
  public val setupFutureUsage:
      InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXca185aa8? = null,
  public val subscriptions:
      InlineV1PaymentIntentsConfirmPostRequestFormSubscriptionsXf7d07602? = null,
) {
  public class Builder {
    public var captureMethod: InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX40a96fbd? =
        null

    public var onDemand: InlineV1PaymentIntentsConfirmPostRequestFormOnDemandXbb76dfc9? = null

    public var preferredLocale:
        InlineV1PaymentIntentsConfirmPostRequestFormPreferredLocaleXf6b51169? = null

    public var setupFutureUsage:
        InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXca185aa8? = null

    public var subscriptions: InlineV1PaymentIntentsConfirmPostRequestFormSubscriptionsXf7d07602? =
        null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9 = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9(
      captureMethod = captureMethod,
      onDemand = onDemand,
      preferredLocale = preferredLocale,
      setupFutureUsage = setupFutureUsage,
      subscriptions = subscriptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9 must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX40a96fbd>(it) },
        onDemand = rawObject["on_demand"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormOnDemandXbb76dfc9>(it) },
        preferredLocale = rawObject["preferred_locale"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPreferredLocaleXf6b51169>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageXca185aa8>(it) },
        subscriptions = rawObject["subscriptions"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormSubscriptionsXf7d07602>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
        value.onDemand?.let { put("on_demand", json.encodeToJsonElement(it)) }
        value.preferredLocale?.let { put("preferred_locale", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
        value.subscriptions?.let { put("subscriptions", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9(block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9 = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xa0424ac9.build(block)
