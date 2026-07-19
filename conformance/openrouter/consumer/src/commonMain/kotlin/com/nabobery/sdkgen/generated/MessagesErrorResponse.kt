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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesErrorResponse.
 */
@Serializable(with = MessagesErrorResponse.Serializer::class)
public class MessagesErrorResponse(
  public val error: MessagesErrorDetail,
  public val type: InlineComponentsSchemasMessagesErrorResponsePropertiesType,
) {
  public class Builder {
    private var errorValue: MessagesErrorDetail? = null

    public var error: MessagesErrorDetail
      get() = requireNotNull(errorValue) { "error is required" }
      set(`value`) {
        errorValue = value
      }

    private var typeValue: InlineComponentsSchemasMessagesErrorResponsePropertiesType? = null

    public var type: InlineComponentsSchemasMessagesErrorResponsePropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): MessagesErrorResponse {
      check(errorValue != null) { "error is required" }
      check(typeValue != null) { "type is required" }
      return MessagesErrorResponse(
        error = error,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MessagesErrorResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<MessagesErrorResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MessagesErrorResponse {
      val jsonDecoder = decoder.requireJsonDecoder("MessagesErrorResponse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("MessagesErrorResponse must be a JSON object")
      val error = json.decodeRequired<MessagesErrorDetail>(raw, "error")
      val type = json.decodeRequired<InlineComponentsSchemasMessagesErrorResponsePropertiesType>(raw, "type")
      return MessagesErrorResponse(
        error = error,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: MessagesErrorResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("MessagesErrorResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("error", json.encodeToJsonElement(value.error))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun messagesErrorResponse(block: MessagesErrorResponse.Builder.() -> Unit): MessagesErrorResponse =
  MessagesErrorResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MessagesErrorResponse is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
