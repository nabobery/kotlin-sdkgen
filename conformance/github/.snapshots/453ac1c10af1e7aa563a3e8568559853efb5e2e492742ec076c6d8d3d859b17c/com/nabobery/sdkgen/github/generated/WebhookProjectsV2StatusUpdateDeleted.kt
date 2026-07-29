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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-status-update-deleted.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-status-update-deleted
 */
@Serializable(with = WebhookProjectsV2StatusUpdateDeleted.Serializer::class)
public class WebhookProjectsV2StatusUpdateDeleted(
  public val action: InlineWebhookProjectsV2StatusUpdateDeletedActionX57d9a8ce,
  public val organization: OrganizationSimpleWebhooks,
  public val projectsV2StatusUpdate: ProjectsV2StatusUpdate,
  public val sender: SimpleUser,
  public val installation: SimpleInstallation? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookProjectsV2StatusUpdateDeletedActionX57d9a8ce? = null

    public var action: InlineWebhookProjectsV2StatusUpdateDeletedActionX57d9a8ce
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

    private var projectsV2StatusUpdateValue: ProjectsV2StatusUpdate? = null

    public var projectsV2StatusUpdate: ProjectsV2StatusUpdate
      get() = requireNotNull(projectsV2StatusUpdateValue) { "projectsV2StatusUpdate is required" }
      set(`value`) {
        projectsV2StatusUpdateValue = value
      }

    private var senderValue: SimpleUser? = null

    public var sender: SimpleUser
      get() = requireNotNull(senderValue) { "sender is required" }
      set(`value`) {
        senderValue = value
      }

    public var installation: SimpleInstallation? = null

    public fun build(): WebhookProjectsV2StatusUpdateDeleted {
      check(actionValue != null) { "action is required" }
      check(organizationValue != null) { "organization is required" }
      check(projectsV2StatusUpdateValue != null) { "projectsV2StatusUpdate is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookProjectsV2StatusUpdateDeleted(
        action = action,
        organization = organization,
        projectsV2StatusUpdate = projectsV2StatusUpdate,
        sender = sender,
        installation = installation,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookProjectsV2StatusUpdateDeleted = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookProjectsV2StatusUpdateDeleted> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookProjectsV2StatusUpdateDeleted {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookProjectsV2StatusUpdateDeleted")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookProjectsV2StatusUpdateDeleted must be a JSON object")
      val action = json.decodeRequired<InlineWebhookProjectsV2StatusUpdateDeletedActionX57d9a8ce>(rawObject, "action")
      val organization = json.decodeRequired<OrganizationSimpleWebhooks>(rawObject, "organization")
      val projectsV2StatusUpdate = json.decodeRequired<ProjectsV2StatusUpdate>(rawObject, "projects_v2_status_update")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookProjectsV2StatusUpdateDeleted(
        action = action,
        organization = organization,
        projectsV2StatusUpdate = projectsV2StatusUpdate,
        sender = sender,
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookProjectsV2StatusUpdateDeleted) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookProjectsV2StatusUpdateDeleted")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("organization", json.encodeToJsonElement(value.organization))
        put("projects_v2_status_update", json.encodeToJsonElement(value.projectsV2StatusUpdate))
        put("sender", json.encodeToJsonElement(value.sender))
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookProjectsV2StatusUpdateDeleted(block: WebhookProjectsV2StatusUpdateDeleted.Builder.() -> Unit): WebhookProjectsV2StatusUpdateDeleted = WebhookProjectsV2StatusUpdateDeleted.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookProjectsV2StatusUpdateDeleted is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
