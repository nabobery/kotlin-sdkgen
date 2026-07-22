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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-category-changed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-category-changed
 */
@Serializable(with = WebhookDiscussionCategoryChanged.Serializer::class)
public class WebhookDiscussionCategoryChanged(
  public val action: InlineWebhookDiscussionCategoryChangedActionX49f2ffde,
  public val changes: InlineWebhookDiscussionCategoryChangedChangesX23ce6119,
  public val discussion: Discussion,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookDiscussionCategoryChangedActionX49f2ffde? = null

    public var action: InlineWebhookDiscussionCategoryChangedActionX49f2ffde
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var changesValue: InlineWebhookDiscussionCategoryChangedChangesX23ce6119? = null

    public var changes: InlineWebhookDiscussionCategoryChangedChangesX23ce6119
      get() = requireNotNull(changesValue) { "changes is required" }
      set(`value`) {
        changesValue = value
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

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public fun build(): WebhookDiscussionCategoryChanged {
      check(actionValue != null) { "action is required" }
      check(changesValue != null) { "changes is required" }
      check(discussionValue != null) { "discussion is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookDiscussionCategoryChanged(
        action = action,
        changes = changes,
        discussion = discussion,
        repository = repository,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookDiscussionCategoryChanged = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookDiscussionCategoryChanged> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookDiscussionCategoryChanged {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookDiscussionCategoryChanged")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookDiscussionCategoryChanged must be a JSON object")
      val action = json.decodeRequired<InlineWebhookDiscussionCategoryChangedActionX49f2ffde>(rawObject, "action")
      val changes = json.decodeRequired<InlineWebhookDiscussionCategoryChangedChangesX23ce6119>(rawObject, "changes")
      val discussion = json.decodeRequired<Discussion>(rawObject, "discussion")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookDiscussionCategoryChanged(
        action = action,
        changes = changes,
        discussion = discussion,
        repository = repository,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookDiscussionCategoryChanged) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookDiscussionCategoryChanged")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("changes", json.encodeToJsonElement(value.changes))
        put("discussion", json.encodeToJsonElement(value.discussion))
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

public fun webhookDiscussionCategoryChanged(block: WebhookDiscussionCategoryChanged.Builder.() -> Unit): WebhookDiscussionCategoryChanged = WebhookDiscussionCategoryChanged.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookDiscussionCategoryChanged is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
