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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/_li
 * nks.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/_li
 * nks
 */
@Serializable(with = InlineWebhookPullRequestEnqueuedPullRequestLinksXbabb8c6b.Serializer::class)
public class InlineWebhookPullRequestEnqueuedPullRequestLinksXbabb8c6b(
  public val comments: InlineWebhookPullRequestEnqueuedPullRequestLinksCommentsX6699978c,
  public val commits: InlineWebhookPullRequestEnqueuedPullRequestLinksCommitsXcd856495,
  public val html: InlineWebhookPullRequestEnqueuedPullRequestLinksHtmlXb01a81aa,
  public val issue: InlineWebhookPullRequestEnqueuedPullRequestLinksIssueXe8d31a08,
  public val reviewComment: InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentXd284cea6,
  public val reviewComments:
      InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentsX685d59af,
  public val self: InlineWebhookPullRequestEnqueuedPullRequestLinksSelfXc7f086c2,
  public val statuses: InlineWebhookPullRequestEnqueuedPullRequestLinksStatusesX5a601a4b,
) {
  public class Builder {
    private var commentsValue: InlineWebhookPullRequestEnqueuedPullRequestLinksCommentsX6699978c? =
        null

    public var comments: InlineWebhookPullRequestEnqueuedPullRequestLinksCommentsX6699978c
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue: InlineWebhookPullRequestEnqueuedPullRequestLinksCommitsXcd856495? =
        null

    public var commits: InlineWebhookPullRequestEnqueuedPullRequestLinksCommitsXcd856495
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue: InlineWebhookPullRequestEnqueuedPullRequestLinksHtmlXb01a81aa? = null

    public var html: InlineWebhookPullRequestEnqueuedPullRequestLinksHtmlXb01a81aa
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue: InlineWebhookPullRequestEnqueuedPullRequestLinksIssueXe8d31a08? = null

    public var issue: InlineWebhookPullRequestEnqueuedPullRequestLinksIssueXe8d31a08
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentXd284cea6? = null

    public var reviewComment: InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentXd284cea6
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentsX685d59af? = null

    public var reviewComments:
        InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentsX685d59af
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue: InlineWebhookPullRequestEnqueuedPullRequestLinksSelfXc7f086c2? = null

    public var self: InlineWebhookPullRequestEnqueuedPullRequestLinksSelfXc7f086c2
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue: InlineWebhookPullRequestEnqueuedPullRequestLinksStatusesX5a601a4b? =
        null

    public var statuses: InlineWebhookPullRequestEnqueuedPullRequestLinksStatusesX5a601a4b
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestEnqueuedPullRequestLinksXbabb8c6b {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestEnqueuedPullRequestLinksXbabb8c6b(
        comments = comments,
        commits = commits,
        html = html,
        issue = issue,
        reviewComment = reviewComment,
        reviewComments = reviewComments,
        self = self,
        statuses = statuses,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestEnqueuedPullRequestLinksXbabb8c6b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestEnqueuedPullRequestLinksXbabb8c6b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEnqueuedPullRequestLinksXbabb8c6b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestEnqueuedPullRequestLinksXbabb8c6b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestEnqueuedPullRequestLinksXbabb8c6b must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestEnqueuedPullRequestLinksCommentsX6699978c>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestEnqueuedPullRequestLinksCommitsXcd856495>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestEnqueuedPullRequestLinksHtmlXb01a81aa>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestEnqueuedPullRequestLinksIssueXe8d31a08>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentXd284cea6>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentsX685d59af>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestEnqueuedPullRequestLinksSelfXc7f086c2>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestEnqueuedPullRequestLinksStatusesX5a601a4b>(rawObject, "statuses")
      return InlineWebhookPullRequestEnqueuedPullRequestLinksXbabb8c6b(
        comments = comments,
        commits = commits,
        html = html,
        issue = issue,
        reviewComment = reviewComment,
        reviewComments = reviewComments,
        self = self,
        statuses = statuses,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEnqueuedPullRequestLinksXbabb8c6b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestEnqueuedPullRequestLinksXbabb8c6b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("comments", json.encodeToJsonElement(value.comments))
        put("commits", json.encodeToJsonElement(value.commits))
        put("html", json.encodeToJsonElement(value.html))
        put("issue", json.encodeToJsonElement(value.issue))
        put("review_comment", json.encodeToJsonElement(value.reviewComment))
        put("review_comments", json.encodeToJsonElement(value.reviewComments))
        put("self", json.encodeToJsonElement(value.self))
        put("statuses", json.encodeToJsonElement(value.statuses))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestEnqueuedPullRequestLinksXbabb8c6b(block: InlineWebhookPullRequestEnqueuedPullRequestLinksXbabb8c6b.Builder.() -> Unit): InlineWebhookPullRequestEnqueuedPullRequestLinksXbabb8c6b = InlineWebhookPullRequestEnqueuedPullRequestLinksXbabb8c6b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestEnqueuedPullRequestLinksXbabb8c6b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
