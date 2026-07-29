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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-project-closed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-closed
 */
@Serializable(with = WebhookProjectClosed.Serializer::class)
public class WebhookProjectClosed(
  public val action: InlineWebhookProjectClosedActionX1c6b8e07,
  public val project: WebhooksProject,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: RepositoryWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookProjectClosedActionX1c6b8e07? = null

    public var action: InlineWebhookProjectClosedActionX1c6b8e07
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var projectValue: WebhooksProject? = null

    public var project: WebhooksProject
      get() = requireNotNull(projectValue) { "project is required" }
      set(`value`) {
        projectValue = value
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

    public fun build(): WebhookProjectClosed {
      check(actionValue != null) { "action is required" }
      check(projectValue != null) { "project is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookProjectClosed(
        action = action,
        project = project,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        repository = repository,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookProjectClosed = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookProjectClosed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookProjectClosed {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookProjectClosed")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookProjectClosed must be a JSON object")
      val action = json.decodeRequired<InlineWebhookProjectClosedActionX1c6b8e07>(rawObject, "action")
      val project = json.decodeRequired<WebhooksProject>(rawObject, "project")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookProjectClosed(
        action = action,
        project = project,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookProjectClosed) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookProjectClosed")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("project", json.encodeToJsonElement(value.project))
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

public fun webhookProjectClosed(block: WebhookProjectClosed.Builder.() -> Unit): WebhookProjectClosed = WebhookProjectClosed.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookProjectClosed is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
