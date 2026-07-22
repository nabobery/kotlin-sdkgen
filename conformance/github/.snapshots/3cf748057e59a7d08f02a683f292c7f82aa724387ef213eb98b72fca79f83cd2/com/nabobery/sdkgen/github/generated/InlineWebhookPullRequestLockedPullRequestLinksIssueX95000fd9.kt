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
 * s/properties/issue.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/_link
 * s/properties/issue
 */
@Serializable(with = InlineWebhookPullRequestLockedPullRequestLinksIssueX95000fd9.Serializer::class)
public class InlineWebhookPullRequestLockedPullRequestLinksIssueX95000fd9(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestLockedPullRequestLinksIssueX95000fd9 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestLockedPullRequestLinksIssueX95000fd9(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestLockedPullRequestLinksIssueX95000fd9 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestLockedPullRequestLinksIssueX95000fd9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLockedPullRequestLinksIssueX95000fd9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestLockedPullRequestLinksIssueX95000fd9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestLockedPullRequestLinksIssueX95000fd9 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestLockedPullRequestLinksIssueX95000fd9(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLockedPullRequestLinksIssueX95000fd9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestLockedPullRequestLinksIssueX95000fd9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestLockedPullRequestLinksIssueX95000fd9(block: InlineWebhookPullRequestLockedPullRequestLinksIssueX95000fd9.Builder.() -> Unit): InlineWebhookPullRequestLockedPullRequestLinksIssueX95000fd9 = InlineWebhookPullRequestLockedPullRequestLinksIssueX95000fd9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestLockedPullRequestLinksIssueX95000fd9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
