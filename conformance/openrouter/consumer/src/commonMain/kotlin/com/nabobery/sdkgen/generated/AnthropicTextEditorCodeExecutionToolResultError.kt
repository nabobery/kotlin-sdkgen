package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionToolResultError.
 */
@Serializable(with = AnthropicTextEditorCodeExecutionToolResultError.Serializer::class)
public class AnthropicTextEditorCodeExecutionToolResultError(
  public val errorCode:
      InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesErrorCode,
  public val errorMessage: String?,
  public val type:
      InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesType,
) {
  public class Builder {
    private var errorCodeValue:
        InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesErrorCode? =
        null

    public var errorCode:
        InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesErrorCode
      get() = requireNotNull(errorCodeValue) { "errorCode is required" }
      set(`value`) {
        errorCodeValue = value
      }

    private var typeValue:
        InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesType? = null

    public var type:
        InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var errorMessageState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var errorMessage: String?
      get() = errorMessageState.valueOrNull()
      set(`value`) {
        errorMessageState = value.toNullableFieldState()
      }

    public fun build(): AnthropicTextEditorCodeExecutionToolResultError {
      check(errorCodeValue != null) { "errorCode is required" }
      check(typeValue != null) { "type is required" }
      check(errorMessageState !== FieldState.Absent) { "errorMessage is required, even when null" }
      return AnthropicTextEditorCodeExecutionToolResultError(
        errorCode = errorCode,
        errorMessage = errorMessageState.valueOrNull(),
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicTextEditorCodeExecutionToolResultError = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicTextEditorCodeExecutionToolResultError> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicTextEditorCodeExecutionToolResultError {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicTextEditorCodeExecutionToolResultError")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicTextEditorCodeExecutionToolResultError must be a JSON object")
      val errorCode = json
        .decodeRequired<InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesErrorCode>(raw,
          "error_code")
      val type = json
        .decodeRequired<InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesType>(raw,
          "type")
      if (!raw.containsKey("error_message")) {
        throw SerializationException("AnthropicTextEditorCodeExecutionToolResultError is missing required property " +
          "'error_message'")
      }
      val errorMessage = raw["error_message"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      return AnthropicTextEditorCodeExecutionToolResultError(
        errorCode = errorCode,
        errorMessage = errorMessage,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicTextEditorCodeExecutionToolResultError) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicTextEditorCodeExecutionToolResultError")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("error_code", json.encodeToJsonElement(value.errorCode))
        put("error_message", value.errorMessage?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicTextEditorCodeExecutionToolResultError(block: AnthropicTextEditorCodeExecutionToolResultError
  .Builder.() -> Unit): AnthropicTextEditorCodeExecutionToolResultError =
    AnthropicTextEditorCodeExecutionToolResultError.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("AnthropicTextEditorCodeExecutionToolResultError is missing required property '" +
      name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("AnthropicTextEditorCodeExecutionToolResultError property '" + name +
      "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
