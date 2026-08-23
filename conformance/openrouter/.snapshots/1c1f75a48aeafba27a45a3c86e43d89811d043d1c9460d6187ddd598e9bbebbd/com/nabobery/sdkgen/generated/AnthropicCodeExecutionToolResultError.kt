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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecutionToolResultError.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecutionToolResultError
 */
@Serializable(with = AnthropicCodeExecutionToolResultError.Serializer::class)
public class AnthropicCodeExecutionToolResultError(
  public val errorCode: AnthropicServerToolErrorCode,
  public val type: InlineAnthropicCodeExecutionToolResultErrorTypeXc24d8d55,
) {
  public class Builder {
    private var errorCodeValue: AnthropicServerToolErrorCode? = null

    public var errorCode: AnthropicServerToolErrorCode
      get() = requireNotNull(errorCodeValue) { "errorCode is required" }
      set(`value`) {
        errorCodeValue = value
      }

    private var typeValue: InlineAnthropicCodeExecutionToolResultErrorTypeXc24d8d55? = null

    public var type: InlineAnthropicCodeExecutionToolResultErrorTypeXc24d8d55
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicCodeExecutionToolResultError {
      check(errorCodeValue != null) { "errorCode is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicCodeExecutionToolResultError(
        errorCode = errorCode,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicCodeExecutionToolResultError = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicCodeExecutionToolResultError> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicCodeExecutionToolResultError {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicCodeExecutionToolResultError")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicCodeExecutionToolResultError must be a JSON object")
      val errorCode = json.decodeRequired<AnthropicServerToolErrorCode>(rawObject, "error_code")
      val type = json.decodeRequired<InlineAnthropicCodeExecutionToolResultErrorTypeXc24d8d55>(rawObject, "type")
      return AnthropicCodeExecutionToolResultError(
        errorCode = errorCode,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicCodeExecutionToolResultError) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicCodeExecutionToolResultError")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("error_code", json.encodeToJsonElement(value.errorCode))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicCodeExecutionToolResultError(block: AnthropicCodeExecutionToolResultError.Builder.() -> Unit): AnthropicCodeExecutionToolResultError = AnthropicCodeExecutionToolResultError.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicCodeExecutionToolResultError is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
