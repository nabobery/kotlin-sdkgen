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
 * ks/properties/review_comments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/_lin
 * ks/properties/review_comments
 */
@Serializable(with = InlineWebhookPullRequestStackedPullRequestLinksReviewCommentsX0515950c.Serializer::class)
public class InlineWebhookPullRequestStackedPullRequestLinksReviewCommentsX0515950c(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestStackedPullRequestLinksReviewCommentsX0515950c {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestStackedPullRequestLinksReviewCommentsX0515950c(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestStackedPullRequestLinksReviewCommentsX0515950c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestStackedPullRequestLinksReviewCommentsX0515950c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestStackedPullRequestLinksReviewCommentsX0515950c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestStackedPullRequestLinksReviewCommentsX0515950c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestStackedPullRequestLinksReviewCommentsX0515950c must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestStackedPullRequestLinksReviewCommentsX0515950c(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestStackedPullRequestLinksReviewCommentsX0515950c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestStackedPullRequestLinksReviewCommentsX0515950c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestStackedPullRequestLinksReviewCommentsX0515950c(block: InlineWebhookPullRequestStackedPullRequestLinksReviewCommentsX0515950c.Builder.() -> Unit): InlineWebhookPullRequestStackedPullRequestLinksReviewCommentsX0515950c = InlineWebhookPullRequestStackedPullRequestLinksReviewCommentsX0515950c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestStackedPullRequestLinksReviewCommentsX0515950c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
