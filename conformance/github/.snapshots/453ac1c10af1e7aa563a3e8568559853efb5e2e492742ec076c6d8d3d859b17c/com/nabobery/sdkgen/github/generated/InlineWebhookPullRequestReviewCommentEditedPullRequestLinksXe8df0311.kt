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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request/p
 * roperties/_links.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request/p
 * roperties/_links
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentEditedPullRequestLinksXe8df0311.Serializer::class)
public class InlineWebhookPullRequestReviewCommentEditedPullRequestLinksXe8df0311(
  public val comments: InlineWebhookPullRequestReviewCommentEditedPullRequestLinksCommentsXc9c49685,
  public val commits: InlineWebhookPullRequestReviewCommentEditedPullRequestLinksCommitsXdd07cf80,
  public val html: InlineWebhookPullRequestReviewCommentEditedPullRequestLinksHtmlXdf841fbd,
  public val issue: InlineWebhookPullRequestReviewCommentEditedPullRequestLinksIssueXf4daa267,
  public val reviewComment: InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentXba7e6a9f,
  public val reviewComments: InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentsX7203e1e6,
  public val self: InlineWebhookPullRequestReviewCommentEditedPullRequestLinksSelfX914877bf,
  public val statuses: InlineWebhookPullRequestReviewCommentEditedPullRequestLinksStatusesX73c339a0,
) {
  public class Builder {
    private var commentsValue:
        InlineWebhookPullRequestReviewCommentEditedPullRequestLinksCommentsXc9c49685? = null

    public var comments:
        InlineWebhookPullRequestReviewCommentEditedPullRequestLinksCommentsXc9c49685
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue:
        InlineWebhookPullRequestReviewCommentEditedPullRequestLinksCommitsXdd07cf80? = null

    public var commits: InlineWebhookPullRequestReviewCommentEditedPullRequestLinksCommitsXdd07cf80
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue: InlineWebhookPullRequestReviewCommentEditedPullRequestLinksHtmlXdf841fbd?
        = null

    public var html: InlineWebhookPullRequestReviewCommentEditedPullRequestLinksHtmlXdf841fbd
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue:
        InlineWebhookPullRequestReviewCommentEditedPullRequestLinksIssueXf4daa267? = null

    public var issue: InlineWebhookPullRequestReviewCommentEditedPullRequestLinksIssueXf4daa267
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentXba7e6a9f? = null

    public var reviewComment: InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentXba7e6a9f
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentsX7203e1e6? = null

    public var reviewComments: InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentsX7203e1e6
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue: InlineWebhookPullRequestReviewCommentEditedPullRequestLinksSelfX914877bf?
        = null

    public var self: InlineWebhookPullRequestReviewCommentEditedPullRequestLinksSelfX914877bf
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue:
        InlineWebhookPullRequestReviewCommentEditedPullRequestLinksStatusesX73c339a0? = null

    public var statuses:
        InlineWebhookPullRequestReviewCommentEditedPullRequestLinksStatusesX73c339a0
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewCommentEditedPullRequestLinksXe8df0311 {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestReviewCommentEditedPullRequestLinksXe8df0311(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewCommentEditedPullRequestLinksXe8df0311 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentEditedPullRequestLinksXe8df0311> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentEditedPullRequestLinksXe8df0311 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewCommentEditedPullRequestLinksXe8df0311")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewCommentEditedPullRequestLinksXe8df0311 must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestReviewCommentEditedPullRequestLinksCommentsXc9c49685>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestReviewCommentEditedPullRequestLinksCommitsXdd07cf80>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestReviewCommentEditedPullRequestLinksHtmlXdf841fbd>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestReviewCommentEditedPullRequestLinksIssueXf4daa267>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentXba7e6a9f>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentsX7203e1e6>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestReviewCommentEditedPullRequestLinksSelfX914877bf>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestReviewCommentEditedPullRequestLinksStatusesX73c339a0>(rawObject, "statuses")
      return InlineWebhookPullRequestReviewCommentEditedPullRequestLinksXe8df0311(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentEditedPullRequestLinksXe8df0311) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewCommentEditedPullRequestLinksXe8df0311")
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

public fun inlineWebhookPullRequestReviewCommentEditedPullRequestLinksXe8df0311(block: InlineWebhookPullRequestReviewCommentEditedPullRequestLinksXe8df0311.Builder.() -> Unit): InlineWebhookPullRequestReviewCommentEditedPullRequestLinksXe8df0311 = InlineWebhookPullRequestReviewCommentEditedPullRequestLinksXe8df0311.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewCommentEditedPullRequestLinksXe8df0311 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
