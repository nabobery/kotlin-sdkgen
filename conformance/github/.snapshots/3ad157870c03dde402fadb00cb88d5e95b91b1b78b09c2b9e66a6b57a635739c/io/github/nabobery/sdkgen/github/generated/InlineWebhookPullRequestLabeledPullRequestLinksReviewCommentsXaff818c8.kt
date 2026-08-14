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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/_lin
 * ks/properties/review_comments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/_lin
 * ks/properties/review_comments
 */
@Serializable(with = InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentsXaff818c8.Serializer::class)
public class InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentsXaff818c8(
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

    public fun build(): InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentsXaff818c8 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentsXaff818c8(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentsXaff818c8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentsXaff818c8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentsXaff818c8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentsXaff818c8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentsXaff818c8 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentsXaff818c8(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentsXaff818c8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentsXaff818c8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestLabeledPullRequestLinksReviewCommentsXaff818c8(block: InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentsXaff818c8.Builder.() -> Unit): InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentsXaff818c8 = InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentsXaff818c8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestLabeledPullRequestLinksReviewCommentsXaff818c8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
