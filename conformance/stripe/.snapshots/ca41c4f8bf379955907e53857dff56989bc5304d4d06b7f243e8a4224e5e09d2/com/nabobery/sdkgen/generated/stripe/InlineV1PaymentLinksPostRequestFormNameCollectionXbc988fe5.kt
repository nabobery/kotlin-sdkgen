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
 * Controls settings applied for collecting the customer's name.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/name_collection
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormNameCollectionXbc988fe5.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormNameCollectionXbc988fe5(
  public val business: InlineV1PaymentLinksPostRequestFormNameCollectionBusinessX5d114308? = null,
  public val individual:
      InlineV1PaymentLinksPostRequestFormNameCollectionIndividualX27162f12? = null,
) {
  public class Builder {
    public var business: InlineV1PaymentLinksPostRequestFormNameCollectionBusinessX5d114308? = null

    public var individual: InlineV1PaymentLinksPostRequestFormNameCollectionIndividualX27162f12? =
        null

    public fun build(): InlineV1PaymentLinksPostRequestFormNameCollectionXbc988fe5 = InlineV1PaymentLinksPostRequestFormNameCollectionXbc988fe5(
      business = business,
      individual = individual,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormNameCollectionXbc988fe5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormNameCollectionXbc988fe5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormNameCollectionXbc988fe5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormNameCollectionXbc988fe5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormNameCollectionXbc988fe5 must be a JSON object")
      return InlineV1PaymentLinksPostRequestFormNameCollectionXbc988fe5(
        business = rawObject["business"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormNameCollectionBusinessX5d114308>(it) },
        individual = rawObject["individual"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormNameCollectionIndividualX27162f12>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormNameCollectionXbc988fe5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormNameCollectionXbc988fe5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.business?.let { put("business", json.encodeToJsonElement(it)) }
        value.individual?.let { put("individual", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormNameCollectionXbc988fe5(block: InlineV1PaymentLinksPostRequestFormNameCollectionXbc988fe5.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormNameCollectionXbc988fe5 = InlineV1PaymentLinksPostRequestFormNameCollectionXbc988fe5.build(block)
