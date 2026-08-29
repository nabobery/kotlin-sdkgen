package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * Organization Invitation
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-invitation
 */
@Serializable(with = OrganizationInvitation.Serializer::class)
public class OrganizationInvitation internal constructor(
  public val createdAt: String,
  public val email: String?,
  public val id: Long,
  public val invitationTeamsUrl: String,
  public val inviter: SimpleUser,
  public val login: String?,
  public val nodeId: String,
  public val role: String,
  public val teamCount: Int,
  private val failedAtState: FieldState<String?>,
  private val failedReasonState: FieldState<String?>,
  private val invitationSourceState: FieldState<String>,
) {
  public val failedAt: String?
    get() = failedAtState.valueOrNull()

  public val failedReason: String?
    get() = failedReasonState.valueOrNull()

  public val invitationSource: String?
    get() = invitationSourceState.valueOrNull()

  public constructor(
    createdAt: String,
    email: String?,
    id: Long,
    invitationTeamsUrl: String,
    inviter: SimpleUser,
    login: String?,
    nodeId: String,
    role: String,
    teamCount: Int,
  ) : this(createdAt = createdAt,
  email = email,
  id = id,
  invitationTeamsUrl = invitationTeamsUrl,
  inviter = inviter,
  login = login,
  nodeId = nodeId,
  role = role,
  teamCount = teamCount,
  failedAtState = FieldState.Absent,
  failedReasonState = FieldState.Absent,
  invitationSourceState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `failed_at`.
   */
  public fun failedAtPresence(): FieldPresence = failedAtState.presence

  /**
   * Returns the wire presence of `failed_reason`.
   */
  public fun failedReasonPresence(): FieldPresence = failedReasonState.presence

  /**
   * Returns the wire presence of `invitation_source`.
   */
  public fun invitationSourcePresence(): FieldPresence = invitationSourceState.presence

  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var invitationTeamsUrlValue: String? = null

    public var invitationTeamsUrl: String
      get() = requireNotNull(invitationTeamsUrlValue) { "invitationTeamsUrl is required" }
      set(`value`) {
        invitationTeamsUrlValue = value
      }

    private var inviterValue: SimpleUser? = null

    public var inviter: SimpleUser
      get() = requireNotNull(inviterValue) { "inviter is required" }
      set(`value`) {
        inviterValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var roleValue: String? = null

    public var role: String
      get() = requireNotNull(roleValue) { "role is required" }
      set(`value`) {
        roleValue = value
      }

    private var teamCountValue: Int? = null

    public var teamCount: Int
      get() = requireNotNull(teamCountValue) { "teamCount is required" }
      set(`value`) {
        teamCountValue = value
      }

    private var emailState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var email: String?
      get() = emailState.valueOrNull()
      set(`value`) {
        emailState = value.toNullableFieldState()
      }

    private var loginState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var login: String?
      get() = loginState.valueOrNull()
      set(`value`) {
        loginState = value.toNullableFieldState()
      }

    private var failedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var failedAt: String?
      get() = failedAtState.valueOrNull()
      set(`value`) {
        failedAtState = value.toNullableFieldState()
      }

    private var failedReasonState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var failedReason: String?
      get() = failedReasonState.valueOrNull()
      set(`value`) {
        failedReasonState = value.toNullableFieldState()
      }

    private var invitationSourceState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var invitationSource: String?
      get() = invitationSourceState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "invitationSource is not nullable; call unsetInvitationSource() to omit it" }
        invitationSourceState = FieldState.Value(present)
      }

    /**
     * Omits `failed_at` from serialized output.
     */
    public fun unsetFailedAt() {
      failedAtState = FieldState.Absent
    }

    /**
     * Omits `failed_reason` from serialized output.
     */
    public fun unsetFailedReason() {
      failedReasonState = FieldState.Absent
    }

    /**
     * Omits `invitation_source` from serialized output.
     */
    public fun unsetInvitationSource() {
      invitationSourceState = FieldState.Absent
    }

    public fun build(): OrganizationInvitation {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(invitationTeamsUrlValue != null) { "invitationTeamsUrl is required" }
      check(inviterValue != null) { "inviter is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(roleValue != null) { "role is required" }
      check(teamCountValue != null) { "teamCount is required" }
      check(emailState !== FieldState.Absent) { "email is required, even when null" }
      check(loginState !== FieldState.Absent) { "login is required, even when null" }
      return OrganizationInvitation(
        createdAt = createdAt,
        email = emailState.valueOrNull(),
        id = id,
        invitationTeamsUrl = invitationTeamsUrl,
        inviter = inviter,
        login = loginState.valueOrNull(),
        nodeId = nodeId,
        role = role,
        teamCount = teamCount,
        failedAtState = failedAtState,
        failedReasonState = failedReasonState,
        invitationSourceState = invitationSourceState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OrganizationInvitation = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OrganizationInvitation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OrganizationInvitation {
      val jsonDecoder = decoder.requireJsonDecoder("OrganizationInvitation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OrganizationInvitation must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val invitationTeamsUrl = json.decodeRequired<String>(rawObject, "invitation_teams_url")
      val inviter = json.decodeRequired<SimpleUser>(rawObject, "inviter")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val role = json.decodeRequired<String>(rawObject, "role")
      val teamCount = json.decodeRequired<Int>(rawObject, "team_count")
      if (!rawObject.containsKey("email")) {
        throw SerializationException("OrganizationInvitation is missing required property 'email'")
      }
      val email = rawObject["email"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("login")) {
        throw SerializationException("OrganizationInvitation is missing required property 'login'")
      }
      val login = rawObject["login"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return OrganizationInvitation(
        createdAt = createdAt,
        email = email,
        id = id,
        invitationTeamsUrl = invitationTeamsUrl,
        inviter = inviter,
        login = login,
        nodeId = nodeId,
        role = role,
        teamCount = teamCount,
        failedAtState = json.decodeOptional(rawObject, "failed_at", nullable = true),
        failedReasonState = json.decodeOptional(rawObject, "failed_reason", nullable = true),
        invitationSourceState = json.decodeOptional(rawObject, "invitation_source", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: OrganizationInvitation) {
      val jsonEncoder = encoder.requireJsonEncoder("OrganizationInvitation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("email", value.email?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", json.encodeToJsonElement(value.id))
        put("invitation_teams_url", value.invitationTeamsUrl)
        put("inviter", json.encodeToJsonElement(value.inviter))
        put("login", value.login?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("node_id", value.nodeId)
        put("role", value.role)
        put("team_count", json.encodeToJsonElement(value.teamCount))
        putState("failed_at", value.failedAtState, json::encodeToJsonElement)
        putState("failed_reason", value.failedReasonState, json::encodeToJsonElement)
        putState("invitation_source", value.invitationSourceState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun organizationInvitation(block: OrganizationInvitation.Builder.() -> Unit): OrganizationInvitation = OrganizationInvitation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OrganizationInvitation is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("OrganizationInvitation property '" + name + "' is not nullable")
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
