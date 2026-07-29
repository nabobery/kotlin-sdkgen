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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-deleted.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-deleted
 */
@Serializable(with = WebhookProjectCardDeleted.Serializer::class)
public class WebhookProjectCardDeleted(
  public val action: InlineWebhookProjectCardDeletedActionXa6c7707b,
  public val projectCard: InlineWebhookProjectCardDeletedProjectCardXcfa7dc0f,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: NullableRepositoryWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookProjectCardDeletedActionXa6c7707b? = null

    public var action: InlineWebhookProjectCardDeletedActionXa6c7707b
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var projectCardValue: InlineWebhookProjectCardDeletedProjectCardXcfa7dc0f? = null

    public var projectCard: InlineWebhookProjectCardDeletedProjectCardXcfa7dc0f
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

    public var repository: NullableRepositoryWebhooks? = null

    public fun build(): WebhookProjectCardDeleted {
      check(actionValue != null) { "action is required" }
      check(projectCardValue != null) { "projectCard is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookProjectCardDeleted(
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
    public fun build(block: Builder.() -> Unit): WebhookProjectCardDeleted = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookProjectCardDeleted> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookProjectCardDeleted {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookProjectCardDeleted")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookProjectCardDeleted must be a JSON object")
      val action = json.decodeRequired<InlineWebhookProjectCardDeletedActionXa6c7707b>(rawObject, "action")
      val projectCard = json.decodeRequired<InlineWebhookProjectCardDeletedProjectCardXcfa7dc0f>(rawObject, "project_card")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookProjectCardDeleted(
        action = action,
        projectCard = projectCard,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableRepositoryWebhooks?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookProjectCardDeleted) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookProjectCardDeleted")
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

public fun webhookProjectCardDeleted(block: WebhookProjectCardDeleted.Builder.() -> Unit): WebhookProjectCardDeleted = WebhookProjectCardDeleted.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookProjectCardDeleted is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
