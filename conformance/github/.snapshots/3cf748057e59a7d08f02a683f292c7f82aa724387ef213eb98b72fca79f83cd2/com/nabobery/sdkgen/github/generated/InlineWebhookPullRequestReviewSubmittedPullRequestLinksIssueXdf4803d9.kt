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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/_links/properties/issue.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/_links/properties/issue
 */
@Serializable(with = InlineWebhookPullRequestReviewSubmittedPullRequestLinksIssueXdf4803d9.Serializer::class)
public class InlineWebhookPullRequestReviewSubmittedPullRequestLinksIssueXdf4803d9(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewSubmittedPullRequestLinksIssueXdf4803d9 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewSubmittedPullRequestLinksIssueXdf4803d9(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewSubmittedPullRequestLinksIssueXdf4803d9 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewSubmittedPullRequestLinksIssueXdf4803d9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewSubmittedPullRequestLinksIssueXdf4803d9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewSubmittedPullRequestLinksIssueXdf4803d9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewSubmittedPullRequestLinksIssueXdf4803d9 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewSubmittedPullRequestLinksIssueXdf4803d9(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewSubmittedPullRequestLinksIssueXdf4803d9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewSubmittedPullRequestLinksIssueXdf4803d9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewSubmittedPullRequestLinksIssueXdf4803d9(block: InlineWebhookPullRequestReviewSubmittedPullRequestLinksIssueXdf4803d9.Builder.() -> Unit): InlineWebhookPullRequestReviewSubmittedPullRequestLinksIssueXdf4803d9 = InlineWebhookPullRequestReviewSubmittedPullRequestLinksIssueXdf4803d9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewSubmittedPullRequestLinksIssueXdf4803d9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
