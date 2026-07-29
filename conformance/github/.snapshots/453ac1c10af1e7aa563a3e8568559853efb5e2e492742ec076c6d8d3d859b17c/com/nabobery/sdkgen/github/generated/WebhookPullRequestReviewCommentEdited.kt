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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited
 */
@Serializable(with = WebhookPullRequestReviewCommentEdited.Serializer::class)
public class WebhookPullRequestReviewCommentEdited(
  public val action: InlineWebhookPullRequestReviewCommentEditedActionX46820e27,
  public val changes: WebhooksChanges,
  public val comment: WebhooksReviewComment,
  public val pullRequest: InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookPullRequestReviewCommentEditedActionX46820e27? = null

    public var action: InlineWebhookPullRequestReviewCommentEditedActionX46820e27
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var changesValue: WebhooksChanges? = null

    public var changes: WebhooksChanges
      get() = requireNotNull(changesValue) { "changes is required" }
      set(`value`) {
        changesValue = value
      }

    private var commentValue: WebhooksReviewComment? = null

    public var comment: WebhooksReviewComment
      get() = requireNotNull(commentValue) { "comment is required" }
      set(`value`) {
        commentValue = value
      }

    private var pullRequestValue: InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e? =
        null

    public var pullRequest: InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e
      get() = requireNotNull(pullRequestValue) { "pullRequest is required" }
      set(`value`) {
        pullRequestValue = value
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

    public fun build(): WebhookPullRequestReviewCommentEdited {
      check(actionValue != null) { "action is required" }
      check(changesValue != null) { "changes is required" }
      check(commentValue != null) { "comment is required" }
      check(pullRequestValue != null) { "pullRequest is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookPullRequestReviewCommentEdited(
        action = action,
        changes = changes,
        comment = comment,
        pullRequest = pullRequest,
        repository = repository,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookPullRequestReviewCommentEdited = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookPullRequestReviewCommentEdited> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookPullRequestReviewCommentEdited {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookPullRequestReviewCommentEdited")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookPullRequestReviewCommentEdited must be a JSON object")
      val action = json.decodeRequired<InlineWebhookPullRequestReviewCommentEditedActionX46820e27>(rawObject, "action")
      val changes = json.decodeRequired<WebhooksChanges>(rawObject, "changes")
      val comment = json.decodeRequired<WebhooksReviewComment>(rawObject, "comment")
      val pullRequest = json.decodeRequired<InlineWebhookPullRequestReviewCommentEditedPullRequestXa49ad21e>(rawObject, "pull_request")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookPullRequestReviewCommentEdited(
        action = action,
        changes = changes,
        comment = comment,
        pullRequest = pullRequest,
        repository = repository,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookPullRequestReviewCommentEdited) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookPullRequestReviewCommentEdited")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("changes", json.encodeToJsonElement(value.changes))
        put("comment", json.encodeToJsonElement(value.comment))
        put("pull_request", json.encodeToJsonElement(value.pullRequest))
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

public fun webhookPullRequestReviewCommentEdited(block: WebhookPullRequestReviewCommentEdited.Builder.() -> Unit): WebhookPullRequestReviewCommentEdited = WebhookPullRequestReviewCommentEdited.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookPullRequestReviewCommentEdited is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
