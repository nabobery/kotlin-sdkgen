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
 * /schema/properties/payment_method_options/properties/upi/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/upi/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295(
  public val mandateOptions:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX263adc7d? = null,
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX08dc5062? = null,
) {
  public class Builder {
    public var mandateOptions:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX263adc7d? = null

    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX08dc5062? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295(
      mandateOptions = mandateOptions,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX263adc7d>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX08dc5062>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiAnyOf1Xcdfa3295.build(block)
