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
 * Event emitted when function call arguments streaming is complete
 */
@Serializable(with = BaseFunctionCallArgsDoneEvent.Serializer::class)
public class BaseFunctionCallArgsDoneEvent(
  public val arguments: String,
  public val itemId: String,
  public val name: String,
  public val outputIndex: Int,
  public val sequenceNumber: Int,
  public val type: InlineComponentsSchemasBaseFunctionCallArgsDoneEventPropertiesType,
) {
  public class Builder {
    private var argumentsValue: String? = null

    public var arguments: String
      get() = requireNotNull(argumentsValue) { "arguments is required" }
      set(`value`) {
        argumentsValue = value
      }

    private var itemIdValue: String? = null

    public var itemId: String
      get() = requireNotNull(itemIdValue) { "itemId is required" }
      set(`value`) {
        itemIdValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
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

    private var typeValue: InlineComponentsSchemasBaseFunctionCallArgsDoneEventPropertiesType? =
        null

    public var type: InlineComponentsSchemasBaseFunctionCallArgsDoneEventPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): BaseFunctionCallArgsDoneEvent {
      check(argumentsValue != null) { "arguments is required" }
      check(itemIdValue != null) { "itemId is required" }
      check(nameValue != null) { "name is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return BaseFunctionCallArgsDoneEvent(
        arguments = arguments,
        itemId = itemId,
        name = name,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BaseFunctionCallArgsDoneEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BaseFunctionCallArgsDoneEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BaseFunctionCallArgsDoneEvent {
      val jsonDecoder = decoder.requireJsonDecoder("BaseFunctionCallArgsDoneEvent")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("BaseFunctionCallArgsDoneEvent must be a JSON object")
      val arguments = json.decodeRequired<String>(raw, "arguments")
      val itemId = json.decodeRequired<String>(raw, "item_id")
      val name = json.decodeRequired<String>(raw, "name")
      val outputIndex = json.decodeRequired<Int>(raw, "output_index")
      val sequenceNumber = json.decodeRequired<Int>(raw, "sequence_number")
      val type = json.decodeRequired<InlineComponentsSchemasBaseFunctionCallArgsDoneEventPropertiesType>(raw, "type")
      return BaseFunctionCallArgsDoneEvent(
        arguments = arguments,
        itemId = itemId,
        name = name,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BaseFunctionCallArgsDoneEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("BaseFunctionCallArgsDoneEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("arguments", value.arguments)
        put("item_id", value.itemId)
        put("name", value.name)
        put("output_index", json.encodeToJsonElement(value.outputIndex))
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun baseFunctionCallArgsDoneEvent(block: BaseFunctionCallArgsDoneEvent.Builder.() ->
  Unit): BaseFunctionCallArgsDoneEvent = BaseFunctionCallArgsDoneEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("BaseFunctionCallArgsDoneEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
