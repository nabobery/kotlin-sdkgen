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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/_li
 * nks/properties/issue.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-enqueued/properties/pull_request/properties/_li
 * nks/properties/issue
 */
@Serializable(with = InlineWebhookPullRequestEnqueuedPullRequestLinksIssueXe8d31a08.Serializer::class)
public class InlineWebhookPullRequestEnqueuedPullRequestLinksIssueXe8d31a08(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestEnqueuedPullRequestLinksIssueXe8d31a08 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestEnqueuedPullRequestLinksIssueXe8d31a08(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestEnqueuedPullRequestLinksIssueXe8d31a08 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestEnqueuedPullRequestLinksIssueXe8d31a08> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEnqueuedPullRequestLinksIssueXe8d31a08 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestEnqueuedPullRequestLinksIssueXe8d31a08")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestEnqueuedPullRequestLinksIssueXe8d31a08 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestEnqueuedPullRequestLinksIssueXe8d31a08(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEnqueuedPullRequestLinksIssueXe8d31a08) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestEnqueuedPullRequestLinksIssueXe8d31a08")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestEnqueuedPullRequestLinksIssueXe8d31a08(block: InlineWebhookPullRequestEnqueuedPullRequestLinksIssueXe8d31a08.Builder.() -> Unit): InlineWebhookPullRequestEnqueuedPullRequestLinksIssueXe8d31a08 = InlineWebhookPullRequestEnqueuedPullRequestLinksIssueXe8d31a08.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestEnqueuedPullRequestLinksIssueXe8d31a08 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
