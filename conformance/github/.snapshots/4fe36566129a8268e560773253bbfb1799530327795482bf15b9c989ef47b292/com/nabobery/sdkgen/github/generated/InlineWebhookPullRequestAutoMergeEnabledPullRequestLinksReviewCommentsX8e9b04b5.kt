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
 * erties/_links/properties/review_comments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-enabled/properties/pull_request/prop
 * erties/_links/properties/review_comments
 */
@Serializable(with = InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentsX8e9b04b5.Serializer::class)
public class InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentsX8e9b04b5(
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

    public fun build(): InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentsX8e9b04b5 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentsX8e9b04b5(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentsX8e9b04b5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentsX8e9b04b5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentsX8e9b04b5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentsX8e9b04b5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentsX8e9b04b5 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentsX8e9b04b5(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentsX8e9b04b5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentsX8e9b04b5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentsX8e9b04b5(block: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentsX8e9b04b5.Builder.() -> Unit): InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentsX8e9b04b5 = InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentsX8e9b04b5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksReviewCommentsX8e9b04b5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
