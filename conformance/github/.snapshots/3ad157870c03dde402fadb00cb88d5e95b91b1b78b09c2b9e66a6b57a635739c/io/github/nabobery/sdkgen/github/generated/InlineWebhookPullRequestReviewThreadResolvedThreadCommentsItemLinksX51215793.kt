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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/thread/proper
 * ties/comments/items/properties/_links.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/thread/proper
 * ties/comments/items/properties/_links
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksX51215793.Serializer::class)
public class InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksX51215793(
  public val html: InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksHtmlX6759a556,
  public val pullRequest: InlineWebhookPullRequestRe0df9ThreadCommentsItemLinksPullRequestX26b5f59a,
  public val self: InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksSelfX938a6aa5,
) {
  public class Builder {
    private var htmlValue:
        InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksHtmlX6759a556? = null

    public var html:
        InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksHtmlX6759a556
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var pullRequestValue:
        InlineWebhookPullRequestRe0df9ThreadCommentsItemLinksPullRequestX26b5f59a? = null

    public var pullRequest:
        InlineWebhookPullRequestRe0df9ThreadCommentsItemLinksPullRequestX26b5f59a
      get() = requireNotNull(pullRequestValue) { "pullRequest is required" }
      set(`value`) {
        pullRequestValue = value
      }

    private var selfValue:
        InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksSelfX938a6aa5? = null

    public var self:
        InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksSelfX938a6aa5
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksX51215793 {
      check(htmlValue != null) { "html is required" }
      check(pullRequestValue != null) { "pullRequest is required" }
      check(selfValue != null) { "self is required" }
      return InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksX51215793(
        html = html,
        pullRequest = pullRequest,
        self = self,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksX51215793 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksX51215793> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksX51215793 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksX51215793")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksX51215793 must be a JSON object")
      val html = json.decodeRequired<InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksHtmlX6759a556>(rawObject, "html")
      val pullRequest = json.decodeRequired<InlineWebhookPullRequestRe0df9ThreadCommentsItemLinksPullRequestX26b5f59a>(rawObject, "pull_request")
      val self = json.decodeRequired<InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksSelfX938a6aa5>(rawObject, "self")
      return InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksX51215793(
        html = html,
        pullRequest = pullRequest,
        self = self,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksX51215793) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksX51215793")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("html", json.encodeToJsonElement(value.html))
        put("pull_request", json.encodeToJsonElement(value.pullRequest))
        put("self", json.encodeToJsonElement(value.self))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksX51215793(block: InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksX51215793.Builder.() -> Unit): InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksX51215793 = InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksX51215793.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksX51215793 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
