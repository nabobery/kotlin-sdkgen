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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/0/properties/pull_reques
 * t/properties/_links/properties/self.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/0/properties/pull_reques
 * t/properties/_links/properties/self
 */
@Serializable(with = InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksSelfX83dae402.Serializer::class)
public class InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksSelfX83dae402(
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

    public fun build(): InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksSelfX83dae402 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksSelfX83dae402(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksSelfX83dae402 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksSelfX83dae402> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksSelfX83dae402 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksSelfX83dae402")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksSelfX83dae402 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksSelfX83dae402(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksSelfX83dae402) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksSelfX83dae402")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksSelfX83dae402(block: InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksSelfX83dae402.Builder.() -> Unit): InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksSelfX83dae402 = InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksSelfX83dae402.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewRequestedOneOf1PullRequestLinksSelfX83dae402 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
