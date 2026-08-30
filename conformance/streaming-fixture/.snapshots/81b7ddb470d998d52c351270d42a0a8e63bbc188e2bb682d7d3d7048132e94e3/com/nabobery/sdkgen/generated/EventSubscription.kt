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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/EventSubscription.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/EventSubscription
 */
@Serializable(with = EventSubscription.Serializer::class)
public class EventSubscription(
  public val topic: String,
) {
  public class Builder {
    private var topicValue: String? = null

    public var topic: String
      get() = requireNotNull(topicValue) { "topic is required" }
      set(`value`) {
        topicValue = value
      }

    public fun build(): EventSubscription {
      check(topicValue != null) { "topic is required" }
      return EventSubscription(
        topic = topic,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): EventSubscription = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<EventSubscription> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): EventSubscription {
      val jsonDecoder = decoder.requireJsonDecoder("EventSubscription")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("EventSubscription must be a JSON object")
      val topic = json.decodeRequired<String>(rawObject, "topic")
      return EventSubscription(
        topic = topic,
      )
    }

    override fun serialize(encoder: Encoder, `value`: EventSubscription) {
      val jsonEncoder = encoder.requireJsonEncoder("EventSubscription")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("topic", value.topic)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun eventSubscription(block: EventSubscription.Builder.() -> Unit): EventSubscription = EventSubscription.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("EventSubscription is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
