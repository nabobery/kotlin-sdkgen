package com.nabobery.sdkgen.generated

import kotlin.Int
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

/**
 * Event emitted when an output item is complete
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/StreamEventsResponseOutputItemDone
 */
@Serializable(with = StreamEventsResponseOutputItemDone.Serializer::class)
public class StreamEventsResponseOutputItemDone(
  public val item: OutputItems,
  public val outputIndex: Int,
  public val sequenceNumber: Int,
  public val type: InlineOutputItemDoneEventTypeX3fc126fd,
) {
  public class Builder {
    private var itemValue: OutputItems? = null

    public var item: OutputItems
      get() = requireNotNull(itemValue) { "item is required" }
      set(`value`) {
        itemValue = value
      }

    private var outputIndexValue: Int? = null

    public var outputIndex: Int
      get() = requireNotNull(outputIndexValue) { "outputIndex is required" }
      set(`value`) {
        outputIndexValue = value
      }

    private var sequenceNumberValue: Int? = null

    public var sequenceNumber: Int
      get() = requireNotNull(sequenceNumberValue) { "sequenceNumber is required" }
      set(`value`) {
        sequenceNumberValue = value
      }

    private var typeValue: InlineOutputItemDoneEventTypeX3fc126fd? = null

    public var type: InlineOutputItemDoneEventTypeX3fc126fd
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): StreamEventsResponseOutputItemDone {
      check(itemValue != null) { "item is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return StreamEventsResponseOutputItemDone(
        item = item,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): StreamEventsResponseOutputItemDone = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<StreamEventsResponseOutputItemDone> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): StreamEventsResponseOutputItemDone {
      val jsonDecoder = decoder.requireJsonDecoder("StreamEventsResponseOutputItemDone")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("StreamEventsResponseOutputItemDone must be a JSON object")
      val item = json.decodeRequired<OutputItems>(rawObject, "item")
      val outputIndex = json.decodeRequired<Int>(rawObject, "output_index")
      val sequenceNumber = json.decodeRequired<Int>(rawObject, "sequence_number")
      val type = json.decodeRequired<InlineOutputItemDoneEventTypeX3fc126fd>(rawObject, "type")
      return StreamEventsResponseOutputItemDone(
        item = item,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: StreamEventsResponseOutputItemDone) {
      val jsonEncoder = encoder.requireJsonEncoder("StreamEventsResponseOutputItemDone")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("item", json.encodeToJsonElement(value.item))
        put("output_index", json.encodeToJsonElement(value.outputIndex))
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun streamEventsResponseOutputItemDone(block: StreamEventsResponseOutputItemDone.Builder.() -> Unit): StreamEventsResponseOutputItemDone = StreamEventsResponseOutputItemDone.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("StreamEventsResponseOutputItemDone is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
