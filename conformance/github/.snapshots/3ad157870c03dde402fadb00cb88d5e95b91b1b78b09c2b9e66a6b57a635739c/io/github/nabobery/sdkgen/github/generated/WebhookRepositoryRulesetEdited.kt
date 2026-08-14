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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-edited.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-ruleset-edited
 */
@Serializable(with = WebhookRepositoryRulesetEdited.Serializer::class)
public class WebhookRepositoryRulesetEdited(
  public val action: InlineWebhookRepositoryRulesetEditedActionX3c2da52b,
  public val repositoryRuleset: RepositoryRuleset,
  public val sender: SimpleUser,
  public val changes: InlineWebhookRepositoryRulesetEditedChangesX59d18934? = null,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: RepositoryWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookRepositoryRulesetEditedActionX3c2da52b? = null

    public var action: InlineWebhookRepositoryRulesetEditedActionX3c2da52b
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

    public var changes: InlineWebhookRepositoryRulesetEditedChangesX59d18934? = null

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var repository: RepositoryWebhooks? = null

    public fun build(): WebhookRepositoryRulesetEdited {
      check(actionValue != null) { "action is required" }
      check(repositoryRulesetValue != null) { "repositoryRuleset is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookRepositoryRulesetEdited(
        action = action,
        repositoryRuleset = repositoryRuleset,
        sender = sender,
        changes = changes,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        repository = repository,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookRepositoryRulesetEdited = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookRepositoryRulesetEdited> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookRepositoryRulesetEdited {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookRepositoryRulesetEdited")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookRepositoryRulesetEdited must be a JSON object")
      val action = json.decodeRequired<InlineWebhookRepositoryRulesetEditedActionX3c2da52b>(rawObject, "action")
      val repositoryRuleset = json.decodeRequired<RepositoryRuleset>(rawObject, "repository_ruleset")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookRepositoryRulesetEdited(
        action = action,
        repositoryRuleset = repositoryRuleset,
        sender = sender,
        changes = rawObject["changes"]?.let { json.decodeFromJsonElement<InlineWebhookRepositoryRulesetEditedChangesX59d18934>(it) },
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookRepositoryRulesetEdited) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookRepositoryRulesetEdited")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("repository_ruleset", json.encodeToJsonElement(value.repositoryRuleset))
        put("sender", json.encodeToJsonElement(value.sender))
        value.changes?.let { put("changes", json.encodeToJsonElement(it)) }
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookRepositoryRulesetEdited(block: WebhookRepositoryRulesetEdited.Builder.() -> Unit): WebhookRepositoryRulesetEdited = WebhookRepositoryRulesetEdited.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookRepositoryRulesetEdited is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
