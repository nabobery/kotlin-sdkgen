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
 * ties/_links/properties/statuses.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/_links/properties/statuses
 */
@Serializable(with = InlineWebhookPullRequestReviewSubmittedPullRequestLinksStatusesX56f4ffe6.Serializer::class)
public class InlineWebhookPullRequestReviewSubmittedPullRequestLinksStatusesX56f4ffe6(
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

    public fun build(): InlineWebhookPullRequestReviewSubmittedPullRequestLinksStatusesX56f4ffe6 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewSubmittedPullRequestLinksStatusesX56f4ffe6(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewSubmittedPullRequestLinksStatusesX56f4ffe6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewSubmittedPullRequestLinksStatusesX56f4ffe6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewSubmittedPullRequestLinksStatusesX56f4ffe6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewSubmittedPullRequestLinksStatusesX56f4ffe6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewSubmittedPullRequestLinksStatusesX56f4ffe6 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewSubmittedPullRequestLinksStatusesX56f4ffe6(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewSubmittedPullRequestLinksStatusesX56f4ffe6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewSubmittedPullRequestLinksStatusesX56f4ffe6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewSubmittedPullRequestLinksStatusesX56f4ffe6(block: InlineWebhookPullRequestReviewSubmittedPullRequestLinksStatusesX56f4ffe6.Builder.() -> Unit): InlineWebhookPullRequestReviewSubmittedPullRequestLinksStatusesX56f4ffe6 = InlineWebhookPullRequestReviewSubmittedPullRequestLinksStatusesX56f4ffe6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewSubmittedPullRequestLinksStatusesX56f4ffe6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
