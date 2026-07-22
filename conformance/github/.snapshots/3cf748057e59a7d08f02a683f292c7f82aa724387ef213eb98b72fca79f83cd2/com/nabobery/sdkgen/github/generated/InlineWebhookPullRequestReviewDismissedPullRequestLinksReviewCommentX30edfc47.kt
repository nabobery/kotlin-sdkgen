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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request/proper
 * ties/_links/properties/review_comment.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request/proper
 * ties/_links/properties/review_comment
 */
@Serializable(with = InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentX30edfc47.Serializer::class)
public class InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentX30edfc47(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentX30edfc47 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentX30edfc47(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentX30edfc47 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentX30edfc47> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentX30edfc47 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentX30edfc47")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentX30edfc47 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentX30edfc47(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentX30edfc47) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentX30edfc47")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentX30edfc47(block: InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentX30edfc47.Builder.() -> Unit): InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentX30edfc47 = InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentX30edfc47.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewDismissedPullRequestLinksReviewCommentX30edfc47 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
