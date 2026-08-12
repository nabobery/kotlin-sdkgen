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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/_
 * links/properties/self.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/_
 * links/properties/self
 */
@Serializable(with = InlineWebhookPullRequestUnassignedPullRequestLinksSelfXe79473cc.Serializer::class)
public class InlineWebhookPullRequestUnassignedPullRequestLinksSelfXe79473cc(
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

    public fun build(): InlineWebhookPullRequestUnassignedPullRequestLinksSelfXe79473cc {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestUnassignedPullRequestLinksSelfXe79473cc(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestUnassignedPullRequestLinksSelfXe79473cc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnassignedPullRequestLinksSelfXe79473cc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnassignedPullRequestLinksSelfXe79473cc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestUnassignedPullRequestLinksSelfXe79473cc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestUnassignedPullRequestLinksSelfXe79473cc must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestUnassignedPullRequestLinksSelfXe79473cc(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnassignedPullRequestLinksSelfXe79473cc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestUnassignedPullRequestLinksSelfXe79473cc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestUnassignedPullRequestLinksSelfXe79473cc(block: InlineWebhookPullRequestUnassignedPullRequestLinksSelfXe79473cc.Builder.() -> Unit): InlineWebhookPullRequestUnassignedPullRequestLinksSelfXe79473cc = InlineWebhookPullRequestUnassignedPullRequestLinksSelfXe79473cc.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestUnassignedPullRequestLinksSelfXe79473cc is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
