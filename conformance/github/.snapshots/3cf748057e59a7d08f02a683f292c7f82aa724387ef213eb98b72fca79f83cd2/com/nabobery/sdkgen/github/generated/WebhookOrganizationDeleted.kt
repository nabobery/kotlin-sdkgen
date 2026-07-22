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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-deleted.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-organization-deleted
 */
@Serializable(with = WebhookOrganizationDeleted.Serializer::class)
public class WebhookOrganizationDeleted(
  public val action: InlineWebhookOrganizationDeletedActionX92130584,
  public val organization: OrganizationSimpleWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val membership: WebhooksMembership? = null,
  public val repository: RepositoryWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookOrganizationDeletedActionX92130584? = null

    public var action: InlineWebhookOrganizationDeletedActionX92130584
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var organizationValue: OrganizationSimpleWebhooks? = null

    public var organization: OrganizationSimpleWebhooks
      get() = requireNotNull(organizationValue) { "organization is required" }
      set(`value`) {
        organizationValue = value
      }

    private var senderValue: SimpleUser? = null

    public var sender: SimpleUser
      get() = requireNotNull(senderValue) { "sender is required" }
      set(`value`) {
        senderValue = value
      }

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var membership: WebhooksMembership? = null

    public var repository: RepositoryWebhooks? = null

    public fun build(): WebhookOrganizationDeleted {
      check(actionValue != null) { "action is required" }
      check(organizationValue != null) { "organization is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookOrganizationDeleted(
        action = action,
        organization = organization,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        membership = membership,
        repository = repository,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookOrganizationDeleted = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookOrganizationDeleted> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookOrganizationDeleted {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookOrganizationDeleted")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookOrganizationDeleted must be a JSON object")
      val action = json.decodeRequired<InlineWebhookOrganizationDeletedActionX92130584>(rawObject, "action")
      val organization = json.decodeRequired<OrganizationSimpleWebhooks>(rawObject, "organization")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookOrganizationDeleted(
        action = action,
        organization = organization,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        membership = rawObject["membership"]?.let { json.decodeFromJsonElement<WebhooksMembership>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookOrganizationDeleted) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookOrganizationDeleted")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("organization", json.encodeToJsonElement(value.organization))
        put("sender", json.encodeToJsonElement(value.sender))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.membership?.let { put("membership", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookOrganizationDeleted(block: WebhookOrganizationDeleted.Builder.() -> Unit): WebhookOrganizationDeleted = WebhookOrganizationDeleted.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookOrganizationDeleted is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
