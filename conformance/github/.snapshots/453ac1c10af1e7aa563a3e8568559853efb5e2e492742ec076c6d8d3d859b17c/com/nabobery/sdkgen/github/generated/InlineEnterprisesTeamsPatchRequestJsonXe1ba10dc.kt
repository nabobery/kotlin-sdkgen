package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1teams~1{team_slug}/patch/requestBody/content/applica
 * tion~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1teams~1{team_slug}/patch/requestBody/content/applica
 * tion~1json/schema
 */
@Serializable(with = InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc.Serializer::class)
public class InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc internal constructor(
  private val descriptionState: FieldState<String?>,
  private val groupIdState: FieldState<String?>,
  private val nameState: FieldState<String?>,
  private val notificationSettingState:
      FieldState<InlineEnterprisesTeamsPatchRequestJsonNotificationSettingX16e7f369>,
  private val organizationSelectionTypeState:
      FieldState<InlineEnterprisesTeamsPatchRequestJsonOrganizationSelectionTypeX984f230a>,
  private val syncToOrganizationsState:
      FieldState<InlineEnterprisesTeamsPatchRequestJsonSyncToOrganizationsXa49455d9>,
) {
  /**
   * A new description for the team.
   */
  public val description: String?
    get() = descriptionState.valueOrNull()

  /**
   * The ID of the IdP group to assign team membership with. The new IdP group will replace the existing one, or replace
   * existing direct members if the team isn't currently linked to an IdP group.
   */
  public val groupId: String?
    get() = groupIdState.valueOrNull()

  /**
   * A new name for the team.
   */
  public val name: String?
    get() = nameState.valueOrNull()

  /**
   * The notification setting the team is set to. The options are:
   *
   * * `notifications_enabled` - team members receive notifications when the team is @mentioned.
   * * `notifications_disabled` - no one receives notifications.
   *
   */
  public val notificationSetting:
      InlineEnterprisesTeamsPatchRequestJsonNotificationSettingX16e7f369?
    get() = notificationSettingState.valueOrNull()

  /**
   * Specifies which organizations in the enterprise should have access to this team. Can be one of `disabled`,
   * `selected`, or `all`.
   * `disabled`: The team is not assigned to any organizations. This is the default when you create a new team.
   * `selected`: The team is assigned to specific organizations. You can then use the [add organization assignments
   * API](https://docs.github.com/rest/enterprise-teams/enterprise-team-organizations#add-organization-assignments).
   * `all`: The team is assigned to all current and future organizations in the enterprise.
   *
   */
  public val organizationSelectionType:
      InlineEnterprisesTeamsPatchRequestJsonOrganizationSelectionTypeX984f230a?
    get() = organizationSelectionTypeState.valueOrNull()

  /**
   * Retired: this field is no longer supported.
   * Whether the enterprise team should be reflected in each organization.
   * This value cannot be changed.
   *
   */
  public val syncToOrganizations:
      InlineEnterprisesTeamsPatchRequestJsonSyncToOrganizationsXa49455d9?
    get() = syncToOrganizationsState.valueOrNull()

  public constructor() : this(descriptionState = FieldState.Absent,
  groupIdState = FieldState.Absent,
  nameState = FieldState.Absent,
  notificationSettingState = FieldState.Absent,
  organizationSelectionTypeState = FieldState.Absent,
  syncToOrganizationsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `description`.
   */
  public fun descriptionPresence(): FieldPresence = descriptionState.presence

  /**
   * Returns the wire presence of `group_id`.
   */
  public fun groupIdPresence(): FieldPresence = groupIdState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  /**
   * Returns the wire presence of `notification_setting`.
   */
  public fun notificationSettingPresence(): FieldPresence = notificationSettingState.presence

  /**
   * Returns the wire presence of `organization_selection_type`.
   */
  public fun organizationSelectionTypePresence(): FieldPresence = organizationSelectionTypeState.presence

  /**
   * Returns the wire presence of `sync_to_organizations`.
   */
  public fun syncToOrganizationsPresence(): FieldPresence = syncToOrganizationsState.presence

  public class Builder {
    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * A new description for the team.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var groupIdState: FieldState<String?> = FieldState.Absent

    /**
     * The ID of the IdP group to assign team membership with. The new IdP group will replace the existing one, or
     * replace existing direct members if the team isn't currently linked to an IdP group.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var groupId: String?
      get() = groupIdState.valueOrNull()
      set(`value`) {
        groupIdState = value.toNullableFieldState()
      }

    private var nameState: FieldState<String?> = FieldState.Absent

    /**
     * A new name for the team.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        nameState = value.toNullableFieldState()
      }

    private var notificationSettingState:
        FieldState<InlineEnterprisesTeamsPatchRequestJsonNotificationSettingX16e7f369> =
        FieldState.Absent

    /**
     * The notification setting the team is set to. The options are:
     *
     * * `notifications_enabled` - team members receive notifications when the team is @mentioned.
     * * `notifications_disabled` - no one receives notifications.
     *
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var notificationSetting:
        InlineEnterprisesTeamsPatchRequestJsonNotificationSettingX16e7f369?
      get() = notificationSettingState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "notificationSetting is not nullable; call unsetNotificationSetting() to omit it" }
        notificationSettingState = FieldState.Value(present)
      }

    private var organizationSelectionTypeState:
        FieldState<InlineEnterprisesTeamsPatchRequestJsonOrganizationSelectionTypeX984f230a> =
        FieldState.Absent

    /**
     * Specifies which organizations in the enterprise should have access to this team. Can be one of `disabled`,
     * `selected`, or `all`.
     * `disabled`: The team is not assigned to any organizations. This is the default when you create a new team.
     * `selected`: The team is assigned to specific organizations. You can then use the [add organization assignments
     * API](https://docs.github.com/rest/enterprise-teams/enterprise-team-organizations#add-organization-assignments).
     * `all`: The team is assigned to all current and future organizations in the enterprise.
     *
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var organizationSelectionType:
        InlineEnterprisesTeamsPatchRequestJsonOrganizationSelectionTypeX984f230a?
      get() = organizationSelectionTypeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "organizationSelectionType is not nullable; call unsetOrganizationSelectionType() to omit it" }
        organizationSelectionTypeState = FieldState.Value(present)
      }

    private var syncToOrganizationsState:
        FieldState<InlineEnterprisesTeamsPatchRequestJsonSyncToOrganizationsXa49455d9> =
        FieldState.Absent

    /**
     * Retired: this field is no longer supported.
     * Whether the enterprise team should be reflected in each organization.
     * This value cannot be changed.
     *
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var syncToOrganizations:
        InlineEnterprisesTeamsPatchRequestJsonSyncToOrganizationsXa49455d9?
      get() = syncToOrganizationsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "syncToOrganizations is not nullable; call unsetSyncToOrganizations() to omit it" }
        syncToOrganizationsState = FieldState.Value(present)
      }

    /**
     * Omits `description` from serialized output.
     */
    public fun unsetDescription() {
      descriptionState = FieldState.Absent
    }

    /**
     * Omits `group_id` from serialized output.
     */
    public fun unsetGroupId() {
      groupIdState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    /**
     * Omits `notification_setting` from serialized output.
     */
    public fun unsetNotificationSetting() {
      notificationSettingState = FieldState.Absent
    }

    /**
     * Omits `organization_selection_type` from serialized output.
     */
    public fun unsetOrganizationSelectionType() {
      organizationSelectionTypeState = FieldState.Absent
    }

    /**
     * Omits `sync_to_organizations` from serialized output.
     */
    public fun unsetSyncToOrganizations() {
      syncToOrganizationsState = FieldState.Absent
    }

    public fun build(): InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc = InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc(
      descriptionState = descriptionState,
      groupIdState = groupIdState,
      nameState = nameState,
      notificationSettingState = notificationSettingState,
      organizationSelectionTypeState = organizationSelectionTypeState,
      syncToOrganizationsState = syncToOrganizationsState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc must be a JSON object")
      return InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc(
        descriptionState = json.decodeOptional(rawObject, "description", nullable = true),
        groupIdState = json.decodeOptional(rawObject, "group_id", nullable = true),
        nameState = json.decodeOptional(rawObject, "name", nullable = true),
        notificationSettingState = json.decodeOptional(rawObject, "notification_setting", nullable = false),
        organizationSelectionTypeState = json.decodeOptional(rawObject, "organization_selection_type", nullable = false),
        syncToOrganizationsState = json.decodeOptional(rawObject, "sync_to_organizations", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("group_id", value.groupIdState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("notification_setting", value.notificationSettingState, json::encodeToJsonElement)
        putState("organization_selection_type", value.organizationSelectionTypeState, json::encodeToJsonElement)
        putState("sync_to_organizations", value.syncToOrganizationsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEnterprisesTeamsPatchRequestJsonXe1ba10dc(block: InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc.Builder.() -> Unit): InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc = InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
