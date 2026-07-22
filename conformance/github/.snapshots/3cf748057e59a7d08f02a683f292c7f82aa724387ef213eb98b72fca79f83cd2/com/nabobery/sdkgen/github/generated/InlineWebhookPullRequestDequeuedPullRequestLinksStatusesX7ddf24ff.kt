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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/_li
 * nks/properties/statuses.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/_li
 * nks/properties/statuses
 */
@Serializable(with = InlineWebhookPullRequestDequeuedPullRequestLinksStatusesX7ddf24ff.Serializer::class)
public class InlineWebhookPullRequestDequeuedPullRequestLinksStatusesX7ddf24ff(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestDequeuedPullRequestLinksStatusesX7ddf24ff {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestDequeuedPullRequestLinksStatusesX7ddf24ff(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestDequeuedPullRequestLinksStatusesX7ddf24ff = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestDequeuedPullRequestLinksStatusesX7ddf24ff> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestDequeuedPullRequestLinksStatusesX7ddf24ff {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestDequeuedPullRequestLinksStatusesX7ddf24ff")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestDequeuedPullRequestLinksStatusesX7ddf24ff must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestDequeuedPullRequestLinksStatusesX7ddf24ff(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestDequeuedPullRequestLinksStatusesX7ddf24ff) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestDequeuedPullRequestLinksStatusesX7ddf24ff")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestDequeuedPullRequestLinksStatusesX7ddf24ff(block: InlineWebhookPullRequestDequeuedPullRequestLinksStatusesX7ddf24ff.Builder.() -> Unit): InlineWebhookPullRequestDequeuedPullRequestLinksStatusesX7ddf24ff = InlineWebhookPullRequestDequeuedPullRequestLinksStatusesX7ddf24ff.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestDequeuedPullRequestLinksStatusesX7ddf24ff is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
