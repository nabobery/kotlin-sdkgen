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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/0/properties/pull_reques
 * t/properties/_links.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/0/properties/pull_reques
 * t/properties/_links
 */
@Serializable(with = InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksXd15c320a.Serializer::class)
public class InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksXd15c320a(
  public val comments:
      InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksCommentsX1322b00b,
  public val commits: InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksCommitsX95db8df6,
  public val html: InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksHtmlX2595f83e,
  public val issue: InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksIssueX4b7dd32b,
  public val reviewComment:
      InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentXfccebef3,
  public val reviewComments:
      InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentsXbd637898,
  public val self: InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksSelfX83dae402,
  public val statuses:
      InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksStatusesXb4a3f42b,
) {
  public class Builder {
    private var commentsValue:
        InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksCommentsX1322b00b? = null

    public var comments:
        InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksCommentsX1322b00b
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue:
        InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksCommitsX95db8df6? = null

    public var commits:
        InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksCommitsX95db8df6
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue:
        InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksHtmlX2595f83e? = null

    public var html: InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksHtmlX2595f83e
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue:
        InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksIssueX4b7dd32b? = null

    public var issue: InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksIssueX4b7dd32b
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentXfccebef3? = null

    public var reviewComment:
        InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentXfccebef3
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentsXbd637898? = null

    public var reviewComments:
        InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentsXbd637898
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue:
        InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksSelfX83dae402? = null

    public var self: InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksSelfX83dae402
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue:
        InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksStatusesXb4a3f42b? = null

    public var statuses:
        InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksStatusesXb4a3f42b
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksXd15c320a {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksXd15c320a(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksXd15c320a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksXd15c320a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksXd15c320a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksXd15c320a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksXd15c320a must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksCommentsX1322b00b>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksCommitsX95db8df6>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksHtmlX2595f83e>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksIssueX4b7dd32b>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentXfccebef3>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentsXbd637898>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksSelfX83dae402>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksStatusesXb4a3f42b>(rawObject, "statuses")
      return InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksXd15c320a(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksXd15c320a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksXd15c320a")
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

public fun inlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksXd15c320a(block: InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksXd15c320a.Builder.() -> Unit): InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksXd15c320a = InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksXd15c320a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksXd15c320a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
