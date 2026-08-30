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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/blik/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/blik/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae(
  public val code: String? = null,
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX30f685c2? = null,
) {
  public class Builder {
    public var code: String? = null

    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX30f685c2? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae(
      code = code,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae(
        code = rawObject["code"]?.let { json.decodeFromJsonElement<String>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX30f685c2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.code?.let { put("code", it) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikAnyOf1Xf1ec4aae.build(block)
