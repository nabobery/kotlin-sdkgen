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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-archived.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-archived
 */
@Serializable(with = WebhookProjectsV2ItemArchived.Serializer::class)
public class WebhookProjectsV2ItemArchived(
  public val action: InlineWebhookProjectsV2ItemArchivedActionX20b7d15b,
  public val changes: WebhooksProjectChanges,
  public val organization: OrganizationSimpleWebhooks,
  public val projectsV2Item: ProjectsV2Item,
  public val sender: SimpleUser,
  public val installation: SimpleInstallation? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookProjectsV2ItemArchivedActionX20b7d15b? = null

    public var action: InlineWebhookProjectsV2ItemArchivedActionX20b7d15b
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var changesValue: WebhooksProjectChanges? = null

    public var changes: WebhooksProjectChanges
      get() = requireNotNull(changesValue) { "changes is required" }
      set(`value`) {
        changesValue = value
      }

    private var organizationValue: OrganizationSimpleWebhooks? = null

    public var organization: OrganizationSimpleWebhooks
      get() = requireNotNull(organizationValue) { "organization is required" }
      set(`value`) {
        organizationValue = value
      }

    private var projectsV2ItemValue: ProjectsV2Item? = null

    public var projectsV2Item: ProjectsV2Item
      get() = requireNotNull(projectsV2ItemValue) { "projectsV2Item is required" }
      set(`value`) {
        projectsV2ItemValue = value
      }

    private var senderValue: SimpleUser? = null

    public var sender: SimpleUser
      get() = requireNotNull(senderValue) { "sender is required" }
      set(`value`) {
        senderValue = value
      }

    public var installation: SimpleInstallation? = null

    public fun build(): WebhookProjectsV2ItemArchived {
      check(actionValue != null) { "action is required" }
      check(changesValue != null) { "changes is required" }
      check(organizationValue != null) { "organization is required" }
      check(projectsV2ItemValue != null) { "projectsV2Item is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookProjectsV2ItemArchived(
        action = action,
        changes = changes,
        organization = organization,
        projectsV2Item = projectsV2Item,
        sender = sender,
        installation = installation,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookProjectsV2ItemArchived = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookProjectsV2ItemArchived> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookProjectsV2ItemArchived {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookProjectsV2ItemArchived")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookProjectsV2ItemArchived must be a JSON object")
      val action = json.decodeRequired<InlineWebhookProjectsV2ItemArchivedActionX20b7d15b>(rawObject, "action")
      val changes = json.decodeRequired<WebhooksProjectChanges>(rawObject, "changes")
      val organization = json.decodeRequired<OrganizationSimpleWebhooks>(rawObject, "organization")
      val projectsV2Item = json.decodeRequired<ProjectsV2Item>(rawObject, "projects_v2_item")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookProjectsV2ItemArchived(
        action = action,
        changes = changes,
        organization = organization,
        projectsV2Item = projectsV2Item,
        sender = sender,
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookProjectsV2ItemArchived) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookProjectsV2ItemArchived")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("changes", json.encodeToJsonElement(value.changes))
        put("organization", json.encodeToJsonElement(value.organization))
        put("projects_v2_item", json.encodeToJsonElement(value.projectsV2Item))
        put("sender", json.encodeToJsonElement(value.sender))
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookProjectsV2ItemArchived(block: WebhookProjectsV2ItemArchived.Builder.() -> Unit): WebhookProjectsV2ItemArchived = WebhookProjectsV2ItemArchived.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookProjectsV2ItemArchived is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
