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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-answered.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-answered
 */
@Serializable(with = WebhookDiscussionAnswered.Serializer::class)
public class WebhookDiscussionAnswered(
  public val action: InlineWebhookDiscussionAnsweredActionX35c07c5c,
  public val answer: WebhooksAnswer,
  public val discussion: Discussion,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookDiscussionAnsweredActionX35c07c5c? = null

    public var action: InlineWebhookDiscussionAnsweredActionX35c07c5c
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var answerValue: WebhooksAnswer? = null

    public var answer: WebhooksAnswer
      get() = requireNotNull(answerValue) { "answer is required" }
      set(`value`) {
        answerValue = value
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

    public fun build(): WebhookDiscussionAnswered {
      check(actionValue != null) { "action is required" }
      check(answerValue != null) { "answer is required" }
      check(discussionValue != null) { "discussion is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookDiscussionAnswered(
        action = action,
        answer = answer,
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
    public fun build(block: Builder.() -> Unit): WebhookDiscussionAnswered = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookDiscussionAnswered> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookDiscussionAnswered {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookDiscussionAnswered")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookDiscussionAnswered must be a JSON object")
      val action = json.decodeRequired<InlineWebhookDiscussionAnsweredActionX35c07c5c>(rawObject, "action")
      val answer = json.decodeRequired<WebhooksAnswer>(rawObject, "answer")
      val discussion = json.decodeRequired<Discussion>(rawObject, "discussion")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookDiscussionAnswered(
        action = action,
        answer = answer,
        discussion = discussion,
        repository = repository,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookDiscussionAnswered) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookDiscussionAnswered")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("answer", json.encodeToJsonElement(value.answer))
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

public fun webhookDiscussionAnswered(block: WebhookDiscussionAnswered.Builder.() -> Unit): WebhookDiscussionAnswered = WebhookDiscussionAnswered.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookDiscussionAnswered is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
