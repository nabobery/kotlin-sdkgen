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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-moved.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-moved
 */
@Serializable(with = WebhookProjectCardMoved.Serializer::class)
public class WebhookProjectCardMoved(
  public val action: InlineWebhookProjectCardMovedActionX2f59fb9f,
  public val projectCard: InlineWebhookProjectCardMovedProjectCardX3c6b4807,
  public val sender: SimpleUser,
  public val changes: InlineWebhookProjectCardMovedChangesX22b1262d? = null,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: RepositoryWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookProjectCardMovedActionX2f59fb9f? = null

    public var action: InlineWebhookProjectCardMovedActionX2f59fb9f
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var projectCardValue: InlineWebhookProjectCardMovedProjectCardX3c6b4807? = null

    public var projectCard: InlineWebhookProjectCardMovedProjectCardX3c6b4807
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

    public var changes: InlineWebhookProjectCardMovedChangesX22b1262d? = null

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var repository: RepositoryWebhooks? = null

    public fun build(): WebhookProjectCardMoved {
      check(actionValue != null) { "action is required" }
      check(projectCardValue != null) { "projectCard is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookProjectCardMoved(
        action = action,
        projectCard = projectCard,
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
    public fun build(block: Builder.() -> Unit): WebhookProjectCardMoved = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookProjectCardMoved> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookProjectCardMoved {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookProjectCardMoved")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookProjectCardMoved must be a JSON object")
      val action = json.decodeRequired<InlineWebhookProjectCardMovedActionX2f59fb9f>(rawObject, "action")
      val projectCard = json.decodeRequired<InlineWebhookProjectCardMovedProjectCardX3c6b4807>(rawObject, "project_card")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookProjectCardMoved(
        action = action,
        projectCard = projectCard,
        sender = sender,
        changes = rawObject["changes"]?.let { json.decodeFromJsonElement<InlineWebhookProjectCardMovedChangesX22b1262d>(it) },
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookProjectCardMoved) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookProjectCardMoved")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("project_card", json.encodeToJsonElement(value.projectCard))
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

public fun webhookProjectCardMoved(block: WebhookProjectCardMoved.Builder.() -> Unit): WebhookProjectCardMoved = WebhookProjectCardMoved.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookProjectCardMoved is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
