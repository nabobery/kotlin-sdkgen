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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ResponsesStreamingResponse.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ResponsesStreamingResponse
 */
@Serializable(with = ResponsesStreamingResponse.Serializer::class)
public class ResponsesStreamingResponse(
  public val `data`: StreamEvents,
) {
  public class Builder {
    private var dataValue: StreamEvents? = null

    public var `data`: StreamEvents
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): ResponsesStreamingResponse {
      check(dataValue != null) { "data is required" }
      return ResponsesStreamingResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ResponsesStreamingResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ResponsesStreamingResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ResponsesStreamingResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ResponsesStreamingResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ResponsesStreamingResponse must be a JSON object")
      val data = json.decodeRequired<StreamEvents>(rawObject, "data")
      return ResponsesStreamingResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ResponsesStreamingResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ResponsesStreamingResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun responsesStreamingResponse(block: ResponsesStreamingResponse.Builder.() -> Unit): ResponsesStreamingResponse = ResponsesStreamingResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ResponsesStreamingResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
