package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-target-renamed/properties/account.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-target-renamed/properties/account
 */
@Serializable(with = InlineWebhookInstallationTargetRenamedAccountX55d3a3d3.Serializer::class)
public class InlineWebhookInstallationTargetRenamedAccountX55d3a3d3(
  public val avatarUrl: String,
  public val htmlUrl: String,
  public val id: Int,
  public val nodeId: String,
  public val archivedAt: String? = null,
  public val createdAt: String? = null,
  public val description: JsonElement? = null,
  public val eventsUrl: String? = null,
  public val followers: Int? = null,
  public val followersUrl: String? = null,
  public val following: Int? = null,
  public val followingUrl: String? = null,
  public val gistsUrl: String? = null,
  public val gravatarId: String? = null,
  public val hasOrganizationProjects: Boolean? = null,
  public val hasRepositoryProjects: Boolean? = null,
  public val hooksUrl: String? = null,
  public val isVerified: Boolean? = null,
  public val issuesUrl: String? = null,
  public val login: String? = null,
  public val membersUrl: String? = null,
  public val name: String? = null,
  public val organizationsUrl: String? = null,
  public val publicGists: Int? = null,
  public val publicMembersUrl: String? = null,
  public val publicRepos: Int? = null,
  public val receivedEventsUrl: String? = null,
  public val reposUrl: String? = null,
  public val siteAdmin: Boolean? = null,
  public val slug: String? = null,
  public val starredUrl: String? = null,
  public val subscriptionsUrl: String? = null,
  public val type: String? = null,
  public val updatedAt: String? = null,
  public val url: String? = null,
  public val userViewType: String? = null,
  public val websiteUrl: JsonElement? = null,
) {
  public class Builder {
    private var avatarUrlValue: String? = null

    public var avatarUrl: String
      get() = requireNotNull(avatarUrlValue) { "avatarUrl is required" }
      set(`value`) {
        avatarUrlValue = value
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

    public var archivedAt: String? = null

    public var createdAt: String? = null

    public var description: JsonElement? = null

    public var eventsUrl: String? = null

    public var followers: Int? = null

    public var followersUrl: String? = null

    public var following: Int? = null

    public var followingUrl: String? = null

    public var gistsUrl: String? = null

    public var gravatarId: String? = null

    public var hasOrganizationProjects: Boolean? = null

    public var hasRepositoryProjects: Boolean? = null

    public var hooksUrl: String? = null

    public var isVerified: Boolean? = null

    public var issuesUrl: String? = null

    public var login: String? = null

    public var membersUrl: String? = null

    public var name: String? = null

    public var organizationsUrl: String? = null

    public var publicGists: Int? = null

    public var publicMembersUrl: String? = null

    public var publicRepos: Int? = null

    public var receivedEventsUrl: String? = null

    public var reposUrl: String? = null

    public var siteAdmin: Boolean? = null

    public var slug: String? = null

    public var starredUrl: String? = null

    public var subscriptionsUrl: String? = null

    public var type: String? = null

    public var updatedAt: String? = null

    public var url: String? = null

    public var userViewType: String? = null

    public var websiteUrl: JsonElement? = null

    public fun build(): InlineWebhookInstallationTargetRenamedAccountX55d3a3d3 {
      check(avatarUrlValue != null) { "avatarUrl is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      return InlineWebhookInstallationTargetRenamedAccountX55d3a3d3(
        avatarUrl = avatarUrl,
        htmlUrl = htmlUrl,
        id = id,
        nodeId = nodeId,
        archivedAt = archivedAt,
        createdAt = createdAt,
        description = description,
        eventsUrl = eventsUrl,
        followers = followers,
        followersUrl = followersUrl,
        following = following,
        followingUrl = followingUrl,
        gistsUrl = gistsUrl,
        gravatarId = gravatarId,
        hasOrganizationProjects = hasOrganizationProjects,
        hasRepositoryProjects = hasRepositoryProjects,
        hooksUrl = hooksUrl,
        isVerified = isVerified,
        issuesUrl = issuesUrl,
        login = login,
        membersUrl = membersUrl,
        name = name,
        organizationsUrl = organizationsUrl,
        publicGists = publicGists,
        publicMembersUrl = publicMembersUrl,
        publicRepos = publicRepos,
        receivedEventsUrl = receivedEventsUrl,
        reposUrl = reposUrl,
        siteAdmin = siteAdmin,
        slug = slug,
        starredUrl = starredUrl,
        subscriptionsUrl = subscriptionsUrl,
        type = type,
        updatedAt = updatedAt,
        url = url,
        userViewType = userViewType,
        websiteUrl = websiteUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookInstallationTargetRenamedAccountX55d3a3d3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookInstallationTargetRenamedAccountX55d3a3d3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookInstallationTargetRenamedAccountX55d3a3d3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookInstallationTargetRenamedAccountX55d3a3d3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookInstallationTargetRenamedAccountX55d3a3d3 must be a JSON object")
      val avatarUrl = json.decodeRequired<String>(rawObject, "avatar_url")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      return InlineWebhookInstallationTargetRenamedAccountX55d3a3d3(
        avatarUrl = avatarUrl,
        htmlUrl = htmlUrl,
        id = id,
        nodeId = nodeId,
        archivedAt = rawObject["archived_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonElement?>(element) },
        eventsUrl = rawObject["events_url"]?.let { json.decodeFromJsonElement<String>(it) },
        followers = rawObject["followers"]?.let { json.decodeFromJsonElement<Int>(it) },
        followersUrl = rawObject["followers_url"]?.let { json.decodeFromJsonElement<String>(it) },
        following = rawObject["following"]?.let { json.decodeFromJsonElement<Int>(it) },
        followingUrl = rawObject["following_url"]?.let { json.decodeFromJsonElement<String>(it) },
        gistsUrl = rawObject["gists_url"]?.let { json.decodeFromJsonElement<String>(it) },
        gravatarId = rawObject["gravatar_id"]?.let { json.decodeFromJsonElement<String>(it) },
        hasOrganizationProjects = rawObject["has_organization_projects"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        hasRepositoryProjects = rawObject["has_repository_projects"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        hooksUrl = rawObject["hooks_url"]?.let { json.decodeFromJsonElement<String>(it) },
        isVerified = rawObject["is_verified"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        issuesUrl = rawObject["issues_url"]?.let { json.decodeFromJsonElement<String>(it) },
        login = rawObject["login"]?.let { json.decodeFromJsonElement<String>(it) },
        membersUrl = rawObject["members_url"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        organizationsUrl = rawObject["organizations_url"]?.let { json.decodeFromJsonElement<String>(it) },
        publicGists = rawObject["public_gists"]?.let { json.decodeFromJsonElement<Int>(it) },
        publicMembersUrl = rawObject["public_members_url"]?.let { json.decodeFromJsonElement<String>(it) },
        publicRepos = rawObject["public_repos"]?.let { json.decodeFromJsonElement<Int>(it) },
        receivedEventsUrl = rawObject["received_events_url"]?.let { json.decodeFromJsonElement<String>(it) },
        reposUrl = rawObject["repos_url"]?.let { json.decodeFromJsonElement<String>(it) },
        siteAdmin = rawObject["site_admin"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        slug = rawObject["slug"]?.let { json.decodeFromJsonElement<String>(it) },
        starredUrl = rawObject["starred_url"]?.let { json.decodeFromJsonElement<String>(it) },
        subscriptionsUrl = rawObject["subscriptions_url"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        userViewType = rawObject["user_view_type"]?.let { json.decodeFromJsonElement<String>(it) },
        websiteUrl = rawObject["website_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonElement?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookInstallationTargetRenamedAccountX55d3a3d3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookInstallationTargetRenamedAccountX55d3a3d3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("avatar_url", value.avatarUrl)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("node_id", value.nodeId)
        value.archivedAt?.let { put("archived_at", it) }
        value.createdAt?.let { put("created_at", it) }
        value.description?.let { put("description", json.encodeToJsonElement(it)) }
        value.eventsUrl?.let { put("events_url", it) }
        value.followers?.let { put("followers", json.encodeToJsonElement(it)) }
        value.followersUrl?.let { put("followers_url", it) }
        value.following?.let { put("following", json.encodeToJsonElement(it)) }
        value.followingUrl?.let { put("following_url", it) }
        value.gistsUrl?.let { put("gists_url", it) }
        value.gravatarId?.let { put("gravatar_id", it) }
        value.hasOrganizationProjects?.let { put("has_organization_projects", json.encodeToJsonElement(it)) }
        value.hasRepositoryProjects?.let { put("has_repository_projects", json.encodeToJsonElement(it)) }
        value.hooksUrl?.let { put("hooks_url", it) }
        value.isVerified?.let { put("is_verified", json.encodeToJsonElement(it)) }
        value.issuesUrl?.let { put("issues_url", it) }
        value.login?.let { put("login", it) }
        value.membersUrl?.let { put("members_url", it) }
        value.name?.let { put("name", it) }
        value.organizationsUrl?.let { put("organizations_url", it) }
        value.publicGists?.let { put("public_gists", json.encodeToJsonElement(it)) }
        value.publicMembersUrl?.let { put("public_members_url", it) }
        value.publicRepos?.let { put("public_repos", json.encodeToJsonElement(it)) }
        value.receivedEventsUrl?.let { put("received_events_url", it) }
        value.reposUrl?.let { put("repos_url", it) }
        value.siteAdmin?.let { put("site_admin", json.encodeToJsonElement(it)) }
        value.slug?.let { put("slug", it) }
        value.starredUrl?.let { put("starred_url", it) }
        value.subscriptionsUrl?.let { put("subscriptions_url", it) }
        value.type?.let { put("type", it) }
        value.updatedAt?.let { put("updated_at", it) }
        value.url?.let { put("url", it) }
        value.userViewType?.let { put("user_view_type", it) }
        value.websiteUrl?.let { put("website_url", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookInstallationTargetRenamedAccountX55d3a3d3(block: InlineWebhookInstallationTargetRenamedAccountX55d3a3d3.Builder.() -> Unit): InlineWebhookInstallationTargetRenamedAccountX55d3a3d3 = InlineWebhookInstallationTargetRenamedAccountX55d3a3d3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookInstallationTargetRenamedAccountX55d3a3d3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
