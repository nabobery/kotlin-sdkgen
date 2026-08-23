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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-edited.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-edited
 */
@Serializable(with = WebhookIssueCommentEdited.Serializer::class)
public class WebhookIssueCommentEdited(
  public val action: InlineWebhookIssueCommentEditedActionX5330346c,
  public val changes: WebhooksChanges,
  public val comment: WebhooksIssueComment,
  /**
   * The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) the comment belongs to.
   */
  public val issue: InlineWebhookIssueCommentEditedIssueX5e8f0c96,
  public val repository: RepositoryWebhooks,
  public val sender: SimpleUser,
  public val enterprise: EnterpriseWebhooks? = null,
  public val installation: SimpleInstallation? = null,
  public val organization: OrganizationSimpleWebhooks? = null,
) {
  public class Builder {
    private var actionValue: InlineWebhookIssueCommentEditedActionX5330346c? = null

    public var action: InlineWebhookIssueCommentEditedActionX5330346c
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

    private var commentValue: WebhooksIssueComment? = null

    public var comment: WebhooksIssueComment
      get() = requireNotNull(commentValue) { "comment is required" }
      set(`value`) {
        commentValue = value
      }

    private var issueValue: InlineWebhookIssueCommentEditedIssueX5e8f0c96? = null

    public var issue: InlineWebhookIssueCommentEditedIssueX5e8f0c96
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
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

    public fun build(): WebhookIssueCommentEdited {
      check(actionValue != null) { "action is required" }
      check(changesValue != null) { "changes is required" }
      check(commentValue != null) { "comment is required" }
      check(issueValue != null) { "issue is required" }
      check(repositoryValue != null) { "repository is required" }
      check(senderValue != null) { "sender is required" }
      return WebhookIssueCommentEdited(
        action = action,
        changes = changes,
        comment = comment,
        issue = issue,
        repository = repository,
        sender = sender,
        enterprise = enterprise,
        installation = installation,
        organization = organization,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebhookIssueCommentEdited = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebhookIssueCommentEdited> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebhookIssueCommentEdited {
      val jsonDecoder = decoder.requireJsonDecoder("WebhookIssueCommentEdited")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebhookIssueCommentEdited must be a JSON object")
      val action = json.decodeRequired<InlineWebhookIssueCommentEditedActionX5330346c>(rawObject, "action")
      val changes = json.decodeRequired<WebhooksChanges>(rawObject, "changes")
      val comment = json.decodeRequired<WebhooksIssueComment>(rawObject, "comment")
      val issue = json.decodeRequired<InlineWebhookIssueCommentEditedIssueX5e8f0c96>(rawObject, "issue")
      val repository = json.decodeRequired<RepositoryWebhooks>(rawObject, "repository")
      val sender = json.decodeRequired<SimpleUser>(rawObject, "sender")
      return WebhookIssueCommentEdited(
        action = action,
        changes = changes,
        comment = comment,
        issue = issue,
        repository = repository,
        sender = sender,
        enterprise = rawObject["enterprise"]?.let { json.decodeFromJsonElement<EnterpriseWebhooks>(it) },
        installation = rawObject["installation"]?.let { json.decodeFromJsonElement<SimpleInstallation>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<OrganizationSimpleWebhooks>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebhookIssueCommentEdited) {
      val jsonEncoder = encoder.requireJsonEncoder("WebhookIssueCommentEdited")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("changes", json.encodeToJsonElement(value.changes))
        put("comment", json.encodeToJsonElement(value.comment))
        put("issue", json.encodeToJsonElement(value.issue))
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

public fun webhookIssueCommentEdited(block: WebhookIssueCommentEdited.Builder.() -> Unit): WebhookIssueCommentEdited = WebhookIssueCommentEdited.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebhookIssueCommentEdited is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
