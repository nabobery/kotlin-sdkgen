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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlocked/properties/pull_request/properties/_li
 * nks/properties/statuses.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlocked/properties/pull_request/properties/_li
 * nks/properties/statuses
 */
@Serializable(with = InlineWebhookPullRequestUnlockedPullRequestLinksStatusesXbdecac0b.Serializer::class)
public class InlineWebhookPullRequestUnlockedPullRequestLinksStatusesXbdecac0b(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestUnlockedPullRequestLinksStatusesXbdecac0b {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestUnlockedPullRequestLinksStatusesXbdecac0b(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestUnlockedPullRequestLinksStatusesXbdecac0b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestUnlockedPullRequestLinksStatusesXbdecac0b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlockedPullRequestLinksStatusesXbdecac0b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestUnlockedPullRequestLinksStatusesXbdecac0b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestUnlockedPullRequestLinksStatusesXbdecac0b must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestUnlockedPullRequestLinksStatusesXbdecac0b(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlockedPullRequestLinksStatusesXbdecac0b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestUnlockedPullRequestLinksStatusesXbdecac0b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestUnlockedPullRequestLinksStatusesXbdecac0b(block: InlineWebhookPullRequestUnlockedPullRequestLinksStatusesXbdecac0b.Builder.() -> Unit): InlineWebhookPullRequestUnlockedPullRequestLinksStatusesXbdecac0b = InlineWebhookPullRequestUnlockedPullRequestLinksStatusesXbdecac0b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestUnlockedPullRequestLinksStatusesXbdecac0b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
