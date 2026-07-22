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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-reopened/properties/issue/properties/pull_request.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-reopened/properties/issue/properties/pull_request
 */
@Serializable(with = InlineWebhookIssuesReopenedIssuePullRequestX795a2267.Serializer::class)
public class InlineWebhookIssuesReopenedIssuePullRequestX795a2267(
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

    public fun build(): InlineWebhookIssuesReopenedIssuePullRequestX795a2267 = InlineWebhookIssuesReopenedIssuePullRequestX795a2267(
      diffUrl = diffUrl,
      htmlUrl = htmlUrl,
      mergedAt = mergedAt,
      patchUrl = patchUrl,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesReopenedIssuePullRequestX795a2267 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookIssuesReopenedIssuePullRequestX795a2267> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesReopenedIssuePullRequestX795a2267 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesReopenedIssuePullRequestX795a2267")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesReopenedIssuePullRequestX795a2267 must be a JSON object")
      return InlineWebhookIssuesReopenedIssuePullRequestX795a2267(
        diffUrl = rawObject["diff_url"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        mergedAt = rawObject["merged_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        patchUrl = rawObject["patch_url"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesReopenedIssuePullRequestX795a2267) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesReopenedIssuePullRequestX795a2267")
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

public fun inlineWebhookIssuesReopenedIssuePullRequestX795a2267(block: InlineWebhookIssuesReopenedIssuePullRequestX795a2267.Builder.() -> Unit): InlineWebhookIssuesReopenedIssuePullRequestX795a2267 = InlineWebhookIssuesReopenedIssuePullRequestX795a2267.build(block)
