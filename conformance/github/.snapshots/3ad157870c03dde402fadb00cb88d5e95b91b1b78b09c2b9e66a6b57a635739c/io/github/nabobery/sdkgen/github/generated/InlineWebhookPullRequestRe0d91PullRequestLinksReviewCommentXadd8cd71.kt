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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/pull_request/
 * properties/_links/properties/review_comment.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/pull_request/
 * properties/_links/properties/review_comment
 */
@Serializable(with = InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentXadd8cd71.Serializer::class)
public class InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentXadd8cd71(
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

    public fun build(): InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentXadd8cd71 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentXadd8cd71(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentXadd8cd71 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentXadd8cd71> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentXadd8cd71 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentXadd8cd71")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentXadd8cd71 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentXadd8cd71(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentXadd8cd71) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentXadd8cd71")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentXadd8cd71(block: InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentXadd8cd71.Builder.() -> Unit): InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentXadd8cd71 = InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentXadd8cd71.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestRe0d91PullRequestLinksReviewCommentXadd8cd71 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
