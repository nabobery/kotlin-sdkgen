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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-edited.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-edited
 */
@Serializable(with = WebhookDiscussionEdited.Serializer::class)
public class WebhookDiscussionEdited(
  public val action: InlineWebhookDiscussionEditedActionX66d8be77,
  public val discussion: Discussion,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val changes: InlineWebhookDiscussionEditedChangesX0133b77c? = null,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookDiscussionEditedActionX66d8be77? = null

    public var action: InlineWebhookDiscussionEditedActionX66d8be77
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

    public var changes: InlineWebhookDiscussionEditedChangesX0133b77c? = null

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public fun build(): WebhookDiscussionEdited {
      check(actionValue != null) { "action is required" }
      check(discussionValue != null) { "discussion is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookDiscussionEdited(
        action = action,
        discussion = discussion,
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
    public fun build(block: Builder.() -> Unit): WebhookDiscussionEdited = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookDiscussionEdited> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookDiscussionEdited {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookDiscussionEdited")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookDiscussionEdited must be a JSON object")
      val action = json.decodeRequired<InlineWebhookDiscussionEditedActionX66d8be77>(rawObject, "action")
      val discussion = json.decodeRequired<Discussion>(rawObject, "discussion")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookDiscussionEdited(
        action = action,
        discussion = discussion,
        repository = repository,
        sender = sender,
        changes = rawObject["changes"]?.let { json.decodeFromJsonElement<InlineWebhookDiscussionEditedChangesX0133b77c>(it) },
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookDiscussionEdited) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookDiscussionEdited")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("discussion", json.encodeToJsonElement(value.discussion))
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

public fun webhookDiscussionEdited(block: WebhookDiscussionEdited.Builder.() -> Unit): WebhookDiscussionEdited = WebhookDiscussionEdited.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookDiscussionEdited is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
