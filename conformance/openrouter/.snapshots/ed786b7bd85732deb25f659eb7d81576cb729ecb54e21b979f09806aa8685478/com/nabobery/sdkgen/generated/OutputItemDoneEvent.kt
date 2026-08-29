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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemDoneEvent
 */
@Serializable(with = OutputItemDoneEvent.Serializer::class)
public class OutputItemDoneEvent(
  public val item: InlineOutputItemDoneEventItemX65f99cf0,
  public val outputIndex: Int,
  public val sequenceNumber: Int,
  public val type: InlineOutputItemDoneEventTypeX3fc126fd,
) {
  public class Builder {
    private var itemValue: InlineOutputItemDoneEventItemX65f99cf0? = null

    public var item: InlineOutputItemDoneEventItemX65f99cf0
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

    public fun build(): OutputItemDoneEvent {
      check(itemValue != null) { "item is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return OutputItemDoneEvent(
        item = item,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputItemDoneEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputItemDoneEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputItemDoneEvent {
      val jsonDecoder = decoder.requireJsonDecoder("OutputItemDoneEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputItemDoneEvent must be a JSON object")
      val item = json.decodeRequired<InlineOutputItemDoneEventItemX65f99cf0>(rawObject, "item")
      val outputIndex = json.decodeRequired<Int>(rawObject, "output_index")
      val sequenceNumber = json.decodeRequired<Int>(rawObject, "sequence_number")
      val type = json.decodeRequired<InlineOutputItemDoneEventTypeX3fc126fd>(rawObject, "type")
      return OutputItemDoneEvent(
        item = item,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputItemDoneEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputItemDoneEvent")
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

public fun outputItemDoneEvent(block: OutputItemDoneEvent.Builder.() -> Unit): OutputItemDoneEvent = OutputItemDoneEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputItemDoneEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
