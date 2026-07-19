package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/FileParserPlugin.
 */
@Serializable(with = FileParserPlugin.Serializer::class)
public class FileParserPlugin(
  public val id: InlineComponentsSchemasFileParserPluginPropertiesId,
  /**
   * Set to false to disable the file-parser plugin for this request. Defaults to true.
   */
  public val enabled: Boolean? = null,
  public val pdf: PdfParserOptions? = null,
) {
  public class Builder {
    private var idValue: InlineComponentsSchemasFileParserPluginPropertiesId? = null

    public var id: InlineComponentsSchemasFileParserPluginPropertiesId
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    /**
     * Set to false to disable the file-parser plugin for this request. Defaults to true.
     */
    public var enabled: Boolean? = null

    public var pdf: PdfParserOptions? = null

    public fun build(): FileParserPlugin {
      check(idValue != null) { "id is required" }
      return FileParserPlugin(
        id = id,
        enabled = enabled,
        pdf = pdf,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FileParserPlugin = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<FileParserPlugin> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FileParserPlugin {
      val jsonDecoder = decoder.requireJsonDecoder("FileParserPlugin")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("FileParserPlugin must be a JSON object")
      val id = json.decodeRequired<InlineComponentsSchemasFileParserPluginPropertiesId>(raw, "id")
      return FileParserPlugin(
        id = id,
        enabled = raw["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        pdf = raw["pdf"]?.let { json.decodeFromJsonElement<PdfParserOptions>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: FileParserPlugin) {
      val jsonEncoder = encoder.requireJsonEncoder("FileParserPlugin")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
        value.pdf?.let { put("pdf", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fileParserPlugin(block: FileParserPlugin.Builder.() -> Unit): FileParserPlugin = FileParserPlugin
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FileParserPlugin is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
