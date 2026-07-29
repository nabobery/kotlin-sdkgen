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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/_links/properties/html.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/_links/properties/html
 */
@Serializable(with = InlineWebhooksPullRequest5LinksHtmlX4af1a16c.Serializer::class)
public class InlineWebhooksPullRequest5LinksHtmlX4af1a16c(
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

    public fun build(): InlineWebhooksPullRequest5LinksHtmlX4af1a16c {
      check(hrefValue != null) { "href is required" }
      return InlineWebhooksPullRequest5LinksHtmlX4af1a16c(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhooksPullRequest5LinksHtmlX4af1a16c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhooksPullRequest5LinksHtmlX4af1a16c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5LinksHtmlX4af1a16c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksPullRequest5LinksHtmlX4af1a16c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksPullRequest5LinksHtmlX4af1a16c must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhooksPullRequest5LinksHtmlX4af1a16c(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5LinksHtmlX4af1a16c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksPullRequest5LinksHtmlX4af1a16c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhooksPullRequest5LinksHtmlX4af1a16c(block: InlineWebhooksPullRequest5LinksHtmlX4af1a16c.Builder.() -> Unit): InlineWebhooksPullRequest5LinksHtmlX4af1a16c = InlineWebhooksPullRequest5LinksHtmlX4af1a16c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhooksPullRequest5LinksHtmlX4af1a16c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
