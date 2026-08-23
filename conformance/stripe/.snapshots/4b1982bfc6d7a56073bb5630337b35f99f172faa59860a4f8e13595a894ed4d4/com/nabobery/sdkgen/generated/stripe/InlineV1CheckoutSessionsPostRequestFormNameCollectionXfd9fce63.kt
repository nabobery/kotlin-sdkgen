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
 * Controls name collection settings for the session.
 *
 * You can configure Checkout to collect your customers' business names, individual names, or both. Each name field can
 * be either required or optional.
 *
 * If a [Customer](https://docs.stripe.com/api/customers) is created or provided, the names can be saved to the Customer
 * object as well.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/name_collection
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormNameCollectionXfd9fce63.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormNameCollectionXfd9fce63(
  public val business:
      InlineV1CheckoutSessionsPostRequestFormNameCollectionBusinessX82fa0092? = null,
  public val individual:
      InlineV1CheckoutSessionsPostRequestFormNameCollectionIndividualXb9078bc2? = null,
) {
  public class Builder {
    public var business: InlineV1CheckoutSessionsPostRequestFormNameCollectionBusinessX82fa0092? =
        null

    public var individual: InlineV1CheckoutSessionsPostRequestFormNameCollectionIndividualXb9078bc2?
        = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormNameCollectionXfd9fce63 = InlineV1CheckoutSessionsPostRequestFormNameCollectionXfd9fce63(
      business = business,
      individual = individual,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormNameCollectionXfd9fce63 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormNameCollectionXfd9fce63> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormNameCollectionXfd9fce63 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormNameCollectionXfd9fce63")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormNameCollectionXfd9fce63 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormNameCollectionXfd9fce63(
        business = rawObject["business"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormNameCollectionBusinessX82fa0092>(it) },
        individual = rawObject["individual"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormNameCollectionIndividualXb9078bc2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormNameCollectionXfd9fce63) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormNameCollectionXfd9fce63")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.business?.let { put("business", json.encodeToJsonElement(it)) }
        value.individual?.let { put("individual", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormNameCollectionXfd9fce63(block: InlineV1CheckoutSessionsPostRequestFormNameCollectionXfd9fce63.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormNameCollectionXfd9fce63 = InlineV1CheckoutSessionsPostRequestFormNameCollectionXfd9fce63.build(block)
