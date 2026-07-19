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
 * Error data for GoneResponse
 */
@Serializable(with = GoneResponseErrorData.Serializer::class)
public class GoneResponseErrorData(
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

    public fun build(): GoneResponseErrorData {
      check(codeValue != null) { "code is required" }
      check(messageValue != null) { "message is required" }
      return GoneResponseErrorData(
        code = code,
        message = message,
        metadata = metadata,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GoneResponseErrorData = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<GoneResponseErrorData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GoneResponseErrorData {
      val jsonDecoder = decoder.requireJsonDecoder("GoneResponseErrorData")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("GoneResponseErrorData must be a JSON object")
      val code = json.decodeRequired<Int>(raw, "code")
      val message = json.decodeRequired<String>(raw, "message")
      return GoneResponseErrorData(
        code = code,
        message = message,
        metadata = raw["metadata"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Map<String, JsonElement?>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: GoneResponseErrorData) {
      val jsonEncoder = encoder.requireJsonEncoder("GoneResponseErrorData")
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

public fun goneResponseErrorData(block: GoneResponseErrorData.Builder.() -> Unit): GoneResponseErrorData =
  GoneResponseErrorData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GoneResponseErrorData is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
