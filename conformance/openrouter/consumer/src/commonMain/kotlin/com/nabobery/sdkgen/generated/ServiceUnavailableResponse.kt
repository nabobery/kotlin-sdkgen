package com.nabobery.sdkgen.generated

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
 * Service Unavailable - Service temporarily unavailable
 */
@Serializable(with = ServiceUnavailableResponse.Serializer::class)
public class ServiceUnavailableResponse(
  public val error: ServiceUnavailableResponseErrorData,
  public val openrouterMetadata: Map<String, JsonElement?>? = null,
  public val userId: String? = null,
) {
  public class Builder {
    private var errorValue: ServiceUnavailableResponseErrorData? = null

    public var error: ServiceUnavailableResponseErrorData
      get() = requireNotNull(errorValue) { "error is required" }
      set(`value`) {
        errorValue = value
      }

    public var openrouterMetadata: Map<String, JsonElement?>? = null

    public var userId: String? = null

    public fun build(): ServiceUnavailableResponse {
      check(errorValue != null) { "error is required" }
      return ServiceUnavailableResponse(
        error = error,
        openrouterMetadata = openrouterMetadata,
        userId = userId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ServiceUnavailableResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ServiceUnavailableResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ServiceUnavailableResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ServiceUnavailableResponse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ServiceUnavailableResponse must be a JSON object")
      val error = json.decodeRequired<ServiceUnavailableResponseErrorData>(raw, "error")
      return ServiceUnavailableResponse(
        error = error,
        openrouterMetadata = raw["openrouter_metadata"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Map<String, JsonElement?>?>(element) },
        userId = raw["user_id"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ServiceUnavailableResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ServiceUnavailableResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("error", json.encodeToJsonElement(value.error))
        value.openrouterMetadata?.let { put("openrouter_metadata", json.encodeToJsonElement(it)) }
        value.userId?.let { put("user_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun serviceUnavailableResponse(block: ServiceUnavailableResponse.Builder.() ->
  Unit): ServiceUnavailableResponse = ServiceUnavailableResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ServiceUnavailableResponse is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
