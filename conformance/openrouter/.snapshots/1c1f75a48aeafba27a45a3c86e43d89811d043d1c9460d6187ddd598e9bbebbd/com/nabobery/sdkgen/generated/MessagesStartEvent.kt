package com.nabobery.sdkgen.generated

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
 * Event sent at the start of a streaming message
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesStartEvent
 */
@Serializable(with = MessagesStartEvent.Serializer::class)
public class MessagesStartEvent(
  public val message: InlineMessagesStartEventMessageX67927c6f,
  public val type: InlineMessagesStartEventTypeX62ab7b72,
) {
  public class Builder {
    private var messageValue: InlineMessagesStartEventMessageX67927c6f? = null

    public var message: InlineMessagesStartEventMessageX67927c6f
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    private var typeValue: InlineMessagesStartEventTypeX62ab7b72? = null

    public var type: InlineMessagesStartEventTypeX62ab7b72
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): MessagesStartEvent {
      check(messageValue != null) { "message is required" }
      check(typeValue != null) { "type is required" }
      return MessagesStartEvent(
        message = message,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MessagesStartEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<MessagesStartEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MessagesStartEvent {
      val jsonDecoder = decoder.requireJsonDecoder("MessagesStartEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MessagesStartEvent must be a JSON object")
      val message = json.decodeRequired<InlineMessagesStartEventMessageX67927c6f>(rawObject, "message")
      val type = json.decodeRequired<InlineMessagesStartEventTypeX62ab7b72>(rawObject, "type")
      return MessagesStartEvent(
        message = message,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: MessagesStartEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("MessagesStartEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("message", json.encodeToJsonElement(value.message))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun messagesStartEvent(block: MessagesStartEvent.Builder.() -> Unit): MessagesStartEvent = MessagesStartEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MessagesStartEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
