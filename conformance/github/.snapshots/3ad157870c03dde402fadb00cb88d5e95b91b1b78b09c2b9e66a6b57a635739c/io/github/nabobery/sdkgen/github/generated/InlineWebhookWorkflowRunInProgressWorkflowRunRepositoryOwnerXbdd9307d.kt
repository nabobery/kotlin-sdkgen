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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/workflow_run/properties/
 * repository/properties/owner.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-in-progress/properties/workflow_run/properties/
 * repository/properties/owner
 */
@Serializable(with = InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerXbdd9307d.Serializer::class)
public class InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerXbdd9307d(
  public val id: Int,
  public val login: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val avatarUrl: String? = null,
  public val deleted: Boolean? = null,
  public val email: String? = null,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val eventsUrl: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val followersUrl: String? = null,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val followingUrl: String? = null,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val gistsUrl: String? = null,
  public val gravatarId: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String? = null,
  public val name: String? = null,
  public val nodeId: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val organizationsUrl: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val receivedEventsUrl: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val reposUrl: String? = null,
  public val siteAdmin: Boolean? = null,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val starredUrl: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val subscriptionsUrl: String? = null,
  public val type:
      InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerTypeX68ca2c18? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String? = null,
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

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var avatarUrl: String? = null

    public var deleted: Boolean? = null

    public var email: String? = null

    /**
     * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var eventsUrl: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var followersUrl: String? = null

    /**
     * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var followingUrl: String? = null

    /**
     * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var gistsUrl: String? = null

    public var gravatarId: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var htmlUrl: String? = null

    public var name: String? = null

    public var nodeId: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var organizationsUrl: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var receivedEventsUrl: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var reposUrl: String? = null

    public var siteAdmin: Boolean? = null

    /**
     * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var starredUrl: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var subscriptionsUrl: String? = null

    public var type: InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerTypeX68ca2c18? =
        null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var url: String? = null

    public fun build(): InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerXbdd9307d {
      check(idValue != null) { "id is required" }
      check(loginValue != null) { "login is required" }
      return InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerXbdd9307d(
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
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerXbdd9307d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerXbdd9307d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerXbdd9307d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerXbdd9307d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerXbdd9307d must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val login = json.decodeRequired<String>(rawObject, "login")
      return InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerXbdd9307d(
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
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerTypeX68ca2c18>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerXbdd9307d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerXbdd9307d")
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
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerXbdd9307d(block: InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerXbdd9307d.Builder.() -> Unit): InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerXbdd9307d = InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerXbdd9307d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookWorkflowRunInProgressWorkflowRunRepositoryOwnerXbdd9307d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
