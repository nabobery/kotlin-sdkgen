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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/pull_request/properties/_l
 * inks/properties/review_comments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/pull_request/properties/_l
 * inks/properties/review_comments
 */
@Serializable(with = InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentsXe96f0fee.Serializer::class)
public class InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentsXe96f0fee(
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

    public fun build(): InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentsXe96f0fee {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentsXe96f0fee(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentsXe96f0fee = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentsXe96f0fee> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentsXe96f0fee {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentsXe96f0fee")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentsXe96f0fee must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentsXe96f0fee(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentsXe96f0fee) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentsXe96f0fee")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentsXe96f0fee(block: InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentsXe96f0fee.Builder.() -> Unit): InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentsXe96f0fee = InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentsXe96f0fee.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentsXe96f0fee is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
