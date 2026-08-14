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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/pull_reques
 * t/properties/_links/properties/comments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/pull_reques
 * t/properties/_links/properties/comments
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommentsXfa2f854f.Serializer::class)
public class InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommentsXfa2f854f(
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

    public fun build(): InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommentsXfa2f854f {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommentsXfa2f854f(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommentsXfa2f854f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommentsXfa2f854f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommentsXfa2f854f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommentsXfa2f854f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommentsXfa2f854f must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommentsXfa2f854f(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommentsXfa2f854f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommentsXfa2f854f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommentsXfa2f854f(block: InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommentsXfa2f854f.Builder.() -> Unit): InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommentsXfa2f854f = InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommentsXfa2f854f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksCommentsXfa2f854f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
