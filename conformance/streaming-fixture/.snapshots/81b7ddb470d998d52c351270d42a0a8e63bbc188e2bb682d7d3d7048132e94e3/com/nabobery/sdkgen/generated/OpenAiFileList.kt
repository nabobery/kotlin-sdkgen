package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OpenAiFileList.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAiFileList
 */
@Serializable(with = OpenAiFileList.Serializer::class)
public class OpenAiFileList(
  public val shape: InlineOpenAiFileListShapeX12980995,
  `data`: List<FileEntry>,
  public val hasMore: Boolean,
  public val objectValue: InlineOpenAiFileListObjectValueX1f865375,
) {
  public val `data`: List<FileEntry> = data.toList()

  public class Builder {
    private var shapeValue: InlineOpenAiFileListShapeX12980995? = null

    public var shape: InlineOpenAiFileListShapeX12980995
      get() = requireNotNull(shapeValue) { "shape is required" }
      set(`value`) {
        shapeValue = value
      }

    private var dataValue: List<FileEntry>? = null

    public var `data`: List<FileEntry>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    private var hasMoreValue: Boolean? = null

    public var hasMore: Boolean
      get() = requireNotNull(hasMoreValue) { "hasMore is required" }
      set(`value`) {
        hasMoreValue = value
      }

    private var objectValueValue: InlineOpenAiFileListObjectValueX1f865375? = null

    public var objectValue: InlineOpenAiFileListObjectValueX1f865375
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    public fun build(): OpenAiFileList {
      check(shapeValue != null) { "shape is required" }
      check(dataValue != null) { "data is required" }
      check(hasMoreValue != null) { "hasMore is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return OpenAiFileList(
        shape = shape,
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OpenAiFileList = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OpenAiFileList> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OpenAiFileList {
      val jsonDecoder = decoder.requireJsonDecoder("OpenAiFileList")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OpenAiFileList must be a JSON object")
      val shape = json.decodeRequired<InlineOpenAiFileListShapeX12980995>(rawObject, "_shape")
      val data = json.decodeRequired<List<FileEntry>>(rawObject, "data")
      val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
      val objectValue = json.decodeRequired<InlineOpenAiFileListObjectValueX1f865375>(rawObject, "object")
      return OpenAiFileList(
        shape = shape,
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
      )
    }

    override fun serialize(encoder: Encoder, `value`: OpenAiFileList) {
      val jsonEncoder = encoder.requireJsonEncoder("OpenAiFileList")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("_shape", json.encodeToJsonElement(value.shape))
        put("data", json.encodeToJsonElement(value.data))
        put("has_more", json.encodeToJsonElement(value.hasMore))
        put("object", json.encodeToJsonElement(value.objectValue))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun openAiFileList(block: OpenAiFileList.Builder.() -> Unit): OpenAiFileList = OpenAiFileList.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OpenAiFileList is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
