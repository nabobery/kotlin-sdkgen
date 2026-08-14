package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/name_collection/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/name_collection/anyOf/0
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179(
  public val business:
      InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1BusinessXd4085d40? = null,
  public val individual:
      InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1IndividualX3ceea8f8? = null,
) {
  public class Builder {
    public var business: InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1BusinessXd4085d40? =
        null

    public var individual:
        InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1IndividualX3ceea8f8? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179 = InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179(
      business = business,
      individual = individual,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179 must be a JSON object")
      return InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179(
        business = rawObject["business"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1BusinessXd4085d40>(it) },
        individual = rawObject["individual"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1IndividualX3ceea8f8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.business?.let { put("business", json.encodeToJsonElement(it)) }
        value.individual?.let { put("individual", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179(block: InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179 = InlineV1PaymentLinksPostRequestFormNameCollectionAnyOf1Xa592a179.build(block)
