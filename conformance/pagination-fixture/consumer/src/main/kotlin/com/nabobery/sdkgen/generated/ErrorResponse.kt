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
 * Generated model for sdkgen://pagination-fixture/openapi.yaml#/components/schemas/ErrorResponse.
 *
 * Source: sdkgen://pagination-fixture/openapi.yaml#/components/schemas/ErrorResponse
 */
@Serializable(with = ErrorResponse.Serializer::class)
public class ErrorResponse(
  public val message: String,
) {
  public class Builder {
    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    public fun build(): ErrorResponse {
      check(messageValue != null) { "message is required" }
      return ErrorResponse(
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ErrorResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ErrorResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ErrorResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ErrorResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ErrorResponse must be a JSON object")
      val message = json.decodeRequired<String>(rawObject, "message")
      return ErrorResponse(
        message = message,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ErrorResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ErrorResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("message", value.message)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun errorResponse(block: ErrorResponse.Builder.() -> Unit): ErrorResponse = ErrorResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ErrorResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
