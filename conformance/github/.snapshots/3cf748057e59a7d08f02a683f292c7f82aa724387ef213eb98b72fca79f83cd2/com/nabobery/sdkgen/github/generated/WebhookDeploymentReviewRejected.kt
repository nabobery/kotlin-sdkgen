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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-rejected.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-rejected
 */
@Serializable(with = WebhookDeploymentReviewRejected.Serializer::class)
public class WebhookDeploymentReviewRejected internal constructor(
  public val action: InlineWebhookDeploymentReviewRejectedActionXd83dfd19,
  public val organization: OrganizationSimpleWebhooks,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val since: String,
  public val workflowRun: InlineWebhookDeploymentReviewRejectedWorkflowRunX09f34f34?,
  private val approverState: FieldState<WebhooksApprover>,
  private val commentState: FieldState<String>,
  private val enterpriseState: FieldState<EnterpriseWebhooks>,
  private val installationState: FieldState<SimpleInstallation>,
  private val reviewersState: FieldState<List<InlineWebhooksReviewersItemX7689c76b>>,
  private val workflowJobRunState: FieldState<WebhooksWorkflowJobRun>,
  private val workflowJobRunsState:
      FieldState<List<InlineWebhookDeploymentReviewRejectedWorkflowJobRunsItemXe09667bf>>,
) {
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
      List<InlineWebhookDeploymentReviewRejectedWorkflowJobRunsItemXe09667bf>?
    get() = workflowJobRunsState.valueOrNull()

  public constructor(
    action: InlineWebhookDeploymentReviewRejectedActionXd83dfd19,
    organization: OrganizationSimpleWebhooks,
    repository: RepositoryWebhooks,
    sender: SimpleUser,
    since: String,
    workflowRun: InlineWebhookDeploymentReviewRejectedWorkflowRunX09f34f34?,
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
    private var actionValue: InlineWebhookDeploymentReviewRejectedActionXd83dfd19? = null

    public var action: InlineWebhookDeploymentReviewRejectedActionXd83dfd19
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
        FieldState<InlineWebhookDeploymentReviewRejectedWorkflowRunX09f34f34?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var workflowRun: InlineWebhookDeploymentReviewRejectedWorkflowRunX09f34f34?
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
      get() = reviewersState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "reviewers is not nullable; call unsetReviewers() to omit it" }
        reviewersState = FieldState.Value(present)
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
        FieldState<List<InlineWebhookDeploymentReviewRejectedWorkflowJobRunsItemXe09667bf>> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var workflowJobRuns:
        List<InlineWebhookDeploymentReviewRejectedWorkflowJobRunsItemXe09667bf>?
      get() = workflowJobRunsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "workflowJobRuns is not nullable; call unsetWorkflowJobRuns() to omit it" }
        workflowJobRunsState = FieldState.Value(present)
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

    public fun build(): WebhookDeploymentReviewRejected {
      check(actionValue != null) { "action is required" }
      check(organizationValue != null) { "organization is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      check(sinceValue != null) { "since is required" }
      check(workflowRunState !== FieldState.Absent) { "workflowRun is required, even when null" }
      return WebhookDeploymentReviewRejected(
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
    public fun build(block: Builder.() -> Unit): WebhookDeploymentReviewRejected = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookDeploymentReviewRejected> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookDeploymentReviewRejected {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookDeploymentReviewRejected")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookDeploymentReviewRejected must be a JSON object")
      val action = json.decodeRequired<InlineWebhookDeploymentReviewRejectedActionXd83dfd19>(rawObject, "action")
      val organization = json.decodeRequired<OrganizationSimpleWebhooks>(rawObject, "organization")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      val since = json.decodeRequired<String>(rawObject, "since")
      if (!rawObject.containsKey("workflow_run")) {
        throw SerializationException("WebhookDeploymentReviewRejected is missing required property 'workflow_run'")
      }
      val workflowRun = rawObject["workflow_run"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookDeploymentReviewRejectedWorkflowRunX09f34f34?>(requireNotNull(element)) }
      return WebhookDeploymentReviewRejected(
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

    override fun serialize(encoder: Encoder, `value`: WebhookDeploymentReviewRejected) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookDeploymentReviewRejected")
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

public fun webhookDeploymentReviewRejected(block: WebhookDeploymentReviewRejected.Builder.() -> Unit): WebhookDeploymentReviewRejected = WebhookDeploymentReviewRejected.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookDeploymentReviewRejected is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("WebhookDeploymentReviewRejected property '" + name + "' is not nullable")
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
