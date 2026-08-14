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
 * s/_links/properties/self.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/pull_request/propertie
 * s/_links/properties/self
 */
@Serializable(with = InlineWebhookPullRequestReviewEditedPullRequestLinksSelfX049f05ec.Serializer::class)
public class InlineWebhookPullRequestReviewEditedPullRequestLinksSelfX049f05ec(
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

    public fun build(): InlineWebhookPullRequestReviewEditedPullRequestLinksSelfX049f05ec {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewEditedPullRequestLinksSelfX049f05ec(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewEditedPullRequestLinksSelfX049f05ec = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewEditedPullRequestLinksSelfX049f05ec> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewEditedPullRequestLinksSelfX049f05ec {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewEditedPullRequestLinksSelfX049f05ec")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewEditedPullRequestLinksSelfX049f05ec must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewEditedPullRequestLinksSelfX049f05ec(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewEditedPullRequestLinksSelfX049f05ec) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewEditedPullRequestLinksSelfX049f05ec")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewEditedPullRequestLinksSelfX049f05ec(block: InlineWebhookPullRequestReviewEditedPullRequestLinksSelfX049f05ec.Builder.() -> Unit): InlineWebhookPullRequestReviewEditedPullRequestLinksSelfX049f05ec = InlineWebhookPullRequestReviewEditedPullRequestLinksSelfX049f05ec.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewEditedPullRequestLinksSelfX049f05ec is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
