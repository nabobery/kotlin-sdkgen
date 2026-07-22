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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/_link
 * s/properties/self.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/_link
 * s/properties/self
 */
@Serializable(with = InlineWebhookPullRequestLockedPullRequestLinksSelfX3414575d.Serializer::class)
public class InlineWebhookPullRequestLockedPullRequestLinksSelfX3414575d(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestLockedPullRequestLinksSelfX3414575d {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestLockedPullRequestLinksSelfX3414575d(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestLockedPullRequestLinksSelfX3414575d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestLockedPullRequestLinksSelfX3414575d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLockedPullRequestLinksSelfX3414575d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestLockedPullRequestLinksSelfX3414575d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestLockedPullRequestLinksSelfX3414575d must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestLockedPullRequestLinksSelfX3414575d(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLockedPullRequestLinksSelfX3414575d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestLockedPullRequestLinksSelfX3414575d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestLockedPullRequestLinksSelfX3414575d(block: InlineWebhookPullRequestLockedPullRequestLinksSelfX3414575d.Builder.() -> Unit): InlineWebhookPullRequestLockedPullRequestLinksSelfX3414575d = InlineWebhookPullRequestLockedPullRequestLinksSelfX3414575d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestLockedPullRequestLinksSelfX3414575d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
