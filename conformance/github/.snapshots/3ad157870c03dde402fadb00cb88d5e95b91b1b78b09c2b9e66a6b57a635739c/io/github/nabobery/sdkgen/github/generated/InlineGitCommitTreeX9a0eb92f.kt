package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/git-commit/properties/tree.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/git-commit/properties/tree
 */
@Serializable(with = InlineGitCommitTreeX9a0eb92f.Serializer::class)
public class InlineGitCommitTreeX9a0eb92f(
  /**
   * SHA for the commit
   */
  public val sha: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineGitCommitTreeX9a0eb92f {
      check(shaValue != null) { "sha is required" }
      check(urlValue != null) { "url is required" }
      return InlineGitCommitTreeX9a0eb92f(
        sha = sha,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGitCommitTreeX9a0eb92f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineGitCommitTreeX9a0eb92f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGitCommitTreeX9a0eb92f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGitCommitTreeX9a0eb92f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGitCommitTreeX9a0eb92f must be a JSON object")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineGitCommitTreeX9a0eb92f(
        sha = sha,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGitCommitTreeX9a0eb92f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGitCommitTreeX9a0eb92f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("sha", value.sha)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGitCommitTreeX9a0eb92f(block: InlineGitCommitTreeX9a0eb92f.Builder.() -> Unit): InlineGitCommitTreeX9a0eb92f = InlineGitCommitTreeX9a0eb92f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineGitCommitTreeX9a0eb92f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
