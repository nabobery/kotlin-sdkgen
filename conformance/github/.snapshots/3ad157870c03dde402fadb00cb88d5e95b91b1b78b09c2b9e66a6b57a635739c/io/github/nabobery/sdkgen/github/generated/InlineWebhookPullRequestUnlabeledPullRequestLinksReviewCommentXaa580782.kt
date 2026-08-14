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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/pull_request/properties/_l
 * inks/properties/review_comment.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/pull_request/properties/_l
 * inks/properties/review_comment
 */
@Serializable(with = InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentXaa580782.Serializer::class)
public class InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentXaa580782(
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

    public fun build(): InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentXaa580782 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentXaa580782(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentXaa580782 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentXaa580782> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentXaa580782 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentXaa580782")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentXaa580782 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentXaa580782(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentXaa580782) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentXaa580782")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentXaa580782(block: InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentXaa580782.Builder.() -> Unit): InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentXaa580782 = InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentXaa580782.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestUnlabeledPullRequestLinksReviewCommentXaa580782 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
