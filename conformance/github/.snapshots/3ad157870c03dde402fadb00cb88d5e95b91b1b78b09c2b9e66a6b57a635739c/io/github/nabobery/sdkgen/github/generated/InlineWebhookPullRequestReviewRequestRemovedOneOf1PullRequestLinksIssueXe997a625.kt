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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/0/properties/pull_
 * request/properties/_links/properties/issue.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/0/properties/pull_
 * request/properties/_links/properties/issue
 */
@Serializable(with = InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksIssueXe997a625.Serializer::class)
public class InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksIssueXe997a625(
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

    public fun build(): InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksIssueXe997a625 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksIssueXe997a625(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksIssueXe997a625 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksIssueXe997a625> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksIssueXe997a625 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksIssueXe997a625")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksIssueXe997a625 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksIssueXe997a625(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksIssueXe997a625) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksIssueXe997a625")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksIssueXe997a625(block: InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksIssueXe997a625.Builder.() -> Unit): InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksIssueXe997a625 = InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksIssueXe997a625.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestLinksIssueXe997a625 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
