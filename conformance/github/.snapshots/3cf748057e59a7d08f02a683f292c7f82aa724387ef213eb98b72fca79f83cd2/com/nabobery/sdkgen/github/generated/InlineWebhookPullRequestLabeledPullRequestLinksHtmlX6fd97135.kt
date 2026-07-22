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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/_lin
 * ks/properties/html.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/_lin
 * ks/properties/html
 */
@Serializable(with = InlineWebhookPullRequestLabeledPullRequestLinksHtmlX6fd97135.Serializer::class)
public class InlineWebhookPullRequestLabeledPullRequestLinksHtmlX6fd97135(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestLabeledPullRequestLinksHtmlX6fd97135 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestLabeledPullRequestLinksHtmlX6fd97135(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestLabeledPullRequestLinksHtmlX6fd97135 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestLabeledPullRequestLinksHtmlX6fd97135> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLabeledPullRequestLinksHtmlX6fd97135 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestLabeledPullRequestLinksHtmlX6fd97135")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestLabeledPullRequestLinksHtmlX6fd97135 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestLabeledPullRequestLinksHtmlX6fd97135(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLabeledPullRequestLinksHtmlX6fd97135) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestLabeledPullRequestLinksHtmlX6fd97135")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestLabeledPullRequestLinksHtmlX6fd97135(block: InlineWebhookPullRequestLabeledPullRequestLinksHtmlX6fd97135.Builder.() -> Unit): InlineWebhookPullRequestLabeledPullRequestLinksHtmlX6fd97135 = InlineWebhookPullRequestLabeledPullRequestLinksHtmlX6fd97135.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestLabeledPullRequestLinksHtmlX6fd97135 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
