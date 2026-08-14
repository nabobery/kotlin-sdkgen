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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-pinned.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-pinned
 */
@Serializable(with = WebhookDiscussionPinned.Serializer::class)
public class WebhookDiscussionPinned(
  public val action: InlineWebhookDiscussionPinnedActionXee0d50f6,
  public val discussion: Discussion,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookDiscussionPinnedActionXee0d50f6? = null

    public var action: InlineWebhookDiscussionPinnedActionXee0d50f6
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

    public fun build(): WebhookDiscussionPinned {
      check(actionValue != null) { "action is required" }
      check(discussionValue != null) { "discussion is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookDiscussionPinned(
        action = action,
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
    public fun build(block: Builder.() -> Unit): WebhookDiscussionPinned = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookDiscussionPinned> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookDiscussionPinned {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookDiscussionPinned")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookDiscussionPinned must be a JSON object")
      val action = json.decodeRequired<InlineWebhookDiscussionPinnedActionXee0d50f6>(rawObject, "action")
      val discussion = json.decodeRequired<Discussion>(rawObject, "discussion")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookDiscussionPinned(
        action = action,
        discussion = discussion,
        repository = repository,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookDiscussionPinned) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookDiscussionPinned")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
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

public fun webhookDiscussionPinned(block: WebhookDiscussionPinned.Builder.() -> Unit): WebhookDiscussionPinned = WebhookDiscussionPinned.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookDiscussionPinned is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
