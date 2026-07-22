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
 * Comments provide a way for people to collaborate on an issue.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue-comment
 */
@Serializable(with = IssueComment.Serializer::class)
public class IssueComment internal constructor(
  public val createdAt: String,
  public val htmlUrl: String,
  /**
   * Unique identifier of the issue comment
   */
  public val id: Long,
  public val issueUrl: String,
  public val nodeId: String,
  public val updatedAt: String,
  /**
   * URL for the issue comment
   */
  public val url: String,
  public val user: NullableSimpleUser?,
  private val authorAssociationState: FieldState<AuthorAssociation>,
  private val bodyState: FieldState<String>,
  private val bodyHtmlState: FieldState<String>,
  private val bodyTextState: FieldState<String>,
  private val minimizedState: FieldState<NullableIssueCommentMinimized?>,
  private val performedViaGithubAppState: FieldState<NullableIntegration?>,
  private val pinState: FieldState<NullablePinnedIssueComment?>,
  private val reactionsState: FieldState<ReactionRollup>,
) {
  public val authorAssociation: AuthorAssociation?
    get() = authorAssociationState.valueOrNull()

  /**
   * Contents of the issue comment
   */
  public val body: String?
    get() = bodyState.valueOrNull()

  public val bodyHtml: String?
    get() = bodyHtmlState.valueOrNull()

  public val bodyText: String?
    get() = bodyTextState.valueOrNull()

  public val minimized: NullableIssueCommentMinimized?
    get() = minimizedState.valueOrNull()

  public val performedViaGithubApp: NullableIntegration?
    get() = performedViaGithubAppState.valueOrNull()

  public val pin: NullablePinnedIssueComment?
    get() = pinState.valueOrNull()

  public val reactions: ReactionRollup?
    get() = reactionsState.valueOrNull()

  public constructor(
    createdAt: String,
    htmlUrl: String,
    id: Long,
    issueUrl: String,
    nodeId: String,
    updatedAt: String,
    url: String,
    user: NullableSimpleUser?,
  ) : this(createdAt = createdAt,
  htmlUrl = htmlUrl,
  id = id,
  issueUrl = issueUrl,
  nodeId = nodeId,
  updatedAt = updatedAt,
  url = url,
  user = user,
  authorAssociationState = FieldState.Absent,
  bodyState = FieldState.Absent,
  bodyHtmlState = FieldState.Absent,
  bodyTextState = FieldState.Absent,
  minimizedState = FieldState.Absent,
  performedViaGithubAppState = FieldState.Absent,
  pinState = FieldState.Absent,
  reactionsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `author_association`.
   */
  public fun authorAssociationPresence(): FieldPresence = authorAssociationState.presence

  /**
   * Returns the wire presence of `body`.
   */
  public fun bodyPresence(): FieldPresence = bodyState.presence

  /**
   * Returns the wire presence of `body_html`.
   */
  public fun bodyHtmlPresence(): FieldPresence = bodyHtmlState.presence

  /**
   * Returns the wire presence of `body_text`.
   */
  public fun bodyTextPresence(): FieldPresence = bodyTextState.presence

  /**
   * Returns the wire presence of `minimized`.
   */
  public fun minimizedPresence(): FieldPresence = minimizedState.presence

  /**
   * Returns the wire presence of `performed_via_github_app`.
   */
  public fun performedViaGithubAppPresence(): FieldPresence = performedViaGithubAppState.presence

  /**
   * Returns the wire presence of `pin`.
   */
  public fun pinPresence(): FieldPresence = pinState.presence

  /**
   * Returns the wire presence of `reactions`.
   */
  public fun reactionsPresence(): FieldPresence = reactionsState.presence

  public class Builder {
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

    private var userState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: NullableSimpleUser?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    private var authorAssociationState: FieldState<AuthorAssociation> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var authorAssociation: AuthorAssociation?
      get() = authorAssociationState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "authorAssociation is not nullable; call unsetAuthorAssociation() to omit it" }
        authorAssociationState = FieldState.Value(present)
      }

    private var bodyState: FieldState<String> = FieldState.Absent

    /**
     * Contents of the issue comment
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var body: String?
      get() = bodyState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "body is not nullable; call unsetBody() to omit it" }
        bodyState = FieldState.Value(present)
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

    private var minimizedState: FieldState<NullableIssueCommentMinimized?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var minimized: NullableIssueCommentMinimized?
      get() = minimizedState.valueOrNull()
      set(`value`) {
        minimizedState = value.toNullableFieldState()
      }

    private var performedViaGithubAppState: FieldState<NullableIntegration?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var performedViaGithubApp: NullableIntegration?
      get() = performedViaGithubAppState.valueOrNull()
      set(`value`) {
        performedViaGithubAppState = value.toNullableFieldState()
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

    /**
     * Omits `author_association` from serialized output.
     */
    public fun unsetAuthorAssociation() {
      authorAssociationState = FieldState.Absent
    }

    /**
     * Omits `body` from serialized output.
     */
    public fun unsetBody() {
      bodyState = FieldState.Absent
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
     * Omits `minimized` from serialized output.
     */
    public fun unsetMinimized() {
      minimizedState = FieldState.Absent
    }

    /**
     * Omits `performed_via_github_app` from serialized output.
     */
    public fun unsetPerformedViaGithubApp() {
      performedViaGithubAppState = FieldState.Absent
    }

    /**
     * Omits `pin` from serialized output.
     */
    public fun unsetPin() {
      pinState = FieldState.Absent
    }

    /**
     * Omits `reactions` from serialized output.
     */
    public fun unsetReactions() {
      reactionsState = FieldState.Absent
    }

    public fun build(): IssueComment {
      check(createdAtValue != null) { "createdAt is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(issueUrlValue != null) { "issueUrl is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return IssueComment(
        createdAt = createdAt,
        htmlUrl = htmlUrl,
        id = id,
        issueUrl = issueUrl,
        nodeId = nodeId,
        updatedAt = updatedAt,
        url = url,
        user = userState.valueOrNull(),
        authorAssociationState = authorAssociationState,
        bodyState = bodyState,
        bodyHtmlState = bodyHtmlState,
        bodyTextState = bodyTextState,
        minimizedState = minimizedState,
        performedViaGithubAppState = performedViaGithubAppState,
        pinState = pinState,
        reactionsState = reactionsState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssueComment = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssueComment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssueComment {
      val jsonDecoder = decoder.requireJsonDecoder("IssueComment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssueComment must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val issueUrl = json.decodeRequired<String>(rawObject, "issue_url")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("user")) {
        throw SerializationException("IssueComment is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      return IssueComment(
        createdAt = createdAt,
        htmlUrl = htmlUrl,
        id = id,
        issueUrl = issueUrl,
        nodeId = nodeId,
        updatedAt = updatedAt,
        url = url,
        user = user,
        authorAssociationState = json.decodeOptional(rawObject, "author_association", nullable = false),
        bodyState = json.decodeOptional(rawObject, "body", nullable = false),
        bodyHtmlState = json.decodeOptional(rawObject, "body_html", nullable = false),
        bodyTextState = json.decodeOptional(rawObject, "body_text", nullable = false),
        minimizedState = json.decodeOptional(rawObject, "minimized", nullable = true),
        performedViaGithubAppState = json.decodeOptional(rawObject, "performed_via_github_app", nullable = true),
        pinState = json.decodeOptional(rawObject, "pin", nullable = true),
        reactionsState = json.decodeOptional(rawObject, "reactions", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssueComment) {
      val jsonEncoder = encoder.requireJsonEncoder("IssueComment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("issue_url", value.issueUrl)
        put("node_id", value.nodeId)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("author_association", value.authorAssociationState, json::encodeToJsonElement)
        putState("body", value.bodyState, json::encodeToJsonElement)
        putState("body_html", value.bodyHtmlState, json::encodeToJsonElement)
        putState("body_text", value.bodyTextState, json::encodeToJsonElement)
        putState("minimized", value.minimizedState, json::encodeToJsonElement)
        putState("performed_via_github_app", value.performedViaGithubAppState, json::encodeToJsonElement)
        putState("pin", value.pinState, json::encodeToJsonElement)
        putState("reactions", value.reactionsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issueComment(block: IssueComment.Builder.() -> Unit): IssueComment = IssueComment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssueComment is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("IssueComment property '" + name + "' is not nullable")
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
