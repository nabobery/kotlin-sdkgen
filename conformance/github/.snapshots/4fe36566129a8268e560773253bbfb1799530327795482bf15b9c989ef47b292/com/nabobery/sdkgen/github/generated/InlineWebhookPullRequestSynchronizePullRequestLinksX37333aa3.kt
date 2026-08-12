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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * _links.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * _links
 */
@Serializable(with = InlineWebhookPullRequestSynchronizePullRequestLinksX37333aa3.Serializer::class)
public class InlineWebhookPullRequestSynchronizePullRequestLinksX37333aa3(
  public val comments: InlineWebhookPullRequestSynchronizePullRequestLinksCommentsXf6ec3044,
  public val commits: InlineWebhookPullRequestSynchronizePullRequestLinksCommitsXbe6822b5,
  public val html: InlineWebhookPullRequestSynchronizePullRequestLinksHtmlXb874daaf,
  public val issue: InlineWebhookPullRequestSynchronizePullRequestLinksIssueX4ba88535,
  public val reviewComment:
      InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentXfc98d2a2,
  public val reviewComments:
      InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentsXdc1eed93,
  public val self: InlineWebhookPullRequestSynchronizePullRequestLinksSelfX536c18a6,
  public val statuses: InlineWebhookPullRequestSynchronizePullRequestLinksStatusesX933d789a,
) {
  public class Builder {
    private var commentsValue: InlineWebhookPullRequestSynchronizePullRequestLinksCommentsXf6ec3044?
        = null

    public var comments: InlineWebhookPullRequestSynchronizePullRequestLinksCommentsXf6ec3044
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue: InlineWebhookPullRequestSynchronizePullRequestLinksCommitsXbe6822b5? =
        null

    public var commits: InlineWebhookPullRequestSynchronizePullRequestLinksCommitsXbe6822b5
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue: InlineWebhookPullRequestSynchronizePullRequestLinksHtmlXb874daaf? = null

    public var html: InlineWebhookPullRequestSynchronizePullRequestLinksHtmlXb874daaf
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue: InlineWebhookPullRequestSynchronizePullRequestLinksIssueX4ba88535? =
        null

    public var issue: InlineWebhookPullRequestSynchronizePullRequestLinksIssueX4ba88535
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentXfc98d2a2? = null

    public var reviewComment:
        InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentXfc98d2a2
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentsXdc1eed93? = null

    public var reviewComments:
        InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentsXdc1eed93
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue: InlineWebhookPullRequestSynchronizePullRequestLinksSelfX536c18a6? = null

    public var self: InlineWebhookPullRequestSynchronizePullRequestLinksSelfX536c18a6
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue: InlineWebhookPullRequestSynchronizePullRequestLinksStatusesX933d789a?
        = null

    public var statuses: InlineWebhookPullRequestSynchronizePullRequestLinksStatusesX933d789a
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestSynchronizePullRequestLinksX37333aa3 {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestSynchronizePullRequestLinksX37333aa3(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestSynchronizePullRequestLinksX37333aa3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestSynchronizePullRequestLinksX37333aa3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestSynchronizePullRequestLinksX37333aa3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestSynchronizePullRequestLinksX37333aa3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestSynchronizePullRequestLinksX37333aa3 must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestSynchronizePullRequestLinksCommentsXf6ec3044>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestSynchronizePullRequestLinksCommitsXbe6822b5>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestSynchronizePullRequestLinksHtmlXb874daaf>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestSynchronizePullRequestLinksIssueX4ba88535>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentXfc98d2a2>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentsXdc1eed93>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestSynchronizePullRequestLinksSelfX536c18a6>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestSynchronizePullRequestLinksStatusesX933d789a>(rawObject, "statuses")
      return InlineWebhookPullRequestSynchronizePullRequestLinksX37333aa3(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestSynchronizePullRequestLinksX37333aa3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestSynchronizePullRequestLinksX37333aa3")
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

public fun inlineWebhookPullRequestSynchronizePullRequestLinksX37333aa3(block: InlineWebhookPullRequestSynchronizePullRequestLinksX37333aa3.Builder.() -> Unit): InlineWebhookPullRequestSynchronizePullRequestLinksX37333aa3 = InlineWebhookPullRequestSynchronizePullRequestLinksX37333aa3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestSynchronizePullRequestLinksX37333aa3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
