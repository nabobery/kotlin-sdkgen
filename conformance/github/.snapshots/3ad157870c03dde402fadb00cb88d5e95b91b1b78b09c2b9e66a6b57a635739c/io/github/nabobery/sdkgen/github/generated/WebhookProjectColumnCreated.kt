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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-project-column-created.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-column-created
 */
@Serializable(with = WebhookProjectColumnCreated.Serializer::class)
public class WebhookProjectColumnCreated(
  public val action: InlineWebhookProjectColumnCreatedActionXfcdf9ab6,
  public val projectColumn: WebhooksProjectColumn,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: RepositoryWebhooks? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookProjectColumnCreatedActionXfcdf9ab6? = null

    public var action: InlineWebhookProjectColumnCreatedActionXfcdf9ab6
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var projectColumnValue: WebhooksProjectColumn? = null

    public var projectColumn: WebhooksProjectColumn
      get() = requireNotNull(projectColumnValue) { "projectColumn is required" }
      set(`value`) {
        projectColumnValue = value
      }

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var repository: RepositoryWebhooks? = null

    public var sender: SimpleUser? = null

    public fun build(): WebhookProjectColumnCreated {
      check(actionValue != null) { "action is required" }
      check(projectColumnValue != null) { "projectColumn is required" }
      return WebhookProjectColumnCreated(
        action = action,
        projectColumn = projectColumn,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        repository = repository,
        sender = sender,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookProjectColumnCreated = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookProjectColumnCreated> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookProjectColumnCreated {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookProjectColumnCreated")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookProjectColumnCreated must be a JSON object")
      val action = json.decodeRequired<InlineWebhookProjectColumnCreatedActionXfcdf9ab6>(rawObject, "action")
      val projectColumn = json.decodeRequired<WebhooksProjectColumn>(rawObject, "project_column")
      return WebhookProjectColumnCreated(
        action = action,
        projectColumn = projectColumn,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookProjectColumnCreated) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookProjectColumnCreated")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("project_column", json.encodeToJsonElement(value.projectColumn))
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

public fun webhookProjectColumnCreated(block: WebhookProjectColumnCreated.Builder.() -> Unit): WebhookProjectColumnCreated = WebhookProjectColumnCreated.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookProjectColumnCreated is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
