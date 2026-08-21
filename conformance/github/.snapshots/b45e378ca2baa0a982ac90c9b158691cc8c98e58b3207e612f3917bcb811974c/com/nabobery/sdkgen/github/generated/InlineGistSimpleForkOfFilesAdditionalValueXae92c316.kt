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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/gist-simple/properties/fork_of/properties/files/additionalProperties
 * .
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/gist-simple/properties/fork_of/properties/files/additionalProperties
 */
@Serializable(with = InlineGistSimpleForkOfFilesAdditionalValueXae92c316.Serializer::class)
public class InlineGistSimpleForkOfFilesAdditionalValueXae92c316(
  public val filename: String? = null,
  public val language: String? = null,
  public val rawUrl: String? = null,
  public val size: Int? = null,
  public val type: String? = null,
) {
  public class Builder {
    public var filename: String? = null

    public var language: String? = null

    public var rawUrl: String? = null

    public var size: Int? = null

    public var type: String? = null

    public fun build(): InlineGistSimpleForkOfFilesAdditionalValueXae92c316 = InlineGistSimpleForkOfFilesAdditionalValueXae92c316(
      filename = filename,
      language = language,
      rawUrl = rawUrl,
      size = size,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGistSimpleForkOfFilesAdditionalValueXae92c316 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineGistSimpleForkOfFilesAdditionalValueXae92c316> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGistSimpleForkOfFilesAdditionalValueXae92c316 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGistSimpleForkOfFilesAdditionalValueXae92c316")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGistSimpleForkOfFilesAdditionalValueXae92c316 must be a JSON object")
      return InlineGistSimpleForkOfFilesAdditionalValueXae92c316(
        filename = rawObject["filename"]?.let { json.decodeFromJsonElement<String>(it) },
        language = rawObject["language"]?.let { json.decodeFromJsonElement<String>(it) },
        rawUrl = rawObject["raw_url"]?.let { json.decodeFromJsonElement<String>(it) },
        size = rawObject["size"]?.let { json.decodeFromJsonElement<Int>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGistSimpleForkOfFilesAdditionalValueXae92c316) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGistSimpleForkOfFilesAdditionalValueXae92c316")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
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

public fun inlineGistSimpleForkOfFilesAdditionalValueXae92c316(block: InlineGistSimpleForkOfFilesAdditionalValueXae92c316.Builder.() -> Unit): InlineGistSimpleForkOfFilesAdditionalValueXae92c316 = InlineGistSimpleForkOfFilesAdditionalValueXae92c316.build(block)
