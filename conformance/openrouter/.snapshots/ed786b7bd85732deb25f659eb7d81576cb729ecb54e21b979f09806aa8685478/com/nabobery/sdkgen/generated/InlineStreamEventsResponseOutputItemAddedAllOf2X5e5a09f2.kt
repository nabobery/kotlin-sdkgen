package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/StreamEventsResponseOutputItemAdded/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/StreamEventsResponseOutputItemAdded/allOf/1
 */
@Serializable(with = InlineStreamEventsResponseOutputItemAddedAllOf2X5e5a09f2.Serializer::class)
public class InlineStreamEventsResponseOutputItemAddedAllOf2X5e5a09f2(
  public val item: OutputItems? = null,
) {
  public class Builder {
    public var item: OutputItems? = null

    public fun build(): InlineStreamEventsResponseOutputItemAddedAllOf2X5e5a09f2 = InlineStreamEventsResponseOutputItemAddedAllOf2X5e5a09f2(
      item = item,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineStreamEventsResponseOutputItemAddedAllOf2X5e5a09f2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineStreamEventsResponseOutputItemAddedAllOf2X5e5a09f2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineStreamEventsResponseOutputItemAddedAllOf2X5e5a09f2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineStreamEventsResponseOutputItemAddedAllOf2X5e5a09f2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineStreamEventsResponseOutputItemAddedAllOf2X5e5a09f2 must be a JSON object")
      return InlineStreamEventsResponseOutputItemAddedAllOf2X5e5a09f2(
        item = rawObject["item"]?.let { json.decodeFromJsonElement<OutputItems>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineStreamEventsResponseOutputItemAddedAllOf2X5e5a09f2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineStreamEventsResponseOutputItemAddedAllOf2X5e5a09f2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.item?.let { put("item", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineStreamEventsResponseOutputItemAddedAllOf2X5e5a09f2(block: InlineStreamEventsResponseOutputItemAddedAllOf2X5e5a09f2.Builder.() -> Unit): InlineStreamEventsResponseOutputItemAddedAllOf2X5e5a09f2 = InlineStreamEventsResponseOutputItemAddedAllOf2X5e5a09f2.build(block)
