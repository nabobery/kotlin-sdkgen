package io.github.nabobery.sdkgen.generated

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
 * Event emitted when a new content part is added to an output item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseContentPartAddedEvent
 */
@Serializable(with = BaseContentPartAddedEvent.Serializer::class)
public class BaseContentPartAddedEvent(
  public val contentIndex: Int,
  public val itemId: String,
  public val outputIndex: Int,
  public val part: InlineBaseContentPartAddedEventPartXe4ac1bd0,
  public val sequenceNumber: Int,
  public val type: InlineBaseContentPartAddedEventTypeXef1bd9f5,
) {
  public class Builder {
    private var contentIndexValue: Int? = null

    public var contentIndex: Int
      get() = requireNotNull(contentIndexValue) { "contentIndex is required" }
      set(`value`) {
        contentIndexValue = value
      }

    private var itemIdValue: String? = null

    public var itemId: String
      get() = requireNotNull(itemIdValue) { "itemId is required" }
      set(`value`) {
        itemIdValue = value
      }

    private var outputIndexValue: Int? = null

    public var outputIndex: Int
      get() = requireNotNull(outputIndexValue) { "outputIndex is required" }
      set(`value`) {
        outputIndexValue = value
      }

    private var partValue: InlineBaseContentPartAddedEventPartXe4ac1bd0? = null

    public var part: InlineBaseContentPartAddedEventPartXe4ac1bd0
      get() = requireNotNull(partValue) { "part is required" }
      set(`value`) {
        partValue = value
      }

    private var sequenceNumberValue: Int? = null

    public var sequenceNumber: Int
      get() = requireNotNull(sequenceNumberValue) { "sequenceNumber is required" }
      set(`value`) {
        sequenceNumberValue = value
      }

    private var typeValue: InlineBaseContentPartAddedEventTypeXef1bd9f5? = null

    public var type: InlineBaseContentPartAddedEventTypeXef1bd9f5
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): BaseContentPartAddedEvent {
      check(contentIndexValue != null) { "contentIndex is required" }
      check(itemIdValue != null) { "itemId is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(partValue != null) { "part is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return BaseContentPartAddedEvent(
        contentIndex = contentIndex,
        itemId = itemId,
        outputIndex = outputIndex,
        part = part,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BaseContentPartAddedEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BaseContentPartAddedEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BaseContentPartAddedEvent {
      val jsonDecoder = decoder.requireJsonDecoder("BaseContentPartAddedEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BaseContentPartAddedEvent must be a JSON object")
      val contentIndex = json.decodeRequired<Int>(rawObject, "content_index")
      val itemId = json.decodeRequired<String>(rawObject, "item_id")
      val outputIndex = json.decodeRequired<Int>(rawObject, "output_index")
      val part = json.decodeRequired<InlineBaseContentPartAddedEventPartXe4ac1bd0>(rawObject, "part")
      val sequenceNumber = json.decodeRequired<Int>(rawObject, "sequence_number")
      val type = json.decodeRequired<InlineBaseContentPartAddedEventTypeXef1bd9f5>(rawObject, "type")
      return BaseContentPartAddedEvent(
        contentIndex = contentIndex,
        itemId = itemId,
        outputIndex = outputIndex,
        part = part,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BaseContentPartAddedEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("BaseContentPartAddedEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content_index", json.encodeToJsonElement(value.contentIndex))
        put("item_id", value.itemId)
        put("output_index", json.encodeToJsonElement(value.outputIndex))
        put("part", json.encodeToJsonElement(value.part))
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun baseContentPartAddedEvent(block: BaseContentPartAddedEvent.Builder.() -> Unit): BaseContentPartAddedEvent = BaseContentPartAddedEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BaseContentPartAddedEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
