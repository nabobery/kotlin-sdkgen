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
 * Error event in the stream
 */
@Serializable(with = MessagesErrorEvent.Serializer::class)
public class MessagesErrorEvent(
  public val error: InlineComponentsSchemasMessagesErrorEventPropertiesError,
  public val type: InlineComponentsSchemasMessagesErrorEventPropertiesType,
  public val openrouterMetadata: OpenRouterMetadata? = null,
) {
  public class Builder {
    private var errorValue: InlineComponentsSchemasMessagesErrorEventPropertiesError? = null

    public var error: InlineComponentsSchemasMessagesErrorEventPropertiesError
      get() = requireNotNull(errorValue) { "error is required" }
      set(`value`) {
        errorValue = value
      }

    private var typeValue: InlineComponentsSchemasMessagesErrorEventPropertiesType? = null

    public var type: InlineComponentsSchemasMessagesErrorEventPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var openrouterMetadata: OpenRouterMetadata? = null

    public fun build(): MessagesErrorEvent {
      check(errorValue != null) { "error is required" }
      check(typeValue != null) { "type is required" }
      return MessagesErrorEvent(
        error = error,
        type = type,
        openrouterMetadata = openrouterMetadata,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MessagesErrorEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<MessagesErrorEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MessagesErrorEvent {
      val jsonDecoder = decoder.requireJsonDecoder("MessagesErrorEvent")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("MessagesErrorEvent must be a JSON object")
      val error = json.decodeRequired<InlineComponentsSchemasMessagesErrorEventPropertiesError>(raw, "error")
      val type = json.decodeRequired<InlineComponentsSchemasMessagesErrorEventPropertiesType>(raw, "type")
      return MessagesErrorEvent(
        error = error,
        type = type,
        openrouterMetadata = raw["openrouter_metadata"]?.let { json.decodeFromJsonElement<OpenRouterMetadata>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: MessagesErrorEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("MessagesErrorEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("error", json.encodeToJsonElement(value.error))
        put("type", json.encodeToJsonElement(value.type))
        value.openrouterMetadata?.let { put("openrouter_metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun messagesErrorEvent(block: MessagesErrorEvent.Builder.() -> Unit): MessagesErrorEvent = MessagesErrorEvent
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MessagesErrorEvent is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
