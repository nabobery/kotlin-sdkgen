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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/_li
 * nks/properties/review_comment.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/_li
 * nks/properties/review_comment
 */
@Serializable(with = InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentX8f2746cd.Serializer::class)
public class InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentX8f2746cd(
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

    public fun build(): InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentX8f2746cd {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentX8f2746cd(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentX8f2746cd = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentX8f2746cd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentX8f2746cd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentX8f2746cd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentX8f2746cd must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentX8f2746cd(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentX8f2746cd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentX8f2746cd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestAssignedPullRequestLinksReviewCommentX8f2746cd(block: InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentX8f2746cd.Builder.() -> Unit): InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentX8f2746cd = InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentX8f2746cd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentX8f2746cd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
