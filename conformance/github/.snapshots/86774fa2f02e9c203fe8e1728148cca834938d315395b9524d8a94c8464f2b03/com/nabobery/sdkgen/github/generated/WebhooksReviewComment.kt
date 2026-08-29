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
 * The [comment](https://docs.github.com/rest/pulls/comments#get-a-review-comment-for-a-pull-request) itself.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_review_comment
 */
@Serializable(with = WebhooksReviewComment.Serializer::class)
public class WebhooksReviewComment internal constructor(
  public val links: InlineWebhooksReviewCommentLinksX1b9c5a1c,
  /**
   * How the author is associated with the repository.
   */
  public val authorAssociation: InlineWebhooksReviewCommentAuthorAssociationX15fdf57b,
  /**
   * The text of the comment.
   */
  public val body: String,
  /**
   * The SHA of the commit to which the comment applies.
   */
  public val commitId: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * The diff of the line that the comment refers to.
   */
  public val diffHunk: String,
  /**
   * HTML URL for the pull request review comment.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * The ID of the pull request review comment.
   */
  public val id: Int,
  /**
   * The line of the blob to which the comment applies. The last line of the range for a multi-line comment
   */
  public val line: Int?,
  /**
   * The node ID of the pull request review comment.
   */
  public val nodeId: String,
  /**
   * The SHA of the original commit to which the comment applies.
   */
  public val originalCommitId: String,
  /**
   * The line of the blob to which the comment applies. The last line of the range for a multi-line comment
   */
  public val originalLine: Int,
  /**
   * The index of the original line in the diff to which the comment applies.
   */
  public val originalPosition: Int,
  /**
   * The first line of the range for a multi-line comment.
   */
  public val originalStartLine: Int?,
  /**
   * The relative path of the file to which the comment applies.
   */
  public val path: String,
  /**
   * The line index in the diff to which the comment applies.
   */
  public val position: Int?,
  /**
   * The ID of the pull request review to which the comment belongs.
   */
  public val pullRequestReviewId: Int?,
  /**
   * URL for the pull request that the review comment belongs to.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pullRequestUrl: String,
  public val reactions: InlineWebhooksReviewCommentReactionsXbb9e6912,
  /**
   * The side of the first line of the range for a multi-line comment.
   */
  public val side: InlineWebhooksReviewCommentSideX43294ba2,
  /**
   * The first line of the range for a multi-line comment.
   */
  public val startLine: Int?,
  /**
   * The side of the first line of the range for a multi-line comment.
   */
  public val startSide: InlineWebhooksReviewCommentStartSideX5415f8bc?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * URL for the pull request review comment
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val user: InlineWebhooksReviewCommentUserX53e4038e?,
  private val inReplyToIdState: FieldState<Int>,
  private val subjectTypeState: FieldState<InlineWebhooksReviewCommentSubjectTypeX033f904f>,
) {
  /**
   * The comment ID to reply to.
   */
  public val inReplyToId: Int?
    get() = inReplyToIdState.valueOrNull()

  /**
   * The level at which the comment is targeted, can be a diff line or a file.
   */
  public val subjectType: InlineWebhooksReviewCommentSubjectTypeX033f904f?
    get() = subjectTypeState.valueOrNull()

  public constructor(
    links: InlineWebhooksReviewCommentLinksX1b9c5a1c,
    authorAssociation: InlineWebhooksReviewCommentAuthorAssociationX15fdf57b,
    body: String,
    commitId: String,
    createdAt: String,
    diffHunk: String,
    htmlUrl: String,
    id: Int,
    line: Int?,
    nodeId: String,
    originalCommitId: String,
    originalLine: Int,
    originalPosition: Int,
    originalStartLine: Int?,
    path: String,
    position: Int?,
    pullRequestReviewId: Int?,
    pullRequestUrl: String,
    reactions: InlineWebhooksReviewCommentReactionsXbb9e6912,
    side: InlineWebhooksReviewCommentSideX43294ba2,
    startLine: Int?,
    startSide: InlineWebhooksReviewCommentStartSideX5415f8bc?,
    updatedAt: String,
    url: String,
    user: InlineWebhooksReviewCommentUserX53e4038e?,
  ) : this(links = links,
  authorAssociation = authorAssociation,
  body = body,
  commitId = commitId,
  createdAt = createdAt,
  diffHunk = diffHunk,
  htmlUrl = htmlUrl,
  id = id,
  line = line,
  nodeId = nodeId,
  originalCommitId = originalCommitId,
  originalLine = originalLine,
  originalPosition = originalPosition,
  originalStartLine = originalStartLine,
  path = path,
  position = position,
  pullRequestReviewId = pullRequestReviewId,
  pullRequestUrl = pullRequestUrl,
  reactions = reactions,
  side = side,
  startLine = startLine,
  startSide = startSide,
  updatedAt = updatedAt,
  url = url,
  user = user,
  inReplyToIdState = FieldState.Absent,
  subjectTypeState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `in_reply_to_id`.
   */
  public fun inReplyToIdPresence(): FieldPresence = inReplyToIdState.presence

  /**
   * Returns the wire presence of `subject_type`.
   */
  public fun subjectTypePresence(): FieldPresence = subjectTypeState.presence

  public class Builder {
    private var linksValue: InlineWebhooksReviewCommentLinksX1b9c5a1c? = null

    public var links: InlineWebhooksReviewCommentLinksX1b9c5a1c
      get() = requireNotNull(linksValue) { "links is required" }
      set(`value`) {
        linksValue = value
      }

    private var authorAssociationValue: InlineWebhooksReviewCommentAuthorAssociationX15fdf57b? =
        null

    public var authorAssociation: InlineWebhooksReviewCommentAuthorAssociationX15fdf57b
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

    private var originalCommitIdValue: String? = null

    public var originalCommitId: String
      get() = requireNotNull(originalCommitIdValue) { "originalCommitId is required" }
      set(`value`) {
        originalCommitIdValue = value
      }

    private var originalLineValue: Int? = null

    public var originalLine: Int
      get() = requireNotNull(originalLineValue) { "originalLine is required" }
      set(`value`) {
        originalLineValue = value
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

    private var reactionsValue: InlineWebhooksReviewCommentReactionsXbb9e6912? = null

    public var reactions: InlineWebhooksReviewCommentReactionsXbb9e6912
      get() = requireNotNull(reactionsValue) { "reactions is required" }
      set(`value`) {
        reactionsValue = value
      }

    private var sideValue: InlineWebhooksReviewCommentSideX43294ba2? = null

    public var side: InlineWebhooksReviewCommentSideX43294ba2
      get() = requireNotNull(sideValue) { "side is required" }
      set(`value`) {
        sideValue = value
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

    private var lineState: FieldState<Int?> = FieldState.Absent

    /**
     * The line of the blob to which the comment applies. The last line of the range for a multi-line comment
     * Required nullable field; assigning `null` records present-null.
     */
    public var line: Int?
      get() = lineState.valueOrNull()
      set(`value`) {
        lineState = value.toNullableFieldState()
      }

    private var originalStartLineState: FieldState<Int?> = FieldState.Absent

    /**
     * The first line of the range for a multi-line comment.
     * Required nullable field; assigning `null` records present-null.
     */
    public var originalStartLine: Int?
      get() = originalStartLineState.valueOrNull()
      set(`value`) {
        originalStartLineState = value.toNullableFieldState()
      }

    private var positionState: FieldState<Int?> = FieldState.Absent

    /**
     * The line index in the diff to which the comment applies.
     * Required nullable field; assigning `null` records present-null.
     */
    public var position: Int?
      get() = positionState.valueOrNull()
      set(`value`) {
        positionState = value.toNullableFieldState()
      }

    private var pullRequestReviewIdState: FieldState<Int?> = FieldState.Absent

    /**
     * The ID of the pull request review to which the comment belongs.
     * Required nullable field; assigning `null` records present-null.
     */
    public var pullRequestReviewId: Int?
      get() = pullRequestReviewIdState.valueOrNull()
      set(`value`) {
        pullRequestReviewIdState = value.toNullableFieldState()
      }

    private var startLineState: FieldState<Int?> = FieldState.Absent

    /**
     * The first line of the range for a multi-line comment.
     * Required nullable field; assigning `null` records present-null.
     */
    public var startLine: Int?
      get() = startLineState.valueOrNull()
      set(`value`) {
        startLineState = value.toNullableFieldState()
      }

    private var startSideState: FieldState<InlineWebhooksReviewCommentStartSideX5415f8bc?> =
        FieldState.Absent

    /**
     * The side of the first line of the range for a multi-line comment.
     * Required nullable field; assigning `null` records present-null.
     */
    public var startSide: InlineWebhooksReviewCommentStartSideX5415f8bc?
      get() = startSideState.valueOrNull()
      set(`value`) {
        startSideState = value.toNullableFieldState()
      }

    private var userState: FieldState<InlineWebhooksReviewCommentUserX53e4038e?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: InlineWebhooksReviewCommentUserX53e4038e?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    private var inReplyToIdState: FieldState<Int> = FieldState.Absent

    /**
     * The comment ID to reply to.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var inReplyToId: Int?
      get() = inReplyToIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "inReplyToId is not nullable; call unsetInReplyToId() to omit it" }
        inReplyToIdState = FieldState.Value(present)
      }

    private var subjectTypeState: FieldState<InlineWebhooksReviewCommentSubjectTypeX033f904f> =
        FieldState.Absent

    /**
     * The level at which the comment is targeted, can be a diff line or a file.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var subjectType: InlineWebhooksReviewCommentSubjectTypeX033f904f?
      get() = subjectTypeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "subjectType is not nullable; call unsetSubjectType() to omit it" }
        subjectTypeState = FieldState.Value(present)
      }

    /**
     * Omits `in_reply_to_id` from serialized output.
     */
    public fun unsetInReplyToId() {
      inReplyToIdState = FieldState.Absent
    }

    /**
     * Omits `subject_type` from serialized output.
     */
    public fun unsetSubjectType() {
      subjectTypeState = FieldState.Absent
    }

    public fun build(): WebhooksReviewComment {
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
      check(originalLineValue != null) { "originalLine is required" }
      check(originalPositionValue != null) { "originalPosition is required" }
      check(pathValue != null) { "path is required" }
      check(pullRequestUrlValue != null) { "pullRequestUrl is required" }
      check(reactionsValue != null) { "reactions is required" }
      check(sideValue != null) { "side is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(lineState !== FieldState.Absent) { "line is required, even when null" }
      check(originalStartLineState !== FieldState.Absent) { "originalStartLine is required, even when null" }
      check(positionState !== FieldState.Absent) { "position is required, even when null" }
      check(pullRequestReviewIdState !== FieldState.Absent) { "pullRequestReviewId is required, even when null" }
      check(startLineState !== FieldState.Absent) { "startLine is required, even when null" }
      check(startSideState !== FieldState.Absent) { "startSide is required, even when null" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return WebhooksReviewComment(
        links = links,
        authorAssociation = authorAssociation,
        body = body,
        commitId = commitId,
        createdAt = createdAt,
        diffHunk = diffHunk,
        htmlUrl = htmlUrl,
        id = id,
        line = lineState.valueOrNull(),
        nodeId = nodeId,
        originalCommitId = originalCommitId,
        originalLine = originalLine,
        originalPosition = originalPosition,
        originalStartLine = originalStartLineState.valueOrNull(),
        path = path,
        position = positionState.valueOrNull(),
        pullRequestReviewId = pullRequestReviewIdState.valueOrNull(),
        pullRequestUrl = pullRequestUrl,
        reactions = reactions,
        side = side,
        startLine = startLineState.valueOrNull(),
        startSide = startSideState.valueOrNull(),
        updatedAt = updatedAt,
        url = url,
        user = userState.valueOrNull(),
        inReplyToIdState = inReplyToIdState,
        subjectTypeState = subjectTypeState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhooksReviewComment = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhooksReviewComment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhooksReviewComment {
      val jsonDecoder = decoder.requireJsonDecoder("WebhooksReviewComment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhooksReviewComment must be a JSON object")
      val links = json.decodeRequired<InlineWebhooksReviewCommentLinksX1b9c5a1c>(rawObject, "_links")
      val authorAssociation = json.decodeRequired<InlineWebhooksReviewCommentAuthorAssociationX15fdf57b>(rawObject, "author_association")
      val body = json.decodeRequired<String>(rawObject, "body")
      val commitId = json.decodeRequired<String>(rawObject, "commit_id")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val diffHunk = json.decodeRequired<String>(rawObject, "diff_hunk")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val originalCommitId = json.decodeRequired<String>(rawObject, "original_commit_id")
      val originalLine = json.decodeRequired<Int>(rawObject, "original_line")
      val originalPosition = json.decodeRequired<Int>(rawObject, "original_position")
      val path = json.decodeRequired<String>(rawObject, "path")
      val pullRequestUrl = json.decodeRequired<String>(rawObject, "pull_request_url")
      val reactions = json.decodeRequired<InlineWebhooksReviewCommentReactionsXbb9e6912>(rawObject, "reactions")
      val side = json.decodeRequired<InlineWebhooksReviewCommentSideX43294ba2>(rawObject, "side")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("line")) {
        throw SerializationException("WebhooksReviewComment is missing required property 'line'")
      }
      val line = rawObject["line"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("original_start_line")) {
        throw SerializationException("WebhooksReviewComment is missing required property 'original_start_line'")
      }
      val originalStartLine = rawObject["original_start_line"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("position")) {
        throw SerializationException("WebhooksReviewComment is missing required property 'position'")
      }
      val position = rawObject["position"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("pull_request_review_id")) {
        throw SerializationException("WebhooksReviewComment is missing required property 'pull_request_review_id'")
      }
      val pullRequestReviewId = rawObject["pull_request_review_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("start_line")) {
        throw SerializationException("WebhooksReviewComment is missing required property 'start_line'")
      }
      val startLine = rawObject["start_line"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("start_side")) {
        throw SerializationException("WebhooksReviewComment is missing required property 'start_side'")
      }
      val startSide = rawObject["start_side"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhooksReviewCommentStartSideX5415f8bc?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user")) {
        throw SerializationException("WebhooksReviewComment is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhooksReviewCommentUserX53e4038e?>(requireNotNull(element)) }
      return WebhooksReviewComment(
        links = links,
        authorAssociation = authorAssociation,
        body = body,
        commitId = commitId,
        createdAt = createdAt,
        diffHunk = diffHunk,
        htmlUrl = htmlUrl,
        id = id,
        line = line,
        nodeId = nodeId,
        originalCommitId = originalCommitId,
        originalLine = originalLine,
        originalPosition = originalPosition,
        originalStartLine = originalStartLine,
        path = path,
        position = position,
        pullRequestReviewId = pullRequestReviewId,
        pullRequestUrl = pullRequestUrl,
        reactions = reactions,
        side = side,
        startLine = startLine,
        startSide = startSide,
        updatedAt = updatedAt,
        url = url,
        user = user,
        inReplyToIdState = json.decodeOptional(rawObject, "in_reply_to_id", nullable = false),
        subjectTypeState = json.decodeOptional(rawObject, "subject_type", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhooksReviewComment) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhooksReviewComment")
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
        put("line", value.line?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("node_id", value.nodeId)
        put("original_commit_id", value.originalCommitId)
        put("original_line", json.encodeToJsonElement(value.originalLine))
        put("original_position", json.encodeToJsonElement(value.originalPosition))
        put("original_start_line", value.originalStartLine?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("path", value.path)
        put("position", value.position?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("pull_request_review_id", value.pullRequestReviewId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("pull_request_url", value.pullRequestUrl)
        put("reactions", json.encodeToJsonElement(value.reactions))
        put("side", json.encodeToJsonElement(value.side))
        put("start_line", value.startLine?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("start_side", value.startSide?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("in_reply_to_id", value.inReplyToIdState, json::encodeToJsonElement)
        putState("subject_type", value.subjectTypeState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhooksReviewComment(block: WebhooksReviewComment.Builder.() -> Unit): WebhooksReviewComment = WebhooksReviewComment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhooksReviewComment is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("WebhooksReviewComment property '" + name + "' is not nullable")
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
