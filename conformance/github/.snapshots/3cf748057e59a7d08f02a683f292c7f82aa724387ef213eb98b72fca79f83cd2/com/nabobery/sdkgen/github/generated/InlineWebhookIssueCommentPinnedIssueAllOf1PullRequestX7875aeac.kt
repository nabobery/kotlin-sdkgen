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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-pinned/properties/issue/allOf/0/properties/pul
 * l_request.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-pinned/properties/issue/allOf/0/properties/pul
 * l_request
 */
@Serializable(with = InlineWebhookIssueCommentPinnedIssueAllOf1PullRequestX7875aeac.Serializer::class)
public class InlineWebhookIssueCommentPinnedIssueAllOf1PullRequestX7875aeac(
  public val diffUrl: String? = null,
  public val htmlUrl: String? = null,
  public val mergedAt: String? = null,
  public val patchUrl: String? = null,
  public val url: String? = null,
) {
  public class Builder {
    public var diffUrl: String? = null

    public var htmlUrl: String? = null

    public var mergedAt: String? = null

    public var patchUrl: String? = null

    public var url: String? = null

    public fun build(): InlineWebhookIssueCommentPinnedIssueAllOf1PullRequestX7875aeac = InlineWebhookIssueCommentPinnedIssueAllOf1PullRequestX7875aeac(
      diffUrl = diffUrl,
      htmlUrl = htmlUrl,
      mergedAt = mergedAt,
      patchUrl = patchUrl,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssueCommentPinnedIssueAllOf1PullRequestX7875aeac = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookIssueCommentPinnedIssueAllOf1PullRequestX7875aeac> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentPinnedIssueAllOf1PullRequestX7875aeac {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssueCommentPinnedIssueAllOf1PullRequestX7875aeac")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssueCommentPinnedIssueAllOf1PullRequestX7875aeac must be a JSON object")
      return InlineWebhookIssueCommentPinnedIssueAllOf1PullRequestX7875aeac(
        diffUrl = rawObject["diff_url"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        mergedAt = rawObject["merged_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        patchUrl = rawObject["patch_url"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentPinnedIssueAllOf1PullRequestX7875aeac) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssueCommentPinnedIssueAllOf1PullRequestX7875aeac")
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

public fun inlineWebhookIssueCommentPinnedIssueAllOf1PullRequestX7875aeac(block: InlineWebhookIssueCommentPinnedIssueAllOf1PullRequestX7875aeac.Builder.() -> Unit): InlineWebhookIssueCommentPinnedIssueAllOf1PullRequestX7875aeac = InlineWebhookIssueCommentPinnedIssueAllOf1PullRequestX7875aeac.build(block)
