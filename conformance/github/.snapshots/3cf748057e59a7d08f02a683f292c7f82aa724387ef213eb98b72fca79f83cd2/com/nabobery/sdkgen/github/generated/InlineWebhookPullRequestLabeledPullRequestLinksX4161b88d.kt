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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/_lin
 * ks.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/_lin
 * ks
 */
@Serializable(with = InlineWebhookPullRequestLabeledPullRequestLinksX4161b88d.Serializer::class)
public class InlineWebhookPullRequestLabeledPullRequestLinksX4161b88d(
  public val comments: InlineWebhookPullRequestLabeledPullRequestLinksCommentsX7b55a884,
  public val commits: InlineWebhookPullRequestLabeledPullRequestLinksCommitsXde99d18b,
  public val html: InlineWebhookPullRequestLabeledPullRequestLinksHtmlX6fd97135,
  public val issue: InlineWebhookPullRequestLabeledPullRequestLinksIssueXc43f57af,
  public val reviewComment: InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentX04d18909,
  public val reviewComments: InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentsXaff818c8,
  public val self: InlineWebhookPullRequestLabeledPullRequestLinksSelfX7d08e1bf,
  public val statuses: InlineWebhookPullRequestLabeledPullRequestLinksStatusesX2cf0eb6f,
) {
  public class Builder {
    private var commentsValue: InlineWebhookPullRequestLabeledPullRequestLinksCommentsX7b55a884? =
        null

    public var comments: InlineWebhookPullRequestLabeledPullRequestLinksCommentsX7b55a884
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue: InlineWebhookPullRequestLabeledPullRequestLinksCommitsXde99d18b? =
        null

    public var commits: InlineWebhookPullRequestLabeledPullRequestLinksCommitsXde99d18b
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue: InlineWebhookPullRequestLabeledPullRequestLinksHtmlX6fd97135? = null

    public var html: InlineWebhookPullRequestLabeledPullRequestLinksHtmlX6fd97135
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue: InlineWebhookPullRequestLabeledPullRequestLinksIssueXc43f57af? = null

    public var issue: InlineWebhookPullRequestLabeledPullRequestLinksIssueXc43f57af
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentX04d18909? = null

    public var reviewComment: InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentX04d18909
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentsXaff818c8? = null

    public var reviewComments:
        InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentsXaff818c8
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue: InlineWebhookPullRequestLabeledPullRequestLinksSelfX7d08e1bf? = null

    public var self: InlineWebhookPullRequestLabeledPullRequestLinksSelfX7d08e1bf
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue: InlineWebhookPullRequestLabeledPullRequestLinksStatusesX2cf0eb6f? =
        null

    public var statuses: InlineWebhookPullRequestLabeledPullRequestLinksStatusesX2cf0eb6f
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestLabeledPullRequestLinksX4161b88d {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestLabeledPullRequestLinksX4161b88d(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestLabeledPullRequestLinksX4161b88d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestLabeledPullRequestLinksX4161b88d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLabeledPullRequestLinksX4161b88d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestLabeledPullRequestLinksX4161b88d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestLabeledPullRequestLinksX4161b88d must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestLabeledPullRequestLinksCommentsX7b55a884>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestLabeledPullRequestLinksCommitsXde99d18b>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestLabeledPullRequestLinksHtmlX6fd97135>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestLabeledPullRequestLinksIssueXc43f57af>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentX04d18909>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentsXaff818c8>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestLabeledPullRequestLinksSelfX7d08e1bf>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestLabeledPullRequestLinksStatusesX2cf0eb6f>(rawObject, "statuses")
      return InlineWebhookPullRequestLabeledPullRequestLinksX4161b88d(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLabeledPullRequestLinksX4161b88d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestLabeledPullRequestLinksX4161b88d")
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

public fun inlineWebhookPullRequestLabeledPullRequestLinksX4161b88d(block: InlineWebhookPullRequestLabeledPullRequestLinksX4161b88d.Builder.() -> Unit): InlineWebhookPullRequestLabeledPullRequestLinksX4161b88d = InlineWebhookPullRequestLabeledPullRequestLinksX4161b88d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestLabeledPullRequestLinksX4161b88d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
