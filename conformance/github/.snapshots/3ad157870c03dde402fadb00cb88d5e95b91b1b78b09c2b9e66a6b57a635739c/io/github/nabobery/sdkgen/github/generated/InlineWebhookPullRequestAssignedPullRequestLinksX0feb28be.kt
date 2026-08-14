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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/_li
 * nks.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/_li
 * nks
 */
@Serializable(with = InlineWebhookPullRequestAssignedPullRequestLinksX0feb28be.Serializer::class)
public class InlineWebhookPullRequestAssignedPullRequestLinksX0feb28be(
  public val comments: InlineWebhookPullRequestAssignedPullRequestLinksCommentsX39655c80,
  public val commits: InlineWebhookPullRequestAssignedPullRequestLinksCommitsX59ac6d03,
  public val html: InlineWebhookPullRequestAssignedPullRequestLinksHtmlX6162b7c6,
  public val issue: InlineWebhookPullRequestAssignedPullRequestLinksIssueX1bfe6bd5,
  public val reviewComment: InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentX8f2746cd,
  public val reviewComments:
      InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentsX5e8f72de,
  public val self: InlineWebhookPullRequestAssignedPullRequestLinksSelfXec180ab5,
  public val statuses: InlineWebhookPullRequestAssignedPullRequestLinksStatusesX2e2374bc,
) {
  public class Builder {
    private var commentsValue: InlineWebhookPullRequestAssignedPullRequestLinksCommentsX39655c80? =
        null

    public var comments: InlineWebhookPullRequestAssignedPullRequestLinksCommentsX39655c80
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue: InlineWebhookPullRequestAssignedPullRequestLinksCommitsX59ac6d03? =
        null

    public var commits: InlineWebhookPullRequestAssignedPullRequestLinksCommitsX59ac6d03
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue: InlineWebhookPullRequestAssignedPullRequestLinksHtmlX6162b7c6? = null

    public var html: InlineWebhookPullRequestAssignedPullRequestLinksHtmlX6162b7c6
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue: InlineWebhookPullRequestAssignedPullRequestLinksIssueX1bfe6bd5? = null

    public var issue: InlineWebhookPullRequestAssignedPullRequestLinksIssueX1bfe6bd5
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentX8f2746cd? = null

    public var reviewComment: InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentX8f2746cd
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentsX5e8f72de? = null

    public var reviewComments:
        InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentsX5e8f72de
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue: InlineWebhookPullRequestAssignedPullRequestLinksSelfXec180ab5? = null

    public var self: InlineWebhookPullRequestAssignedPullRequestLinksSelfXec180ab5
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue: InlineWebhookPullRequestAssignedPullRequestLinksStatusesX2e2374bc? =
        null

    public var statuses: InlineWebhookPullRequestAssignedPullRequestLinksStatusesX2e2374bc
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestAssignedPullRequestLinksX0feb28be {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestAssignedPullRequestLinksX0feb28be(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestAssignedPullRequestLinksX0feb28be = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAssignedPullRequestLinksX0feb28be> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAssignedPullRequestLinksX0feb28be {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestAssignedPullRequestLinksX0feb28be")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestAssignedPullRequestLinksX0feb28be must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestAssignedPullRequestLinksCommentsX39655c80>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestAssignedPullRequestLinksCommitsX59ac6d03>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestAssignedPullRequestLinksHtmlX6162b7c6>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestAssignedPullRequestLinksIssueX1bfe6bd5>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentX8f2746cd>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentsX5e8f72de>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestAssignedPullRequestLinksSelfXec180ab5>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestAssignedPullRequestLinksStatusesX2e2374bc>(rawObject, "statuses")
      return InlineWebhookPullRequestAssignedPullRequestLinksX0feb28be(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAssignedPullRequestLinksX0feb28be) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestAssignedPullRequestLinksX0feb28be")
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

public fun inlineWebhookPullRequestAssignedPullRequestLinksX0feb28be(block: InlineWebhookPullRequestAssignedPullRequestLinksX0feb28be.Builder.() -> Unit): InlineWebhookPullRequestAssignedPullRequestLinksX0feb28be = InlineWebhookPullRequestAssignedPullRequestLinksX0feb28be.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestAssignedPullRequestLinksX0feb28be is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
