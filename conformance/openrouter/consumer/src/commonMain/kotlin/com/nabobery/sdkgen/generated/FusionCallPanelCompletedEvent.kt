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
 * Emitted when a fusion panel model finishes with its full content.
 */
@Serializable(with = FusionCallPanelCompletedEvent.Serializer::class)
public class FusionCallPanelCompletedEvent(
  public val content: String,
  public val itemId: String,
  public val model: String,
  public val outputIndex: Int,
  public val sequenceNumber: Int,
  public val type: InlineComponentsSchemasFusionCallPanelCompletedEventPropertiesType,
) {
  public class Builder {
    private var contentValue: String? = null

    public var content: String
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
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

    private var typeValue: InlineComponentsSchemasFusionCallPanelCompletedEventPropertiesType? =
        null

    public var type: InlineComponentsSchemasFusionCallPanelCompletedEventPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): FusionCallPanelCompletedEvent {
      check(contentValue != null) { "content is required" }
      check(itemIdValue != null) { "itemId is required" }
      check(modelValue != null) { "model is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return FusionCallPanelCompletedEvent(
        content = content,
        itemId = itemId,
        model = model,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FusionCallPanelCompletedEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<FusionCallPanelCompletedEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FusionCallPanelCompletedEvent {
      val jsonDecoder = decoder.requireJsonDecoder("FusionCallPanelCompletedEvent")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("FusionCallPanelCompletedEvent must be a JSON object")
      val content = json.decodeRequired<String>(raw, "content")
      val itemId = json.decodeRequired<String>(raw, "item_id")
      val model = json.decodeRequired<String>(raw, "model")
      val outputIndex = json.decodeRequired<Int>(raw, "output_index")
      val sequenceNumber = json.decodeRequired<Int>(raw, "sequence_number")
      val type = json.decodeRequired<InlineComponentsSchemasFusionCallPanelCompletedEventPropertiesType>(raw, "type")
      return FusionCallPanelCompletedEvent(
        content = content,
        itemId = itemId,
        model = model,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FusionCallPanelCompletedEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("FusionCallPanelCompletedEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", value.content)
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

public fun fusionCallPanelCompletedEvent(block: FusionCallPanelCompletedEvent.Builder.() ->
  Unit): FusionCallPanelCompletedEvent = FusionCallPanelCompletedEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("FusionCallPanelCompletedEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
