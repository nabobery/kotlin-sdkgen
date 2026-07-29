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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-requested.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-requested
 */
@Serializable(with = WebhookDeploymentReviewRequested.Serializer::class)
public class WebhookDeploymentReviewRequested internal constructor(
  public val action: InlineWebhookDeploymentReviewRequestedActionXb5371de2,
  public val environment: String,
  public val organization: OrganizationSimpleWebhooks,
  public val repository: RepositoryWebhooks,
  public val requestor: WebhooksUser?,
  reviewers: List<InlineWebhookDeploymentReviewRequestedReviewersItemX5b7d7e77>,
  public val sender: SimpleUser,
  public val since: String,
  public val workflowJobRun: InlineWebhookDeploymentReviewRequestedWorkflowJobRunXe42fb3c2,
  public val workflowRun: InlineWebhookDeploymentReviewRequestedWorkflowRunX00c9e685?,
  private val enterpriseState: FieldState<EnterpriseWebhooks>,
  private val installationState: FieldState<SimpleInstallation>,
) {
  public val reviewers: List<InlineWebhookDeploymentReviewRequestedReviewersItemX5b7d7e77> =
      reviewers.toList()

  public val enterprise: EnterpriseWebhooks?
    get() = enterpriseState.valueOrNull()

  public val installation: SimpleInstallation?
    get() = installationState.valueOrNull()

  public constructor(
    action: InlineWebhookDeploymentReviewRequestedActionXb5371de2,
    environment: String,
    organization: OrganizationSimpleWebhooks,
    repository: RepositoryWebhooks,
    requestor: WebhooksUser?,
    reviewers: List<InlineWebhookDeploymentReviewRequestedReviewersItemX5b7d7e77>,
    sender: SimpleUser,
    since: String,
    workflowJobRun: InlineWebhookDeploymentReviewRequestedWorkflowJobRunXe42fb3c2,
    workflowRun: InlineWebhookDeploymentReviewRequestedWorkflowRunX00c9e685?,
  ) : this(action = action,
  environment = environment,
  organization = organization,
  repository = repository,
  requestor = requestor,
  reviewers = reviewers,
  sender = sender,
  since = since,
  workflowJobRun = workflowJobRun,
  workflowRun = workflowRun,
  enterpriseState = FieldState.Absent,
  installationState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `enterprise`.
   */
  public fun enterprisePresence(): FieldPresence = enterpriseState.presence

  /**
   * Returns the wire presence of `installation`.
   */
  public fun installationPresence(): FieldPresence = installationState.presence

  public class Builder {
    private var actionValue: InlineWebhookDeploymentReviewRequestedActionXb5371de2? = null

    public var action: InlineWebhookDeploymentReviewRequestedActionXb5371de2
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var environmentValue: String? = null

    public var environment: String
      get() = requireNotNull(environmentValue) { "environment is required" }
      set(`value`) {
        environmentValue = value
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

    private var reviewersValue: List<InlineWebhookDeploymentReviewRequestedReviewersItemX5b7d7e77>?
        = null

    public var reviewers: List<InlineWebhookDeploymentReviewRequestedReviewersItemX5b7d7e77>
      get() = requireNotNull(reviewersValue) { "reviewers is required" }.toList()
      set(`value`) {
        reviewersValue = value.toList()
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

    private var workflowJobRunValue: InlineWebhookDeploymentReviewRequestedWorkflowJobRunXe42fb3c2?
        = null

    public var workflowJobRun: InlineWebhookDeploymentReviewRequestedWorkflowJobRunXe42fb3c2
      get() = requireNotNull(workflowJobRunValue) { "workflowJobRun is required" }
      set(`value`) {
        workflowJobRunValue = value
      }

    private var requestorState: FieldState<WebhooksUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var requestor: WebhooksUser?
      get() = requestorState.valueOrNull()
      set(`value`) {
        requestorState = value.toNullableFieldState()
      }

    private var workflowRunState:
        FieldState<InlineWebhookDeploymentReviewRequestedWorkflowRunX00c9e685?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var workflowRun: InlineWebhookDeploymentReviewRequestedWorkflowRunX00c9e685?
      get() = workflowRunState.valueOrNull()
      set(`value`) {
        workflowRunState = value.toNullableFieldState()
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

    public fun build(): WebhookDeploymentReviewRequested {
      check(actionValue != null) { "action is required" }
      check(environmentValue != null) { "environment is required" }
      check(organizationValue != null) { "organization is required" }
      check(repositoryValue != null) { "repository is required" }
      check(reviewersValue != null) { "reviewers is required" }
      check(senderValue != null) { "sender is required" }
      check(sinceValue != null) { "since is required" }
      check(workflowJobRunValue != null) { "workflowJobRun is required" }
      check(requestorState !== FieldState.Absent) { "requestor is required, even when null" }
      check(workflowRunState !== FieldState.Absent) { "workflowRun is required, even when null" }
      return WebhookDeploymentReviewRequested(
        action = action,
        environment = environment,
        organization = organization,
        repository = repository,
        requestor = requestorState.valueOrNull(),
        reviewers = reviewers,
        sender = sender,
        since = since,
        workflowJobRun = workflowJobRun,
        workflowRun = workflowRunState.valueOrNull(),
        enterpriseState = enterpriseState,
        installationState = installationState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookDeploymentReviewRequested = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookDeploymentReviewRequested> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookDeploymentReviewRequested {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookDeploymentReviewRequested")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookDeploymentReviewRequested must be a JSON object")
      val action = json.decodeRequired<InlineWebhookDeploymentReviewRequestedActionXb5371de2>(rawObject, "action")
      val environment = json.decodeRequired<String>(rawObject, "environment")
      val organization = json.decodeRequired<OrganizationSimpleWebhooks>(rawObject, "organization")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val reviewers = json.decodeRequired<List<InlineWebhookDeploymentReviewRequestedReviewersItemX5b7d7e77>>(rawObject, "reviewers")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      val since = json.decodeRequired<String>(rawObject, "since")
      val workflowJobRun = json.decodeRequired<InlineWebhookDeploymentReviewRequestedWorkflowJobRunXe42fb3c2>(rawObject, "workflow_job_run")
      if (!rawObject.containsKey("requestor")) {
        throw SerializationException("WebhookDeploymentReviewRequested is missing required property 'requestor'")
      }
      val requestor = rawObject["requestor"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<WebhooksUser?>(requireNotNull(element)) }
      if (!rawObject.containsKey("workflow_run")) {
        throw SerializationException("WebhookDeploymentReviewRequested is missing required property 'workflow_run'")
      }
      val workflowRun = rawObject["workflow_run"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookDeploymentReviewRequestedWorkflowRunX00c9e685?>(requireNotNull(element)) }
      return WebhookDeploymentReviewRequested(
        action = action,
        environment = environment,
        organization = organization,
        repository = repository,
        requestor = requestor,
        reviewers = reviewers,
        sender = sender,
        since = since,
        workflowJobRun = workflowJobRun,
        workflowRun = workflowRun,
        enterpriseState = json.decodeOptional(rawObject, "enterprise", nullable = false),
        installationState = json.decodeOptional(rawObject, "installation", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookDeploymentReviewRequested) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookDeploymentReviewRequested")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("environment", value.environment)
        put("organization", json.encodeToJsonElement(value.organization))
        put("repository", json.encodeToJsonElement(value.repository))
        put("requestor", value.requestor?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("reviewers", json.encodeToJsonElement(value.reviewers))
        put("sender", json.encodeToJsonElement(value.sender))
        put("since", value.since)
        put("workflow_job_run", json.encodeToJsonElement(value.workflowJobRun))
        put("workflow_run", value.workflowRun?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("enterprise", value.enterpriseState, json::encodeToJsonElement)
        putState("installation", value.installationState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookDeploymentReviewRequested(block: WebhookDeploymentReviewRequested.Builder.() -> Unit): WebhookDeploymentReviewRequested = WebhookDeploymentReviewRequested.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookDeploymentReviewRequested is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("WebhookDeploymentReviewRequested property '" + name + "' is not nullable")
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
