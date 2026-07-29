package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * Legacy Review Comment
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/review-comment
 */
@Serializable(with = ReviewComment.Serializer::class)
public class ReviewComment internal constructor(
  public val links: InlineReviewCommentLinksX4b56894a,
  public val authorAssociation: AuthorAssociation,
  public val body: String,
  public val commitId: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val diffHunk: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: Long,
  public val nodeId: String,
  public val originalCommitId: String,
  public val originalPosition: Int,
  public val path: String,
  public val position: Int?,
  public val pullRequestReviewId: Long?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pullRequestUrl: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val user: NullableSimpleUser?,
  private val bodyHtmlState: FieldState<String>,
  private val bodyTextState: FieldState<String>,
  private val inReplyToIdState: FieldState<Int>,
  private val lineState: FieldState<Int>,
  private val originalLineState: FieldState<Int>,
  private val originalStartLineState: FieldState<Int?>,
  private val reactionsState: FieldState<ReactionRollup>,
  private val sideState: FieldState<InlineReviewCommentSideX34b23eac>,
  private val startLineState: FieldState<Int?>,
  private val startSideState: FieldState<InlineReviewCommentStartSideX22ee66e9?>,
  private val subjectTypeState: FieldState<InlineReviewCommentSubjectTypeXffb0aa37>,
) {
  public val bodyHtml: String?
    get() = bodyHtmlState.valueOrNull()

  public val bodyText: String?
    get() = bodyTextState.valueOrNull()

  public val inReplyToId: Int?
    get() = inReplyToIdState.valueOrNull()

  /**
   * The line of the blob to which the comment applies. The last line of the range for a multi-line comment
   */
  public val line: Int?
    get() = lineState.valueOrNull()

  /**
   * The original line of the blob to which the comment applies. The last line of the range for a multi-line comment
   */
  public val originalLine: Int?
    get() = originalLineState.valueOrNull()

  /**
   * The original first line of the range for a multi-line comment.
   */
  public val originalStartLine: Int?
    get() = originalStartLineState.valueOrNull()

  public val reactions: ReactionRollup?
    get() = reactionsState.valueOrNull()

  /**
   * The side of the first line of the range for a multi-line comment.
   */
  public val side: InlineReviewCommentSideX34b23eac?
    get() = sideState.valueOrNull()

  /**
   * The first line of the range for a multi-line comment.
   */
  public val startLine: Int?
    get() = startLineState.valueOrNull()

  /**
   * The side of the first line of the range for a multi-line comment.
   */
  public val startSide: InlineReviewCommentStartSideX22ee66e9?
    get() = startSideState.valueOrNull()

  /**
   * The level at which the comment is targeted, can be a diff line or a file.
   */
  public val subjectType: InlineReviewCommentSubjectTypeXffb0aa37?
    get() = subjectTypeState.valueOrNull()

  public constructor(
    links: InlineReviewCommentLinksX4b56894a,
    authorAssociation: AuthorAssociation,
    body: String,
    commitId: String,
    createdAt: String,
    diffHunk: String,
    htmlUrl: String,
    id: Long,
    nodeId: String,
    originalCommitId: String,
    originalPosition: Int,
    path: String,
    position: Int?,
    pullRequestReviewId: Long?,
    pullRequestUrl: String,
    updatedAt: String,
    url: String,
    user: NullableSimpleUser?,
  ) : this(links = links,
  authorAssociation = authorAssociation,
  body = body,
  commitId = commitId,
  createdAt = createdAt,
  diffHunk = diffHunk,
  htmlUrl = htmlUrl,
  id = id,
  nodeId = nodeId,
  originalCommitId = originalCommitId,
  originalPosition = originalPosition,
  path = path,
  position = position,
  pullRequestReviewId = pullRequestReviewId,
  pullRequestUrl = pullRequestUrl,
  updatedAt = updatedAt,
  url = url,
  user = user,
  bodyHtmlState = FieldState.Absent,
  bodyTextState = FieldState.Absent,
  inReplyToIdState = FieldState.Absent,
  lineState = FieldState.Absent,
  originalLineState = FieldState.Absent,
  originalStartLineState = FieldState.Absent,
  reactionsState = FieldState.Absent,
  sideState = FieldState.Absent,
  startLineState = FieldState.Absent,
  startSideState = FieldState.Absent,
  subjectTypeState = FieldState.Absent,
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
   * Returns the wire presence of `in_reply_to_id`.
   */
  public fun inReplyToIdPresence(): FieldPresence = inReplyToIdState.presence

  /**
   * Returns the wire presence of `line`.
   */
  public fun linePresence(): FieldPresence = lineState.presence

  /**
   * Returns the wire presence of `original_line`.
   */
  public fun originalLinePresence(): FieldPresence = originalLineState.presence

  /**
   * Returns the wire presence of `original_start_line`.
   */
  public fun originalStartLinePresence(): FieldPresence = originalStartLineState.presence

  /**
   * Returns the wire presence of `reactions`.
   */
  public fun reactionsPresence(): FieldPresence = reactionsState.presence

  /**
   * Returns the wire presence of `side`.
   */
  public fun sidePresence(): FieldPresence = sideState.presence

  /**
   * Returns the wire presence of `start_line`.
   */
  public fun startLinePresence(): FieldPresence = startLineState.presence

  /**
   * Returns the wire presence of `start_side`.
   */
  public fun startSidePresence(): FieldPresence = startSideState.presence

  /**
   * Returns the wire presence of `subject_type`.
   */
  public fun subjectTypePresence(): FieldPresence = subjectTypeState.presence

  public class Builder {
    private var linksValue: InlineReviewCommentLinksX4b56894a? = null

    public var links: InlineReviewCommentLinksX4b56894a
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

    private var commitIdValue: String? = null

    public var commitId: String
      get() = requireNotNull(commitIdValue) { "commitId is required" }
      set(`value`) {
        commitIdValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var diffHunkValue: String? = null

    public var diffHunk: String
      get() = requireNotNull(diffHunkValue) { "diffHunk is required" }
      set(`value`) {
        diffHunkValue = value
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

    private var originalCommitIdValue: String? = null

    public var originalCommitId: String
      get() = requireNotNull(originalCommitIdValue) { "originalCommitId is required" }
      set(`value`) {
        originalCommitIdValue = value
      }

    private var originalPositionValue: Int? = null

    public var originalPosition: Int
      get() = requireNotNull(originalPositionValue) { "originalPosition is required" }
      set(`value`) {
        originalPositionValue = value
      }

    private var pathValue: String? = null

    public var path: String
      get() = requireNotNull(pathValue) { "path is required" }
      set(`value`) {
        pathValue = value
      }

    private var pullRequestUrlValue: String? = null

    public var pullRequestUrl: String
      get() = requireNotNull(pullRequestUrlValue) { "pullRequestUrl is required" }
      set(`value`) {
        pullRequestUrlValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var positionState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var position: Int?
      get() = positionState.valueOrNull()
      set(`value`) {
        positionState = value.toNullableFieldState()
      }

    private var pullRequestReviewIdState: FieldState<Long?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var pullRequestReviewId: Long?
      get() = pullRequestReviewIdState.valueOrNull()
      set(`value`) {
        pullRequestReviewIdState = value.toNullableFieldState()
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

    private var inReplyToIdState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var inReplyToId: Int?
      get() = inReplyToIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "inReplyToId is not nullable; call unsetInReplyToId() to omit it" }
        inReplyToIdState = FieldState.Value(present)
      }

    private var lineState: FieldState<Int> = FieldState.Absent

    /**
     * The line of the blob to which the comment applies. The last line of the range for a multi-line comment
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var line: Int?
      get() = lineState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "line is not nullable; call unsetLine() to omit it" }
        lineState = FieldState.Value(present)
      }

    private var originalLineState: FieldState<Int> = FieldState.Absent

    /**
     * The original line of the blob to which the comment applies. The last line of the range for a multi-line comment
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var originalLine: Int?
      get() = originalLineState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "originalLine is not nullable; call unsetOriginalLine() to omit it" }
        originalLineState = FieldState.Value(present)
      }

    private var originalStartLineState: FieldState<Int?> = FieldState.Absent

    /**
     * The original first line of the range for a multi-line comment.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var originalStartLine: Int?
      get() = originalStartLineState.valueOrNull()
      set(`value`) {
        originalStartLineState = value.toNullableFieldState()
      }

    private var reactionsState: FieldState<ReactionRollup> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var reactions: ReactionRollup?
      get() = reactionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "reactions is not nullable; call unsetReactions() to omit it" }
        reactionsState = FieldState.Value(present)
      }

    private var sideState: FieldState<InlineReviewCommentSideX34b23eac> = FieldState.Absent

    /**
     * The side of the first line of the range for a multi-line comment.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var side: InlineReviewCommentSideX34b23eac?
      get() = sideState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "side is not nullable; call unsetSide() to omit it" }
        sideState = FieldState.Value(present)
      }

    private var startLineState: FieldState<Int?> = FieldState.Absent

    /**
     * The first line of the range for a multi-line comment.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var startLine: Int?
      get() = startLineState.valueOrNull()
      set(`value`) {
        startLineState = value.toNullableFieldState()
      }

    private var startSideState: FieldState<InlineReviewCommentStartSideX22ee66e9?> =
        FieldState.Absent

    /**
     * The side of the first line of the range for a multi-line comment.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var startSide: InlineReviewCommentStartSideX22ee66e9?
      get() = startSideState.valueOrNull()
      set(`value`) {
        startSideState = value.toNullableFieldState()
      }

    private var subjectTypeState: FieldState<InlineReviewCommentSubjectTypeXffb0aa37> =
        FieldState.Absent

    /**
     * The level at which the comment is targeted, can be a diff line or a file.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var subjectType: InlineReviewCommentSubjectTypeXffb0aa37?
      get() = subjectTypeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "subjectType is not nullable; call unsetSubjectType() to omit it" }
        subjectTypeState = FieldState.Value(present)
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
     * Omits `in_reply_to_id` from serialized output.
     */
    public fun unsetInReplyToId() {
      inReplyToIdState = FieldState.Absent
    }

    /**
     * Omits `line` from serialized output.
     */
    public fun unsetLine() {
      lineState = FieldState.Absent
    }

    /**
     * Omits `original_line` from serialized output.
     */
    public fun unsetOriginalLine() {
      originalLineState = FieldState.Absent
    }

    /**
     * Omits `original_start_line` from serialized output.
     */
    public fun unsetOriginalStartLine() {
      originalStartLineState = FieldState.Absent
    }

    /**
     * Omits `reactions` from serialized output.
     */
    public fun unsetReactions() {
      reactionsState = FieldState.Absent
    }

    /**
     * Omits `side` from serialized output.
     */
    public fun unsetSide() {
      sideState = FieldState.Absent
    }

    /**
     * Omits `start_line` from serialized output.
     */
    public fun unsetStartLine() {
      startLineState = FieldState.Absent
    }

    /**
     * Omits `start_side` from serialized output.
     */
    public fun unsetStartSide() {
      startSideState = FieldState.Absent
    }

    /**
     * Omits `subject_type` from serialized output.
     */
    public fun unsetSubjectType() {
      subjectTypeState = FieldState.Absent
    }

    public fun build(): ReviewComment {
      check(linksValue != null) { "links is required" }
      check(authorAssociationValue != null) { "authorAssociation is required" }
      check(bodyValue != null) { "body is required" }
      check(commitIdValue != null) { "commitId is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(diffHunkValue != null) { "diffHunk is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(originalCommitIdValue != null) { "originalCommitId is required" }
      check(originalPositionValue != null) { "originalPosition is required" }
      check(pathValue != null) { "path is required" }
      check(pullRequestUrlValue != null) { "pullRequestUrl is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(positionState !== FieldState.Absent) { "position is required, even when null" }
      check(pullRequestReviewIdState !== FieldState.Absent) { "pullRequestReviewId is required, even when null" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return ReviewComment(
        links = links,
        authorAssociation = authorAssociation,
        body = body,
        commitId = commitId,
        createdAt = createdAt,
        diffHunk = diffHunk,
        htmlUrl = htmlUrl,
        id = id,
        nodeId = nodeId,
        originalCommitId = originalCommitId,
        originalPosition = originalPosition,
        path = path,
        position = positionState.valueOrNull(),
        pullRequestReviewId = pullRequestReviewIdState.valueOrNull(),
        pullRequestUrl = pullRequestUrl,
        updatedAt = updatedAt,
        url = url,
        user = userState.valueOrNull(),
        bodyHtmlState = bodyHtmlState,
        bodyTextState = bodyTextState,
        inReplyToIdState = inReplyToIdState,
        lineState = lineState,
        originalLineState = originalLineState,
        originalStartLineState = originalStartLineState,
        reactionsState = reactionsState,
        sideState = sideState,
        startLineState = startLineState,
        startSideState = startSideState,
        subjectTypeState = subjectTypeState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ReviewComment = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ReviewComment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ReviewComment {
      val jsonDecoder = decoder.requireJsonDecoder("ReviewComment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ReviewComment must be a JSON object")
      val links = json.decodeRequired<InlineReviewCommentLinksX4b56894a>(rawObject, "_links")
      val authorAssociation = json.decodeRequired<AuthorAssociation>(rawObject, "author_association")
      val body = json.decodeRequired<String>(rawObject, "body")
      val commitId = json.decodeRequired<String>(rawObject, "commit_id")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val diffHunk = json.decodeRequired<String>(rawObject, "diff_hunk")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val originalCommitId = json.decodeRequired<String>(rawObject, "original_commit_id")
      val originalPosition = json.decodeRequired<Int>(rawObject, "original_position")
      val path = json.decodeRequired<String>(rawObject, "path")
      val pullRequestUrl = json.decodeRequired<String>(rawObject, "pull_request_url")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("position")) {
        throw SerializationException("ReviewComment is missing required property 'position'")
      }
      val position = rawObject["position"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("pull_request_review_id")) {
        throw SerializationException("ReviewComment is missing required property 'pull_request_review_id'")
      }
      val pullRequestReviewId = rawObject["pull_request_review_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Long?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user")) {
        throw SerializationException("ReviewComment is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      return ReviewComment(
        links = links,
        authorAssociation = authorAssociation,
        body = body,
        commitId = commitId,
        createdAt = createdAt,
        diffHunk = diffHunk,
        htmlUrl = htmlUrl,
        id = id,
        nodeId = nodeId,
        originalCommitId = originalCommitId,
        originalPosition = originalPosition,
        path = path,
        position = position,
        pullRequestReviewId = pullRequestReviewId,
        pullRequestUrl = pullRequestUrl,
        updatedAt = updatedAt,
        url = url,
        user = user,
        bodyHtmlState = json.decodeOptional(rawObject, "body_html", nullable = false),
        bodyTextState = json.decodeOptional(rawObject, "body_text", nullable = false),
        inReplyToIdState = json.decodeOptional(rawObject, "in_reply_to_id", nullable = false),
        lineState = json.decodeOptional(rawObject, "line", nullable = false),
        originalLineState = json.decodeOptional(rawObject, "original_line", nullable = false),
        originalStartLineState = json.decodeOptional(rawObject, "original_start_line", nullable = true),
        reactionsState = json.decodeOptional(rawObject, "reactions", nullable = false),
        sideState = json.decodeOptional(rawObject, "side", nullable = false),
        startLineState = json.decodeOptional(rawObject, "start_line", nullable = true),
        startSideState = json.decodeOptional(rawObject, "start_side", nullable = true),
        subjectTypeState = json.decodeOptional(rawObject, "subject_type", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ReviewComment) {
      val jsonEncoder = encoder.requireJsonEncoder("ReviewComment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("_links", json.encodeToJsonElement(value.links))
        put("author_association", json.encodeToJsonElement(value.authorAssociation))
        put("body", value.body)
        put("commit_id", value.commitId)
        put("created_at", value.createdAt)
        put("diff_hunk", value.diffHunk)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
        put("original_commit_id", value.originalCommitId)
        put("original_position", json.encodeToJsonElement(value.originalPosition))
        put("path", value.path)
        put("position", value.position?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("pull_request_review_id", value.pullRequestReviewId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("pull_request_url", value.pullRequestUrl)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("body_html", value.bodyHtmlState, json::encodeToJsonElement)
        putState("body_text", value.bodyTextState, json::encodeToJsonElement)
        putState("in_reply_to_id", value.inReplyToIdState, json::encodeToJsonElement)
        putState("line", value.lineState, json::encodeToJsonElement)
        putState("original_line", value.originalLineState, json::encodeToJsonElement)
        putState("original_start_line", value.originalStartLineState, json::encodeToJsonElement)
        putState("reactions", value.reactionsState, json::encodeToJsonElement)
        putState("side", value.sideState, json::encodeToJsonElement)
        putState("start_line", value.startLineState, json::encodeToJsonElement)
        putState("start_side", value.startSideState, json::encodeToJsonElement)
        putState("subject_type", value.subjectTypeState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun reviewComment(block: ReviewComment.Builder.() -> Unit): ReviewComment = ReviewComment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ReviewComment is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("ReviewComment property '" + name + "' is not nullable")
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
