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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved
 */
@Serializable(with = WebhookPullRequestReviewThreadUnresolved.Serializer::class)
public class WebhookPullRequestReviewThreadUnresolved(
  public val action: InlineWebhookPullRequestReviewThreadUnresolvedActionX0edbe629,
  public val pullRequest: InlineWebhookPullRequestReviewThreadUnresolvedPullRequestXb4d61098,
  public val repository: RepositoryWebhooks,
  public val thread: InlineWebhookPullRequestReviewThreadUnresolvedThreadX47e58b72,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val sender: SimpleUser? = null,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookPullRequestReviewThreadUnresolvedActionX0edbe629? = null

    public var action: InlineWebhookPullRequestReviewThreadUnresolvedActionX0edbe629
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var pullRequestValue:
        InlineWebhookPullRequestReviewThreadUnresolvedPullRequestXb4d61098? = null

    public var pullRequest: InlineWebhookPullRequestReviewThreadUnresolvedPullRequestXb4d61098
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

    private var threadValue: InlineWebhookPullRequestReviewThreadUnresolvedThreadX47e58b72? = null

    public var thread: InlineWebhookPullRequestReviewThreadUnresolvedThreadX47e58b72
      get() = requireNotNull(threadValue) { "thread is required" }
      set(`value`) {
        threadValue = value
      }

    public var enterprise: EnterpriseWebhooks? = null

    public var installation: SimpleInstallation? = null

    public var organization: OrganizationSimpleWebhooks? = null

    public var sender: SimpleUser? = null

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var updatedAt: String? = null

    public fun build(): WebhookPullRequestReviewThreadUnresolved {
      check(actionValue != null) { "action is required" }
      check(pullRequestValue != null) { "pullRequest is required" }
      check(repositoryValue != null) { "repository is required" }
      check(threadValue != null) { "thread is required" }
      return WebhookPullRequestReviewThreadUnresolved(
        action = action,
        pullRequest = pullRequest,
        repository = repository,
        thread = thread,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
        sender = sender,
        updatedAt = updatedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookPullRequestReviewThreadUnresolved = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebhookPullRequestReviewThreadUnresolved> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookPullRequestReviewThreadUnresolved {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookPullRequestReviewThreadUnresolved")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookPullRequestReviewThreadUnresolved must be a JSON object")
      val action = json.decodeRequired<InlineWebhookPullRequestReviewThreadUnresolvedActionX0edbe629>(rawObject, "action")
      val pullRequest = json.decodeRequired<InlineWebhookPullRequestReviewThreadUnresolvedPullRequestXb4d61098>(rawObject, "pull_request")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val thread = json.decodeRequired<InlineWebhookPullRequestReviewThreadUnresolvedThreadX47e58b72>(rawObject, "thread")
      return WebhookPullRequestReviewThreadUnresolved(
        action = action,
        pullRequest = pullRequest,
        repository = repository,
        thread = thread,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
        updatedAt = rawObject["updated_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookPullRequestReviewThreadUnresolved) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookPullRequestReviewThreadUnresolved")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("pull_request", json.encodeToJsonElement(value.pullRequest))
        put("repository", json.encodeToJsonElement(value.repository))
        put("thread", json.encodeToJsonElement(value.thread))
        value.enterprise?.let { put("enterprise", json.encodeToJsonElement(it)) }
        value.installation?.let { put("installation", json.encodeToJsonElement(it)) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.sender?.let { put("sender", json.encodeToJsonElement(it)) }
        value.updatedAt?.let { put("updated_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookPullRequestReviewThreadUnresolved(block: WebhookPullRequestReviewThreadUnresolved.Builder.() -> Unit): WebhookPullRequestReviewThreadUnresolved = WebhookPullRequestReviewThreadUnresolved.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookPullRequestReviewThreadUnresolved is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
