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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-in-progress.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-workflow-job-in-progress
 */
@Serializable(with = WebhookWorkflowJobInProgress.Serializer::class)
public class WebhookWorkflowJobInProgress(
  public val action: InlineWebhookWorkflowJobInProgressActionX90cb870d,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val workflowJob: InlineWebhookWorkflowJobInProgressWorkflowJobX7108d3c9,
  public val deployment: Deployment? = null,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookWorkflowJobInProgressActionX90cb870d? = null

    public var action: InlineWebhookWorkflowJobInProgressActionX90cb870d
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

    private var workflowJobValue: InlineWebhookWorkflowJobInProgressWorkflowJobX7108d3c9? = null

    public var workflowJob: InlineWebhookWorkflowJobInProgressWorkflowJobX7108d3c9
      get() = requireNotNull(workflowJobValue) { "workflowJob is required" }
      set(`value`) {
        workflowJobValue = value
      }

    public var deployment: Deployment? = null

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public fun build(): WebhookWorkflowJobInProgress {
      check(actionValue != null) { "action is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      check(workflowJobValue != null) { "workflowJob is required" }
      return WebhookWorkflowJobInProgress(
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
    public fun build(block: Builder.() -> Unit): WebhookWorkflowJobInProgress = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookWorkflowJobInProgress> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookWorkflowJobInProgress {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookWorkflowJobInProgress")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookWorkflowJobInProgress must be a JSON object")
      val action = json.decodeRequired<InlineWebhookWorkflowJobInProgressActionX90cb870d>(rawObject, "action")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      val workflowJob = json.decodeRequired<InlineWebhookWorkflowJobInProgressWorkflowJobX7108d3c9>(rawObject, "workflow_job")
      return WebhookWorkflowJobInProgress(
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

    override fun serialize(encoder: Encoder, `value`: WebhookWorkflowJobInProgress) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookWorkflowJobInProgress")
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

public fun webhookWorkflowJobInProgress(block: WebhookWorkflowJobInProgress.Builder.() -> Unit): WebhookWorkflowJobInProgress = WebhookWorkflowJobInProgress.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookWorkflowJobInProgress is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
