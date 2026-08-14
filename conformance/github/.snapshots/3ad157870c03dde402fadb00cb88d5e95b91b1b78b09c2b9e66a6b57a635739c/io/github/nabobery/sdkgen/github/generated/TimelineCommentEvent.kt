package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Timeline Comment Event
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/timeline-comment-event
 */
@Serializable(with = TimelineCommentEvent.Serializer::class)
public class TimelineCommentEvent(
  public val actor: SimpleUser,
  public val authorAssociation: AuthorAssociation,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val event: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  /**
   * Unique identifier of the issue comment
   */
  public val id: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val issueUrl: String,
  public val nodeId: String,
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
  public val user: SimpleUser,
  /**
   * Contents of the issue comment
   */
  public val body: String? = null,
  public val bodyHtml: String? = null,
  public val bodyText: String? = null,
  public val minimized: NullableIssueCommentMinimized? = null,
  public val performedViaGithubApp: NullableIntegration? = null,
  public val pin: NullablePinnedIssueComment? = null,
  public val reactions: ReactionRollup? = null,
) {
  public class Builder {
    private var actorValue: SimpleUser? = null

    public var actor: SimpleUser
      get() = requireNotNull(actorValue) { "actor is required" }
      set(`value`) {
        actorValue = value
      }

    private var authorAssociationValue: AuthorAssociation? = null

    public var authorAssociation: AuthorAssociation
      get() = requireNotNull(authorAssociationValue) { "authorAssociation is required" }
      set(`value`) {
        authorAssociationValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var eventValue: String? = null

    public var event: String
      get() = requireNotNull(eventValue) { "event is required" }
      set(`value`) {
        eventValue = value
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

    private var userValue: SimpleUser? = null

    public var user: SimpleUser
      get() = requireNotNull(userValue) { "user is required" }
      set(`value`) {
        userValue = value
      }

    /**
     * Contents of the issue comment
     */
    public var body: String? = null

    public var bodyHtml: String? = null

    public var bodyText: String? = null

    public var minimized: NullableIssueCommentMinimized? = null

    public var performedViaGithubApp: NullableIntegration? = null

    public var pin: NullablePinnedIssueComment? = null

    public var reactions: ReactionRollup? = null

    public fun build(): TimelineCommentEvent {
      check(actorValue != null) { "actor is required" }
      check(authorAssociationValue != null) { "authorAssociation is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(eventValue != null) { "event is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(issueUrlValue != null) { "issueUrl is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(userValue != null) { "user is required" }
      return TimelineCommentEvent(
        actor = actor,
        authorAssociation = authorAssociation,
        createdAt = createdAt,
        event = event,
        htmlUrl = htmlUrl,
        id = id,
        issueUrl = issueUrl,
        nodeId = nodeId,
        updatedAt = updatedAt,
        url = url,
        user = user,
        body = body,
        bodyHtml = bodyHtml,
        bodyText = bodyText,
        minimized = minimized,
        performedViaGithubApp = performedViaGithubApp,
        pin = pin,
        reactions = reactions,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TimelineCommentEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TimelineCommentEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TimelineCommentEvent {
      val jsonDecoder = decoder.requireJsonDecoder("TimelineCommentEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TimelineCommentEvent must be a JSON object")
      val actor = json.decodeRequired<SimpleUser>(rawObject, "actor")
      val authorAssociation = json.decodeRequired<AuthorAssociation>(rawObject, "author_association")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val event = json.decodeRequired<String>(rawObject, "event")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val issueUrl = json.decodeRequired<String>(rawObject, "issue_url")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      val user = json.decodeRequired<SimpleUser>(rawObject, "user")
      return TimelineCommentEvent(
        actor = actor,
        authorAssociation = authorAssociation,
        createdAt = createdAt,
        event = event,
        htmlUrl = htmlUrl,
        id = id,
        issueUrl = issueUrl,
        nodeId = nodeId,
        updatedAt = updatedAt,
        url = url,
        user = user,
        body = rawObject["body"]?.let { json.decodeFromJsonElement<String>(it) },
        bodyHtml = rawObject["body_html"]?.let { json.decodeFromJsonElement<String>(it) },
        bodyText = rawObject["body_text"]?.let { json.decodeFromJsonElement<String>(it) },
        minimized = rawObject["minimized"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableIssueCommentMinimized?>(element) },
        performedViaGithubApp = rawObject["performed_via_github_app"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableIntegration?>(element) },
        pin = rawObject["pin"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullablePinnedIssueComment?>(element) },
        reactions = rawObject["reactions"]?.let { json.decodeFromJsonElement<ReactionRollup>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TimelineCommentEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("TimelineCommentEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("actor", json.encodeToJsonElement(value.actor))
        put("author_association", json.encodeToJsonElement(value.authorAssociation))
        put("created_at", value.createdAt)
        put("event", value.event)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("issue_url", value.issueUrl)
        put("node_id", value.nodeId)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        put("user", json.encodeToJsonElement(value.user))
        value.body?.let { put("body", it) }
        value.bodyHtml?.let { put("body_html", it) }
        value.bodyText?.let { put("body_text", it) }
        value.minimized?.let { put("minimized", json.encodeToJsonElement(it)) }
        value.performedViaGithubApp?.let { put("performed_via_github_app", json.encodeToJsonElement(it)) }
        value.pin?.let { put("pin", json.encodeToJsonElement(it)) }
        value.reactions?.let { put("reactions", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun timelineCommentEvent(block: TimelineCommentEvent.Builder.() -> Unit): TimelineCommentEvent = TimelineCommentEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TimelineCommentEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
