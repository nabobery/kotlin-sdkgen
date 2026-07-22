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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-reopened.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-code-scanning-alert-reopened
 */
@Serializable(with = WebhookCodeScanningAlertReopened.Serializer::class)
public class WebhookCodeScanningAlertReopened internal constructor(
  public val action: InlineWebhookCodeScanningAlertReopenedActionX039eef19,
  /**
   * The code scanning alert involved in the event.
   */
  public val alert: InlineWebhookCodeScanningAlertReopenedAlertXc167823e,
  /**
   * The commit SHA of the code scanning alert. When the action is `reopened_by_user` or `closed_by_user`, the event was
   * triggered by the `sender` and this value will be empty.
   */
  public val commitOid: String?,
  /**
   * The Git reference of the code scanning alert. When the action is `reopened_by_user` or `closed_by_user`, the event
   * was triggered by the `sender` and this value will be empty.
   */
  public val ref: String?,
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
    action: InlineWebhookCodeScanningAlertReopenedActionX039eef19,
    alert: InlineWebhookCodeScanningAlertReopenedAlertXc167823e,
    commitOid: String?,
    ref: String?,
    repository: RepositoryWebhooks,
    sender: SimpleUser,
  ) : this(action = action,
  alert = alert,
  commitOid = commitOid,
  ref = ref,
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
    private var actionValue: InlineWebhookCodeScanningAlertReopenedActionX039eef19? = null

    public var action: InlineWebhookCodeScanningAlertReopenedActionX039eef19
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var alertValue: InlineWebhookCodeScanningAlertReopenedAlertXc167823e? = null

    public var alert: InlineWebhookCodeScanningAlertReopenedAlertXc167823e
      get() = requireNotNull(alertValue) { "alert is required" }
      set(`value`) {
        alertValue = value
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

    private var commitOidState: FieldState<String?> = FieldState.Absent

    /**
     * The commit SHA of the code scanning alert. When the action is `reopened_by_user` or `closed_by_user`, the event
     * was triggered by the `sender` and this value will be empty.
     * Required nullable field; assigning `null` records present-null.
     */
    public var commitOid: String?
      get() = commitOidState.valueOrNull()
      set(`value`) {
        commitOidState = value.toNullableFieldState()
      }

    private var refState: FieldState<String?> = FieldState.Absent

    /**
     * The Git reference of the code scanning alert. When the action is `reopened_by_user` or `closed_by_user`, the
     * event was triggered by the `sender` and this value will be empty.
     * Required nullable field; assigning `null` records present-null.
     */
    public var ref: String?
      get() = refState.valueOrNull()
      set(`value`) {
        refState = value.toNullableFieldState()
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

    public fun build(): WebhookCodeScanningAlertReopened {
      check(actionValue != null) { "action is required" }
      check(alertValue != null) { "alert is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      check(commitOidState !== FieldState.Absent) { "commitOid is required, even when null" }
      check(refState !== FieldState.Absent) { "ref is required, even when null" }
      return WebhookCodeScanningAlertReopened(
        action = action,
        alert = alert,
        commitOid = commitOidState.valueOrNull(),
        ref = refState.valueOrNull(),
        repository = repository,
        sender = sender,
        enterpriseState = enterpriseState,
        installationState = installationState,
        organizationState = organizationState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookCodeScanningAlertReopened = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookCodeScanningAlertReopened> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookCodeScanningAlertReopened {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookCodeScanningAlertReopened")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookCodeScanningAlertReopened must be a JSON object")
      val action = json.decodeRequired<InlineWebhookCodeScanningAlertReopenedActionX039eef19>(rawObject, "action")
      val alert = json.decodeRequired<InlineWebhookCodeScanningAlertReopenedAlertXc167823e>(rawObject, "alert")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      if (!rawObject.containsKey("commit_oid")) {
        throw SerializationException("WebhookCodeScanningAlertReopened is missing required property 'commit_oid'")
      }
      val commitOid = rawObject["commit_oid"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("ref")) {
        throw SerializationException("WebhookCodeScanningAlertReopened is missing required property 'ref'")
      }
      val ref = rawObject["ref"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return WebhookCodeScanningAlertReopened(
        action = action,
        alert = alert,
        commitOid = commitOid,
        ref = ref,
        repository = repository,
        sender = sender,
        enterpriseState = json.decodeOptional(rawObject, "enterprise", nullable = false),
        installationState = json.decodeOptional(rawObject, "installation", nullable = false),
        organizationState = json.decodeOptional(rawObject, "organization", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookCodeScanningAlertReopened) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookCodeScanningAlertReopened")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("alert", json.encodeToJsonElement(value.alert))
        put("commit_oid", value.commitOid?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("ref", value.ref?.let { json.encodeToJsonElement(it) } ?: JsonNull)
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

public fun webhookCodeScanningAlertReopened(block: WebhookCodeScanningAlertReopened.Builder.() -> Unit): WebhookCodeScanningAlertReopened = WebhookCodeScanningAlertReopened.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookCodeScanningAlertReopened is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("WebhookCodeScanningAlertReopened property '" + name + "' is not nullable")
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
