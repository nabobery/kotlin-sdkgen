package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Org Membership
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/org-membership
 */
@Serializable(with = OrgMembership.Serializer::class)
public class OrgMembership internal constructor(
  public val organization: OrganizationSimple,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val organizationUrl: String,
  /**
   * The user's membership type in the organization.
   */
  public val role: InlineOrgMembershipRoleXb8da7817,
  /**
   * The state of the member in the organization. The `pending` state indicates the user has not yet accepted an
   * invitation.
   */
  public val state: InlineOrgMembershipStateX7391b940,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val user: NullableSimpleUser?,
  private val directMembershipState: FieldState<Boolean>,
  enterpriseTeamsProvidingIndirectMembershipState: FieldState<List<String>>,
  private val permissionsState: FieldState<InlineOrgMembershipPermissionsXb96bf417>,
) {
  private val enterpriseTeamsProvidingIndirectMembershipState: FieldState<List<String>> =
      enterpriseTeamsProvidingIndirectMembershipState.copyValue { fieldValue -> fieldValue.toList() }

  /**
   * Whether the user has direct membership in the organization.
   */
  public val directMembership: Boolean?
    get() = directMembershipState.valueOrNull()

  /**
   * The slugs of the enterprise teams providing the user with indirect membership in the organization.
   * A limit of 100 enterprise team slugs is returned.
   */
  public val enterpriseTeamsProvidingIndirectMembership: List<String>?
    get() = enterpriseTeamsProvidingIndirectMembershipState.valueOrNull()

  public val permissions: InlineOrgMembershipPermissionsXb96bf417?
    get() = permissionsState.valueOrNull()

  public constructor(
    organization: OrganizationSimple,
    organizationUrl: String,
    role: InlineOrgMembershipRoleXb8da7817,
    state: InlineOrgMembershipStateX7391b940,
    url: String,
    user: NullableSimpleUser?,
  ) : this(organization = organization,
  organizationUrl = organizationUrl,
  role = role,
  state = state,
  url = url,
  user = user,
  directMembershipState = FieldState.Absent,
  enterpriseTeamsProvidingIndirectMembershipState = FieldState.Absent,
  permissionsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `direct_membership`.
   */
  public fun directMembershipPresence(): FieldPresence = directMembershipState.presence

  /**
   * Returns the wire presence of `enterprise_teams_providing_indirect_membership`.
   */
  public fun enterpriseTeamsProvidingIndirectMembershipPresence(): FieldPresence = enterpriseTeamsProvidingIndirectMembershipState.presence

  /**
   * Returns the wire presence of `permissions`.
   */
  public fun permissionsPresence(): FieldPresence = permissionsState.presence

  public class Builder {
    private var organizationValue: OrganizationSimple? = null

    public var organization: OrganizationSimple
      get() = requireNotNull(organizationValue) { "organization is required" }
      set(`value`) {
        organizationValue = value
      }

    private var organizationUrlValue: String? = null

    public var organizationUrl: String
      get() = requireNotNull(organizationUrlValue) { "organizationUrl is required" }
      set(`value`) {
        organizationUrlValue = value
      }

    private var roleValue: InlineOrgMembershipRoleXb8da7817? = null

    public var role: InlineOrgMembershipRoleXb8da7817
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    private var stateValue: InlineOrgMembershipStateX7391b940? = null

    public var state: InlineOrgMembershipStateX7391b940
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var userState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: NullableSimpleUser?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    private var directMembershipState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether the user has direct membership in the organization.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var directMembership: Boolean?
      get() = directMembershipState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "directMembership is not nullable; call unsetDirectMembership() to omit it" }
        directMembershipState = FieldState.Value(present)
      }

    private var enterpriseTeamsProvidingIndirectMembershipState: FieldState<List<String>> =
        FieldState.Absent

    /**
     * The slugs of the enterprise teams providing the user with indirect membership in the organization.
     * A limit of 100 enterprise team slugs is returned.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var enterpriseTeamsProvidingIndirectMembership: List<String>?
      get() = enterpriseTeamsProvidingIndirectMembershipState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "enterpriseTeamsProvidingIndirectMembership is not nullable; call unsetEnterpriseTeamsProvidingIndirectMembership() to omit it" }
        enterpriseTeamsProvidingIndirectMembershipState = FieldState.Value(present.toList())
      }

    private var permissionsState: FieldState<InlineOrgMembershipPermissionsXb96bf417> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var permissions: InlineOrgMembershipPermissionsXb96bf417?
      get() = permissionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "permissions is not nullable; call unsetPermissions() to omit it" }
        permissionsState = FieldState.Value(present)
      }

    /**
     * Omits `direct_membership` from serialized output.
     */
    public fun unsetDirectMembership() {
      directMembershipState = FieldState.Absent
    }

    /**
     * Omits `enterprise_teams_providing_indirect_membership` from serialized output.
     */
    public fun unsetEnterpriseTeamsProvidingIndirectMembership() {
      enterpriseTeamsProvidingIndirectMembershipState = FieldState.Absent
    }

    /**
     * Omits `permissions` from serialized output.
     */
    public fun unsetPermissions() {
      permissionsState = FieldState.Absent
    }

    public fun build(): OrgMembership {
      check(organizationValue != null) { "organization is required" }
      check(organizationUrlValue != null) { "organizationUrl is required" }
      check(roleValue != null) { "role is required" }
      check(stateValue != null) { "state is required" }
      check(urlValue != null) { "url is required" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return OrgMembership(
        organization = organization,
        organizationUrl = organizationUrl,
        role = role,
        state = state,
        url = url,
        user = userState.valueOrNull(),
        directMembershipState = directMembershipState,
        enterpriseTeamsProvidingIndirectMembershipState = enterpriseTeamsProvidingIndirectMembershipState,
        permissionsState = permissionsState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OrgMembership = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OrgMembership> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OrgMembership {
      val jsonDecoder = decoder.requireJsonDecoder("OrgMembership")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OrgMembership must be a JSON object")
      val organization = json.decodeRequired<OrganizationSimple>(rawObject, "organization")
      val organizationUrl = json.decodeRequired<String>(rawObject, "organization_url")
      val role = json.decodeRequired<InlineOrgMembershipRoleXb8da7817>(rawObject, "role")
      val state = json.decodeRequired<InlineOrgMembershipStateX7391b940>(rawObject, "state")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("user")) {
        throw SerializationException("OrgMembership is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      return OrgMembership(
        organization = organization,
        organizationUrl = organizationUrl,
        role = role,
        state = state,
        url = url,
        user = user,
        directMembershipState = json.decodeOptional(rawObject, "direct_membership", nullable = false),
        enterpriseTeamsProvidingIndirectMembershipState = json.decodeOptional(rawObject, "enterprise_teams_providing_indirect_membership", nullable = false),
        permissionsState = json.decodeOptional(rawObject, "permissions", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: OrgMembership) {
      val jsonEncoder = encoder.requireJsonEncoder("OrgMembership")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("organization", json.encodeToJsonElement(value.organization))
        put("organization_url", value.organizationUrl)
        put("role", json.encodeToJsonElement(value.role))
        put("state", json.encodeToJsonElement(value.state))
        put("url", value.url)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("direct_membership", value.directMembershipState, json::encodeToJsonElement)
        putState("enterprise_teams_providing_indirect_membership", value.enterpriseTeamsProvidingIndirectMembershipState, json::encodeToJsonElement)
        putState("permissions", value.permissionsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun orgMembership(block: OrgMembership.Builder.() -> Unit): OrgMembership = OrgMembership.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OrgMembership is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("OrgMembership property '" + name + "' is not nullable")
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
