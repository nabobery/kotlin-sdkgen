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
 * perties/_links/properties/self.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/_links/properties/self
 */
@Serializable(with = InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksSelfXcab1c0ca.Serializer::class)
public class InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksSelfXcab1c0ca(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksSelfXcab1c0ca {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksSelfXcab1c0ca(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksSelfXcab1c0ca = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksSelfXcab1c0ca> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksSelfXcab1c0ca {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksSelfXcab1c0ca")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksSelfXcab1c0ca must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksSelfXcab1c0ca(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksSelfXcab1c0ca) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksSelfXcab1c0ca")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestAutoMergeDisabledPullRequestLinksSelfXcab1c0ca(block: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksSelfXcab1c0ca.Builder.() -> Unit): InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksSelfXcab1c0ca = InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksSelfXcab1c0ca.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksSelfXcab1c0ca is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
