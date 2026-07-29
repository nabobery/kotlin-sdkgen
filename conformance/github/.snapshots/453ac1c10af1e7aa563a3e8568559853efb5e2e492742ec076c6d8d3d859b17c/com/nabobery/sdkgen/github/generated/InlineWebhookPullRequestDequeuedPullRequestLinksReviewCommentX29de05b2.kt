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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/_li
 * nks/properties/review_comment.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/_li
 * nks/properties/review_comment
 */
@Serializable(with = InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentX29de05b2.Serializer::class)
public class InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentX29de05b2(
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

    public fun build(): InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentX29de05b2 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentX29de05b2(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentX29de05b2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentX29de05b2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentX29de05b2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentX29de05b2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentX29de05b2 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentX29de05b2(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentX29de05b2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentX29de05b2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentX29de05b2(block: InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentX29de05b2.Builder.() -> Unit): InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentX29de05b2 = InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentX29de05b2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestDequeuedPullRequestLinksReviewCommentX29de05b2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
