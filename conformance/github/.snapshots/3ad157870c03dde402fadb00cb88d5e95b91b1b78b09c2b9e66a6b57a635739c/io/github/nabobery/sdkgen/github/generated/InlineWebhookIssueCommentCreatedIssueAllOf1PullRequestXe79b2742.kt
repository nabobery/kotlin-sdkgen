package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-created/properties/issue/allOf/0/properties/pu
 * ll_request.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-created/properties/issue/allOf/0/properties/pu
 * ll_request
 */
@Serializable(with = InlineWebhookIssueCommentCreatedIssueAllOf1PullRequestXe79b2742.Serializer::class)
public class InlineWebhookIssueCommentCreatedIssueAllOf1PullRequestXe79b2742(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val diffUrl: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String? = null,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val mergedAt: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val patchUrl: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String? = null,
) {
  public class Builder {
    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var diffUrl: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var htmlUrl: String? = null

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var mergedAt: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var patchUrl: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var url: String? = null

    public fun build(): InlineWebhookIssueCommentCreatedIssueAllOf1PullRequestXe79b2742 = InlineWebhookIssueCommentCreatedIssueAllOf1PullRequestXe79b2742(
      diffUrl = diffUrl,
      htmlUrl = htmlUrl,
      mergedAt = mergedAt,
      patchUrl = patchUrl,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssueCommentCreatedIssueAllOf1PullRequestXe79b2742 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentCreatedIssueAllOf1PullRequestXe79b2742> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentCreatedIssueAllOf1PullRequestXe79b2742 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssueCommentCreatedIssueAllOf1PullRequestXe79b2742")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssueCommentCreatedIssueAllOf1PullRequestXe79b2742 must be a JSON object")
      return InlineWebhookIssueCommentCreatedIssueAllOf1PullRequestXe79b2742(
        diffUrl = rawObject["diff_url"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        mergedAt = rawObject["merged_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        patchUrl = rawObject["patch_url"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentCreatedIssueAllOf1PullRequestXe79b2742) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssueCommentCreatedIssueAllOf1PullRequestXe79b2742")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.diffUrl?.let { put("diff_url", it) }
        value.htmlUrl?.let { put("html_url", it) }
        value.mergedAt?.let { put("merged_at", it) }
        value.patchUrl?.let { put("patch_url", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookIssueCommentCreatedIssueAllOf1PullRequestXe79b2742(block: InlineWebhookIssueCommentCreatedIssueAllOf1PullRequestXe79b2742.Builder.() -> Unit): InlineWebhookIssueCommentCreatedIssueAllOf1PullRequestXe79b2742 = InlineWebhookIssueCommentCreatedIssueAllOf1PullRequestXe79b2742.build(block)
