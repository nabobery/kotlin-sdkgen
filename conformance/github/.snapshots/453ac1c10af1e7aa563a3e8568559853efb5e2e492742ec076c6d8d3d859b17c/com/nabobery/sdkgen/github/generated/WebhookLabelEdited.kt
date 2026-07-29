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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-label-edited.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-label-edited
 */
@Serializable(with = WebhookLabelEdited.Serializer::class)
public class WebhookLabelEdited(
  public val action: InlineWebhookLabelEditedActionXaa6a7ed7,
  public val label: WebhooksLabel,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  /**
   * The changes to the label if the action was `edited`.
   */
  public val changes: InlineWebhookLabelEditedChangesXda43b9d2? = null,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookLabelEditedActionXaa6a7ed7? = null

    public var action: InlineWebhookLabelEditedActionXaa6a7ed7
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var labelValue: WebhooksLabel? = null

    public var label: WebhooksLabel
      get() = requireNotNull(labelValue) { "label is required" }
      set(`value`) {
        labelValue = value
      }

    private var repositoryValue: RepositoryWebhooks? = null

    public var repository: RepositoryWebhooks
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    private var senderValue: SimpleUser? = null

    public var sender: SimpleUser
      get() = requireNotNull(senderValue) { "sender is required" }
      set(`value`) {
        senderValue = value
      }

    /**
     * The changes to the label if the action was `edited`.
     */
    public var changes: InlineWebhookLabelEditedChangesXda43b9d2? = null

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public fun build(): WebhookLabelEdited {
      check(actionValue != null) { "action is required" }
      check(labelValue != null) { "label is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookLabelEdited(
        action = action,
        label = label,
        repository = repository,
        sender = sender,
        changes = changes,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookLabelEdited = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookLabelEdited> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookLabelEdited {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookLabelEdited")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookLabelEdited must be a JSON object")
      val action = json.decodeRequired<InlineWebhookLabelEditedActionXaa6a7ed7>(rawObject, "action")
      val label = json.decodeRequired<WebhooksLabel>(rawObject, "label")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookLabelEdited(
        action = action,
        label = label,
        repository = repository,
        sender = sender,
        changes = rawObject["changes"]?.let { json.decodeFromJsonElement<InlineWebhookLabelEditedChangesXda43b9d2>(it) },
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookLabelEdited) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookLabelEdited")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("label", json.encodeToJsonElement(value.label))
        put("repository", json.encodeToJsonElement(value.repository))
        put("sender", json.encodeToJsonElement(value.sender))
        value.changes?.let { put("changes", json.encodeToJsonElement(it)) }
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookLabelEdited(block: WebhookLabelEdited.Builder.() -> Unit): WebhookLabelEdited = WebhookLabelEdited.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookLabelEdited is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
