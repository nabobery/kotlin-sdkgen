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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_name_collection
 */
@Serializable(with = PaymentPagesCheckoutSessionNameCollection.Serializer::class)
public class PaymentPagesCheckoutSessionNameCollection(
  public val business: PaymentPagesCheckoutSessionBusinessName? = null,
  public val individual: PaymentPagesCheckoutSessionIndividualName? = null,
) {
  public class Builder {
    public var business: PaymentPagesCheckoutSessionBusinessName? = null

    public var individual: PaymentPagesCheckoutSessionIndividualName? = null

    public fun build(): PaymentPagesCheckoutSessionNameCollection = PaymentPagesCheckoutSessionNameCollection(
      business = business,
      individual = individual,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionNameCollection = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentPagesCheckoutSessionNameCollection> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionNameCollection {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionNameCollection")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentPagesCheckoutSessionNameCollection must be a JSON object")
      return PaymentPagesCheckoutSessionNameCollection(
        business = rawObject["business"]?.let { json.decodeFromJsonElement<PaymentPagesCheckoutSessionBusinessName>(it) },
        individual = rawObject["individual"]?.let { json.decodeFromJsonElement<PaymentPagesCheckoutSessionIndividualName>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentPagesCheckoutSessionNameCollection) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionNameCollection")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.business?.let { put("business", json.encodeToJsonElement(it)) }
        value.individual?.let { put("individual", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentPagesCheckoutSessionNameCollection(block: PaymentPagesCheckoutSessionNameCollection.Builder.() -> Unit): PaymentPagesCheckoutSessionNameCollection = PaymentPagesCheckoutSessionNameCollection.build(block)
