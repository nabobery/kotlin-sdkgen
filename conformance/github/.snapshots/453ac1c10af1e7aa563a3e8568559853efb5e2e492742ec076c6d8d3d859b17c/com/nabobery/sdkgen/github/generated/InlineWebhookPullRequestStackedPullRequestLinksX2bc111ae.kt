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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/_lin
 * ks.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/_lin
 * ks
 */
@Serializable(with = InlineWebhookPullRequestStackedPullRequestLinksX2bc111ae.Serializer::class)
public class InlineWebhookPullRequestStackedPullRequestLinksX2bc111ae(
  public val comments: InlineWebhookPullRequestStackedPullRequestLinksCommentsX7168d2e1,
  public val commits: InlineWebhookPullRequestStackedPullRequestLinksCommitsXfdc4f522,
  public val html: InlineWebhookPullRequestStackedPullRequestLinksHtmlXbc4d4d94,
  public val issue: InlineWebhookPullRequestStackedPullRequestLinksIssueXf814016d,
  public val reviewComment: InlineWebhookPullRequestStackedPullRequestLinksReviewCommentX5c1264e3,
  public val reviewComments: InlineWebhookPullRequestStackedPullRequestLinksReviewCommentsX0515950c,
  public val self: InlineWebhookPullRequestStackedPullRequestLinksSelfX18d1d33b,
  public val statuses: InlineWebhookPullRequestStackedPullRequestLinksStatusesX9b7ae35a,
) {
  public class Builder {
    private var commentsValue: InlineWebhookPullRequestStackedPullRequestLinksCommentsX7168d2e1? =
        null

    public var comments: InlineWebhookPullRequestStackedPullRequestLinksCommentsX7168d2e1
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue: InlineWebhookPullRequestStackedPullRequestLinksCommitsXfdc4f522? =
        null

    public var commits: InlineWebhookPullRequestStackedPullRequestLinksCommitsXfdc4f522
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue: InlineWebhookPullRequestStackedPullRequestLinksHtmlXbc4d4d94? = null

    public var html: InlineWebhookPullRequestStackedPullRequestLinksHtmlXbc4d4d94
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue: InlineWebhookPullRequestStackedPullRequestLinksIssueXf814016d? = null

    public var issue: InlineWebhookPullRequestStackedPullRequestLinksIssueXf814016d
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestStackedPullRequestLinksReviewCommentX5c1264e3? = null

    public var reviewComment: InlineWebhookPullRequestStackedPullRequestLinksReviewCommentX5c1264e3
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestStackedPullRequestLinksReviewCommentsX0515950c? = null

    public var reviewComments:
        InlineWebhookPullRequestStackedPullRequestLinksReviewCommentsX0515950c
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue: InlineWebhookPullRequestStackedPullRequestLinksSelfX18d1d33b? = null

    public var self: InlineWebhookPullRequestStackedPullRequestLinksSelfX18d1d33b
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue: InlineWebhookPullRequestStackedPullRequestLinksStatusesX9b7ae35a? =
        null

    public var statuses: InlineWebhookPullRequestStackedPullRequestLinksStatusesX9b7ae35a
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestStackedPullRequestLinksX2bc111ae {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestStackedPullRequestLinksX2bc111ae(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestStackedPullRequestLinksX2bc111ae = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestStackedPullRequestLinksX2bc111ae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestStackedPullRequestLinksX2bc111ae {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestStackedPullRequestLinksX2bc111ae")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestStackedPullRequestLinksX2bc111ae must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestStackedPullRequestLinksCommentsX7168d2e1>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestStackedPullRequestLinksCommitsXfdc4f522>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestStackedPullRequestLinksHtmlXbc4d4d94>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestStackedPullRequestLinksIssueXf814016d>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestStackedPullRequestLinksReviewCommentX5c1264e3>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestStackedPullRequestLinksReviewCommentsX0515950c>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestStackedPullRequestLinksSelfX18d1d33b>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestStackedPullRequestLinksStatusesX9b7ae35a>(rawObject, "statuses")
      return InlineWebhookPullRequestStackedPullRequestLinksX2bc111ae(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestStackedPullRequestLinksX2bc111ae) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestStackedPullRequestLinksX2bc111ae")
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

public fun inlineWebhookPullRequestStackedPullRequestLinksX2bc111ae(block: InlineWebhookPullRequestStackedPullRequestLinksX2bc111ae.Builder.() -> Unit): InlineWebhookPullRequestStackedPullRequestLinksX2bc111ae = InlineWebhookPullRequestStackedPullRequestLinksX2bc111ae.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestStackedPullRequestLinksX2bc111ae is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
