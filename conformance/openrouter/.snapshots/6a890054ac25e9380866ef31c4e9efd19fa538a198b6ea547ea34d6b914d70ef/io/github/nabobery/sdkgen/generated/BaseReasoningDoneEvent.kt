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
 * Event emitted when reasoning text streaming is complete
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseReasoningDoneEvent
 */
@Serializable(with = BaseReasoningDoneEvent.Serializer::class)
public class BaseReasoningDoneEvent(
  public val contentIndex: Int,
  public val itemId: String,
  public val outputIndex: Int,
  public val sequenceNumber: Int,
  public val text: String,
  public val type: InlineBaseReasoningDoneEventTypeX1b6171f7,
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

    private var sequenceNumberValue: Int? = null

    public var sequenceNumber: Int
      get() = requireNotNull(sequenceNumberValue) { "sequenceNumber is required" }
      set(`value`) {
        sequenceNumberValue = value
      }

    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    private var typeValue: InlineBaseReasoningDoneEventTypeX1b6171f7? = null

    public var type: InlineBaseReasoningDoneEventTypeX1b6171f7
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): BaseReasoningDoneEvent {
      check(contentIndexValue != null) { "contentIndex is required" }
      check(itemIdValue != null) { "itemId is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(textValue != null) { "text is required" }
      check(typeValue != null) { "type is required" }
      return BaseReasoningDoneEvent(
        contentIndex = contentIndex,
        itemId = itemId,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        text = text,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BaseReasoningDoneEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BaseReasoningDoneEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BaseReasoningDoneEvent {
      val jsonDecoder = decoder.requireJsonDecoder("BaseReasoningDoneEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BaseReasoningDoneEvent must be a JSON object")
      val contentIndex = json.decodeRequired<Int>(rawObject, "content_index")
      val itemId = json.decodeRequired<String>(rawObject, "item_id")
      val outputIndex = json.decodeRequired<Int>(rawObject, "output_index")
      val sequenceNumber = json.decodeRequired<Int>(rawObject, "sequence_number")
      val text = json.decodeRequired<String>(rawObject, "text")
      val type = json.decodeRequired<InlineBaseReasoningDoneEventTypeX1b6171f7>(rawObject, "type")
      return BaseReasoningDoneEvent(
        contentIndex = contentIndex,
        itemId = itemId,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        text = text,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BaseReasoningDoneEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("BaseReasoningDoneEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content_index", json.encodeToJsonElement(value.contentIndex))
        put("item_id", value.itemId)
        put("output_index", json.encodeToJsonElement(value.outputIndex))
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("text", value.text)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun baseReasoningDoneEvent(block: BaseReasoningDoneEvent.Builder.() -> Unit): BaseReasoningDoneEvent = BaseReasoningDoneEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BaseReasoningDoneEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
