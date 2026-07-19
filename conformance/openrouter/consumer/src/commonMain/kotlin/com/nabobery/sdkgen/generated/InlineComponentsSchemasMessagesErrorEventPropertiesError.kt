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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesErrorEvent/properties/error.
 */
@Serializable(with = InlineComponentsSchemasMessagesErrorEventPropertiesError.Serializer::class)
public class InlineComponentsSchemasMessagesErrorEventPropertiesError(
  public val message: String,
  public val type: String,
  public val errorType: ApiErrorType? = null,
) {
  public class Builder {
    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var errorType: ApiErrorType? = null

    public fun build(): InlineComponentsSchemasMessagesErrorEventPropertiesError {
      check(messageValue != null) { "message is required" }
      check(typeValue != null) { "type is required" }
      return InlineComponentsSchemasMessagesErrorEventPropertiesError(
        message = message,
        type = type,
        errorType = errorType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasMessagesErrorEventPropertiesError = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesErrorEventPropertiesError> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesErrorEventPropertiesError {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMessagesErrorEventPropertiesError")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesErrorEventPropertiesError must be a JSON object")
      val message = json.decodeRequired<String>(raw, "message")
      val type = json.decodeRequired<String>(raw, "type")
      return InlineComponentsSchemasMessagesErrorEventPropertiesError(
        message = message,
        type = type,
        errorType = raw["error_type"]?.let { json.decodeFromJsonElement<ApiErrorType>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMessagesErrorEventPropertiesError) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasMessagesErrorEventPropertiesError")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("message", value.message)
        put("type", value.type)
        value.errorType?.let { put("error_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesErrorEventPropertiesError(block: InlineComponentsSchemasMessagesErrorEventPropertiesError.Builder.() -> Unit): InlineComponentsSchemasMessagesErrorEventPropertiesError = InlineComponentsSchemasMessagesErrorEventPropertiesError.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMessagesErrorEventPropertiesError is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
