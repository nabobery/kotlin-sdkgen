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
 * The [comment](https://docs.github.com/rest/issues/comments#get-an-issue-comment) itself.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-created/properties/comment
 */
@Serializable(with = InlineWebhookIssueCommentCreatedCommentX4b923374.Serializer::class)
public class InlineWebhookIssueCommentCreatedCommentX4b923374 internal constructor(
  /**
   * How the author is associated with the repository.
   */
  public val authorAssociation: InlineWebhookIssueCommentCreatedCommentAuthorAssociationX0ed66482,
  /**
   * Contents of the issue comment
   */
  public val body: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * Unique identifier of the issue comment
   */
  public val id: Long,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val issueUrl: String,
  public val nodeId: String,
  public val performedViaGithubApp: NullableIntegration?,
  public val reactions: InlineWebhookIssueCommentCreatedCommentReactionsX54113f91,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * URL for the issue comment
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val user: InlineWebhookIssueCommentCreatedCommentUserXaacd2929?,
  private val minimizedState: FieldState<NullableIssueCommentMinimized?>,
  private val pinState: FieldState<NullablePinnedIssueComment?>,
) {
  public val minimized: NullableIssueCommentMinimized?
    get() = minimizedState.valueOrNull()

  public val pin: NullablePinnedIssueComment?
    get() = pinState.valueOrNull()

  public constructor(
    authorAssociation: InlineWebhookIssueCommentCreatedCommentAuthorAssociationX0ed66482,
    body: String,
    createdAt: String,
    htmlUrl: String,
    id: Long,
    issueUrl: String,
    nodeId: String,
    performedViaGithubApp: NullableIntegration?,
    reactions: InlineWebhookIssueCommentCreatedCommentReactionsX54113f91,
    updatedAt: String,
    url: String,
    user: InlineWebhookIssueCommentCreatedCommentUserXaacd2929?,
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
    private var authorAssociationValue:
        InlineWebhookIssueCommentCreatedCommentAuthorAssociationX0ed66482? = null

    public var authorAssociation: InlineWebhookIssueCommentCreatedCommentAuthorAssociationX0ed66482
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

    private var reactionsValue: InlineWebhookIssueCommentCreatedCommentReactionsX54113f91? = null

    public var reactions: InlineWebhookIssueCommentCreatedCommentReactionsX54113f91
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

    private var performedViaGithubAppState: FieldState<NullableIntegration?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var performedViaGithubApp: NullableIntegration?
      get() = performedViaGithubAppState.valueOrNull()
      set(`value`) {
        performedViaGithubAppState = value.toNullableFieldState()
      }

    private var userState: FieldState<InlineWebhookIssueCommentCreatedCommentUserXaacd2929?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: InlineWebhookIssueCommentCreatedCommentUserXaacd2929?
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

    public fun build(): InlineWebhookIssueCommentCreatedCommentX4b923374 {
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
      return InlineWebhookIssueCommentCreatedCommentX4b923374(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookIssueCommentCreatedCommentX4b923374 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentCreatedCommentX4b923374> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentCreatedCommentX4b923374 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssueCommentCreatedCommentX4b923374")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssueCommentCreatedCommentX4b923374 must be a JSON object")
      val authorAssociation = json.decodeRequired<InlineWebhookIssueCommentCreatedCommentAuthorAssociationX0ed66482>(rawObject, "author_association")
      val body = json.decodeRequired<String>(rawObject, "body")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val issueUrl = json.decodeRequired<String>(rawObject, "issue_url")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val reactions = json.decodeRequired<InlineWebhookIssueCommentCreatedCommentReactionsX54113f91>(rawObject, "reactions")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("performed_via_github_app")) {
        throw SerializationException("InlineWebhookIssueCommentCreatedCommentX4b923374 is missing required property 'performed_via_github_app'")
      }
      val performedViaGithubApp = rawObject["performed_via_github_app"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableIntegration?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user")) {
        throw SerializationException("InlineWebhookIssueCommentCreatedCommentX4b923374 is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookIssueCommentCreatedCommentUserXaacd2929?>(requireNotNull(element)) }
      return InlineWebhookIssueCommentCreatedCommentX4b923374(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentCreatedCommentX4b923374) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssueCommentCreatedCommentX4b923374")
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

public fun inlineWebhookIssueCommentCreatedCommentX4b923374(block: InlineWebhookIssueCommentCreatedCommentX4b923374.Builder.() -> Unit): InlineWebhookIssueCommentCreatedCommentX4b923374 = InlineWebhookIssueCommentCreatedCommentX4b923374.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookIssueCommentCreatedCommentX4b923374 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookIssueCommentCreatedCommentX4b923374 property '" + name + "' is not nullable")
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
