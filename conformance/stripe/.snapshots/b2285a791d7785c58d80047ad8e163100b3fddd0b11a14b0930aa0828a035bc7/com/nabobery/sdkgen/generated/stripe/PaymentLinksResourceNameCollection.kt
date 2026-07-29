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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_name_collection
 */
@Serializable(with = PaymentLinksResourceNameCollection.Serializer::class)
public class PaymentLinksResourceNameCollection(
  public val business: PaymentLinksResourceBusinessName? = null,
  public val individual: PaymentLinksResourceIndividualName? = null,
) {
  public class Builder {
    public var business: PaymentLinksResourceBusinessName? = null

    public var individual: PaymentLinksResourceIndividualName? = null

    public fun build(): PaymentLinksResourceNameCollection = PaymentLinksResourceNameCollection(
      business = business,
      individual = individual,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLinksResourceNameCollection = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentLinksResourceNameCollection> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourceNameCollection {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceNameCollection")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourceNameCollection must be a JSON object")
      return PaymentLinksResourceNameCollection(
        business = rawObject["business"]?.let { json.decodeFromJsonElement<PaymentLinksResourceBusinessName>(it) },
        individual = rawObject["individual"]?.let { json.decodeFromJsonElement<PaymentLinksResourceIndividualName>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourceNameCollection) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceNameCollection")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.business?.let { put("business", json.encodeToJsonElement(it)) }
        value.individual?.let { put("individual", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentLinksResourceNameCollection(block: PaymentLinksResourceNameCollection.Builder.() -> Unit): PaymentLinksResourceNameCollection = PaymentLinksResourceNameCollection.build(block)
