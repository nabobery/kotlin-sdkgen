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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-unlocked/properties/issue/properties/pull_request.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-unlocked/properties/issue/properties/pull_request
 */
@Serializable(with = InlineWebhookIssuesUnlockedIssuePullRequestXa039c85b.Serializer::class)
public class InlineWebhookIssuesUnlockedIssuePullRequestXa039c85b(
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

    public fun build(): InlineWebhookIssuesUnlockedIssuePullRequestXa039c85b = InlineWebhookIssuesUnlockedIssuePullRequestXa039c85b(
      diffUrl = diffUrl,
      htmlUrl = htmlUrl,
      mergedAt = mergedAt,
      patchUrl = patchUrl,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesUnlockedIssuePullRequestXa039c85b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookIssuesUnlockedIssuePullRequestXa039c85b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesUnlockedIssuePullRequestXa039c85b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesUnlockedIssuePullRequestXa039c85b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesUnlockedIssuePullRequestXa039c85b must be a JSON object")
      return InlineWebhookIssuesUnlockedIssuePullRequestXa039c85b(
        diffUrl = rawObject["diff_url"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        mergedAt = rawObject["merged_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        patchUrl = rawObject["patch_url"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesUnlockedIssuePullRequestXa039c85b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesUnlockedIssuePullRequestXa039c85b")
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

public fun inlineWebhookIssuesUnlockedIssuePullRequestXa039c85b(block: InlineWebhookIssuesUnlockedIssuePullRequestXa039c85b.Builder.() -> Unit): InlineWebhookIssuesUnlockedIssuePullRequestXa039c85b = InlineWebhookIssuesUnlockedIssuePullRequestXa039c85b.build(block)
