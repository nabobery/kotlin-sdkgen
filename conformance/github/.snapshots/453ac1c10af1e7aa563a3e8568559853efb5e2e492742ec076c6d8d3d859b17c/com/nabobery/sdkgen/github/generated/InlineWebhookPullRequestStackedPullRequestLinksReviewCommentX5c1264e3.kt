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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/_lin
 * ks/properties/review_comment.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/_lin
 * ks/properties/review_comment
 */
@Serializable(with = InlineWebhookPullRequestStackedPullRequestLinksReviewCommentX5c1264e3.Serializer::class)
public class InlineWebhookPullRequestStackedPullRequestLinksReviewCommentX5c1264e3(
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

    public fun build(): InlineWebhookPullRequestStackedPullRequestLinksReviewCommentX5c1264e3 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestStackedPullRequestLinksReviewCommentX5c1264e3(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestStackedPullRequestLinksReviewCommentX5c1264e3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestStackedPullRequestLinksReviewCommentX5c1264e3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestStackedPullRequestLinksReviewCommentX5c1264e3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestStackedPullRequestLinksReviewCommentX5c1264e3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestStackedPullRequestLinksReviewCommentX5c1264e3 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestStackedPullRequestLinksReviewCommentX5c1264e3(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestStackedPullRequestLinksReviewCommentX5c1264e3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestStackedPullRequestLinksReviewCommentX5c1264e3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestStackedPullRequestLinksReviewCommentX5c1264e3(block: InlineWebhookPullRequestStackedPullRequestLinksReviewCommentX5c1264e3.Builder.() -> Unit): InlineWebhookPullRequestStackedPullRequestLinksReviewCommentX5c1264e3 = InlineWebhookPullRequestStackedPullRequestLinksReviewCommentX5c1264e3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestStackedPullRequestLinksReviewCommentX5c1264e3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
