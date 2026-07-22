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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/_li
 * nks/properties/review_comment.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/_li
 * nks/properties/review_comment
 */
@Serializable(with = InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentXd284cea6.Serializer::class)
public class InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentXd284cea6(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentXd284cea6 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentXd284cea6(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentXd284cea6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentXd284cea6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentXd284cea6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentXd284cea6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentXd284cea6 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentXd284cea6(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentXd284cea6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentXd284cea6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentXd284cea6(block: InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentXd284cea6.Builder.() -> Unit): InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentXd284cea6 = InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentXd284cea6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentXd284cea6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
