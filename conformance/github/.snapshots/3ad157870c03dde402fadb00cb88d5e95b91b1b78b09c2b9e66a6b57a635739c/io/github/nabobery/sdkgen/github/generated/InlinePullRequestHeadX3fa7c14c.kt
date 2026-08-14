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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/pull-request/properties/head.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request/properties/head
 */
@Serializable(with = InlinePullRequestHeadX3fa7c14c.Serializer::class)
public class InlinePullRequestHeadX3fa7c14c(
  public val label: String,
  public val ref: String,
  public val repo: Repository,
  public val sha: String,
  public val user: SimpleUser,
) {
  public class Builder {
    private var labelValue: String? = null

    public var label: String
      get() = requireNotNull(labelValue) { "label is required" }
      set(`value`) {
        labelValue = value
      }

    private var refValue: String? = null

    public var ref: String
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
      }

    private var repoValue: Repository? = null

    public var repo: Repository
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

    private var userValue: SimpleUser? = null

    public var user: SimpleUser
      get() = requireNotNull(userValue) { "user is required" }
      set(`value`) {
        userValue = value
      }

    public fun build(): InlinePullRequestHeadX3fa7c14c {
      check(labelValue != null) { "label is required" }
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      check(userValue != null) { "user is required" }
      return InlinePullRequestHeadX3fa7c14c(
        label = label,
        ref = ref,
        repo = repo,
        sha = sha,
        user = user,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePullRequestHeadX3fa7c14c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePullRequestHeadX3fa7c14c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePullRequestHeadX3fa7c14c {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePullRequestHeadX3fa7c14c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePullRequestHeadX3fa7c14c must be a JSON object")
      val label = json.decodeRequired<String>(rawObject, "label")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<Repository>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val user = json.decodeRequired<SimpleUser>(rawObject, "user")
      return InlinePullRequestHeadX3fa7c14c(
        label = label,
        ref = ref,
        repo = repo,
        sha = sha,
        user = user,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestHeadX3fa7c14c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePullRequestHeadX3fa7c14c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("label", value.label)
        put("ref", value.ref)
        put("repo", json.encodeToJsonElement(value.repo))
        put("sha", value.sha)
        put("user", json.encodeToJsonElement(value.user))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePullRequestHeadX3fa7c14c(block: InlinePullRequestHeadX3fa7c14c.Builder.() -> Unit): InlinePullRequestHeadX3fa7c14c = InlinePullRequestHeadX3fa7c14c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePullRequestHeadX3fa7c14c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
