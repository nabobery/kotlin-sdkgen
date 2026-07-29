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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-project-closed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-project-closed
 */
@Serializable(with = WebhookProjectsV2ProjectClosed.Serializer::class)
public class WebhookProjectsV2ProjectClosed(
  public val action: InlineWebhookProjectsV2ProjectClosedActionX6296d1eb,
  public val organization: OrganizationSimpleWebhooks,
  public val projectsV2: ProjectsV2,
  public val sender: SimpleUser,
  public val installation: SimpleInstallation? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookProjectsV2ProjectClosedActionX6296d1eb? = null

    public var action: InlineWebhookProjectsV2ProjectClosedActionX6296d1eb
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

    private var projectsV2Value: ProjectsV2? = null

    public var projectsV2: ProjectsV2
      get() = requireNotNull(projectsV2Value) { "projectsV2 is required" }
      set(`value`) {
        projectsV2Value = value
      }

    private var senderValue: SimpleUser? = null

    public var sender: SimpleUser
      get() = requireNotNull(senderValue) { "sender is required" }
      set(`value`) {
        senderValue = value
      }

    public var installation: SimpleInstallation? = null

    public fun build(): WebhookProjectsV2ProjectClosed {
      check(actionValue != null) { "action is required" }
      check(organizationValue != null) { "organization is required" }
      check(projectsV2Value != null) { "projectsV2 is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookProjectsV2ProjectClosed(
        action = action,
        organization = organization,
        projectsV2 = projectsV2,
        sender = sender,
        installation = installation,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookProjectsV2ProjectClosed = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookProjectsV2ProjectClosed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookProjectsV2ProjectClosed {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookProjectsV2ProjectClosed")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookProjectsV2ProjectClosed must be a JSON object")
      val action = json.decodeRequired<InlineWebhookProjectsV2ProjectClosedActionX6296d1eb>(rawObject, "action")
      val organization = json.decodeRequired<OrganizationSimpleWebhooks>(rawObject, "organization")
      val projectsV2 = json.decodeRequired<ProjectsV2>(rawObject, "projects_v2")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookProjectsV2ProjectClosed(
        action = action,
        organization = organization,
        projectsV2 = projectsV2,
        sender = sender,
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookProjectsV2ProjectClosed) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookProjectsV2ProjectClosed")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("organization", json.encodeToJsonElement(value.organization))
        put("projects_v2", json.encodeToJsonElement(value.projectsV2))
        put("sender", json.encodeToJsonElement(value.sender))
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookProjectsV2ProjectClosed(block: WebhookProjectsV2ProjectClosed.Builder.() -> Unit): WebhookProjectsV2ProjectClosed = WebhookProjectsV2ProjectClosed.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookProjectsV2ProjectClosed is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
