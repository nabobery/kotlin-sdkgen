package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-approved.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-approved
 */
@Serializable(with = WebhookDeploymentReviewApproved.Serializer::class)
public class WebhookDeploymentReviewApproved internal constructor(
  public val action: InlineWebhookDeploymentReviewApprovedActionX3b46e2ba,
  public val organization: OrganizationSimpleWebhooks,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val since: String,
  public val workflowRun: InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15?,
  private val approverState: FieldState<WebhooksApprover>,
  private val commentState: FieldState<String>,
  private val enterpriseState: FieldState<EnterpriseWebhooks>,
  private val installationState: FieldState<SimpleInstallation>,
  reviewersState: FieldState<List<InlineWebhooksReviewersItemX7689c76b>>,
  private val workflowJobRunState: FieldState<WebhooksWorkflowJobRun>,
  workflowJobRunsState: FieldState<List<InlineWebhookDeploymentReviewApprovedWorkflowJobRunsItemX54308b1f>>,
) {
  private val reviewersState: FieldState<List<InlineWebhooksReviewersItemX7689c76b>> =
      reviewersState.copyValue { fieldValue -> fieldValue.toList() }

  private val workflowJobRunsState:
      FieldState<List<InlineWebhookDeploymentReviewApprovedWorkflowJobRunsItemX54308b1f>> =
      workflowJobRunsState.copyValue { fieldValue -> fieldValue.toList() }

  public val approver: WebhooksApprover?
    get() = approverState.valueOrNull()

  public val comment: String?
    get() = commentState.valueOrNull()

  public val enterprise: EnterpriseWebhooks?
    get() = enterpriseState.valueOrNull()

  public val installation: SimpleInstallation?
    get() = installationState.valueOrNull()

  public val reviewers: List<InlineWebhooksReviewersItemX7689c76b>?
    get() = reviewersState.valueOrNull()

  public val workflowJobRun: WebhooksWorkflowJobRun?
    get() = workflowJobRunState.valueOrNull()

  public val workflowJobRuns:
      List<InlineWebhookDeploymentReviewApprovedWorkflowJobRunsItemX54308b1f>?
    get() = workflowJobRunsState.valueOrNull()

  public constructor(
    action: InlineWebhookDeploymentReviewApprovedActionX3b46e2ba,
    organization: OrganizationSimpleWebhooks,
    repository: RepositoryWebhooks,
    sender: SimpleUser,
    since: String,
    workflowRun: InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15?,
  ) : this(action = action,
  organization = organization,
  repository = repository,
  sender = sender,
  since = since,
  workflowRun = workflowRun,
  approverState = FieldState.Absent,
  commentState = FieldState.Absent,
  enterpriseState = FieldState.Absent,
  installationState = FieldState.Absent,
  reviewersState = FieldState.Absent,
  workflowJobRunState = FieldState.Absent,
  workflowJobRunsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `approver`.
   */
  public fun approverPresence(): FieldPresence = approverState.presence

  /**
   * Returns the wire presence of `comment`.
   */
  public fun commentPresence(): FieldPresence = commentState.presence

  /**
   * Returns the wire presence of `enterprise`.
   */
  public fun enterprisePresence(): FieldPresence = enterpriseState.presence

  /**
   * Returns the wire presence of `installation`.
   */
  public fun installationPresence(): FieldPresence = installationState.presence

  /**
   * Returns the wire presence of `reviewers`.
   */
  public fun reviewersPresence(): FieldPresence = reviewersState.presence

  /**
   * Returns the wire presence of `workflow_job_run`.
   */
  public fun workflowJobRunPresence(): FieldPresence = workflowJobRunState.presence

  /**
   * Returns the wire presence of `workflow_job_runs`.
   */
  public fun workflowJobRunsPresence(): FieldPresence = workflowJobRunsState.presence

  public class Builder {
    private var actionValue: InlineWebhookDeploymentReviewApprovedActionX3b46e2ba? = null

    public var action: InlineWebhookDeploymentReviewApprovedActionX3b46e2ba
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

    private var sinceValue: String? = null

    public var since: String
      get() = requireNotNull(sinceValue) { "since is required" }
      set(`value`) {
        sinceValue = value
      }

    private var workflowRunState:
        FieldState<InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var workflowRun: InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15?
      get() = workflowRunState.valueOrNull()
      set(`value`) {
        workflowRunState = value.toNullableFieldState()
      }

    private var approverState: FieldState<WebhooksApprover> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var approver: WebhooksApprover?
      get() = approverState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "approver is not nullable; call unsetApprover() to omit it" }
        approverState = FieldState.Value(present)
      }

    private var commentState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var comment: String?
      get() = commentState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "comment is not nullable; call unsetComment() to omit it" }
        commentState = FieldState.Value(present)
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

    private var reviewersState: FieldState<List<InlineWebhooksReviewersItemX7689c76b>> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var reviewers: List<InlineWebhooksReviewersItemX7689c76b>?
      get() = reviewersState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "reviewers is not nullable; call unsetReviewers() to omit it" }
        reviewersState = FieldState.Value(present.toList())
      }

    private var workflowJobRunState: FieldState<WebhooksWorkflowJobRun> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var workflowJobRun: WebhooksWorkflowJobRun?
      get() = workflowJobRunState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "workflowJobRun is not nullable; call unsetWorkflowJobRun() to omit it" }
        workflowJobRunState = FieldState.Value(present)
      }

    private var workflowJobRunsState:
        FieldState<List<InlineWebhookDeploymentReviewApprovedWorkflowJobRunsItemX54308b1f>> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var workflowJobRuns:
        List<InlineWebhookDeploymentReviewApprovedWorkflowJobRunsItemX54308b1f>?
      get() = workflowJobRunsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "workflowJobRuns is not nullable; call unsetWorkflowJobRuns() to omit it" }
        workflowJobRunsState = FieldState.Value(present.toList())
      }

    /**
     * Omits `approver` from serialized output.
     */
    public fun unsetApprover() {
      approverState = FieldState.Absent
    }

    /**
     * Omits `comment` from serialized output.
     */
    public fun unsetComment() {
      commentState = FieldState.Absent
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
     * Omits `reviewers` from serialized output.
     */
    public fun unsetReviewers() {
      reviewersState = FieldState.Absent
    }

    /**
     * Omits `workflow_job_run` from serialized output.
     */
    public fun unsetWorkflowJobRun() {
      workflowJobRunState = FieldState.Absent
    }

    /**
     * Omits `workflow_job_runs` from serialized output.
     */
    public fun unsetWorkflowJobRuns() {
      workflowJobRunsState = FieldState.Absent
    }

    public fun build(): WebhookDeploymentReviewApproved {
      check(actionValue != null) { "action is required" }
      check(organizationValue != null) { "organization is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      check(sinceValue != null) { "since is required" }
      check(workflowRunState !== FieldState.Absent) { "workflowRun is required, even when null" }
      return WebhookDeploymentReviewApproved(
        action = action,
        organization = organization,
        repository = repository,
        sender = sender,
        since = since,
        workflowRun = workflowRunState.valueOrNull(),
        approverState = approverState,
        commentState = commentState,
        enterpriseState = enterpriseState,
        installationState = installationState,
        reviewersState = reviewersState,
        workflowJobRunState = workflowJobRunState,
        workflowJobRunsState = workflowJobRunsState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookDeploymentReviewApproved = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookDeploymentReviewApproved> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookDeploymentReviewApproved {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookDeploymentReviewApproved")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookDeploymentReviewApproved must be a JSON object")
      val action = json.decodeRequired<InlineWebhookDeploymentReviewApprovedActionX3b46e2ba>(rawObject, "action")
      val organization = json.decodeRequired<OrganizationSimpleWebhooks>(rawObject, "organization")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      val since = json.decodeRequired<String>(rawObject, "since")
      if (!rawObject.containsKey("workflow_run")) {
        throw SerializationException("WebhookDeploymentReviewApproved is missing required property 'workflow_run'")
      }
      val workflowRun = rawObject["workflow_run"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookDeploymentReviewApprovedWorkflowRunX0e130c15?>(requireNotNull(element)) }
      return WebhookDeploymentReviewApproved(
        action = action,
        organization = organization,
        repository = repository,
        sender = sender,
        since = since,
        workflowRun = workflowRun,
        approverState = json.decodeOptional(rawObject, "approver", nullable = false),
        commentState = json.decodeOptional(rawObject, "comment", nullable = false),
        enterpriseState = json.decodeOptional(rawObject, "enterprise", nullable = false),
        installationState = json.decodeOptional(rawObject, "installation", nullable = false),
        reviewersState = json.decodeOptional(rawObject, "reviewers", nullable = false),
        workflowJobRunState = json.decodeOptional(rawObject, "workflow_job_run", nullable = false),
        workflowJobRunsState = json.decodeOptional(rawObject, "workflow_job_runs", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookDeploymentReviewApproved) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookDeploymentReviewApproved")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("organization", json.encodeToJsonElement(value.organization))
        put("repository", json.encodeToJsonElement(value.repository))
        put("sender", json.encodeToJsonElement(value.sender))
        put("since", value.since)
        put("workflow_run", value.workflowRun?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("approver", value.approverState, json::encodeToJsonElement)
        putState("comment", value.commentState, json::encodeToJsonElement)
        putState("enterprise", value.enterpriseState, json::encodeToJsonElement)
        putState("installation", value.installationState, json::encodeToJsonElement)
        putState("reviewers", value.reviewersState, json::encodeToJsonElement)
        putState("workflow_job_run", value.workflowJobRunState, json::encodeToJsonElement)
        putState("workflow_job_runs", value.workflowJobRunsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookDeploymentReviewApproved(block: WebhookDeploymentReviewApproved.Builder.() -> Unit): WebhookDeploymentReviewApproved = WebhookDeploymentReviewApproved.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookDeploymentReviewApproved is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("WebhookDeploymentReviewApproved property '" + name + "' is not nullable")
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
