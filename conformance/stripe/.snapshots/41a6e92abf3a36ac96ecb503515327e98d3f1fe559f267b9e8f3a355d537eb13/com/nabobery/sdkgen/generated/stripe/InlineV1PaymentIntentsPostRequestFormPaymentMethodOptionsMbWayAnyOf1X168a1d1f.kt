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
 * /schema/properties/payment_method_options/properties/mb_way/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/mb_way/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f(
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX8d3568db? = null,
) {
  public class Builder {
    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX8d3568db? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f(
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f(
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX8d3568db>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayAnyOf1X168a1d1f.build(block)
