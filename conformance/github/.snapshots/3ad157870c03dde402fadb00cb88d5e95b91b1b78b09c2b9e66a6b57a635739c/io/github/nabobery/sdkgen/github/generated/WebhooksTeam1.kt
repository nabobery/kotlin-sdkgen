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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_team_1
 */
@Serializable(with = WebhooksTeam1.Serializer::class)
public class WebhooksTeam1(
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
   * Unique identifier of the enterprise to which this team belongs
   */
  public val enterpriseId: Int? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String? = null,
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val membersUrl: String? = null,
  public val nodeId: String? = null,
  /**
   * Whether team members will receive notifications when their team is @mentioned
   */
  public val notificationSetting: InlineWebhooksTeam1NotificationSettingXb566738d? = null,
  /**
   * Unique identifier of the organization to which this team belongs
   */
  public val organizationId: Int? = null,
  public val parent: InlineWebhooksTeam1ParentX55b2239e? = null,
  /**
   * Permission that the team will have for its repositories
   */
  public val permission: String? = null,
  public val privacy: InlineWebhooksTeam1PrivacyXec81d14c? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val repositoriesUrl: String? = null,
  public val slug: String? = null,
  /**
   * The ownership type of the team
   */
  public val type: InlineWebhooksTeam1TypeX3397b9a8? = null,
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
     * Unique identifier of the enterprise to which this team belongs
     */
    public var enterpriseId: Int? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var htmlUrl: String? = null

    /**
     * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var membersUrl: String? = null

    public var nodeId: String? = null

    /**
     * Whether team members will receive notifications when their team is @mentioned
     */
    public var notificationSetting: InlineWebhooksTeam1NotificationSettingXb566738d? = null

    /**
     * Unique identifier of the organization to which this team belongs
     */
    public var organizationId: Int? = null

    public var parent: InlineWebhooksTeam1ParentX55b2239e? = null

    /**
     * Permission that the team will have for its repositories
     */
    public var permission: String? = null

    public var privacy: InlineWebhooksTeam1PrivacyXec81d14c? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var repositoriesUrl: String? = null

    public var slug: String? = null

    /**
     * The ownership type of the team
     */
    public var type: InlineWebhooksTeam1TypeX3397b9a8? = null

    /**
     * URL for the team
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var url: String? = null

    public fun build(): WebhooksTeam1 {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      return WebhooksTeam1(
        id = id,
        name = name,
        deleted = deleted,
        description = description,
        enterpriseId = enterpriseId,
        htmlUrl = htmlUrl,
        membersUrl = membersUrl,
        nodeId = nodeId,
        notificationSetting = notificationSetting,
        organizationId = organizationId,
        parent = parent,
        permission = permission,
        privacy = privacy,
        repositoriesUrl = repositoriesUrl,
        slug = slug,
        type = type,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhooksTeam1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhooksTeam1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhooksTeam1 {
      val jsonDecoder = decoder.requireJsonDecoder("WebhooksTeam1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhooksTeam1 must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      return WebhooksTeam1(
        id = id,
        name = name,
        deleted = rawObject["deleted"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        enterpriseId = rawObject["enterprise_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        membersUrl = rawObject["members_url"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        notificationSetting = rawObject["notification_setting"]?.let { json.decodeFromJsonElement<InlineWebhooksTeam1NotificationSettingXb566738d>(it) },
        organizationId = rawObject["organization_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        parent = rawObject["parent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhooksTeam1ParentX55b2239e?>(element) },
        permission = rawObject["permission"]?.let { json.decodeFromJsonElement<String>(it) },
        privacy = rawObject["privacy"]?.let { json.decodeFromJsonElement<InlineWebhooksTeam1PrivacyXec81d14c>(it) },
        repositoriesUrl = rawObject["repositories_url"]?.let { json.decodeFromJsonElement<String>(it) },
        slug = rawObject["slug"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineWebhooksTeam1TypeX3397b9a8>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhooksTeam1) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhooksTeam1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        value.deleted?.let { put("deleted", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.enterpriseId?.let { put("enterprise_id", json.encodeToJsonElement(it)) }
        value.htmlUrl?.let { put("html_url", it) }
        value.membersUrl?.let { put("members_url", it) }
        value.nodeId?.let { put("node_id", it) }
        value.notificationSetting?.let { put("notification_setting", json.encodeToJsonElement(it)) }
        value.organizationId?.let { put("organization_id", json.encodeToJsonElement(it)) }
        value.parent?.let { put("parent", json.encodeToJsonElement(it)) }
        value.permission?.let { put("permission", it) }
        value.privacy?.let { put("privacy", json.encodeToJsonElement(it)) }
        value.repositoriesUrl?.let { put("repositories_url", it) }
        value.slug?.let { put("slug", it) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhooksTeam1(block: WebhooksTeam1.Builder.() -> Unit): WebhooksTeam1 = WebhooksTeam1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhooksTeam1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
