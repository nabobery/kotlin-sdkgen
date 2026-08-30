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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/pull_request/propertie
 * s/_links.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/pull_request/propertie
 * s/_links
 */
@Serializable(with = InlineWebhookPullRequestReviewEditedPullRequestLinksX24873c8e.Serializer::class)
public class InlineWebhookPullRequestReviewEditedPullRequestLinksX24873c8e(
  public val comments: InlineWebhookPullRequestReviewEditedPullRequestLinksCommentsX4cbad830,
  public val commits: InlineWebhookPullRequestReviewEditedPullRequestLinksCommitsX1f7acecb,
  public val html: InlineWebhookPullRequestReviewEditedPullRequestLinksHtmlXcb4ea881,
  public val issue: InlineWebhookPullRequestReviewEditedPullRequestLinksIssueX5fdb1a1a,
  public val reviewComment:
      InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentXd6f72176,
  public val reviewComments:
      InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentsX23812c61,
  public val self: InlineWebhookPullRequestReviewEditedPullRequestLinksSelfX049f05ec,
  public val statuses: InlineWebhookPullRequestReviewEditedPullRequestLinksStatusesXdb3d643b,
) {
  public class Builder {
    private var commentsValue:
        InlineWebhookPullRequestReviewEditedPullRequestLinksCommentsX4cbad830? = null

    public var comments: InlineWebhookPullRequestReviewEditedPullRequestLinksCommentsX4cbad830
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue: InlineWebhookPullRequestReviewEditedPullRequestLinksCommitsX1f7acecb?
        = null

    public var commits: InlineWebhookPullRequestReviewEditedPullRequestLinksCommitsX1f7acecb
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue: InlineWebhookPullRequestReviewEditedPullRequestLinksHtmlXcb4ea881? = null

    public var html: InlineWebhookPullRequestReviewEditedPullRequestLinksHtmlXcb4ea881
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue: InlineWebhookPullRequestReviewEditedPullRequestLinksIssueX5fdb1a1a? =
        null

    public var issue: InlineWebhookPullRequestReviewEditedPullRequestLinksIssueX5fdb1a1a
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentXd6f72176? = null

    public var reviewComment:
        InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentXd6f72176
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentsX23812c61? = null

    public var reviewComments:
        InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentsX23812c61
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue: InlineWebhookPullRequestReviewEditedPullRequestLinksSelfX049f05ec? = null

    public var self: InlineWebhookPullRequestReviewEditedPullRequestLinksSelfX049f05ec
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue:
        InlineWebhookPullRequestReviewEditedPullRequestLinksStatusesXdb3d643b? = null

    public var statuses: InlineWebhookPullRequestReviewEditedPullRequestLinksStatusesXdb3d643b
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewEditedPullRequestLinksX24873c8e {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestReviewEditedPullRequestLinksX24873c8e(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewEditedPullRequestLinksX24873c8e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewEditedPullRequestLinksX24873c8e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewEditedPullRequestLinksX24873c8e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewEditedPullRequestLinksX24873c8e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewEditedPullRequestLinksX24873c8e must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestReviewEditedPullRequestLinksCommentsX4cbad830>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestReviewEditedPullRequestLinksCommitsX1f7acecb>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestReviewEditedPullRequestLinksHtmlXcb4ea881>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestReviewEditedPullRequestLinksIssueX5fdb1a1a>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentXd6f72176>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentsX23812c61>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestReviewEditedPullRequestLinksSelfX049f05ec>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestReviewEditedPullRequestLinksStatusesXdb3d643b>(rawObject, "statuses")
      return InlineWebhookPullRequestReviewEditedPullRequestLinksX24873c8e(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewEditedPullRequestLinksX24873c8e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewEditedPullRequestLinksX24873c8e")
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

public fun inlineWebhookPullRequestReviewEditedPullRequestLinksX24873c8e(block: InlineWebhookPullRequestReviewEditedPullRequestLinksX24873c8e.Builder.() -> Unit): InlineWebhookPullRequestReviewEditedPullRequestLinksX24873c8e = InlineWebhookPullRequestReviewEditedPullRequestLinksX24873c8e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewEditedPullRequestLinksX24873c8e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
