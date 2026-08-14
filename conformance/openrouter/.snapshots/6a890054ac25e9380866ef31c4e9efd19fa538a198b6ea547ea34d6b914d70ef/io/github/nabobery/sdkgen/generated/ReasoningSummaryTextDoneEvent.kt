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
 * Event emitted when reasoning summary text streaming is complete
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ReasoningSummaryTextDoneEvent
 */
@Serializable(with = ReasoningSummaryTextDoneEvent.Serializer::class)
public class ReasoningSummaryTextDoneEvent(
  public val itemId: String,
  public val outputIndex: Int,
  public val sequenceNumber: Int,
  public val summaryIndex: Int,
  public val text: String,
  public val type: InlineBaseReasoningSummaryTextDoneEventTypeXe9871e5b,
) {
  public class Builder {
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

    private var summaryIndexValue: Int? = null

    public var summaryIndex: Int
      get() = requireNotNull(summaryIndexValue) { "summaryIndex is required" }
      set(`value`) {
        summaryIndexValue = value
      }

    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    private var typeValue: InlineBaseReasoningSummaryTextDoneEventTypeXe9871e5b? = null

    public var type: InlineBaseReasoningSummaryTextDoneEventTypeXe9871e5b
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ReasoningSummaryTextDoneEvent {
      check(itemIdValue != null) { "itemId is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(summaryIndexValue != null) { "summaryIndex is required" }
      check(textValue != null) { "text is required" }
      check(typeValue != null) { "type is required" }
      return ReasoningSummaryTextDoneEvent(
        itemId = itemId,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        summaryIndex = summaryIndex,
        text = text,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ReasoningSummaryTextDoneEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ReasoningSummaryTextDoneEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ReasoningSummaryTextDoneEvent {
      val jsonDecoder = decoder.requireJsonDecoder("ReasoningSummaryTextDoneEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ReasoningSummaryTextDoneEvent must be a JSON object")
      val itemId = json.decodeRequired<String>(rawObject, "item_id")
      val outputIndex = json.decodeRequired<Int>(rawObject, "output_index")
      val sequenceNumber = json.decodeRequired<Int>(rawObject, "sequence_number")
      val summaryIndex = json.decodeRequired<Int>(rawObject, "summary_index")
      val text = json.decodeRequired<String>(rawObject, "text")
      val type = json.decodeRequired<InlineBaseReasoningSummaryTextDoneEventTypeXe9871e5b>(rawObject, "type")
      return ReasoningSummaryTextDoneEvent(
        itemId = itemId,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        summaryIndex = summaryIndex,
        text = text,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ReasoningSummaryTextDoneEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("ReasoningSummaryTextDoneEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("item_id", value.itemId)
        put("output_index", json.encodeToJsonElement(value.outputIndex))
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("summary_index", json.encodeToJsonElement(value.summaryIndex))
        put("text", value.text)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun reasoningSummaryTextDoneEvent(block: ReasoningSummaryTextDoneEvent.Builder.() -> Unit): ReasoningSummaryTextDoneEvent = ReasoningSummaryTextDoneEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ReasoningSummaryTextDoneEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
