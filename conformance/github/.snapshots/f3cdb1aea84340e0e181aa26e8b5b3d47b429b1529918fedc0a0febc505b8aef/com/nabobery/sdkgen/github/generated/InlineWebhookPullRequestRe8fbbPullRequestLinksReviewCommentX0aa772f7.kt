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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted/properties/pull_request/
 * properties/_links/properties/review_comment.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted/properties/pull_request/
 * properties/_links/properties/review_comment
 */
@Serializable(with = InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentX0aa772f7.Serializer::class)
public class InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentX0aa772f7(
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

    public fun build(): InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentX0aa772f7 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentX0aa772f7(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentX0aa772f7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentX0aa772f7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentX0aa772f7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentX0aa772f7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentX0aa772f7 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentX0aa772f7(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentX0aa772f7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentX0aa772f7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentX0aa772f7(block: InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentX0aa772f7.Builder.() -> Unit): InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentX0aa772f7 = InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentX0aa772f7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentX0aa772f7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
