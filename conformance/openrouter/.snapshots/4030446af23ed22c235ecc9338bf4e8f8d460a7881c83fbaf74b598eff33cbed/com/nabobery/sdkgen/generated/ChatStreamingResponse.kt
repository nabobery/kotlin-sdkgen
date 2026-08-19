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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ChatStreamingResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatStreamingResponse
 */
@Serializable(with = ChatStreamingResponse.Serializer::class)
public class ChatStreamingResponse(
  public val `data`: ChatStreamChunk,
) {
  public class Builder {
    private var dataValue: ChatStreamChunk? = null

    public var `data`: ChatStreamChunk
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): ChatStreamingResponse {
      check(dataValue != null) { "data is required" }
      return ChatStreamingResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatStreamingResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatStreamingResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatStreamingResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ChatStreamingResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatStreamingResponse must be a JSON object")
      val data = json.decodeRequired<ChatStreamChunk>(rawObject, "data")
      return ChatStreamingResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatStreamingResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatStreamingResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatStreamingResponse(block: ChatStreamingResponse.Builder.() -> Unit): ChatStreamingResponse = ChatStreamingResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatStreamingResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
