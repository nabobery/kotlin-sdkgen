package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/_lin
 * ks/properties/html.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/_lin
 * ks/properties/html
 */
@Serializable(with = InlineWebhookPullRequestStackedPullRequestLinksHtmlXbc4d4d94.Serializer::class)
public class InlineWebhookPullRequestStackedPullRequestLinksHtmlXbc4d4d94(
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

    public fun build(): InlineWebhookPullRequestStackedPullRequestLinksHtmlXbc4d4d94 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestStackedPullRequestLinksHtmlXbc4d4d94(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestStackedPullRequestLinksHtmlXbc4d4d94 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestStackedPullRequestLinksHtmlXbc4d4d94> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestStackedPullRequestLinksHtmlXbc4d4d94 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestStackedPullRequestLinksHtmlXbc4d4d94")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestStackedPullRequestLinksHtmlXbc4d4d94 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestStackedPullRequestLinksHtmlXbc4d4d94(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestStackedPullRequestLinksHtmlXbc4d4d94) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestStackedPullRequestLinksHtmlXbc4d4d94")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestStackedPullRequestLinksHtmlXbc4d4d94(block: InlineWebhookPullRequestStackedPullRequestLinksHtmlXbc4d4d94.Builder.() -> Unit): InlineWebhookPullRequestStackedPullRequestLinksHtmlXbc4d4d94 = InlineWebhookPullRequestStackedPullRequestLinksHtmlXbc4d4d94.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestStackedPullRequestLinksHtmlXbc4d4d94 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
