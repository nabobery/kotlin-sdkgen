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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request/proper
 * ties/_links.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request/proper
 * ties/_links
 */
@Serializable(with = InlineWebhookPullRequestReviewDismissedPullRequestLinksX7a290c5e.Serializer::class)
public class InlineWebhookPullRequestReviewDismissedPullRequestLinksX7a290c5e(
  public val comments: InlineWebhookPullRequestReviewDismissedPullRequestLinksCommentsXb48db1a0,
  public val commits: InlineWebhookPullRequestReviewDismissedPullRequestLinksCommitsX8fc2340f,
  public val html: InlineWebhookPullRequestReviewDismissedPullRequestLinksHtmlX965690fb,
  public val issue: InlineWebhookPullRequestReviewDismissedPullRequestLinksIssueX2fac118b,
  public val reviewComment:
      InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentX30edfc47,
  public val reviewComments:
      InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentsX90399bde,
  public val self: InlineWebhookPullRequestReviewDismissedPullRequestLinksSelfX3452e046,
  public val statuses: InlineWebhookPullRequestReviewDismissedPullRequestLinksStatusesXac10fd39,
) {
  public class Builder {
    private var commentsValue:
        InlineWebhookPullRequestReviewDismissedPullRequestLinksCommentsXb48db1a0? = null

    public var comments: InlineWebhookPullRequestReviewDismissedPullRequestLinksCommentsXb48db1a0
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue:
        InlineWebhookPullRequestReviewDismissedPullRequestLinksCommitsX8fc2340f? = null

    public var commits: InlineWebhookPullRequestReviewDismissedPullRequestLinksCommitsX8fc2340f
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue: InlineWebhookPullRequestReviewDismissedPullRequestLinksHtmlX965690fb? =
        null

    public var html: InlineWebhookPullRequestReviewDismissedPullRequestLinksHtmlX965690fb
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue: InlineWebhookPullRequestReviewDismissedPullRequestLinksIssueX2fac118b? =
        null

    public var issue: InlineWebhookPullRequestReviewDismissedPullRequestLinksIssueX2fac118b
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentX30edfc47? = null

    public var reviewComment:
        InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentX30edfc47
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentsX90399bde? = null

    public var reviewComments:
        InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentsX90399bde
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue: InlineWebhookPullRequestReviewDismissedPullRequestLinksSelfX3452e046? =
        null

    public var self: InlineWebhookPullRequestReviewDismissedPullRequestLinksSelfX3452e046
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue:
        InlineWebhookPullRequestReviewDismissedPullRequestLinksStatusesXac10fd39? = null

    public var statuses: InlineWebhookPullRequestReviewDismissedPullRequestLinksStatusesXac10fd39
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewDismissedPullRequestLinksX7a290c5e {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestReviewDismissedPullRequestLinksX7a290c5e(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewDismissedPullRequestLinksX7a290c5e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewDismissedPullRequestLinksX7a290c5e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewDismissedPullRequestLinksX7a290c5e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewDismissedPullRequestLinksX7a290c5e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewDismissedPullRequestLinksX7a290c5e must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestReviewDismissedPullRequestLinksCommentsXb48db1a0>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestReviewDismissedPullRequestLinksCommitsX8fc2340f>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestReviewDismissedPullRequestLinksHtmlX965690fb>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestReviewDismissedPullRequestLinksIssueX2fac118b>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentX30edfc47>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentsX90399bde>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestReviewDismissedPullRequestLinksSelfX3452e046>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestReviewDismissedPullRequestLinksStatusesXac10fd39>(rawObject, "statuses")
      return InlineWebhookPullRequestReviewDismissedPullRequestLinksX7a290c5e(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewDismissedPullRequestLinksX7a290c5e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewDismissedPullRequestLinksX7a290c5e")
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

public fun inlineWebhookPullRequestReviewDismissedPullRequestLinksX7a290c5e(block: InlineWebhookPullRequestReviewDismissedPullRequestLinksX7a290c5e.Builder.() -> Unit): InlineWebhookPullRequestReviewDismissedPullRequestLinksX7a290c5e = InlineWebhookPullRequestReviewDismissedPullRequestLinksX7a290c5e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewDismissedPullRequestLinksX7a290c5e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
