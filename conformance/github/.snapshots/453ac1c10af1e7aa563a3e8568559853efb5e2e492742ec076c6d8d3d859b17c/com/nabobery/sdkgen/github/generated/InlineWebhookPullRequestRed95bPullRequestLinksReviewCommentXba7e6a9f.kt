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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request/p
 * roperties/_links/properties/review_comment.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request/p
 * roperties/_links/properties/review_comment
 */
@Serializable(with = InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentXba7e6a9f.Serializer::class)
public class InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentXba7e6a9f(
  /**
   * Wire format: `uri-template`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentXba7e6a9f {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentXba7e6a9f(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentXba7e6a9f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentXba7e6a9f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentXba7e6a9f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentXba7e6a9f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentXba7e6a9f must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentXba7e6a9f(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentXba7e6a9f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentXba7e6a9f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestRed95bPullRequestLinksReviewCommentXba7e6a9f(block: InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentXba7e6a9f.Builder.() -> Unit): InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentXba7e6a9f = InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentXba7e6a9f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestRed95bPullRequestLinksReviewCommentXba7e6a9f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
