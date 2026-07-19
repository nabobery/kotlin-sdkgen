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
 * Error information returned from the API
 */
@Serializable(with = ResponsesErrorField.Serializer::class)
public class ResponsesErrorField(
  public val code: InlineComponentsSchemasResponsesErrorFieldPropertiesCode,
  public val message: String,
) {
  public class Builder {
    private var codeValue: InlineComponentsSchemasResponsesErrorFieldPropertiesCode? = null

    public var code: InlineComponentsSchemasResponsesErrorFieldPropertiesCode
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    public fun build(): ResponsesErrorField {
      check(codeValue != null) { "code is required" }
      check(messageValue != null) { "message is required" }
      return ResponsesErrorField(
        code = code,
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ResponsesErrorField = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ResponsesErrorField> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ResponsesErrorField {
      val jsonDecoder = decoder.requireJsonDecoder("ResponsesErrorField")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ResponsesErrorField must be a JSON object")
      val code = json.decodeRequired<InlineComponentsSchemasResponsesErrorFieldPropertiesCode>(raw, "code")
      val message = json.decodeRequired<String>(raw, "message")
      return ResponsesErrorField(
        code = code,
        message = message,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ResponsesErrorField) {
      val jsonEncoder = encoder.requireJsonEncoder("ResponsesErrorField")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        put("message", value.message)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun responsesErrorField(block: ResponsesErrorField.Builder.() -> Unit): ResponsesErrorField =
  ResponsesErrorField.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ResponsesErrorField is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
