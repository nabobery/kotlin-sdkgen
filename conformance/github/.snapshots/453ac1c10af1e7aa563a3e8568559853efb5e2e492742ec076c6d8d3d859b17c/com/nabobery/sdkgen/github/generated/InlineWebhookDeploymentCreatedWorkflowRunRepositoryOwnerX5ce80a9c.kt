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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/workflow_run/properties/reposi
 * tory/properties/owner.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-created/properties/workflow_run/properties/reposi
 * tory/properties/owner
 */
@Serializable(with = InlineWebhookDeploymentCreatedWorkflowRunRepositoryOwnerX5ce80a9c.Serializer::class)
public class InlineWebhookDeploymentCreatedWorkflowRunRepositoryOwnerX5ce80a9c(
  public val avatarUrl: String? = null,
  public val eventsUrl: String? = null,
  public val followersUrl: String? = null,
  public val followingUrl: String? = null,
  public val gistsUrl: String? = null,
  public val gravatarId: String? = null,
  public val htmlUrl: String? = null,
  public val id: Int? = null,
  public val login: String? = null,
  public val nodeId: String? = null,
  public val organizationsUrl: String? = null,
  public val receivedEventsUrl: String? = null,
  public val reposUrl: String? = null,
  public val siteAdmin: Boolean? = null,
  public val starredUrl: String? = null,
  public val subscriptionsUrl: String? = null,
  public val type: String? = null,
  public val url: String? = null,
) {
  public class Builder {
    public var avatarUrl: String? = null

    public var eventsUrl: String? = null

    public var followersUrl: String? = null

    public var followingUrl: String? = null

    public var gistsUrl: String? = null

    public var gravatarId: String? = null

    public var htmlUrl: String? = null

    public var id: Int? = null

    public var login: String? = null

    public var nodeId: String? = null

    public var organizationsUrl: String? = null

    public var receivedEventsUrl: String? = null

    public var reposUrl: String? = null

    public var siteAdmin: Boolean? = null

    public var starredUrl: String? = null

    public var subscriptionsUrl: String? = null

    public var type: String? = null

    public var url: String? = null

    public fun build(): InlineWebhookDeploymentCreatedWorkflowRunRepositoryOwnerX5ce80a9c = InlineWebhookDeploymentCreatedWorkflowRunRepositoryOwnerX5ce80a9c(
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
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentCreatedWorkflowRunRepositoryOwnerX5ce80a9c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookDeploymentCreatedWorkflowRunRepositoryOwnerX5ce80a9c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentCreatedWorkflowRunRepositoryOwnerX5ce80a9c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentCreatedWorkflowRunRepositoryOwnerX5ce80a9c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentCreatedWorkflowRunRepositoryOwnerX5ce80a9c must be a JSON object")
      return InlineWebhookDeploymentCreatedWorkflowRunRepositoryOwnerX5ce80a9c(
        avatarUrl = rawObject["avatar_url"]?.let { json.decodeFromJsonElement<String>(it) },
        eventsUrl = rawObject["events_url"]?.let { json.decodeFromJsonElement<String>(it) },
        followersUrl = rawObject["followers_url"]?.let { json.decodeFromJsonElement<String>(it) },
        followingUrl = rawObject["following_url"]?.let { json.decodeFromJsonElement<String>(it) },
        gistsUrl = rawObject["gists_url"]?.let { json.decodeFromJsonElement<String>(it) },
        gravatarId = rawObject["gravatar_id"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        login = rawObject["login"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        organizationsUrl = rawObject["organizations_url"]?.let { json.decodeFromJsonElement<String>(it) },
        receivedEventsUrl = rawObject["received_events_url"]?.let { json.decodeFromJsonElement<String>(it) },
        reposUrl = rawObject["repos_url"]?.let { json.decodeFromJsonElement<String>(it) },
        siteAdmin = rawObject["site_admin"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        starredUrl = rawObject["starred_url"]?.let { json.decodeFromJsonElement<String>(it) },
        subscriptionsUrl = rawObject["subscriptions_url"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentCreatedWorkflowRunRepositoryOwnerX5ce80a9c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentCreatedWorkflowRunRepositoryOwnerX5ce80a9c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.avatarUrl?.let { put("avatar_url", it) }
        value.eventsUrl?.let { put("events_url", it) }
        value.followersUrl?.let { put("followers_url", it) }
        value.followingUrl?.let { put("following_url", it) }
        value.gistsUrl?.let { put("gists_url", it) }
        value.gravatarId?.let { put("gravatar_id", it) }
        value.htmlUrl?.let { put("html_url", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.login?.let { put("login", it) }
        value.nodeId?.let { put("node_id", it) }
        value.organizationsUrl?.let { put("organizations_url", it) }
        value.receivedEventsUrl?.let { put("received_events_url", it) }
        value.reposUrl?.let { put("repos_url", it) }
        value.siteAdmin?.let { put("site_admin", json.encodeToJsonElement(it)) }
        value.starredUrl?.let { put("starred_url", it) }
        value.subscriptionsUrl?.let { put("subscriptions_url", it) }
        value.type?.let { put("type", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookDeploymentCreatedWorkflowRunRepositoryOwnerX5ce80a9c(block: InlineWebhookDeploymentCreatedWorkflowRunRepositoryOwnerX5ce80a9c.Builder.() -> Unit): InlineWebhookDeploymentCreatedWorkflowRunRepositoryOwnerX5ce80a9c = InlineWebhookDeploymentCreatedWorkflowRunRepositoryOwnerX5ce80a9c.build(block)
