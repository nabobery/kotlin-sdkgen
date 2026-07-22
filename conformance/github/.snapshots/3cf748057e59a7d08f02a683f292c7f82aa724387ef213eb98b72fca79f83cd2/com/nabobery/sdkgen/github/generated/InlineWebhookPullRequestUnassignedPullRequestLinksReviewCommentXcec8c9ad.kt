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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/_
 * links/properties/review_comment.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/_
 * links/properties/review_comment
 */
@Serializable(with = InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentXcec8c9ad.Serializer::class)
public class InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentXcec8c9ad(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentXcec8c9ad {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentXcec8c9ad(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentXcec8c9ad = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentXcec8c9ad> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentXcec8c9ad {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentXcec8c9ad")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentXcec8c9ad must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentXcec8c9ad(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentXcec8c9ad) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentXcec8c9ad")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentXcec8c9ad(block: InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentXcec8c9ad.Builder.() -> Unit): InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentXcec8c9ad = InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentXcec8c9ad.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestUnassignedPullRequestLinksReviewCommentXcec8c9ad is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
