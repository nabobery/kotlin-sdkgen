package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Long
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
 * Pull Request Reviews are reviews on pull requests.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request-review
 */
@Serializable(with = PullRequestReview.Serializer::class)
public class PullRequestReview internal constructor(
  public val links: InlinePullRequestReviewLinksX8e6de1a2,
  public val authorAssociation: AuthorAssociation,
  /**
   * The text of the review.
   */
  public val body: String,
  /**
   * A commit SHA for the review. If the commit object was garbage collected or forcibly deleted, then it no longer
   * exists in Git and this value will be `null`.
   */
  public val commitId: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * Unique identifier of the review
   */
  public val id: Long,
  public val nodeId: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pullRequestUrl: String,
  public val state: String,
  public val user: NullableSimpleUser?,
  private val bodyHtmlState: FieldState<String>,
  private val bodyTextState: FieldState<String>,
  private val submittedAtState: FieldState<String>,
) {
  public val bodyHtml: String?
    get() = bodyHtmlState.valueOrNull()

  public val bodyText: String?
    get() = bodyTextState.valueOrNull()

  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val submittedAt: String?
    get() = submittedAtState.valueOrNull()

  public constructor(
    links: InlinePullRequestReviewLinksX8e6de1a2,
    authorAssociation: AuthorAssociation,
    body: String,
    commitId: String?,
    htmlUrl: String,
    id: Long,
    nodeId: String,
    pullRequestUrl: String,
    state: String,
    user: NullableSimpleUser?,
  ) : this(links = links,
  authorAssociation = authorAssociation,
  body = body,
  commitId = commitId,
  htmlUrl = htmlUrl,
  id = id,
  nodeId = nodeId,
  pullRequestUrl = pullRequestUrl,
  state = state,
  user = user,
  bodyHtmlState = FieldState.Absent,
  bodyTextState = FieldState.Absent,
  submittedAtState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `body_html`.
   */
  public fun bodyHtmlPresence(): FieldPresence = bodyHtmlState.presence

  /**
   * Returns the wire presence of `body_text`.
   */
  public fun bodyTextPresence(): FieldPresence = bodyTextState.presence

  /**
   * Returns the wire presence of `submitted_at`.
   */
  public fun submittedAtPresence(): FieldPresence = submittedAtState.presence

  public class Builder {
    private var linksValue: InlinePullRequestReviewLinksX8e6de1a2? = null

    public var links: InlinePullRequestReviewLinksX8e6de1a2
      get() = requireNotNull(linksValue) { "links is required" }
      set(`value`) {
        linksValue = value
      }

    private var authorAssociationValue: AuthorAssociation? = null

    public var authorAssociation: AuthorAssociation
      get() = requireNotNull(authorAssociationValue) { "authorAssociation is required" }
      set(`value`) {
        authorAssociationValue = value
      }

    private var bodyValue: String? = null

    public var body: String
      get() = requireNotNull(bodyValue) { "body is required" }
      set(`value`) {
        bodyValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Long? = null

    public var id: Long
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

    private var stateValue: String? = null

    public var state: String
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var commitIdState: FieldState<String?> = FieldState.Absent

    /**
     * A commit SHA for the review. If the commit object was garbage collected or forcibly deleted, then it no longer
     * exists in Git and this value will be `null`.
     * Required nullable field; assigning `null` records present-null.
     */
    public var commitId: String?
      get() = commitIdState.valueOrNull()
      set(`value`) {
        commitIdState = value.toNullableFieldState()
      }

    private var userState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: NullableSimpleUser?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    private var bodyHtmlState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var bodyHtml: String?
      get() = bodyHtmlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "bodyHtml is not nullable; call unsetBodyHtml() to omit it" }
        bodyHtmlState = FieldState.Value(present)
      }

    private var bodyTextState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var bodyText: String?
      get() = bodyTextState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "bodyText is not nullable; call unsetBodyText() to omit it" }
        bodyTextState = FieldState.Value(present)
      }

    private var submittedAtState: FieldState<String> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var submittedAt: String?
      get() = submittedAtState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "submittedAt is not nullable; call unsetSubmittedAt() to omit it" }
        submittedAtState = FieldState.Value(present)
      }

    /**
     * Omits `body_html` from serialized output.
     */
    public fun unsetBodyHtml() {
      bodyHtmlState = FieldState.Absent
    }

    /**
     * Omits `body_text` from serialized output.
     */
    public fun unsetBodyText() {
      bodyTextState = FieldState.Absent
    }

    /**
     * Omits `submitted_at` from serialized output.
     */
    public fun unsetSubmittedAt() {
      submittedAtState = FieldState.Absent
    }

    public fun build(): PullRequestReview {
      check(linksValue != null) { "links is required" }
      check(authorAssociationValue != null) { "authorAssociation is required" }
      check(bodyValue != null) { "body is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(pullRequestUrlValue != null) { "pullRequestUrl is required" }
      check(stateValue != null) { "state is required" }
      check(commitIdState !== FieldState.Absent) { "commitId is required, even when null" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return PullRequestReview(
        links = links,
        authorAssociation = authorAssociation,
        body = body,
        commitId = commitIdState.valueOrNull(),
        htmlUrl = htmlUrl,
        id = id,
        nodeId = nodeId,
        pullRequestUrl = pullRequestUrl,
        state = state,
        user = userState.valueOrNull(),
        bodyHtmlState = bodyHtmlState,
        bodyTextState = bodyTextState,
        submittedAtState = submittedAtState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PullRequestReview = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PullRequestReview> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PullRequestReview {
      val jsonDecoder = decoder.requireJsonDecoder("PullRequestReview")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PullRequestReview must be a JSON object")
      val links = json.decodeRequired<InlinePullRequestReviewLinksX8e6de1a2>(rawObject, "_links")
      val authorAssociation = json.decodeRequired<AuthorAssociation>(rawObject, "author_association")
      val body = json.decodeRequired<String>(rawObject, "body")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val pullRequestUrl = json.decodeRequired<String>(rawObject, "pull_request_url")
      val state = json.decodeRequired<String>(rawObject, "state")
      if (!rawObject.containsKey("commit_id")) {
        throw SerializationException("PullRequestReview is missing required property 'commit_id'")
      }
      val commitId = rawObject["commit_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user")) {
        throw SerializationException("PullRequestReview is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      return PullRequestReview(
        links = links,
        authorAssociation = authorAssociation,
        body = body,
        commitId = commitId,
        htmlUrl = htmlUrl,
        id = id,
        nodeId = nodeId,
        pullRequestUrl = pullRequestUrl,
        state = state,
        user = user,
        bodyHtmlState = json.decodeOptional(rawObject, "body_html", nullable = false),
        bodyTextState = json.decodeOptional(rawObject, "body_text", nullable = false),
        submittedAtState = json.decodeOptional(rawObject, "submitted_at", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: PullRequestReview) {
      val jsonEncoder = encoder.requireJsonEncoder("PullRequestReview")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("_links", json.encodeToJsonElement(value.links))
        put("author_association", json.encodeToJsonElement(value.authorAssociation))
        put("body", value.body)
        put("commit_id", value.commitId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
        put("pull_request_url", value.pullRequestUrl)
        put("state", value.state)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("body_html", value.bodyHtmlState, json::encodeToJsonElement)
        putState("body_text", value.bodyTextState, json::encodeToJsonElement)
        putState("submitted_at", value.submittedAtState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun pullRequestReview(block: PullRequestReview.Builder.() -> Unit): PullRequestReview = PullRequestReview.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PullRequestReview is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("PullRequestReview property '" + name + "' is not nullable")
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
