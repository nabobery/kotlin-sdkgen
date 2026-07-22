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
 * Groups of organization members that gives permissions on specified repositories.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/reque
 * sted_teams/items
 */
@Serializable(with = InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemXfa6c5e27.Serializer::class)
public class InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemXfa6c5e27(
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
  public val htmlUrl: String? = null,
  public val membersUrl: String? = null,
  public val nodeId: String? = null,
  public val parent:
      InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemParentXb69f429b? = null,
  /**
   * Permission that the team will have for its repositories
   */
  public val permission: String? = null,
  public val privacy:
      InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemPrivacyX10443533? = null,
  public val repositoriesUrl: String? = null,
  public val slug: String? = null,
  /**
   * URL for the team
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

    public var htmlUrl: String? = null

    public var membersUrl: String? = null

    public var nodeId: String? = null

    public var parent: InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemParentXb69f429b? =
        null

    /**
     * Permission that the team will have for its repositories
     */
    public var permission: String? = null

    public var privacy: InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemPrivacyX10443533?
        = null

    public var repositoriesUrl: String? = null

    public var slug: String? = null

    /**
     * URL for the team
     */
    public var url: String? = null

    public fun build(): InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemXfa6c5e27 {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      return InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemXfa6c5e27(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemXfa6c5e27 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemXfa6c5e27> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemXfa6c5e27 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemXfa6c5e27")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemXfa6c5e27 must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemXfa6c5e27(
        id = id,
        name = name,
        deleted = rawObject["deleted"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        membersUrl = rawObject["members_url"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        parent = rawObject["parent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemParentXb69f429b?>(element) },
        permission = rawObject["permission"]?.let { json.decodeFromJsonElement<String>(it) },
        privacy = rawObject["privacy"]?.let { json.decodeFromJsonElement<InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemPrivacyX10443533>(it) },
        repositoriesUrl = rawObject["repositories_url"]?.let { json.decodeFromJsonElement<String>(it) },
        slug = rawObject["slug"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemXfa6c5e27) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemXfa6c5e27")
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

public fun inlineWebhookPullRequestLockedPullRequestRequestedTeamsItemXfa6c5e27(block: InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemXfa6c5e27.Builder.() -> Unit): InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemXfa6c5e27 = InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemXfa6c5e27.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestLockedPullRequestRequestedTeamsItemXfa6c5e27 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
