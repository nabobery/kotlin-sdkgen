package io.github.nabobery.sdkgen.github.generated

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
 * t/properties/_links/properties/html.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/0/properties/pull_reques
 * t/properties/_links/properties/html
 */
@Serializable(with = InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksHtmlX2595f83e.Serializer::class)
public class InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksHtmlX2595f83e(
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

    public fun build(): InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksHtmlX2595f83e {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksHtmlX2595f83e(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksHtmlX2595f83e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksHtmlX2595f83e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksHtmlX2595f83e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksHtmlX2595f83e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksHtmlX2595f83e must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksHtmlX2595f83e(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksHtmlX2595f83e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksHtmlX2595f83e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksHtmlX2595f83e(block: InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksHtmlX2595f83e.Builder.() -> Unit): InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksHtmlX2595f83e = InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksHtmlX2595f83e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksHtmlX2595f83e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
