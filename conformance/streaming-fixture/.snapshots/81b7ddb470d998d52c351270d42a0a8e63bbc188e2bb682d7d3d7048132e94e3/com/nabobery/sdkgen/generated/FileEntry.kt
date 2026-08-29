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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/FileEntry.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FileEntry
 */
@Serializable(with = FileEntry.Serializer::class)
public class FileEntry(
  public val filename: String,
  public val id: String,
) {
  public class Builder {
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

    public fun build(): FileEntry {
      check(filenameValue != null) { "filename is required" }
      check(idValue != null) { "id is required" }
      return FileEntry(
        filename = filename,
        id = id,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FileEntry = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FileEntry> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FileEntry {
      val jsonDecoder = decoder.requireJsonDecoder("FileEntry")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FileEntry must be a JSON object")
      val filename = json.decodeRequired<String>(rawObject, "filename")
      val id = json.decodeRequired<String>(rawObject, "id")
      return FileEntry(
        filename = filename,
        id = id,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FileEntry) {
      val jsonEncoder = encoder.requireJsonEncoder("FileEntry")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("filename", value.filename)
        put("id", value.id)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fileEntry(block: FileEntry.Builder.() -> Unit): FileEntry = FileEntry.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FileEntry is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
