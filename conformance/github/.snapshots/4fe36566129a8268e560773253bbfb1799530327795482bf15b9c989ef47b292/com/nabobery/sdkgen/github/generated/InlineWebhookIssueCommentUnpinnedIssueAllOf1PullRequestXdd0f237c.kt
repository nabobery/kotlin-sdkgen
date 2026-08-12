package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/issue/allOf/0/properties/p
 * ull_request.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/issue/allOf/0/properties/p
 * ull_request
 */
@Serializable(with = InlineWebhookIssueCommentUnpinnedIssueAllOf1PullRequestXdd0f237c.Serializer::class)
public class InlineWebhookIssueCommentUnpinnedIssueAllOf1PullRequestXdd0f237c(
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

    public fun build(): InlineWebhookIssueCommentUnpinnedIssueAllOf1PullRequestXdd0f237c = InlineWebhookIssueCommentUnpinnedIssueAllOf1PullRequestXdd0f237c(
      diffUrl = diffUrl,
      htmlUrl = htmlUrl,
      mergedAt = mergedAt,
      patchUrl = patchUrl,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssueCommentUnpinnedIssueAllOf1PullRequestXdd0f237c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentUnpinnedIssueAllOf1PullRequestXdd0f237c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentUnpinnedIssueAllOf1PullRequestXdd0f237c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssueCommentUnpinnedIssueAllOf1PullRequestXdd0f237c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssueCommentUnpinnedIssueAllOf1PullRequestXdd0f237c must be a JSON object")
      return InlineWebhookIssueCommentUnpinnedIssueAllOf1PullRequestXdd0f237c(
        diffUrl = rawObject["diff_url"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        mergedAt = rawObject["merged_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        patchUrl = rawObject["patch_url"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentUnpinnedIssueAllOf1PullRequestXdd0f237c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssueCommentUnpinnedIssueAllOf1PullRequestXdd0f237c")
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

public fun inlineWebhookIssueCommentUnpinnedIssueAllOf1PullRequestXdd0f237c(block: InlineWebhookIssueCommentUnpinnedIssueAllOf1PullRequestXdd0f237c.Builder.() -> Unit): InlineWebhookIssueCommentUnpinnedIssueAllOf1PullRequestXdd0f237c = InlineWebhookIssueCommentUnpinnedIssueAllOf1PullRequestXdd0f237c.build(block)
