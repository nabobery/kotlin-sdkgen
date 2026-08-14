package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-edited.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-edited
 */
@Serializable(with = WebhookIssuesEdited.Serializer::class)
public class WebhookIssuesEdited(
  public val action: InlineWebhookIssuesEditedActionX245bde57,
  /**
   * The changes to the issue.
   */
  public val changes: InlineWebhookIssuesEditedChangesX0df18bcb,
  /**
   * The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) itself.
   */
  public val issue: InlineWebhookIssuesEditedIssueX6e5d33b3,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val label: WebhooksLabel? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookIssuesEditedActionX245bde57? = null

    public var action: InlineWebhookIssuesEditedActionX245bde57
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var changesValue: InlineWebhookIssuesEditedChangesX0df18bcb? = null

    public var changes: InlineWebhookIssuesEditedChangesX0df18bcb
      get() = requireNotNull(changesValue) { "changes is required" }
      set(`value`) {
        changesValue = value
      }

    private var issueValue: InlineWebhookIssuesEditedIssueX6e5d33b3? = null

    public var issue: InlineWebhookIssuesEditedIssueX6e5d33b3
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

    public fun build(): WebhookIssuesEdited {
      check(actionValue != null) { "action is required" }
      check(changesValue != null) { "changes is required" }
      check(issueValue != null) { "issue is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookIssuesEdited(
        action = action,
        changes = changes,
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
    public fun build(block: Builder.() -> Unit): WebhookIssuesEdited = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookIssuesEdited> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookIssuesEdited {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookIssuesEdited")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookIssuesEdited must be a JSON object")
      val action = json.decodeRequired<InlineWebhookIssuesEditedActionX245bde57>(rawObject, "action")
      val changes = json.decodeRequired<InlineWebhookIssuesEditedChangesX0df18bcb>(rawObject, "changes")
      val issue = json.decodeRequired<InlineWebhookIssuesEditedIssueX6e5d33b3>(rawObject, "issue")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookIssuesEdited(
        action = action,
        changes = changes,
        issue = issue,
        repository = repository,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        label = rawObject["label"]?.let { json.decodeFromJsonElement<WebhooksLabel>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookIssuesEdited) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookIssuesEdited")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("changes", json.encodeToJsonElement(value.changes))
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

public fun webhookIssuesEdited(block: WebhookIssuesEdited.Builder.() -> Unit): WebhookIssuesEdited = WebhookIssuesEdited.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookIssuesEdited is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
