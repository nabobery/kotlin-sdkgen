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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted/properties/pull_request/
 * properties/head.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted/properties/pull_request/
 * properties/head
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadX315b103b.Serializer::class)
public class InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadX315b103b(
  public val label: String,
  public val ref: String,
  /**
   * A git repository
   */
  public val repo: InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadRepoX89815e48?,
  public val sha: String,
  public val user: InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadUserX8ab89fbb?,
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
        FieldState<InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadRepoX89815e48?> =
        FieldState.Absent

    /**
     * A git repository
     * Required nullable field; assigning `null` records present-null.
     */
    public var repo: InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadRepoX89815e48?
      get() = repoState.valueOrNull()
      set(`value`) {
        repoState = value.toNullableFieldState()
      }

    private var userState:
        FieldState<InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadUserX8ab89fbb?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadUserX8ab89fbb?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadX315b103b {
      check(labelValue != null) { "label is required" }
      check(refValue != null) { "ref is required" }
      check(shaValue != null) { "sha is required" }
      check(repoState !== FieldState.Absent) { "repo is required, even when null" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadX315b103b(
        label = label,
        ref = ref,
        repo = repoState.valueOrNull(),
        sha = sha,
        user = userState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadX315b103b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadX315b103b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadX315b103b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadX315b103b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadX315b103b must be a JSON object")
      val label = json.decodeRequired<String>(rawObject, "label")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      if (!rawObject.containsKey("repo")) {
        throw SerializationException("InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadX315b103b is missing required property 'repo'")
      }
      val repo = rawObject["repo"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadRepoX89815e48?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user")) {
        throw SerializationException("InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadX315b103b is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadUserX8ab89fbb?>(requireNotNull(element)) }
      return InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadX315b103b(
        label = label,
        ref = ref,
        repo = repo,
        sha = sha,
        user = user,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadX315b103b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadX315b103b")
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

public fun inlineWebhookPullRequestReviewCommentDeletedPullRequestHeadX315b103b(block: InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadX315b103b.Builder.() -> Unit): InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadX315b103b = InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadX315b103b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadX315b103b is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookPullRequestReviewCommentDeletedPullRequestHeadX315b103b property '" + name + "' is not nullable")
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
