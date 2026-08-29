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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesStreamingResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesStreamingResponse
 */
@Serializable(with = MessagesStreamingResponse.Serializer::class)
public class MessagesStreamingResponse(
  public val `data`: MessagesStreamEvents,
  public val event: String,
) {
  public class Builder {
    private var dataValue: MessagesStreamEvents? = null

    public var `data`: MessagesStreamEvents
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    private var eventValue: String? = null

    public var event: String
      get() = requireNotNull(eventValue) { "event is required" }
      set(`value`) {
        eventValue = value
      }

    public fun build(): MessagesStreamingResponse {
      check(dataValue != null) { "data is required" }
      check(eventValue != null) { "event is required" }
      return MessagesStreamingResponse(
        data = data,
        event = event,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MessagesStreamingResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<MessagesStreamingResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MessagesStreamingResponse {
      val jsonDecoder = decoder.requireJsonDecoder("MessagesStreamingResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MessagesStreamingResponse must be a JSON object")
      val data = json.decodeRequired<MessagesStreamEvents>(rawObject, "data")
      val event = json.decodeRequired<String>(rawObject, "event")
      return MessagesStreamingResponse(
        data = data,
        event = event,
      )
    }

    override fun serialize(encoder: Encoder, `value`: MessagesStreamingResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("MessagesStreamingResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("event", value.event)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun messagesStreamingResponse(block: MessagesStreamingResponse.Builder.() -> Unit): MessagesStreamingResponse = MessagesStreamingResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MessagesStreamingResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
