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
 * Event emitted when a new output item is added to the response
 */
@Serializable(with = OutputItemAddedEvent.Serializer::class)
public class OutputItemAddedEvent(
  public val item: InlineComponentsSchemasOutputItemAddedEventPropertiesItem,
  public val outputIndex: Int,
  public val sequenceNumber: Int,
  public val type: InlineComponentsSchemasOutputItemAddedEventPropertiesType,
) {
  public class Builder {
    private var itemValue: InlineComponentsSchemasOutputItemAddedEventPropertiesItem? = null

    public var item: InlineComponentsSchemasOutputItemAddedEventPropertiesItem
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

    private var typeValue: InlineComponentsSchemasOutputItemAddedEventPropertiesType? = null

    public var type: InlineComponentsSchemasOutputItemAddedEventPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): OutputItemAddedEvent {
      check(itemValue != null) { "item is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return OutputItemAddedEvent(
        item = item,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputItemAddedEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OutputItemAddedEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputItemAddedEvent {
      val jsonDecoder = decoder.requireJsonDecoder("OutputItemAddedEvent")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("OutputItemAddedEvent must be a JSON object")
      val item = json.decodeRequired<InlineComponentsSchemasOutputItemAddedEventPropertiesItem>(raw, "item")
      val outputIndex = json.decodeRequired<Int>(raw, "output_index")
      val sequenceNumber = json.decodeRequired<Int>(raw, "sequence_number")
      val type = json.decodeRequired<InlineComponentsSchemasOutputItemAddedEventPropertiesType>(raw, "type")
      return OutputItemAddedEvent(
        item = item,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputItemAddedEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputItemAddedEvent")
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

public fun outputItemAddedEvent(block: OutputItemAddedEvent.Builder.() -> Unit): OutputItemAddedEvent =
  OutputItemAddedEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputItemAddedEvent is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
