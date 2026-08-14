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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/pull_request/propertie
 * s/_links/properties/review_comments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/pull_request/propertie
 * s/_links/properties/review_comments
 */
@Serializable(with = InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentsX23812c61.Serializer::class)
public class InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentsX23812c61(
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

    public fun build(): InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentsX23812c61 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentsX23812c61(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentsX23812c61 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentsX23812c61> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentsX23812c61 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentsX23812c61")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentsX23812c61 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentsX23812c61(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentsX23812c61) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentsX23812c61")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentsX23812c61(block: InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentsX23812c61.Builder.() -> Unit): InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentsX23812c61 = InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentsX23812c61.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewEditedPullRequestLinksReviewCommentsX23812c61 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
