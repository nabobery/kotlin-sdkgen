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
 * Event sent when the message is complete
 */
@Serializable(with = MessagesStopEvent.Serializer::class)
public class MessagesStopEvent(
  public val type: InlineComponentsSchemasMessagesStopEventPropertiesType,
  public val openrouterMetadata: OpenRouterMetadata? = null,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasMessagesStopEventPropertiesType? = null

    public var type: InlineComponentsSchemasMessagesStopEventPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var openrouterMetadata: OpenRouterMetadata? = null

    public fun build(): MessagesStopEvent {
      check(typeValue != null) { "type is required" }
      return MessagesStopEvent(
        type = type,
        openrouterMetadata = openrouterMetadata,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MessagesStopEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<MessagesStopEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MessagesStopEvent {
      val jsonDecoder = decoder.requireJsonDecoder("MessagesStopEvent")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("MessagesStopEvent must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasMessagesStopEventPropertiesType>(raw, "type")
      return MessagesStopEvent(
        type = type,
        openrouterMetadata = raw["openrouter_metadata"]?.let { json.decodeFromJsonElement<OpenRouterMetadata>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: MessagesStopEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("MessagesStopEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.openrouterMetadata?.let { put("openrouter_metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun messagesStopEvent(block: MessagesStopEvent.Builder.() -> Unit): MessagesStopEvent = MessagesStopEvent
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MessagesStopEvent is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
