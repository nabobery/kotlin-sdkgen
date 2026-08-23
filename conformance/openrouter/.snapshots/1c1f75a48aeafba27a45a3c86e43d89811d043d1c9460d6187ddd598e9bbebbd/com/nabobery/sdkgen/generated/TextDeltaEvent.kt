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
 * Event emitted when a text delta is streamed
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/TextDeltaEvent
 */
@Serializable(with = TextDeltaEvent.Serializer::class)
public class TextDeltaEvent(
  public val contentIndex: Int,
  public val delta: String,
  public val itemId: String,
  logprobs: List<StreamLogprob>,
  public val outputIndex: Int,
  public val sequenceNumber: Int,
  public val type: InlineBaseTextDeltaEventTypeX34a64077,
) {
  public val logprobs: List<StreamLogprob> = logprobs.toList()

  public class Builder {
    private var contentIndexValue: Int? = null

    public var contentIndex: Int
      get() = requireNotNull(contentIndexValue) { "contentIndex is required" }
      set(`value`) {
        contentIndexValue = value
      }

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

    private var logprobsValue: List<StreamLogprob>? = null

    public var logprobs: List<StreamLogprob>
      get() = requireNotNull(logprobsValue) { "logprobs is required" }.toList()
      set(`value`) {
        logprobsValue = value.toList()
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

    private var typeValue: InlineBaseTextDeltaEventTypeX34a64077? = null

    public var type: InlineBaseTextDeltaEventTypeX34a64077
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): TextDeltaEvent {
      check(contentIndexValue != null) { "contentIndex is required" }
      check(deltaValue != null) { "delta is required" }
      check(itemIdValue != null) { "itemId is required" }
      check(logprobsValue != null) { "logprobs is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return TextDeltaEvent(
        contentIndex = contentIndex,
        delta = delta,
        itemId = itemId,
        logprobs = logprobs,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TextDeltaEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TextDeltaEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TextDeltaEvent {
      val jsonDecoder = decoder.requireJsonDecoder("TextDeltaEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TextDeltaEvent must be a JSON object")
      val contentIndex = json.decodeRequired<Int>(rawObject, "content_index")
      val delta = json.decodeRequired<String>(rawObject, "delta")
      val itemId = json.decodeRequired<String>(rawObject, "item_id")
      val logprobs = json.decodeRequired<List<StreamLogprob>>(rawObject, "logprobs")
      val outputIndex = json.decodeRequired<Int>(rawObject, "output_index")
      val sequenceNumber = json.decodeRequired<Int>(rawObject, "sequence_number")
      val type = json.decodeRequired<InlineBaseTextDeltaEventTypeX34a64077>(rawObject, "type")
      return TextDeltaEvent(
        contentIndex = contentIndex,
        delta = delta,
        itemId = itemId,
        logprobs = logprobs,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TextDeltaEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("TextDeltaEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content_index", json.encodeToJsonElement(value.contentIndex))
        put("delta", value.delta)
        put("item_id", value.itemId)
        put("logprobs", json.encodeToJsonElement(value.logprobs))
        put("output_index", json.encodeToJsonElement(value.outputIndex))
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun textDeltaEvent(block: TextDeltaEvent.Builder.() -> Unit): TextDeltaEvent = TextDeltaEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TextDeltaEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
