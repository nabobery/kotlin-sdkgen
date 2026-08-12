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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/_li
 * nks/properties/html.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/_li
 * nks/properties/html
 */
@Serializable(with = InlineWebhookPullRequestEnqueuedPullRequestLinksHtmlXb01a81aa.Serializer::class)
public class InlineWebhookPullRequestEnqueuedPullRequestLinksHtmlXb01a81aa(
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

    public fun build(): InlineWebhookPullRequestEnqueuedPullRequestLinksHtmlXb01a81aa {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestEnqueuedPullRequestLinksHtmlXb01a81aa(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestEnqueuedPullRequestLinksHtmlXb01a81aa = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestEnqueuedPullRequestLinksHtmlXb01a81aa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEnqueuedPullRequestLinksHtmlXb01a81aa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestEnqueuedPullRequestLinksHtmlXb01a81aa")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestEnqueuedPullRequestLinksHtmlXb01a81aa must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestEnqueuedPullRequestLinksHtmlXb01a81aa(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEnqueuedPullRequestLinksHtmlXb01a81aa) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestEnqueuedPullRequestLinksHtmlXb01a81aa")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestEnqueuedPullRequestLinksHtmlXb01a81aa(block: InlineWebhookPullRequestEnqueuedPullRequestLinksHtmlXb01a81aa.Builder.() -> Unit): InlineWebhookPullRequestEnqueuedPullRequestLinksHtmlXb01a81aa = InlineWebhookPullRequestEnqueuedPullRequestLinksHtmlXb01a81aa.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestEnqueuedPullRequestLinksHtmlXb01a81aa is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
