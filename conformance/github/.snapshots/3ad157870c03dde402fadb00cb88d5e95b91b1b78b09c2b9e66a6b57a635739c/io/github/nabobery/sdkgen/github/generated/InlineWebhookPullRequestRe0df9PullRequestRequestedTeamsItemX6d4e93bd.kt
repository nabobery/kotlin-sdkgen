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
 * Groups of organization members that gives permissions on specified repositories.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/pull_request/
 * properties/requested_teams/items
 */
@Serializable(with = InlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemX6d4e93bd.Serializer::class)
public class InlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemX6d4e93bd(
  /**
   * Unique identifier of the team
   */
  public val id: Int,
  /**
   * Name of the team
   */
  public val name: String,
  public val deleted: Boolean? = null,
  /**
   * Description of the team
   */
  public val description: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String? = null,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val membersUrl: String? = null,
  public val nodeId: String? = null,
  public val parent:
      InlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemParentX97086390? = null,
  /**
   * Permission that the team will have for its repositories
   */
  public val permission: String? = null,
  public val privacy:
      InlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemPrivacyXed3c97f6? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val repositoriesUrl: String? = null,
  public val slug: String? = null,
  /**
   * URL for the team
   *
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

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public var deleted: Boolean? = null

    /**
     * Description of the team
     */
    public var description: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var htmlUrl: String? = null

    /**
     * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var membersUrl: String? = null

    public var nodeId: String? = null

    public var parent: InlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemParentX97086390? =
        null

    /**
     * Permission that the team will have for its repositories
     */
    public var permission: String? = null

    public var privacy: InlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemPrivacyXed3c97f6?
        = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var repositoriesUrl: String? = null

    public var slug: String? = null

    /**
     * URL for the team
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var url: String? = null

    public fun build(): InlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemX6d4e93bd {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      return InlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemX6d4e93bd(
        id = id,
        name = name,
        deleted = deleted,
        description = description,
        htmlUrl = htmlUrl,
        membersUrl = membersUrl,
        nodeId = nodeId,
        parent = parent,
        permission = permission,
        privacy = privacy,
        repositoriesUrl = repositoriesUrl,
        slug = slug,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemX6d4e93bd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemX6d4e93bd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemX6d4e93bd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemX6d4e93bd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemX6d4e93bd must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemX6d4e93bd(
        id = id,
        name = name,
        deleted = rawObject["deleted"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        membersUrl = rawObject["members_url"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        parent = rawObject["parent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemParentX97086390?>(element) },
        permission = rawObject["permission"]?.let { json.decodeFromJsonElement<String>(it) },
        privacy = rawObject["privacy"]?.let { json.decodeFromJsonElement<InlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemPrivacyXed3c97f6>(it) },
        repositoriesUrl = rawObject["repositories_url"]?.let { json.decodeFromJsonElement<String>(it) },
        slug = rawObject["slug"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemX6d4e93bd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemX6d4e93bd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        value.deleted?.let { put("deleted", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.htmlUrl?.let { put("html_url", it) }
        value.membersUrl?.let { put("members_url", it) }
        value.nodeId?.let { put("node_id", it) }
        value.parent?.let { put("parent", json.encodeToJsonElement(it)) }
        value.permission?.let { put("permission", it) }
        value.privacy?.let { put("privacy", json.encodeToJsonElement(it)) }
        value.repositoriesUrl?.let { put("repositories_url", it) }
        value.slug?.let { put("slug", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemX6d4e93bd(block: InlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemX6d4e93bd.Builder.() -> Unit): InlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemX6d4e93bd = InlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemX6d4e93bd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestRe0df9PullRequestRequestedTeamsItemX6d4e93bd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
