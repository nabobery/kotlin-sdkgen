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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/pull-request-minimal/properties/head.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request-minimal/properties/head
 */
@Serializable(with = InlinePullRequestMinimalHeadXb9b782f0.Serializer::class)
public class InlinePullRequestMinimalHeadXb9b782f0(
  public val ref: String,
  public val repo: InlinePullRequestMinimalHeadRepoXe5795fd0,
  public val sha: String,
) {
  public class Builder {
    private var refValue: String? = null

    public var ref: String
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
      }

    private var repoValue: InlinePullRequestMinimalHeadRepoXe5795fd0? = null

    public var repo: InlinePullRequestMinimalHeadRepoXe5795fd0
      get() = requireNotNull(repoValue) { "repo is required" }
      set(`value`) {
        repoValue = value
      }

    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    public fun build(): InlinePullRequestMinimalHeadXb9b782f0 {
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      return InlinePullRequestMinimalHeadXb9b782f0(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePullRequestMinimalHeadXb9b782f0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePullRequestMinimalHeadXb9b782f0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePullRequestMinimalHeadXb9b782f0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePullRequestMinimalHeadXb9b782f0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePullRequestMinimalHeadXb9b782f0 must be a JSON object")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<InlinePullRequestMinimalHeadRepoXe5795fd0>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlinePullRequestMinimalHeadXb9b782f0(
        ref = ref,
        repo = repo,
        sha = sha,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestMinimalHeadXb9b782f0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePullRequestMinimalHeadXb9b782f0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("ref", value.ref)
        put("repo", json.encodeToJsonElement(value.repo))
        put("sha", value.sha)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePullRequestMinimalHeadXb9b782f0(block: InlinePullRequestMinimalHeadXb9b782f0.Builder.() -> Unit): InlinePullRequestMinimalHeadXb9b782f0 = InlinePullRequestMinimalHeadXb9b782f0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePullRequestMinimalHeadXb9b782f0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
