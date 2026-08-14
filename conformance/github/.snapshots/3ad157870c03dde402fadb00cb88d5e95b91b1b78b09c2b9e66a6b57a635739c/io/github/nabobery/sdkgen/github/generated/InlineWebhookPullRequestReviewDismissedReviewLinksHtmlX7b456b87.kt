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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/review/properties/_
 * links/properties/html.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/review/properties/_
 * links/properties/html
 */
@Serializable(with = InlineWebhookPullRequestReviewDismissedReviewLinksHtmlX7b456b87.Serializer::class)
public class InlineWebhookPullRequestReviewDismissedReviewLinksHtmlX7b456b87(
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

    public fun build(): InlineWebhookPullRequestReviewDismissedReviewLinksHtmlX7b456b87 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewDismissedReviewLinksHtmlX7b456b87(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewDismissedReviewLinksHtmlX7b456b87 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewDismissedReviewLinksHtmlX7b456b87> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewDismissedReviewLinksHtmlX7b456b87 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewDismissedReviewLinksHtmlX7b456b87")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewDismissedReviewLinksHtmlX7b456b87 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewDismissedReviewLinksHtmlX7b456b87(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewDismissedReviewLinksHtmlX7b456b87) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewDismissedReviewLinksHtmlX7b456b87")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewDismissedReviewLinksHtmlX7b456b87(block: InlineWebhookPullRequestReviewDismissedReviewLinksHtmlX7b456b87.Builder.() -> Unit): InlineWebhookPullRequestReviewDismissedReviewLinksHtmlX7b456b87 = InlineWebhookPullRequestReviewDismissedReviewLinksHtmlX7b456b87.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewDismissedReviewLinksHtmlX7b456b87 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
