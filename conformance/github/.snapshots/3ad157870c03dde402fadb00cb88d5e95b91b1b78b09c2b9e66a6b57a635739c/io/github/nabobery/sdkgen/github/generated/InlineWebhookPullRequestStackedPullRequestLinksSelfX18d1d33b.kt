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
 * ks/properties/self.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/_lin
 * ks/properties/self
 */
@Serializable(with = InlineWebhookPullRequestStackedPullRequestLinksSelfX18d1d33b.Serializer::class)
public class InlineWebhookPullRequestStackedPullRequestLinksSelfX18d1d33b(
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

    public fun build(): InlineWebhookPullRequestStackedPullRequestLinksSelfX18d1d33b {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestStackedPullRequestLinksSelfX18d1d33b(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestStackedPullRequestLinksSelfX18d1d33b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestStackedPullRequestLinksSelfX18d1d33b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestStackedPullRequestLinksSelfX18d1d33b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestStackedPullRequestLinksSelfX18d1d33b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestStackedPullRequestLinksSelfX18d1d33b must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestStackedPullRequestLinksSelfX18d1d33b(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestStackedPullRequestLinksSelfX18d1d33b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestStackedPullRequestLinksSelfX18d1d33b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestStackedPullRequestLinksSelfX18d1d33b(block: InlineWebhookPullRequestStackedPullRequestLinksSelfX18d1d33b.Builder.() -> Unit): InlineWebhookPullRequestStackedPullRequestLinksSelfX18d1d33b = InlineWebhookPullRequestStackedPullRequestLinksSelfX18d1d33b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestStackedPullRequestLinksSelfX18d1d33b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
