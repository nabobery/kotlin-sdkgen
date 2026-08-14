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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/_link
 * s.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/_link
 * s
 */
@Serializable(with = InlineWebhookPullRequestLockedPullRequestLinksX6db3b5ee.Serializer::class)
public class InlineWebhookPullRequestLockedPullRequestLinksX6db3b5ee(
  public val comments: InlineWebhookPullRequestLockedPullRequestLinksCommentsX694272f2,
  public val commits: InlineWebhookPullRequestLockedPullRequestLinksCommitsX6dc53b81,
  public val html: InlineWebhookPullRequestLockedPullRequestLinksHtmlX08400952,
  public val issue: InlineWebhookPullRequestLockedPullRequestLinksIssueX95000fd9,
  public val reviewComment: InlineWebhookPullRequestLockedPullRequestLinksReviewCommentX9d16b63e,
  public val reviewComments: InlineWebhookPullRequestLockedPullRequestLinksReviewCommentsX3a03fae7,
  public val self: InlineWebhookPullRequestLockedPullRequestLinksSelfX3414575d,
  public val statuses: InlineWebhookPullRequestLockedPullRequestLinksStatusesX6c46004b,
) {
  public class Builder {
    private var commentsValue: InlineWebhookPullRequestLockedPullRequestLinksCommentsX694272f2? =
        null

    public var comments: InlineWebhookPullRequestLockedPullRequestLinksCommentsX694272f2
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue: InlineWebhookPullRequestLockedPullRequestLinksCommitsX6dc53b81? = null

    public var commits: InlineWebhookPullRequestLockedPullRequestLinksCommitsX6dc53b81
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue: InlineWebhookPullRequestLockedPullRequestLinksHtmlX08400952? = null

    public var html: InlineWebhookPullRequestLockedPullRequestLinksHtmlX08400952
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue: InlineWebhookPullRequestLockedPullRequestLinksIssueX95000fd9? = null

    public var issue: InlineWebhookPullRequestLockedPullRequestLinksIssueX95000fd9
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestLockedPullRequestLinksReviewCommentX9d16b63e? = null

    public var reviewComment: InlineWebhookPullRequestLockedPullRequestLinksReviewCommentX9d16b63e
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestLockedPullRequestLinksReviewCommentsX3a03fae7? = null

    public var reviewComments: InlineWebhookPullRequestLockedPullRequestLinksReviewCommentsX3a03fae7
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue: InlineWebhookPullRequestLockedPullRequestLinksSelfX3414575d? = null

    public var self: InlineWebhookPullRequestLockedPullRequestLinksSelfX3414575d
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue: InlineWebhookPullRequestLockedPullRequestLinksStatusesX6c46004b? =
        null

    public var statuses: InlineWebhookPullRequestLockedPullRequestLinksStatusesX6c46004b
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestLockedPullRequestLinksX6db3b5ee {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestLockedPullRequestLinksX6db3b5ee(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestLockedPullRequestLinksX6db3b5ee = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestLockedPullRequestLinksX6db3b5ee> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLockedPullRequestLinksX6db3b5ee {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestLockedPullRequestLinksX6db3b5ee")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestLockedPullRequestLinksX6db3b5ee must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestLockedPullRequestLinksCommentsX694272f2>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestLockedPullRequestLinksCommitsX6dc53b81>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestLockedPullRequestLinksHtmlX08400952>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestLockedPullRequestLinksIssueX95000fd9>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestLockedPullRequestLinksReviewCommentX9d16b63e>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestLockedPullRequestLinksReviewCommentsX3a03fae7>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestLockedPullRequestLinksSelfX3414575d>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestLockedPullRequestLinksStatusesX6c46004b>(rawObject, "statuses")
      return InlineWebhookPullRequestLockedPullRequestLinksX6db3b5ee(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLockedPullRequestLinksX6db3b5ee) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestLockedPullRequestLinksX6db3b5ee")
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

public fun inlineWebhookPullRequestLockedPullRequestLinksX6db3b5ee(block: InlineWebhookPullRequestLockedPullRequestLinksX6db3b5ee.Builder.() -> Unit): InlineWebhookPullRequestLockedPullRequestLinksX6db3b5ee = InlineWebhookPullRequestLockedPullRequestLinksX6db3b5ee.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestLockedPullRequestLinksX6db3b5ee is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
