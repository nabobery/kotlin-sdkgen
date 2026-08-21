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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/pull_request/
 * properties/_links.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/pull_request/
 * properties/_links
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksX11a53045.Serializer::class)
public class InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksX11a53045(
  public val comments:
      InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksCommentsXf1770a57,
  public val commits: InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksCommitsX4f940df8,
  public val html: InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksHtmlXa657f30f,
  public val issue: InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksIssueX724d4480,
  public val reviewComment: InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentXf195069d,
  public val reviewComments: InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentsX69257fd5,
  public val self: InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksSelfX6443821f,
  public val statuses:
      InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksStatusesX54c774a9,
) {
  public class Builder {
    private var commentsValue:
        InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksCommentsXf1770a57? = null

    public var comments:
        InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksCommentsXf1770a57
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue:
        InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksCommitsX4f940df8? = null

    public var commits: InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksCommitsX4f940df8
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue:
        InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksHtmlXa657f30f? = null

    public var html: InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksHtmlXa657f30f
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue:
        InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksIssueX724d4480? = null

    public var issue: InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksIssueX724d4480
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentXf195069d? = null

    public var reviewComment: InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentXf195069d
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentsX69257fd5? = null

    public var reviewComments: InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentsX69257fd5
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue:
        InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksSelfX6443821f? = null

    public var self: InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksSelfX6443821f
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue:
        InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksStatusesX54c774a9? = null

    public var statuses:
        InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksStatusesX54c774a9
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksX11a53045 {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksX11a53045(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksX11a53045 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksX11a53045> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksX11a53045 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksX11a53045")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksX11a53045 must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksCommentsXf1770a57>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksCommitsX4f940df8>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksHtmlXa657f30f>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksIssueX724d4480>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentXf195069d>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentsX69257fd5>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksSelfX6443821f>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksStatusesX54c774a9>(rawObject, "statuses")
      return InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksX11a53045(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksX11a53045) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksX11a53045")
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

public fun inlineWebhookPullRequestReviewThreadResolvedPullRequestLinksX11a53045(block: InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksX11a53045.Builder.() -> Unit): InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksX11a53045 = InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksX11a53045.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksX11a53045 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
