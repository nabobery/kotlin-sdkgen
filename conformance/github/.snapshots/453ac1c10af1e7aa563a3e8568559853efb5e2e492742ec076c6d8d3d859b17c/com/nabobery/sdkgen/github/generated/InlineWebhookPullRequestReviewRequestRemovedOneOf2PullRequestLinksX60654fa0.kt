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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/1/properties/pull_
 * request/properties/_links.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/1/properties/pull_
 * request/properties/_links
 */
@Serializable(with = InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksX60654fa0.Serializer::class)
public class InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksX60654fa0(
  public val comments: InlineWebhookPullRequestReacd1OneOf2PullRequestLinksCommentsX7d0bb6d6,
  public val commits: InlineWebhookPullRequestReacd1OneOf2PullRequestLinksCommitsXa3d58c24,
  public val html: InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksHtmlXadfd78e8,
  public val issue:
      InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksIssueX88907c90,
  public val reviewComment:
      InlineWebhookPullRequestReacd1OneOf2PullRequestLinksReviewCommentX68b25d25,
  public val reviewComments:
      InlineWebhookPullRequestReacd1OneOf2PullRequestLinksReviewCommentsX422b95b8,
  public val self: InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksSelfXf80662e4,
  public val statuses: InlineWebhookPullRequestReacd1OneOf2PullRequestLinksStatusesX7d57460c,
) {
  public class Builder {
    private var commentsValue:
        InlineWebhookPullRequestReacd1OneOf2PullRequestLinksCommentsX7d0bb6d6? = null

    public var comments: InlineWebhookPullRequestReacd1OneOf2PullRequestLinksCommentsX7d0bb6d6
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue: InlineWebhookPullRequestReacd1OneOf2PullRequestLinksCommitsXa3d58c24?
        = null

    public var commits: InlineWebhookPullRequestReacd1OneOf2PullRequestLinksCommitsXa3d58c24
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue:
        InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksHtmlXadfd78e8? = null

    public var html: InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksHtmlXadfd78e8
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue:
        InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksIssueX88907c90? = null

    public var issue:
        InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksIssueX88907c90
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestReacd1OneOf2PullRequestLinksReviewCommentX68b25d25? = null

    public var reviewComment:
        InlineWebhookPullRequestReacd1OneOf2PullRequestLinksReviewCommentX68b25d25
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestReacd1OneOf2PullRequestLinksReviewCommentsX422b95b8? = null

    public var reviewComments:
        InlineWebhookPullRequestReacd1OneOf2PullRequestLinksReviewCommentsX422b95b8
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue:
        InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksSelfXf80662e4? = null

    public var self: InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksSelfXf80662e4
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue:
        InlineWebhookPullRequestReacd1OneOf2PullRequestLinksStatusesX7d57460c? = null

    public var statuses: InlineWebhookPullRequestReacd1OneOf2PullRequestLinksStatusesX7d57460c
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksX60654fa0 {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksX60654fa0(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksX60654fa0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksX60654fa0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksX60654fa0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksX60654fa0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksX60654fa0 must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestReacd1OneOf2PullRequestLinksCommentsX7d0bb6d6>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestReacd1OneOf2PullRequestLinksCommitsXa3d58c24>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksHtmlXadfd78e8>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksIssueX88907c90>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestReacd1OneOf2PullRequestLinksReviewCommentX68b25d25>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestReacd1OneOf2PullRequestLinksReviewCommentsX422b95b8>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksSelfXf80662e4>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestReacd1OneOf2PullRequestLinksStatusesX7d57460c>(rawObject, "statuses")
      return InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksX60654fa0(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksX60654fa0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksX60654fa0")
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

public fun inlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksX60654fa0(block: InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksX60654fa0.Builder.() -> Unit): InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksX60654fa0 = InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksX60654fa0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewRequestRemovedOneOf2PullRequestLinksX60654fa0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
