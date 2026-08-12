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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published/properties/registry_package/prope
 * rties/package_version/properties/author.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-registry-package-published/properties/registry_package/prope
 * rties/package_version/properties/author
 */
@Serializable(with = InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXe4d0e77b.Serializer::class)
public class InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXe4d0e77b(
  public val avatarUrl: String,
  public val eventsUrl: String,
  public val followersUrl: String,
  public val followingUrl: String,
  public val gistsUrl: String,
  public val gravatarId: String,
  public val htmlUrl: String,
  public val id: Int,
  public val login: String,
  public val nodeId: String,
  public val organizationsUrl: String,
  public val receivedEventsUrl: String,
  public val reposUrl: String,
  public val siteAdmin: Boolean,
  public val starredUrl: String,
  public val subscriptionsUrl: String,
  public val type: String,
  public val url: String,
  public val userViewType: String? = null,
) {
  public class Builder {
    private var avatarUrlValue: String? = null

    public var avatarUrl: String
      get() = requireNotNull(avatarUrlValue) { "avatarUrl is required" }
      set(`value`) {
        avatarUrlValue = value
      }

    private var eventsUrlValue: String? = null

    public var eventsUrl: String
      get() = requireNotNull(eventsUrlValue) { "eventsUrl is required" }
      set(`value`) {
        eventsUrlValue = value
      }

    private var followersUrlValue: String? = null

    public var followersUrl: String
      get() = requireNotNull(followersUrlValue) { "followersUrl is required" }
      set(`value`) {
        followersUrlValue = value
      }

    private var followingUrlValue: String? = null

    public var followingUrl: String
      get() = requireNotNull(followingUrlValue) { "followingUrl is required" }
      set(`value`) {
        followingUrlValue = value
      }

    private var gistsUrlValue: String? = null

    public var gistsUrl: String
      get() = requireNotNull(gistsUrlValue) { "gistsUrl is required" }
      set(`value`) {
        gistsUrlValue = value
      }

    private var gravatarIdValue: String? = null

    public var gravatarId: String
      get() = requireNotNull(gravatarIdValue) { "gravatarId is required" }
      set(`value`) {
        gravatarIdValue = value
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

    private var loginValue: String? = null

    public var login: String
      get() = requireNotNull(loginValue) { "login is required" }
      set(`value`) {
        loginValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var organizationsUrlValue: String? = null

    public var organizationsUrl: String
      get() = requireNotNull(organizationsUrlValue) { "organizationsUrl is required" }
      set(`value`) {
        organizationsUrlValue = value
      }

    private var receivedEventsUrlValue: String? = null

    public var receivedEventsUrl: String
      get() = requireNotNull(receivedEventsUrlValue) { "receivedEventsUrl is required" }
      set(`value`) {
        receivedEventsUrlValue = value
      }

    private var reposUrlValue: String? = null

    public var reposUrl: String
      get() = requireNotNull(reposUrlValue) { "reposUrl is required" }
      set(`value`) {
        reposUrlValue = value
      }

    private var siteAdminValue: Boolean? = null

    public var siteAdmin: Boolean
      get() = requireNotNull(siteAdminValue) { "siteAdmin is required" }
      set(`value`) {
        siteAdminValue = value
      }

    private var starredUrlValue: String? = null

    public var starredUrl: String
      get() = requireNotNull(starredUrlValue) { "starredUrl is required" }
      set(`value`) {
        starredUrlValue = value
      }

    private var subscriptionsUrlValue: String? = null

    public var subscriptionsUrl: String
      get() = requireNotNull(subscriptionsUrlValue) { "subscriptionsUrl is required" }
      set(`value`) {
        subscriptionsUrlValue = value
      }

    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public var userViewType: String? = null

    public fun build(): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXe4d0e77b {
      check(avatarUrlValue != null) { "avatarUrl is required" }
      check(eventsUrlValue != null) { "eventsUrl is required" }
      check(followersUrlValue != null) { "followersUrl is required" }
      check(followingUrlValue != null) { "followingUrl is required" }
      check(gistsUrlValue != null) { "gistsUrl is required" }
      check(gravatarIdValue != null) { "gravatarId is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(loginValue != null) { "login is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(organizationsUrlValue != null) { "organizationsUrl is required" }
      check(receivedEventsUrlValue != null) { "receivedEventsUrl is required" }
      check(reposUrlValue != null) { "reposUrl is required" }
      check(siteAdminValue != null) { "siteAdmin is required" }
      check(starredUrlValue != null) { "starredUrl is required" }
      check(subscriptionsUrlValue != null) { "subscriptionsUrl is required" }
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      return InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXe4d0e77b(
        avatarUrl = avatarUrl,
        eventsUrl = eventsUrl,
        followersUrl = followersUrl,
        followingUrl = followingUrl,
        gistsUrl = gistsUrl,
        gravatarId = gravatarId,
        htmlUrl = htmlUrl,
        id = id,
        login = login,
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
    public fun build(block: Builder.() -> Unit): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXe4d0e77b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXe4d0e77b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXe4d0e77b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXe4d0e77b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXe4d0e77b must be a JSON object")
      val avatarUrl = json.decodeRequired<String>(rawObject, "avatar_url")
      val eventsUrl = json.decodeRequired<String>(rawObject, "events_url")
      val followersUrl = json.decodeRequired<String>(rawObject, "followers_url")
      val followingUrl = json.decodeRequired<String>(rawObject, "following_url")
      val gistsUrl = json.decodeRequired<String>(rawObject, "gists_url")
      val gravatarId = json.decodeRequired<String>(rawObject, "gravatar_id")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val login = json.decodeRequired<String>(rawObject, "login")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val organizationsUrl = json.decodeRequired<String>(rawObject, "organizations_url")
      val receivedEventsUrl = json.decodeRequired<String>(rawObject, "received_events_url")
      val reposUrl = json.decodeRequired<String>(rawObject, "repos_url")
      val siteAdmin = json.decodeRequired<Boolean>(rawObject, "site_admin")
      val starredUrl = json.decodeRequired<String>(rawObject, "starred_url")
      val subscriptionsUrl = json.decodeRequired<String>(rawObject, "subscriptions_url")
      val type = json.decodeRequired<String>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXe4d0e77b(
        avatarUrl = avatarUrl,
        eventsUrl = eventsUrl,
        followersUrl = followersUrl,
        followingUrl = followingUrl,
        gistsUrl = gistsUrl,
        gravatarId = gravatarId,
        htmlUrl = htmlUrl,
        id = id,
        login = login,
        nodeId = nodeId,
        organizationsUrl = organizationsUrl,
        receivedEventsUrl = receivedEventsUrl,
        reposUrl = reposUrl,
        siteAdmin = siteAdmin,
        starredUrl = starredUrl,
        subscriptionsUrl = subscriptionsUrl,
        type = type,
        url = url,
        userViewType = rawObject["user_view_type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXe4d0e77b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXe4d0e77b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("avatar_url", value.avatarUrl)
        put("events_url", value.eventsUrl)
        put("followers_url", value.followersUrl)
        put("following_url", value.followingUrl)
        put("gists_url", value.gistsUrl)
        put("gravatar_id", value.gravatarId)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("login", value.login)
        put("node_id", value.nodeId)
        put("organizations_url", value.organizationsUrl)
        put("received_events_url", value.receivedEventsUrl)
        put("repos_url", value.reposUrl)
        put("site_admin", json.encodeToJsonElement(value.siteAdmin))
        put("starred_url", value.starredUrl)
        put("subscriptions_url", value.subscriptionsUrl)
        put("type", value.type)
        put("url", value.url)
        value.userViewType?.let { put("user_view_type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXe4d0e77b(block: InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXe4d0e77b.Builder.() -> Unit): InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXe4d0e77b = InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXe4d0e77b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookRegistryPackae13fRegistryPackagePackageVersionAuthorXe4d0e77b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
