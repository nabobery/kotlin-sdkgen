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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/0/properties/pull_
 * request/properties/_links.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/0/properties/pull_
 * request/properties/_links
 */
@Serializable(with = InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksXd1f9573c.Serializer::class)
public class InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksXd1f9573c(
  public val comments: InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommentsX330b748a,
  public val commits: InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommitsX5bf5416c,
  public val html: InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksHtmlXfc6efe53,
  public val issue:
      InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksIssueXe997a625,
  public val reviewComment:
      InlineWebhookPullRequestReacd1OneOf1PullRequestLinksReviewCommentXc77847ff,
  public val reviewComments:
      InlineWebhookPullRequestReacd1OneOf1PullRequestLinksReviewCommentsXac9c6669,
  public val self: InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksSelfX4c18d662,
  public val statuses: InlineWebhookPullRequestReacd1OneOf1PullRequestLinksStatusesXd30fb903,
) {
  public class Builder {
    private var commentsValue:
        InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommentsX330b748a? = null

    public var comments: InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommentsX330b748a
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue: InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommitsX5bf5416c?
        = null

    public var commits: InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommitsX5bf5416c
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue:
        InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksHtmlXfc6efe53? = null

    public var html: InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksHtmlXfc6efe53
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue:
        InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksIssueXe997a625? = null

    public var issue:
        InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksIssueXe997a625
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestReacd1OneOf1PullRequestLinksReviewCommentXc77847ff? = null

    public var reviewComment:
        InlineWebhookPullRequestReacd1OneOf1PullRequestLinksReviewCommentXc77847ff
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestReacd1OneOf1PullRequestLinksReviewCommentsXac9c6669? = null

    public var reviewComments:
        InlineWebhookPullRequestReacd1OneOf1PullRequestLinksReviewCommentsXac9c6669
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue:
        InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksSelfX4c18d662? = null

    public var self: InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksSelfX4c18d662
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue:
        InlineWebhookPullRequestReacd1OneOf1PullRequestLinksStatusesXd30fb903? = null

    public var statuses: InlineWebhookPullRequestReacd1OneOf1PullRequestLinksStatusesXd30fb903
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksXd1f9573c {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksXd1f9573c(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksXd1f9573c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksXd1f9573c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksXd1f9573c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksXd1f9573c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksXd1f9573c must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommentsX330b748a>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommitsX5bf5416c>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksHtmlXfc6efe53>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksIssueXe997a625>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestReacd1OneOf1PullRequestLinksReviewCommentXc77847ff>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestReacd1OneOf1PullRequestLinksReviewCommentsXac9c6669>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksSelfX4c18d662>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestReacd1OneOf1PullRequestLinksStatusesXd30fb903>(rawObject, "statuses")
      return InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksXd1f9573c(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksXd1f9573c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksXd1f9573c")
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

public fun inlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksXd1f9573c(block: InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksXd1f9573c.Builder.() -> Unit): InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksXd1f9573c = InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksXd1f9573c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksXd1f9573c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
