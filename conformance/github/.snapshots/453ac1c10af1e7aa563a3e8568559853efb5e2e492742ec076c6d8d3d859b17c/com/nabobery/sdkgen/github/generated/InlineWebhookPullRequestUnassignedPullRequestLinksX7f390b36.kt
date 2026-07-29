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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/_
 * links.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/_
 * links
 */
@Serializable(with = InlineWebhookPullRequestUnassignedPullRequestLinksX7f390b36.Serializer::class)
public class InlineWebhookPullRequestUnassignedPullRequestLinksX7f390b36(
  public val comments: InlineWebhookPullRequestUnassignedPullRequestLinksCommentsX82393cce,
  public val commits: InlineWebhookPullRequestUnassignedPullRequestLinksCommitsXbd76ca98,
  public val html: InlineWebhookPullRequestUnassignedPullRequestLinksHtmlXb5a74810,
  public val issue: InlineWebhookPullRequestUnassignedPullRequestLinksIssueX09d0951d,
  public val reviewComment:
      InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentXcec8c9ad,
  public val reviewComments:
      InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentsX419fc7d0,
  public val self: InlineWebhookPullRequestUnassignedPullRequestLinksSelfXe79473cc,
  public val statuses: InlineWebhookPullRequestUnassignedPullRequestLinksStatusesX272264dd,
) {
  public class Builder {
    private var commentsValue: InlineWebhookPullRequestUnassignedPullRequestLinksCommentsX82393cce?
        = null

    public var comments: InlineWebhookPullRequestUnassignedPullRequestLinksCommentsX82393cce
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue: InlineWebhookPullRequestUnassignedPullRequestLinksCommitsXbd76ca98? =
        null

    public var commits: InlineWebhookPullRequestUnassignedPullRequestLinksCommitsXbd76ca98
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue: InlineWebhookPullRequestUnassignedPullRequestLinksHtmlXb5a74810? = null

    public var html: InlineWebhookPullRequestUnassignedPullRequestLinksHtmlXb5a74810
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue: InlineWebhookPullRequestUnassignedPullRequestLinksIssueX09d0951d? = null

    public var issue: InlineWebhookPullRequestUnassignedPullRequestLinksIssueX09d0951d
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentXcec8c9ad? = null

    public var reviewComment:
        InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentXcec8c9ad
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentsX419fc7d0? = null

    public var reviewComments:
        InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentsX419fc7d0
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue: InlineWebhookPullRequestUnassignedPullRequestLinksSelfXe79473cc? = null

    public var self: InlineWebhookPullRequestUnassignedPullRequestLinksSelfXe79473cc
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue: InlineWebhookPullRequestUnassignedPullRequestLinksStatusesX272264dd?
        = null

    public var statuses: InlineWebhookPullRequestUnassignedPullRequestLinksStatusesX272264dd
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestUnassignedPullRequestLinksX7f390b36 {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestUnassignedPullRequestLinksX7f390b36(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestUnassignedPullRequestLinksX7f390b36 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestUnassignedPullRequestLinksX7f390b36> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnassignedPullRequestLinksX7f390b36 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestUnassignedPullRequestLinksX7f390b36")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestUnassignedPullRequestLinksX7f390b36 must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestUnassignedPullRequestLinksCommentsX82393cce>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestUnassignedPullRequestLinksCommitsXbd76ca98>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestUnassignedPullRequestLinksHtmlXb5a74810>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestUnassignedPullRequestLinksIssueX09d0951d>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentXcec8c9ad>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentsX419fc7d0>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestUnassignedPullRequestLinksSelfXe79473cc>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestUnassignedPullRequestLinksStatusesX272264dd>(rawObject, "statuses")
      return InlineWebhookPullRequestUnassignedPullRequestLinksX7f390b36(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnassignedPullRequestLinksX7f390b36) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestUnassignedPullRequestLinksX7f390b36")
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

public fun inlineWebhookPullRequestUnassignedPullRequestLinksX7f390b36(block: InlineWebhookPullRequestUnassignedPullRequestLinksX7f390b36.Builder.() -> Unit): InlineWebhookPullRequestUnassignedPullRequestLinksX7f390b36 = InlineWebhookPullRequestUnassignedPullRequestLinksX7f390b36.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestUnassignedPullRequestLinksX7f390b36 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
