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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created
 */
@Serializable(with = WebhookPullRequestReviewCommentCreated.Serializer::class)
public class WebhookPullRequestReviewCommentCreated(
  public val action: InlineWebhookPullRequestReviewCommentCreatedActionX1376e096,
  /**
   * The [comment](https://docs.github.com/rest/pulls/comments#get-a-review-comment-for-a-pull-request) itself.
   */
  public val comment: InlineWebhookPullRequestReviewCommentCreatedCommentX8dfec101,
  public val pullRequest: InlineWebhookPullRequestReviewCommentCreatedPullRequestXaf02d4c7,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookPullRequestReviewCommentCreatedActionX1376e096? = null

    public var action: InlineWebhookPullRequestReviewCommentCreatedActionX1376e096
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var commentValue: InlineWebhookPullRequestReviewCommentCreatedCommentX8dfec101? = null

    public var comment: InlineWebhookPullRequestReviewCommentCreatedCommentX8dfec101
      get() = requireNotNull(commentValue) { "comment is required" }
      set(`value`) {
        commentValue = value
      }

    private var pullRequestValue: InlineWebhookPullRequestReviewCommentCreatedPullRequestXaf02d4c7?
        = null

    public var pullRequest: InlineWebhookPullRequestReviewCommentCreatedPullRequestXaf02d4c7
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

    public fun build(): WebhookPullRequestReviewCommentCreated {
      check(actionValue != null) { "action is required" }
      check(commentValue != null) { "comment is required" }
      check(pullRequestValue != null) { "pullRequest is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookPullRequestReviewCommentCreated(
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
    public fun build(block: Builder.() -> Unit): WebhookPullRequestReviewCommentCreated = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookPullRequestReviewCommentCreated> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookPullRequestReviewCommentCreated {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookPullRequestReviewCommentCreated")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookPullRequestReviewCommentCreated must be a JSON object")
      val action = json.decodeRequired<InlineWebhookPullRequestReviewCommentCreatedActionX1376e096>(rawObject, "action")
      val comment = json.decodeRequired<InlineWebhookPullRequestReviewCommentCreatedCommentX8dfec101>(rawObject, "comment")
      val pullRequest = json.decodeRequired<InlineWebhookPullRequestReviewCommentCreatedPullRequestXaf02d4c7>(rawObject, "pull_request")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookPullRequestReviewCommentCreated(
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

    override fun serialize(encoder: Encoder, `value`: WebhookPullRequestReviewCommentCreated) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookPullRequestReviewCommentCreated")
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

public fun webhookPullRequestReviewCommentCreated(block: WebhookPullRequestReviewCommentCreated.Builder.() -> Unit): WebhookPullRequestReviewCommentCreated = WebhookPullRequestReviewCommentCreated.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookPullRequestReviewCommentCreated is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
