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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/changes/properties/old_issue/proper
 * ties/pull_request.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/changes/properties/old_issue/proper
 * ties/pull_request
 */
@Serializable(with = InlineWebhookIssuesOpenedChangesOldIssuePullRequestXa31474d6.Serializer::class)
public class InlineWebhookIssuesOpenedChangesOldIssuePullRequestXa31474d6(
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

    public fun build(): InlineWebhookIssuesOpenedChangesOldIssuePullRequestXa31474d6 = InlineWebhookIssuesOpenedChangesOldIssuePullRequestXa31474d6(
      diffUrl = diffUrl,
      htmlUrl = htmlUrl,
      mergedAt = mergedAt,
      patchUrl = patchUrl,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesOpenedChangesOldIssuePullRequestXa31474d6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookIssuesOpenedChangesOldIssuePullRequestXa31474d6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesOpenedChangesOldIssuePullRequestXa31474d6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesOpenedChangesOldIssuePullRequestXa31474d6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesOpenedChangesOldIssuePullRequestXa31474d6 must be a JSON object")
      return InlineWebhookIssuesOpenedChangesOldIssuePullRequestXa31474d6(
        diffUrl = rawObject["diff_url"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        mergedAt = rawObject["merged_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        patchUrl = rawObject["patch_url"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesOpenedChangesOldIssuePullRequestXa31474d6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesOpenedChangesOldIssuePullRequestXa31474d6")
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

public fun inlineWebhookIssuesOpenedChangesOldIssuePullRequestXa31474d6(block: InlineWebhookIssuesOpenedChangesOldIssuePullRequestXa31474d6.Builder.() -> Unit): InlineWebhookIssuesOpenedChangesOldIssuePullRequestXa31474d6 = InlineWebhookIssuesOpenedChangesOldIssuePullRequestXa31474d6.build(block)
