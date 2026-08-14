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
 * Event sent when a content block is complete
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockStopEvent
 */
@Serializable(with = MessagesContentBlockStopEvent.Serializer::class)
public class MessagesContentBlockStopEvent(
  public val index: Int,
  public val type: InlineMessagesContentBlockStopEventTypeXac1e8a22,
) {
  public class Builder {
    private var indexValue: Int? = null

    public var index: Int
      get() = requireNotNull(indexValue) { "index is required" }
      set(`value`) {
        indexValue = value
      }

    private var typeValue: InlineMessagesContentBlockStopEventTypeXac1e8a22? = null

    public var type: InlineMessagesContentBlockStopEventTypeXac1e8a22
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): MessagesContentBlockStopEvent {
      check(indexValue != null) { "index is required" }
      check(typeValue != null) { "type is required" }
      return MessagesContentBlockStopEvent(
        index = index,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MessagesContentBlockStopEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<MessagesContentBlockStopEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MessagesContentBlockStopEvent {
      val jsonDecoder = decoder.requireJsonDecoder("MessagesContentBlockStopEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MessagesContentBlockStopEvent must be a JSON object")
      val index = json.decodeRequired<Int>(rawObject, "index")
      val type = json.decodeRequired<InlineMessagesContentBlockStopEventTypeXac1e8a22>(rawObject, "type")
      return MessagesContentBlockStopEvent(
        index = index,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: MessagesContentBlockStopEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("MessagesContentBlockStopEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("index", json.encodeToJsonElement(value.index))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun messagesContentBlockStopEvent(block: MessagesContentBlockStopEvent.Builder.() -> Unit): MessagesContentBlockStopEvent = MessagesContentBlockStopEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MessagesContentBlockStopEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
