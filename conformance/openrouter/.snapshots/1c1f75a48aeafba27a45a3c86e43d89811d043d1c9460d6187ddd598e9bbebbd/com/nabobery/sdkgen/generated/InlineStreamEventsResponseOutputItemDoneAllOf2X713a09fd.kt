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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/StreamEventsResponseOutputItemDone/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/StreamEventsResponseOutputItemDone/allOf/1
 */
@Serializable(with = InlineStreamEventsResponseOutputItemDoneAllOf2X713a09fd.Serializer::class)
public class InlineStreamEventsResponseOutputItemDoneAllOf2X713a09fd(
  public val item: OutputItems? = null,
) {
  public class Builder {
    public var item: OutputItems? = null

    public fun build(): InlineStreamEventsResponseOutputItemDoneAllOf2X713a09fd = InlineStreamEventsResponseOutputItemDoneAllOf2X713a09fd(
      item = item,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineStreamEventsResponseOutputItemDoneAllOf2X713a09fd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineStreamEventsResponseOutputItemDoneAllOf2X713a09fd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineStreamEventsResponseOutputItemDoneAllOf2X713a09fd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineStreamEventsResponseOutputItemDoneAllOf2X713a09fd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineStreamEventsResponseOutputItemDoneAllOf2X713a09fd must be a JSON object")
      return InlineStreamEventsResponseOutputItemDoneAllOf2X713a09fd(
        item = rawObject["item"]?.let { json.decodeFromJsonElement<OutputItems>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineStreamEventsResponseOutputItemDoneAllOf2X713a09fd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineStreamEventsResponseOutputItemDoneAllOf2X713a09fd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.item?.let { put("item", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineStreamEventsResponseOutputItemDoneAllOf2X713a09fd(block: InlineStreamEventsResponseOutputItemDoneAllOf2X713a09fd.Builder.() -> Unit): InlineStreamEventsResponseOutputItemDoneAllOf2X713a09fd = InlineStreamEventsResponseOutputItemDoneAllOf2X713a09fd.build(block)
