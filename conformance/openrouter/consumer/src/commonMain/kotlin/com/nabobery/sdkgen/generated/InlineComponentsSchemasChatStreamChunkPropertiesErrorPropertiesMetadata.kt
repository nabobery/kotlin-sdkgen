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
 */
@Serializable(with = InlineComponentsSchemasChatStreamChunkPropertiesErrorPropertiesMetadata.Serializer::class)
public class InlineComponentsSchemasChatStreamChunkPropertiesErrorPropertiesMetadata(
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

    public fun build(): InlineComponentsSchemasChatStreamChunkPropertiesErrorPropertiesMetadata {
      check(errorTypeValue != null) { "errorType is required" }
      return InlineComponentsSchemasChatStreamChunkPropertiesErrorPropertiesMetadata(
        errorType = errorType,
        providerCode = providerCode,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasChatStreamChunkPropertiesErrorPropertiesMetadata = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatStreamChunkPropertiesErrorPropertiesMetadata> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatStreamChunkPropertiesErrorPropertiesMetadata {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasChatStreamChunkPropertiesErrorPropertiesMetadata")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasChatStreamChunkPropertiesErrorPropertiesMetadata must be " +
          "a JSON object")
      val errorType = json.decodeRequired<ApiErrorType>(raw, "error_type")
      return InlineComponentsSchemasChatStreamChunkPropertiesErrorPropertiesMetadata(
        errorType = errorType,
        providerCode = raw["provider_code"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasChatStreamChunkPropertiesErrorPropertiesMetadata) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasChatStreamChunkPropertiesErrorPropertiesMetadata")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("error_type", json.encodeToJsonElement(value.errorType))
        value.providerCode?.let { put("provider_code", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasChatStreamChunkPropertiesErrorPropertiesMetadata(block: InlineComponentsSchemasChatStreamChunkPropertiesErrorPropertiesMetadata.Builder.() -> Unit): InlineComponentsSchemasChatStreamChunkPropertiesErrorPropertiesMetadata = InlineComponentsSchemasChatStreamChunkPropertiesErrorPropertiesMetadata.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasChatStreamChunkPropertiesErrorPropertiesMetadata is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
