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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-location-created.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-secret-scanning-alert-location-created
 */
@Serializable(with = WebhookSecretScanningAlertLocationCreated.Serializer::class)
public class WebhookSecretScanningAlertLocationCreated(
  public val alert: SecretScanningAlertWebhook,
  public val location: SecretScanningLocation,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val action: InlineWebhookSecretScanningAlertLocationCreatedActionX91f7e922? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var alertValue: SecretScanningAlertWebhook? = null

    public var alert: SecretScanningAlertWebhook
      get() = requireNotNull(alertValue) { "alert is required" }
      set(`value`) {
        alertValue = value
      }

    private var locationValue: SecretScanningLocation? = null

    public var location: SecretScanningLocation
      get() = requireNotNull(locationValue) { "location is required" }
      set(`value`) {
        locationValue = value
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

    public var action: InlineWebhookSecretScanningAlertLocationCreatedActionX91f7e922? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public fun build(): WebhookSecretScanningAlertLocationCreated {
      check(alertValue != null) { "alert is required" }
      check(locationValue != null) { "location is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookSecretScanningAlertLocationCreated(
        alert = alert,
        location = location,
        repository = repository,
        sender = sender,
        action = action,
        installation = installation,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookSecretScanningAlertLocationCreated = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookSecretScanningAlertLocationCreated> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookSecretScanningAlertLocationCreated {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookSecretScanningAlertLocationCreated")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookSecretScanningAlertLocationCreated must be a JSON object")
      val alert = json.decodeRequired<SecretScanningAlertWebhook>(rawObject, "alert")
      val location = json.decodeRequired<SecretScanningLocation>(rawObject, "location")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookSecretScanningAlertLocationCreated(
        alert = alert,
        location = location,
        repository = repository,
        sender = sender,
        action = rawObject["action"]?.let { json.decodeFromJsonElement<InlineWebhookSecretScanningAlertLocationCreatedActionX91f7e922>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookSecretScanningAlertLocationCreated) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookSecretScanningAlertLocationCreated")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("alert", json.encodeToJsonElement(value.alert))
        put("location", json.encodeToJsonElement(value.location))
        put("repository", json.encodeToJsonElement(value.repository))
        put("sender", json.encodeToJsonElement(value.sender))
        value.action?.let { put("action", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookSecretScanningAlertLocationCreated(block: WebhookSecretScanningAlertLocationCreated.Builder.() -> Unit): WebhookSecretScanningAlertLocationCreated = WebhookSecretScanningAlertLocationCreated.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookSecretScanningAlertLocationCreated is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
