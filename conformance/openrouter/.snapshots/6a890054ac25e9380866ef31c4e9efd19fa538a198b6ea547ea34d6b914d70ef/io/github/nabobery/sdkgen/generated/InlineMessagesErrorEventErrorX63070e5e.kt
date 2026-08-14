package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesErrorEvent/properties/error
 */
@Serializable(with = InlineMessagesErrorEventErrorX63070e5e.Serializer::class)
public class InlineMessagesErrorEventErrorX63070e5e(
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

    public fun build(): InlineMessagesErrorEventErrorX63070e5e {
      check(messageValue != null) { "message is required" }
      check(typeValue != null) { "type is required" }
      return InlineMessagesErrorEventErrorX63070e5e(
        message = message,
        type = type,
        errorType = errorType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesErrorEventErrorX63070e5e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesErrorEventErrorX63070e5e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesErrorEventErrorX63070e5e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesErrorEventErrorX63070e5e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesErrorEventErrorX63070e5e must be a JSON object")
      val message = json.decodeRequired<String>(rawObject, "message")
      val type = json.decodeRequired<String>(rawObject, "type")
      return InlineMessagesErrorEventErrorX63070e5e(
        message = message,
        type = type,
        errorType = rawObject["error_type"]?.let { json.decodeFromJsonElement<ApiErrorType>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesErrorEventErrorX63070e5e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesErrorEventErrorX63070e5e")
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

public fun inlineMessagesErrorEventErrorX63070e5e(block: InlineMessagesErrorEventErrorX63070e5e.Builder.() -> Unit): InlineMessagesErrorEventErrorX63070e5e = InlineMessagesErrorEventErrorX63070e5e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesErrorEventErrorX63070e5e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
