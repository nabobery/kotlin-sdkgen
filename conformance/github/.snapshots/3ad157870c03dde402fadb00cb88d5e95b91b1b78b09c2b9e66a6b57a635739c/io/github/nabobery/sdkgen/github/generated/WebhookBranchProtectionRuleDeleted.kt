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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-deleted.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-deleted
 */
@Serializable(with = WebhookBranchProtectionRuleDeleted.Serializer::class)
public class WebhookBranchProtectionRuleDeleted(
  public val action: InlineWebhookBranchProtectionRuleDeletedActionX9c471292,
  public val repository: RepositoryWebhooks,
  public val rule: WebhooksRule,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookBranchProtectionRuleDeletedActionX9c471292? = null

    public var action: InlineWebhookBranchProtectionRuleDeletedActionX9c471292
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

    private var ruleValue: WebhooksRule? = null

    public var rule: WebhooksRule
      get() = requireNotNull(ruleValue) { "rule is required" }
      set(`value`) {
        ruleValue = value
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

    public fun build(): WebhookBranchProtectionRuleDeleted {
      check(actionValue != null) { "action is required" }
      check(repositoryValue != null) { "repository is required" }
      check(ruleValue != null) { "rule is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookBranchProtectionRuleDeleted(
        action = action,
        repository = repository,
        rule = rule,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookBranchProtectionRuleDeleted = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookBranchProtectionRuleDeleted> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookBranchProtectionRuleDeleted {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookBranchProtectionRuleDeleted")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookBranchProtectionRuleDeleted must be a JSON object")
      val action = json.decodeRequired<InlineWebhookBranchProtectionRuleDeletedActionX9c471292>(rawObject, "action")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val rule = json.decodeRequired<WebhooksRule>(rawObject, "rule")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookBranchProtectionRuleDeleted(
        action = action,
        repository = repository,
        rule = rule,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookBranchProtectionRuleDeleted) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookBranchProtectionRuleDeleted")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("repository", json.encodeToJsonElement(value.repository))
        put("rule", json.encodeToJsonElement(value.rule))
        put("sender", json.encodeToJsonElement(value.sender))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookBranchProtectionRuleDeleted(block: WebhookBranchProtectionRuleDeleted.Builder.() -> Unit): WebhookBranchProtectionRuleDeleted = WebhookBranchProtectionRuleDeleted.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookBranchProtectionRuleDeleted is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
