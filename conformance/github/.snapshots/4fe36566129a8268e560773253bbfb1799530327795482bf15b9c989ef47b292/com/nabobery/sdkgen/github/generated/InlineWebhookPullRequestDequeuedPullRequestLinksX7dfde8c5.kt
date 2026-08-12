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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/_li
 * nks.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/_li
 * nks
 */
@Serializable(with = InlineWebhookPullRequestDequeuedPullRequestLinksX7dfde8c5.Serializer::class)
public class InlineWebhookPullRequestDequeuedPullRequestLinksX7dfde8c5(
  public val comments: InlineWebhookPullRequestDequeuedPullRequestLinksCommentsX7d390925,
  public val commits: InlineWebhookPullRequestDequeuedPullRequestLinksCommitsXaf45d253,
  public val html: InlineWebhookPullRequestDequeuedPullRequestLinksHtmlX2b2d0d30,
  public val issue: InlineWebhookPullRequestDequeuedPullRequestLinksIssueX7285cf5b,
  public val reviewComment: InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentX29de05b2,
  public val reviewComments:
      InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentsXb549ffb5,
  public val self: InlineWebhookPullRequestDequeuedPullRequestLinksSelfXdd12195e,
  public val statuses: InlineWebhookPullRequestDequeuedPullRequestLinksStatusesX7ddf24ff,
) {
  public class Builder {
    private var commentsValue: InlineWebhookPullRequestDequeuedPullRequestLinksCommentsX7d390925? =
        null

    public var comments: InlineWebhookPullRequestDequeuedPullRequestLinksCommentsX7d390925
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue: InlineWebhookPullRequestDequeuedPullRequestLinksCommitsXaf45d253? =
        null

    public var commits: InlineWebhookPullRequestDequeuedPullRequestLinksCommitsXaf45d253
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue: InlineWebhookPullRequestDequeuedPullRequestLinksHtmlX2b2d0d30? = null

    public var html: InlineWebhookPullRequestDequeuedPullRequestLinksHtmlX2b2d0d30
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue: InlineWebhookPullRequestDequeuedPullRequestLinksIssueX7285cf5b? = null

    public var issue: InlineWebhookPullRequestDequeuedPullRequestLinksIssueX7285cf5b
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentX29de05b2? = null

    public var reviewComment: InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentX29de05b2
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentsXb549ffb5? = null

    public var reviewComments:
        InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentsXb549ffb5
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue: InlineWebhookPullRequestDequeuedPullRequestLinksSelfXdd12195e? = null

    public var self: InlineWebhookPullRequestDequeuedPullRequestLinksSelfXdd12195e
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue: InlineWebhookPullRequestDequeuedPullRequestLinksStatusesX7ddf24ff? =
        null

    public var statuses: InlineWebhookPullRequestDequeuedPullRequestLinksStatusesX7ddf24ff
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestDequeuedPullRequestLinksX7dfde8c5 {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestDequeuedPullRequestLinksX7dfde8c5(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestDequeuedPullRequestLinksX7dfde8c5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestDequeuedPullRequestLinksX7dfde8c5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestDequeuedPullRequestLinksX7dfde8c5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestDequeuedPullRequestLinksX7dfde8c5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestDequeuedPullRequestLinksX7dfde8c5 must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestDequeuedPullRequestLinksCommentsX7d390925>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestDequeuedPullRequestLinksCommitsXaf45d253>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestDequeuedPullRequestLinksHtmlX2b2d0d30>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestDequeuedPullRequestLinksIssueX7285cf5b>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentX29de05b2>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentsXb549ffb5>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestDequeuedPullRequestLinksSelfXdd12195e>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestDequeuedPullRequestLinksStatusesX7ddf24ff>(rawObject, "statuses")
      return InlineWebhookPullRequestDequeuedPullRequestLinksX7dfde8c5(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestDequeuedPullRequestLinksX7dfde8c5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestDequeuedPullRequestLinksX7dfde8c5")
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

public fun inlineWebhookPullRequestDequeuedPullRequestLinksX7dfde8c5(block: InlineWebhookPullRequestDequeuedPullRequestLinksX7dfde8c5.Builder.() -> Unit): InlineWebhookPullRequestDequeuedPullRequestLinksX7dfde8c5 = InlineWebhookPullRequestDequeuedPullRequestLinksX7dfde8c5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestDequeuedPullRequestLinksX7dfde8c5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
