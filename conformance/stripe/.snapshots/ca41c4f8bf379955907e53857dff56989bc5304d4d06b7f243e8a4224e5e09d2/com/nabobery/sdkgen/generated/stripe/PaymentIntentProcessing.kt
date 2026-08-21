package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentIntentProcessingView(
  public val card: PaymentIntentCardProcessing? = null,
  public val type: InlinePaymentIntentProcessingTypeX95e7d066,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_processing
 */
@Serializable(with = PaymentIntentProcessing.Serializer::class)
public class PaymentIntentProcessing(
  /**
   * Type of the payment method for which payment is in `processing` state, one of `card`.
   */
  public val type: InlinePaymentIntentProcessingTypeX95e7d066,
  public val card: PaymentIntentCardProcessing? = null,
) {
  public class Builder {
    private var typeValue: InlinePaymentIntentProcessingTypeX95e7d066? = null

    public var type: InlinePaymentIntentProcessingTypeX95e7d066
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var card: PaymentIntentCardProcessing? = null

    public fun build(): PaymentIntentProcessing {
      check(typeValue != null) { "type is required" }
      return PaymentIntentProcessing(
        type = type,
        card = card,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentIntentProcessing = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentIntentProcessing> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentProcessing {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentProcessing")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentProcessing must be a JSON object")
      val type = json.decodeRequired<InlinePaymentIntentProcessingTypeX95e7d066>(rawObject, "type")
      return PaymentIntentProcessing(
        type = type,
        card = rawObject["card"]?.let { json.decodeFromJsonElement<PaymentIntentCardProcessing>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentProcessing) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentProcessing")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentIntentProcessing(block: PaymentIntentProcessing.Builder.() -> Unit): PaymentIntentProcessing = PaymentIntentProcessing.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentIntentProcessing is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
