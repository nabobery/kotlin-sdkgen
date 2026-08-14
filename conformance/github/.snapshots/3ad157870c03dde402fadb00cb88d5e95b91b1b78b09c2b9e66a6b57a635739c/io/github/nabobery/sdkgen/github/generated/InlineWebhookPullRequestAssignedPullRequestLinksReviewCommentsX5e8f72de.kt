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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/_li
 * nks/properties/review_comments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/_li
 * nks/properties/review_comments
 */
@Serializable(with = InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentsX5e8f72de.Serializer::class)
public class InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentsX5e8f72de(
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

    public fun build(): InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentsX5e8f72de {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentsX5e8f72de(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentsX5e8f72de = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentsX5e8f72de> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentsX5e8f72de {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentsX5e8f72de")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentsX5e8f72de must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentsX5e8f72de(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentsX5e8f72de) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentsX5e8f72de")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestAssignedPullRequestLinksReviewCommentsX5e8f72de(block: InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentsX5e8f72de.Builder.() -> Unit): InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentsX5e8f72de = InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentsX5e8f72de.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestAssignedPullRequestLinksReviewCommentsX5e8f72de is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
