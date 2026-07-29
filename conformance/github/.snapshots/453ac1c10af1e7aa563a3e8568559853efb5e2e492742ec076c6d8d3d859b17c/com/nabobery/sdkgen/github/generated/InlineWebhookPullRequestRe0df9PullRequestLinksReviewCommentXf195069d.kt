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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/pull_request/
 * properties/_links/properties/review_comment.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/pull_request/
 * properties/_links/properties/review_comment
 */
@Serializable(with = InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentXf195069d.Serializer::class)
public class InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentXf195069d(
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

    public fun build(): InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentXf195069d {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentXf195069d(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentXf195069d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentXf195069d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentXf195069d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentXf195069d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentXf195069d must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentXf195069d(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentXf195069d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentXf195069d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentXf195069d(block: InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentXf195069d.Builder.() -> Unit): InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentXf195069d = InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentXf195069d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestRe0df9PullRequestLinksReviewCommentXf195069d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
