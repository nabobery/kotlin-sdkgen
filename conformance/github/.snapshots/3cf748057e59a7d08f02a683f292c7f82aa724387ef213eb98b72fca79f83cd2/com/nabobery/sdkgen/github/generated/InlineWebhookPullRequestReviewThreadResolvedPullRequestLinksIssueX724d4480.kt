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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/pull_request/
 * properties/_links/properties/issue.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/pull_request/
 * properties/_links/properties/issue
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksIssueX724d4480.Serializer::class)
public class InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksIssueX724d4480(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksIssueX724d4480 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksIssueX724d4480(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksIssueX724d4480 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksIssueX724d4480> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksIssueX724d4480 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksIssueX724d4480")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksIssueX724d4480 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksIssueX724d4480(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksIssueX724d4480) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksIssueX724d4480")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewThreadResolvedPullRequestLinksIssueX724d4480(block: InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksIssueX724d4480.Builder.() -> Unit): InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksIssueX724d4480 = InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksIssueX724d4480.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewThreadResolvedPullRequestLinksIssueX724d4480 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
