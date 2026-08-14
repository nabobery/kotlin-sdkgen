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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesErrorDetail.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesErrorDetail
 */
@Serializable(with = MessagesErrorDetail.Serializer::class)
public class MessagesErrorDetail(
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

    public fun build(): MessagesErrorDetail {
      check(messageValue != null) { "message is required" }
      check(typeValue != null) { "type is required" }
      return MessagesErrorDetail(
        message = message,
        type = type,
        errorType = errorType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MessagesErrorDetail = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<MessagesErrorDetail> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MessagesErrorDetail {
      val jsonDecoder = decoder.requireJsonDecoder("MessagesErrorDetail")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MessagesErrorDetail must be a JSON object")
      val message = json.decodeRequired<String>(rawObject, "message")
      val type = json.decodeRequired<String>(rawObject, "type")
      return MessagesErrorDetail(
        message = message,
        type = type,
        errorType = rawObject["error_type"]?.let { json.decodeFromJsonElement<ApiErrorType>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: MessagesErrorDetail) {
      val jsonEncoder = encoder.requireJsonEncoder("MessagesErrorDetail")
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

public fun messagesErrorDetail(block: MessagesErrorDetail.Builder.() -> Unit): MessagesErrorDetail = MessagesErrorDetail.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MessagesErrorDetail is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
