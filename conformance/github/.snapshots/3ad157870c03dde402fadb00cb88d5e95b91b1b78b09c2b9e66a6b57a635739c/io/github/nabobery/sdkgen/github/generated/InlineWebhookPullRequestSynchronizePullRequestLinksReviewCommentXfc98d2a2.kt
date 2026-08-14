package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * _links/properties/review_comment.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * _links/properties/review_comment
 */
@Serializable(with = InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentXfc98d2a2.Serializer::class)
public class InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentXfc98d2a2(
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

    public fun build(): InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentXfc98d2a2 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentXfc98d2a2(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentXfc98d2a2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentXfc98d2a2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentXfc98d2a2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentXfc98d2a2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentXfc98d2a2 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentXfc98d2a2(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentXfc98d2a2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentXfc98d2a2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentXfc98d2a2(block: InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentXfc98d2a2.Builder.() -> Unit): InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentXfc98d2a2 = InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentXfc98d2a2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestSynchronizePullRequestLinksReviewCommentXfc98d2a2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
