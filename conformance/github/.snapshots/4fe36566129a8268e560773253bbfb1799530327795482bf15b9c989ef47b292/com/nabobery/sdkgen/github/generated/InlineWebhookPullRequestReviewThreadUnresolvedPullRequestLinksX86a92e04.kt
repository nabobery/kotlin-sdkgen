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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/pull_reques
 * t/properties/_links.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/pull_reques
 * t/properties/_links
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksX86a92e04.Serializer::class)
public class InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksX86a92e04(
  public val comments:
      InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommentsXfa2f854f,
  public val commits:
      InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommitsX245824c8,
  public val html: InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksHtmlX817dd5cb,
  public val issue: InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksIssueXa60531aa,
  public val reviewComment: InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentXed2021a4,
  public val reviewComments: InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentsX431324ea,
  public val self: InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksSelfX23ff2112,
  public val statuses:
      InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksStatusesX642c4737,
) {
  public class Builder {
    private var commentsValue:
        InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommentsXfa2f854f? = null

    public var comments:
        InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommentsXfa2f854f
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue:
        InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommitsX245824c8? = null

    public var commits:
        InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommitsX245824c8
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue:
        InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksHtmlX817dd5cb? = null

    public var html: InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksHtmlX817dd5cb
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue:
        InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksIssueXa60531aa? = null

    public var issue: InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksIssueXa60531aa
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentXed2021a4? = null

    public var reviewComment: InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentXed2021a4
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentsX431324ea? = null

    public var reviewComments: InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentsX431324ea
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue:
        InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksSelfX23ff2112? = null

    public var self: InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksSelfX23ff2112
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue:
        InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksStatusesX642c4737? = null

    public var statuses:
        InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksStatusesX642c4737
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksX86a92e04 {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksX86a92e04(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksX86a92e04 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksX86a92e04> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksX86a92e04 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksX86a92e04")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksX86a92e04 must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommentsXfa2f854f>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommitsX245824c8>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksHtmlX817dd5cb>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksIssueXa60531aa>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentXed2021a4>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentsX431324ea>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksSelfX23ff2112>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksStatusesX642c4737>(rawObject, "statuses")
      return InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksX86a92e04(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksX86a92e04) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksX86a92e04")
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

public fun inlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksX86a92e04(block: InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksX86a92e04.Builder.() -> Unit): InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksX86a92e04 = InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksX86a92e04.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksX86a92e04 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
