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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-assigned.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-assigned
 */
@Serializable(with = WebhookIssuesAssigned.Serializer::class)
public class WebhookIssuesAssigned(
  /**
   * The action that was performed.
   */
  public val action: InlineWebhookIssuesAssignedActionX3957c61a,
  public val issue: WebhooksIssue,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val assignee: WebhooksUser? = null,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookIssuesAssignedActionX3957c61a? = null

    public var action: InlineWebhookIssuesAssignedActionX3957c61a
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var issueValue: WebhooksIssue? = null

    public var issue: WebhooksIssue
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
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

    public var assignee: WebhooksUser? = null

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public fun build(): WebhookIssuesAssigned {
      check(actionValue != null) { "action is required" }
      check(issueValue != null) { "issue is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookIssuesAssigned(
        action = action,
        issue = issue,
        repository = repository,
        sender = sender,
        assignee = assignee,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookIssuesAssigned = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookIssuesAssigned> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookIssuesAssigned {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookIssuesAssigned")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookIssuesAssigned must be a JSON object")
      val action = json.decodeRequired<InlineWebhookIssuesAssignedActionX3957c61a>(rawObject, "action")
      val issue = json.decodeRequired<WebhooksIssue>(rawObject, "issue")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookIssuesAssigned(
        action = action,
        issue = issue,
        repository = repository,
        sender = sender,
        assignee = rawObject["assignee"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<WebhooksUser?>(element) },
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookIssuesAssigned) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookIssuesAssigned")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("issue", json.encodeToJsonElement(value.issue))
        put("repository", json.encodeToJsonElement(value.repository))
        put("sender", json.encodeToJsonElement(value.sender))
        value.assignee?.let { put("assignee", json.encodeToJsonElement(it)) }
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookIssuesAssigned(block: WebhookIssuesAssigned.Builder.() -> Unit): WebhookIssuesAssigned = WebhookIssuesAssigned.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookIssuesAssigned is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
