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
 * properties/_links/properties/review_comments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted/properties/pull_request/
 * properties/_links/properties/review_comments
 */
@Serializable(with = InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentsX5a364986.Serializer::class)
public class InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentsX5a364986(
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

    public fun build(): InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentsX5a364986 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentsX5a364986(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentsX5a364986 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentsX5a364986> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentsX5a364986 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentsX5a364986")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentsX5a364986 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentsX5a364986(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentsX5a364986) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentsX5a364986")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentsX5a364986(block: InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentsX5a364986.Builder.() -> Unit): InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentsX5a364986 = InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentsX5a364986.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestRe8fbbPullRequestLinksReviewCommentsX5a364986 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
