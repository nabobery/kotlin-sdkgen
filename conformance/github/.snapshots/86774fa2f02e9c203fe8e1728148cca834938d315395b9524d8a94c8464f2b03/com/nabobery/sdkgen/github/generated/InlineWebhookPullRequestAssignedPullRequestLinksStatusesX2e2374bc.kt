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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/_li
 * nks/properties/statuses.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/_li
 * nks/properties/statuses
 */
@Serializable(with = InlineWebhookPullRequestAssignedPullRequestLinksStatusesX2e2374bc.Serializer::class)
public class InlineWebhookPullRequestAssignedPullRequestLinksStatusesX2e2374bc(
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

    public fun build(): InlineWebhookPullRequestAssignedPullRequestLinksStatusesX2e2374bc {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestAssignedPullRequestLinksStatusesX2e2374bc(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestAssignedPullRequestLinksStatusesX2e2374bc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAssignedPullRequestLinksStatusesX2e2374bc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAssignedPullRequestLinksStatusesX2e2374bc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestAssignedPullRequestLinksStatusesX2e2374bc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestAssignedPullRequestLinksStatusesX2e2374bc must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestAssignedPullRequestLinksStatusesX2e2374bc(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAssignedPullRequestLinksStatusesX2e2374bc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestAssignedPullRequestLinksStatusesX2e2374bc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestAssignedPullRequestLinksStatusesX2e2374bc(block: InlineWebhookPullRequestAssignedPullRequestLinksStatusesX2e2374bc.Builder.() -> Unit): InlineWebhookPullRequestAssignedPullRequestLinksStatusesX2e2374bc = InlineWebhookPullRequestAssignedPullRequestLinksStatusesX2e2374bc.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestAssignedPullRequestLinksStatusesX2e2374bc is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
