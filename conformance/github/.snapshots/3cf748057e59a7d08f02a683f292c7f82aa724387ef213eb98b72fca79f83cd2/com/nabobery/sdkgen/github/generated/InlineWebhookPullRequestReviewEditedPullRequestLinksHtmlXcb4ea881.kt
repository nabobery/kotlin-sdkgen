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
 * s/_links/properties/html.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/pull_request/propertie
 * s/_links/properties/html
 */
@Serializable(with = InlineWebhookPullRequestReviewEditedPullRequestLinksHtmlXcb4ea881.Serializer::class)
public class InlineWebhookPullRequestReviewEditedPullRequestLinksHtmlXcb4ea881(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewEditedPullRequestLinksHtmlXcb4ea881 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewEditedPullRequestLinksHtmlXcb4ea881(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewEditedPullRequestLinksHtmlXcb4ea881 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewEditedPullRequestLinksHtmlXcb4ea881> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewEditedPullRequestLinksHtmlXcb4ea881 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewEditedPullRequestLinksHtmlXcb4ea881")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewEditedPullRequestLinksHtmlXcb4ea881 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewEditedPullRequestLinksHtmlXcb4ea881(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewEditedPullRequestLinksHtmlXcb4ea881) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewEditedPullRequestLinksHtmlXcb4ea881")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewEditedPullRequestLinksHtmlXcb4ea881(block: InlineWebhookPullRequestReviewEditedPullRequestLinksHtmlXcb4ea881.Builder.() -> Unit): InlineWebhookPullRequestReviewEditedPullRequestLinksHtmlXcb4ea881 = InlineWebhookPullRequestReviewEditedPullRequestLinksHtmlXcb4ea881.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewEditedPullRequestLinksHtmlXcb4ea881 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
