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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebFetchToolResultError.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebFetchToolResultError
 */
@Serializable(with = AnthropicWebFetchToolResultError.Serializer::class)
public class AnthropicWebFetchToolResultError(
  public val errorCode: InlineAnthropicWebFetchToolResultErrorErrorCodeXf3fb79d4,
  public val type: InlineAnthropicWebFetchToolResultErrorTypeXa3d3754b,
) {
  public class Builder {
    private var errorCodeValue: InlineAnthropicWebFetchToolResultErrorErrorCodeXf3fb79d4? = null

    public var errorCode: InlineAnthropicWebFetchToolResultErrorErrorCodeXf3fb79d4
      get() = requireNotNull(errorCodeValue) { "errorCode is required" }
      set(`value`) {
        errorCodeValue = value
      }

    private var typeValue: InlineAnthropicWebFetchToolResultErrorTypeXa3d3754b? = null

    public var type: InlineAnthropicWebFetchToolResultErrorTypeXa3d3754b
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicWebFetchToolResultError {
      check(errorCodeValue != null) { "errorCode is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicWebFetchToolResultError(
        errorCode = errorCode,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicWebFetchToolResultError = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicWebFetchToolResultError> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicWebFetchToolResultError {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicWebFetchToolResultError")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicWebFetchToolResultError must be a JSON object")
      val errorCode = json.decodeRequired<InlineAnthropicWebFetchToolResultErrorErrorCodeXf3fb79d4>(rawObject, "error_code")
      val type = json.decodeRequired<InlineAnthropicWebFetchToolResultErrorTypeXa3d3754b>(rawObject, "type")
      return AnthropicWebFetchToolResultError(
        errorCode = errorCode,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicWebFetchToolResultError) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicWebFetchToolResultError")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("error_code", json.encodeToJsonElement(value.errorCode))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicWebFetchToolResultError(block: AnthropicWebFetchToolResultError.Builder.() -> Unit): AnthropicWebFetchToolResultError = AnthropicWebFetchToolResultError.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicWebFetchToolResultError is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
