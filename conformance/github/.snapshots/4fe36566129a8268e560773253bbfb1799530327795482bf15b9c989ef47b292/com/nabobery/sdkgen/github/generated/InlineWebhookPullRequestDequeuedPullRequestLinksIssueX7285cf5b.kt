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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/_li
 * nks/properties/issue.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/_li
 * nks/properties/issue
 */
@Serializable(with = InlineWebhookPullRequestDequeuedPullRequestLinksIssueX7285cf5b.Serializer::class)
public class InlineWebhookPullRequestDequeuedPullRequestLinksIssueX7285cf5b(
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

    public fun build(): InlineWebhookPullRequestDequeuedPullRequestLinksIssueX7285cf5b {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestDequeuedPullRequestLinksIssueX7285cf5b(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestDequeuedPullRequestLinksIssueX7285cf5b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestDequeuedPullRequestLinksIssueX7285cf5b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestDequeuedPullRequestLinksIssueX7285cf5b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestDequeuedPullRequestLinksIssueX7285cf5b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestDequeuedPullRequestLinksIssueX7285cf5b must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestDequeuedPullRequestLinksIssueX7285cf5b(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestDequeuedPullRequestLinksIssueX7285cf5b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestDequeuedPullRequestLinksIssueX7285cf5b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestDequeuedPullRequestLinksIssueX7285cf5b(block: InlineWebhookPullRequestDequeuedPullRequestLinksIssueX7285cf5b.Builder.() -> Unit): InlineWebhookPullRequestDequeuedPullRequestLinksIssueX7285cf5b = InlineWebhookPullRequestDequeuedPullRequestLinksIssueX7285cf5b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestDequeuedPullRequestLinksIssueX7285cf5b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
