package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/_li
 * nks/properties/statuses.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/_li
 * nks/properties/statuses
 */
@Serializable(with = InlineWebhookPullRequestEnqueuedPullRequestLinksStatusesX5a601a4b.Serializer::class)
public class InlineWebhookPullRequestEnqueuedPullRequestLinksStatusesX5a601a4b(
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

    public fun build(): InlineWebhookPullRequestEnqueuedPullRequestLinksStatusesX5a601a4b {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestEnqueuedPullRequestLinksStatusesX5a601a4b(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestEnqueuedPullRequestLinksStatusesX5a601a4b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestEnqueuedPullRequestLinksStatusesX5a601a4b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEnqueuedPullRequestLinksStatusesX5a601a4b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestEnqueuedPullRequestLinksStatusesX5a601a4b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestEnqueuedPullRequestLinksStatusesX5a601a4b must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestEnqueuedPullRequestLinksStatusesX5a601a4b(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEnqueuedPullRequestLinksStatusesX5a601a4b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestEnqueuedPullRequestLinksStatusesX5a601a4b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestEnqueuedPullRequestLinksStatusesX5a601a4b(block: InlineWebhookPullRequestEnqueuedPullRequestLinksStatusesX5a601a4b.Builder.() -> Unit): InlineWebhookPullRequestEnqueuedPullRequestLinksStatusesX5a601a4b = InlineWebhookPullRequestEnqueuedPullRequestLinksStatusesX5a601a4b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestEnqueuedPullRequestLinksStatusesX5a601a4b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
