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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/pull-request/properties/base.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request/properties/base
 */
@Serializable(with = InlinePullRequestBaseX2c595a59.Serializer::class)
public class InlinePullRequestBaseX2c595a59(
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

    public fun build(): InlinePullRequestBaseX2c595a59 {
      check(labelValue != null) { "label is required" }
      check(refValue != null) { "ref is required" }
      check(repoValue != null) { "repo is required" }
      check(shaValue != null) { "sha is required" }
      check(userValue != null) { "user is required" }
      return InlinePullRequestBaseX2c595a59(
        label = label,
        ref = ref,
        repo = repo,
        sha = sha,
        user = user,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePullRequestBaseX2c595a59 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePullRequestBaseX2c595a59> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePullRequestBaseX2c595a59 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePullRequestBaseX2c595a59")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePullRequestBaseX2c595a59 must be a JSON object")
      val label = json.decodeRequired<String>(rawObject, "label")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val repo = json.decodeRequired<Repository>(rawObject, "repo")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val user = json.decodeRequired<SimpleUser>(rawObject, "user")
      return InlinePullRequestBaseX2c595a59(
        label = label,
        ref = ref,
        repo = repo,
        sha = sha,
        user = user,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestBaseX2c595a59) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePullRequestBaseX2c595a59")
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

public fun inlinePullRequestBaseX2c595a59(block: InlinePullRequestBaseX2c595a59.Builder.() -> Unit): InlinePullRequestBaseX2c595a59 = InlinePullRequestBaseX2c595a59.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePullRequestBaseX2c595a59 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
