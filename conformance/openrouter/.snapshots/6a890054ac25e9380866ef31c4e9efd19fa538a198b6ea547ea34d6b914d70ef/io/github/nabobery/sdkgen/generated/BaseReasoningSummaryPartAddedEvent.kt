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
 * Event emitted when a reasoning summary part is added
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseReasoningSummaryPartAddedEvent
 */
@Serializable(with = BaseReasoningSummaryPartAddedEvent.Serializer::class)
public class BaseReasoningSummaryPartAddedEvent(
  public val itemId: String,
  public val outputIndex: Int,
  public val part: ReasoningSummaryText,
  public val sequenceNumber: Int,
  public val summaryIndex: Int,
  public val type: InlineBaseReasoningSummaryPartAddedEventTypeX94872cab,
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

    private var typeValue: InlineBaseReasoningSummaryPartAddedEventTypeX94872cab? = null

    public var type: InlineBaseReasoningSummaryPartAddedEventTypeX94872cab
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): BaseReasoningSummaryPartAddedEvent {
      check(itemIdValue != null) { "itemId is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(partValue != null) { "part is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(summaryIndexValue != null) { "summaryIndex is required" }
      check(typeValue != null) { "type is required" }
      return BaseReasoningSummaryPartAddedEvent(
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
    public fun build(block: Builder.() -> Unit): BaseReasoningSummaryPartAddedEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BaseReasoningSummaryPartAddedEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BaseReasoningSummaryPartAddedEvent {
      val jsonDecoder = decoder.requireJsonDecoder("BaseReasoningSummaryPartAddedEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BaseReasoningSummaryPartAddedEvent must be a JSON object")
      val itemId = json.decodeRequired<String>(rawObject, "item_id")
      val outputIndex = json.decodeRequired<Int>(rawObject, "output_index")
      val part = json.decodeRequired<ReasoningSummaryText>(rawObject, "part")
      val sequenceNumber = json.decodeRequired<Int>(rawObject, "sequence_number")
      val summaryIndex = json.decodeRequired<Int>(rawObject, "summary_index")
      val type = json.decodeRequired<InlineBaseReasoningSummaryPartAddedEventTypeX94872cab>(rawObject, "type")
      return BaseReasoningSummaryPartAddedEvent(
        itemId = itemId,
        outputIndex = outputIndex,
        part = part,
        sequenceNumber = sequenceNumber,
        summaryIndex = summaryIndex,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BaseReasoningSummaryPartAddedEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("BaseReasoningSummaryPartAddedEvent")
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

public fun baseReasoningSummaryPartAddedEvent(block: BaseReasoningSummaryPartAddedEvent.Builder.() -> Unit): BaseReasoningSummaryPartAddedEvent = BaseReasoningSummaryPartAddedEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BaseReasoningSummaryPartAddedEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
