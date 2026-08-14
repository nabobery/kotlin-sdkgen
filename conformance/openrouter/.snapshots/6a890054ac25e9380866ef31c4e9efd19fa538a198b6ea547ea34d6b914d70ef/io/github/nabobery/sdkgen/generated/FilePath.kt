package io.github.nabobery.sdkgen.generated

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
public data class FilePathView(
  @SerialName("file_id")
  public val fileId: String,
  public val index: Int,
  public val type: InlineFilePathTypeXd16b3395,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/FilePath.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FilePath
 */
@Serializable(with = FilePath.Serializer::class)
public class FilePath(
  public val fileId: String,
  public val index: Int,
  public val type: InlineFilePathTypeXd16b3395,
) {
  public class Builder {
    private var fileIdValue: String? = null

    public var fileId: String
      get() = requireNotNull(fileIdValue) { "fileId is required" }
      set(`value`) {
        fileIdValue = value
      }

    private var indexValue: Int? = null

    public var index: Int
      get() = requireNotNull(indexValue) { "index is required" }
      set(`value`) {
        indexValue = value
      }

    private var typeValue: InlineFilePathTypeXd16b3395? = null

    public var type: InlineFilePathTypeXd16b3395
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): FilePath {
      check(fileIdValue != null) { "fileId is required" }
      check(indexValue != null) { "index is required" }
      check(typeValue != null) { "type is required" }
      return FilePath(
        fileId = fileId,
        index = index,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FilePath = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FilePath> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FilePath {
      val jsonDecoder = decoder.requireJsonDecoder("FilePath")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FilePath must be a JSON object")
      val fileId = json.decodeRequired<String>(rawObject, "file_id")
      val index = json.decodeRequired<Int>(rawObject, "index")
      val type = json.decodeRequired<InlineFilePathTypeXd16b3395>(rawObject, "type")
      return FilePath(
        fileId = fileId,
        index = index,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: FilePath) {
      val jsonEncoder = encoder.requireJsonEncoder("FilePath")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("file_id", value.fileId)
        put("index", json.encodeToJsonElement(value.index))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun filePath(block: FilePath.Builder.() -> Unit): FilePath = FilePath.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FilePath is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
