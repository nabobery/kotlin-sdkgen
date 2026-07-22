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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * _links/properties/statuses.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * _links/properties/statuses
 */
@Serializable(with = InlineWebhookPullRequestSynchronizePullRequestLinksStatusesX933d789a.Serializer::class)
public class InlineWebhookPullRequestSynchronizePullRequestLinksStatusesX933d789a(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestSynchronizePullRequestLinksStatusesX933d789a {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestSynchronizePullRequestLinksStatusesX933d789a(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestSynchronizePullRequestLinksStatusesX933d789a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestSynchronizePullRequestLinksStatusesX933d789a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestSynchronizePullRequestLinksStatusesX933d789a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestSynchronizePullRequestLinksStatusesX933d789a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestSynchronizePullRequestLinksStatusesX933d789a must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestSynchronizePullRequestLinksStatusesX933d789a(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestSynchronizePullRequestLinksStatusesX933d789a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestSynchronizePullRequestLinksStatusesX933d789a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestSynchronizePullRequestLinksStatusesX933d789a(block: InlineWebhookPullRequestSynchronizePullRequestLinksStatusesX933d789a.Builder.() -> Unit): InlineWebhookPullRequestSynchronizePullRequestLinksStatusesX933d789a = InlineWebhookPullRequestSynchronizePullRequestLinksStatusesX933d789a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestSynchronizePullRequestLinksStatusesX933d789a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
