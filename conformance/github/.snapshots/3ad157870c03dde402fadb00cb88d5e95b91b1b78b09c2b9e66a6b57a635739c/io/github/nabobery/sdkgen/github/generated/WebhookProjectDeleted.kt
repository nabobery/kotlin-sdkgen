package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-project-deleted.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-deleted
 */
@Serializable(with = WebhookProjectDeleted.Serializer::class)
public class WebhookProjectDeleted(
  public val action: InlineWebhookProjectDeletedActionX9dd31170,
  public val project: WebhooksProject,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: NullableRepositoryWebhooks? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookProjectDeletedActionX9dd31170? = null

    public var action: InlineWebhookProjectDeletedActionX9dd31170
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

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var repository: NullableRepositoryWebhooks? = null

    public var sender: SimpleUser? = null

    public fun build(): WebhookProjectDeleted {
      check(actionValue != null) { "action is required" }
      check(projectValue != null) { "project is required" }
      return WebhookProjectDeleted(
        action = action,
        project = project,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        repository = repository,
        sender = sender,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookProjectDeleted = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookProjectDeleted> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookProjectDeleted {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookProjectDeleted")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookProjectDeleted must be a JSON object")
      val action = json.decodeRequired<InlineWebhookProjectDeletedActionX9dd31170>(rawObject, "action")
      val project = json.decodeRequired<WebhooksProject>(rawObject, "project")
      return WebhookProjectDeleted(
        action = action,
        project = project,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableRepositoryWebhooks?>(element) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookProjectDeleted) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookProjectDeleted")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("project", json.encodeToJsonElement(value.project))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
        value.sender?.let { put("sender", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookProjectDeleted(block: WebhookProjectDeleted.Builder.() -> Unit): WebhookProjectDeleted = WebhookProjectDeleted.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookProjectDeleted is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
