package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class TeamView(
  @SerialName("access_source")
  public val accessSource: InlineTeamAccessSourceX85c3d22f? = null,
  public val description: String?,
  @SerialName("enterprise_id")
  public val enterpriseId: Int? = null,
  @SerialName("html_url")
  public val htmlUrl: String,
  public val id: Int,
  @SerialName("members_url")
  public val membersUrl: String,
  public val name: String,
  @SerialName("node_id")
  public val nodeId: String,
  @SerialName("notification_setting")
  public val notificationSetting: String? = null,
  @SerialName("organization_id")
  public val organizationId: Int? = null,
  public val parent: NullableTeamSimple?,
  public val permission: String,
  public val permissions: InlineTeamPermissionsX295f9a98? = null,
  public val privacy: String? = null,
  @SerialName("repositories_url")
  public val repositoriesUrl: String,
  public val slug: String,
  public val type: InlineTeamTypeX9410b840,
  public val url: String,
)

/**
 * Groups of organization members that gives permissions on specified repositories.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/team
 */
@Serializable(with = Team.Serializer::class)
public class Team internal constructor(
  public val description: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val id: Int,
  public val membersUrl: String,
  public val name: String,
  public val nodeId: String,
  public val parent: NullableTeamSimple?,
  public val permission: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val repositoriesUrl: String,
  public val slug: String,
  /**
   * The ownership type of the team
   */
  public val type: InlineTeamTypeX9410b840,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val accessSourceState: FieldState<InlineTeamAccessSourceX85c3d22f>,
  private val enterpriseIdState: FieldState<Int>,
  private val notificationSettingState: FieldState<String>,
  private val organizationIdState: FieldState<Int>,
  private val permissionsState: FieldState<InlineTeamPermissionsX295f9a98>,
  private val privacyState: FieldState<String>,
) {
  /**
   * How the team's access to the repository was granted. This property is only
   * present when the team is returned in a repository context, such as
   * `GET /repos/{owner}/{repo}/teams`.
   */
  public val accessSource: InlineTeamAccessSourceX85c3d22f?
    get() = accessSourceState.valueOrNull()

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

  public val permissions: InlineTeamPermissionsX295f9a98?
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
    type: InlineTeamTypeX9410b840,
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
  accessSourceState = FieldState.Absent,
  enterpriseIdState = FieldState.Absent,
  notificationSettingState = FieldState.Absent,
  organizationIdState = FieldState.Absent,
  permissionsState = FieldState.Absent,
  privacyState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `access_source`.
   */
  public fun accessSourcePresence(): FieldPresence = accessSourceState.presence

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

    private var typeValue: InlineTeamTypeX9410b840? = null

    public var type: InlineTeamTypeX9410b840
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

    private var accessSourceState: FieldState<InlineTeamAccessSourceX85c3d22f> = FieldState.Absent

    /**
     * How the team's access to the repository was granted. This property is only
     * present when the team is returned in a repository context, such as
     * `GET /repos/{owner}/{repo}/teams`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var accessSource: InlineTeamAccessSourceX85c3d22f?
      get() = accessSourceState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "accessSource is not nullable; call unsetAccessSource() to omit it" }
        accessSourceState = FieldState.Value(present)
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

    private var permissionsState: FieldState<InlineTeamPermissionsX295f9a98> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var permissions: InlineTeamPermissionsX295f9a98?
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
     * Omits `access_source` from serialized output.
     */
    public fun unsetAccessSource() {
      accessSourceState = FieldState.Absent
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

    public fun build(): Team {
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
      return Team(
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
        accessSourceState = accessSourceState,
        enterpriseIdState = enterpriseIdState,
        notificationSettingState = notificationSettingState,
        organizationIdState = organizationIdState,
        permissionsState = permissionsState,
        privacyState = privacyState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Team = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Team> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Team {
      val jsonDecoder = decoder.requireJsonDecoder("Team")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Team must be a JSON object")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val membersUrl = json.decodeRequired<String>(rawObject, "members_url")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val permission = json.decodeRequired<String>(rawObject, "permission")
      val repositoriesUrl = json.decodeRequired<String>(rawObject, "repositories_url")
      val slug = json.decodeRequired<String>(rawObject, "slug")
      val type = json.decodeRequired<InlineTeamTypeX9410b840>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("description")) {
        throw SerializationException("Team is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("parent")) {
        throw SerializationException("Team is missing required property 'parent'")
      }
      val parent = rawObject["parent"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableTeamSimple?>(requireNotNull(element)) }
      return Team(
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
        accessSourceState = json.decodeOptional(rawObject, "access_source", nullable = false),
        enterpriseIdState = json.decodeOptional(rawObject, "enterprise_id", nullable = false),
        notificationSettingState = json.decodeOptional(rawObject, "notification_setting", nullable = false),
        organizationIdState = json.decodeOptional(rawObject, "organization_id", nullable = false),
        permissionsState = json.decodeOptional(rawObject, "permissions", nullable = false),
        privacyState = json.decodeOptional(rawObject, "privacy", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: Team) {
      val jsonEncoder = encoder.requireJsonEncoder("Team")
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
        putState("access_source", value.accessSourceState, json::encodeToJsonElement)
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

public fun team(block: Team.Builder.() -> Unit): Team = Team.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Team is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("Team property '" + name + "' is not nullable")
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
