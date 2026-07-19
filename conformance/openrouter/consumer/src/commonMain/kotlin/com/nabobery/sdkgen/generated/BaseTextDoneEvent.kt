package com.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Event emitted when text streaming is complete
 */
@Serializable(with = BaseTextDoneEvent.Serializer::class)
public class BaseTextDoneEvent(
  public val contentIndex: Int,
  public val itemId: String,
  logprobs: List<OpenResponsesLogProbs>,
  public val outputIndex: Int,
  public val sequenceNumber: Int,
  public val text: String,
  public val type: InlineComponentsSchemasBaseTextDoneEventPropertiesType,
) {
  public val logprobs: List<OpenResponsesLogProbs> = logprobs.toList()

  public class Builder {
    private var contentIndexValue: Int? = null

    public var contentIndex: Int
      get() = requireNotNull(contentIndexValue) { "contentIndex is required" }
      set(`value`) {
        contentIndexValue = value
      }

    private var itemIdValue: String? = null

    public var itemId: String
      get() = requireNotNull(itemIdValue) { "itemId is required" }
      set(`value`) {
        itemIdValue = value
      }

    private var logprobsValue: List<OpenResponsesLogProbs>? = null

    public var logprobs: List<OpenResponsesLogProbs>
      get() = requireNotNull(logprobsValue) { "logprobs is required" }
      set(`value`) {
        logprobsValue = value
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

    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    private var typeValue: InlineComponentsSchemasBaseTextDoneEventPropertiesType? = null

    public var type: InlineComponentsSchemasBaseTextDoneEventPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): BaseTextDoneEvent {
      check(contentIndexValue != null) { "contentIndex is required" }
      check(itemIdValue != null) { "itemId is required" }
      check(logprobsValue != null) { "logprobs is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(textValue != null) { "text is required" }
      check(typeValue != null) { "type is required" }
      return BaseTextDoneEvent(
        contentIndex = contentIndex,
        itemId = itemId,
        logprobs = logprobs,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        text = text,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BaseTextDoneEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<BaseTextDoneEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BaseTextDoneEvent {
      val jsonDecoder = decoder.requireJsonDecoder("BaseTextDoneEvent")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("BaseTextDoneEvent must be a JSON object")
      val contentIndex = json.decodeRequired<Int>(raw, "content_index")
      val itemId = json.decodeRequired<String>(raw, "item_id")
      val logprobs = json.decodeRequired<List<OpenResponsesLogProbs>>(raw, "logprobs")
      val outputIndex = json.decodeRequired<Int>(raw, "output_index")
      val sequenceNumber = json.decodeRequired<Int>(raw, "sequence_number")
      val text = json.decodeRequired<String>(raw, "text")
      val type = json.decodeRequired<InlineComponentsSchemasBaseTextDoneEventPropertiesType>(raw, "type")
      return BaseTextDoneEvent(
        contentIndex = contentIndex,
        itemId = itemId,
        logprobs = logprobs,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        text = text,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: BaseTextDoneEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("BaseTextDoneEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content_index", json.encodeToJsonElement(value.contentIndex))
        put("item_id", value.itemId)
        put("logprobs", json.encodeToJsonElement(value.logprobs))
        put("output_index", json.encodeToJsonElement(value.outputIndex))
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("text", value.text)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun baseTextDoneEvent(block: BaseTextDoneEvent.Builder.() -> Unit): BaseTextDoneEvent = BaseTextDoneEvent
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BaseTextDoneEvent is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
