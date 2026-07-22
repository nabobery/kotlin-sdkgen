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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/_link
 * s/properties/review_comment.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/_link
 * s/properties/review_comment
 */
@Serializable(with = InlineWebhookPullRequestLockedPullRequestLinksReviewCommentX9d16b63e.Serializer::class)
public class InlineWebhookPullRequestLockedPullRequestLinksReviewCommentX9d16b63e(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestLockedPullRequestLinksReviewCommentX9d16b63e {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestLockedPullRequestLinksReviewCommentX9d16b63e(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestLockedPullRequestLinksReviewCommentX9d16b63e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestLockedPullRequestLinksReviewCommentX9d16b63e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLockedPullRequestLinksReviewCommentX9d16b63e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestLockedPullRequestLinksReviewCommentX9d16b63e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestLockedPullRequestLinksReviewCommentX9d16b63e must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestLockedPullRequestLinksReviewCommentX9d16b63e(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLockedPullRequestLinksReviewCommentX9d16b63e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestLockedPullRequestLinksReviewCommentX9d16b63e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestLockedPullRequestLinksReviewCommentX9d16b63e(block: InlineWebhookPullRequestLockedPullRequestLinksReviewCommentX9d16b63e.Builder.() -> Unit): InlineWebhookPullRequestLockedPullRequestLinksReviewCommentX9d16b63e = InlineWebhookPullRequestLockedPullRequestLinksReviewCommentX9d16b63e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestLockedPullRequestLinksReviewCommentX9d16b63e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
