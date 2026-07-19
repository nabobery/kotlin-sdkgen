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
 * Event sent when the message metadata changes (e.g., stop_reason)
 */
@Serializable(with = MessagesDeltaEvent.Serializer::class)
public class MessagesDeltaEvent(
  public val delta: InlineComponentsSchemasMessagesDeltaEventPropertiesDelta,
  public val type: InlineComponentsSchemasMessagesDeltaEventPropertiesType,
  public val usage: InlineComponentsSchemasMessagesDeltaEventPropertiesUsage,
) {
  public class Builder {
    private var deltaValue: InlineComponentsSchemasMessagesDeltaEventPropertiesDelta? = null

    public var delta: InlineComponentsSchemasMessagesDeltaEventPropertiesDelta
      get() = requireNotNull(deltaValue) { "delta is required" }
      set(`value`) {
        deltaValue = value
      }

    private var typeValue: InlineComponentsSchemasMessagesDeltaEventPropertiesType? = null

    public var type: InlineComponentsSchemasMessagesDeltaEventPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var usageValue: InlineComponentsSchemasMessagesDeltaEventPropertiesUsage? = null

    public var usage: InlineComponentsSchemasMessagesDeltaEventPropertiesUsage
      get() = requireNotNull(usageValue) { "usage is required" }
      set(`value`) {
        usageValue = value
      }

    public fun build(): MessagesDeltaEvent {
      check(deltaValue != null) { "delta is required" }
      check(typeValue != null) { "type is required" }
      check(usageValue != null) { "usage is required" }
      return MessagesDeltaEvent(
        delta = delta,
        type = type,
        usage = usage,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MessagesDeltaEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<MessagesDeltaEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MessagesDeltaEvent {
      val jsonDecoder = decoder.requireJsonDecoder("MessagesDeltaEvent")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("MessagesDeltaEvent must be a JSON object")
      val delta = json.decodeRequired<InlineComponentsSchemasMessagesDeltaEventPropertiesDelta>(raw, "delta")
      val type = json.decodeRequired<InlineComponentsSchemasMessagesDeltaEventPropertiesType>(raw, "type")
      val usage = json.decodeRequired<InlineComponentsSchemasMessagesDeltaEventPropertiesUsage>(raw, "usage")
      return MessagesDeltaEvent(
        delta = delta,
        type = type,
        usage = usage,
      )
    }

    override fun serialize(encoder: Encoder, `value`: MessagesDeltaEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("MessagesDeltaEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("delta", json.encodeToJsonElement(value.delta))
        put("type", json.encodeToJsonElement(value.type))
        put("usage", json.encodeToJsonElement(value.usage))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun messagesDeltaEvent(block: MessagesDeltaEvent.Builder.() -> Unit): MessagesDeltaEvent = MessagesDeltaEvent
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MessagesDeltaEvent is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
