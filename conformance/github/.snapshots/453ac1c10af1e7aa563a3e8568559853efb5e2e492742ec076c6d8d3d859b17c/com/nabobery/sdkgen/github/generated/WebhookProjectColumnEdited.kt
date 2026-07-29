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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-project-column-edited.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-column-edited
 */
@Serializable(with = WebhookProjectColumnEdited.Serializer::class)
public class WebhookProjectColumnEdited(
  public val action: InlineWebhookProjectColumnEditedActionX385c265d,
  public val changes: InlineWebhookProjectColumnEditedChangesX4aeeae4b,
  public val projectColumn: WebhooksProjectColumn,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: RepositoryWebhooks? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookProjectColumnEditedActionX385c265d? = null

    public var action: InlineWebhookProjectColumnEditedActionX385c265d
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var changesValue: InlineWebhookProjectColumnEditedChangesX4aeeae4b? = null

    public var changes: InlineWebhookProjectColumnEditedChangesX4aeeae4b
      get() = requireNotNull(changesValue) { "changes is required" }
      set(`value`) {
        changesValue = value
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

    public fun build(): WebhookProjectColumnEdited {
      check(actionValue != null) { "action is required" }
      check(changesValue != null) { "changes is required" }
      check(projectColumnValue != null) { "projectColumn is required" }
      return WebhookProjectColumnEdited(
        action = action,
        changes = changes,
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
    public fun build(block: Builder.() -> Unit): WebhookProjectColumnEdited = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookProjectColumnEdited> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookProjectColumnEdited {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookProjectColumnEdited")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookProjectColumnEdited must be a JSON object")
      val action = json.decodeRequired<InlineWebhookProjectColumnEditedActionX385c265d>(rawObject, "action")
      val changes = json.decodeRequired<InlineWebhookProjectColumnEditedChangesX4aeeae4b>(rawObject, "changes")
      val projectColumn = json.decodeRequired<WebhooksProjectColumn>(rawObject, "project_column")
      return WebhookProjectColumnEdited(
        action = action,
        changes = changes,
        projectColumn = projectColumn,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookProjectColumnEdited) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookProjectColumnEdited")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("changes", json.encodeToJsonElement(value.changes))
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

public fun webhookProjectColumnEdited(block: WebhookProjectColumnEdited.Builder.() -> Unit): WebhookProjectColumnEdited = WebhookProjectColumnEdited.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookProjectColumnEdited is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
