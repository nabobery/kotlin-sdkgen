package io.github.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class InputFileView(
  @SerialName("file_data")
  public val fileData: String? = null,
  @SerialName("file_id")
  public val fileId: String? = null,
  @SerialName("file_url")
  public val fileUrl: String? = null,
  public val filename: String? = null,
  public val type: InlineInputFileTypeX37f90e13,
)

/**
 * File input content item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/InputFile
 */
@Serializable(with = InputFile.Serializer::class)
public class InputFile(
  public val type: InlineInputFileTypeX37f90e13,
  public val fileData: String? = null,
  public val fileId: String? = null,
  public val fileUrl: String? = null,
  public val filename: String? = null,
) {
  public class Builder {
    private var typeValue: InlineInputFileTypeX37f90e13? = null

    public var type: InlineInputFileTypeX37f90e13
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var fileData: String? = null

    public var fileId: String? = null

    public var fileUrl: String? = null

    public var filename: String? = null

    public fun build(): InputFile {
      check(typeValue != null) { "type is required" }
      return InputFile(
        type = type,
        fileData = fileData,
        fileId = fileId,
        fileUrl = fileUrl,
        filename = filename,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InputFile = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InputFile> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InputFile {
      val jsonDecoder = decoder.requireJsonDecoder("InputFile")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InputFile must be a JSON object")
      val type = json.decodeRequired<InlineInputFileTypeX37f90e13>(rawObject, "type")
      return InputFile(
        type = type,
        fileData = rawObject["file_data"]?.let { json.decodeFromJsonElement<String>(it) },
        fileId = rawObject["file_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        fileUrl = rawObject["file_url"]?.let { json.decodeFromJsonElement<String>(it) },
        filename = rawObject["filename"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InputFile) {
      val jsonEncoder = encoder.requireJsonEncoder("InputFile")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.fileData?.let { put("file_data", it) }
        value.fileId?.let { put("file_id", it) }
        value.fileUrl?.let { put("file_url", it) }
        value.filename?.let { put("filename", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inputFile(block: InputFile.Builder.() -> Unit): InputFile = InputFile.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InputFile is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
