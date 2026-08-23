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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/_links.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/_links
 */
@Serializable(with = InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksXc05b1c5d.Serializer::class)
public class InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksXc05b1c5d(
  public val comments: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommentsXd1759dd9,
  public val commits: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommitsX6257ee12,
  public val html: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksHtmlXb7930717,
  public val issue: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksIssueXce81a738,
  public val reviewComment:
      InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentXa8e98401,
  public val reviewComments:
      InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentsXd032dfa1,
  public val self: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksSelfXcab1c0ca,
  public val statuses: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksStatusesXa886aa75,
) {
  public class Builder {
    private var commentsValue:
        InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommentsXd1759dd9? = null

    public var comments: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommentsXd1759dd9
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue:
        InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommitsX6257ee12? = null

    public var commits: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommitsX6257ee12
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksHtmlXb7930717? =
        null

    public var html: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksHtmlXb7930717
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksIssueXce81a738?
        = null

    public var issue: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksIssueXce81a738
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentXa8e98401? = null

    public var reviewComment:
        InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentXa8e98401
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentsXd032dfa1? = null

    public var reviewComments:
        InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentsXd032dfa1
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksSelfXcab1c0ca? =
        null

    public var self: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksSelfXcab1c0ca
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue:
        InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksStatusesXa886aa75? = null

    public var statuses: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksStatusesXa886aa75
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksXc05b1c5d {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksXc05b1c5d(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksXc05b1c5d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksXc05b1c5d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksXc05b1c5d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksXc05b1c5d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksXc05b1c5d must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommentsXd1759dd9>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommitsX6257ee12>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksHtmlXb7930717>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksIssueXce81a738>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentXa8e98401>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentsXd032dfa1>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksSelfXcab1c0ca>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksStatusesXa886aa75>(rawObject, "statuses")
      return InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksXc05b1c5d(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksXc05b1c5d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksXc05b1c5d")
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

public fun inlineWebhookPullRequestAutoMergeDisabledPullRequestLinksXc05b1c5d(block: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksXc05b1c5d.Builder.() -> Unit): InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksXc05b1c5d = InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksXc05b1c5d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksXc05b1c5d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
