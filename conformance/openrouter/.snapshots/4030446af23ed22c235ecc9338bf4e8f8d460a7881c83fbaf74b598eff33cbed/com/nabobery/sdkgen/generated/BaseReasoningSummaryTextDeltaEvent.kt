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
 * Event emitted when reasoning summary text delta is streamed
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseReasoningSummaryTextDeltaEvent
 */
@Serializable(with = BaseReasoningSummaryTextDeltaEvent.Serializer::class)
public class BaseReasoningSummaryTextDeltaEvent(
  public val delta: String,
  public val itemId: String,
  public val outputIndex: Int,
  public val sequenceNumber: Int,
  public val summaryIndex: Int,
  public val type: InlineBaseReasoningSummaryTextDeltaEventTypeXf824160f,
) {
  public class Builder {
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

    private var summaryIndexValue: Int? = null

    public var summaryIndex: Int
      get() = requireNotNull(summaryIndexValue) { "summaryIndex is required" }
      set(`value`) {
        summaryIndexValue = value
      }

    private var typeValue: InlineBaseReasoningSummaryTextDeltaEventTypeXf824160f? = null

    public var type: InlineBaseReasoningSummaryTextDeltaEventTypeXf824160f
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): BaseReasoningSummaryTextDeltaEvent {
      check(deltaValue != null) { "delta is required" }
      check(itemIdValue != null) { "itemId is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(summaryIndexValue != null) { "summaryIndex is required" }
      check(typeValue != null) { "type is required" }
      return BaseReasoningSummaryTextDeltaEvent(
        delta = delta,
        itemId = itemId,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        summaryIndex = summaryIndex,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BaseReasoningSummaryTextDeltaEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BaseReasoningSummaryTextDeltaEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BaseReasoningSummaryTextDeltaEvent {
      val jsonDecoder = decoder.requireJsonDecoder("BaseReasoningSummaryTextDeltaEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BaseReasoningSummaryTextDeltaEvent must be a JSON object")
      val delta = json.decodeRequired<String>(rawObject, "delta")
      val itemId = json.decodeRequired<String>(rawObject, "item_id")
      val outputIndex = json.decodeRequired<Int>(rawObject, "output_index")
      val sequenceNumber = json.decodeRequired<Int>(rawObject, "sequence_number")
      val summaryIndex = json.decodeRequired<Int>(rawObject, "summary_index")
      val type = json.decodeRequired<InlineBaseReasoningSummaryTextDeltaEventTypeXf824160f>(rawObject, "type")
      return BaseReasoningSummaryTextDeltaEvent(
        delta = delta,
        itemId = itemId,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        summaryIndex = summaryIndex,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BaseReasoningSummaryTextDeltaEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("BaseReasoningSummaryTextDeltaEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("delta", value.delta)
        put("item_id", value.itemId)
        put("output_index", json.encodeToJsonElement(value.outputIndex))
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("summary_index", json.encodeToJsonElement(value.summaryIndex))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun baseReasoningSummaryTextDeltaEvent(block: BaseReasoningSummaryTextDeltaEvent.Builder.() -> Unit): BaseReasoningSummaryTextDeltaEvent = BaseReasoningSummaryTextDeltaEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BaseReasoningSummaryTextDeltaEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
