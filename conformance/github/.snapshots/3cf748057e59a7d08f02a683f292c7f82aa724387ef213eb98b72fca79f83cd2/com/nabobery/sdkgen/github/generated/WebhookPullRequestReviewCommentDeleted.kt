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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted
 */
@Serializable(with = WebhookPullRequestReviewCommentDeleted.Serializer::class)
public class WebhookPullRequestReviewCommentDeleted(
  public val action: InlineWebhookPullRequestReviewCommentDeletedActionXcd798848,
  public val comment: WebhooksReviewComment,
  public val pullRequest: InlineWebhookPullRequestReviewCommentDeletedPullRequestXe7d5aa0c,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookPullRequestReviewCommentDeletedActionXcd798848? = null

    public var action: InlineWebhookPullRequestReviewCommentDeletedActionXcd798848
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var commentValue: WebhooksReviewComment? = null

    public var comment: WebhooksReviewComment
      get() = requireNotNull(commentValue) { "comment is required" }
      set(`value`) {
        commentValue = value
      }

    private var pullRequestValue: InlineWebhookPullRequestReviewCommentDeletedPullRequestXe7d5aa0c?
        = null

    public var pullRequest: InlineWebhookPullRequestReviewCommentDeletedPullRequestXe7d5aa0c
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

    public fun build(): WebhookPullRequestReviewCommentDeleted {
      check(actionValue != null) { "action is required" }
      check(commentValue != null) { "comment is required" }
      check(pullRequestValue != null) { "pullRequest is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookPullRequestReviewCommentDeleted(
        action = action,
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
    public fun build(block: Builder.() -> Unit): WebhookPullRequestReviewCommentDeleted = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookPullRequestReviewCommentDeleted> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookPullRequestReviewCommentDeleted {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookPullRequestReviewCommentDeleted")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookPullRequestReviewCommentDeleted must be a JSON object")
      val action = json.decodeRequired<InlineWebhookPullRequestReviewCommentDeletedActionXcd798848>(rawObject, "action")
      val comment = json.decodeRequired<WebhooksReviewComment>(rawObject, "comment")
      val pullRequest = json.decodeRequired<InlineWebhookPullRequestReviewCommentDeletedPullRequestXe7d5aa0c>(rawObject, "pull_request")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookPullRequestReviewCommentDeleted(
        action = action,
        comment = comment,
        pullRequest = pullRequest,
        repository = repository,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookPullRequestReviewCommentDeleted) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookPullRequestReviewCommentDeleted")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
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

public fun webhookPullRequestReviewCommentDeleted(block: WebhookPullRequestReviewCommentDeleted.Builder.() -> Unit): WebhookPullRequestReviewCommentDeleted = WebhookPullRequestReviewCommentDeleted.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookPullRequestReviewCommentDeleted is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
