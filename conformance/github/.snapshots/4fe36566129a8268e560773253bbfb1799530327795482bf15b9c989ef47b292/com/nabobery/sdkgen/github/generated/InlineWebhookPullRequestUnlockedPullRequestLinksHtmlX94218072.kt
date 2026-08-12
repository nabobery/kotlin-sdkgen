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
 * nks/properties/html.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlocked/properties/pull_request/properties/_li
 * nks/properties/html
 */
@Serializable(with = InlineWebhookPullRequestUnlockedPullRequestLinksHtmlX94218072.Serializer::class)
public class InlineWebhookPullRequestUnlockedPullRequestLinksHtmlX94218072(
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

    public fun build(): InlineWebhookPullRequestUnlockedPullRequestLinksHtmlX94218072 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestUnlockedPullRequestLinksHtmlX94218072(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestUnlockedPullRequestLinksHtmlX94218072 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnlockedPullRequestLinksHtmlX94218072> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlockedPullRequestLinksHtmlX94218072 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestUnlockedPullRequestLinksHtmlX94218072")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestUnlockedPullRequestLinksHtmlX94218072 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestUnlockedPullRequestLinksHtmlX94218072(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlockedPullRequestLinksHtmlX94218072) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestUnlockedPullRequestLinksHtmlX94218072")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestUnlockedPullRequestLinksHtmlX94218072(block: InlineWebhookPullRequestUnlockedPullRequestLinksHtmlX94218072.Builder.() -> Unit): InlineWebhookPullRequestUnlockedPullRequestLinksHtmlX94218072 = InlineWebhookPullRequestUnlockedPullRequestLinksHtmlX94218072.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestUnlockedPullRequestLinksHtmlX94218072 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
