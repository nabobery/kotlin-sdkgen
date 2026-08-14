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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request/proper
 * ties/_links/properties/statuses.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request/proper
 * ties/_links/properties/statuses
 */
@Serializable(with = InlineWebhookPullRequestReviewDismissedPullRequestLinksStatusesXac10fd39.Serializer::class)
public class InlineWebhookPullRequestReviewDismissedPullRequestLinksStatusesXac10fd39(
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

    public fun build(): InlineWebhookPullRequestReviewDismissedPullRequestLinksStatusesXac10fd39 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewDismissedPullRequestLinksStatusesXac10fd39(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewDismissedPullRequestLinksStatusesXac10fd39 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewDismissedPullRequestLinksStatusesXac10fd39> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewDismissedPullRequestLinksStatusesXac10fd39 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewDismissedPullRequestLinksStatusesXac10fd39")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewDismissedPullRequestLinksStatusesXac10fd39 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewDismissedPullRequestLinksStatusesXac10fd39(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewDismissedPullRequestLinksStatusesXac10fd39) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewDismissedPullRequestLinksStatusesXac10fd39")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewDismissedPullRequestLinksStatusesXac10fd39(block: InlineWebhookPullRequestReviewDismissedPullRequestLinksStatusesXac10fd39.Builder.() -> Unit): InlineWebhookPullRequestReviewDismissedPullRequestLinksStatusesXac10fd39 = InlineWebhookPullRequestReviewDismissedPullRequestLinksStatusesXac10fd39.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewDismissedPullRequestLinksStatusesXac10fd39 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
