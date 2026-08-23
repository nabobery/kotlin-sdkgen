package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * The review that was affected.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/review
 */
@Serializable(with = InlineWebhookPullRequestReviewDismissedReviewX7bd70b12.Serializer::class)
public class InlineWebhookPullRequestReviewDismissedReviewX7bd70b12 internal constructor(
  public val links: InlineWebhookPullRequestReviewDismissedReviewLinksX540fe07f,
  /**
   * How the author is associated with the repository.
   */
  public val authorAssociation:
      InlineWebhookPullRequestReviewDismissedReviewAuthorAssociationX4ccb41dd,
  /**
   * The text of the review.
   */
  public val body: String?,
  /**
   * A commit SHA for the review.
   */
  public val commitId: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * Unique identifier of the review
   */
  public val id: Int,
  public val nodeId: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pullRequestUrl: String,
  public val state: InlineWebhookPullRequestReviewDismissedReviewStateX05ee8b47,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val submittedAt: String,
  public val user: InlineWebhookPullRequestReviewDismissedReviewUserX584d71f7?,
  private val updatedAtState: FieldState<String?>,
) {
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String?
    get() = updatedAtState.valueOrNull()

  public constructor(
    links: InlineWebhookPullRequestReviewDismissedReviewLinksX540fe07f,
    authorAssociation: InlineWebhookPullRequestReviewDismissedReviewAuthorAssociationX4ccb41dd,
    body: String?,
    commitId: String,
    htmlUrl: String,
    id: Int,
    nodeId: String,
    pullRequestUrl: String,
    state: InlineWebhookPullRequestReviewDismissedReviewStateX05ee8b47,
    submittedAt: String,
    user: InlineWebhookPullRequestReviewDismissedReviewUserX584d71f7?,
  ) : this(links = links,
  authorAssociation = authorAssociation,
  body = body,
  commitId = commitId,
  htmlUrl = htmlUrl,
  id = id,
  nodeId = nodeId,
  pullRequestUrl = pullRequestUrl,
  state = state,
  submittedAt = submittedAt,
  user = user,
  updatedAtState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `updated_at`.
   */
  public fun updatedAtPresence(): FieldPresence = updatedAtState.presence

  public class Builder {
    private var linksValue: InlineWebhookPullRequestReviewDismissedReviewLinksX540fe07f? = null

    public var links: InlineWebhookPullRequestReviewDismissedReviewLinksX540fe07f
      get() = requireNotNull(linksValue) { "links is required" }
      set(`value`) {
        linksValue = value
      }

    private var authorAssociationValue:
        InlineWebhookPullRequestReviewDismissedReviewAuthorAssociationX4ccb41dd? = null

    public var authorAssociation:
        InlineWebhookPullRequestReviewDismissedReviewAuthorAssociationX4ccb41dd
      get() = requireNotNull(authorAssociationValue) { "authorAssociation is required" }
      set(`value`) {
        authorAssociationValue = value
      }

    private var commitIdValue: String? = null

    public var commitId: String
      get() = requireNotNull(commitIdValue) { "commitId is required" }
      set(`value`) {
        commitIdValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var pullRequestUrlValue: String? = null

    public var pullRequestUrl: String
      get() = requireNotNull(pullRequestUrlValue) { "pullRequestUrl is required" }
      set(`value`) {
        pullRequestUrlValue = value
      }

    private var stateValue: InlineWebhookPullRequestReviewDismissedReviewStateX05ee8b47? = null

    public var state: InlineWebhookPullRequestReviewDismissedReviewStateX05ee8b47
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var submittedAtValue: String? = null

    public var submittedAt: String
      get() = requireNotNull(submittedAtValue) { "submittedAt is required" }
      set(`value`) {
        submittedAtValue = value
      }

    private var bodyState: FieldState<String?> = FieldState.Absent

    /**
     * The text of the review.
     * Required nullable field; assigning `null` records present-null.
     */
    public var body: String?
      get() = bodyState.valueOrNull()
      set(`value`) {
        bodyState = value.toNullableFieldState()
      }

    private var userState: FieldState<InlineWebhookPullRequestReviewDismissedReviewUserX584d71f7?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: InlineWebhookPullRequestReviewDismissedReviewUserX584d71f7?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    private var updatedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var updatedAt: String?
      get() = updatedAtState.valueOrNull()
      set(`value`) {
        updatedAtState = value.toNullableFieldState()
      }

    /**
     * Omits `updated_at` from serialized output.
     */
    public fun unsetUpdatedAt() {
      updatedAtState = FieldState.Absent
    }

    public fun build(): InlineWebhookPullRequestReviewDismissedReviewX7bd70b12 {
      check(linksValue != null) { "links is required" }
      check(authorAssociationValue != null) { "authorAssociation is required" }
      check(commitIdValue != null) { "commitId is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(pullRequestUrlValue != null) { "pullRequestUrl is required" }
      check(stateValue != null) { "state is required" }
      check(submittedAtValue != null) { "submittedAt is required" }
      check(bodyState !== FieldState.Absent) { "body is required, even when null" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return InlineWebhookPullRequestReviewDismissedReviewX7bd70b12(
        links = links,
        authorAssociation = authorAssociation,
        body = bodyState.valueOrNull(),
        commitId = commitId,
        htmlUrl = htmlUrl,
        id = id,
        nodeId = nodeId,
        pullRequestUrl = pullRequestUrl,
        state = state,
        submittedAt = submittedAt,
        user = userState.valueOrNull(),
        updatedAtState = updatedAtState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewDismissedReviewX7bd70b12 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewDismissedReviewX7bd70b12> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewDismissedReviewX7bd70b12 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewDismissedReviewX7bd70b12")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewDismissedReviewX7bd70b12 must be a JSON object")
      val links = json.decodeRequired<InlineWebhookPullRequestReviewDismissedReviewLinksX540fe07f>(rawObject, "_links")
      val authorAssociation = json.decodeRequired<InlineWebhookPullRequestReviewDismissedReviewAuthorAssociationX4ccb41dd>(rawObject, "author_association")
      val commitId = json.decodeRequired<String>(rawObject, "commit_id")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val pullRequestUrl = json.decodeRequired<String>(rawObject, "pull_request_url")
      val state = json.decodeRequired<InlineWebhookPullRequestReviewDismissedReviewStateX05ee8b47>(rawObject, "state")
      val submittedAt = json.decodeRequired<String>(rawObject, "submitted_at")
      if (!rawObject.containsKey("body")) {
        throw SerializationException("InlineWebhookPullRequestReviewDismissedReviewX7bd70b12 is missing required property 'body'")
      }
      val body = rawObject["body"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user")) {
        throw SerializationException("InlineWebhookPullRequestReviewDismissedReviewX7bd70b12 is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestReviewDismissedReviewUserX584d71f7?>(requireNotNull(element)) }
      return InlineWebhookPullRequestReviewDismissedReviewX7bd70b12(
        links = links,
        authorAssociation = authorAssociation,
        body = body,
        commitId = commitId,
        htmlUrl = htmlUrl,
        id = id,
        nodeId = nodeId,
        pullRequestUrl = pullRequestUrl,
        state = state,
        submittedAt = submittedAt,
        user = user,
        updatedAtState = json.decodeOptional(rawObject, "updated_at", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewDismissedReviewX7bd70b12) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewDismissedReviewX7bd70b12")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("_links", json.encodeToJsonElement(value.links))
        put("author_association", json.encodeToJsonElement(value.authorAssociation))
        put("body", value.body?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("commit_id", value.commitId)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
        put("pull_request_url", value.pullRequestUrl)
        put("state", json.encodeToJsonElement(value.state))
        put("submitted_at", value.submittedAt)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("updated_at", value.updatedAtState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewDismissedReviewX7bd70b12(block: InlineWebhookPullRequestReviewDismissedReviewX7bd70b12.Builder.() -> Unit): InlineWebhookPullRequestReviewDismissedReviewX7bd70b12 = InlineWebhookPullRequestReviewDismissedReviewX7bd70b12.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewDismissedReviewX7bd70b12 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookPullRequestReviewDismissedReviewX7bd70b12 property '" + name + "' is not nullable")
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
