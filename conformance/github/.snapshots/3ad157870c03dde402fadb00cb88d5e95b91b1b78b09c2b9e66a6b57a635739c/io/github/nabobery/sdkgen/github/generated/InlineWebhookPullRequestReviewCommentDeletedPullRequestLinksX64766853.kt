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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted/properties/pull_request/
 * properties/_links.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted/properties/pull_request/
 * properties/_links
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksX64766853.Serializer::class)
public class InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksX64766853(
  public val comments:
      InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommentsX5caf4293,
  public val commits: InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommitsX97512b27,
  public val html: InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksHtmlXdbfdab2b,
  public val issue: InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksIssueX170437a5,
  public val reviewComment: InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentX0aa772f7,
  public val reviewComments: InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentsX5a364986,
  public val self: InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksSelfX6ae219b4,
  public val statuses:
      InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksStatusesXd594ec0d,
) {
  public class Builder {
    private var commentsValue:
        InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommentsX5caf4293? = null

    public var comments:
        InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommentsX5caf4293
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue:
        InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommitsX97512b27? = null

    public var commits: InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommitsX97512b27
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue:
        InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksHtmlXdbfdab2b? = null

    public var html: InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksHtmlXdbfdab2b
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue:
        InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksIssueX170437a5? = null

    public var issue: InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksIssueX170437a5
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentX0aa772f7? = null

    public var reviewComment: InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentX0aa772f7
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentsX5a364986? = null

    public var reviewComments: InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentsX5a364986
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue:
        InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksSelfX6ae219b4? = null

    public var self: InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksSelfX6ae219b4
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue:
        InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksStatusesXd594ec0d? = null

    public var statuses:
        InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksStatusesXd594ec0d
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksX64766853 {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksX64766853(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksX64766853 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksX64766853> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksX64766853 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksX64766853")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksX64766853 must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommentsX5caf4293>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommitsX97512b27>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksHtmlXdbfdab2b>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksIssueX170437a5>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentX0aa772f7>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentsX5a364986>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksSelfX6ae219b4>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksStatusesXd594ec0d>(rawObject, "statuses")
      return InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksX64766853(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksX64766853) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksX64766853")
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

public fun inlineWebhookPullRequestReviewCommentDeletedPullRequestLinksX64766853(block: InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksX64766853.Builder.() -> Unit): InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksX64766853 = InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksX64766853.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksX64766853 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
