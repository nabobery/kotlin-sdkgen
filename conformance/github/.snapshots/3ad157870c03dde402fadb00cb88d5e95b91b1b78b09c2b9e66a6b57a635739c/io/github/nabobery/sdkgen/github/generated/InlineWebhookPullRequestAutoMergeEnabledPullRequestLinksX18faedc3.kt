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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-enabled/properties/pull_request/prop
 * erties/_links.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-enabled/properties/pull_request/prop
 * erties/_links
 */
@Serializable(with = InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksX18faedc3.Serializer::class)
public class InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksX18faedc3(
  public val comments: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommentsX822ccdc9,
  public val commits: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommitsX7e9669c9,
  public val html: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksHtmlXa08a919e,
  public val issue: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksIssueX13d3902f,
  public val reviewComment:
      InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentX3e259a8c,
  public val reviewComments:
      InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentsX8e9b04b5,
  public val self: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksSelfXe6be258e,
  public val statuses: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksStatusesX6eb16599,
) {
  public class Builder {
    private var commentsValue:
        InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommentsX822ccdc9? = null

    public var comments: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommentsX822ccdc9
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue:
        InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommitsX7e9669c9? = null

    public var commits: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommitsX7e9669c9
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksHtmlXa08a919e? =
        null

    public var html: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksHtmlXa08a919e
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksIssueX13d3902f?
        = null

    public var issue: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksIssueX13d3902f
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentX3e259a8c? = null

    public var reviewComment:
        InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentX3e259a8c
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentsX8e9b04b5? = null

    public var reviewComments:
        InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentsX8e9b04b5
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksSelfXe6be258e? =
        null

    public var self: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksSelfXe6be258e
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue:
        InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksStatusesX6eb16599? = null

    public var statuses: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksStatusesX6eb16599
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksX18faedc3 {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksX18faedc3(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksX18faedc3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksX18faedc3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksX18faedc3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksX18faedc3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksX18faedc3 must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommentsX822ccdc9>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommitsX7e9669c9>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksHtmlXa08a919e>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksIssueX13d3902f>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentX3e259a8c>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentsX8e9b04b5>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksSelfXe6be258e>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksStatusesX6eb16599>(rawObject, "statuses")
      return InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksX18faedc3(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksX18faedc3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksX18faedc3")
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

public fun inlineWebhookPullRequestAutoMergeEnabledPullRequestLinksX18faedc3(block: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksX18faedc3.Builder.() -> Unit): InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksX18faedc3 = InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksX18faedc3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksX18faedc3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
