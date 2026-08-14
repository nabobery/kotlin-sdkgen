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
 * t/properties/_links/properties/review_comments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/pull_reques
 * t/properties/_links/properties/review_comments
 */
@Serializable(with = InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentsX431324ea.Serializer::class)
public class InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentsX431324ea(
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

    public fun build(): InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentsX431324ea {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentsX431324ea(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentsX431324ea = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentsX431324ea> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentsX431324ea {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentsX431324ea")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentsX431324ea must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentsX431324ea(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentsX431324ea) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentsX431324ea")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentsX431324ea(block: InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentsX431324ea.Builder.() -> Unit): InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentsX431324ea = InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentsX431324ea.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestRe5e87PullRequestLinksReviewCommentsX431324ea is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
