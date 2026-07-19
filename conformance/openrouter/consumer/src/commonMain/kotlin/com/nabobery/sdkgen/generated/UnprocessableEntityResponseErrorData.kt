package com.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Error data for UnprocessableEntityResponse
 */
@Serializable(with = UnprocessableEntityResponseErrorData.Serializer::class)
public class UnprocessableEntityResponseErrorData(
  public val code: Int,
  public val message: String,
  public val metadata: Map<String, JsonElement?>? = null,
) {
  public class Builder {
    private var codeValue: Int? = null

    public var code: Int
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

    public var metadata: Map<String, JsonElement?>? = null

    public fun build(): UnprocessableEntityResponseErrorData {
      check(codeValue != null) { "code is required" }
      check(messageValue != null) { "message is required" }
      return UnprocessableEntityResponseErrorData(
        code = code,
        message = message,
        metadata = metadata,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): UnprocessableEntityResponseErrorData = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<UnprocessableEntityResponseErrorData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): UnprocessableEntityResponseErrorData {
      val jsonDecoder = decoder.requireJsonDecoder("UnprocessableEntityResponseErrorData")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("UnprocessableEntityResponseErrorData must be a JSON object")
      val code = json.decodeRequired<Int>(raw, "code")
      val message = json.decodeRequired<String>(raw, "message")
      return UnprocessableEntityResponseErrorData(
        code = code,
        message = message,
        metadata = raw["metadata"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Map<String, JsonElement?>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: UnprocessableEntityResponseErrorData) {
      val jsonEncoder = encoder.requireJsonEncoder("UnprocessableEntityResponseErrorData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        put("message", value.message)
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun unprocessableEntityResponseErrorData(block: UnprocessableEntityResponseErrorData.Builder.() ->
  Unit): UnprocessableEntityResponseErrorData = UnprocessableEntityResponseErrorData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("UnprocessableEntityResponseErrorData is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
