package com.nabobery.sdkgen.generated

import kotlin.Int
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
 * Error information
 */
@Serializable(with = InlineComponentsSchemasChatStreamChunkPropertiesError.Serializer::class)
public class InlineComponentsSchemasChatStreamChunkPropertiesError(
  /**
   * Error code
   */
  public val code: Int,
  /**
   * Error message
   */
  public val message: String,
  /**
   * Structured error metadata
   */
  public val metadata:
      InlineComponentsSchemasChatStreamChunkPropertiesErrorPropertiesMetadata? = null,
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

    /**
     * Structured error metadata
     */
    public var metadata: InlineComponentsSchemasChatStreamChunkPropertiesErrorPropertiesMetadata? =
        null

    public fun build(): InlineComponentsSchemasChatStreamChunkPropertiesError {
      check(codeValue != null) { "code is required" }
      check(messageValue != null) { "message is required" }
      return InlineComponentsSchemasChatStreamChunkPropertiesError(
        code = code,
        message = message,
        metadata = metadata,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasChatStreamChunkPropertiesError = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatStreamChunkPropertiesError> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatStreamChunkPropertiesError {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasChatStreamChunkPropertiesError")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasChatStreamChunkPropertiesError must be a JSON object")
      val code = json.decodeRequired<Int>(raw, "code")
      val message = json.decodeRequired<String>(raw, "message")
      return InlineComponentsSchemasChatStreamChunkPropertiesError(
        code = code,
        message = message,
        metadata = raw["metadata"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasChatStreamChunkPropertiesErrorPropertiesMetadata>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatStreamChunkPropertiesError) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasChatStreamChunkPropertiesError")
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

public fun inlineComponentsSchemasChatStreamChunkPropertiesError(block: InlineComponentsSchemasChatStreamChunkPropertiesError.Builder.() -> Unit): InlineComponentsSchemasChatStreamChunkPropertiesError = InlineComponentsSchemasChatStreamChunkPropertiesError.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasChatStreamChunkPropertiesError is missing required property " +
      "'" + name + "'")
  return decodeFromJsonElement(element)
}
