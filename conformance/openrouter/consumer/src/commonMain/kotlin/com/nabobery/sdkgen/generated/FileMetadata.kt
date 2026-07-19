package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * Metadata describing a stored file.
 */
@Serializable(with = FileMetadata.Serializer::class)
public class FileMetadata(
  public val createdAt: String,
  public val downloadable: Boolean,
  public val filename: String,
  public val id: String,
  public val mimeType: String,
  public val sizeBytes: Int,
  public val type: InlineComponentsSchemasFileMetadataPropertiesType,
) {
  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var downloadableValue: Boolean? = null

    public var downloadable: Boolean
      get() = requireNotNull(downloadableValue) { "downloadable is required" }
      set(`value`) {
        downloadableValue = value
      }

    private var filenameValue: String? = null

    public var filename: String
      get() = requireNotNull(filenameValue) { "filename is required" }
      set(`value`) {
        filenameValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var mimeTypeValue: String? = null

    public var mimeType: String
      get() = requireNotNull(mimeTypeValue) { "mimeType is required" }
      set(`value`) {
        mimeTypeValue = value
      }

    private var sizeBytesValue: Int? = null

    public var sizeBytes: Int
      get() = requireNotNull(sizeBytesValue) { "sizeBytes is required" }
      set(`value`) {
        sizeBytesValue = value
      }

    private var typeValue: InlineComponentsSchemasFileMetadataPropertiesType? = null

    public var type: InlineComponentsSchemasFileMetadataPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): FileMetadata {
      check(createdAtValue != null) { "createdAt is required" }
      check(downloadableValue != null) { "downloadable is required" }
      check(filenameValue != null) { "filename is required" }
      check(idValue != null) { "id is required" }
      check(mimeTypeValue != null) { "mimeType is required" }
      check(sizeBytesValue != null) { "sizeBytes is required" }
      check(typeValue != null) { "type is required" }
      return FileMetadata(
        createdAt = createdAt,
        downloadable = downloadable,
        filename = filename,
        id = id,
        mimeType = mimeType,
        sizeBytes = sizeBytes,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FileMetadata = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<FileMetadata> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FileMetadata {
      val jsonDecoder = decoder.requireJsonDecoder("FileMetadata")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("FileMetadata must be a JSON object")
      val createdAt = json.decodeRequired<String>(raw, "created_at")
      val downloadable = json.decodeRequired<Boolean>(raw, "downloadable")
      val filename = json.decodeRequired<String>(raw, "filename")
      val id = json.decodeRequired<String>(raw, "id")
      val mimeType = json.decodeRequired<String>(raw, "mime_type")
      val sizeBytes = json.decodeRequired<Int>(raw, "size_bytes")
      val type = json.decodeRequired<InlineComponentsSchemasFileMetadataPropertiesType>(raw, "type")
      return FileMetadata(
        createdAt = createdAt,
        downloadable = downloadable,
        filename = filename,
        id = id,
        mimeType = mimeType,
        sizeBytes = sizeBytes,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FileMetadata) {
      val jsonEncoder = encoder.requireJsonEncoder("FileMetadata")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("downloadable", json.encodeToJsonElement(value.downloadable))
        put("filename", value.filename)
        put("id", value.id)
        put("mime_type", value.mimeType)
        put("size_bytes", json.encodeToJsonElement(value.sizeBytes))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fileMetadata(block: FileMetadata.Builder.() -> Unit): FileMetadata = FileMetadata.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FileMetadata is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
