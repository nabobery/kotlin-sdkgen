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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/1/properties/pull_reques
 * t/properties/_links.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/1/properties/pull_reques
 * t/properties/_links
 */
@Serializable(with = InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksX70d557e3.Serializer::class)
public class InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksX70d557e3(
  public val comments:
      InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksCommentsXf8004b07,
  public val commits: InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksCommitsX6c78b303,
  public val html: InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksHtmlXcfca4e43,
  public val issue: InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksIssueX833dff61,
  public val reviewComment:
      InlineWebhookPullRequestReffb1OneOf2PullRequestLinksReviewCommentX7caa2bb4,
  public val reviewComments:
      InlineWebhookPullRequestReffb1OneOf2PullRequestLinksReviewCommentsXeb3db093,
  public val self: InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksSelfXc3097a6e,
  public val statuses:
      InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksStatusesX19c5b08d,
) {
  public class Builder {
    private var commentsValue:
        InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksCommentsXf8004b07? = null

    public var comments:
        InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksCommentsXf8004b07
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue:
        InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksCommitsX6c78b303? = null

    public var commits:
        InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksCommitsX6c78b303
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue:
        InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksHtmlXcfca4e43? = null

    public var html: InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksHtmlXcfca4e43
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue:
        InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksIssueX833dff61? = null

    public var issue: InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksIssueX833dff61
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestReffb1OneOf2PullRequestLinksReviewCommentX7caa2bb4? = null

    public var reviewComment:
        InlineWebhookPullRequestReffb1OneOf2PullRequestLinksReviewCommentX7caa2bb4
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestReffb1OneOf2PullRequestLinksReviewCommentsXeb3db093? = null

    public var reviewComments:
        InlineWebhookPullRequestReffb1OneOf2PullRequestLinksReviewCommentsXeb3db093
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue:
        InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksSelfXc3097a6e? = null

    public var self: InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksSelfXc3097a6e
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue:
        InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksStatusesX19c5b08d? = null

    public var statuses:
        InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksStatusesX19c5b08d
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksX70d557e3 {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksX70d557e3(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksX70d557e3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksX70d557e3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksX70d557e3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksX70d557e3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksX70d557e3 must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksCommentsXf8004b07>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksCommitsX6c78b303>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksHtmlXcfca4e43>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksIssueX833dff61>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestReffb1OneOf2PullRequestLinksReviewCommentX7caa2bb4>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestReffb1OneOf2PullRequestLinksReviewCommentsXeb3db093>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksSelfXc3097a6e>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksStatusesX19c5b08d>(rawObject, "statuses")
      return InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksX70d557e3(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksX70d557e3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksX70d557e3")
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

public fun inlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksX70d557e3(block: InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksX70d557e3.Builder.() -> Unit): InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksX70d557e3 = InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksX70d557e3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewRequestedOneOf2PullRequestLinksX70d557e3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
