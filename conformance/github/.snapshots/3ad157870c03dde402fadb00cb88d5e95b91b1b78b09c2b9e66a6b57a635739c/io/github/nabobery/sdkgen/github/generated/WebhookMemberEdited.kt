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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-member-edited.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-member-edited
 */
@Serializable(with = WebhookMemberEdited.Serializer::class)
public class WebhookMemberEdited internal constructor(
  public val action: InlineWebhookMemberEditedActionX7d5ee843,
  /**
   * The changes to the collaborator permissions
   */
  public val changes: InlineWebhookMemberEditedChangesXcd5a2093,
  public val member: WebhooksUser?,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  private val enterpriseState: FieldState<EnterpriseWebhooks>,
  private val installationState: FieldState<SimpleInstallation>,
  private val organizationState: FieldState<OrganizationSimpleWebhooks>,
) {
  public val enterprise: EnterpriseWebhooks?
    get() = enterpriseState.valueOrNull()

  public val installation: SimpleInstallation?
    get() = installationState.valueOrNull()

  public val organization: OrganizationSimpleWebhooks?
    get() = organizationState.valueOrNull()

  public constructor(
    action: InlineWebhookMemberEditedActionX7d5ee843,
    changes: InlineWebhookMemberEditedChangesXcd5a2093,
    member: WebhooksUser?,
    repository: RepositoryWebhooks,
    sender: SimpleUser,
  ) : this(action = action,
  changes = changes,
  member = member,
  repository = repository,
  sender = sender,
  enterpriseState = FieldState.Absent,
  installationState = FieldState.Absent,
  organizationState = FieldState.Absent,
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
   * Returns the wire presence of `organization`.
   */
  public fun organizationPresence(): FieldPresence = organizationState.presence

  public class Builder {
    private var actionValue: InlineWebhookMemberEditedActionX7d5ee843? = null

    public var action: InlineWebhookMemberEditedActionX7d5ee843
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var changesValue: InlineWebhookMemberEditedChangesXcd5a2093? = null

    public var changes: InlineWebhookMemberEditedChangesXcd5a2093
      get() = requireNotNull(changesValue) { "changes is required" }
      set(`value`) {
        changesValue = value
      }

    private var repositoryValue: RepositoryWebhooks? = null

    public var repository: RepositoryWebhooks
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    private var senderValue: SimpleUser? = null

    public var sender: SimpleUser
      get() = requireNotNull(senderValue) { "sender is required" }
      set(`value`) {
        senderValue = value
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

    private var organizationState: FieldState<OrganizationSimpleWebhooks> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var organization: OrganizationSimpleWebhooks?
      get() = organizationState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "organization is not nullable; call unsetOrganization() to omit it" }
        organizationState = FieldState.Value(present)
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
     * Omits `organization` from serialized output.
     */
    public fun unsetOrganization() {
      organizationState = FieldState.Absent
    }

    public fun build(): WebhookMemberEdited {
      check(actionValue != null) { "action is required" }
      check(changesValue != null) { "changes is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      check(memberState !== FieldState.Absent) { "member is required, even when null" }
      return WebhookMemberEdited(
        action = action,
        changes = changes,
        member = memberState.valueOrNull(),
        repository = repository,
        sender = sender,
        enterpriseState = enterpriseState,
        installationState = installationState,
        organizationState = organizationState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookMemberEdited = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookMemberEdited> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookMemberEdited {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookMemberEdited")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookMemberEdited must be a JSON object")
      val action = json.decodeRequired<InlineWebhookMemberEditedActionX7d5ee843>(rawObject, "action")
      val changes = json.decodeRequired<InlineWebhookMemberEditedChangesXcd5a2093>(rawObject, "changes")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      if (!rawObject.containsKey("member")) {
        throw SerializationException("WebhookMemberEdited is missing required property 'member'")
      }
      val member = rawObject["member"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<WebhooksUser?>(requireNotNull(element)) }
      return WebhookMemberEdited(
        action = action,
        changes = changes,
        member = member,
        repository = repository,
        sender = sender,
        enterpriseState = json.decodeOptional(rawObject, "enterprise", nullable = false),
        installationState = json.decodeOptional(rawObject, "installation", nullable = false),
        organizationState = json.decodeOptional(rawObject, "organization", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookMemberEdited) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookMemberEdited")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("changes", json.encodeToJsonElement(value.changes))
        put("member", value.member?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("repository", json.encodeToJsonElement(value.repository))
        put("sender", json.encodeToJsonElement(value.sender))
        putState("enterprise", value.enterpriseState, json::encodeToJsonElement)
        putState("installation", value.installationState, json::encodeToJsonElement)
        putState("organization", value.organizationState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookMemberEdited(block: WebhookMemberEdited.Builder.() -> Unit): WebhookMemberEdited = WebhookMemberEdited.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookMemberEdited is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("WebhookMemberEdited property '" + name + "' is not nullable")
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
