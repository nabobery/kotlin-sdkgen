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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/_li
 * nks/properties/html.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/_li
 * nks/properties/html
 */
@Serializable(with = InlineWebhookPullRequestDequeuedPullRequestLinksHtmlX2b2d0d30.Serializer::class)
public class InlineWebhookPullRequestDequeuedPullRequestLinksHtmlX2b2d0d30(
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

    public fun build(): InlineWebhookPullRequestDequeuedPullRequestLinksHtmlX2b2d0d30 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestDequeuedPullRequestLinksHtmlX2b2d0d30(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestDequeuedPullRequestLinksHtmlX2b2d0d30 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestDequeuedPullRequestLinksHtmlX2b2d0d30> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestDequeuedPullRequestLinksHtmlX2b2d0d30 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestDequeuedPullRequestLinksHtmlX2b2d0d30")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestDequeuedPullRequestLinksHtmlX2b2d0d30 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestDequeuedPullRequestLinksHtmlX2b2d0d30(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestDequeuedPullRequestLinksHtmlX2b2d0d30) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestDequeuedPullRequestLinksHtmlX2b2d0d30")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestDequeuedPullRequestLinksHtmlX2b2d0d30(block: InlineWebhookPullRequestDequeuedPullRequestLinksHtmlX2b2d0d30.Builder.() -> Unit): InlineWebhookPullRequestDequeuedPullRequestLinksHtmlX2b2d0d30 = InlineWebhookPullRequestDequeuedPullRequestLinksHtmlX2b2d0d30.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestDequeuedPullRequestLinksHtmlX2b2d0d30 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
