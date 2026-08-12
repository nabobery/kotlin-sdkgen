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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited
 */
@Serializable(with = WebhookBranchProtectionRuleEdited.Serializer::class)
public class WebhookBranchProtectionRuleEdited(
  public val action: InlineWebhookBranchProtectionRuleEditedActionX3cb3f4e7,
  public val repository: RepositoryWebhooks,
  public val rule: WebhooksRule,
  public val sender: SimpleUser,
  /**
   * If the action was `edited`, the changes to the rule.
   */
  public val changes: InlineWebhookBranchProtectionRuleEditedChangesX9ce8620e? = null,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookBranchProtectionRuleEditedActionX3cb3f4e7? = null

    public var action: InlineWebhookBranchProtectionRuleEditedActionX3cb3f4e7
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

    /**
     * If the action was `edited`, the changes to the rule.
     */
    public var changes: InlineWebhookBranchProtectionRuleEditedChangesX9ce8620e? = null

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public fun build(): WebhookBranchProtectionRuleEdited {
      check(actionValue != null) { "action is required" }
      check(repositoryValue != null) { "repository is required" }
      check(ruleValue != null) { "rule is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookBranchProtectionRuleEdited(
        action = action,
        repository = repository,
        rule = rule,
        sender = sender,
        changes = changes,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookBranchProtectionRuleEdited = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookBranchProtectionRuleEdited> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookBranchProtectionRuleEdited {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookBranchProtectionRuleEdited")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookBranchProtectionRuleEdited must be a JSON object")
      val action = json.decodeRequired<InlineWebhookBranchProtectionRuleEditedActionX3cb3f4e7>(rawObject, "action")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val rule = json.decodeRequired<WebhooksRule>(rawObject, "rule")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookBranchProtectionRuleEdited(
        action = action,
        repository = repository,
        rule = rule,
        sender = sender,
        changes = rawObject["changes"]?.let { json.decodeFromJsonElement<InlineWebhookBranchProtectionRuleEditedChangesX9ce8620e>(it) },
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookBranchProtectionRuleEdited) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookBranchProtectionRuleEdited")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("repository", json.encodeToJsonElement(value.repository))
        put("rule", json.encodeToJsonElement(value.rule))
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

public fun webhookBranchProtectionRuleEdited(block: WebhookBranchProtectionRuleEdited.Builder.() -> Unit): WebhookBranchProtectionRuleEdited = WebhookBranchProtectionRuleEdited.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookBranchProtectionRuleEdited is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
