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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-dependabot-alert-fixed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-dependabot-alert-fixed
 */
@Serializable(with = WebhookDependabotAlertFixed.Serializer::class)
public class WebhookDependabotAlertFixed(
  public val action: InlineWebhookDependabotAlertFixedActionX9acf166f,
  public val alert: DependabotAlert,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookDependabotAlertFixedActionX9acf166f? = null

    public var action: InlineWebhookDependabotAlertFixedActionX9acf166f
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var alertValue: DependabotAlert? = null

    public var alert: DependabotAlert
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

    private var senderValue: SimpleUser? = null

    public var sender: SimpleUser
      get() = requireNotNull(senderValue) { "sender is required" }
      set(`value`) {
        senderValue = value
      }

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public fun build(): WebhookDependabotAlertFixed {
      check(actionValue != null) { "action is required" }
      check(alertValue != null) { "alert is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookDependabotAlertFixed(
        action = action,
        alert = alert,
        repository = repository,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookDependabotAlertFixed = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookDependabotAlertFixed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookDependabotAlertFixed {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookDependabotAlertFixed")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookDependabotAlertFixed must be a JSON object")
      val action = json.decodeRequired<InlineWebhookDependabotAlertFixedActionX9acf166f>(rawObject, "action")
      val alert = json.decodeRequired<DependabotAlert>(rawObject, "alert")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookDependabotAlertFixed(
        action = action,
        alert = alert,
        repository = repository,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookDependabotAlertFixed) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookDependabotAlertFixed")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("alert", json.encodeToJsonElement(value.alert))
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

public fun webhookDependabotAlertFixed(block: WebhookDependabotAlertFixed.Builder.() -> Unit): WebhookDependabotAlertFixed = WebhookDependabotAlertFixed.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookDependabotAlertFixed is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
