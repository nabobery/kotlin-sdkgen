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
 * Emitted when the fusion judge completes with the structured analysis.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionCallAnalysisCompletedEvent
 */
@Serializable(with = FusionCallAnalysisCompletedEvent.Serializer::class)
public class FusionCallAnalysisCompletedEvent(
  public val analysis: FusionAnalysisResult,
  public val itemId: String,
  public val outputIndex: Int,
  public val sequenceNumber: Int,
  public val type: InlineFusionCallAnalysisCompletedEventTypeX2230fa92,
) {
  public class Builder {
    private var analysisValue: FusionAnalysisResult? = null

    public var analysis: FusionAnalysisResult
      get() = requireNotNull(analysisValue) { "analysis is required" }
      set(`value`) {
        analysisValue = value
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

    private var typeValue: InlineFusionCallAnalysisCompletedEventTypeX2230fa92? = null

    public var type: InlineFusionCallAnalysisCompletedEventTypeX2230fa92
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): FusionCallAnalysisCompletedEvent {
      check(analysisValue != null) { "analysis is required" }
      check(itemIdValue != null) { "itemId is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return FusionCallAnalysisCompletedEvent(
        analysis = analysis,
        itemId = itemId,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FusionCallAnalysisCompletedEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FusionCallAnalysisCompletedEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FusionCallAnalysisCompletedEvent {
      val jsonDecoder = decoder.requireJsonDecoder("FusionCallAnalysisCompletedEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FusionCallAnalysisCompletedEvent must be a JSON object")
      val analysis = json.decodeRequired<FusionAnalysisResult>(rawObject, "analysis")
      val itemId = json.decodeRequired<String>(rawObject, "item_id")
      val outputIndex = json.decodeRequired<Int>(rawObject, "output_index")
      val sequenceNumber = json.decodeRequired<Int>(rawObject, "sequence_number")
      val type = json.decodeRequired<InlineFusionCallAnalysisCompletedEventTypeX2230fa92>(rawObject, "type")
      return FusionCallAnalysisCompletedEvent(
        analysis = analysis,
        itemId = itemId,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FusionCallAnalysisCompletedEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("FusionCallAnalysisCompletedEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("analysis", json.encodeToJsonElement(value.analysis))
        put("item_id", value.itemId)
        put("output_index", json.encodeToJsonElement(value.outputIndex))
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fusionCallAnalysisCompletedEvent(block: FusionCallAnalysisCompletedEvent.Builder.() -> Unit): FusionCallAnalysisCompletedEvent = FusionCallAnalysisCompletedEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FusionCallAnalysisCompletedEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
