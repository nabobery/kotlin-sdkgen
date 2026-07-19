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
 * Event emitted when refusal streaming is complete
 */
@Serializable(with = RefusalDoneEvent.Serializer::class)
public class RefusalDoneEvent(
  public val contentIndex: Int,
  public val itemId: String,
  public val outputIndex: Int,
  public val refusal: String,
  public val sequenceNumber: Int,
  public val type: InlineComponentsSchemasBaseRefusalDoneEventPropertiesType,
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

    private var refusalValue: String? = null

    public var refusal: String
      get() = requireNotNull(refusalValue) { "refusal is required" }
      set(`value`) {
        refusalValue = value
      }

    private var sequenceNumberValue: Int? = null

    public var sequenceNumber: Int
      get() = requireNotNull(sequenceNumberValue) { "sequenceNumber is required" }
      set(`value`) {
        sequenceNumberValue = value
      }

    private var typeValue: InlineComponentsSchemasBaseRefusalDoneEventPropertiesType? = null

    public var type: InlineComponentsSchemasBaseRefusalDoneEventPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): RefusalDoneEvent {
      check(contentIndexValue != null) { "contentIndex is required" }
      check(itemIdValue != null) { "itemId is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(refusalValue != null) { "refusal is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return RefusalDoneEvent(
        contentIndex = contentIndex,
        itemId = itemId,
        outputIndex = outputIndex,
        refusal = refusal,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RefusalDoneEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RefusalDoneEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RefusalDoneEvent {
      val jsonDecoder = decoder.requireJsonDecoder("RefusalDoneEvent")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("RefusalDoneEvent must be a JSON object")
      val contentIndex = json.decodeRequired<Int>(raw, "content_index")
      val itemId = json.decodeRequired<String>(raw, "item_id")
      val outputIndex = json.decodeRequired<Int>(raw, "output_index")
      val refusal = json.decodeRequired<String>(raw, "refusal")
      val sequenceNumber = json.decodeRequired<Int>(raw, "sequence_number")
      val type = json.decodeRequired<InlineComponentsSchemasBaseRefusalDoneEventPropertiesType>(raw, "type")
      return RefusalDoneEvent(
        contentIndex = contentIndex,
        itemId = itemId,
        outputIndex = outputIndex,
        refusal = refusal,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RefusalDoneEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("RefusalDoneEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content_index", json.encodeToJsonElement(value.contentIndex))
        put("item_id", value.itemId)
        put("output_index", json.encodeToJsonElement(value.outputIndex))
        put("refusal", value.refusal)
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun refusalDoneEvent(block: RefusalDoneEvent.Builder.() -> Unit): RefusalDoneEvent = RefusalDoneEvent
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RefusalDoneEvent is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
