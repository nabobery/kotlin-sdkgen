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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-converted.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-converted
 */
@Serializable(with = WebhookProjectsV2ItemConverted.Serializer::class)
public class WebhookProjectsV2ItemConverted(
  public val action: InlineWebhookProjectsV2ItemConvertedActionX8b23cfbd,
  public val changes: InlineWebhookProjectsV2ItemConvertedChangesX252f69cb,
  public val organization: OrganizationSimpleWebhooks,
  public val projectsV2Item: ProjectsV2Item,
  public val sender: SimpleUser,
  public val installation: SimpleInstallation? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookProjectsV2ItemConvertedActionX8b23cfbd? = null

    public var action: InlineWebhookProjectsV2ItemConvertedActionX8b23cfbd
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var changesValue: InlineWebhookProjectsV2ItemConvertedChangesX252f69cb? = null

    public var changes: InlineWebhookProjectsV2ItemConvertedChangesX252f69cb
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

    public fun build(): WebhookProjectsV2ItemConverted {
      check(actionValue != null) { "action is required" }
      check(changesValue != null) { "changes is required" }
      check(organizationValue != null) { "organization is required" }
      check(projectsV2ItemValue != null) { "projectsV2Item is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookProjectsV2ItemConverted(
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
    public fun build(block: Builder.() -> Unit): WebhookProjectsV2ItemConverted = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookProjectsV2ItemConverted> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookProjectsV2ItemConverted {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookProjectsV2ItemConverted")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookProjectsV2ItemConverted must be a JSON object")
      val action = json.decodeRequired<InlineWebhookProjectsV2ItemConvertedActionX8b23cfbd>(rawObject, "action")
      val changes = json.decodeRequired<InlineWebhookProjectsV2ItemConvertedChangesX252f69cb>(rawObject, "changes")
      val organization = json.decodeRequired<OrganizationSimpleWebhooks>(rawObject, "organization")
      val projectsV2Item = json.decodeRequired<ProjectsV2Item>(rawObject, "projects_v2_item")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookProjectsV2ItemConverted(
        action = action,
        changes = changes,
        organization = organization,
        projectsV2Item = projectsV2Item,
        sender = sender,
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookProjectsV2ItemConverted) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookProjectsV2ItemConverted")
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

public fun webhookProjectsV2ItemConverted(block: WebhookProjectsV2ItemConverted.Builder.() -> Unit): WebhookProjectsV2ItemConverted = WebhookProjectsV2ItemConverted.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookProjectsV2ItemConverted is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
