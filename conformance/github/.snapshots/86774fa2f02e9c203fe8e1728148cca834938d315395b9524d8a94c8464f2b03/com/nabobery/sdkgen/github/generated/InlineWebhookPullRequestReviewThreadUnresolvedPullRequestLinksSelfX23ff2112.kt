package com.nabobery.sdkgen.github.generated

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
 * t/properties/_links/properties/self.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/pull_reques
 * t/properties/_links/properties/self
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksSelfX23ff2112.Serializer::class)
public class InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksSelfX23ff2112(
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

    public fun build(): InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksSelfX23ff2112 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksSelfX23ff2112(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksSelfX23ff2112 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksSelfX23ff2112> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksSelfX23ff2112 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksSelfX23ff2112")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksSelfX23ff2112 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksSelfX23ff2112(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksSelfX23ff2112) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksSelfX23ff2112")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksSelfX23ff2112(block: InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksSelfX23ff2112.Builder.() -> Unit): InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksSelfX23ff2112 = InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksSelfX23ff2112.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewThreadUnresolvedPullRequestLinksSelfX23ff2112 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
