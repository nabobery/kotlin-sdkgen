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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/thread/prop
 * erties/comments/items/properties/_links/properties/self.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/thread/prop
 * erties/comments/items/properties/_links/properties/self
 */
@Serializable(with = InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksSelfXdeab654a.Serializer::class)
public class InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksSelfXdeab654a(
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

    public fun build(): InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksSelfXdeab654a {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksSelfXdeab654a(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksSelfXdeab654a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksSelfXdeab654a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksSelfXdeab654a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksSelfXdeab654a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksSelfXdeab654a must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksSelfXdeab654a(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksSelfXdeab654a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksSelfXdeab654a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestRe5e87ThreadCommentsItemLinksSelfXdeab654a(block: InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksSelfXdeab654a.Builder.() -> Unit): InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksSelfXdeab654a = InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksSelfXdeab654a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestRe5e87ThreadCommentsItemLinksSelfXdeab654a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
