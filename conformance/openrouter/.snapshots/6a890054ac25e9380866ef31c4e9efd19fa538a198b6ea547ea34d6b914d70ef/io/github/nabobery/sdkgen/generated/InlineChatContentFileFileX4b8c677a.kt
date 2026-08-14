package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatContentFile/properties/file
 */
@Serializable(with = InlineChatContentFileFileX4b8c677a.Serializer::class)
public class InlineChatContentFileFileX4b8c677a(
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

    public fun build(): InlineChatContentFileFileX4b8c677a = InlineChatContentFileFileX4b8c677a(
      fileData = fileData,
      fileId = fileId,
      filename = filename,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineChatContentFileFileX4b8c677a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineChatContentFileFileX4b8c677a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChatContentFileFileX4b8c677a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChatContentFileFileX4b8c677a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineChatContentFileFileX4b8c677a must be a JSON object")
      return InlineChatContentFileFileX4b8c677a(
        fileData = rawObject["file_data"]?.let { json.decodeFromJsonElement<String>(it) },
        fileId = rawObject["file_id"]?.let { json.decodeFromJsonElement<String>(it) },
        filename = rawObject["filename"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineChatContentFileFileX4b8c677a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineChatContentFileFileX4b8c677a")
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

public fun inlineChatContentFileFileX4b8c677a(block: InlineChatContentFileFileX4b8c677a.Builder.() -> Unit): InlineChatContentFileFileX4b8c677a = InlineChatContentFileFileX4b8c677a.build(block)
