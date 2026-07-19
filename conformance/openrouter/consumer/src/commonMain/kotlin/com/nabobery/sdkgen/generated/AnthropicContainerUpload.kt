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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicContainerUpload.
 */
@Serializable(with = AnthropicContainerUpload.Serializer::class)
public class AnthropicContainerUpload(
  public val fileId: String,
  public val type: InlineComponentsSchemasAnthropicContainerUploadPropertiesType,
) {
  public class Builder {
    private var fileIdValue: String? = null

    public var fileId: String
      get() = requireNotNull(fileIdValue) { "fileId is required" }
      set(`value`) {
        fileIdValue = value
      }

    private var typeValue: InlineComponentsSchemasAnthropicContainerUploadPropertiesType? = null

    public var type: InlineComponentsSchemasAnthropicContainerUploadPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicContainerUpload {
      check(fileIdValue != null) { "fileId is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicContainerUpload(
        fileId = fileId,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicContainerUpload = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicContainerUpload> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicContainerUpload {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicContainerUpload")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicContainerUpload must be a JSON object")
      val fileId = json.decodeRequired<String>(raw, "file_id")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicContainerUploadPropertiesType>(raw, "type")
      return AnthropicContainerUpload(
        fileId = fileId,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicContainerUpload) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicContainerUpload")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("file_id", value.fileId)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicContainerUpload(block: AnthropicContainerUpload.Builder.() -> Unit): AnthropicContainerUpload =
  AnthropicContainerUpload.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicContainerUpload is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
