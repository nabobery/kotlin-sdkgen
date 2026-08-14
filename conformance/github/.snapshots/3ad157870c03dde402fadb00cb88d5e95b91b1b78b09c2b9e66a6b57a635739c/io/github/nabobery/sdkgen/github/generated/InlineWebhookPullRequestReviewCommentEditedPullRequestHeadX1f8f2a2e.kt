package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request/p
 * roperties/head.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request/p
 * roperties/head
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e.Serializer::class)
public class InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e(
  public val label: String,
  public val ref: String,
  /**
   * A git repository
   */
  public val repo: InlineWebhookPullRequestReviewCommentEditedPullRequestHeadRepoXa3e1b645?,
  public val sha: String,
  public val user: InlineWebhookPullRequestReviewCommentEditedPullRequestHeadUserX7368f6ba?,
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

    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    private var repoState:
        FieldState<InlineWebhookPullRequestReviewCommentEditedPullRequestHeadRepoXa3e1b645?> =
        FieldState.Absent

    /**
     * A git repository
     * Required nullable field; assigning `null` records present-null.
     */
    public var repo: InlineWebhookPullRequestReviewCommentEditedPullRequestHeadRepoXa3e1b645?
      get() = repoState.valueOrNull()
      set(`value`) {
        repoState = value.toNullableFieldState()
      }

    private var userState:
        FieldState<InlineWebhookPullRequestReviewCommentEditedPullRequestHeadUserX7368f6ba?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: InlineWebhookPullRequestReviewCommentEditedPullRequestHeadUserX7368f6ba?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e {
      check(labelValue != null) { "label is required" }
      check(refValue != null) { "ref is required" }
      check(shaValue != null) { "sha is required" }
      check(repoState !== FieldState.Absent) { "repo is required, even when null" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e(
        label = label,
        ref = ref,
        repo = repoState.valueOrNull(),
        sha = sha,
        user = userState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e must be a JSON object")
      val label = json.decodeRequired<String>(rawObject, "label")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      if (!rawObject.containsKey("repo")) {
        throw SerializationException("InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e is missing required property 'repo'")
      }
      val repo = rawObject["repo"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestReviewCommentEditedPullRequestHeadRepoXa3e1b645?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user")) {
        throw SerializationException("InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestReviewCommentEditedPullRequestHeadUserX7368f6ba?>(requireNotNull(element)) }
      return InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e(
        label = label,
        ref = ref,
        repo = repo,
        sha = sha,
        user = user,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("label", value.label)
        put("ref", value.ref)
        put("repo", value.repo?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("sha", value.sha)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e(block: InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e.Builder.() -> Unit): InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e = InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineWebhookPullRequestReviewCommentEditedPullRequestHeadX1f8f2a2e property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
