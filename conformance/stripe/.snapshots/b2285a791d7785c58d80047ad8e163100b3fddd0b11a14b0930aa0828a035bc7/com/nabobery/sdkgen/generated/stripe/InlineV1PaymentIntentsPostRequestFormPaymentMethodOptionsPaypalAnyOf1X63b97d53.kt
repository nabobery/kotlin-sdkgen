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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/paypal/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/paypal/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53(
  public val captureMethod:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXed9be9e1? = null,
  public val preferredLocale: InlineV1PaymentIntentsPostRequestFormPreferredLocaleXafc786e6? = null,
  public val reference: String? = null,
  public val riskCorrelationId: String? = null,
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX190a1824? = null,
) {
  public class Builder {
    public var captureMethod:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXed9be9e1? = null

    public var preferredLocale: InlineV1PaymentIntentsPostRequestFormPreferredLocaleXafc786e6? =
        null

    public var reference: String? = null

    public var riskCorrelationId: String? = null

    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX190a1824? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53(
      captureMethod = captureMethod,
      preferredLocale = preferredLocale,
      reference = reference,
      riskCorrelationId = riskCorrelationId,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXed9be9e1>(it) },
        preferredLocale = rawObject["preferred_locale"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPreferredLocaleXafc786e6>(it) },
        reference = rawObject["reference"]?.let { json.decodeFromJsonElement<String>(it) },
        riskCorrelationId = rawObject["risk_correlation_id"]?.let { json.decodeFromJsonElement<String>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX190a1824>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
        value.preferredLocale?.let { put("preferred_locale", json.encodeToJsonElement(it)) }
        value.reference?.let { put("reference", it) }
        value.riskCorrelationId?.let { put("risk_correlation_id", it) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1X63b97d53.build(block)
