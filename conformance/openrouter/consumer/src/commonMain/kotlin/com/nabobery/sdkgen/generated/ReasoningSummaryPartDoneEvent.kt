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
 * Event emitted when a reasoning summary part is complete
 */
@Serializable(with = ReasoningSummaryPartDoneEvent.Serializer::class)
public class ReasoningSummaryPartDoneEvent(
  public val itemId: String,
  public val outputIndex: Int,
  public val part: ReasoningSummaryText,
  public val sequenceNumber: Int,
  public val summaryIndex: Int,
  public val type: InlineComponentsSchemasBaseReasoningSummaryPartDoneEventPropertiesType,
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

    private var partValue: ReasoningSummaryText? = null

    public var part: ReasoningSummaryText
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

    private var summaryIndexValue: Int? = null

    public var summaryIndex: Int
      get() = requireNotNull(summaryIndexValue) { "summaryIndex is required" }
      set(`value`) {
        summaryIndexValue = value
      }

    private var typeValue: InlineComponentsSchemasBaseReasoningSummaryPartDoneEventPropertiesType? =
        null

    public var type: InlineComponentsSchemasBaseReasoningSummaryPartDoneEventPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ReasoningSummaryPartDoneEvent {
      check(itemIdValue != null) { "itemId is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(partValue != null) { "part is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(summaryIndexValue != null) { "summaryIndex is required" }
      check(typeValue != null) { "type is required" }
      return ReasoningSummaryPartDoneEvent(
        itemId = itemId,
        outputIndex = outputIndex,
        part = part,
        sequenceNumber = sequenceNumber,
        summaryIndex = summaryIndex,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ReasoningSummaryPartDoneEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ReasoningSummaryPartDoneEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ReasoningSummaryPartDoneEvent {
      val jsonDecoder = decoder.requireJsonDecoder("ReasoningSummaryPartDoneEvent")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ReasoningSummaryPartDoneEvent must be a JSON object")
      val itemId = json.decodeRequired<String>(raw, "item_id")
      val outputIndex = json.decodeRequired<Int>(raw, "output_index")
      val part = json.decodeRequired<ReasoningSummaryText>(raw, "part")
      val sequenceNumber = json.decodeRequired<Int>(raw, "sequence_number")
      val summaryIndex = json.decodeRequired<Int>(raw, "summary_index")
      val type = json.decodeRequired<InlineComponentsSchemasBaseReasoningSummaryPartDoneEventPropertiesType>(raw,
        "type")
      return ReasoningSummaryPartDoneEvent(
        itemId = itemId,
        outputIndex = outputIndex,
        part = part,
        sequenceNumber = sequenceNumber,
        summaryIndex = summaryIndex,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ReasoningSummaryPartDoneEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("ReasoningSummaryPartDoneEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("item_id", value.itemId)
        put("output_index", json.encodeToJsonElement(value.outputIndex))
        put("part", json.encodeToJsonElement(value.part))
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("summary_index", json.encodeToJsonElement(value.summaryIndex))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun reasoningSummaryPartDoneEvent(block: ReasoningSummaryPartDoneEvent.Builder.() ->
  Unit): ReasoningSummaryPartDoneEvent = ReasoningSummaryPartDoneEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("ReasoningSummaryPartDoneEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
