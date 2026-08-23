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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/review/properties/_
 * links.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/review/properties/_
 * links
 */
@Serializable(with = InlineWebhookPullRequestReviewDismissedReviewLinksX540fe07f.Serializer::class)
public class InlineWebhookPullRequestReviewDismissedReviewLinksX540fe07f(
  public val html: InlineWebhookPullRequestReviewDismissedReviewLinksHtmlX7b456b87,
  public val pullRequest: InlineWebhookPullRequestReviewDismissedReviewLinksPullRequestX5927c18d,
) {
  public class Builder {
    private var htmlValue: InlineWebhookPullRequestReviewDismissedReviewLinksHtmlX7b456b87? = null

    public var html: InlineWebhookPullRequestReviewDismissedReviewLinksHtmlX7b456b87
      get() = requireNotNull(htmlValue) { "html is required" }
      set(`value`) {
        htmlValue = value
      }

    private var pullRequestValue:
        InlineWebhookPullRequestReviewDismissedReviewLinksPullRequestX5927c18d? = null

    public var pullRequest: InlineWebhookPullRequestReviewDismissedReviewLinksPullRequestX5927c18d
      get() = requireNotNull(pullRequestValue) { "pullRequest is required" }
      set(`value`) {
        pullRequestValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewDismissedReviewLinksX540fe07f {
      check(htmlValue != null) { "html is required" }
      check(pullRequestValue != null) { "pullRequest is required" }
      return InlineWebhookPullRequestReviewDismissedReviewLinksX540fe07f(
        html = html,
        pullRequest = pullRequest,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewDismissedReviewLinksX540fe07f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewDismissedReviewLinksX540fe07f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewDismissedReviewLinksX540fe07f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewDismissedReviewLinksX540fe07f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewDismissedReviewLinksX540fe07f must be a JSON object")
      val html = json.decodeRequired<InlineWebhookPullRequestReviewDismissedReviewLinksHtmlX7b456b87>(rawObject, "html")
      val pullRequest = json.decodeRequired<InlineWebhookPullRequestReviewDismissedReviewLinksPullRequestX5927c18d>(rawObject, "pull_request")
      return InlineWebhookPullRequestReviewDismissedReviewLinksX540fe07f(
        html = html,
        pullRequest = pullRequest,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewDismissedReviewLinksX540fe07f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewDismissedReviewLinksX540fe07f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("html", json.encodeToJsonElement(value.html))
        put("pull_request", json.encodeToJsonElement(value.pullRequest))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewDismissedReviewLinksX540fe07f(block: InlineWebhookPullRequestReviewDismissedReviewLinksX540fe07f.Builder.() -> Unit): InlineWebhookPullRequestReviewDismissedReviewLinksX540fe07f = InlineWebhookPullRequestReviewDismissedReviewLinksX540fe07f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewDismissedReviewLinksX540fe07f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
