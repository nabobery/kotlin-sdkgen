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
 * properties/_links/properties/issue.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/pull_request/
 * properties/_links/properties/issue
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksIssueX969c93b1.Serializer::class)
public class InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksIssueX969c93b1(
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

    public fun build(): InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksIssueX969c93b1 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksIssueX969c93b1(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksIssueX969c93b1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksIssueX969c93b1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksIssueX969c93b1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksIssueX969c93b1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksIssueX969c93b1 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksIssueX969c93b1(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksIssueX969c93b1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksIssueX969c93b1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewCommentCreatedPullRequestLinksIssueX969c93b1(block: InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksIssueX969c93b1.Builder.() -> Unit): InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksIssueX969c93b1 = InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksIssueX969c93b1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewCommentCreatedPullRequestLinksIssueX969c93b1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
