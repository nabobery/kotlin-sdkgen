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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/pull_request/
 * properties/_links.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/pull_request/
 * properties/_links
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksX713369e4.Serializer::class)
public class InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksX713369e4(
  public val comments:
      InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksCommentsX0618e504,
  public val commits: InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksCommitsX5875b0f7,
  public val html: InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksHtmlX1ddb3ba5,
  public val issue: InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksIssueX969c93b1,
  public val reviewComment: InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentXadd8cd71,
  public val reviewComments: InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentsXb5688a00,
  public val self: InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksSelfX23b53c0d,
  public val statuses:
      InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksStatusesX7eab5d89,
) {
  public class Builder {
    private var commentsValue:
        InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksCommentsX0618e504? = null

    public var comments:
        InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksCommentsX0618e504
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue:
        InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksCommitsX5875b0f7? = null

    public var commits: InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksCommitsX5875b0f7
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue:
        InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksHtmlX1ddb3ba5? = null

    public var html: InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksHtmlX1ddb3ba5
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue:
        InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksIssueX969c93b1? = null

    public var issue: InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksIssueX969c93b1
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentXadd8cd71? = null

    public var reviewComment: InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentXadd8cd71
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentsXb5688a00? = null

    public var reviewComments: InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentsXb5688a00
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue:
        InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksSelfX23b53c0d? = null

    public var self: InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksSelfX23b53c0d
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue:
        InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksStatusesX7eab5d89? = null

    public var statuses:
        InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksStatusesX7eab5d89
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksX713369e4 {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksX713369e4(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksX713369e4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksX713369e4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksX713369e4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksX713369e4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksX713369e4 must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksCommentsX0618e504>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksCommitsX5875b0f7>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksHtmlX1ddb3ba5>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksIssueX969c93b1>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentXadd8cd71>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentsXb5688a00>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksSelfX23b53c0d>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksStatusesX7eab5d89>(rawObject, "statuses")
      return InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksX713369e4(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksX713369e4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksX713369e4")
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

public fun inlineWebhookPullRequestReviewCommentCreatedPullRequestLinksX713369e4(block: InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksX713369e4.Builder.() -> Unit): InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksX713369e4 = InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksX713369e4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksX713369e4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
