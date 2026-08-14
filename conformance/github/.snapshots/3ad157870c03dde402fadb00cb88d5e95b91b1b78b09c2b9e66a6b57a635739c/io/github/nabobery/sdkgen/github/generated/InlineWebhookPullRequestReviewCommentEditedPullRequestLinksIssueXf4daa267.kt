package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request/p
 * roperties/_links/properties/issue.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request/p
 * roperties/_links/properties/issue
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentEditedPullRequestLinksIssueXf4daa267.Serializer::class)
public class InlineWebhookPullRequestReviewCommentEditedPullRequestLinksIssueXf4daa267(
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

    public fun build(): InlineWebhookPullRequestReviewCommentEditedPullRequestLinksIssueXf4daa267 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewCommentEditedPullRequestLinksIssueXf4daa267(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewCommentEditedPullRequestLinksIssueXf4daa267 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentEditedPullRequestLinksIssueXf4daa267> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentEditedPullRequestLinksIssueXf4daa267 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewCommentEditedPullRequestLinksIssueXf4daa267")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewCommentEditedPullRequestLinksIssueXf4daa267 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewCommentEditedPullRequestLinksIssueXf4daa267(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentEditedPullRequestLinksIssueXf4daa267) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewCommentEditedPullRequestLinksIssueXf4daa267")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewCommentEditedPullRequestLinksIssueXf4daa267(block: InlineWebhookPullRequestReviewCommentEditedPullRequestLinksIssueXf4daa267.Builder.() -> Unit): InlineWebhookPullRequestReviewCommentEditedPullRequestLinksIssueXf4daa267 = InlineWebhookPullRequestReviewCommentEditedPullRequestLinksIssueXf4daa267.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewCommentEditedPullRequestLinksIssueXf4daa267 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
