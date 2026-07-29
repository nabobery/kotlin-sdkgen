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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-created.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-created
 */
@Serializable(with = WebhookBranchProtectionRuleCreated.Serializer::class)
public class WebhookBranchProtectionRuleCreated(
  public val action: InlineWebhookBranchProtectionRuleCreatedActionX51f8c47e,
  public val repository: RepositoryWebhooks,
  public val rule: WebhooksRule,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookBranchProtectionRuleCreatedActionX51f8c47e? = null

    public var action: InlineWebhookBranchProtectionRuleCreatedActionX51f8c47e
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

    public fun build(): WebhookBranchProtectionRuleCreated {
      check(actionValue != null) { "action is required" }
      check(repositoryValue != null) { "repository is required" }
      check(ruleValue != null) { "rule is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookBranchProtectionRuleCreated(
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
    public fun build(block: Builder.() -> Unit): WebhookBranchProtectionRuleCreated = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookBranchProtectionRuleCreated> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookBranchProtectionRuleCreated {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookBranchProtectionRuleCreated")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookBranchProtectionRuleCreated must be a JSON object")
      val action = json.decodeRequired<InlineWebhookBranchProtectionRuleCreatedActionX51f8c47e>(rawObject, "action")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val rule = json.decodeRequired<WebhooksRule>(rawObject, "rule")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookBranchProtectionRuleCreated(
        action = action,
        repository = repository,
        rule = rule,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookBranchProtectionRuleCreated) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookBranchProtectionRuleCreated")
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

public fun webhookBranchProtectionRuleCreated(block: WebhookBranchProtectionRuleCreated.Builder.() -> Unit): WebhookBranchProtectionRuleCreated = WebhookBranchProtectionRuleCreated.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookBranchProtectionRuleCreated is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
