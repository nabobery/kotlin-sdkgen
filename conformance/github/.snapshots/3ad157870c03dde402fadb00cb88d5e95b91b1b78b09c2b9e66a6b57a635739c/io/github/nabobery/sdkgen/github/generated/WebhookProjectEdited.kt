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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-project-edited.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-project-edited
 */
@Serializable(with = WebhookProjectEdited.Serializer::class)
public class WebhookProjectEdited(
  public val action: InlineWebhookProjectEditedActionXbdf7559c,
  public val project: WebhooksProject,
  /**
   * The changes to the project if the action was `edited`.
   */
  public val changes: InlineWebhookProjectEditedChangesX5c1c436f? = null,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val repository: RepositoryWebhooks? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookProjectEditedActionXbdf7559c? = null

    public var action: InlineWebhookProjectEditedActionXbdf7559c
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

    /**
     * The changes to the project if the action was `edited`.
     */
    public var changes: InlineWebhookProjectEditedChangesX5c1c436f? = null

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var repository: RepositoryWebhooks? = null

    public var sender: SimpleUser? = null

    public fun build(): WebhookProjectEdited {
      check(actionValue != null) { "action is required" }
      check(projectValue != null) { "project is required" }
      return WebhookProjectEdited(
        action = action,
        project = project,
        changes = changes,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        repository = repository,
        sender = sender,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookProjectEdited = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookProjectEdited> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookProjectEdited {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookProjectEdited")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookProjectEdited must be a JSON object")
      val action = json.decodeRequired<InlineWebhookProjectEditedActionXbdf7559c>(rawObject, "action")
      val project = json.decodeRequired<WebhooksProject>(rawObject, "project")
      return WebhookProjectEdited(
        action = action,
        project = project,
        changes = rawObject["changes"]?.let { json.decodeFromJsonElement<InlineWebhookProjectEditedChangesX5c1c436f>(it) },
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<RepositoryWebhooks>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookProjectEdited) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookProjectEdited")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("project", json.encodeToJsonElement(value.project))
        value.changes?.let { put("changes", json.encodeToJsonElement(it)) }
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

public fun webhookProjectEdited(block: WebhookProjectEdited.Builder.() -> Unit): WebhookProjectEdited = WebhookProjectEdited.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookProjectEdited is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
