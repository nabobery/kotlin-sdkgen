package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/_links/properties/statuses.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/_links/properties/statuses
 */
@Serializable(with = InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksStatusesXa886aa75.Serializer::class)
public class InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksStatusesXa886aa75(
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

    public fun build(): InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksStatusesXa886aa75 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksStatusesXa886aa75(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksStatusesXa886aa75 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksStatusesXa886aa75> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksStatusesXa886aa75 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksStatusesXa886aa75")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksStatusesXa886aa75 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksStatusesXa886aa75(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksStatusesXa886aa75) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksStatusesXa886aa75")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestAutoMergeDisabledPullRequestLinksStatusesXa886aa75(block: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksStatusesXa886aa75.Builder.() -> Unit): InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksStatusesXa886aa75 = InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksStatusesXa886aa75.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksStatusesXa886aa75 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
