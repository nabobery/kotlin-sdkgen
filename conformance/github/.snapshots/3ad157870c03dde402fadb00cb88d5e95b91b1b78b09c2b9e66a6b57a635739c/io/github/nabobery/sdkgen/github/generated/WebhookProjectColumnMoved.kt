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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-project-column-moved.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-column-moved
 */
@Serializable(with = WebhookProjectColumnMoved.Serializer::class)
public class WebhookProjectColumnMoved(
  public val action: InlineWebhookProjectColumnMovedActionX4726f21f,
  public val projectColumn: WebhooksProjectColumn,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: RepositoryWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookProjectColumnMovedActionX4726f21f? = null

    public var action: InlineWebhookProjectColumnMovedActionX4726f21f
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

    public fun build(): WebhookProjectColumnMoved {
      check(actionValue != null) { "action is required" }
      check(projectColumnValue != null) { "projectColumn is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookProjectColumnMoved(
        action = action,
        projectColumn = projectColumn,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        repository = repository,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookProjectColumnMoved = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookProjectColumnMoved> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookProjectColumnMoved {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookProjectColumnMoved")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookProjectColumnMoved must be a JSON object")
      val action = json.decodeRequired<InlineWebhookProjectColumnMovedActionX4726f21f>(rawObject, "action")
      val projectColumn = json.decodeRequired<WebhooksProjectColumn>(rawObject, "project_column")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookProjectColumnMoved(
        action = action,
        projectColumn = projectColumn,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookProjectColumnMoved) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookProjectColumnMoved")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("project_column", json.encodeToJsonElement(value.projectColumn))
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

public fun webhookProjectColumnMoved(block: WebhookProjectColumnMoved.Builder.() -> Unit): WebhookProjectColumnMoved = WebhookProjectColumnMoved.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookProjectColumnMoved is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
