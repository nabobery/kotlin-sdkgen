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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-milestoned/properties/issue/properties/milestone/prop
 * erties/creator.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-milestoned/properties/issue/properties/milestone/prop
 * erties/creator
 */
@Serializable(with = InlineWebhookIssuesMilestonedIssueMilestoneCreatorX9e64b4bb.Serializer::class)
public class InlineWebhookIssuesMilestonedIssueMilestoneCreatorX9e64b4bb(
  public val id: Int,
  public val login: String,
  public val avatarUrl: String? = null,
  public val deleted: Boolean? = null,
  public val email: String? = null,
  public val eventsUrl: String? = null,
  public val followersUrl: String? = null,
  public val followingUrl: String? = null,
  public val gistsUrl: String? = null,
  public val gravatarId: String? = null,
  public val htmlUrl: String? = null,
  public val name: String? = null,
  public val nodeId: String? = null,
  public val organizationsUrl: String? = null,
  public val receivedEventsUrl: String? = null,
  public val reposUrl: String? = null,
  public val siteAdmin: Boolean? = null,
  public val starredUrl: String? = null,
  public val subscriptionsUrl: String? = null,
  public val type: InlineWebhookIssuesMilestonedIssueMilestoneCreatorTypeXcedbe7ee? = null,
  public val url: String? = null,
  public val userViewType: String? = null,
) {
  public class Builder {
    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var loginValue: String? = null

    public var login: String
      get() = requireNotNull(loginValue) { "login is required" }
      set(`value`) {
        loginValue = value
      }

    public var avatarUrl: String? = null

    public var deleted: Boolean? = null

    public var email: String? = null

    public var eventsUrl: String? = null

    public var followersUrl: String? = null

    public var followingUrl: String? = null

    public var gistsUrl: String? = null

    public var gravatarId: String? = null

    public var htmlUrl: String? = null

    public var name: String? = null

    public var nodeId: String? = null

    public var organizationsUrl: String? = null

    public var receivedEventsUrl: String? = null

    public var reposUrl: String? = null

    public var siteAdmin: Boolean? = null

    public var starredUrl: String? = null

    public var subscriptionsUrl: String? = null

    public var type: InlineWebhookIssuesMilestonedIssueMilestoneCreatorTypeXcedbe7ee? = null

    public var url: String? = null

    public var userViewType: String? = null

    public fun build(): InlineWebhookIssuesMilestonedIssueMilestoneCreatorX9e64b4bb {
      check(idValue != null) { "id is required" }
      check(loginValue != null) { "login is required" }
      return InlineWebhookIssuesMilestonedIssueMilestoneCreatorX9e64b4bb(
        id = id,
        login = login,
        avatarUrl = avatarUrl,
        deleted = deleted,
        email = email,
        eventsUrl = eventsUrl,
        followersUrl = followersUrl,
        followingUrl = followingUrl,
        gistsUrl = gistsUrl,
        gravatarId = gravatarId,
        htmlUrl = htmlUrl,
        name = name,
        nodeId = nodeId,
        organizationsUrl = organizationsUrl,
        receivedEventsUrl = receivedEventsUrl,
        reposUrl = reposUrl,
        siteAdmin = siteAdmin,
        starredUrl = starredUrl,
        subscriptionsUrl = subscriptionsUrl,
        type = type,
        url = url,
        userViewType = userViewType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesMilestonedIssueMilestoneCreatorX9e64b4bb = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookIssuesMilestonedIssueMilestoneCreatorX9e64b4bb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesMilestonedIssueMilestoneCreatorX9e64b4bb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesMilestonedIssueMilestoneCreatorX9e64b4bb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesMilestonedIssueMilestoneCreatorX9e64b4bb must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val login = json.decodeRequired<String>(rawObject, "login")
      return InlineWebhookIssuesMilestonedIssueMilestoneCreatorX9e64b4bb(
        id = id,
        login = login,
        avatarUrl = rawObject["avatar_url"]?.let { json.decodeFromJsonElement<String>(it) },
        deleted = rawObject["deleted"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        email = rawObject["email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        eventsUrl = rawObject["events_url"]?.let { json.decodeFromJsonElement<String>(it) },
        followersUrl = rawObject["followers_url"]?.let { json.decodeFromJsonElement<String>(it) },
        followingUrl = rawObject["following_url"]?.let { json.decodeFromJsonElement<String>(it) },
        gistsUrl = rawObject["gists_url"]?.let { json.decodeFromJsonElement<String>(it) },
        gravatarId = rawObject["gravatar_id"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        organizationsUrl = rawObject["organizations_url"]?.let { json.decodeFromJsonElement<String>(it) },
        receivedEventsUrl = rawObject["received_events_url"]?.let { json.decodeFromJsonElement<String>(it) },
        reposUrl = rawObject["repos_url"]?.let { json.decodeFromJsonElement<String>(it) },
        siteAdmin = rawObject["site_admin"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        starredUrl = rawObject["starred_url"]?.let { json.decodeFromJsonElement<String>(it) },
        subscriptionsUrl = rawObject["subscriptions_url"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesMilestonedIssueMilestoneCreatorTypeXcedbe7ee>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        userViewType = rawObject["user_view_type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesMilestonedIssueMilestoneCreatorX9e64b4bb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesMilestonedIssueMilestoneCreatorX9e64b4bb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("login", value.login)
        value.avatarUrl?.let { put("avatar_url", it) }
        value.deleted?.let { put("deleted", json.encodeToJsonElement(it)) }
        value.email?.let { put("email", it) }
        value.eventsUrl?.let { put("events_url", it) }
        value.followersUrl?.let { put("followers_url", it) }
        value.followingUrl?.let { put("following_url", it) }
        value.gistsUrl?.let { put("gists_url", it) }
        value.gravatarId?.let { put("gravatar_id", it) }
        value.htmlUrl?.let { put("html_url", it) }
        value.name?.let { put("name", it) }
        value.nodeId?.let { put("node_id", it) }
        value.organizationsUrl?.let { put("organizations_url", it) }
        value.receivedEventsUrl?.let { put("received_events_url", it) }
        value.reposUrl?.let { put("repos_url", it) }
        value.siteAdmin?.let { put("site_admin", json.encodeToJsonElement(it)) }
        value.starredUrl?.let { put("starred_url", it) }
        value.subscriptionsUrl?.let { put("subscriptions_url", it) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
        value.url?.let { put("url", it) }
        value.userViewType?.let { put("user_view_type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookIssuesMilestonedIssueMilestoneCreatorX9e64b4bb(block: InlineWebhookIssuesMilestonedIssueMilestoneCreatorX9e64b4bb.Builder.() -> Unit): InlineWebhookIssuesMilestonedIssueMilestoneCreatorX9e64b4bb = InlineWebhookIssuesMilestonedIssueMilestoneCreatorX9e64b4bb.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookIssuesMilestonedIssueMilestoneCreatorX9e64b4bb is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
