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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-labeled.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-labeled
 */
@Serializable(with = WebhookIssuesLabeled.Serializer::class)
public class WebhookIssuesLabeled(
  public val action: InlineWebhookIssuesLabeledActionX42e574f4,
  /**
   * The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) itself.
   */
  public val issue: InlineWebhookIssuesLabeledIssueX0f190bb1,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val label: WebhooksLabel? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookIssuesLabeledActionX42e574f4? = null

    public var action: InlineWebhookIssuesLabeledActionX42e574f4
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var issueValue: InlineWebhookIssuesLabeledIssueX0f190bb1? = null

    public var issue: InlineWebhookIssuesLabeledIssueX0f190bb1
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

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var label: WebhooksLabel? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public fun build(): WebhookIssuesLabeled {
      check(actionValue != null) { "action is required" }
      check(issueValue != null) { "issue is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookIssuesLabeled(
        action = action,
        issue = issue,
        repository = repository,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        label = label,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookIssuesLabeled = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookIssuesLabeled> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookIssuesLabeled {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookIssuesLabeled")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookIssuesLabeled must be a JSON object")
      val action = json.decodeRequired<InlineWebhookIssuesLabeledActionX42e574f4>(rawObject, "action")
      val issue = json.decodeRequired<InlineWebhookIssuesLabeledIssueX0f190bb1>(rawObject, "issue")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookIssuesLabeled(
        action = action,
        issue = issue,
        repository = repository,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        label = rawObject["label"]?.let { json.decodeFromJsonElement<WebhooksLabel>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookIssuesLabeled) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookIssuesLabeled")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("issue", json.encodeToJsonElement(value.issue))
        put("repository", json.encodeToJsonElement(value.repository))
        put("sender", json.encodeToJsonElement(value.sender))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.label?.let { put("label", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookIssuesLabeled(block: WebhookIssuesLabeled.Builder.() -> Unit): WebhookIssuesLabeled = WebhookIssuesLabeled.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookIssuesLabeled is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
