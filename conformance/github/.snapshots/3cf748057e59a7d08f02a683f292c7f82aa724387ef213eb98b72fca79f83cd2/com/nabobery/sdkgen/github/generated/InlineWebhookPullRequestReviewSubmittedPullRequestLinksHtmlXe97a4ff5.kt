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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/_links/properties/html.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/_links/properties/html
 */
@Serializable(with = InlineWebhookPullRequestReviewSubmittedPullRequestLinksHtmlXe97a4ff5.Serializer::class)
public class InlineWebhookPullRequestReviewSubmittedPullRequestLinksHtmlXe97a4ff5(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewSubmittedPullRequestLinksHtmlXe97a4ff5 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewSubmittedPullRequestLinksHtmlXe97a4ff5(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewSubmittedPullRequestLinksHtmlXe97a4ff5 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewSubmittedPullRequestLinksHtmlXe97a4ff5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewSubmittedPullRequestLinksHtmlXe97a4ff5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewSubmittedPullRequestLinksHtmlXe97a4ff5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewSubmittedPullRequestLinksHtmlXe97a4ff5 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewSubmittedPullRequestLinksHtmlXe97a4ff5(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewSubmittedPullRequestLinksHtmlXe97a4ff5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewSubmittedPullRequestLinksHtmlXe97a4ff5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewSubmittedPullRequestLinksHtmlXe97a4ff5(block: InlineWebhookPullRequestReviewSubmittedPullRequestLinksHtmlXe97a4ff5.Builder.() -> Unit): InlineWebhookPullRequestReviewSubmittedPullRequestLinksHtmlXe97a4ff5 = InlineWebhookPullRequestReviewSubmittedPullRequestLinksHtmlXe97a4ff5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewSubmittedPullRequestLinksHtmlXe97a4ff5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
