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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-run-completed
 */
@Serializable(with = WebhookWorkflowRunCompleted.Serializer::class)
public class WebhookWorkflowRunCompleted internal constructor(
  public val action: InlineWebhookWorkflowRunCompletedActionX14c13c2a,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val workflow: WebhooksWorkflow?,
  public val workflowRun: InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977,
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
    action: InlineWebhookWorkflowRunCompletedActionX14c13c2a,
    repository: RepositoryWebhooks,
    sender: SimpleUser,
    workflow: WebhooksWorkflow?,
    workflowRun: InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977,
  ) : this(action = action,
  repository = repository,
  sender = sender,
  workflow = workflow,
  workflowRun = workflowRun,
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
    private var actionValue: InlineWebhookWorkflowRunCompletedActionX14c13c2a? = null

    public var action: InlineWebhookWorkflowRunCompletedActionX14c13c2a
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
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

    private var workflowRunValue: InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977? = null

    public var workflowRun: InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977
      get() = requireNotNull(workflowRunValue) { "workflowRun is required" }
      set(`value`) {
        workflowRunValue = value
      }

    private var workflowState: FieldState<WebhooksWorkflow?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var workflow: WebhooksWorkflow?
      get() = workflowState.valueOrNull()
      set(`value`) {
        workflowState = value.toNullableFieldState()
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

    public fun build(): WebhookWorkflowRunCompleted {
      check(actionValue != null) { "action is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      check(workflowRunValue != null) { "workflowRun is required" }
      check(workflowState !== FieldState.Absent) { "workflow is required, even when null" }
      return WebhookWorkflowRunCompleted(
        action = action,
        repository = repository,
        sender = sender,
        workflow = workflowState.valueOrNull(),
        workflowRun = workflowRun,
        enterpriseState = enterpriseState,
        installationState = installationState,
        organizationState = organizationState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookWorkflowRunCompleted = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookWorkflowRunCompleted> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookWorkflowRunCompleted {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookWorkflowRunCompleted")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookWorkflowRunCompleted must be a JSON object")
      val action = json.decodeRequired<InlineWebhookWorkflowRunCompletedActionX14c13c2a>(rawObject, "action")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      val workflowRun = json.decodeRequired<InlineWebhookWorkflowRunCompletedWorkflowRunX8a191977>(rawObject, "workflow_run")
      if (!rawObject.containsKey("workflow")) {
        throw SerializationException("WebhookWorkflowRunCompleted is missing required property 'workflow'")
      }
      val workflow = rawObject["workflow"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<WebhooksWorkflow?>(requireNotNull(element)) }
      return WebhookWorkflowRunCompleted(
        action = action,
        repository = repository,
        sender = sender,
        workflow = workflow,
        workflowRun = workflowRun,
        enterpriseState = json.decodeOptional(rawObject, "enterprise", nullable = false),
        installationState = json.decodeOptional(rawObject, "installation", nullable = false),
        organizationState = json.decodeOptional(rawObject, "organization", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookWorkflowRunCompleted) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookWorkflowRunCompleted")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("repository", json.encodeToJsonElement(value.repository))
        put("sender", json.encodeToJsonElement(value.sender))
        put("workflow", value.workflow?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("workflow_run", json.encodeToJsonElement(value.workflowRun))
        putState("enterprise", value.enterpriseState, json::encodeToJsonElement)
        putState("installation", value.installationState, json::encodeToJsonElement)
        putState("organization", value.organizationState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookWorkflowRunCompleted(block: WebhookWorkflowRunCompleted.Builder.() -> Unit): WebhookWorkflowRunCompleted = WebhookWorkflowRunCompleted.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookWorkflowRunCompleted is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("WebhookWorkflowRunCompleted property '" + name + "' is not nullable")
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
