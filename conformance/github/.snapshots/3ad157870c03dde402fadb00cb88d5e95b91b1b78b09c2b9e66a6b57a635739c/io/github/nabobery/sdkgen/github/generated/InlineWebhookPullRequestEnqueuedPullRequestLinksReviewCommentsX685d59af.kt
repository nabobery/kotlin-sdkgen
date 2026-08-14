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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/_li
 * nks/properties/review_comments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/_li
 * nks/properties/review_comments
 */
@Serializable(with = InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentsX685d59af.Serializer::class)
public class InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentsX685d59af(
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

    public fun build(): InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentsX685d59af {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentsX685d59af(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentsX685d59af = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentsX685d59af> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentsX685d59af {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentsX685d59af")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentsX685d59af must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentsX685d59af(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentsX685d59af) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentsX685d59af")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentsX685d59af(block: InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentsX685d59af.Builder.() -> Unit): InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentsX685d59af = InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentsX685d59af.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestEnqueuedPullRequestLinksReviewCommentsX685d59af is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
