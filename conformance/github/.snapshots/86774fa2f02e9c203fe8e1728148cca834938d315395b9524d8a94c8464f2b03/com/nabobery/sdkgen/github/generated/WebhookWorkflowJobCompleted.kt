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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-completed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-completed
 */
@Serializable(with = WebhookWorkflowJobCompleted.Serializer::class)
public class WebhookWorkflowJobCompleted(
  public val action: InlineWebhookWorkflowJobCompletedActionXcbbb212d,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val workflowJob: InlineWebhookWorkflowJobCompletedWorkflowJobX4bb7b97d,
  public val deployment: Deployment? = null,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookWorkflowJobCompletedActionXcbbb212d? = null

    public var action: InlineWebhookWorkflowJobCompletedActionXcbbb212d
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

    private var workflowJobValue: InlineWebhookWorkflowJobCompletedWorkflowJobX4bb7b97d? = null

    public var workflowJob: InlineWebhookWorkflowJobCompletedWorkflowJobX4bb7b97d
      get() = requireNotNull(workflowJobValue) { "workflowJob is required" }
      set(`value`) {
        workflowJobValue = value
      }

    public var deployment: Deployment? = null

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public fun build(): WebhookWorkflowJobCompleted {
      check(actionValue != null) { "action is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      check(workflowJobValue != null) { "workflowJob is required" }
      return WebhookWorkflowJobCompleted(
        action = action,
        repository = repository,
        sender = sender,
        workflowJob = workflowJob,
        deployment = deployment,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookWorkflowJobCompleted = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookWorkflowJobCompleted> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookWorkflowJobCompleted {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookWorkflowJobCompleted")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookWorkflowJobCompleted must be a JSON object")
      val action = json.decodeRequired<InlineWebhookWorkflowJobCompletedActionXcbbb212d>(rawObject, "action")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      val workflowJob = json.decodeRequired<InlineWebhookWorkflowJobCompletedWorkflowJobX4bb7b97d>(rawObject, "workflow_job")
      return WebhookWorkflowJobCompleted(
        action = action,
        repository = repository,
        sender = sender,
        workflowJob = workflowJob,
        deployment = rawObject["deployment"]?.let { json.decodeFromJsonElement<Deployment>(it) },
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookWorkflowJobCompleted) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookWorkflowJobCompleted")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("repository", json.encodeToJsonElement(value.repository))
        put("sender", json.encodeToJsonElement(value.sender))
        put("workflow_job", json.encodeToJsonElement(value.workflowJob))
        value.deployment?.let { put("deployment", json.encodeToJsonElement(it)) }
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookWorkflowJobCompleted(block: WebhookWorkflowJobCompleted.Builder.() -> Unit): WebhookWorkflowJobCompleted = WebhookWorkflowJobCompleted.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookWorkflowJobCompleted is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
