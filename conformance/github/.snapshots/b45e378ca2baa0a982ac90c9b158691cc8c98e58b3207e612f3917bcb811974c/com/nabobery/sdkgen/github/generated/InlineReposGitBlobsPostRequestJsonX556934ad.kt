package com.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1git~1blobs/post/requestBody/content/application~1json/s
 * chema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1git~1blobs/post/requestBody/content/application~1json/s
 * chema
 */
@Serializable(with = InlineReposGitBlobsPostRequestJsonX556934ad.Serializer::class)
public class InlineReposGitBlobsPostRequestJsonX556934ad(
  /**
   * The new blob's content.
   */
  public val content: String,
  /**
   * The encoding used for `content`. Currently, `"utf-8"` and `"base64"` are supported.
   */
  public val encoding: String? = null,
) {
  public class Builder {
    private var contentValue: String? = null

    public var content: String
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    /**
     * The encoding used for `content`. Currently, `"utf-8"` and `"base64"` are supported.
     */
    public var encoding: String? = null

    public fun build(): InlineReposGitBlobsPostRequestJsonX556934ad {
      check(contentValue != null) { "content is required" }
      return InlineReposGitBlobsPostRequestJsonX556934ad(
        content = content,
        encoding = encoding,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposGitBlobsPostRequestJsonX556934ad = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposGitBlobsPostRequestJsonX556934ad> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposGitBlobsPostRequestJsonX556934ad {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposGitBlobsPostRequestJsonX556934ad")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposGitBlobsPostRequestJsonX556934ad must be a JSON object")
      val content = json.decodeRequired<String>(rawObject, "content")
      return InlineReposGitBlobsPostRequestJsonX556934ad(
        content = content,
        encoding = rawObject["encoding"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposGitBlobsPostRequestJsonX556934ad) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposGitBlobsPostRequestJsonX556934ad")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", value.content)
        value.encoding?.let { put("encoding", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposGitBlobsPostRequestJsonX556934ad(block: InlineReposGitBlobsPostRequestJsonX556934ad.Builder.() -> Unit): InlineReposGitBlobsPostRequestJsonX556934ad = InlineReposGitBlobsPostRequestJsonX556934ad.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposGitBlobsPostRequestJsonX556934ad is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
