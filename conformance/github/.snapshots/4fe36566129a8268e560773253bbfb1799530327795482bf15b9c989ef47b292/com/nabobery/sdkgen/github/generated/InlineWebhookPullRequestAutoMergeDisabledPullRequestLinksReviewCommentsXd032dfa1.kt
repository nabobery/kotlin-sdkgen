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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/_links/properties/review_comments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/_links/properties/review_comments
 */
@Serializable(with = InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentsXd032dfa1.Serializer::class)
public class InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentsXd032dfa1(
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

    public fun build(): InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentsXd032dfa1 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentsXd032dfa1(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentsXd032dfa1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentsXd032dfa1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentsXd032dfa1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentsXd032dfa1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentsXd032dfa1 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentsXd032dfa1(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentsXd032dfa1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentsXd032dfa1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentsXd032dfa1(block: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentsXd032dfa1.Builder.() -> Unit): InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentsXd032dfa1 = InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentsXd032dfa1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksReviewCommentsXd032dfa1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
