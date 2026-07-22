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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/pull_request/
 * properties/_links/properties/statuses.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/pull_request/
 * properties/_links/properties/statuses
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksStatusesX7eab5d89.Serializer::class)
public class InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksStatusesX7eab5d89(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksStatusesX7eab5d89 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksStatusesX7eab5d89(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksStatusesX7eab5d89 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksStatusesX7eab5d89> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksStatusesX7eab5d89 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksStatusesX7eab5d89")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksStatusesX7eab5d89 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksStatusesX7eab5d89(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksStatusesX7eab5d89) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksStatusesX7eab5d89")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewCommentCreatedPullRequestLinksStatusesX7eab5d89(block: InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksStatusesX7eab5d89.Builder.() -> Unit): InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksStatusesX7eab5d89 = InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksStatusesX7eab5d89.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksStatusesX7eab5d89 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
