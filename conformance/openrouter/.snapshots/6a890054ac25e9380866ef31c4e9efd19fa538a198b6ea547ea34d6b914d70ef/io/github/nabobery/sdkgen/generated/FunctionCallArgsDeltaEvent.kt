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
 * Event emitted when function call arguments are being streamed
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FunctionCallArgsDeltaEvent
 */
@Serializable(with = FunctionCallArgsDeltaEvent.Serializer::class)
public class FunctionCallArgsDeltaEvent(
  public val delta: String,
  public val itemId: String,
  public val outputIndex: Int,
  public val sequenceNumber: Int,
  public val type: InlineBaseFunctionCallArgsDeltaEventTypeXc0db7b97,
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

    private var typeValue: InlineBaseFunctionCallArgsDeltaEventTypeXc0db7b97? = null

    public var type: InlineBaseFunctionCallArgsDeltaEventTypeXc0db7b97
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): FunctionCallArgsDeltaEvent {
      check(deltaValue != null) { "delta is required" }
      check(itemIdValue != null) { "itemId is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return FunctionCallArgsDeltaEvent(
        delta = delta,
        itemId = itemId,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FunctionCallArgsDeltaEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FunctionCallArgsDeltaEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FunctionCallArgsDeltaEvent {
      val jsonDecoder = decoder.requireJsonDecoder("FunctionCallArgsDeltaEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FunctionCallArgsDeltaEvent must be a JSON object")
      val delta = json.decodeRequired<String>(rawObject, "delta")
      val itemId = json.decodeRequired<String>(rawObject, "item_id")
      val outputIndex = json.decodeRequired<Int>(rawObject, "output_index")
      val sequenceNumber = json.decodeRequired<Int>(rawObject, "sequence_number")
      val type = json.decodeRequired<InlineBaseFunctionCallArgsDeltaEventTypeXc0db7b97>(rawObject, "type")
      return FunctionCallArgsDeltaEvent(
        delta = delta,
        itemId = itemId,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FunctionCallArgsDeltaEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("FunctionCallArgsDeltaEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
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

public fun functionCallArgsDeltaEvent(block: FunctionCallArgsDeltaEvent.Builder.() -> Unit): FunctionCallArgsDeltaEvent = FunctionCallArgsDeltaEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FunctionCallArgsDeltaEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
