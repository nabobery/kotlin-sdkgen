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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/0/properties/pull_reques
 * t/properties/_links/properties/review_comment.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/0/properties/pull_reques
 * t/properties/_links/properties/review_comment
 */
@Serializable(with = InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentXfccebef3.Serializer::class)
public class InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentXfccebef3(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentXfccebef3 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentXfccebef3(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentXfccebef3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentXfccebef3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentXfccebef3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentXfccebef3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentXfccebef3 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentXfccebef3(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentXfccebef3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentXfccebef3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentXfccebef3(block: InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentXfccebef3.Builder.() -> Unit): InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentXfccebef3 = InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentXfccebef3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReffb1OneOf1PullRequestLinksReviewCommentXfccebef3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
