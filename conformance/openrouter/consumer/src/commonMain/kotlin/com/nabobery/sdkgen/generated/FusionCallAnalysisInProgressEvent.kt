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
 * Emitted when the fusion judge starts producing the structured analysis.
 */
@Serializable(with = FusionCallAnalysisInProgressEvent.Serializer::class)
public class FusionCallAnalysisInProgressEvent(
  public val itemId: String,
  public val judgeModel: String,
  public val outputIndex: Int,
  public val sequenceNumber: Int,
  public val type: InlineComponentsSchemasFusionCallAnalysisInProgressEventPropertiesType,
) {
  public class Builder {
    private var itemIdValue: String? = null

    public var itemId: String
      get() = requireNotNull(itemIdValue) { "itemId is required" }
      set(`value`) {
        itemIdValue = value
      }

    private var judgeModelValue: String? = null

    public var judgeModel: String
      get() = requireNotNull(judgeModelValue) { "judgeModel is required" }
      set(`value`) {
        judgeModelValue = value
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

    private var typeValue: InlineComponentsSchemasFusionCallAnalysisInProgressEventPropertiesType? =
        null

    public var type: InlineComponentsSchemasFusionCallAnalysisInProgressEventPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): FusionCallAnalysisInProgressEvent {
      check(itemIdValue != null) { "itemId is required" }
      check(judgeModelValue != null) { "judgeModel is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return FusionCallAnalysisInProgressEvent(
        itemId = itemId,
        judgeModel = judgeModel,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FusionCallAnalysisInProgressEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<FusionCallAnalysisInProgressEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FusionCallAnalysisInProgressEvent {
      val jsonDecoder = decoder.requireJsonDecoder("FusionCallAnalysisInProgressEvent")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("FusionCallAnalysisInProgressEvent must be a JSON object")
      val itemId = json.decodeRequired<String>(raw, "item_id")
      val judgeModel = json.decodeRequired<String>(raw, "judge_model")
      val outputIndex = json.decodeRequired<Int>(raw, "output_index")
      val sequenceNumber = json.decodeRequired<Int>(raw, "sequence_number")
      val type = json.decodeRequired<InlineComponentsSchemasFusionCallAnalysisInProgressEventPropertiesType>(raw,
        "type")
      return FusionCallAnalysisInProgressEvent(
        itemId = itemId,
        judgeModel = judgeModel,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FusionCallAnalysisInProgressEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("FusionCallAnalysisInProgressEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("item_id", value.itemId)
        put("judge_model", value.judgeModel)
        put("output_index", json.encodeToJsonElement(value.outputIndex))
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fusionCallAnalysisInProgressEvent(block: FusionCallAnalysisInProgressEvent.Builder.() ->
  Unit): FusionCallAnalysisInProgressEvent = FusionCallAnalysisInProgressEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("FusionCallAnalysisInProgressEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
