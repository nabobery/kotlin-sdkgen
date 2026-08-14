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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/pull_request/
 * properties/_links/properties/html.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/pull_request/
 * properties/_links/properties/html
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksHtmlXa657f30f.Serializer::class)
public class InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksHtmlXa657f30f(
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

    public fun build(): InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksHtmlXa657f30f {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksHtmlXa657f30f(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksHtmlXa657f30f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksHtmlXa657f30f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksHtmlXa657f30f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksHtmlXa657f30f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksHtmlXa657f30f must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksHtmlXa657f30f(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksHtmlXa657f30f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksHtmlXa657f30f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewThreadResolvedPullRequestLinksHtmlXa657f30f(block: InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksHtmlXa657f30f.Builder.() -> Unit): InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksHtmlXa657f30f = InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksHtmlXa657f30f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksHtmlXa657f30f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
