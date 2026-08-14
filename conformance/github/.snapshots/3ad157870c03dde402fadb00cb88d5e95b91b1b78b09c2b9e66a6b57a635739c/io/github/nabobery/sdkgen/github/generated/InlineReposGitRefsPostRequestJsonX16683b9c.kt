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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1git~1refs/post/requestBody/content/application~1json/sc
 * hema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1git~1refs/post/requestBody/content/application~1json/sc
 * hema
 */
@Serializable(with = InlineReposGitRefsPostRequestJsonX16683b9c.Serializer::class)
public class InlineReposGitRefsPostRequestJsonX16683b9c(
  /**
   * The name of the fully qualified reference (ie: `refs/heads/master`). If it doesn't start with 'refs' and have at
   * least two slashes, it will be rejected.
   */
  public val ref: String,
  /**
   * The SHA1 value for this reference.
   */
  public val sha: String,
) {
  public class Builder {
    private var refValue: String? = null

    public var ref: String
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
      }

    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    public fun build(): InlineReposGitRefsPostRequestJsonX16683b9c {
      check(refValue != null) { "ref is required" }
      check(shaValue != null) { "sha is required" }
      return InlineReposGitRefsPostRequestJsonX16683b9c(
        ref = ref,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposGitRefsPostRequestJsonX16683b9c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposGitRefsPostRequestJsonX16683b9c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposGitRefsPostRequestJsonX16683b9c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposGitRefsPostRequestJsonX16683b9c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposGitRefsPostRequestJsonX16683b9c must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineReposGitRefsPostRequestJsonX16683b9c(
        ref = ref,
        sha = sha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposGitRefsPostRequestJsonX16683b9c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposGitRefsPostRequestJsonX16683b9c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("ref", value.ref)
        put("sha", value.sha)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposGitRefsPostRequestJsonX16683b9c(block: InlineReposGitRefsPostRequestJsonX16683b9c.Builder.() -> Unit): InlineReposGitRefsPostRequestJsonX16683b9c = InlineReposGitRefsPostRequestJsonX16683b9c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposGitRefsPostRequestJsonX16683b9c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
