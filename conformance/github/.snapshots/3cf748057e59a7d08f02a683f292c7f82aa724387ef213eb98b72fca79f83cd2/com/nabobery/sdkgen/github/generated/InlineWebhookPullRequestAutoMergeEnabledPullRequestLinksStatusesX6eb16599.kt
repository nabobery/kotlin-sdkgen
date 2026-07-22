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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-enabled/properties/pull_request/prop
 * erties/_links/properties/statuses.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-enabled/properties/pull_request/prop
 * erties/_links/properties/statuses
 */
@Serializable(with = InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksStatusesX6eb16599.Serializer::class)
public class InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksStatusesX6eb16599(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksStatusesX6eb16599 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksStatusesX6eb16599(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksStatusesX6eb16599 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksStatusesX6eb16599> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksStatusesX6eb16599 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksStatusesX6eb16599")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksStatusesX6eb16599 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksStatusesX6eb16599(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksStatusesX6eb16599) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksStatusesX6eb16599")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestAutoMergeEnabledPullRequestLinksStatusesX6eb16599(block: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksStatusesX6eb16599.Builder.() -> Unit): InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksStatusesX6eb16599 = InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksStatusesX6eb16599.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksStatusesX6eb16599 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
