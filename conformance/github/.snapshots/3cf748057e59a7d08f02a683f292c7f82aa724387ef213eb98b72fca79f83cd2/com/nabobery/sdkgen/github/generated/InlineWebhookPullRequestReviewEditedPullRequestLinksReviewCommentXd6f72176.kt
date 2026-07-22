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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/pull_request/propertie
 * s/_links/properties/review_comment.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/pull_request/propertie
 * s/_links/properties/review_comment
 */
@Serializable(with = InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentXd6f72176.Serializer::class)
public class InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentXd6f72176(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentXd6f72176 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentXd6f72176(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentXd6f72176 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentXd6f72176> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentXd6f72176 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentXd6f72176")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentXd6f72176 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentXd6f72176(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentXd6f72176) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentXd6f72176")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentXd6f72176(block: InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentXd6f72176.Builder.() -> Unit): InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentXd6f72176 = InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentXd6f72176.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentXd6f72176 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
