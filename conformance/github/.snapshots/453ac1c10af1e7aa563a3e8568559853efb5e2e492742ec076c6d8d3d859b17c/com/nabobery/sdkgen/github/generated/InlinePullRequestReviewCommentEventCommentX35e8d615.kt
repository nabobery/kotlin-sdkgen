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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-comment-event/properties/comment.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-comment-event/properties/comment
 */
@Serializable(with = InlinePullRequestReviewCommentEventCommentX35e8d615.Serializer::class)
public class InlinePullRequestReviewCommentEventCommentX35e8d615 internal constructor(
  public val links: InlinePullRequestReviewCommentEventCommentLinksXcf9c4e70,
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
  public val id: Int,
  public val nodeId: String,
  public val originalCommitId: String,
  public val originalPosition: Int,
  public val path: String,
  public val position: Int?,
  public val pullRequestReviewId: Int?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pullRequestUrl: String,
  public val reactions: InlinePullRequestReviewCommentEventCommentReactionsXb9a3093a,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val user: InlinePullRequestReviewCommentEventCommentUserX5f149d20?,
  private val inReplyToIdState: FieldState<Int>,
  private val subjectTypeState: FieldState<String?>,
) {
  public val inReplyToId: Int?
    get() = inReplyToIdState.valueOrNull()

  public val subjectType: String?
    get() = subjectTypeState.valueOrNull()

  public constructor(
    links: InlinePullRequestReviewCommentEventCommentLinksXcf9c4e70,
    body: String,
    commitId: String,
    createdAt: String,
    diffHunk: String,
    htmlUrl: String,
    id: Int,
    nodeId: String,
    originalCommitId: String,
    originalPosition: Int,
    path: String,
    position: Int?,
    pullRequestReviewId: Int?,
    pullRequestUrl: String,
    reactions: InlinePullRequestReviewCommentEventCommentReactionsXb9a3093a,
    updatedAt: String,
    url: String,
    user: InlinePullRequestReviewCommentEventCommentUserX5f149d20?,
  ) : this(links = links,
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
  reactions = reactions,
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
    private var linksValue: InlinePullRequestReviewCommentEventCommentLinksXcf9c4e70? = null

    public var links: InlinePullRequestReviewCommentEventCommentLinksXcf9c4e70
      get() = requireNotNull(linksValue) { "links is required" }
      set(`value`) {
        linksValue = value
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

    private var reactionsValue: InlinePullRequestReviewCommentEventCommentReactionsXb9a3093a? = null

    public var reactions: InlinePullRequestReviewCommentEventCommentReactionsXb9a3093a
      get() = requireNotNull(reactionsValue) { "reactions is required" }
      set(`value`) {
        reactionsValue = value
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

    private var pullRequestReviewIdState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var pullRequestReviewId: Int?
      get() = pullRequestReviewIdState.valueOrNull()
      set(`value`) {
        pullRequestReviewIdState = value.toNullableFieldState()
      }

    private var userState: FieldState<InlinePullRequestReviewCommentEventCommentUserX5f149d20?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: InlinePullRequestReviewCommentEventCommentUserX5f149d20?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
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

    private var subjectTypeState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var subjectType: String?
      get() = subjectTypeState.valueOrNull()
      set(`value`) {
        subjectTypeState = value.toNullableFieldState()
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

    public fun build(): InlinePullRequestReviewCommentEventCommentX35e8d615 {
      check(linksValue != null) { "links is required" }
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
      check(reactionsValue != null) { "reactions is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(positionState !== FieldState.Absent) { "position is required, even when null" }
      check(pullRequestReviewIdState !== FieldState.Absent) { "pullRequestReviewId is required, even when null" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return InlinePullRequestReviewCommentEventCommentX35e8d615(
        links = links,
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
        reactions = reactions,
        updatedAt = updatedAt,
        url = url,
        user = userState.valueOrNull(),
        inReplyToIdState = inReplyToIdState,
        subjectTypeState = subjectTypeState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePullRequestReviewCommentEventCommentX35e8d615 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePullRequestReviewCommentEventCommentX35e8d615> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePullRequestReviewCommentEventCommentX35e8d615 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePullRequestReviewCommentEventCommentX35e8d615")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePullRequestReviewCommentEventCommentX35e8d615 must be a JSON object")
      val links = json.decodeRequired<InlinePullRequestReviewCommentEventCommentLinksXcf9c4e70>(rawObject, "_links")
      val body = json.decodeRequired<String>(rawObject, "body")
      val commitId = json.decodeRequired<String>(rawObject, "commit_id")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val diffHunk = json.decodeRequired<String>(rawObject, "diff_hunk")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val originalCommitId = json.decodeRequired<String>(rawObject, "original_commit_id")
      val originalPosition = json.decodeRequired<Int>(rawObject, "original_position")
      val path = json.decodeRequired<String>(rawObject, "path")
      val pullRequestUrl = json.decodeRequired<String>(rawObject, "pull_request_url")
      val reactions = json.decodeRequired<InlinePullRequestReviewCommentEventCommentReactionsXb9a3093a>(rawObject, "reactions")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("position")) {
        throw SerializationException("InlinePullRequestReviewCommentEventCommentX35e8d615 is missing required property 'position'")
      }
      val position = rawObject["position"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("pull_request_review_id")) {
        throw SerializationException("InlinePullRequestReviewCommentEventCommentX35e8d615 is missing required property 'pull_request_review_id'")
      }
      val pullRequestReviewId = rawObject["pull_request_review_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user")) {
        throw SerializationException("InlinePullRequestReviewCommentEventCommentX35e8d615 is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePullRequestReviewCommentEventCommentUserX5f149d20?>(requireNotNull(element)) }
      return InlinePullRequestReviewCommentEventCommentX35e8d615(
        links = links,
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
        reactions = reactions,
        updatedAt = updatedAt,
        url = url,
        user = user,
        inReplyToIdState = json.decodeOptional(rawObject, "in_reply_to_id", nullable = false),
        subjectTypeState = json.decodeOptional(rawObject, "subject_type", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestReviewCommentEventCommentX35e8d615) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePullRequestReviewCommentEventCommentX35e8d615")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("_links", json.encodeToJsonElement(value.links))
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
        put("reactions", json.encodeToJsonElement(value.reactions))
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

public fun inlinePullRequestReviewCommentEventCommentX35e8d615(block: InlinePullRequestReviewCommentEventCommentX35e8d615.Builder.() -> Unit): InlinePullRequestReviewCommentEventCommentX35e8d615 = InlinePullRequestReviewCommentEventCommentX35e8d615.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePullRequestReviewCommentEventCommentX35e8d615 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlinePullRequestReviewCommentEventCommentX35e8d615 property '" + name + "' is not nullable")
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
