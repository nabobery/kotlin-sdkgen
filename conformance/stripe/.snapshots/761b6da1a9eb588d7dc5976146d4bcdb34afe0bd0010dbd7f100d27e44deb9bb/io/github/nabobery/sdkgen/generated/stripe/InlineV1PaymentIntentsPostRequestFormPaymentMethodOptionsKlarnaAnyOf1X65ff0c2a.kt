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
 * urlencoded/schema/properties/payment_method_options/properties/klarna/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/klarna/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a(
  public val captureMethod:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodX575f0b14? = null,
  public val onDemand:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandX87cf2ca7? = null,
  public val preferredLocale: InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843? = null,
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXda77803b? = null,
  public val subscriptions:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018ac? = null,
) {
  public class Builder {
    public var captureMethod:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodX575f0b14? = null

    public var onDemand:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandX87cf2ca7? = null

    public var preferredLocale: InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843? =
        null

    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXda77803b? =
        null

    public var subscriptions:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018ac? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a(
      captureMethod = captureMethod,
      onDemand = onDemand,
      preferredLocale = preferredLocale,
      setupFutureUsage = setupFutureUsage,
      subscriptions = subscriptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodX575f0b14>(it) },
        onDemand = rawObject["on_demand"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandX87cf2ca7>(it) },
        preferredLocale = rawObject["preferred_locale"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXda77803b>(it) },
        subscriptions = rawObject["subscriptions"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018ac>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a")
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

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a.build(block)
