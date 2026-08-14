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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-assigned.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-assigned
 */
@Serializable(with = WebhookSecretScanningAlertAssigned.Serializer::class)
public class WebhookSecretScanningAlertAssigned(
  public val action: InlineWebhookSecretScanningAlertAssignedActionX056b29b6,
  public val alert: SecretScanningAlertWebhook,
  public val repository: RepositoryWebhooks,
  public val assignee: SimpleUser? = null,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookSecretScanningAlertAssignedActionX056b29b6? = null

    public var action: InlineWebhookSecretScanningAlertAssignedActionX056b29b6
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

    public var assignee: SimpleUser? = null

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var sender: SimpleUser? = null

    public fun build(): WebhookSecretScanningAlertAssigned {
      check(actionValue != null) { "action is required" }
      check(alertValue != null) { "alert is required" }
      check(repositoryValue != null) { "repository is required" }
      return WebhookSecretScanningAlertAssigned(
        action = action,
        alert = alert,
        repository = repository,
        assignee = assignee,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        sender = sender,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookSecretScanningAlertAssigned = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookSecretScanningAlertAssigned> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookSecretScanningAlertAssigned {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookSecretScanningAlertAssigned")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookSecretScanningAlertAssigned must be a JSON object")
      val action = json.decodeRequired<InlineWebhookSecretScanningAlertAssignedActionX056b29b6>(rawObject, "action")
      val alert = json.decodeRequired<SecretScanningAlertWebhook>(rawObject, "alert")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      return WebhookSecretScanningAlertAssigned(
        action = action,
        alert = alert,
        repository = repository,
        assignee = rawObject["assignee"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookSecretScanningAlertAssigned) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookSecretScanningAlertAssigned")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("alert", json.encodeToJsonElement(value.alert))
        put("repository", json.encodeToJsonElement(value.repository))
        value.assignee?.let { put("assignee", json.encodeToJsonElement(it)) }
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.sender?.let { put("sender", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookSecretScanningAlertAssigned(block: WebhookSecretScanningAlertAssigned.Builder.() -> Unit): WebhookSecretScanningAlertAssigned = WebhookSecretScanningAlertAssigned.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookSecretScanningAlertAssigned is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
