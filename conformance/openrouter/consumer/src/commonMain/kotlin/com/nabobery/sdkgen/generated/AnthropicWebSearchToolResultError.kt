package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class AnthropicWebSearchToolResultErrorView(
  @SerialName("error_code")
  public val errorCode: InlineComponentsSchemasAnthropicWebSearchToolResultErrorPropertiesErrorCode,
  public val type: InlineComponentsSchemasAnthropicWebSearchToolResultErrorPropertiesType,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicWebSearchToolResultError.
 */
@Serializable(with = AnthropicWebSearchToolResultError.Serializer::class)
public class AnthropicWebSearchToolResultError(
  public val errorCode: InlineComponentsSchemasAnthropicWebSearchToolResultErrorPropertiesErrorCode,
  public val type: InlineComponentsSchemasAnthropicWebSearchToolResultErrorPropertiesType,
) {
  public class Builder {
    private var errorCodeValue:
        InlineComponentsSchemasAnthropicWebSearchToolResultErrorPropertiesErrorCode? = null

    public var errorCode:
        InlineComponentsSchemasAnthropicWebSearchToolResultErrorPropertiesErrorCode
      get() = requireNotNull(errorCodeValue) { "errorCode is required" }
      set(`value`) {
        errorCodeValue = value
      }

    private var typeValue: InlineComponentsSchemasAnthropicWebSearchToolResultErrorPropertiesType? =
        null

    public var type: InlineComponentsSchemasAnthropicWebSearchToolResultErrorPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicWebSearchToolResultError {
      check(errorCodeValue != null) { "errorCode is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicWebSearchToolResultError(
        errorCode = errorCode,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicWebSearchToolResultError = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicWebSearchToolResultError> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicWebSearchToolResultError {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicWebSearchToolResultError")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicWebSearchToolResultError must be a JSON object")
      val errorCode = json
        .decodeRequired<InlineComponentsSchemasAnthropicWebSearchToolResultErrorPropertiesErrorCode>(raw, "error_code")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicWebSearchToolResultErrorPropertiesType>(raw,
        "type")
      return AnthropicWebSearchToolResultError(
        errorCode = errorCode,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicWebSearchToolResultError) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicWebSearchToolResultError")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("error_code", json.encodeToJsonElement(value.errorCode))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicWebSearchToolResultError(block: AnthropicWebSearchToolResultError.Builder.() ->
  Unit): AnthropicWebSearchToolResultError = AnthropicWebSearchToolResultError.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("AnthropicWebSearchToolResultError is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
