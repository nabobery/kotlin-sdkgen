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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicFileDocumentSource.
 */
@Serializable(with = AnthropicFileDocumentSource.Serializer::class)
public class AnthropicFileDocumentSource(
  public val fileId: String,
  public val type: InlineComponentsSchemasAnthropicFileDocumentSourcePropertiesType,
) {
  public class Builder {
    private var fileIdValue: String? = null

    public var fileId: String
      get() = requireNotNull(fileIdValue) { "fileId is required" }
      set(`value`) {
        fileIdValue = value
      }

    private var typeValue: InlineComponentsSchemasAnthropicFileDocumentSourcePropertiesType? = null

    public var type: InlineComponentsSchemasAnthropicFileDocumentSourcePropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnthropicFileDocumentSource {
      check(fileIdValue != null) { "fileId is required" }
      check(typeValue != null) { "type is required" }
      return AnthropicFileDocumentSource(
        fileId = fileId,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicFileDocumentSource = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<AnthropicFileDocumentSource> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicFileDocumentSource {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicFileDocumentSource")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicFileDocumentSource must be a JSON object")
      val fileId = json.decodeRequired<String>(raw, "file_id")
      val type = json.decodeRequired<InlineComponentsSchemasAnthropicFileDocumentSourcePropertiesType>(raw, "type")
      return AnthropicFileDocumentSource(
        fileId = fileId,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicFileDocumentSource) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicFileDocumentSource")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("file_id", value.fileId)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicFileDocumentSource(block: AnthropicFileDocumentSource.Builder.() ->
  Unit): AnthropicFileDocumentSource = AnthropicFileDocumentSource.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("AnthropicFileDocumentSource is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
