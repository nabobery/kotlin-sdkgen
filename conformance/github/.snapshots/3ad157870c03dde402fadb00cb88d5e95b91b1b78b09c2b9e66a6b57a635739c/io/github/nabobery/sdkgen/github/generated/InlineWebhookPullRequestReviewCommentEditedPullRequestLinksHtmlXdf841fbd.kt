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
 * roperties/_links/properties/html.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request/p
 * roperties/_links/properties/html
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentEditedPullRequestLinksHtmlXdf841fbd.Serializer::class)
public class InlineWebhookPullRequestReviewCommentEditedPullRequestLinksHtmlXdf841fbd(
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

    public fun build(): InlineWebhookPullRequestReviewCommentEditedPullRequestLinksHtmlXdf841fbd {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewCommentEditedPullRequestLinksHtmlXdf841fbd(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewCommentEditedPullRequestLinksHtmlXdf841fbd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentEditedPullRequestLinksHtmlXdf841fbd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentEditedPullRequestLinksHtmlXdf841fbd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewCommentEditedPullRequestLinksHtmlXdf841fbd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewCommentEditedPullRequestLinksHtmlXdf841fbd must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewCommentEditedPullRequestLinksHtmlXdf841fbd(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentEditedPullRequestLinksHtmlXdf841fbd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewCommentEditedPullRequestLinksHtmlXdf841fbd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewCommentEditedPullRequestLinksHtmlXdf841fbd(block: InlineWebhookPullRequestReviewCommentEditedPullRequestLinksHtmlXdf841fbd.Builder.() -> Unit): InlineWebhookPullRequestReviewCommentEditedPullRequestLinksHtmlXdf841fbd = InlineWebhookPullRequestReviewCommentEditedPullRequestLinksHtmlXdf841fbd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewCommentEditedPullRequestLinksHtmlXdf841fbd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
