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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-metadata-removed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-metadata-removed
 */
@Serializable(with = WebhookSecretScanningAlertMetadataRemoved.Serializer::class)
public class WebhookSecretScanningAlertMetadataRemoved(
  public val action: InlineWebhookSecretScanningAlertMetadataRemovedActionX88e22546,
  public val alert: SecretScanningAlertWebhook,
  public val repository: RepositoryWebhooks,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookSecretScanningAlertMetadataRemovedActionX88e22546? = null

    public var action: InlineWebhookSecretScanningAlertMetadataRemovedActionX88e22546
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var alertValue: SecretScanningAlertWebhook? = null

    public var alert: SecretScanningAlertWebhook
      get() = requireNotNull(alertValue) { "alert is required" }
      set(`value`) {
        alertValue = value
      }

    private var repositoryValue: RepositoryWebhooks? = null

    public var repository: RepositoryWebhooks
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var sender: SimpleUser? = null

    public fun build(): WebhookSecretScanningAlertMetadataRemoved {
      check(actionValue != null) { "action is required" }
      check(alertValue != null) { "alert is required" }
      check(repositoryValue != null) { "repository is required" }
      return WebhookSecretScanningAlertMetadataRemoved(
        action = action,
        alert = alert,
        repository = repository,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        sender = sender,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookSecretScanningAlertMetadataRemoved = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookSecretScanningAlertMetadataRemoved> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookSecretScanningAlertMetadataRemoved {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookSecretScanningAlertMetadataRemoved")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookSecretScanningAlertMetadataRemoved must be a JSON object")
      val action = json.decodeRequired<InlineWebhookSecretScanningAlertMetadataRemovedActionX88e22546>(rawObject, "action")
      val alert = json.decodeRequired<SecretScanningAlertWebhook>(rawObject, "alert")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      return WebhookSecretScanningAlertMetadataRemoved(
        action = action,
        alert = alert,
        repository = repository,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookSecretScanningAlertMetadataRemoved) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookSecretScanningAlertMetadataRemoved")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("alert", json.encodeToJsonElement(value.alert))
        put("repository", json.encodeToJsonElement(value.repository))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.sender?.let { put("sender", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookSecretScanningAlertMetadataRemoved(block: WebhookSecretScanningAlertMetadataRemoved.Builder.() -> Unit): WebhookSecretScanningAlertMetadataRemoved = WebhookSecretScanningAlertMetadataRemoved.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookSecretScanningAlertMetadataRemoved is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
