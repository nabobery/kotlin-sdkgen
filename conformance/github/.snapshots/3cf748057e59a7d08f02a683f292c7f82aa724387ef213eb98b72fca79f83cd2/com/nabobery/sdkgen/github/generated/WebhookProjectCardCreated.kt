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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-created.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-created
 */
@Serializable(with = WebhookProjectCardCreated.Serializer::class)
public class WebhookProjectCardCreated(
  public val action: InlineWebhookProjectCardCreatedActionXdf78e7a8,
  public val projectCard: WebhooksProjectCard,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: RepositoryWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookProjectCardCreatedActionXdf78e7a8? = null

    public var action: InlineWebhookProjectCardCreatedActionXdf78e7a8
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var projectCardValue: WebhooksProjectCard? = null

    public var projectCard: WebhooksProjectCard
      get() = requireNotNull(projectCardValue) { "projectCard is required" }
      set(`value`) {
        projectCardValue = value
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

    public fun build(): WebhookProjectCardCreated {
      check(actionValue != null) { "action is required" }
      check(projectCardValue != null) { "projectCard is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookProjectCardCreated(
        action = action,
        projectCard = projectCard,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        repository = repository,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookProjectCardCreated = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookProjectCardCreated> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookProjectCardCreated {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookProjectCardCreated")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookProjectCardCreated must be a JSON object")
      val action = json.decodeRequired<InlineWebhookProjectCardCreatedActionXdf78e7a8>(rawObject, "action")
      val projectCard = json.decodeRequired<WebhooksProjectCard>(rawObject, "project_card")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookProjectCardCreated(
        action = action,
        projectCard = projectCard,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookProjectCardCreated) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookProjectCardCreated")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("project_card", json.encodeToJsonElement(value.projectCard))
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

public fun webhookProjectCardCreated(block: WebhookProjectCardCreated.Builder.() -> Unit): WebhookProjectCardCreated = WebhookProjectCardCreated.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookProjectCardCreated is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
