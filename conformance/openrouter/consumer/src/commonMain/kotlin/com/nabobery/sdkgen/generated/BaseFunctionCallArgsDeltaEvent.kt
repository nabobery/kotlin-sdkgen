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
 * Event emitted when function call arguments are being streamed
 */
@Serializable(with = BaseFunctionCallArgsDeltaEvent.Serializer::class)
public class BaseFunctionCallArgsDeltaEvent(
  public val delta: String,
  public val itemId: String,
  public val outputIndex: Int,
  public val sequenceNumber: Int,
  public val type: InlineComponentsSchemasBaseFunctionCallArgsDeltaEventPropertiesType,
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

    private var typeValue: InlineComponentsSchemasBaseFunctionCallArgsDeltaEventPropertiesType? =
        null

    public var type: InlineComponentsSchemasBaseFunctionCallArgsDeltaEventPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): BaseFunctionCallArgsDeltaEvent {
      check(deltaValue != null) { "delta is required" }
      check(itemIdValue != null) { "itemId is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return BaseFunctionCallArgsDeltaEvent(
        delta = delta,
        itemId = itemId,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BaseFunctionCallArgsDeltaEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BaseFunctionCallArgsDeltaEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BaseFunctionCallArgsDeltaEvent {
      val jsonDecoder = decoder.requireJsonDecoder("BaseFunctionCallArgsDeltaEvent")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("BaseFunctionCallArgsDeltaEvent must be a JSON object")
      val delta = json.decodeRequired<String>(raw, "delta")
      val itemId = json.decodeRequired<String>(raw, "item_id")
      val outputIndex = json.decodeRequired<Int>(raw, "output_index")
      val sequenceNumber = json.decodeRequired<Int>(raw, "sequence_number")
      val type = json.decodeRequired<InlineComponentsSchemasBaseFunctionCallArgsDeltaEventPropertiesType>(raw, "type")
      return BaseFunctionCallArgsDeltaEvent(
        delta = delta,
        itemId = itemId,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BaseFunctionCallArgsDeltaEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("BaseFunctionCallArgsDeltaEvent")
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

public fun baseFunctionCallArgsDeltaEvent(block: BaseFunctionCallArgsDeltaEvent.Builder.() ->
  Unit): BaseFunctionCallArgsDeltaEvent = BaseFunctionCallArgsDeltaEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("BaseFunctionCallArgsDeltaEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
