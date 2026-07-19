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

@Serializable
public data class FilesServerToolView(
  public val parameters: FilesServerToolConfig? = null,
  public val type: InlineComponentsSchemasFilesServerToolPropertiesType,
)

/**
 * OpenRouter built-in server tool: read, write, edit, and list workspace files via the Files API. Requires the
 * `x-openrouter-file-ids: openrouter` request header.
 */
@Serializable(with = FilesServerTool.Serializer::class)
public class FilesServerTool(
  public val type: InlineComponentsSchemasFilesServerToolPropertiesType,
  public val parameters: FilesServerToolConfig? = null,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasFilesServerToolPropertiesType? = null

    public var type: InlineComponentsSchemasFilesServerToolPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: FilesServerToolConfig? = null

    public fun build(): FilesServerTool {
      check(typeValue != null) { "type is required" }
      return FilesServerTool(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FilesServerTool = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<FilesServerTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FilesServerTool {
      val jsonDecoder = decoder.requireJsonDecoder("FilesServerTool")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("FilesServerTool must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasFilesServerToolPropertiesType>(raw, "type")
      return FilesServerTool(
        type = type,
        parameters = raw["parameters"]?.let { json.decodeFromJsonElement<FilesServerToolConfig>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: FilesServerTool) {
      val jsonEncoder = encoder.requireJsonEncoder("FilesServerTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun filesServerTool(block: FilesServerTool.Builder.() -> Unit): FilesServerTool = FilesServerTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FilesServerTool is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
