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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited
 */
@Serializable(with = WebhookPullRequestReviewEdited.Serializer::class)
public class WebhookPullRequestReviewEdited(
  public val action: InlineWebhookPullRequestReviewEditedActionXdfc277b2,
  public val changes: InlineWebhookPullRequestReviewEditedChangesXdfbf20ae,
  public val pullRequest: InlineWebhookPullRequestReviewEditedPullRequestX0d6214dd,
  public val repository: RepositoryWebhooks,
  public val review: WebhooksReview,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookPullRequestReviewEditedActionXdfc277b2? = null

    public var action: InlineWebhookPullRequestReviewEditedActionXdfc277b2
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var changesValue: InlineWebhookPullRequestReviewEditedChangesXdfbf20ae? = null

    public var changes: InlineWebhookPullRequestReviewEditedChangesXdfbf20ae
      get() = requireNotNull(changesValue) { "changes is required" }
      set(`value`) {
        changesValue = value
      }

    private var pullRequestValue: InlineWebhookPullRequestReviewEditedPullRequestX0d6214dd? = null

    public var pullRequest: InlineWebhookPullRequestReviewEditedPullRequestX0d6214dd
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

    private var reviewValue: WebhooksReview? = null

    public var review: WebhooksReview
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

    public fun build(): WebhookPullRequestReviewEdited {
      check(actionValue != null) { "action is required" }
      check(changesValue != null) { "changes is required" }
      check(pullRequestValue != null) { "pullRequest is required" }
      check(repositoryValue != null) { "repository is required" }
      check(reviewValue != null) { "review is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookPullRequestReviewEdited(
        action = action,
        changes = changes,
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
    public fun build(block: Builder.() -> Unit): WebhookPullRequestReviewEdited = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookPullRequestReviewEdited> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookPullRequestReviewEdited {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookPullRequestReviewEdited")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookPullRequestReviewEdited must be a JSON object")
      val action = json.decodeRequired<InlineWebhookPullRequestReviewEditedActionXdfc277b2>(rawObject, "action")
      val changes = json.decodeRequired<InlineWebhookPullRequestReviewEditedChangesXdfbf20ae>(rawObject, "changes")
      val pullRequest = json.decodeRequired<InlineWebhookPullRequestReviewEditedPullRequestX0d6214dd>(rawObject, "pull_request")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val review = json.decodeRequired<WebhooksReview>(rawObject, "review")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookPullRequestReviewEdited(
        action = action,
        changes = changes,
        pullRequest = pullRequest,
        repository = repository,
        review = review,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookPullRequestReviewEdited) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookPullRequestReviewEdited")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("changes", json.encodeToJsonElement(value.changes))
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

public fun webhookPullRequestReviewEdited(block: WebhookPullRequestReviewEdited.Builder.() -> Unit): WebhookPullRequestReviewEdited = WebhookPullRequestReviewEdited.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookPullRequestReviewEdited is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
