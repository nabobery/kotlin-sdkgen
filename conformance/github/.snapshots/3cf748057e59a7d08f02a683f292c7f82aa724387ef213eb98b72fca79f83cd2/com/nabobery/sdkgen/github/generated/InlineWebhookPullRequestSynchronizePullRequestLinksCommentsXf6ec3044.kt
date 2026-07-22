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
 * _links/properties/comments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * _links/properties/comments
 */
@Serializable(with = InlineWebhookPullRequestSynchronizePullRequestLinksCommentsXf6ec3044.Serializer::class)
public class InlineWebhookPullRequestSynchronizePullRequestLinksCommentsXf6ec3044(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestSynchronizePullRequestLinksCommentsXf6ec3044 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestSynchronizePullRequestLinksCommentsXf6ec3044(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestSynchronizePullRequestLinksCommentsXf6ec3044 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestSynchronizePullRequestLinksCommentsXf6ec3044> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestSynchronizePullRequestLinksCommentsXf6ec3044 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestSynchronizePullRequestLinksCommentsXf6ec3044")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestSynchronizePullRequestLinksCommentsXf6ec3044 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestSynchronizePullRequestLinksCommentsXf6ec3044(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestSynchronizePullRequestLinksCommentsXf6ec3044) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestSynchronizePullRequestLinksCommentsXf6ec3044")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestSynchronizePullRequestLinksCommentsXf6ec3044(block: InlineWebhookPullRequestSynchronizePullRequestLinksCommentsXf6ec3044.Builder.() -> Unit): InlineWebhookPullRequestSynchronizePullRequestLinksCommentsXf6ec3044 = InlineWebhookPullRequestSynchronizePullRequestLinksCommentsXf6ec3044.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestSynchronizePullRequestLinksCommentsXf6ec3044 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
