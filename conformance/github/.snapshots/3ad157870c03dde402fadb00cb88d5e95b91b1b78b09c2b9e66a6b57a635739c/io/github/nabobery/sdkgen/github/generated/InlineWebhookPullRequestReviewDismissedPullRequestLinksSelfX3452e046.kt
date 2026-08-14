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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request/proper
 * ties/_links/properties/self.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request/proper
 * ties/_links/properties/self
 */
@Serializable(with = InlineWebhookPullRequestReviewDismissedPullRequestLinksSelfX3452e046.Serializer::class)
public class InlineWebhookPullRequestReviewDismissedPullRequestLinksSelfX3452e046(
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

    public fun build(): InlineWebhookPullRequestReviewDismissedPullRequestLinksSelfX3452e046 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewDismissedPullRequestLinksSelfX3452e046(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewDismissedPullRequestLinksSelfX3452e046 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewDismissedPullRequestLinksSelfX3452e046> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewDismissedPullRequestLinksSelfX3452e046 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewDismissedPullRequestLinksSelfX3452e046")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewDismissedPullRequestLinksSelfX3452e046 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewDismissedPullRequestLinksSelfX3452e046(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewDismissedPullRequestLinksSelfX3452e046) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewDismissedPullRequestLinksSelfX3452e046")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewDismissedPullRequestLinksSelfX3452e046(block: InlineWebhookPullRequestReviewDismissedPullRequestLinksSelfX3452e046.Builder.() -> Unit): InlineWebhookPullRequestReviewDismissedPullRequestLinksSelfX3452e046 = InlineWebhookPullRequestReviewDismissedPullRequestLinksSelfX3452e046.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewDismissedPullRequestLinksSelfX3452e046 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
