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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-edited.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-card-edited
 */
@Serializable(with = WebhookProjectCardEdited.Serializer::class)
public class WebhookProjectCardEdited(
  public val action: InlineWebhookProjectCardEditedActionX6552982f,
  public val changes: InlineWebhookProjectCardEditedChangesXc7ba66de,
  public val projectCard: WebhooksProjectCard,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: RepositoryWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookProjectCardEditedActionX6552982f? = null

    public var action: InlineWebhookProjectCardEditedActionX6552982f
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var changesValue: InlineWebhookProjectCardEditedChangesXc7ba66de? = null

    public var changes: InlineWebhookProjectCardEditedChangesXc7ba66de
      get() = requireNotNull(changesValue) { "changes is required" }
      set(`value`) {
        changesValue = value
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

    public fun build(): WebhookProjectCardEdited {
      check(actionValue != null) { "action is required" }
      check(changesValue != null) { "changes is required" }
      check(projectCardValue != null) { "projectCard is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookProjectCardEdited(
        action = action,
        changes = changes,
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
    public fun build(block: Builder.() -> Unit): WebhookProjectCardEdited = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookProjectCardEdited> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookProjectCardEdited {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookProjectCardEdited")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookProjectCardEdited must be a JSON object")
      val action = json.decodeRequired<InlineWebhookProjectCardEditedActionX6552982f>(rawObject, "action")
      val changes = json.decodeRequired<InlineWebhookProjectCardEditedChangesXc7ba66de>(rawObject, "changes")
      val projectCard = json.decodeRequired<WebhooksProjectCard>(rawObject, "project_card")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookProjectCardEdited(
        action = action,
        changes = changes,
        projectCard = projectCard,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookProjectCardEdited) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookProjectCardEdited")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("changes", json.encodeToJsonElement(value.changes))
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

public fun webhookProjectCardEdited(block: WebhookProjectCardEdited.Builder.() -> Unit): WebhookProjectCardEdited = WebhookProjectCardEdited.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookProjectCardEdited is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
