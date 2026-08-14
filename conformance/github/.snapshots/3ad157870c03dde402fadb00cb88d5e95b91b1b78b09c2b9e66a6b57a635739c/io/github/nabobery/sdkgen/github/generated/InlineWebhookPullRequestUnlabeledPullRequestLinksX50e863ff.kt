package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/pull_request/properties/_l
 * inks.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/pull_request/properties/_l
 * inks
 */
@Serializable(with = InlineWebhookPullRequestUnlabeledPullRequestLinksX50e863ff.Serializer::class)
public class InlineWebhookPullRequestUnlabeledPullRequestLinksX50e863ff(
  public val comments: InlineWebhookPullRequestUnlabeledPullRequestLinksCommentsXd9f116b0,
  public val commits: InlineWebhookPullRequestUnlabeledPullRequestLinksCommitsX6029283e,
  public val html: InlineWebhookPullRequestUnlabeledPullRequestLinksHtmlXe9017a6c,
  public val issue: InlineWebhookPullRequestUnlabeledPullRequestLinksIssueXb5939698,
  public val reviewComment: InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentXaa580782,
  public val reviewComments:
      InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentsXe96f0fee,
  public val self: InlineWebhookPullRequestUnlabeledPullRequestLinksSelfX1b0e71f7,
  public val statuses: InlineWebhookPullRequestUnlabeledPullRequestLinksStatusesX8bf0564c,
) {
  public class Builder {
    private var commentsValue: InlineWebhookPullRequestUnlabeledPullRequestLinksCommentsXd9f116b0? =
        null

    public var comments: InlineWebhookPullRequestUnlabeledPullRequestLinksCommentsXd9f116b0
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue: InlineWebhookPullRequestUnlabeledPullRequestLinksCommitsX6029283e? =
        null

    public var commits: InlineWebhookPullRequestUnlabeledPullRequestLinksCommitsX6029283e
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue: InlineWebhookPullRequestUnlabeledPullRequestLinksHtmlXe9017a6c? = null

    public var html: InlineWebhookPullRequestUnlabeledPullRequestLinksHtmlXe9017a6c
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue: InlineWebhookPullRequestUnlabeledPullRequestLinksIssueXb5939698? = null

    public var issue: InlineWebhookPullRequestUnlabeledPullRequestLinksIssueXb5939698
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentXaa580782? = null

    public var reviewComment:
        InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentXaa580782
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentsXe96f0fee? = null

    public var reviewComments:
        InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentsXe96f0fee
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue: InlineWebhookPullRequestUnlabeledPullRequestLinksSelfX1b0e71f7? = null

    public var self: InlineWebhookPullRequestUnlabeledPullRequestLinksSelfX1b0e71f7
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue: InlineWebhookPullRequestUnlabeledPullRequestLinksStatusesX8bf0564c? =
        null

    public var statuses: InlineWebhookPullRequestUnlabeledPullRequestLinksStatusesX8bf0564c
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestUnlabeledPullRequestLinksX50e863ff {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestUnlabeledPullRequestLinksX50e863ff(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestUnlabeledPullRequestLinksX50e863ff = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnlabeledPullRequestLinksX50e863ff> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlabeledPullRequestLinksX50e863ff {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestUnlabeledPullRequestLinksX50e863ff")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestUnlabeledPullRequestLinksX50e863ff must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestUnlabeledPullRequestLinksCommentsXd9f116b0>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestUnlabeledPullRequestLinksCommitsX6029283e>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestUnlabeledPullRequestLinksHtmlXe9017a6c>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestUnlabeledPullRequestLinksIssueXb5939698>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentXaa580782>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentsXe96f0fee>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestUnlabeledPullRequestLinksSelfX1b0e71f7>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestUnlabeledPullRequestLinksStatusesX8bf0564c>(rawObject, "statuses")
      return InlineWebhookPullRequestUnlabeledPullRequestLinksX50e863ff(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlabeledPullRequestLinksX50e863ff) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestUnlabeledPullRequestLinksX50e863ff")
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

public fun inlineWebhookPullRequestUnlabeledPullRequestLinksX50e863ff(block: InlineWebhookPullRequestUnlabeledPullRequestLinksX50e863ff.Builder.() -> Unit): InlineWebhookPullRequestUnlabeledPullRequestLinksX50e863ff = InlineWebhookPullRequestUnlabeledPullRequestLinksX50e863ff.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestUnlabeledPullRequestLinksX50e863ff is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
