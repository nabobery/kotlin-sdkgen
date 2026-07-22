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
 * links/properties/comments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/_
 * links/properties/comments
 */
@Serializable(with = InlineWebhookPullRequestUnassignedPullRequestLinksCommentsX82393cce.Serializer::class)
public class InlineWebhookPullRequestUnassignedPullRequestLinksCommentsX82393cce(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestUnassignedPullRequestLinksCommentsX82393cce {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestUnassignedPullRequestLinksCommentsX82393cce(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestUnassignedPullRequestLinksCommentsX82393cce = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestUnassignedPullRequestLinksCommentsX82393cce> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnassignedPullRequestLinksCommentsX82393cce {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestUnassignedPullRequestLinksCommentsX82393cce")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestUnassignedPullRequestLinksCommentsX82393cce must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestUnassignedPullRequestLinksCommentsX82393cce(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnassignedPullRequestLinksCommentsX82393cce) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestUnassignedPullRequestLinksCommentsX82393cce")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestUnassignedPullRequestLinksCommentsX82393cce(block: InlineWebhookPullRequestUnassignedPullRequestLinksCommentsX82393cce.Builder.() -> Unit): InlineWebhookPullRequestUnassignedPullRequestLinksCommentsX82393cce = InlineWebhookPullRequestUnassignedPullRequestLinksCommentsX82393cce.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestUnassignedPullRequestLinksCommentsX82393cce is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
