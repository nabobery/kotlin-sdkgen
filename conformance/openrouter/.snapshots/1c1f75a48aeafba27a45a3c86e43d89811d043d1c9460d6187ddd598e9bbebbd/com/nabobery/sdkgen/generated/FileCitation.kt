package com.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
public data class FileCitationView(
  @SerialName("file_id")
  public val fileId: String,
  public val filename: String,
  public val index: Int,
  public val type: InlineFileCitationTypeX37b8cf8d,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/FileCitation.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FileCitation
 */
@Serializable(with = FileCitation.Serializer::class)
public class FileCitation(
  public val fileId: String,
  public val filename: String,
  public val index: Int,
  public val type: InlineFileCitationTypeX37b8cf8d,
) {
  public class Builder {
    private var fileIdValue: String? = null

    public var fileId: String
      get() = requireNotNull(fileIdValue) { "fileId is required" }
      set(`value`) {
        fileIdValue = value
      }

    private var filenameValue: String? = null

    public var filename: String
      get() = requireNotNull(filenameValue) { "filename is required" }
      set(`value`) {
        filenameValue = value
      }

    private var indexValue: Int? = null

    public var index: Int
      get() = requireNotNull(indexValue) { "index is required" }
      set(`value`) {
        indexValue = value
      }

    private var typeValue: InlineFileCitationTypeX37b8cf8d? = null

    public var type: InlineFileCitationTypeX37b8cf8d
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): FileCitation {
      check(fileIdValue != null) { "fileId is required" }
      check(filenameValue != null) { "filename is required" }
      check(indexValue != null) { "index is required" }
      check(typeValue != null) { "type is required" }
      return FileCitation(
        fileId = fileId,
        filename = filename,
        index = index,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FileCitation = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FileCitation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FileCitation {
      val jsonDecoder = decoder.requireJsonDecoder("FileCitation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FileCitation must be a JSON object")
      val fileId = json.decodeRequired<String>(rawObject, "file_id")
      val filename = json.decodeRequired<String>(rawObject, "filename")
      val index = json.decodeRequired<Int>(rawObject, "index")
      val type = json.decodeRequired<InlineFileCitationTypeX37b8cf8d>(rawObject, "type")
      return FileCitation(
        fileId = fileId,
        filename = filename,
        index = index,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FileCitation) {
      val jsonEncoder = encoder.requireJsonEncoder("FileCitation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("file_id", value.fileId)
        put("filename", value.filename)
        put("index", json.encodeToJsonElement(value.index))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fileCitation(block: FileCitation.Builder.() -> Unit): FileCitation = FileCitation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FileCitation is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
