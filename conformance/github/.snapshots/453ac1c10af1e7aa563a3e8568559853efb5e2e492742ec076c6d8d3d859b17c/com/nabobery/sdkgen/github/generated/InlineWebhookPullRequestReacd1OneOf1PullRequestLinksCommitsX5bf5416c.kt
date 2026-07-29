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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/0/properties/pull_
 * request/properties/_links/properties/commits.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/0/properties/pull_
 * request/properties/_links/properties/commits
 */
@Serializable(with = InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommitsX5bf5416c.Serializer::class)
public class InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommitsX5bf5416c(
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

    public fun build(): InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommitsX5bf5416c {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommitsX5bf5416c(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommitsX5bf5416c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommitsX5bf5416c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommitsX5bf5416c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommitsX5bf5416c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommitsX5bf5416c must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommitsX5bf5416c(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommitsX5bf5416c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommitsX5bf5416c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommitsX5bf5416c(block: InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommitsX5bf5416c.Builder.() -> Unit): InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommitsX5bf5416c = InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommitsX5bf5416c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReacd1OneOf1PullRequestLinksCommitsX5bf5416c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
