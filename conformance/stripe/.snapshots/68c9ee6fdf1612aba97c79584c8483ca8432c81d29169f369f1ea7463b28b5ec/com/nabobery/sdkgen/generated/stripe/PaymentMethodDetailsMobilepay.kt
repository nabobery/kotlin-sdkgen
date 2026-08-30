package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_mobilepay
 */
@Serializable(with = PaymentMethodDetailsMobilepay.Serializer::class)
public class PaymentMethodDetailsMobilepay(
  /**
   * Internal card details
   */
  public val card: InlinePaymentMethodDetailsMobilepayCardX8e756108? = null,
) {
  public class Builder {
    /**
     * Internal card details
     */
    public var card: InlinePaymentMethodDetailsMobilepayCardX8e756108? = null

    public fun build(): PaymentMethodDetailsMobilepay = PaymentMethodDetailsMobilepay(
      card = card,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsMobilepay = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodDetailsMobilepay> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsMobilepay {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsMobilepay")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsMobilepay must be a JSON object")
      return PaymentMethodDetailsMobilepay(
        card = rawObject["card"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodDetailsMobilepayCardX8e756108?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsMobilepay) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsMobilepay")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsMobilepay(block: PaymentMethodDetailsMobilepay.Builder.() -> Unit): PaymentMethodDetailsMobilepay = PaymentMethodDetailsMobilepay.build(block)
