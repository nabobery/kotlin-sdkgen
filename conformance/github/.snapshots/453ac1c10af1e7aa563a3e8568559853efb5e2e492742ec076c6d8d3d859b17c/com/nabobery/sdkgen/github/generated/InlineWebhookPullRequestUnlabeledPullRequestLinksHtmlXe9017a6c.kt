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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/pull_request/properties/_l
 * inks/properties/html.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/pull_request/properties/_l
 * inks/properties/html
 */
@Serializable(with = InlineWebhookPullRequestUnlabeledPullRequestLinksHtmlXe9017a6c.Serializer::class)
public class InlineWebhookPullRequestUnlabeledPullRequestLinksHtmlXe9017a6c(
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

    public fun build(): InlineWebhookPullRequestUnlabeledPullRequestLinksHtmlXe9017a6c {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestUnlabeledPullRequestLinksHtmlXe9017a6c(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestUnlabeledPullRequestLinksHtmlXe9017a6c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestUnlabeledPullRequestLinksHtmlXe9017a6c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlabeledPullRequestLinksHtmlXe9017a6c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestUnlabeledPullRequestLinksHtmlXe9017a6c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestUnlabeledPullRequestLinksHtmlXe9017a6c must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestUnlabeledPullRequestLinksHtmlXe9017a6c(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlabeledPullRequestLinksHtmlXe9017a6c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestUnlabeledPullRequestLinksHtmlXe9017a6c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestUnlabeledPullRequestLinksHtmlXe9017a6c(block: InlineWebhookPullRequestUnlabeledPullRequestLinksHtmlXe9017a6c.Builder.() -> Unit): InlineWebhookPullRequestUnlabeledPullRequestLinksHtmlXe9017a6c = InlineWebhookPullRequestUnlabeledPullRequestLinksHtmlXe9017a6c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestUnlabeledPullRequestLinksHtmlXe9017a6c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
