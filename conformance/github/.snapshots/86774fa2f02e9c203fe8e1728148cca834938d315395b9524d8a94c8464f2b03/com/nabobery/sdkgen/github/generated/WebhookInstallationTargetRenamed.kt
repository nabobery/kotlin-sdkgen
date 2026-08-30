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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-target-renamed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-installation-target-renamed
 */
@Serializable(with = WebhookInstallationTargetRenamed.Serializer::class)
public class WebhookInstallationTargetRenamed(
  public val account: InlineWebhookInstallationTargetRenamedAccountX55d3a3d3,
  public val action: InlineWebhookInstallationTargetRenamedActionXe233e9dd,
  public val changes: InlineWebhookInstallationTargetRenamedChangesX6c6bcd89,
  public val installation: SimpleInstallation,
  public val targetType: String,
  public val enterprise: EnterpriseWebhooks? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: RepositoryWebhooks? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var accountValue: InlineWebhookInstallationTargetRenamedAccountX55d3a3d3? = null

    public var account: InlineWebhookInstallationTargetRenamedAccountX55d3a3d3
      get() = requireNotNull(accountValue) { "account is required" }
      set(`value`) {
        accountValue = value
      }

    private var actionValue: InlineWebhookInstallationTargetRenamedActionXe233e9dd? = null

    public var action: InlineWebhookInstallationTargetRenamedActionXe233e9dd
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var changesValue: InlineWebhookInstallationTargetRenamedChangesX6c6bcd89? = null

    public var changes: InlineWebhookInstallationTargetRenamedChangesX6c6bcd89
      get() = requireNotNull(changesValue) { "changes is required" }
      set(`value`) {
        changesValue = value
      }

    private var installationValue: SimpleInstallation? = null

    public var installation: SimpleInstallation
      get() = requireNotNull(installationValue) { "installation is required" }
      set(`value`) {
        installationValue = value
      }

    private var targetTypeValue: String? = null

    public var targetType: String
      get() = requireNotNull(targetTypeValue) { "targetType is required" }
      set(`value`) {
        targetTypeValue = value
      }

    public var enterprise: EnterpriseWebhooks? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var repository: RepositoryWebhooks? = null

    public var sender: SimpleUser? = null

    public fun build(): WebhookInstallationTargetRenamed {
      check(accountValue != null) { "account is required" }
      check(actionValue != null) { "action is required" }
      check(changesValue != null) { "changes is required" }
      check(installationValue != null) { "installation is required" }
      check(targetTypeValue != null) { "targetType is required" }
      return WebhookInstallationTargetRenamed(
        account = account,
        action = action,
        changes = changes,
        installation = installation,
        targetType = targetType,
        enterprise = enterprise,
        organization = organization,
        repository = repository,
        sender = sender,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookInstallationTargetRenamed = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookInstallationTargetRenamed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookInstallationTargetRenamed {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookInstallationTargetRenamed")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookInstallationTargetRenamed must be a JSON object")
      val account = json.decodeRequired<InlineWebhookInstallationTargetRenamedAccountX55d3a3d3>(rawObject, "account")
      val action = json.decodeRequired<InlineWebhookInstallationTargetRenamedActionXe233e9dd>(rawObject, "action")
      val changes = json.decodeRequired<InlineWebhookInstallationTargetRenamedChangesX6c6bcd89>(rawObject, "changes")
      val installation = json.decodeRequired<SimpleInstallation>(rawObject, "installation")
      val targetType = json.decodeRequired<String>(rawObject, "target_type")
      return WebhookInstallationTargetRenamed(
        account = account,
        action = action,
        changes = changes,
        installation = installation,
        targetType = targetType,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookInstallationTargetRenamed) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookInstallationTargetRenamed")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account", json.encodeToJsonElement(value.account))
        put("action", json.encodeToJsonElement(value.action))
        put("changes", json.encodeToJsonElement(value.changes))
        put("installation", json.encodeToJsonElement(value.installation))
        put("target_type", value.targetType)
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
        value.sender?.let { put("sender", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookInstallationTargetRenamed(block: WebhookInstallationTargetRenamed.Builder.() -> Unit): WebhookInstallationTargetRenamed = WebhookInstallationTargetRenamed.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookInstallationTargetRenamed is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
