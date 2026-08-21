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
 * /schema/properties/payment_method_options/properties/swish/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/swish/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1Xa1700e8b.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1Xa1700e8b(
  public val reference:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314? = null,
  public val setupFutureUsage:
      InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX45ac1337? = null,
) {
  public class Builder {
    public var reference:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314? = null

    public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX45ac1337? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1Xa1700e8b = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1Xa1700e8b(
      reference = reference,
      setupFutureUsage = setupFutureUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1Xa1700e8b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1Xa1700e8b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1Xa1700e8b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1Xa1700e8b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1Xa1700e8b must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1Xa1700e8b(
        reference = rawObject["reference"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceXdf0a4314>(it) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageX45ac1337>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1Xa1700e8b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1Xa1700e8b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.reference?.let { put("reference", json.encodeToJsonElement(it)) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1Xa1700e8b(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1Xa1700e8b.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1Xa1700e8b = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1Xa1700e8b.build(block)
