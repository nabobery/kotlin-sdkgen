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
 * Unauthorized - Authentication required or invalid credentials
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/UnauthorizedResponse
 */
@Serializable(with = UnauthorizedResponse.Serializer::class)
public class UnauthorizedResponse(
  public val error: UnauthorizedResponseErrorData,
  openrouterMetadata: Map<String, JsonElement?>? = null,
  public val userId: String? = null,
) {
  public val openrouterMetadata: Map<String, JsonElement?>? =
      openrouterMetadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var errorValue: UnauthorizedResponseErrorData? = null

    public var error: UnauthorizedResponseErrorData
      get() = requireNotNull(errorValue) { "error is required" }
      set(`value`) {
        errorValue = value
      }

    private var openrouterMetadataValue: Map<String, JsonElement?>? = null

    public var openrouterMetadata: Map<String, JsonElement?>?
      get() = openrouterMetadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        openrouterMetadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var userId: String? = null

    public fun build(): UnauthorizedResponse {
      check(errorValue != null) { "error is required" }
      return UnauthorizedResponse(
        error = error,
        openrouterMetadata = openrouterMetadata,
        userId = userId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): UnauthorizedResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<UnauthorizedResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): UnauthorizedResponse {
      val jsonDecoder = decoder.requireJsonDecoder("UnauthorizedResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("UnauthorizedResponse must be a JSON object")
      val error = json.decodeRequired<UnauthorizedResponseErrorData>(rawObject, "error")
      return UnauthorizedResponse(
        error = error,
        openrouterMetadata = rawObject["openrouter_metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, JsonElement?>?>(element) },
        userId = rawObject["user_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: UnauthorizedResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("UnauthorizedResponse")
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

public fun unauthorizedResponse(block: UnauthorizedResponse.Builder.() -> Unit): UnauthorizedResponse = UnauthorizedResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("UnauthorizedResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
