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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The Relationship a Team has with a role.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/team-role-assignment
 */
@Serializable(with = TeamRoleAssignment.Serializer::class)
public class TeamRoleAssignment internal constructor(
  public val description: String?,
  public val htmlUrl: String,
  public val id: Int,
  public val membersUrl: String,
  public val name: String,
  public val nodeId: String,
  public val parent: NullableTeamSimple?,
  public val permission: String,
  public val repositoriesUrl: String,
  public val slug: String,
  /**
   * The ownership type of the team
   */
  public val type: InlineTeamRoleAssignmentTypeXc594d4c4,
  public val url: String,
  private val assignmentState: FieldState<InlineTeamRoleAssignmentAssignmentX6c9bf278>,
  private val enterpriseIdState: FieldState<Int>,
  private val notificationSettingState: FieldState<String>,
  private val organizationIdState: FieldState<Int>,
  private val permissionsState: FieldState<InlineTeamRoleAssignmentPermissionsX9f9d0d2a>,
  private val privacyState: FieldState<String>,
) {
  /**
   * Determines if the team has a direct, indirect, or mixed relationship to a role
   */
  public val assignment: InlineTeamRoleAssignmentAssignmentX6c9bf278?
    get() = assignmentState.valueOrNull()

  /**
   * Unique identifier of the enterprise to which this team belongs
   */
  public val enterpriseId: Int?
    get() = enterpriseIdState.valueOrNull()

  public val notificationSetting: String?
    get() = notificationSettingState.valueOrNull()

  /**
   * Unique identifier of the organization to which this team belongs
   */
  public val organizationId: Int?
    get() = organizationIdState.valueOrNull()

  public val permissions: InlineTeamRoleAssignmentPermissionsX9f9d0d2a?
    get() = permissionsState.valueOrNull()

  public val privacy: String?
    get() = privacyState.valueOrNull()

  public constructor(
    description: String?,
    htmlUrl: String,
    id: Int,
    membersUrl: String,
    name: String,
    nodeId: String,
    parent: NullableTeamSimple?,
    permission: String,
    repositoriesUrl: String,
    slug: String,
    type: InlineTeamRoleAssignmentTypeXc594d4c4,
    url: String,
  ) : this(description = description,
  htmlUrl = htmlUrl,
  id = id,
  membersUrl = membersUrl,
  name = name,
  nodeId = nodeId,
  parent = parent,
  permission = permission,
  repositoriesUrl = repositoriesUrl,
  slug = slug,
  type = type,
  url = url,
  assignmentState = FieldState.Absent,
  enterpriseIdState = FieldState.Absent,
  notificationSettingState = FieldState.Absent,
  organizationIdState = FieldState.Absent,
  permissionsState = FieldState.Absent,
  privacyState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `assignment`.
   */
  public fun assignmentPresence(): FieldPresence = assignmentState.presence

  /**
   * Returns the wire presence of `enterprise_id`.
   */
  public fun enterpriseIdPresence(): FieldPresence = enterpriseIdState.presence

  /**
   * Returns the wire presence of `notification_setting`.
   */
  public fun notificationSettingPresence(): FieldPresence = notificationSettingState.presence

  /**
   * Returns the wire presence of `organization_id`.
   */
  public fun organizationIdPresence(): FieldPresence = organizationIdState.presence

  /**
   * Returns the wire presence of `permissions`.
   */
  public fun permissionsPresence(): FieldPresence = permissionsState.presence

  /**
   * Returns the wire presence of `privacy`.
   */
  public fun privacyPresence(): FieldPresence = privacyState.presence

  public class Builder {
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

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var permissionValue: String? = null

    public var permission: String
      get() = requireNotNull(permissionValue) { "permission is required" }
      set(`value`) {
        permissionValue = value
      }

    private var repositoriesUrlValue: String? = null

    public var repositoriesUrl: String
      get() = requireNotNull(repositoriesUrlValue) { "repositoriesUrl is required" }
      set(`value`) {
        repositoriesUrlValue = value
      }

    private var slugValue: String? = null

    public var slug: String
      get() = requireNotNull(slugValue) { "slug is required" }
      set(`value`) {
        slugValue = value
      }

    private var typeValue: InlineTeamRoleAssignmentTypeXc594d4c4? = null

    public var type: InlineTeamRoleAssignmentTypeXc594d4c4
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var parentState: FieldState<NullableTeamSimple?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var parent: NullableTeamSimple?
      get() = parentState.valueOrNull()
      set(`value`) {
        parentState = value.toNullableFieldState()
      }

    private var assignmentState: FieldState<InlineTeamRoleAssignmentAssignmentX6c9bf278> =
        FieldState.Absent

    /**
     * Determines if the team has a direct, indirect, or mixed relationship to a role
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var assignment: InlineTeamRoleAssignmentAssignmentX6c9bf278?
      get() = assignmentState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "assignment is not nullable; call unsetAssignment() to omit it" }
        assignmentState = FieldState.Value(present)
      }

    private var enterpriseIdState: FieldState<Int> = FieldState.Absent

    /**
     * Unique identifier of the enterprise to which this team belongs
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var enterpriseId: Int?
      get() = enterpriseIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "enterpriseId is not nullable; call unsetEnterpriseId() to omit it" }
        enterpriseIdState = FieldState.Value(present)
      }

    private var notificationSettingState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var notificationSetting: String?
      get() = notificationSettingState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "notificationSetting is not nullable; call unsetNotificationSetting() to omit it" }
        notificationSettingState = FieldState.Value(present)
      }

    private var organizationIdState: FieldState<Int> = FieldState.Absent

    /**
     * Unique identifier of the organization to which this team belongs
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var organizationId: Int?
      get() = organizationIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "organizationId is not nullable; call unsetOrganizationId() to omit it" }
        organizationIdState = FieldState.Value(present)
      }

    private var permissionsState: FieldState<InlineTeamRoleAssignmentPermissionsX9f9d0d2a> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var permissions: InlineTeamRoleAssignmentPermissionsX9f9d0d2a?
      get() = permissionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "permissions is not nullable; call unsetPermissions() to omit it" }
        permissionsState = FieldState.Value(present)
      }

    private var privacyState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var privacy: String?
      get() = privacyState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "privacy is not nullable; call unsetPrivacy() to omit it" }
        privacyState = FieldState.Value(present)
      }

    /**
     * Omits `assignment` from serialized output.
     */
    public fun unsetAssignment() {
      assignmentState = FieldState.Absent
    }

    /**
     * Omits `enterprise_id` from serialized output.
     */
    public fun unsetEnterpriseId() {
      enterpriseIdState = FieldState.Absent
    }

    /**
     * Omits `notification_setting` from serialized output.
     */
    public fun unsetNotificationSetting() {
      notificationSettingState = FieldState.Absent
    }

    /**
     * Omits `organization_id` from serialized output.
     */
    public fun unsetOrganizationId() {
      organizationIdState = FieldState.Absent
    }

    /**
     * Omits `permissions` from serialized output.
     */
    public fun unsetPermissions() {
      permissionsState = FieldState.Absent
    }

    /**
     * Omits `privacy` from serialized output.
     */
    public fun unsetPrivacy() {
      privacyState = FieldState.Absent
    }

    public fun build(): TeamRoleAssignment {
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(membersUrlValue != null) { "membersUrl is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(permissionValue != null) { "permission is required" }
      check(repositoriesUrlValue != null) { "repositoriesUrl is required" }
      check(slugValue != null) { "slug is required" }
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      check(parentState !== FieldState.Absent) { "parent is required, even when null" }
      return TeamRoleAssignment(
        description = descriptionState.valueOrNull(),
        htmlUrl = htmlUrl,
        id = id,
        membersUrl = membersUrl,
        name = name,
        nodeId = nodeId,
        parent = parentState.valueOrNull(),
        permission = permission,
        repositoriesUrl = repositoriesUrl,
        slug = slug,
        type = type,
        url = url,
        assignmentState = assignmentState,
        enterpriseIdState = enterpriseIdState,
        notificationSettingState = notificationSettingState,
        organizationIdState = organizationIdState,
        permissionsState = permissionsState,
        privacyState = privacyState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TeamRoleAssignment = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TeamRoleAssignment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TeamRoleAssignment {
      val jsonDecoder = decoder.requireJsonDecoder("TeamRoleAssignment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TeamRoleAssignment must be a JSON object")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val membersUrl = json.decodeRequired<String>(rawObject, "members_url")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val permission = json.decodeRequired<String>(rawObject, "permission")
      val repositoriesUrl = json.decodeRequired<String>(rawObject, "repositories_url")
      val slug = json.decodeRequired<String>(rawObject, "slug")
      val type = json.decodeRequired<InlineTeamRoleAssignmentTypeXc594d4c4>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("description")) {
        throw SerializationException("TeamRoleAssignment is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("parent")) {
        throw SerializationException("TeamRoleAssignment is missing required property 'parent'")
      }
      val parent = rawObject["parent"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableTeamSimple?>(requireNotNull(element)) }
      return TeamRoleAssignment(
        description = description,
        htmlUrl = htmlUrl,
        id = id,
        membersUrl = membersUrl,
        name = name,
        nodeId = nodeId,
        parent = parent,
        permission = permission,
        repositoriesUrl = repositoriesUrl,
        slug = slug,
        type = type,
        url = url,
        assignmentState = json.decodeOptional(rawObject, "assignment", nullable = false),
        enterpriseIdState = json.decodeOptional(rawObject, "enterprise_id", nullable = false),
        notificationSettingState = json.decodeOptional(rawObject, "notification_setting", nullable = false),
        organizationIdState = json.decodeOptional(rawObject, "organization_id", nullable = false),
        permissionsState = json.decodeOptional(rawObject, "permissions", nullable = false),
        privacyState = json.decodeOptional(rawObject, "privacy", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: TeamRoleAssignment) {
      val jsonEncoder = encoder.requireJsonEncoder("TeamRoleAssignment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("members_url", value.membersUrl)
        put("name", value.name)
        put("node_id", value.nodeId)
        put("parent", value.parent?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("permission", value.permission)
        put("repositories_url", value.repositoriesUrl)
        put("slug", value.slug)
        put("type", json.encodeToJsonElement(value.type))
        put("url", value.url)
        putState("assignment", value.assignmentState, json::encodeToJsonElement)
        putState("enterprise_id", value.enterpriseIdState, json::encodeToJsonElement)
        putState("notification_setting", value.notificationSettingState, json::encodeToJsonElement)
        putState("organization_id", value.organizationIdState, json::encodeToJsonElement)
        putState("permissions", value.permissionsState, json::encodeToJsonElement)
        putState("privacy", value.privacyState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun teamRoleAssignment(block: TeamRoleAssignment.Builder.() -> Unit): TeamRoleAssignment = TeamRoleAssignment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TeamRoleAssignment is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("TeamRoleAssignment property '" + name + "' is not nullable")
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
