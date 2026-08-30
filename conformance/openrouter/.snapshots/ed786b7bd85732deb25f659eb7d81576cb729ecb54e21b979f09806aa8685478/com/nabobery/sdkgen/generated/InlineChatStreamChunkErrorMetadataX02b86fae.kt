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
 * Structured error metadata
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatStreamChunk/properties/error/properties/metadata
 */
@Serializable(with = InlineChatStreamChunkErrorMetadataX02b86fae.Serializer::class)
public class InlineChatStreamChunkErrorMetadataX02b86fae(
  public val errorType: ApiErrorType,
  /**
   * Upstream provider-specific error code, when available
   */
  public val providerCode: String? = null,
) {
  public class Builder {
    private var errorTypeValue: ApiErrorType? = null

    public var errorType: ApiErrorType
      get() = requireNotNull(errorTypeValue) { "errorType is required" }
      set(`value`) {
        errorTypeValue = value
      }

    /**
     * Upstream provider-specific error code, when available
     */
    public var providerCode: String? = null

    public fun build(): InlineChatStreamChunkErrorMetadataX02b86fae {
      check(errorTypeValue != null) { "errorType is required" }
      return InlineChatStreamChunkErrorMetadataX02b86fae(
        errorType = errorType,
        providerCode = providerCode,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineChatStreamChunkErrorMetadataX02b86fae = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineChatStreamChunkErrorMetadataX02b86fae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChatStreamChunkErrorMetadataX02b86fae {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChatStreamChunkErrorMetadataX02b86fae")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineChatStreamChunkErrorMetadataX02b86fae must be a JSON object")
      val errorType = json.decodeRequired<ApiErrorType>(rawObject, "error_type")
      return InlineChatStreamChunkErrorMetadataX02b86fae(
        errorType = errorType,
        providerCode = rawObject["provider_code"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineChatStreamChunkErrorMetadataX02b86fae) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineChatStreamChunkErrorMetadataX02b86fae")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("error_type", json.encodeToJsonElement(value.errorType))
        value.providerCode?.let { put("provider_code", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineChatStreamChunkErrorMetadataX02b86fae(block: InlineChatStreamChunkErrorMetadataX02b86fae.Builder.() -> Unit): InlineChatStreamChunkErrorMetadataX02b86fae = InlineChatStreamChunkErrorMetadataX02b86fae.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineChatStreamChunkErrorMetadataX02b86fae is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
