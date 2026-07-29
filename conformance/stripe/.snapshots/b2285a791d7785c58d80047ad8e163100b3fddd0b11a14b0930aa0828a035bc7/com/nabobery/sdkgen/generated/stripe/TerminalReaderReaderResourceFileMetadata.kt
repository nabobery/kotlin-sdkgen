package com.nabobery.sdkgen.generated.stripe

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
 * Metadata of an uploaded file
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_file_metadata
 */
@Serializable(with = TerminalReaderReaderResourceFileMetadata.Serializer::class)
public class TerminalReaderReaderResourceFileMetadata(
  /**
   * Creation time of the object (in seconds since the Unix epoch).
   */
  public val createdAt: Int,
  /**
   * The original name of the uploaded file (e.g. `receipt.png`).
   */
  public val filename: String,
  /**
   * The size (in bytes) of the uploaded file.
   */
  public val size: Int,
  /**
   * The format of the uploaded file.
   */
  public val type: String,
) {
  public class Builder {
    private var createdAtValue: Int? = null

    public var createdAt: Int
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var filenameValue: String? = null

    public var filename: String
      get() = requireNotNull(filenameValue) { "filename is required" }
      set(`value`) {
        filenameValue = value
      }

    private var sizeValue: Int? = null

    public var size: Int
      get() = requireNotNull(sizeValue) { "size is required" }
      set(`value`) {
        sizeValue = value
      }

    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): TerminalReaderReaderResourceFileMetadata {
      check(createdAtValue != null) { "createdAt is required" }
      check(filenameValue != null) { "filename is required" }
      check(sizeValue != null) { "size is required" }
      check(typeValue != null) { "type is required" }
      return TerminalReaderReaderResourceFileMetadata(
        createdAt = createdAt,
        filename = filename,
        size = size,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TerminalReaderReaderResourceFileMetadata = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TerminalReaderReaderResourceFileMetadata> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalReaderReaderResourceFileMetadata {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalReaderReaderResourceFileMetadata")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalReaderReaderResourceFileMetadata must be a JSON object")
      val createdAt = json.decodeRequired<Int>(rawObject, "created_at")
      val filename = json.decodeRequired<String>(rawObject, "filename")
      val size = json.decodeRequired<Int>(rawObject, "size")
      val type = json.decodeRequired<String>(rawObject, "type")
      return TerminalReaderReaderResourceFileMetadata(
        createdAt = createdAt,
        filename = filename,
        size = size,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalReaderReaderResourceFileMetadata) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalReaderReaderResourceFileMetadata")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", json.encodeToJsonElement(value.createdAt))
        put("filename", value.filename)
        put("size", json.encodeToJsonElement(value.size))
        put("type", value.type)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun terminalReaderReaderResourceFileMetadata(block: TerminalReaderReaderResourceFileMetadata.Builder.() -> Unit): TerminalReaderReaderResourceFileMetadata = TerminalReaderReaderResourceFileMetadata.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TerminalReaderReaderResourceFileMetadata is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
