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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed
 */
@Serializable(with = WebhookPullRequestReviewDismissed.Serializer::class)
public class WebhookPullRequestReviewDismissed(
  public val action: InlineWebhookPullRequestReviewDismissedActionX2027caa7,
  public val pullRequest: InlineWebhookPullRequestReviewDismissedPullRequestX172aa877,
  public val repository: RepositoryWebhooks,
  /**
   * The review that was affected.
   */
  public val review: InlineWebhookPullRequestReviewDismissedReviewX7bd70b12,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookPullRequestReviewDismissedActionX2027caa7? = null

    public var action: InlineWebhookPullRequestReviewDismissedActionX2027caa7
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var pullRequestValue: InlineWebhookPullRequestReviewDismissedPullRequestX172aa877? =
        null

    public var pullRequest: InlineWebhookPullRequestReviewDismissedPullRequestX172aa877
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

    private var reviewValue: InlineWebhookPullRequestReviewDismissedReviewX7bd70b12? = null

    public var review: InlineWebhookPullRequestReviewDismissedReviewX7bd70b12
      get() = requireNotNull(reviewValue) { "review is required" }
      set(`value`) {
        reviewValue = value
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

    public fun build(): WebhookPullRequestReviewDismissed {
      check(actionValue != null) { "action is required" }
      check(pullRequestValue != null) { "pullRequest is required" }
      check(repositoryValue != null) { "repository is required" }
      check(reviewValue != null) { "review is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookPullRequestReviewDismissed(
        action = action,
        pullRequest = pullRequest,
        repository = repository,
        review = review,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookPullRequestReviewDismissed = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookPullRequestReviewDismissed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookPullRequestReviewDismissed {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookPullRequestReviewDismissed")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookPullRequestReviewDismissed must be a JSON object")
      val action = json.decodeRequired<InlineWebhookPullRequestReviewDismissedActionX2027caa7>(rawObject, "action")
      val pullRequest = json.decodeRequired<InlineWebhookPullRequestReviewDismissedPullRequestX172aa877>(rawObject, "pull_request")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val review = json.decodeRequired<InlineWebhookPullRequestReviewDismissedReviewX7bd70b12>(rawObject, "review")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookPullRequestReviewDismissed(
        action = action,
        pullRequest = pullRequest,
        repository = repository,
        review = review,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookPullRequestReviewDismissed) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookPullRequestReviewDismissed")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("pull_request", json.encodeToJsonElement(value.pullRequest))
        put("repository", json.encodeToJsonElement(value.repository))
        put("review", json.encodeToJsonElement(value.review))
        put("sender", json.encodeToJsonElement(value.sender))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookPullRequestReviewDismissed(block: WebhookPullRequestReviewDismissed.Builder.() -> Unit): WebhookPullRequestReviewDismissed = WebhookPullRequestReviewDismissed.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookPullRequestReviewDismissed is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
