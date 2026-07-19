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
 * Request Timeout - Operation exceeded time limit
 */
@Serializable(with = RequestTimeoutResponse.Serializer::class)
public class RequestTimeoutResponse(
  public val error: RequestTimeoutResponseErrorData,
  public val openrouterMetadata: Map<String, JsonElement?>? = null,
  public val userId: String? = null,
) {
  public class Builder {
    private var errorValue: RequestTimeoutResponseErrorData? = null

    public var error: RequestTimeoutResponseErrorData
      get() = requireNotNull(errorValue) { "error is required" }
      set(`value`) {
        errorValue = value
      }

    public var openrouterMetadata: Map<String, JsonElement?>? = null

    public var userId: String? = null

    public fun build(): RequestTimeoutResponse {
      check(errorValue != null) { "error is required" }
      return RequestTimeoutResponse(
        error = error,
        openrouterMetadata = openrouterMetadata,
        userId = userId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RequestTimeoutResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RequestTimeoutResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RequestTimeoutResponse {
      val jsonDecoder = decoder.requireJsonDecoder("RequestTimeoutResponse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("RequestTimeoutResponse must be a JSON object")
      val error = json.decodeRequired<RequestTimeoutResponseErrorData>(raw, "error")
      return RequestTimeoutResponse(
        error = error,
        openrouterMetadata = raw["openrouter_metadata"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Map<String, JsonElement?>?>(element) },
        userId = raw["user_id"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RequestTimeoutResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("RequestTimeoutResponse")
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

public fun requestTimeoutResponse(block: RequestTimeoutResponse.Builder.() -> Unit): RequestTimeoutResponse =
  RequestTimeoutResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RequestTimeoutResponse is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
