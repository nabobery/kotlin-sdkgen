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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/thread/proper
 * ties/comments/items/properties/_links/properties/self.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/thread/proper
 * ties/comments/items/properties/_links/properties/self
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksSelfX938a6aa5.Serializer::class)
public class InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksSelfX938a6aa5(
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

    public fun build(): InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksSelfX938a6aa5 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksSelfX938a6aa5(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksSelfX938a6aa5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksSelfX938a6aa5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksSelfX938a6aa5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksSelfX938a6aa5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksSelfX938a6aa5 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksSelfX938a6aa5(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksSelfX938a6aa5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksSelfX938a6aa5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksSelfX938a6aa5(block: InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksSelfX938a6aa5.Builder.() -> Unit): InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksSelfX938a6aa5 = InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksSelfX938a6aa5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemLinksSelfX938a6aa5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
