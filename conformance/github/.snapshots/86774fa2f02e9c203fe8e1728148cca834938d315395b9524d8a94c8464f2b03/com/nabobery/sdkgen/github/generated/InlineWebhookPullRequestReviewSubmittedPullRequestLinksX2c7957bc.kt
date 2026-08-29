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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/_links.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/_links
 */
@Serializable(with = InlineWebhookPullRequestReviewSubmittedPullRequestLinksX2c7957bc.Serializer::class)
public class InlineWebhookPullRequestReviewSubmittedPullRequestLinksX2c7957bc(
  public val comments: InlineWebhookPullRequestReviewSubmittedPullRequestLinksCommentsXf8bf9177,
  public val commits: InlineWebhookPullRequestReviewSubmittedPullRequestLinksCommitsX0b955280,
  public val html: InlineWebhookPullRequestReviewSubmittedPullRequestLinksHtmlXe97a4ff5,
  public val issue: InlineWebhookPullRequestReviewSubmittedPullRequestLinksIssueXdf4803d9,
  public val reviewComment:
      InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentX8932926f,
  public val reviewComments:
      InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentsXbc7a7ac7,
  public val self: InlineWebhookPullRequestReviewSubmittedPullRequestLinksSelfX9a62cdbc,
  public val statuses: InlineWebhookPullRequestReviewSubmittedPullRequestLinksStatusesX56f4ffe6,
) {
  public class Builder {
    private var commentsValue:
        InlineWebhookPullRequestReviewSubmittedPullRequestLinksCommentsXf8bf9177? = null

    public var comments: InlineWebhookPullRequestReviewSubmittedPullRequestLinksCommentsXf8bf9177
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue:
        InlineWebhookPullRequestReviewSubmittedPullRequestLinksCommitsX0b955280? = null

    public var commits: InlineWebhookPullRequestReviewSubmittedPullRequestLinksCommitsX0b955280
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue: InlineWebhookPullRequestReviewSubmittedPullRequestLinksHtmlXe97a4ff5? =
        null

    public var html: InlineWebhookPullRequestReviewSubmittedPullRequestLinksHtmlXe97a4ff5
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue: InlineWebhookPullRequestReviewSubmittedPullRequestLinksIssueXdf4803d9? =
        null

    public var issue: InlineWebhookPullRequestReviewSubmittedPullRequestLinksIssueXdf4803d9
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentX8932926f? = null

    public var reviewComment:
        InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentX8932926f
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentsXbc7a7ac7? = null

    public var reviewComments:
        InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentsXbc7a7ac7
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue: InlineWebhookPullRequestReviewSubmittedPullRequestLinksSelfX9a62cdbc? =
        null

    public var self: InlineWebhookPullRequestReviewSubmittedPullRequestLinksSelfX9a62cdbc
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue:
        InlineWebhookPullRequestReviewSubmittedPullRequestLinksStatusesX56f4ffe6? = null

    public var statuses: InlineWebhookPullRequestReviewSubmittedPullRequestLinksStatusesX56f4ffe6
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewSubmittedPullRequestLinksX2c7957bc {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestReviewSubmittedPullRequestLinksX2c7957bc(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewSubmittedPullRequestLinksX2c7957bc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewSubmittedPullRequestLinksX2c7957bc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewSubmittedPullRequestLinksX2c7957bc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewSubmittedPullRequestLinksX2c7957bc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewSubmittedPullRequestLinksX2c7957bc must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestReviewSubmittedPullRequestLinksCommentsXf8bf9177>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestReviewSubmittedPullRequestLinksCommitsX0b955280>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestReviewSubmittedPullRequestLinksHtmlXe97a4ff5>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestReviewSubmittedPullRequestLinksIssueXdf4803d9>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentX8932926f>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentsXbc7a7ac7>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestReviewSubmittedPullRequestLinksSelfX9a62cdbc>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestReviewSubmittedPullRequestLinksStatusesX56f4ffe6>(rawObject, "statuses")
      return InlineWebhookPullRequestReviewSubmittedPullRequestLinksX2c7957bc(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewSubmittedPullRequestLinksX2c7957bc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewSubmittedPullRequestLinksX2c7957bc")
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

public fun inlineWebhookPullRequestReviewSubmittedPullRequestLinksX2c7957bc(block: InlineWebhookPullRequestReviewSubmittedPullRequestLinksX2c7957bc.Builder.() -> Unit): InlineWebhookPullRequestReviewSubmittedPullRequestLinksX2c7957bc = InlineWebhookPullRequestReviewSubmittedPullRequestLinksX2c7957bc.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewSubmittedPullRequestLinksX2c7957bc is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
