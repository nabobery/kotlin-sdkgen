package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/base-gist/properties/files/additionalProperties.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/base-gist/properties/files/additionalProperties
 */
@Serializable(with = InlineBaseGistFilesAdditionalValueX33b45b98.Serializer::class)
public class InlineBaseGistFilesAdditionalValueX33b45b98(
  /**
   * The encoding used for `content`. Currently, `"utf-8"` and `"base64"` are supported.
   */
  public val encoding: String? = null,
  public val filename: String? = null,
  public val language: String? = null,
  public val rawUrl: String? = null,
  public val size: Int? = null,
  public val type: String? = null,
) {
  public class Builder {
    /**
     * The encoding used for `content`. Currently, `"utf-8"` and `"base64"` are supported.
     */
    public var encoding: String? = null

    public var filename: String? = null

    public var language: String? = null

    public var rawUrl: String? = null

    public var size: Int? = null

    public var type: String? = null

    public fun build(): InlineBaseGistFilesAdditionalValueX33b45b98 = InlineBaseGistFilesAdditionalValueX33b45b98(
      encoding = encoding,
      filename = filename,
      language = language,
      rawUrl = rawUrl,
      size = size,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBaseGistFilesAdditionalValueX33b45b98 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineBaseGistFilesAdditionalValueX33b45b98> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBaseGistFilesAdditionalValueX33b45b98 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBaseGistFilesAdditionalValueX33b45b98")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBaseGistFilesAdditionalValueX33b45b98 must be a JSON object")
      return InlineBaseGistFilesAdditionalValueX33b45b98(
        encoding = rawObject["encoding"]?.let { json.decodeFromJsonElement<String>(it) },
        filename = rawObject["filename"]?.let { json.decodeFromJsonElement<String>(it) },
        language = rawObject["language"]?.let { json.decodeFromJsonElement<String>(it) },
        rawUrl = rawObject["raw_url"]?.let { json.decodeFromJsonElement<String>(it) },
        size = rawObject["size"]?.let { json.decodeFromJsonElement<Int>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBaseGistFilesAdditionalValueX33b45b98) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBaseGistFilesAdditionalValueX33b45b98")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.encoding?.let { put("encoding", it) }
        value.filename?.let { put("filename", it) }
        value.language?.let { put("language", it) }
        value.rawUrl?.let { put("raw_url", it) }
        value.size?.let { put("size", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineBaseGistFilesAdditionalValueX33b45b98(block: InlineBaseGistFilesAdditionalValueX33b45b98.Builder.() -> Unit): InlineBaseGistFilesAdditionalValueX33b45b98 = InlineBaseGistFilesAdditionalValueX33b45b98.build(block)
