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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/_links/properties/issue.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/_links/properties/issue
 */
@Serializable(with = InlineWebhooksPullRequest5LinksIssueX27379d77.Serializer::class)
public class InlineWebhooksPullRequest5LinksIssueX27379d77(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhooksPullRequest5LinksIssueX27379d77 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhooksPullRequest5LinksIssueX27379d77(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhooksPullRequest5LinksIssueX27379d77 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhooksPullRequest5LinksIssueX27379d77> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5LinksIssueX27379d77 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksPullRequest5LinksIssueX27379d77")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksPullRequest5LinksIssueX27379d77 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhooksPullRequest5LinksIssueX27379d77(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5LinksIssueX27379d77) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksPullRequest5LinksIssueX27379d77")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhooksPullRequest5LinksIssueX27379d77(block: InlineWebhooksPullRequest5LinksIssueX27379d77.Builder.() -> Unit): InlineWebhooksPullRequest5LinksIssueX27379d77 = InlineWebhooksPullRequest5LinksIssueX27379d77.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhooksPullRequest5LinksIssueX27379d77 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
