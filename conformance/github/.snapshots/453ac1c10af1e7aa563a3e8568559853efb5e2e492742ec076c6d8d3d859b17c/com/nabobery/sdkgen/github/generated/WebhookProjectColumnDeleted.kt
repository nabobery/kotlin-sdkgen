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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-project-column-deleted.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-column-deleted
 */
@Serializable(with = WebhookProjectColumnDeleted.Serializer::class)
public class WebhookProjectColumnDeleted(
  public val action: InlineWebhookProjectColumnDeletedActionX9a25dd57,
  public val projectColumn: WebhooksProjectColumn,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: NullableRepositoryWebhooks? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookProjectColumnDeletedActionX9a25dd57? = null

    public var action: InlineWebhookProjectColumnDeletedActionX9a25dd57
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

    public var repository: NullableRepositoryWebhooks? = null

    public var sender: SimpleUser? = null

    public fun build(): WebhookProjectColumnDeleted {
      check(actionValue != null) { "action is required" }
      check(projectColumnValue != null) { "projectColumn is required" }
      return WebhookProjectColumnDeleted(
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
    public fun build(block: Builder.() -> Unit): WebhookProjectColumnDeleted = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookProjectColumnDeleted> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookProjectColumnDeleted {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookProjectColumnDeleted")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookProjectColumnDeleted must be a JSON object")
      val action = json.decodeRequired<InlineWebhookProjectColumnDeletedActionX9a25dd57>(rawObject, "action")
      val projectColumn = json.decodeRequired<WebhooksProjectColumn>(rawObject, "project_column")
      return WebhookProjectColumnDeleted(
        action = action,
        projectColumn = projectColumn,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableRepositoryWebhooks?>(element) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookProjectColumnDeleted) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookProjectColumnDeleted")
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

public fun webhookProjectColumnDeleted(block: WebhookProjectColumnDeleted.Builder.() -> Unit): WebhookProjectColumnDeleted = WebhookProjectColumnDeleted.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookProjectColumnDeleted is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
