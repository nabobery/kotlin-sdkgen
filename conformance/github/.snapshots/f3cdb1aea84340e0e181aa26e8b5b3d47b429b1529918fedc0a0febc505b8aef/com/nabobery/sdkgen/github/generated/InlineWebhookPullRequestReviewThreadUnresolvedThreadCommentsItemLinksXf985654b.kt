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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/thread/prop
 * erties/comments/items/properties/_links.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/thread/prop
 * erties/comments/items/properties/_links
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemLinksXf985654b.Serializer::class)
public class InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemLinksXf985654b(
  public val html: InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksHtmlX83485aa4,
  public val pullRequest: InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksPullRequestXc59bcec6,
  public val self: InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksSelfXdeab654a,
) {
  public class Builder {
    private var htmlValue: InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksHtmlX83485aa4? =
        null

    public var html: InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksHtmlX83485aa4
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var pullRequestValue:
        InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksPullRequestXc59bcec6? = null

    public var pullRequest:
        InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksPullRequestXc59bcec6
      get() = requireNotNull(pullRequestValue) { "pullRequest is required" }
      set(`value`) {
        pullRequestValue = value
      }

    private var selfValue: InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksSelfXdeab654a? =
        null

    public var self: InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksSelfXdeab654a
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemLinksXf985654b {
      check(htmlValue != null) { "html is required" }
      check(pullRequestValue != null) { "pullRequest is required" }
      check(selfValue != null) { "self is required" }
      return InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemLinksXf985654b(
        html = html,
        pullRequest = pullRequest,
        self = self,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemLinksXf985654b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemLinksXf985654b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemLinksXf985654b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemLinksXf985654b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemLinksXf985654b must be a JSON object")
      val html = json.decodeRequired<InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksHtmlX83485aa4>(rawObject, "html")
      val pullRequest = json.decodeRequired<InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksPullRequestXc59bcec6>(rawObject, "pull_request")
      val self = json.decodeRequired<InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksSelfXdeab654a>(rawObject, "self")
      return InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemLinksXf985654b(
        html = html,
        pullRequest = pullRequest,
        self = self,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemLinksXf985654b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemLinksXf985654b")
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

public fun inlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemLinksXf985654b(block: InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemLinksXf985654b.Builder.() -> Unit): InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemLinksXf985654b = InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemLinksXf985654b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemLinksXf985654b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
