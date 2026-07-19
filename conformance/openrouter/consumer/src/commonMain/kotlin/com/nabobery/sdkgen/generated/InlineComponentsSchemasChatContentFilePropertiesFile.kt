package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ChatContentFile/properties/file.
 */
@Serializable(with = InlineComponentsSchemasChatContentFilePropertiesFile.Serializer::class)
public class InlineComponentsSchemasChatContentFilePropertiesFile(
  /**
   * File content as base64 data URL or URL
   */
  public val fileData: String? = null,
  /**
   * File ID for previously uploaded files
   */
  public val fileId: String? = null,
  /**
   * Original filename
   */
  public val filename: String? = null,
) {
  public class Builder {
    /**
     * File content as base64 data URL or URL
     */
    public var fileData: String? = null

    /**
     * File ID for previously uploaded files
     */
    public var fileId: String? = null

    /**
     * Original filename
     */
    public var filename: String? = null

    public fun build(): InlineComponentsSchemasChatContentFilePropertiesFile =
      InlineComponentsSchemasChatContentFilePropertiesFile(
      fileData = fileData,
      fileId = fileId,
      filename = filename,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasChatContentFilePropertiesFile = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatContentFilePropertiesFile> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatContentFilePropertiesFile {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasChatContentFilePropertiesFile")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasChatContentFilePropertiesFile must be a JSON object")
      return InlineComponentsSchemasChatContentFilePropertiesFile(
        fileData = raw["file_data"]?.let { json.decodeFromJsonElement<String>(it) },
        fileId = raw["file_id"]?.let { json.decodeFromJsonElement<String>(it) },
        filename = raw["filename"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatContentFilePropertiesFile) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasChatContentFilePropertiesFile")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.fileData?.let { put("file_data", it) }
        value.fileId?.let { put("file_id", it) }
        value.filename?.let { put("filename", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasChatContentFilePropertiesFile(block: InlineComponentsSchemasChatContentFilePropertiesFile.Builder.() -> Unit): InlineComponentsSchemasChatContentFilePropertiesFile = InlineComponentsSchemasChatContentFilePropertiesFile.build(block)
