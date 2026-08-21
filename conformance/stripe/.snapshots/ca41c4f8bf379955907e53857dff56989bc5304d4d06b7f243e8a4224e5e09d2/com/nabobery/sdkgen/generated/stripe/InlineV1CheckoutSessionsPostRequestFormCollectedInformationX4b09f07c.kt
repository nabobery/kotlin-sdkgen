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
 * Information about the customer collected within the Checkout Session. Can only be set when updating `embedded` or
 * `custom` sessions.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/collected_information
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormCollectedInformationX4b09f07c.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormCollectedInformationX4b09f07c(
  public val shippingDetails:
      InlineV1CheckoutSessionsPostRequestFormShippingDetailsX10aa615f? = null,
) {
  public class Builder {
    public var shippingDetails: InlineV1CheckoutSessionsPostRequestFormShippingDetailsX10aa615f? =
        null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormCollectedInformationX4b09f07c = InlineV1CheckoutSessionsPostRequestFormCollectedInformationX4b09f07c(
      shippingDetails = shippingDetails,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormCollectedInformationX4b09f07c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormCollectedInformationX4b09f07c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormCollectedInformationX4b09f07c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormCollectedInformationX4b09f07c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormCollectedInformationX4b09f07c must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormCollectedInformationX4b09f07c(
        shippingDetails = rawObject["shipping_details"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormShippingDetailsX10aa615f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormCollectedInformationX4b09f07c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormCollectedInformationX4b09f07c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.shippingDetails?.let { put("shipping_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormCollectedInformationX4b09f07c(block: InlineV1CheckoutSessionsPostRequestFormCollectedInformationX4b09f07c.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormCollectedInformationX4b09f07c = InlineV1CheckoutSessionsPostRequestFormCollectedInformationX4b09f07c.build(block)
