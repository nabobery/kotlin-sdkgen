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
 * Event sent when content is added to a content block
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent
 */
@Serializable(with = MessagesContentBlockDeltaEvent.Serializer::class)
public class MessagesContentBlockDeltaEvent(
  public val delta: InlineMessagesContentBlockDeltaEventDeltaX956b8ed8,
  public val index: Int,
  public val type: InlineMessagesContentBlockDeltaEventTypeXceafe8ab,
) {
  public class Builder {
    private var deltaValue: InlineMessagesContentBlockDeltaEventDeltaX956b8ed8? = null

    public var delta: InlineMessagesContentBlockDeltaEventDeltaX956b8ed8
      get() = requireNotNull(deltaValue) { "delta is required" }
      set(`value`) {
        deltaValue = value
      }

    private var indexValue: Int? = null

    public var index: Int
      get() = requireNotNull(indexValue) { "index is required" }
      set(`value`) {
        indexValue = value
      }

    private var typeValue: InlineMessagesContentBlockDeltaEventTypeXceafe8ab? = null

    public var type: InlineMessagesContentBlockDeltaEventTypeXceafe8ab
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): MessagesContentBlockDeltaEvent {
      check(deltaValue != null) { "delta is required" }
      check(indexValue != null) { "index is required" }
      check(typeValue != null) { "type is required" }
      return MessagesContentBlockDeltaEvent(
        delta = delta,
        index = index,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MessagesContentBlockDeltaEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<MessagesContentBlockDeltaEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MessagesContentBlockDeltaEvent {
      val jsonDecoder = decoder.requireJsonDecoder("MessagesContentBlockDeltaEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MessagesContentBlockDeltaEvent must be a JSON object")
      val delta = json.decodeRequired<InlineMessagesContentBlockDeltaEventDeltaX956b8ed8>(rawObject, "delta")
      val index = json.decodeRequired<Int>(rawObject, "index")
      val type = json.decodeRequired<InlineMessagesContentBlockDeltaEventTypeXceafe8ab>(rawObject, "type")
      return MessagesContentBlockDeltaEvent(
        delta = delta,
        index = index,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: MessagesContentBlockDeltaEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("MessagesContentBlockDeltaEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("delta", json.encodeToJsonElement(value.delta))
        put("index", json.encodeToJsonElement(value.index))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun messagesContentBlockDeltaEvent(block: MessagesContentBlockDeltaEvent.Builder.() -> Unit): MessagesContentBlockDeltaEvent = MessagesContentBlockDeltaEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MessagesContentBlockDeltaEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
