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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-label-created.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-label-created
 */
@Serializable(with = WebhookLabelCreated.Serializer::class)
public class WebhookLabelCreated(
  public val action: InlineWebhookLabelCreatedActionXf229403e,
  public val label: WebhooksLabel,
  public val repository: RepositoryWebhooks,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookLabelCreatedActionXf229403e? = null

    public var action: InlineWebhookLabelCreatedActionXf229403e
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var labelValue: WebhooksLabel? = null

    public var label: WebhooksLabel
      get() = requireNotNull(labelValue) { "label is required" }
      set(`value`) {
        labelValue = value
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

    public fun build(): WebhookLabelCreated {
      check(actionValue != null) { "action is required" }
      check(labelValue != null) { "label is required" }
      check(repositoryValue != null) { "repository is required" }
      return WebhookLabelCreated(
        action = action,
        label = label,
        repository = repository,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        sender = sender,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookLabelCreated = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookLabelCreated> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookLabelCreated {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookLabelCreated")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookLabelCreated must be a JSON object")
      val action = json.decodeRequired<InlineWebhookLabelCreatedActionXf229403e>(rawObject, "action")
      val label = json.decodeRequired<WebhooksLabel>(rawObject, "label")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      return WebhookLabelCreated(
        action = action,
        label = label,
        repository = repository,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookLabelCreated) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookLabelCreated")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("label", json.encodeToJsonElement(value.label))
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

public fun webhookLabelCreated(block: WebhookLabelCreated.Builder.() -> Unit): WebhookLabelCreated = WebhookLabelCreated.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookLabelCreated is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
