package com.nabobery.sdkgen.github.generated

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
 * The [comment](https://docs.github.com/rest/issues/comments#get-an-issue-comment) itself.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_issue_comment
 */
@Serializable(with = WebhooksIssueComment.Serializer::class)
public class WebhooksIssueComment internal constructor(
  /**
   * How the author is associated with the repository.
   */
  public val authorAssociation: InlineWebhooksIssueCommentAuthorAssociationX27bd72f2,
  /**
   * Contents of the issue comment
   */
  public val body: String,
  public val createdAt: String,
  public val htmlUrl: String,
  /**
   * Unique identifier of the issue comment
   */
  public val id: Long,
  public val issueUrl: String,
  public val nodeId: String,
  public val performedViaGithubApp: Integration?,
  public val reactions: InlineWebhooksIssueCommentReactionsX662c52c8,
  public val updatedAt: String,
  /**
   * URL for the issue comment
   */
  public val url: String,
  public val user: InlineWebhooksIssueCommentUserX415f67ca?,
  private val minimizedState: FieldState<NullableIssueCommentMinimized?>,
  private val pinState: FieldState<NullablePinnedIssueComment?>,
) {
  public val minimized: NullableIssueCommentMinimized?
    get() = minimizedState.valueOrNull()

  public val pin: NullablePinnedIssueComment?
    get() = pinState.valueOrNull()

  public constructor(
    authorAssociation: InlineWebhooksIssueCommentAuthorAssociationX27bd72f2,
    body: String,
    createdAt: String,
    htmlUrl: String,
    id: Long,
    issueUrl: String,
    nodeId: String,
    performedViaGithubApp: Integration?,
    reactions: InlineWebhooksIssueCommentReactionsX662c52c8,
    updatedAt: String,
    url: String,
    user: InlineWebhooksIssueCommentUserX415f67ca?,
  ) : this(authorAssociation = authorAssociation,
  body = body,
  createdAt = createdAt,
  htmlUrl = htmlUrl,
  id = id,
  issueUrl = issueUrl,
  nodeId = nodeId,
  performedViaGithubApp = performedViaGithubApp,
  reactions = reactions,
  updatedAt = updatedAt,
  url = url,
  user = user,
  minimizedState = FieldState.Absent,
  pinState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `minimized`.
   */
  public fun minimizedPresence(): FieldPresence = minimizedState.presence

  /**
   * Returns the wire presence of `pin`.
   */
  public fun pinPresence(): FieldPresence = pinState.presence

  public class Builder {
    private var authorAssociationValue: InlineWebhooksIssueCommentAuthorAssociationX27bd72f2? = null

    public var authorAssociation: InlineWebhooksIssueCommentAuthorAssociationX27bd72f2
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

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
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

    private var issueUrlValue: String? = null

    public var issueUrl: String
      get() = requireNotNull(issueUrlValue) { "issueUrl is required" }
      set(`value`) {
        issueUrlValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var reactionsValue: InlineWebhooksIssueCommentReactionsX662c52c8? = null

    public var reactions: InlineWebhooksIssueCommentReactionsX662c52c8
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

    private var performedViaGithubAppState: FieldState<Integration?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var performedViaGithubApp: Integration?
      get() = performedViaGithubAppState.valueOrNull()
      set(`value`) {
        performedViaGithubAppState = value.toNullableFieldState()
      }

    private var userState: FieldState<InlineWebhooksIssueCommentUserX415f67ca?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: InlineWebhooksIssueCommentUserX415f67ca?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    private var minimizedState: FieldState<NullableIssueCommentMinimized?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var minimized: NullableIssueCommentMinimized?
      get() = minimizedState.valueOrNull()
      set(`value`) {
        minimizedState = value.toNullableFieldState()
      }

    private var pinState: FieldState<NullablePinnedIssueComment?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var pin: NullablePinnedIssueComment?
      get() = pinState.valueOrNull()
      set(`value`) {
        pinState = value.toNullableFieldState()
      }

    /**
     * Omits `minimized` from serialized output.
     */
    public fun unsetMinimized() {
      minimizedState = FieldState.Absent
    }

    /**
     * Omits `pin` from serialized output.
     */
    public fun unsetPin() {
      pinState = FieldState.Absent
    }

    public fun build(): WebhooksIssueComment {
      check(authorAssociationValue != null) { "authorAssociation is required" }
      check(bodyValue != null) { "body is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(issueUrlValue != null) { "issueUrl is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(reactionsValue != null) { "reactions is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(performedViaGithubAppState !== FieldState.Absent) { "performedViaGithubApp is required, even when null" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return WebhooksIssueComment(
        authorAssociation = authorAssociation,
        body = body,
        createdAt = createdAt,
        htmlUrl = htmlUrl,
        id = id,
        issueUrl = issueUrl,
        nodeId = nodeId,
        performedViaGithubApp = performedViaGithubAppState.valueOrNull(),
        reactions = reactions,
        updatedAt = updatedAt,
        url = url,
        user = userState.valueOrNull(),
        minimizedState = minimizedState,
        pinState = pinState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhooksIssueComment = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhooksIssueComment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhooksIssueComment {
      val jsonDecoder = decoder.requireJsonDecoder("WebhooksIssueComment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhooksIssueComment must be a JSON object")
      val authorAssociation = json.decodeRequired<InlineWebhooksIssueCommentAuthorAssociationX27bd72f2>(rawObject, "author_association")
      val body = json.decodeRequired<String>(rawObject, "body")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val issueUrl = json.decodeRequired<String>(rawObject, "issue_url")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val reactions = json.decodeRequired<InlineWebhooksIssueCommentReactionsX662c52c8>(rawObject, "reactions")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("performed_via_github_app")) {
        throw SerializationException("WebhooksIssueComment is missing required property 'performed_via_github_app'")
      }
      val performedViaGithubApp = rawObject["performed_via_github_app"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Integration?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user")) {
        throw SerializationException("WebhooksIssueComment is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhooksIssueCommentUserX415f67ca?>(requireNotNull(element)) }
      return WebhooksIssueComment(
        authorAssociation = authorAssociation,
        body = body,
        createdAt = createdAt,
        htmlUrl = htmlUrl,
        id = id,
        issueUrl = issueUrl,
        nodeId = nodeId,
        performedViaGithubApp = performedViaGithubApp,
        reactions = reactions,
        updatedAt = updatedAt,
        url = url,
        user = user,
        minimizedState = json.decodeOptional(rawObject, "minimized", nullable = true),
        pinState = json.decodeOptional(rawObject, "pin", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhooksIssueComment) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhooksIssueComment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("author_association", json.encodeToJsonElement(value.authorAssociation))
        put("body", value.body)
        put("created_at", value.createdAt)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("issue_url", value.issueUrl)
        put("node_id", value.nodeId)
        put("performed_via_github_app", value.performedViaGithubApp?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("reactions", json.encodeToJsonElement(value.reactions))
        put("updated_at", value.updatedAt)
        put("url", value.url)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("minimized", value.minimizedState, json::encodeToJsonElement)
        putState("pin", value.pinState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhooksIssueComment(block: WebhooksIssueComment.Builder.() -> Unit): WebhooksIssueComment = WebhooksIssueComment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhooksIssueComment is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("WebhooksIssueComment property '" + name + "' is not nullable")
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
