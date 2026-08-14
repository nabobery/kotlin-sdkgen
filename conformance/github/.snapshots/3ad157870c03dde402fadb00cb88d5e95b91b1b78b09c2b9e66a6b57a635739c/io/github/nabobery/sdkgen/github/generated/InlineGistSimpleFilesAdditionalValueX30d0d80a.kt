package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/gist-simple/properties/files/additionalProperties.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/gist-simple/properties/files/additionalProperties
 */
@Serializable(with = InlineGistSimpleFilesAdditionalValueX30d0d80a.Serializer::class)
public class InlineGistSimpleFilesAdditionalValueX30d0d80a(
  public val content: String? = null,
  /**
   * The encoding used for `content`. Currently, `"utf-8"` and `"base64"` are supported.
   */
  public val encoding: String? = null,
  public val filename: String? = null,
  public val language: String? = null,
  public val rawUrl: String? = null,
  public val size: Int? = null,
  public val truncated: Boolean? = null,
  public val type: String? = null,
) {
  public class Builder {
    public var content: String? = null

    /**
     * The encoding used for `content`. Currently, `"utf-8"` and `"base64"` are supported.
     */
    public var encoding: String? = null

    public var filename: String? = null

    public var language: String? = null

    public var rawUrl: String? = null

    public var size: Int? = null

    public var truncated: Boolean? = null

    public var type: String? = null

    public fun build(): InlineGistSimpleFilesAdditionalValueX30d0d80a = InlineGistSimpleFilesAdditionalValueX30d0d80a(
      content = content,
      encoding = encoding,
      filename = filename,
      language = language,
      rawUrl = rawUrl,
      size = size,
      truncated = truncated,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGistSimpleFilesAdditionalValueX30d0d80a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineGistSimpleFilesAdditionalValueX30d0d80a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGistSimpleFilesAdditionalValueX30d0d80a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGistSimpleFilesAdditionalValueX30d0d80a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGistSimpleFilesAdditionalValueX30d0d80a must be a JSON object")
      return InlineGistSimpleFilesAdditionalValueX30d0d80a(
        content = rawObject["content"]?.let { json.decodeFromJsonElement<String>(it) },
        encoding = rawObject["encoding"]?.let { json.decodeFromJsonElement<String>(it) },
        filename = rawObject["filename"]?.let { json.decodeFromJsonElement<String>(it) },
        language = rawObject["language"]?.let { json.decodeFromJsonElement<String>(it) },
        rawUrl = rawObject["raw_url"]?.let { json.decodeFromJsonElement<String>(it) },
        size = rawObject["size"]?.let { json.decodeFromJsonElement<Int>(it) },
        truncated = rawObject["truncated"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGistSimpleFilesAdditionalValueX30d0d80a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGistSimpleFilesAdditionalValueX30d0d80a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.content?.let { put("content", it) }
        value.encoding?.let { put("encoding", it) }
        value.filename?.let { put("filename", it) }
        value.language?.let { put("language", it) }
        value.rawUrl?.let { put("raw_url", it) }
        value.size?.let { put("size", json.encodeToJsonElement(it)) }
        value.truncated?.let { put("truncated", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGistSimpleFilesAdditionalValueX30d0d80a(block: InlineGistSimpleFilesAdditionalValueX30d0d80a.Builder.() -> Unit): InlineGistSimpleFilesAdditionalValueX30d0d80a = InlineGistSimpleFilesAdditionalValueX30d0d80a.build(block)
