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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-membership-removed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-membership-removed
 */
@Serializable(with = WebhookMembershipRemoved.Serializer::class)
public class WebhookMembershipRemoved internal constructor(
  public val action: InlineWebhookMembershipRemovedActionX2b45197e,
  public val member: WebhooksUser?,
  public val organization: OrganizationSimpleWebhooks,
  /**
   * The scope of the membership. Currently, can only be `team`.
   */
  public val scope: InlineWebhookMembershipRemovedScopeX017844ba,
  public val sender: InlineWebhookMembershipRemovedSenderX824de08e?,
  public val team: WebhooksTeam,
  private val enterpriseState: FieldState<EnterpriseWebhooks>,
  private val installationState: FieldState<SimpleInstallation>,
  private val repositoryState: FieldState<RepositoryWebhooks>,
) {
  public val enterprise: EnterpriseWebhooks?
    get() = enterpriseState.valueOrNull()

  public val installation: SimpleInstallation?
    get() = installationState.valueOrNull()

  public val repository: RepositoryWebhooks?
    get() = repositoryState.valueOrNull()

  public constructor(
    action: InlineWebhookMembershipRemovedActionX2b45197e,
    member: WebhooksUser?,
    organization: OrganizationSimpleWebhooks,
    scope: InlineWebhookMembershipRemovedScopeX017844ba,
    sender: InlineWebhookMembershipRemovedSenderX824de08e?,
    team: WebhooksTeam,
  ) : this(action = action,
  member = member,
  organization = organization,
  scope = scope,
  sender = sender,
  team = team,
  enterpriseState = FieldState.Absent,
  installationState = FieldState.Absent,
  repositoryState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `enterprise`.
   */
  public fun enterprisePresence(): FieldPresence = enterpriseState.presence

  /**
   * Returns the wire presence of `installation`.
   */
  public fun installationPresence(): FieldPresence = installationState.presence

  /**
   * Returns the wire presence of `repository`.
   */
  public fun repositoryPresence(): FieldPresence = repositoryState.presence

  public class Builder {
    private var actionValue: InlineWebhookMembershipRemovedActionX2b45197e? = null

    public var action: InlineWebhookMembershipRemovedActionX2b45197e
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var organizationValue: OrganizationSimpleWebhooks? = null

    public var organization: OrganizationSimpleWebhooks
      get() = requireNotNull(organizationValue) { "organization is required" }
      set(`value`) {
        organizationValue = value
      }

    private var scopeValue: InlineWebhookMembershipRemovedScopeX017844ba? = null

    public var scope: InlineWebhookMembershipRemovedScopeX017844ba
      get() = requireNotNull(scopeValue) { "scope is required" }
      set(`value`) {
        scopeValue = value
      }

    private var teamValue: WebhooksTeam? = null

    public var team: WebhooksTeam
      get() = requireNotNull(teamValue) { "team is required" }
      set(`value`) {
        teamValue = value
      }

    private var memberState: FieldState<WebhooksUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var member: WebhooksUser?
      get() = memberState.valueOrNull()
      set(`value`) {
        memberState = value.toNullableFieldState()
      }

    private var senderState: FieldState<InlineWebhookMembershipRemovedSenderX824de08e?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var sender: InlineWebhookMembershipRemovedSenderX824de08e?
      get() = senderState.valueOrNull()
      set(`value`) {
        senderState = value.toNullableFieldState()
      }

    private var enterpriseState: FieldState<EnterpriseWebhooks> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var enterprise: EnterpriseWebhooks?
      get() = enterpriseState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "enterprise is not nullable; call unsetEnterprise() to omit it" }
        enterpriseState = FieldState.Value(present)
      }

    private var installationState: FieldState<SimpleInstallation> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var installation: SimpleInstallation?
      get() = installationState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "installation is not nullable; call unsetInstallation() to omit it" }
        installationState = FieldState.Value(present)
      }

    private var repositoryState: FieldState<RepositoryWebhooks> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var repository: RepositoryWebhooks?
      get() = repositoryState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "repository is not nullable; call unsetRepository() to omit it" }
        repositoryState = FieldState.Value(present)
      }

    /**
     * Omits `enterprise` from serialized output.
     */
    public fun unsetEnterprise() {
      enterpriseState = FieldState.Absent
    }

    /**
     * Omits `installation` from serialized output.
     */
    public fun unsetInstallation() {
      installationState = FieldState.Absent
    }

    /**
     * Omits `repository` from serialized output.
     */
    public fun unsetRepository() {
      repositoryState = FieldState.Absent
    }

    public fun build(): WebhookMembershipRemoved {
      check(actionValue != null) { "action is required" }
      check(organizationValue != null) { "organization is required" }
      check(scopeValue != null) { "scope is required" }
      check(teamValue != null) { "team is required" }
      check(memberState !== FieldState.Absent) { "member is required, even when null" }
      check(senderState !== FieldState.Absent) { "sender is required, even when null" }
      return WebhookMembershipRemoved(
        action = action,
        member = memberState.valueOrNull(),
        organization = organization,
        scope = scope,
        sender = senderState.valueOrNull(),
        team = team,
        enterpriseState = enterpriseState,
        installationState = installationState,
        repositoryState = repositoryState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookMembershipRemoved = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookMembershipRemoved> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookMembershipRemoved {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookMembershipRemoved")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookMembershipRemoved must be a JSON object")
      val action = json.decodeRequired<InlineWebhookMembershipRemovedActionX2b45197e>(rawObject, "action")
      val organization = json.decodeRequired<OrganizationSimpleWebhooks>(rawObject, "organization")
      val scope = json.decodeRequired<InlineWebhookMembershipRemovedScopeX017844ba>(rawObject, "scope")
      val team = json.decodeRequired<WebhooksTeam>(rawObject, "team")
      if (!rawObject.containsKey("member")) {
        throw SerializationException("WebhookMembershipRemoved is missing required property 'member'")
      }
      val member = rawObject["member"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<WebhooksUser?>(requireNotNull(element)) }
      if (!rawObject.containsKey("sender")) {
        throw SerializationException("WebhookMembershipRemoved is missing required property 'sender'")
      }
      val sender = rawObject["sender"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookMembershipRemovedSenderX824de08e?>(requireNotNull(element)) }
      return WebhookMembershipRemoved(
        action = action,
        member = member,
        organization = organization,
        scope = scope,
        sender = sender,
        team = team,
        enterpriseState = json.decodeOptional(rawObject, "enterprise", nullable = false),
        installationState = json.decodeOptional(rawObject, "installation", nullable = false),
        repositoryState = json.decodeOptional(rawObject, "repository", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookMembershipRemoved) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookMembershipRemoved")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("member", value.member?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("organization", json.encodeToJsonElement(value.organization))
        put("scope", json.encodeToJsonElement(value.scope))
        put("sender", value.sender?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("team", json.encodeToJsonElement(value.team))
        putState("enterprise", value.enterpriseState, json::encodeToJsonElement)
        putState("installation", value.installationState, json::encodeToJsonElement)
        putState("repository", value.repositoryState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookMembershipRemoved(block: WebhookMembershipRemoved.Builder.() -> Unit): WebhookMembershipRemoved = WebhookMembershipRemoved.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookMembershipRemoved is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("WebhookMembershipRemoved property '" + name + "' is not nullable")
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
