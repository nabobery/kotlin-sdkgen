package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesDeltaEvent
 */
@Serializable(with = MessagesDeltaEvent.Serializer::class)
public class MessagesDeltaEvent(
  public val delta: InlineMessagesDeltaEventDeltaXda39e6a6,
  public val type: InlineMessagesDeltaEventTypeXdd5f01d7,
  public val usage: InlineMessagesDeltaEventUsageX9d3c9761,
) {
  public class Builder {
    private var deltaValue: InlineMessagesDeltaEventDeltaXda39e6a6? = null

    public var delta: InlineMessagesDeltaEventDeltaXda39e6a6
      get() = requireNotNull(deltaValue) { "delta is required" }
      set(`value`) {
        deltaValue = value
      }

    private var typeValue: InlineMessagesDeltaEventTypeXdd5f01d7? = null

    public var type: InlineMessagesDeltaEventTypeXdd5f01d7
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var usageValue: InlineMessagesDeltaEventUsageX9d3c9761? = null

    public var usage: InlineMessagesDeltaEventUsageX9d3c9761
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

  internal object Serializer : KSerializer<MessagesDeltaEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MessagesDeltaEvent {
      val jsonDecoder = decoder.requireJsonDecoder("MessagesDeltaEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MessagesDeltaEvent must be a JSON object")
      val delta = json.decodeRequired<InlineMessagesDeltaEventDeltaXda39e6a6>(rawObject, "delta")
      val type = json.decodeRequired<InlineMessagesDeltaEventTypeXdd5f01d7>(rawObject, "type")
      val usage = json.decodeRequired<InlineMessagesDeltaEventUsageX9d3c9761>(rawObject, "usage")
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

public fun messagesDeltaEvent(block: MessagesDeltaEvent.Builder.() -> Unit): MessagesDeltaEvent = MessagesDeltaEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MessagesDeltaEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
