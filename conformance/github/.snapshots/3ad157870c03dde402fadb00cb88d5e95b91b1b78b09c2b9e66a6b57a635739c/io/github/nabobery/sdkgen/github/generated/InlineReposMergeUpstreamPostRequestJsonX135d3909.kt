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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1merge-upstream/post/requestBody/content/application~1js
 * on/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1merge-upstream/post/requestBody/content/application~1js
 * on/schema
 */
@Serializable(with = InlineReposMergeUpstreamPostRequestJsonX135d3909.Serializer::class)
public class InlineReposMergeUpstreamPostRequestJsonX135d3909(
  /**
   * The name of the branch which should be updated to match upstream.
   */
  public val branch: String,
) {
  public class Builder {
    private var branchValue: String? = null

    public var branch: String
      get() = requireNotNull(branchValue) { "branch is required" }
      set(`value`) {
        branchValue = value
      }

    public fun build(): InlineReposMergeUpstreamPostRequestJsonX135d3909 {
      check(branchValue != null) { "branch is required" }
      return InlineReposMergeUpstreamPostRequestJsonX135d3909(
        branch = branch,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposMergeUpstreamPostRequestJsonX135d3909 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposMergeUpstreamPostRequestJsonX135d3909> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposMergeUpstreamPostRequestJsonX135d3909 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposMergeUpstreamPostRequestJsonX135d3909")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposMergeUpstreamPostRequestJsonX135d3909 must be a JSON object")
      val branch = json.decodeRequired<String>(rawObject, "branch")
      return InlineReposMergeUpstreamPostRequestJsonX135d3909(
        branch = branch,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposMergeUpstreamPostRequestJsonX135d3909) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposMergeUpstreamPostRequestJsonX135d3909")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("branch", value.branch)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposMergeUpstreamPostRequestJsonX135d3909(block: InlineReposMergeUpstreamPostRequestJsonX135d3909.Builder.() -> Unit): InlineReposMergeUpstreamPostRequestJsonX135d3909 = InlineReposMergeUpstreamPostRequestJsonX135d3909.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposMergeUpstreamPostRequestJsonX135d3909 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
