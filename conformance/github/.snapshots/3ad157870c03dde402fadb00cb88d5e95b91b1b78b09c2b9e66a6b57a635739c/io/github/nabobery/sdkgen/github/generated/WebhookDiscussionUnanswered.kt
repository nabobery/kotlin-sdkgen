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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-unanswered.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-unanswered
 */
@Serializable(with = WebhookDiscussionUnanswered.Serializer::class)
public class WebhookDiscussionUnanswered(
  public val action: InlineWebhookDiscussionUnansweredActionXc66d0edd,
  public val discussion: Discussion,
  public val oldAnswer: WebhooksAnswer,
  public val repository: RepositoryWebhooks,
  public val organization: OrganizationSimpleWebhooks? = null,
  public val sender: SimpleUser? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookDiscussionUnansweredActionXc66d0edd? = null

    public var action: InlineWebhookDiscussionUnansweredActionXc66d0edd
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

    private var oldAnswerValue: WebhooksAnswer? = null

    public var oldAnswer: WebhooksAnswer
      get() = requireNotNull(oldAnswerValue) { "oldAnswer is required" }
      set(`value`) {
        oldAnswerValue = value
      }

    private var repositoryValue: RepositoryWebhooks? = null

    public var repository: RepositoryWebhooks
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    public var organization: OrganizationSimpleWebhooks? = null

    public var sender: SimpleUser? = null

    public fun build(): WebhookDiscussionUnanswered {
      check(actionValue != null) { "action is required" }
      check(discussionValue != null) { "discussion is required" }
      check(oldAnswerValue != null) { "oldAnswer is required" }
      check(repositoryValue != null) { "repository is required" }
      return WebhookDiscussionUnanswered(
        action = action,
        discussion = discussion,
        oldAnswer = oldAnswer,
        repository = repository,
        organization = organization,
        sender = sender,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookDiscussionUnanswered = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookDiscussionUnanswered> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookDiscussionUnanswered {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookDiscussionUnanswered")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookDiscussionUnanswered must be a JSON object")
      val action = json.decodeRequired<InlineWebhookDiscussionUnansweredActionXc66d0edd>(rawObject, "action")
      val discussion = json.decodeRequired<Discussion>(rawObject, "discussion")
      val oldAnswer = json.decodeRequired<WebhooksAnswer>(rawObject, "old_answer")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      return WebhookDiscussionUnanswered(
        action = action,
        discussion = discussion,
        oldAnswer = oldAnswer,
        repository = repository,
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
        sender = rawObject["sender"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookDiscussionUnanswered) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookDiscussionUnanswered")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("discussion", json.encodeToJsonElement(value.discussion))
        put("old_answer", json.encodeToJsonElement(value.oldAnswer))
        put("repository", json.encodeToJsonElement(value.repository))
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.sender?.let { put("sender", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webhookDiscussionUnanswered(block: WebhookDiscussionUnanswered.Builder.() -> Unit): WebhookDiscussionUnanswered = WebhookDiscussionUnanswered.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookDiscussionUnanswered is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
