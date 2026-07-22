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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-enabled/properties/pull_request/prop
 * erties/_links/properties/review_comment.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-enabled/properties/pull_request/prop
 * erties/_links/properties/review_comment
 */
@Serializable(with = InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentX3e259a8c.Serializer::class)
public class InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentX3e259a8c(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentX3e259a8c {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentX3e259a8c(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentX3e259a8c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentX3e259a8c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentX3e259a8c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentX3e259a8c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentX3e259a8c must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentX3e259a8c(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentX3e259a8c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentX3e259a8c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentX3e259a8c(block: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentX3e259a8c.Builder.() -> Unit): InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentX3e259a8c = InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentX3e259a8c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentX3e259a8c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
