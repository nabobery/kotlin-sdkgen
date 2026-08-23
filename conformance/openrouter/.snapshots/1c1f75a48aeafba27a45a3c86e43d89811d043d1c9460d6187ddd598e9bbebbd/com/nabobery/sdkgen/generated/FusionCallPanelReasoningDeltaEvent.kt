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
 * Incremental reasoning token from a fusion panel model.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionCallPanelReasoningDeltaEvent
 */
@Serializable(with = FusionCallPanelReasoningDeltaEvent.Serializer::class)
public class FusionCallPanelReasoningDeltaEvent(
  public val delta: String,
  public val itemId: String,
  public val model: String,
  public val outputIndex: Int,
  public val sequenceNumber: Int,
  public val type: InlineFusionCallPanelReasoningDeltaEventTypeX6c55d981,
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

    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
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

    private var typeValue: InlineFusionCallPanelReasoningDeltaEventTypeX6c55d981? = null

    public var type: InlineFusionCallPanelReasoningDeltaEventTypeX6c55d981
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): FusionCallPanelReasoningDeltaEvent {
      check(deltaValue != null) { "delta is required" }
      check(itemIdValue != null) { "itemId is required" }
      check(modelValue != null) { "model is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return FusionCallPanelReasoningDeltaEvent(
        delta = delta,
        itemId = itemId,
        model = model,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FusionCallPanelReasoningDeltaEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FusionCallPanelReasoningDeltaEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FusionCallPanelReasoningDeltaEvent {
      val jsonDecoder = decoder.requireJsonDecoder("FusionCallPanelReasoningDeltaEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FusionCallPanelReasoningDeltaEvent must be a JSON object")
      val delta = json.decodeRequired<String>(rawObject, "delta")
      val itemId = json.decodeRequired<String>(rawObject, "item_id")
      val model = json.decodeRequired<String>(rawObject, "model")
      val outputIndex = json.decodeRequired<Int>(rawObject, "output_index")
      val sequenceNumber = json.decodeRequired<Int>(rawObject, "sequence_number")
      val type = json.decodeRequired<InlineFusionCallPanelReasoningDeltaEventTypeX6c55d981>(rawObject, "type")
      return FusionCallPanelReasoningDeltaEvent(
        delta = delta,
        itemId = itemId,
        model = model,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FusionCallPanelReasoningDeltaEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("FusionCallPanelReasoningDeltaEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("delta", value.delta)
        put("item_id", value.itemId)
        put("model", value.model)
        put("output_index", json.encodeToJsonElement(value.outputIndex))
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fusionCallPanelReasoningDeltaEvent(block: FusionCallPanelReasoningDeltaEvent.Builder.() -> Unit): FusionCallPanelReasoningDeltaEvent = FusionCallPanelReasoningDeltaEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FusionCallPanelReasoningDeltaEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
