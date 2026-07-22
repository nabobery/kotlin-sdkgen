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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-deleted.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-deleted
 */
@Serializable(with = WebhookRepositoryRulesetDeleted.Serializer::class)
public class WebhookRepositoryRulesetDeleted(
  public val action: InlineWebhookRepositoryRulesetDeletedActionX2ca18977,
  public val repositoryRuleset: RepositoryRuleset,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: RepositoryWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookRepositoryRulesetDeletedActionX2ca18977? = null

    public var action: InlineWebhookRepositoryRulesetDeletedActionX2ca18977
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var repositoryRulesetValue: RepositoryRuleset? = null

    public var repositoryRuleset: RepositoryRuleset
      get() = requireNotNull(repositoryRulesetValue) { "repositoryRuleset is required" }
      set(`value`) {
        repositoryRulesetValue = value
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

    public var repository: RepositoryWebhooks? = null

    public fun build(): WebhookRepositoryRulesetDeleted {
      check(actionValue != null) { "action is required" }
      check(repositoryRulesetValue != null) { "repositoryRuleset is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookRepositoryRulesetDeleted(
        action = action,
        repositoryRuleset = repositoryRuleset,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        repository = repository,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookRepositoryRulesetDeleted = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookRepositoryRulesetDeleted> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookRepositoryRulesetDeleted {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookRepositoryRulesetDeleted")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookRepositoryRulesetDeleted must be a JSON object")
      val action = json.decodeRequired<InlineWebhookRepositoryRulesetDeletedActionX2ca18977>(rawObject, "action")
      val repositoryRuleset = json.decodeRequired<RepositoryRuleset>(rawObject, "repository_ruleset")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookRepositoryRulesetDeleted(
        action = action,
        repositoryRuleset = repositoryRuleset,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookRepositoryRulesetDeleted) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookRepositoryRulesetDeleted")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("repository_ruleset", json.encodeToJsonElement(value.repositoryRuleset))
        put("sender", json.encodeToJsonElement(value.sender))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookRepositoryRulesetDeleted(block: WebhookRepositoryRulesetDeleted.Builder.() -> Unit): WebhookRepositoryRulesetDeleted = WebhookRepositoryRulesetDeleted.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookRepositoryRulesetDeleted is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
