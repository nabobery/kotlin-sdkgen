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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhooks_review_comment/properties/_links.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_review_comment/properties/_links
 */
@Serializable(with = InlineWebhooksReviewCommentLinksX1b9c5a1c.Serializer::class)
public class InlineWebhooksReviewCommentLinksX1b9c5a1c(
  public val html: InlineWebhooksReviewCommentLinksHtmlX95670658,
  public val pullRequest: InlineWebhooksReviewCommentLinksPullRequestXae0116c2,
  public val self: InlineWebhooksReviewCommentLinksSelfXf07380e1,
) {
  public class Builder {
    private var htmlValue: InlineWebhooksReviewCommentLinksHtmlX95670658? = null

    public var html: InlineWebhooksReviewCommentLinksHtmlX95670658
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var pullRequestValue: InlineWebhooksReviewCommentLinksPullRequestXae0116c2? = null

    public var pullRequest: InlineWebhooksReviewCommentLinksPullRequestXae0116c2
      get() = requireNotNull(pullRequestValue) { "pullRequest is required" }
      set(`value`) {
        pullRequestValue = value
      }

    private var selfValue: InlineWebhooksReviewCommentLinksSelfXf07380e1? = null

    public var self: InlineWebhooksReviewCommentLinksSelfXf07380e1
      get() = requireNotNull(selfValue) { "self is required" }
      set(`value`) {
        selfValue = value
      }

    public fun build(): InlineWebhooksReviewCommentLinksX1b9c5a1c {
      check(htmlValue != null) { "html is required" }
      check(pullRequestValue != null) { "pullRequest is required" }
      check(selfValue != null) { "self is required" }
      return InlineWebhooksReviewCommentLinksX1b9c5a1c(
        html = html,
        pullRequest = pullRequest,
        self = self,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhooksReviewCommentLinksX1b9c5a1c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhooksReviewCommentLinksX1b9c5a1c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksReviewCommentLinksX1b9c5a1c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksReviewCommentLinksX1b9c5a1c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksReviewCommentLinksX1b9c5a1c must be a JSON object")
      val html = json.decodeRequired<InlineWebhooksReviewCommentLinksHtmlX95670658>(rawObject, "html")
      val pullRequest = json.decodeRequired<InlineWebhooksReviewCommentLinksPullRequestXae0116c2>(rawObject, "pull_request")
      val self = json.decodeRequired<InlineWebhooksReviewCommentLinksSelfXf07380e1>(rawObject, "self")
      return InlineWebhooksReviewCommentLinksX1b9c5a1c(
        html = html,
        pullRequest = pullRequest,
        self = self,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksReviewCommentLinksX1b9c5a1c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksReviewCommentLinksX1b9c5a1c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("html", json.encodeToJsonElement(value.html))
        put("pull_request", json.encodeToJsonElement(value.pullRequest))
        put("self", json.encodeToJsonElement(value.self))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhooksReviewCommentLinksX1b9c5a1c(block: InlineWebhooksReviewCommentLinksX1b9c5a1c.Builder.() -> Unit): InlineWebhooksReviewCommentLinksX1b9c5a1c = InlineWebhooksReviewCommentLinksX1b9c5a1c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhooksReviewCommentLinksX1b9c5a1c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
