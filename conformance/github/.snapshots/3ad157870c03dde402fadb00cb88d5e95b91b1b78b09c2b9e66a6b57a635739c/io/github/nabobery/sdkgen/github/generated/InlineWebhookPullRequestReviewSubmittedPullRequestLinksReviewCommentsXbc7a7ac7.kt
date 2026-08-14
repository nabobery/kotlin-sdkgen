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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/_links/properties/review_comments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/_links/properties/review_comments
 */
@Serializable(with = InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentsXbc7a7ac7.Serializer::class)
public class InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentsXbc7a7ac7(
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

    public fun build(): InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentsXbc7a7ac7 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentsXbc7a7ac7(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentsXbc7a7ac7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentsXbc7a7ac7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentsXbc7a7ac7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentsXbc7a7ac7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentsXbc7a7ac7 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentsXbc7a7ac7(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentsXbc7a7ac7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentsXbc7a7ac7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentsXbc7a7ac7(block: InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentsXbc7a7ac7.Builder.() -> Unit): InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentsXbc7a7ac7 = InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentsXbc7a7ac7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewSubmittedPullRequestLinksReviewCommentsXbc7a7ac7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
