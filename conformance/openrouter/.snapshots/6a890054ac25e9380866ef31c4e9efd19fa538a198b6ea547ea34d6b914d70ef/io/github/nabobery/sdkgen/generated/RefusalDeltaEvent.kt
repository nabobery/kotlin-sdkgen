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
 * Event emitted when a refusal delta is streamed
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/RefusalDeltaEvent
 */
@Serializable(with = RefusalDeltaEvent.Serializer::class)
public class RefusalDeltaEvent(
  public val contentIndex: Int,
  public val delta: String,
  public val itemId: String,
  public val outputIndex: Int,
  public val sequenceNumber: Int,
  public val type: InlineBaseRefusalDeltaEventTypeX772b7e35,
) {
  public class Builder {
    private var contentIndexValue: Int? = null

    public var contentIndex: Int
      get() = requireNotNull(contentIndexValue) { "contentIndex is required" }
      set(`value`) {
        contentIndexValue = value
      }

    private var deltaValue: String? = null

    public var delta: String
      get() = requireNotNull(deltaValue) { "delta is required" }
      set(`value`) {
        deltaValue = value
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

    private var sequenceNumberValue: Int? = null

    public var sequenceNumber: Int
      get() = requireNotNull(sequenceNumberValue) { "sequenceNumber is required" }
      set(`value`) {
        sequenceNumberValue = value
      }

    private var typeValue: InlineBaseRefusalDeltaEventTypeX772b7e35? = null

    public var type: InlineBaseRefusalDeltaEventTypeX772b7e35
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): RefusalDeltaEvent {
      check(contentIndexValue != null) { "contentIndex is required" }
      check(deltaValue != null) { "delta is required" }
      check(itemIdValue != null) { "itemId is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return RefusalDeltaEvent(
        contentIndex = contentIndex,
        delta = delta,
        itemId = itemId,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RefusalDeltaEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RefusalDeltaEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RefusalDeltaEvent {
      val jsonDecoder = decoder.requireJsonDecoder("RefusalDeltaEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RefusalDeltaEvent must be a JSON object")
      val contentIndex = json.decodeRequired<Int>(rawObject, "content_index")
      val delta = json.decodeRequired<String>(rawObject, "delta")
      val itemId = json.decodeRequired<String>(rawObject, "item_id")
      val outputIndex = json.decodeRequired<Int>(rawObject, "output_index")
      val sequenceNumber = json.decodeRequired<Int>(rawObject, "sequence_number")
      val type = json.decodeRequired<InlineBaseRefusalDeltaEventTypeX772b7e35>(rawObject, "type")
      return RefusalDeltaEvent(
        contentIndex = contentIndex,
        delta = delta,
        itemId = itemId,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RefusalDeltaEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("RefusalDeltaEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content_index", json.encodeToJsonElement(value.contentIndex))
        put("delta", value.delta)
        put("item_id", value.itemId)
        put("output_index", json.encodeToJsonElement(value.outputIndex))
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun refusalDeltaEvent(block: RefusalDeltaEvent.Builder.() -> Unit): RefusalDeltaEvent = RefusalDeltaEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RefusalDeltaEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
