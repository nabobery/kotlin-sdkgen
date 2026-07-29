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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhooks_review/properties/_links.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_review/properties/_links
 */
@Serializable(with = InlineWebhooksReviewLinksX0258f734.Serializer::class)
public class InlineWebhooksReviewLinksX0258f734(
  public val html: InlineWebhooksReviewLinksHtmlX0a641fcb,
  public val pullRequest: InlineWebhooksReviewLinksPullRequestX1af91c96,
) {
  public class Builder {
    private var htmlValue: InlineWebhooksReviewLinksHtmlX0a641fcb? = null

    public var html: InlineWebhooksReviewLinksHtmlX0a641fcb
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var pullRequestValue: InlineWebhooksReviewLinksPullRequestX1af91c96? = null

    public var pullRequest: InlineWebhooksReviewLinksPullRequestX1af91c96
      get() = requireNotNull(pullRequestValue) { "pullRequest is required" }
      set(`value`) {
        pullRequestValue = value
      }

    public fun build(): InlineWebhooksReviewLinksX0258f734 {
      check(htmlValue != null) { "html is required" }
      check(pullRequestValue != null) { "pullRequest is required" }
      return InlineWebhooksReviewLinksX0258f734(
        html = html,
        pullRequest = pullRequest,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhooksReviewLinksX0258f734 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhooksReviewLinksX0258f734> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksReviewLinksX0258f734 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksReviewLinksX0258f734")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksReviewLinksX0258f734 must be a JSON object")
      val html = json.decodeRequired<InlineWebhooksReviewLinksHtmlX0a641fcb>(rawObject, "html")
      val pullRequest = json.decodeRequired<InlineWebhooksReviewLinksPullRequestX1af91c96>(rawObject, "pull_request")
      return InlineWebhooksReviewLinksX0258f734(
        html = html,
        pullRequest = pullRequest,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksReviewLinksX0258f734) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksReviewLinksX0258f734")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("html", json.encodeToJsonElement(value.html))
        put("pull_request", json.encodeToJsonElement(value.pullRequest))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhooksReviewLinksX0258f734(block: InlineWebhooksReviewLinksX0258f734.Builder.() -> Unit): InlineWebhooksReviewLinksX0258f734 = InlineWebhooksReviewLinksX0258f734.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhooksReviewLinksX0258f734 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
