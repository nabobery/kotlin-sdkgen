package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Long
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
 * Group of enterprise owners and/or members
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/enterprise-team
 */
@Serializable(with = EnterpriseTeam.Serializer::class)
public class EnterpriseTeam internal constructor(
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val groupId: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: Long,
  public val membersUrl: String,
  public val name: String,
  public val slug: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val descriptionState: FieldState<String>,
  private val groupNameState: FieldState<String?>,
  private val notificationSettingState:
      FieldState<InlineEnterpriseTeamNotificationSettingX8fafabf3>,
  private val organizationSelectionTypeState: FieldState<String>,
  private val syncToOrganizationsState: FieldState<String>,
) {
  public val description: String?
    get() = descriptionState.valueOrNull()

  /**
   * Retired: this field will not be returned with GHEC enterprise teams.
   */
  public val groupName: String?
    get() = groupNameState.valueOrNull()

  /**
   * Whether team members will receive notifications when the team is mentioned.
   */
  public val notificationSetting: InlineEnterpriseTeamNotificationSettingX8fafabf3?
    get() = notificationSettingState.valueOrNull()

  public val organizationSelectionType: String?
    get() = organizationSelectionTypeState.valueOrNull()

  /**
   * Retired: this field will not be returned with GHEC enterprise teams.
   */
  public val syncToOrganizations: String?
    get() = syncToOrganizationsState.valueOrNull()

  public constructor(
    createdAt: String,
    groupId: String?,
    htmlUrl: String,
    id: Long,
    membersUrl: String,
    name: String,
    slug: String,
    updatedAt: String,
    url: String,
  ) : this(createdAt = createdAt,
  groupId = groupId,
  htmlUrl = htmlUrl,
  id = id,
  membersUrl = membersUrl,
  name = name,
  slug = slug,
  updatedAt = updatedAt,
  url = url,
  descriptionState = FieldState.Absent,
  groupNameState = FieldState.Absent,
  notificationSettingState = FieldState.Absent,
  organizationSelectionTypeState = FieldState.Absent,
  syncToOrganizationsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `description`.
   */
  public fun descriptionPresence(): FieldPresence = descriptionState.presence

  /**
   * Returns the wire presence of `group_name`.
   */
  public fun groupNamePresence(): FieldPresence = groupNameState.presence

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
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var membersUrlValue: String? = null

    public var membersUrl: String
      get() = requireNotNull(membersUrlValue) { "membersUrl is required" }
      set(`value`) {
        membersUrlValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var slugValue: String? = null

    public var slug: String
      get() = requireNotNull(slugValue) { "slug is required" }
      set(`value`) {
        slugValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var groupIdState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var groupId: String?
      get() = groupIdState.valueOrNull()
      set(`value`) {
        groupIdState = value.toNullableFieldState()
      }

    private var descriptionState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "description is not nullable; call unsetDescription() to omit it" }
        descriptionState = FieldState.Value(present)
      }

    private var groupNameState: FieldState<String?> = FieldState.Absent

    /**
     * Retired: this field will not be returned with GHEC enterprise teams.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var groupName: String?
      get() = groupNameState.valueOrNull()
      set(`value`) {
        groupNameState = value.toNullableFieldState()
      }

    private var notificationSettingState:
        FieldState<InlineEnterpriseTeamNotificationSettingX8fafabf3> = FieldState.Absent

    /**
     * Whether team members will receive notifications when the team is mentioned.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var notificationSetting: InlineEnterpriseTeamNotificationSettingX8fafabf3?
      get() = notificationSettingState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "notificationSetting is not nullable; call unsetNotificationSetting() to omit it" }
        notificationSettingState = FieldState.Value(present)
      }

    private var organizationSelectionTypeState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var organizationSelectionType: String?
      get() = organizationSelectionTypeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "organizationSelectionType is not nullable; call unsetOrganizationSelectionType() to omit it" }
        organizationSelectionTypeState = FieldState.Value(present)
      }

    private var syncToOrganizationsState: FieldState<String> = FieldState.Absent

    /**
     * Retired: this field will not be returned with GHEC enterprise teams.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var syncToOrganizations: String?
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
     * Omits `group_name` from serialized output.
     */
    public fun unsetGroupName() {
      groupNameState = FieldState.Absent
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

    public fun build(): EnterpriseTeam {
      check(createdAtValue != null) { "createdAt is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(membersUrlValue != null) { "membersUrl is required" }
      check(nameValue != null) { "name is required" }
      check(slugValue != null) { "slug is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(groupIdState !== FieldState.Absent) { "groupId is required, even when null" }
      return EnterpriseTeam(
        createdAt = createdAt,
        groupId = groupIdState.valueOrNull(),
        htmlUrl = htmlUrl,
        id = id,
        membersUrl = membersUrl,
        name = name,
        slug = slug,
        updatedAt = updatedAt,
        url = url,
        descriptionState = descriptionState,
        groupNameState = groupNameState,
        notificationSettingState = notificationSettingState,
        organizationSelectionTypeState = organizationSelectionTypeState,
        syncToOrganizationsState = syncToOrganizationsState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): EnterpriseTeam = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<EnterpriseTeam> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): EnterpriseTeam {
      val jsonDecoder = decoder.requireJsonDecoder("EnterpriseTeam")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("EnterpriseTeam must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val membersUrl = json.decodeRequired<String>(rawObject, "members_url")
      val name = json.decodeRequired<String>(rawObject, "name")
      val slug = json.decodeRequired<String>(rawObject, "slug")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("group_id")) {
        throw SerializationException("EnterpriseTeam is missing required property 'group_id'")
      }
      val groupId = rawObject["group_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return EnterpriseTeam(
        createdAt = createdAt,
        groupId = groupId,
        htmlUrl = htmlUrl,
        id = id,
        membersUrl = membersUrl,
        name = name,
        slug = slug,
        updatedAt = updatedAt,
        url = url,
        descriptionState = json.decodeOptional(rawObject, "description", nullable = false),
        groupNameState = json.decodeOptional(rawObject, "group_name", nullable = true),
        notificationSettingState = json.decodeOptional(rawObject, "notification_setting", nullable = false),
        organizationSelectionTypeState = json.decodeOptional(rawObject, "organization_selection_type", nullable = false),
        syncToOrganizationsState = json.decodeOptional(rawObject, "sync_to_organizations", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: EnterpriseTeam) {
      val jsonEncoder = encoder.requireJsonEncoder("EnterpriseTeam")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("group_id", value.groupId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("members_url", value.membersUrl)
        put("name", value.name)
        put("slug", value.slug)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("group_name", value.groupNameState, json::encodeToJsonElement)
        putState("notification_setting", value.notificationSettingState, json::encodeToJsonElement)
        putState("organization_selection_type", value.organizationSelectionTypeState, json::encodeToJsonElement)
        putState("sync_to_organizations", value.syncToOrganizationsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun enterpriseTeam(block: EnterpriseTeam.Builder.() -> Unit): EnterpriseTeam = EnterpriseTeam.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("EnterpriseTeam is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("EnterpriseTeam property '" + name + "' is not nullable")
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
