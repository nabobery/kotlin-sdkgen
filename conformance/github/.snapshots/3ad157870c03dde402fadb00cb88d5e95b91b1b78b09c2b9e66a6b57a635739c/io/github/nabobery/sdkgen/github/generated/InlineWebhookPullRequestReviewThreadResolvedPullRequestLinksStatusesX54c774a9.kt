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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/pull_request/
 * properties/_links/properties/statuses.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/pull_request/
 * properties/_links/properties/statuses
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksStatusesX54c774a9.Serializer::class)
public class InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksStatusesX54c774a9(
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

    public fun build(): InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksStatusesX54c774a9 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksStatusesX54c774a9(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksStatusesX54c774a9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksStatusesX54c774a9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksStatusesX54c774a9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksStatusesX54c774a9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksStatusesX54c774a9 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksStatusesX54c774a9(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksStatusesX54c774a9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksStatusesX54c774a9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewThreadResolvedPullRequestLinksStatusesX54c774a9(block: InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksStatusesX54c774a9.Builder.() -> Unit): InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksStatusesX54c774a9 = InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksStatusesX54c774a9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksStatusesX54c774a9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
