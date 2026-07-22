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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted/properties/pull_request/
 * properties/_links/properties/commits.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-deleted/properties/pull_request/
 * properties/_links/properties/commits
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommitsX97512b27.Serializer::class)
public class InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommitsX97512b27(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommitsX97512b27 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommitsX97512b27(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommitsX97512b27 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommitsX97512b27> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommitsX97512b27 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommitsX97512b27")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommitsX97512b27 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommitsX97512b27(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommitsX97512b27) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommitsX97512b27")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommitsX97512b27(block: InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommitsX97512b27.Builder.() -> Unit): InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommitsX97512b27 = InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommitsX97512b27.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewCommentDeletedPullRequestLinksCommitsX97512b27 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
