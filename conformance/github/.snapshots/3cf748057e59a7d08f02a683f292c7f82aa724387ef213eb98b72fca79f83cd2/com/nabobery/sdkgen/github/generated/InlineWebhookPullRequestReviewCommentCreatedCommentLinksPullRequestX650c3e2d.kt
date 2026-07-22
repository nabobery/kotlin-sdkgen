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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/comment/prope
 * rties/_links/properties/pull_request.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/comment/prope
 * rties/_links/properties/pull_request
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentCreatedCommentLinksPullRequestX650c3e2d.Serializer::class)
public class InlineWebhookPullRequestReviewCommentCreatedCommentLinksPullRequestX650c3e2d(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewCommentCreatedCommentLinksPullRequestX650c3e2d {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewCommentCreatedCommentLinksPullRequestX650c3e2d(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewCommentCreatedCommentLinksPullRequestX650c3e2d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentCreatedCommentLinksPullRequestX650c3e2d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentCreatedCommentLinksPullRequestX650c3e2d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewCommentCreatedCommentLinksPullRequestX650c3e2d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewCommentCreatedCommentLinksPullRequestX650c3e2d must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewCommentCreatedCommentLinksPullRequestX650c3e2d(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentCreatedCommentLinksPullRequestX650c3e2d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewCommentCreatedCommentLinksPullRequestX650c3e2d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewCommentCreatedCommentLinksPullRequestX650c3e2d(block: InlineWebhookPullRequestReviewCommentCreatedCommentLinksPullRequestX650c3e2d.Builder.() -> Unit): InlineWebhookPullRequestReviewCommentCreatedCommentLinksPullRequestX650c3e2d = InlineWebhookPullRequestReviewCommentCreatedCommentLinksPullRequestX650c3e2d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewCommentCreatedCommentLinksPullRequestX650c3e2d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
