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
 * Image generation call with partial image
 */
@Serializable(with = ImageGenCallPartialImageEvent.Serializer::class)
public class ImageGenCallPartialImageEvent(
  public val itemId: String,
  public val outputIndex: Int,
  public val partialImageB64: String,
  public val partialImageIndex: Int,
  public val sequenceNumber: Int,
  public val type: InlineComponentsSchemasOpenAiResponsesImageGenCallPartialImagePropertiesType,
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

    private var partialImageB64Value: String? = null

    public var partialImageB64: String
      get() = requireNotNull(partialImageB64Value) { "partialImageB64 is required" }
      set(`value`) {
        partialImageB64Value = value
      }

    private var partialImageIndexValue: Int? = null

    public var partialImageIndex: Int
      get() = requireNotNull(partialImageIndexValue) { "partialImageIndex is required" }
      set(`value`) {
        partialImageIndexValue = value
      }

    private var sequenceNumberValue: Int? = null

    public var sequenceNumber: Int
      get() = requireNotNull(sequenceNumberValue) { "sequenceNumber is required" }
      set(`value`) {
        sequenceNumberValue = value
      }

    private var typeValue:
        InlineComponentsSchemasOpenAiResponsesImageGenCallPartialImagePropertiesType? = null

    public var type: InlineComponentsSchemasOpenAiResponsesImageGenCallPartialImagePropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): ImageGenCallPartialImageEvent {
      check(itemIdValue != null) { "itemId is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(partialImageB64Value != null) { "partialImageB64 is required" }
      check(partialImageIndexValue != null) { "partialImageIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return ImageGenCallPartialImageEvent(
        itemId = itemId,
        outputIndex = outputIndex,
        partialImageB64 = partialImageB64,
        partialImageIndex = partialImageIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ImageGenCallPartialImageEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ImageGenCallPartialImageEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImageGenCallPartialImageEvent {
      val jsonDecoder = decoder.requireJsonDecoder("ImageGenCallPartialImageEvent")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ImageGenCallPartialImageEvent must be a JSON object")
      val itemId = json.decodeRequired<String>(raw, "item_id")
      val outputIndex = json.decodeRequired<Int>(raw, "output_index")
      val partialImageB64 = json.decodeRequired<String>(raw, "partial_image_b64")
      val partialImageIndex = json.decodeRequired<Int>(raw, "partial_image_index")
      val sequenceNumber = json.decodeRequired<Int>(raw, "sequence_number")
      val type = json.decodeRequired<InlineComponentsSchemasOpenAiResponsesImageGenCallPartialImagePropertiesType>(raw,
        "type")
      return ImageGenCallPartialImageEvent(
        itemId = itemId,
        outputIndex = outputIndex,
        partialImageB64 = partialImageB64,
        partialImageIndex = partialImageIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ImageGenCallPartialImageEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("ImageGenCallPartialImageEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("item_id", value.itemId)
        put("output_index", json.encodeToJsonElement(value.outputIndex))
        put("partial_image_b64", value.partialImageB64)
        put("partial_image_index", json.encodeToJsonElement(value.partialImageIndex))
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun imageGenCallPartialImageEvent(block: ImageGenCallPartialImageEvent.Builder.() ->
  Unit): ImageGenCallPartialImageEvent = ImageGenCallPartialImageEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("ImageGenCallPartialImageEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
