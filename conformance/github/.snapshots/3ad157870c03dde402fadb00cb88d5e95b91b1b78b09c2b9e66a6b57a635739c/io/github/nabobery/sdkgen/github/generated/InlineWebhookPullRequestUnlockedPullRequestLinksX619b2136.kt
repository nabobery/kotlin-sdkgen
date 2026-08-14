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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlocked/properties/pull_request/properties/_li
 * nks.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlocked/properties/pull_request/properties/_li
 * nks
 */
@Serializable(with = InlineWebhookPullRequestUnlockedPullRequestLinksX619b2136.Serializer::class)
public class InlineWebhookPullRequestUnlockedPullRequestLinksX619b2136(
  public val comments: InlineWebhookPullRequestUnlockedPullRequestLinksCommentsXd1b0f04b,
  public val commits: InlineWebhookPullRequestUnlockedPullRequestLinksCommitsXf06ef3af,
  public val html: InlineWebhookPullRequestUnlockedPullRequestLinksHtmlX94218072,
  public val issue: InlineWebhookPullRequestUnlockedPullRequestLinksIssueXb82e0b03,
  public val reviewComment: InlineWebhookPullRequestUnlockedPullRequestLinksReviewCommentX69a598e4,
  public val reviewComments:
      InlineWebhookPullRequestUnlockedPullRequestLinksReviewCommentsX02c89356,
  public val self: InlineWebhookPullRequestUnlockedPullRequestLinksSelfXf95cab1c,
  public val statuses: InlineWebhookPullRequestUnlockedPullRequestLinksStatusesXbdecac0b,
) {
  public class Builder {
    private var commentsValue: InlineWebhookPullRequestUnlockedPullRequestLinksCommentsXd1b0f04b? =
        null

    public var comments: InlineWebhookPullRequestUnlockedPullRequestLinksCommentsXd1b0f04b
      get() = requireNotNull(commentsValue) { "comments is required" }
      set(`value`) {
        commentsValue = value
      }

    private var commitsValue: InlineWebhookPullRequestUnlockedPullRequestLinksCommitsXf06ef3af? =
        null

    public var commits: InlineWebhookPullRequestUnlockedPullRequestLinksCommitsXf06ef3af
      get() = requireNotNull(commitsValue) { "commits is required" }
      set(`value`) {
        commitsValue = value
      }

    private var htmlValue: InlineWebhookPullRequestUnlockedPullRequestLinksHtmlX94218072? = null

    public var html: InlineWebhookPullRequestUnlockedPullRequestLinksHtmlX94218072
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var issueValue: InlineWebhookPullRequestUnlockedPullRequestLinksIssueXb82e0b03? = null

    public var issue: InlineWebhookPullRequestUnlockedPullRequestLinksIssueXb82e0b03
      get() = requireNotNull(issueValue) { "issue is required" }
      set(`value`) {
        issueValue = value
      }

    private var reviewCommentValue:
        InlineWebhookPullRequestUnlockedPullRequestLinksReviewCommentX69a598e4? = null

    public var reviewComment: InlineWebhookPullRequestUnlockedPullRequestLinksReviewCommentX69a598e4
      get() = requireNotNull(reviewCommentValue) { "reviewComment is required" }
      set(`value`) {
        reviewCommentValue = value
      }

    private var reviewCommentsValue:
        InlineWebhookPullRequestUnlockedPullRequestLinksReviewCommentsX02c89356? = null

    public var reviewComments:
        InlineWebhookPullRequestUnlockedPullRequestLinksReviewCommentsX02c89356
      get() = requireNotNull(reviewCommentsValue) { "reviewComments is required" }
      set(`value`) {
        reviewCommentsValue = value
      }

    private var selfValue: InlineWebhookPullRequestUnlockedPullRequestLinksSelfXf95cab1c? = null

    public var self: InlineWebhookPullRequestUnlockedPullRequestLinksSelfXf95cab1c
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    private var statusesValue: InlineWebhookPullRequestUnlockedPullRequestLinksStatusesXbdecac0b? =
        null

    public var statuses: InlineWebhookPullRequestUnlockedPullRequestLinksStatusesXbdecac0b
      get() = requireNotNull(statusesValue) { "statuses is required" }
      set(`value`) {
        statusesValue = value
      }

    public fun build(): InlineWebhookPullRequestUnlockedPullRequestLinksX619b2136 {
      check(commentsValue != null) { "comments is required" }
      check(commitsValue != null) { "commits is required" }
      check(htmlValue != null) { "html is required" }
      check(issueValue != null) { "issue is required" }
      check(reviewCommentValue != null) { "reviewComment is required" }
      check(reviewCommentsValue != null) { "reviewComments is required" }
      check(selfValue != null) { "self is required" }
      check(statusesValue != null) { "statuses is required" }
      return InlineWebhookPullRequestUnlockedPullRequestLinksX619b2136(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestUnlockedPullRequestLinksX619b2136 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnlockedPullRequestLinksX619b2136> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlockedPullRequestLinksX619b2136 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestUnlockedPullRequestLinksX619b2136")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestUnlockedPullRequestLinksX619b2136 must be a JSON object")
      val comments = json.decodeRequired<InlineWebhookPullRequestUnlockedPullRequestLinksCommentsXd1b0f04b>(rawObject, "comments")
      val commits = json.decodeRequired<InlineWebhookPullRequestUnlockedPullRequestLinksCommitsXf06ef3af>(rawObject, "commits")
      val html = json.decodeRequired<InlineWebhookPullRequestUnlockedPullRequestLinksHtmlX94218072>(rawObject, "html")
      val issue = json.decodeRequired<InlineWebhookPullRequestUnlockedPullRequestLinksIssueXb82e0b03>(rawObject, "issue")
      val reviewComment = json.decodeRequired<InlineWebhookPullRequestUnlockedPullRequestLinksReviewCommentX69a598e4>(rawObject, "review_comment")
      val reviewComments = json.decodeRequired<InlineWebhookPullRequestUnlockedPullRequestLinksReviewCommentsX02c89356>(rawObject, "review_comments")
      val self = json.decodeRequired<InlineWebhookPullRequestUnlockedPullRequestLinksSelfXf95cab1c>(rawObject, "self")
      val statuses = json.decodeRequired<InlineWebhookPullRequestUnlockedPullRequestLinksStatusesXbdecac0b>(rawObject, "statuses")
      return InlineWebhookPullRequestUnlockedPullRequestLinksX619b2136(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlockedPullRequestLinksX619b2136) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestUnlockedPullRequestLinksX619b2136")
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

public fun inlineWebhookPullRequestUnlockedPullRequestLinksX619b2136(block: InlineWebhookPullRequestUnlockedPullRequestLinksX619b2136.Builder.() -> Unit): InlineWebhookPullRequestUnlockedPullRequestLinksX619b2136 = InlineWebhookPullRequestUnlockedPullRequestLinksX619b2136.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestUnlockedPullRequestLinksX619b2136 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
