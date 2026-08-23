package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-status-created
 */
@Serializable(with = WebhookDeploymentStatusCreated.Serializer::class)
public class WebhookDeploymentStatusCreated(
  public val action: InlineWebhookDeploymentStatusCreatedActionXe8c7cce4,
  /**
   * The [deployment](https://docs.github.com/rest/deployments/deployments#list-deployments).
   */
  public val deployment: InlineWebhookDeploymentStatusCreatedDeploymentXf8d8c71e,
  /**
   * The [deployment status](https://docs.github.com/rest/deployments/statuses#list-deployment-statuses).
   */
  public val deploymentStatus: InlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val checkRun: InlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8? = null,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val workflow: WebhooksWorkflow? = null,
  public val workflowRun: InlineWebhookDeploymentStatusCreatedWorkflowRunX1b3c5333? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookDeploymentStatusCreatedActionXe8c7cce4? = null

    public var action: InlineWebhookDeploymentStatusCreatedActionXe8c7cce4
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var deploymentValue: InlineWebhookDeploymentStatusCreatedDeploymentXf8d8c71e? = null

    public var deployment: InlineWebhookDeploymentStatusCreatedDeploymentXf8d8c71e
      get() = requireNotNull(deploymentValue) { "deployment is required" }
      set(`value`) {
        deploymentValue = value
      }

    private var deploymentStatusValue:
        InlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9? = null

    public var deploymentStatus: InlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9
      get() = requireNotNull(deploymentStatusValue) { "deploymentStatus is required" }
      set(`value`) {
        deploymentStatusValue = value
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

    public var checkRun: InlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8? = null

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var workflow: WebhooksWorkflow? = null

    public var workflowRun: InlineWebhookDeploymentStatusCreatedWorkflowRunX1b3c5333? = null

    public fun build(): WebhookDeploymentStatusCreated {
      check(actionValue != null) { "action is required" }
      check(deploymentValue != null) { "deployment is required" }
      check(deploymentStatusValue != null) { "deploymentStatus is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookDeploymentStatusCreated(
        action = action,
        deployment = deployment,
        deploymentStatus = deploymentStatus,
        repository = repository,
        sender = sender,
        checkRun = checkRun,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        workflow = workflow,
        workflowRun = workflowRun,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookDeploymentStatusCreated = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookDeploymentStatusCreated> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookDeploymentStatusCreated {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookDeploymentStatusCreated")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookDeploymentStatusCreated must be a JSON object")
      val action = json.decodeRequired<InlineWebhookDeploymentStatusCreatedActionXe8c7cce4>(rawObject, "action")
      val deployment = json.decodeRequired<InlineWebhookDeploymentStatusCreatedDeploymentXf8d8c71e>(rawObject, "deployment")
      val deploymentStatus = json.decodeRequired<InlineWebhookDeploymentStatusCreatedDeploymentStatusX9dc327d9>(rawObject, "deployment_status")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookDeploymentStatusCreated(
        action = action,
        deployment = deployment,
        deploymentStatus = deploymentStatus,
        repository = repository,
        sender = sender,
        checkRun = rawObject["check_run"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookDeploymentStatusCreatedCheckRunX98eda0b8?>(element) },
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        workflow = rawObject["workflow"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<WebhooksWorkflow?>(element) },
        workflowRun = rawObject["workflow_run"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookDeploymentStatusCreatedWorkflowRunX1b3c5333?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookDeploymentStatusCreated) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookDeploymentStatusCreated")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("deployment", json.encodeToJsonElement(value.deployment))
        put("deployment_status", json.encodeToJsonElement(value.deploymentStatus))
        put("repository", json.encodeToJsonElement(value.repository))
        put("sender", json.encodeToJsonElement(value.sender))
        value.checkRun?.let { put("check_run", json.encodeToJsonElement(it)) }
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.workflow?.let { put("workflow", json.encodeToJsonElement(it)) }
        value.workflowRun?.let { put("workflow_run", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookDeploymentStatusCreated(block: WebhookDeploymentStatusCreated.Builder.() -> Unit): WebhookDeploymentStatusCreated = WebhookDeploymentStatusCreated.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookDeploymentStatusCreated is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
