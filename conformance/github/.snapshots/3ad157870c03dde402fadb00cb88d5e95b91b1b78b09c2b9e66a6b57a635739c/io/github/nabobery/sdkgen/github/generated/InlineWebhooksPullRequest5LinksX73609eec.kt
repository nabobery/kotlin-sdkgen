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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/_links.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/_links
 */
@Serializable(with = InlineWebhooksPullRequest5LinksX73609eec.Serializer::class)
public class InlineWebhooksPullRequest5LinksX73609eec(
  public val comments: InlineWebhooksPullRequest5LinksCommentsXe5c96af7,
  public val commits: InlineWebhooksPullRequest5LinksCommitsX85514fda,
  public val html: InlineWebhooksPullRequest5LinksHtmlX4af1a16c,
  public val issue: InlineWebhooksPullRequest5LinksIssueX27379d77,
  public val reviewComment: InlineWebhooksPullRequest5LinksReviewCommentXa1551844,
  public val reviewComments: InlineWebhooksPullRequest5LinksReviewCommentsX8ba63351,
  public val self: InlineWebhooksPullRequest5LinksSelfX4b1081ad,
  public val statuses: InlineWebhooksPullRequest5LinksStatusesXd34fb1b1,
) {
  public class Builder {
    private var commentsValue: InlineWebhooksPullRequest5LinksCommentsXe5c96af7? = null

    public var comments: InlineWebhooksPullRequest5LinksCommentsXe5c96af7
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue: InlineWebhooksPullRequest5LinksCommitsX85514fda? = null

    public var commits: InlineWebhooksPullRequest5LinksCommitsX85514fda
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue: InlineWebhooksPullRequest5LinksHtmlX4af1a16c? = null

    public var html: InlineWebhooksPullRequest5LinksHtmlX4af1a16c
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue: InlineWebhooksPullRequest5LinksIssueX27379d77? = null

    public var issue: InlineWebhooksPullRequest5LinksIssueX27379d77
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue: InlineWebhooksPullRequest5LinksReviewCommentXa1551844? = null

    public var reviewComment: InlineWebhooksPullRequest5LinksReviewCommentXa1551844
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue: InlineWebhooksPullRequest5LinksReviewCommentsX8ba63351? = null

    public var reviewComments: InlineWebhooksPullRequest5LinksReviewCommentsX8ba63351
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue: InlineWebhooksPullRequest5LinksSelfX4b1081ad? = null

    public var self: InlineWebhooksPullRequest5LinksSelfX4b1081ad
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue: InlineWebhooksPullRequest5LinksStatusesXd34fb1b1? = null

    public var statuses: InlineWebhooksPullRequest5LinksStatusesXd34fb1b1
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhooksPullRequest5LinksX73609eec {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhooksPullRequest5LinksX73609eec(
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
    public fun build(block: Builder.() -> Unit): InlineWebhooksPullRequest5LinksX73609eec = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhooksPullRequest5LinksX73609eec> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5LinksX73609eec {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksPullRequest5LinksX73609eec")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksPullRequest5LinksX73609eec must be a JSON object")
      val comments = json.decodeRequired<InlineWebhooksPullRequest5LinksCommentsXe5c96af7>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhooksPullRequest5LinksCommitsX85514fda>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhooksPullRequest5LinksHtmlX4af1a16c>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhooksPullRequest5LinksIssueX27379d77>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhooksPullRequest5LinksReviewCommentXa1551844>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhooksPullRequest5LinksReviewCommentsX8ba63351>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhooksPullRequest5LinksSelfX4b1081ad>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhooksPullRequest5LinksStatusesXd34fb1b1>(rawObject, "statuses")
      return InlineWebhooksPullRequest5LinksX73609eec(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5LinksX73609eec) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksPullRequest5LinksX73609eec")
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

public fun inlineWebhooksPullRequest5LinksX73609eec(block: InlineWebhooksPullRequest5LinksX73609eec.Builder.() -> Unit): InlineWebhooksPullRequest5LinksX73609eec = InlineWebhooksPullRequest5LinksX73609eec.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhooksPullRequest5LinksX73609eec is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
