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
 * Keep-alive ping event
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesPingEvent
 */
@Serializable(with = MessagesPingEvent.Serializer::class)
public class MessagesPingEvent(
  public val type: InlineMessagesPingEventTypeX731a5908,
) {
  public class Builder {
    private var typeValue: InlineMessagesPingEventTypeX731a5908? = null

    public var type: InlineMessagesPingEventTypeX731a5908
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): MessagesPingEvent {
      check(typeValue != null) { "type is required" }
      return MessagesPingEvent(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MessagesPingEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<MessagesPingEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MessagesPingEvent {
      val jsonDecoder = decoder.requireJsonDecoder("MessagesPingEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MessagesPingEvent must be a JSON object")
      val type = json.decodeRequired<InlineMessagesPingEventTypeX731a5908>(rawObject, "type")
      return MessagesPingEvent(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: MessagesPingEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("MessagesPingEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun messagesPingEvent(block: MessagesPingEvent.Builder.() -> Unit): MessagesPingEvent = MessagesPingEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MessagesPingEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
