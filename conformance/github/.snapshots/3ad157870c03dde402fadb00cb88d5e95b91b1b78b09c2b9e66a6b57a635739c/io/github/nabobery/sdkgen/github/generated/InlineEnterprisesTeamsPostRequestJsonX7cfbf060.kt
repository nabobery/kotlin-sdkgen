package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1teams/post/requestBody/content/application~1json/sch
 * ema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1teams/post/requestBody/content/application~1json/sch
 * ema
 */
@Serializable(with = InlineEnterprisesTeamsPostRequestJsonX7cfbf060.Serializer::class)
public class InlineEnterprisesTeamsPostRequestJsonX7cfbf060(
  /**
   * The name of the team.
   */
  public val name: String,
  /**
   * A description of the team.
   */
  public val description: String? = null,
  /**
   * The ID of the IdP group to assign team membership with. You can get this value from the [REST API endpoints for
   * SCIM](https://docs.github.com/rest/scim#list-provisioned-scim-groups-for-an-enterprise).
   */
  public val groupId: String? = null,
  /**
   * The notification setting the team is set to. The options are:
   *
   * * `notifications_enabled` - team members receive notifications when the team is @mentioned.
   * * `notifications_disabled` - no one receives notifications.
   *
   * Default: `notifications_enabled`
   *
   */
  public val notificationSetting:
      InlineEnterprisesTeamsPostRequestJsonNotificationSettingXabe15c28? = null,
  /**
   * Specifies which organizations in the enterprise should have access to this team. Can be one of `disabled`,
   * `selected`, or `all`.
   * `disabled`: The team is not assigned to any organizations. This is the default when you create a new team.
   * `selected`: The team is assigned to specific organizations. You can then use the [add organization assignments
   * API](https://docs.github.com/rest/enterprise-teams/enterprise-team-organizations#add-organization-assignments)
   * endpoint.
   * `all`: The team is assigned to all current and future organizations in the enterprise.
   *
   */
  public val organizationSelectionType:
      InlineEnterprisesTeamsPostRequestJsonOrganizationSelectionTypeX2e23997a? = null,
  /**
   * Retired: this field is no longer supported.
   * Whether the enterprise team should be reflected in each organization.
   * This value cannot be set.
   *
   */
  public val syncToOrganizations:
      InlineEnterprisesTeamsPostRequestJsonSyncToOrganizationsX955fb199? = null,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    /**
     * A description of the team.
     */
    public var description: String? = null

    /**
     * The ID of the IdP group to assign team membership with. You can get this value from the [REST API endpoints for
     * SCIM](https://docs.github.com/rest/scim#list-provisioned-scim-groups-for-an-enterprise).
     */
    public var groupId: String? = null

    /**
     * The notification setting the team is set to. The options are:
     *
     * * `notifications_enabled` - team members receive notifications when the team is @mentioned.
     * * `notifications_disabled` - no one receives notifications.
     *
     * Default: `notifications_enabled`
     *
     */
    public var notificationSetting:
        InlineEnterprisesTeamsPostRequestJsonNotificationSettingXabe15c28? = null

    /**
     * Specifies which organizations in the enterprise should have access to this team. Can be one of `disabled`,
     * `selected`, or `all`.
     * `disabled`: The team is not assigned to any organizations. This is the default when you create a new team.
     * `selected`: The team is assigned to specific organizations. You can then use the [add organization assignments
     * API](https://docs.github.com/rest/enterprise-teams/enterprise-team-organizations#add-organization-assignments)
     * endpoint.
     * `all`: The team is assigned to all current and future organizations in the enterprise.
     *
     */
    public var organizationSelectionType:
        InlineEnterprisesTeamsPostRequestJsonOrganizationSelectionTypeX2e23997a? = null

    /**
     * Retired: this field is no longer supported.
     * Whether the enterprise team should be reflected in each organization.
     * This value cannot be set.
     *
     */
    public var syncToOrganizations:
        InlineEnterprisesTeamsPostRequestJsonSyncToOrganizationsX955fb199? = null

    public fun build(): InlineEnterprisesTeamsPostRequestJsonX7cfbf060 {
      check(nameValue != null) { "name is required" }
      return InlineEnterprisesTeamsPostRequestJsonX7cfbf060(
        name = name,
        description = description,
        groupId = groupId,
        notificationSetting = notificationSetting,
        organizationSelectionType = organizationSelectionType,
        syncToOrganizations = syncToOrganizations,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnterprisesTeamsPostRequestJsonX7cfbf060 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineEnterprisesTeamsPostRequestJsonX7cfbf060> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnterprisesTeamsPostRequestJsonX7cfbf060 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnterprisesTeamsPostRequestJsonX7cfbf060")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnterprisesTeamsPostRequestJsonX7cfbf060 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineEnterprisesTeamsPostRequestJsonX7cfbf060(
        name = name,
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        groupId = rawObject["group_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        notificationSetting = rawObject["notification_setting"]?.let { json.decodeFromJsonElement<InlineEnterprisesTeamsPostRequestJsonNotificationSettingXabe15c28>(it) },
        organizationSelectionType = rawObject["organization_selection_type"]?.let { json.decodeFromJsonElement<InlineEnterprisesTeamsPostRequestJsonOrganizationSelectionTypeX2e23997a>(it) },
        syncToOrganizations = rawObject["sync_to_organizations"]?.let { json.decodeFromJsonElement<InlineEnterprisesTeamsPostRequestJsonSyncToOrganizationsX955fb199>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesTeamsPostRequestJsonX7cfbf060) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnterprisesTeamsPostRequestJsonX7cfbf060")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        value.description?.let { put("description", it) }
        value.groupId?.let { put("group_id", it) }
        value.notificationSetting?.let { put("notification_setting", json.encodeToJsonElement(it)) }
        value.organizationSelectionType?.let { put("organization_selection_type", json.encodeToJsonElement(it)) }
        value.syncToOrganizations?.let { put("sync_to_organizations", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEnterprisesTeamsPostRequestJsonX7cfbf060(block: InlineEnterprisesTeamsPostRequestJsonX7cfbf060.Builder.() -> Unit): InlineEnterprisesTeamsPostRequestJsonX7cfbf060 = InlineEnterprisesTeamsPostRequestJsonX7cfbf060.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineEnterprisesTeamsPostRequestJsonX7cfbf060 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
