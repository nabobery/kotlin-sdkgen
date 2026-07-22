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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-edited.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-edited
 */
@Serializable(with = WebhookProjectsV2ItemEdited.Serializer::class)
public class WebhookProjectsV2ItemEdited(
  public val action: InlineWebhookProjectsV2ItemEditedActionXaef552fc,
  public val organization: OrganizationSimpleWebhooks,
  public val projectsV2Item: ProjectsV2Item,
  public val sender: SimpleUser,
  /**
   * The changes made to the item may involve modifications in the item's fields and draft issue body.
   * It includes altered values for text, number, date, single select, and iteration fields, along with the GraphQL node
   * ID of the changed field.
   */
  public val changes: InlineWebhookProjectsV2ItemEditedChangesX8159b23c? = null,
  public val installation: SimpleInstallation? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookProjectsV2ItemEditedActionXaef552fc? = null

    public var action: InlineWebhookProjectsV2ItemEditedActionXaef552fc
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

    /**
     * The changes made to the item may involve modifications in the item's fields and draft issue body.
     * It includes altered values for text, number, date, single select, and iteration fields, along with the GraphQL
     * node ID of the changed field.
     */
    public var changes: InlineWebhookProjectsV2ItemEditedChangesX8159b23c? = null

    public var installation: SimpleInstallation? = null

    public fun build(): WebhookProjectsV2ItemEdited {
      check(actionValue != null) { "action is required" }
      check(organizationValue != null) { "organization is required" }
      check(projectsV2ItemValue != null) { "projectsV2Item is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookProjectsV2ItemEdited(
        action = action,
        organization = organization,
        projectsV2Item = projectsV2Item,
        sender = sender,
        changes = changes,
        installation = installation,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookProjectsV2ItemEdited = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookProjectsV2ItemEdited> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookProjectsV2ItemEdited {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookProjectsV2ItemEdited")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookProjectsV2ItemEdited must be a JSON object")
      val action = json.decodeRequired<InlineWebhookProjectsV2ItemEditedActionXaef552fc>(rawObject, "action")
      val organization = json.decodeRequired<OrganizationSimpleWebhooks>(rawObject, "organization")
      val projectsV2Item = json.decodeRequired<ProjectsV2Item>(rawObject, "projects_v2_item")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookProjectsV2ItemEdited(
        action = action,
        organization = organization,
        projectsV2Item = projectsV2Item,
        sender = sender,
        changes = rawObject["changes"]?.let { json.decodeFromJsonElement<InlineWebhookProjectsV2ItemEditedChangesX8159b23c>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookProjectsV2ItemEdited) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookProjectsV2ItemEdited")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("organization", json.encodeToJsonElement(value.organization))
        put("projects_v2_item", json.encodeToJsonElement(value.projectsV2Item))
        put("sender", json.encodeToJsonElement(value.sender))
        value.changes?.let { put("changes", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookProjectsV2ItemEdited(block: WebhookProjectsV2ItemEdited.Builder.() -> Unit): WebhookProjectsV2ItemEdited = WebhookProjectsV2ItemEdited.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookProjectsV2ItemEdited is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
