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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-unlabeled.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-unlabeled
 */
@Serializable(with = WebhookDiscussionUnlabeled.Serializer::class)
public class WebhookDiscussionUnlabeled(
  public val action: InlineWebhookDiscussionUnlabeledActionXe9be33c9,
  public val discussion: Discussion,
  public val label: WebhooksLabel,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookDiscussionUnlabeledActionXe9be33c9? = null

    public var action: InlineWebhookDiscussionUnlabeledActionXe9be33c9
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var discussionValue: Discussion? = null

    public var discussion: Discussion
      get() = requireNotNull(discussionValue) { "discussion is required" }
      set(`value`) {
        discussionValue = value
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

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public fun build(): WebhookDiscussionUnlabeled {
      check(actionValue != null) { "action is required" }
      check(discussionValue != null) { "discussion is required" }
      check(labelValue != null) { "label is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookDiscussionUnlabeled(
        action = action,
        discussion = discussion,
        label = label,
        repository = repository,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookDiscussionUnlabeled = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookDiscussionUnlabeled> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookDiscussionUnlabeled {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookDiscussionUnlabeled")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookDiscussionUnlabeled must be a JSON object")
      val action = json.decodeRequired<InlineWebhookDiscussionUnlabeledActionXe9be33c9>(rawObject, "action")
      val discussion = json.decodeRequired<Discussion>(rawObject, "discussion")
      val label = json.decodeRequired<WebhooksLabel>(rawObject, "label")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookDiscussionUnlabeled(
        action = action,
        discussion = discussion,
        label = label,
        repository = repository,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookDiscussionUnlabeled) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookDiscussionUnlabeled")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("discussion", json.encodeToJsonElement(value.discussion))
        put("label", json.encodeToJsonElement(value.label))
        put("repository", json.encodeToJsonElement(value.repository))
        put("sender", json.encodeToJsonElement(value.sender))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookDiscussionUnlabeled(block: WebhookDiscussionUnlabeled.Builder.() -> Unit): WebhookDiscussionUnlabeled = WebhookDiscussionUnlabeled.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookDiscussionUnlabeled is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
