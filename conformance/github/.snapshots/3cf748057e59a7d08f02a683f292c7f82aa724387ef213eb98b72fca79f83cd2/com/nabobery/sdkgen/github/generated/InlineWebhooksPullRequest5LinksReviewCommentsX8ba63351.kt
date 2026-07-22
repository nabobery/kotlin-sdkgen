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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/_links/properties/review_comments
 * .
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/_links/properties/review_comments
 */
@Serializable(with = InlineWebhooksPullRequest5LinksReviewCommentsX8ba63351.Serializer::class)
public class InlineWebhooksPullRequest5LinksReviewCommentsX8ba63351(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhooksPullRequest5LinksReviewCommentsX8ba63351 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhooksPullRequest5LinksReviewCommentsX8ba63351(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhooksPullRequest5LinksReviewCommentsX8ba63351 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhooksPullRequest5LinksReviewCommentsX8ba63351> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5LinksReviewCommentsX8ba63351 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksPullRequest5LinksReviewCommentsX8ba63351")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksPullRequest5LinksReviewCommentsX8ba63351 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhooksPullRequest5LinksReviewCommentsX8ba63351(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5LinksReviewCommentsX8ba63351) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksPullRequest5LinksReviewCommentsX8ba63351")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhooksPullRequest5LinksReviewCommentsX8ba63351(block: InlineWebhooksPullRequest5LinksReviewCommentsX8ba63351.Builder.() -> Unit): InlineWebhooksPullRequest5LinksReviewCommentsX8ba63351 = InlineWebhooksPullRequest5LinksReviewCommentsX8ba63351.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhooksPullRequest5LinksReviewCommentsX8ba63351 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
