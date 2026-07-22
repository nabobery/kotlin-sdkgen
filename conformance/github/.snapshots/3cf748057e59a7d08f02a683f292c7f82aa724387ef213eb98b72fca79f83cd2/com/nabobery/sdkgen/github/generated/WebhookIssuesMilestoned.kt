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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-milestoned.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-milestoned
 */
@Serializable(with = WebhookIssuesMilestoned.Serializer::class)
public class WebhookIssuesMilestoned(
  public val action: InlineWebhookIssuesMilestonedActionX48af13bc,
  /**
   * The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) itself.
   */
  public val issue: InlineWebhookIssuesMilestonedIssueX31152acf,
  public val milestone: WebhooksMilestone,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookIssuesMilestonedActionX48af13bc? = null

    public var action: InlineWebhookIssuesMilestonedActionX48af13bc
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var issueValue: InlineWebhookIssuesMilestonedIssueX31152acf? = null

    public var issue: InlineWebhookIssuesMilestonedIssueX31152acf
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var milestoneValue: WebhooksMilestone? = null

    public var milestone: WebhooksMilestone
      get() = requireNotNull(milestoneValue) { "milestone is required" }
      set(`value`) {
        milestoneValue = value
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

    public var organization: OrganizationSimpleWebhooks? = null

    public fun build(): WebhookIssuesMilestoned {
      check(actionValue != null) { "action is required" }
      check(issueValue != null) { "issue is required" }
      check(milestoneValue != null) { "milestone is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookIssuesMilestoned(
        action = action,
        issue = issue,
        milestone = milestone,
        repository = repository,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookIssuesMilestoned = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookIssuesMilestoned> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookIssuesMilestoned {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookIssuesMilestoned")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookIssuesMilestoned must be a JSON object")
      val action = json.decodeRequired<InlineWebhookIssuesMilestonedActionX48af13bc>(rawObject, "action")
      val issue = json.decodeRequired<InlineWebhookIssuesMilestonedIssueX31152acf>(rawObject, "issue")
      val milestone = json.decodeRequired<WebhooksMilestone>(rawObject, "milestone")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookIssuesMilestoned(
        action = action,
        issue = issue,
        milestone = milestone,
        repository = repository,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookIssuesMilestoned) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookIssuesMilestoned")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("issue", json.encodeToJsonElement(value.issue))
        put("milestone", json.encodeToJsonElement(value.milestone))
        put("repository", json.encodeToJsonElement(value.repository))
        put("sender", json.encodeToJsonElement(value.sender))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookIssuesMilestoned(block: WebhookIssuesMilestoned.Builder.() -> Unit): WebhookIssuesMilestoned = WebhookIssuesMilestoned.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookIssuesMilestoned is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
