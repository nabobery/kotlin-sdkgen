package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-org-block-unblocked.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-org-block-unblocked
 */
@Serializable(with = WebhookOrgBlockUnblocked.Serializer::class)
public class WebhookOrgBlockUnblocked internal constructor(
  public val action: InlineWebhookOrgBlockUnblockedActionX1e785489,
  public val blockedUser: WebhooksUser?,
  public val organization: OrganizationSimpleWebhooks,
  public val sender: SimpleUser,
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
    action: InlineWebhookOrgBlockUnblockedActionX1e785489,
    blockedUser: WebhooksUser?,
    organization: OrganizationSimpleWebhooks,
    sender: SimpleUser,
  ) : this(action = action,
  blockedUser = blockedUser,
  organization = organization,
  sender = sender,
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
    private var actionValue: InlineWebhookOrgBlockUnblockedActionX1e785489? = null

    public var action: InlineWebhookOrgBlockUnblockedActionX1e785489
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

    private var senderValue: SimpleUser? = null

    public var sender: SimpleUser
      get() = requireNotNull(senderValue) { "sender is required" }
      set(`value`) {
        senderValue = value
      }

    private var blockedUserState: FieldState<WebhooksUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var blockedUser: WebhooksUser?
      get() = blockedUserState.valueOrNull()
      set(`value`) {
        blockedUserState = value.toNullableFieldState()
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

    public fun build(): WebhookOrgBlockUnblocked {
      check(actionValue != null) { "action is required" }
      check(organizationValue != null) { "organization is required" }
      check(senderValue != null) { "sender is required" }
      check(blockedUserState !== FieldState.Absent) { "blockedUser is required, even when null" }
      return WebhookOrgBlockUnblocked(
        action = action,
        blockedUser = blockedUserState.valueOrNull(),
        organization = organization,
        sender = sender,
        enterpriseState = enterpriseState,
        installationState = installationState,
        repositoryState = repositoryState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookOrgBlockUnblocked = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookOrgBlockUnblocked> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookOrgBlockUnblocked {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookOrgBlockUnblocked")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookOrgBlockUnblocked must be a JSON object")
      val action = json.decodeRequired<InlineWebhookOrgBlockUnblockedActionX1e785489>(rawObject, "action")
      val organization = json.decodeRequired<OrganizationSimpleWebhooks>(rawObject, "organization")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      if (!rawObject.containsKey("blocked_user")) {
        throw SerializationException("WebhookOrgBlockUnblocked is missing required property 'blocked_user'")
      }
      val blockedUser = rawObject["blocked_user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<WebhooksUser?>(requireNotNull(element)) }
      return WebhookOrgBlockUnblocked(
        action = action,
        blockedUser = blockedUser,
        organization = organization,
        sender = sender,
        enterpriseState = json.decodeOptional(rawObject, "enterprise", nullable = false),
        installationState = json.decodeOptional(rawObject, "installation", nullable = false),
        repositoryState = json.decodeOptional(rawObject, "repository", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookOrgBlockUnblocked) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookOrgBlockUnblocked")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("blocked_user", value.blockedUser?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("organization", json.encodeToJsonElement(value.organization))
        put("sender", json.encodeToJsonElement(value.sender))
        putState("enterprise", value.enterpriseState, json::encodeToJsonElement)
        putState("installation", value.installationState, json::encodeToJsonElement)
        putState("repository", value.repositoryState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookOrgBlockUnblocked(block: WebhookOrgBlockUnblocked.Builder.() -> Unit): WebhookOrgBlockUnblocked = WebhookOrgBlockUnblocked.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookOrgBlockUnblocked is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("WebhookOrgBlockUnblocked property '" + name + "' is not nullable")
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
