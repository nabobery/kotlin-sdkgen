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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlocked/properties/pull_request/properties/_li
 * nks/properties/issue.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlocked/properties/pull_request/properties/_li
 * nks/properties/issue
 */
@Serializable(with = InlineWebhookPullRequestUnlockedPullRequestLinksIssueXb82e0b03.Serializer::class)
public class InlineWebhookPullRequestUnlockedPullRequestLinksIssueXb82e0b03(
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

    public fun build(): InlineWebhookPullRequestUnlockedPullRequestLinksIssueXb82e0b03 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestUnlockedPullRequestLinksIssueXb82e0b03(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestUnlockedPullRequestLinksIssueXb82e0b03 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestUnlockedPullRequestLinksIssueXb82e0b03> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlockedPullRequestLinksIssueXb82e0b03 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestUnlockedPullRequestLinksIssueXb82e0b03")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestUnlockedPullRequestLinksIssueXb82e0b03 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestUnlockedPullRequestLinksIssueXb82e0b03(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlockedPullRequestLinksIssueXb82e0b03) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestUnlockedPullRequestLinksIssueXb82e0b03")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestUnlockedPullRequestLinksIssueXb82e0b03(block: InlineWebhookPullRequestUnlockedPullRequestLinksIssueXb82e0b03.Builder.() -> Unit): InlineWebhookPullRequestUnlockedPullRequestLinksIssueXb82e0b03 = InlineWebhookPullRequestUnlockedPullRequestLinksIssueXb82e0b03.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestUnlockedPullRequestLinksIssueXb82e0b03 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
