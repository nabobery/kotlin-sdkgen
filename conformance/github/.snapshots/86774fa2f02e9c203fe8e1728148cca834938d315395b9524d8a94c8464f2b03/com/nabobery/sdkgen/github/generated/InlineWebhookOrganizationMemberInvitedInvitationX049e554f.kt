package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Double
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
 * The invitation for the user or email if the action is `member_invited`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-member-invited/properties/invitation
 */
@Serializable(with = InlineWebhookOrganizationMemberInvitedInvitationX049e554f.Serializer::class)
public class InlineWebhookOrganizationMemberInvitedInvitationX049e554f internal constructor(
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val email: String?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val failedAt: String?,
  public val failedReason: String?,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val id: Double,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val invitationTeamsUrl: String,
  public val inviter: InlineWebhookOrganizationMemberInvitedInvitationInviterX5efa1782?,
  public val login: String?,
  public val nodeId: String,
  public val role: String,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val teamCount: Double,
  private val invitationSourceState: FieldState<String>,
) {
  public val invitationSource: String?
    get() = invitationSourceState.valueOrNull()

  public constructor(
    createdAt: String,
    email: String?,
    failedAt: String?,
    failedReason: String?,
    id: Double,
    invitationTeamsUrl: String,
    inviter: InlineWebhookOrganizationMemberInvitedInvitationInviterX5efa1782?,
    login: String?,
    nodeId: String,
    role: String,
    teamCount: Double,
  ) : this(createdAt = createdAt,
  email = email,
  failedAt = failedAt,
  failedReason = failedReason,
  id = id,
  invitationTeamsUrl = invitationTeamsUrl,
  inviter = inviter,
  login = login,
  nodeId = nodeId,
  role = role,
  teamCount = teamCount,
  invitationSourceState = FieldState.Absent,
  )

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

    private var idValue: Double? = null

    public var id: Double
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

    private var teamCountValue: Double? = null

    public var teamCount: Double
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

    private var failedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var failedAt: String?
      get() = failedAtState.valueOrNull()
      set(`value`) {
        failedAtState = value.toNullableFieldState()
      }

    private var failedReasonState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var failedReason: String?
      get() = failedReasonState.valueOrNull()
      set(`value`) {
        failedReasonState = value.toNullableFieldState()
      }

    private var inviterState:
        FieldState<InlineWebhookOrganizationMemberInvitedInvitationInviterX5efa1782?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var inviter: InlineWebhookOrganizationMemberInvitedInvitationInviterX5efa1782?
      get() = inviterState.valueOrNull()
      set(`value`) {
        inviterState = value.toNullableFieldState()
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
     * Omits `invitation_source` from serialized output.
     */
    public fun unsetInvitationSource() {
      invitationSourceState = FieldState.Absent
    }

    public fun build(): InlineWebhookOrganizationMemberInvitedInvitationX049e554f {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(invitationTeamsUrlValue != null) { "invitationTeamsUrl is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(roleValue != null) { "role is required" }
      check(teamCountValue != null) { "teamCount is required" }
      check(emailState !== FieldState.Absent) { "email is required, even when null" }
      check(failedAtState !== FieldState.Absent) { "failedAt is required, even when null" }
      check(failedReasonState !== FieldState.Absent) { "failedReason is required, even when null" }
      check(inviterState !== FieldState.Absent) { "inviter is required, even when null" }
      check(loginState !== FieldState.Absent) { "login is required, even when null" }
      return InlineWebhookOrganizationMemberInvitedInvitationX049e554f(
        createdAt = createdAt,
        email = emailState.valueOrNull(),
        failedAt = failedAtState.valueOrNull(),
        failedReason = failedReasonState.valueOrNull(),
        id = id,
        invitationTeamsUrl = invitationTeamsUrl,
        inviter = inviterState.valueOrNull(),
        login = loginState.valueOrNull(),
        nodeId = nodeId,
        role = role,
        teamCount = teamCount,
        invitationSourceState = invitationSourceState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookOrganizationMemberInvitedInvitationX049e554f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookOrganizationMemberInvitedInvitationX049e554f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookOrganizationMemberInvitedInvitationX049e554f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookOrganizationMemberInvitedInvitationX049e554f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookOrganizationMemberInvitedInvitationX049e554f must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<Double>(rawObject, "id")
      val invitationTeamsUrl = json.decodeRequired<String>(rawObject, "invitation_teams_url")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val role = json.decodeRequired<String>(rawObject, "role")
      val teamCount = json.decodeRequired<Double>(rawObject, "team_count")
      if (!rawObject.containsKey("email")) {
        throw SerializationException("InlineWebhookOrganizationMemberInvitedInvitationX049e554f is missing required property 'email'")
      }
      val email = rawObject["email"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("failed_at")) {
        throw SerializationException("InlineWebhookOrganizationMemberInvitedInvitationX049e554f is missing required property 'failed_at'")
      }
      val failedAt = rawObject["failed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("failed_reason")) {
        throw SerializationException("InlineWebhookOrganizationMemberInvitedInvitationX049e554f is missing required property 'failed_reason'")
      }
      val failedReason = rawObject["failed_reason"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("inviter")) {
        throw SerializationException("InlineWebhookOrganizationMemberInvitedInvitationX049e554f is missing required property 'inviter'")
      }
      val inviter = rawObject["inviter"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookOrganizationMemberInvitedInvitationInviterX5efa1782?>(requireNotNull(element)) }
      if (!rawObject.containsKey("login")) {
        throw SerializationException("InlineWebhookOrganizationMemberInvitedInvitationX049e554f is missing required property 'login'")
      }
      val login = rawObject["login"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookOrganizationMemberInvitedInvitationX049e554f(
        createdAt = createdAt,
        email = email,
        failedAt = failedAt,
        failedReason = failedReason,
        id = id,
        invitationTeamsUrl = invitationTeamsUrl,
        inviter = inviter,
        login = login,
        nodeId = nodeId,
        role = role,
        teamCount = teamCount,
        invitationSourceState = json.decodeOptional(rawObject, "invitation_source", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookOrganizationMemberInvitedInvitationX049e554f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookOrganizationMemberInvitedInvitationX049e554f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("email", value.email?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("failed_at", value.failedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("failed_reason", value.failedReason?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", json.encodeToJsonElement(value.id))
        put("invitation_teams_url", value.invitationTeamsUrl)
        put("inviter", value.inviter?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("login", value.login?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("node_id", value.nodeId)
        put("role", value.role)
        put("team_count", json.encodeToJsonElement(value.teamCount))
        putState("invitation_source", value.invitationSourceState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookOrganizationMemberInvitedInvitationX049e554f(block: InlineWebhookOrganizationMemberInvitedInvitationX049e554f.Builder.() -> Unit): InlineWebhookOrganizationMemberInvitedInvitationX049e554f = InlineWebhookOrganizationMemberInvitedInvitationX049e554f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookOrganizationMemberInvitedInvitationX049e554f is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookOrganizationMemberInvitedInvitationX049e554f property '" + name + "' is not nullable")
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
