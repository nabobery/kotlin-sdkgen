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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_review/properties/_links/properties/pull_request.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_review/properties/_links/properties/pull_request
 */
@Serializable(with = InlineWebhooksReviewLinksPullRequestX1af91c96.Serializer::class)
public class InlineWebhooksReviewLinksPullRequestX1af91c96(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhooksReviewLinksPullRequestX1af91c96 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhooksReviewLinksPullRequestX1af91c96(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhooksReviewLinksPullRequestX1af91c96 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhooksReviewLinksPullRequestX1af91c96> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksReviewLinksPullRequestX1af91c96 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksReviewLinksPullRequestX1af91c96")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksReviewLinksPullRequestX1af91c96 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhooksReviewLinksPullRequestX1af91c96(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksReviewLinksPullRequestX1af91c96) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksReviewLinksPullRequestX1af91c96")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhooksReviewLinksPullRequestX1af91c96(block: InlineWebhooksReviewLinksPullRequestX1af91c96.Builder.() -> Unit): InlineWebhooksReviewLinksPullRequestX1af91c96 = InlineWebhooksReviewLinksPullRequestX1af91c96.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhooksReviewLinksPullRequestX1af91c96 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
