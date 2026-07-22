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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened
 */
@Serializable(with = WebhookIssuesOpened.Serializer::class)
public class WebhookIssuesOpened(
  public val action: InlineWebhookIssuesOpenedActionX740c2638,
  /**
   * The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) itself.
   */
  public val issue: InlineWebhookIssuesOpenedIssueXd676cae1,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val changes: InlineWebhookIssuesOpenedChangesXd82edab0? = null,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookIssuesOpenedActionX740c2638? = null

    public var action: InlineWebhookIssuesOpenedActionX740c2638
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var issueValue: InlineWebhookIssuesOpenedIssueXd676cae1? = null

    public var issue: InlineWebhookIssuesOpenedIssueXd676cae1
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

    public var changes: InlineWebhookIssuesOpenedChangesXd82edab0? = null

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public fun build(): WebhookIssuesOpened {
      check(actionValue != null) { "action is required" }
      check(issueValue != null) { "issue is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookIssuesOpened(
        action = action,
        issue = issue,
        repository = repository,
        sender = sender,
        changes = changes,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookIssuesOpened = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookIssuesOpened> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookIssuesOpened {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookIssuesOpened")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookIssuesOpened must be a JSON object")
      val action = json.decodeRequired<InlineWebhookIssuesOpenedActionX740c2638>(rawObject, "action")
      val issue = json.decodeRequired<InlineWebhookIssuesOpenedIssueXd676cae1>(rawObject, "issue")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookIssuesOpened(
        action = action,
        issue = issue,
        repository = repository,
        sender = sender,
        changes = rawObject["changes"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesXd82edab0>(it) },
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookIssuesOpened) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookIssuesOpened")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("issue", json.encodeToJsonElement(value.issue))
        put("repository", json.encodeToJsonElement(value.repository))
        put("sender", json.encodeToJsonElement(value.sender))
        value.changes?.let { put("changes", json.encodeToJsonElement(it)) }
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookIssuesOpened(block: WebhookIssuesOpened.Builder.() -> Unit): WebhookIssuesOpened = WebhookIssuesOpened.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookIssuesOpened is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
