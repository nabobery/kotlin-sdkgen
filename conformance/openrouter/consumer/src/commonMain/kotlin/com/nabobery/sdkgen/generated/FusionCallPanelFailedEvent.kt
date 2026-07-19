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
 * Emitted when a fusion panel model fails.
 */
@Serializable(with = FusionCallPanelFailedEvent.Serializer::class)
public class FusionCallPanelFailedEvent(
  public val error: String,
  public val itemId: String,
  public val model: String,
  public val outputIndex: Int,
  public val sequenceNumber: Int,
  public val type: InlineComponentsSchemasFusionCallPanelFailedEventPropertiesType,
  public val statusCode: Int? = null,
) {
  public class Builder {
    private var errorValue: String? = null

    public var error: String
      get() = requireNotNull(errorValue) { "error is required" }
      set(`value`) {
        errorValue = value
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

    private var typeValue: InlineComponentsSchemasFusionCallPanelFailedEventPropertiesType? = null

    public var type: InlineComponentsSchemasFusionCallPanelFailedEventPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var statusCode: Int? = null

    public fun build(): FusionCallPanelFailedEvent {
      check(errorValue != null) { "error is required" }
      check(itemIdValue != null) { "itemId is required" }
      check(modelValue != null) { "model is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return FusionCallPanelFailedEvent(
        error = error,
        itemId = itemId,
        model = model,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
        statusCode = statusCode,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FusionCallPanelFailedEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<FusionCallPanelFailedEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FusionCallPanelFailedEvent {
      val jsonDecoder = decoder.requireJsonDecoder("FusionCallPanelFailedEvent")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("FusionCallPanelFailedEvent must be a JSON object")
      val error = json.decodeRequired<String>(raw, "error")
      val itemId = json.decodeRequired<String>(raw, "item_id")
      val model = json.decodeRequired<String>(raw, "model")
      val outputIndex = json.decodeRequired<Int>(raw, "output_index")
      val sequenceNumber = json.decodeRequired<Int>(raw, "sequence_number")
      val type = json.decodeRequired<InlineComponentsSchemasFusionCallPanelFailedEventPropertiesType>(raw, "type")
      return FusionCallPanelFailedEvent(
        error = error,
        itemId = itemId,
        model = model,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
        statusCode = raw["status_code"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: FusionCallPanelFailedEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("FusionCallPanelFailedEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("error", value.error)
        put("item_id", value.itemId)
        put("model", value.model)
        put("output_index", json.encodeToJsonElement(value.outputIndex))
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("type", json.encodeToJsonElement(value.type))
        value.statusCode?.let { put("status_code", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fusionCallPanelFailedEvent(block: FusionCallPanelFailedEvent.Builder.() ->
  Unit): FusionCallPanelFailedEvent = FusionCallPanelFailedEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FusionCallPanelFailedEvent is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
