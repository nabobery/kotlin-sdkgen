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
 * Event sent when a new content block starts
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockStartEvent
 */
@Serializable(with = MessagesContentBlockStartEvent.Serializer::class)
public class MessagesContentBlockStartEvent(
  public val contentBlock: InlineMessagesContentBlockStartEventContentBlockX89752283,
  public val index: Int,
  public val type: InlineMessagesContentBlockStartEventTypeXb466e0f5,
) {
  public class Builder {
    private var contentBlockValue: InlineMessagesContentBlockStartEventContentBlockX89752283? = null

    public var contentBlock: InlineMessagesContentBlockStartEventContentBlockX89752283
      get() = requireNotNull(contentBlockValue) { "contentBlock is required" }
      set(`value`) {
        contentBlockValue = value
      }

    private var indexValue: Int? = null

    public var index: Int
      get() = requireNotNull(indexValue) { "index is required" }
      set(`value`) {
        indexValue = value
      }

    private var typeValue: InlineMessagesContentBlockStartEventTypeXb466e0f5? = null

    public var type: InlineMessagesContentBlockStartEventTypeXb466e0f5
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): MessagesContentBlockStartEvent {
      check(contentBlockValue != null) { "contentBlock is required" }
      check(indexValue != null) { "index is required" }
      check(typeValue != null) { "type is required" }
      return MessagesContentBlockStartEvent(
        contentBlock = contentBlock,
        index = index,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MessagesContentBlockStartEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<MessagesContentBlockStartEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MessagesContentBlockStartEvent {
      val jsonDecoder = decoder.requireJsonDecoder("MessagesContentBlockStartEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MessagesContentBlockStartEvent must be a JSON object")
      val contentBlock = json.decodeRequired<InlineMessagesContentBlockStartEventContentBlockX89752283>(rawObject, "content_block")
      val index = json.decodeRequired<Int>(rawObject, "index")
      val type = json.decodeRequired<InlineMessagesContentBlockStartEventTypeXb466e0f5>(rawObject, "type")
      return MessagesContentBlockStartEvent(
        contentBlock = contentBlock,
        index = index,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: MessagesContentBlockStartEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("MessagesContentBlockStartEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content_block", json.encodeToJsonElement(value.contentBlock))
        put("index", json.encodeToJsonElement(value.index))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun messagesContentBlockStartEvent(block: MessagesContentBlockStartEvent.Builder.() -> Unit): MessagesContentBlockStartEvent = MessagesContentBlockStartEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MessagesContentBlockStartEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
