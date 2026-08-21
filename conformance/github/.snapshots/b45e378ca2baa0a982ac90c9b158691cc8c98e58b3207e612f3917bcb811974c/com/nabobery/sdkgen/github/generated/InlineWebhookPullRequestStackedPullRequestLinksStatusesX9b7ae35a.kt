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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/_lin
 * ks/properties/statuses.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/_lin
 * ks/properties/statuses
 */
@Serializable(with = InlineWebhookPullRequestStackedPullRequestLinksStatusesX9b7ae35a.Serializer::class)
public class InlineWebhookPullRequestStackedPullRequestLinksStatusesX9b7ae35a(
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

    public fun build(): InlineWebhookPullRequestStackedPullRequestLinksStatusesX9b7ae35a {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestStackedPullRequestLinksStatusesX9b7ae35a(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestStackedPullRequestLinksStatusesX9b7ae35a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestStackedPullRequestLinksStatusesX9b7ae35a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestStackedPullRequestLinksStatusesX9b7ae35a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestStackedPullRequestLinksStatusesX9b7ae35a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestStackedPullRequestLinksStatusesX9b7ae35a must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestStackedPullRequestLinksStatusesX9b7ae35a(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestStackedPullRequestLinksStatusesX9b7ae35a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestStackedPullRequestLinksStatusesX9b7ae35a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestStackedPullRequestLinksStatusesX9b7ae35a(block: InlineWebhookPullRequestStackedPullRequestLinksStatusesX9b7ae35a.Builder.() -> Unit): InlineWebhookPullRequestStackedPullRequestLinksStatusesX9b7ae35a = InlineWebhookPullRequestStackedPullRequestLinksStatusesX9b7ae35a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestStackedPullRequestLinksStatusesX9b7ae35a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
