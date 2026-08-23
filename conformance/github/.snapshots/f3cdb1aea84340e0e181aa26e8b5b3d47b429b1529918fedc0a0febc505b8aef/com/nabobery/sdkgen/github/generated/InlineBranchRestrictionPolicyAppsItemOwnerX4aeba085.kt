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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/branch-restriction-policy/properties/apps/items/properties/owner.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/branch-restriction-policy/properties/apps/items/properties/owner
 */
@Serializable(with = InlineBranchRestrictionPolicyAppsItemOwnerX4aeba085.Serializer::class)
public class InlineBranchRestrictionPolicyAppsItemOwnerX4aeba085(
  public val avatarUrl: String? = null,
  public val description: String? = null,
  public val eventsUrl: String? = null,
  public val followersUrl: String? = null,
  public val followingUrl: String? = null,
  public val gistsUrl: String? = null,
  public val gravatarId: String? = null,
  public val hooksUrl: String? = null,
  public val htmlUrl: String? = null,
  public val id: Int? = null,
  public val issuesUrl: String? = null,
  public val login: String? = null,
  public val membersUrl: String? = null,
  public val nodeId: String? = null,
  public val organizationsUrl: String? = null,
  public val publicMembersUrl: String? = null,
  public val receivedEventsUrl: String? = null,
  public val reposUrl: String? = null,
  public val siteAdmin: Boolean? = null,
  public val starredUrl: String? = null,
  public val subscriptionsUrl: String? = null,
  public val type: String? = null,
  public val url: String? = null,
  public val userViewType: String? = null,
) {
  public class Builder {
    public var avatarUrl: String? = null

    public var description: String? = null

    public var eventsUrl: String? = null

    public var followersUrl: String? = null

    public var followingUrl: String? = null

    public var gistsUrl: String? = null

    public var gravatarId: String? = null

    public var hooksUrl: String? = null

    public var htmlUrl: String? = null

    public var id: Int? = null

    public var issuesUrl: String? = null

    public var login: String? = null

    public var membersUrl: String? = null

    public var nodeId: String? = null

    public var organizationsUrl: String? = null

    public var publicMembersUrl: String? = null

    public var receivedEventsUrl: String? = null

    public var reposUrl: String? = null

    public var siteAdmin: Boolean? = null

    public var starredUrl: String? = null

    public var subscriptionsUrl: String? = null

    public var type: String? = null

    public var url: String? = null

    public var userViewType: String? = null

    public fun build(): InlineBranchRestrictionPolicyAppsItemOwnerX4aeba085 = InlineBranchRestrictionPolicyAppsItemOwnerX4aeba085(
      avatarUrl = avatarUrl,
      description = description,
      eventsUrl = eventsUrl,
      followersUrl = followersUrl,
      followingUrl = followingUrl,
      gistsUrl = gistsUrl,
      gravatarId = gravatarId,
      hooksUrl = hooksUrl,
      htmlUrl = htmlUrl,
      id = id,
      issuesUrl = issuesUrl,
      login = login,
      membersUrl = membersUrl,
      nodeId = nodeId,
      organizationsUrl = organizationsUrl,
      publicMembersUrl = publicMembersUrl,
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

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBranchRestrictionPolicyAppsItemOwnerX4aeba085 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineBranchRestrictionPolicyAppsItemOwnerX4aeba085> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBranchRestrictionPolicyAppsItemOwnerX4aeba085 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBranchRestrictionPolicyAppsItemOwnerX4aeba085")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBranchRestrictionPolicyAppsItemOwnerX4aeba085 must be a JSON object")
      return InlineBranchRestrictionPolicyAppsItemOwnerX4aeba085(
        avatarUrl = rawObject["avatar_url"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        eventsUrl = rawObject["events_url"]?.let { json.decodeFromJsonElement<String>(it) },
        followersUrl = rawObject["followers_url"]?.let { json.decodeFromJsonElement<String>(it) },
        followingUrl = rawObject["following_url"]?.let { json.decodeFromJsonElement<String>(it) },
        gistsUrl = rawObject["gists_url"]?.let { json.decodeFromJsonElement<String>(it) },
        gravatarId = rawObject["gravatar_id"]?.let { json.decodeFromJsonElement<String>(it) },
        hooksUrl = rawObject["hooks_url"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        issuesUrl = rawObject["issues_url"]?.let { json.decodeFromJsonElement<String>(it) },
        login = rawObject["login"]?.let { json.decodeFromJsonElement<String>(it) },
        membersUrl = rawObject["members_url"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        organizationsUrl = rawObject["organizations_url"]?.let { json.decodeFromJsonElement<String>(it) },
        publicMembersUrl = rawObject["public_members_url"]?.let { json.decodeFromJsonElement<String>(it) },
        receivedEventsUrl = rawObject["received_events_url"]?.let { json.decodeFromJsonElement<String>(it) },
        reposUrl = rawObject["repos_url"]?.let { json.decodeFromJsonElement<String>(it) },
        siteAdmin = rawObject["site_admin"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        starredUrl = rawObject["starred_url"]?.let { json.decodeFromJsonElement<String>(it) },
        subscriptionsUrl = rawObject["subscriptions_url"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        userViewType = rawObject["user_view_type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBranchRestrictionPolicyAppsItemOwnerX4aeba085) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBranchRestrictionPolicyAppsItemOwnerX4aeba085")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.avatarUrl?.let { put("avatar_url", it) }
        value.description?.let { put("description", it) }
        value.eventsUrl?.let { put("events_url", it) }
        value.followersUrl?.let { put("followers_url", it) }
        value.followingUrl?.let { put("following_url", it) }
        value.gistsUrl?.let { put("gists_url", it) }
        value.gravatarId?.let { put("gravatar_id", it) }
        value.hooksUrl?.let { put("hooks_url", it) }
        value.htmlUrl?.let { put("html_url", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.issuesUrl?.let { put("issues_url", it) }
        value.login?.let { put("login", it) }
        value.membersUrl?.let { put("members_url", it) }
        value.nodeId?.let { put("node_id", it) }
        value.organizationsUrl?.let { put("organizations_url", it) }
        value.publicMembersUrl?.let { put("public_members_url", it) }
        value.receivedEventsUrl?.let { put("received_events_url", it) }
        value.reposUrl?.let { put("repos_url", it) }
        value.siteAdmin?.let { put("site_admin", json.encodeToJsonElement(it)) }
        value.starredUrl?.let { put("starred_url", it) }
        value.subscriptionsUrl?.let { put("subscriptions_url", it) }
        value.type?.let { put("type", it) }
        value.url?.let { put("url", it) }
        value.userViewType?.let { put("user_view_type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineBranchRestrictionPolicyAppsItemOwnerX4aeba085(block: InlineBranchRestrictionPolicyAppsItemOwnerX4aeba085.Builder.() -> Unit): InlineBranchRestrictionPolicyAppsItemOwnerX4aeba085 = InlineBranchRestrictionPolicyAppsItemOwnerX4aeba085.build(block)
