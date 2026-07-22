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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-comment-edited.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-comment-edited
 */
@Serializable(with = WebhookDiscussionCommentEdited.Serializer::class)
public class WebhookDiscussionCommentEdited(
  public val action: InlineWebhookDiscussionCommentEditedActionX2eb80808,
  public val changes: InlineWebhookDiscussionCommentEditedChangesX5253a561,
  public val comment: WebhooksComment,
  public val discussion: Discussion,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookDiscussionCommentEditedActionX2eb80808? = null

    public var action: InlineWebhookDiscussionCommentEditedActionX2eb80808
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var changesValue: InlineWebhookDiscussionCommentEditedChangesX5253a561? = null

    public var changes: InlineWebhookDiscussionCommentEditedChangesX5253a561
      get() = requireNotNull(changesValue) { "changes is required" }
      set(`value`) {
        changesValue = value
      }

    private var commentValue: WebhooksComment? = null

    public var comment: WebhooksComment
      get() = requireNotNull(commentValue) { "comment is required" }
      set(`value`) {
        commentValue = value
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

    public fun build(): WebhookDiscussionCommentEdited {
      check(actionValue != null) { "action is required" }
      check(changesValue != null) { "changes is required" }
      check(commentValue != null) { "comment is required" }
      check(discussionValue != null) { "discussion is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookDiscussionCommentEdited(
        action = action,
        changes = changes,
        comment = comment,
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
    public fun build(block: Builder.() -> Unit): WebhookDiscussionCommentEdited = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookDiscussionCommentEdited> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookDiscussionCommentEdited {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookDiscussionCommentEdited")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookDiscussionCommentEdited must be a JSON object")
      val action = json.decodeRequired<InlineWebhookDiscussionCommentEditedActionX2eb80808>(rawObject, "action")
      val changes = json.decodeRequired<InlineWebhookDiscussionCommentEditedChangesX5253a561>(rawObject, "changes")
      val comment = json.decodeRequired<WebhooksComment>(rawObject, "comment")
      val discussion = json.decodeRequired<Discussion>(rawObject, "discussion")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookDiscussionCommentEdited(
        action = action,
        changes = changes,
        comment = comment,
        discussion = discussion,
        repository = repository,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookDiscussionCommentEdited) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookDiscussionCommentEdited")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("changes", json.encodeToJsonElement(value.changes))
        put("comment", json.encodeToJsonElement(value.comment))
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

public fun webhookDiscussionCommentEdited(block: WebhookDiscussionCommentEdited.Builder.() -> Unit): WebhookDiscussionCommentEdited = WebhookDiscussionCommentEdited.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookDiscussionCommentEdited is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
