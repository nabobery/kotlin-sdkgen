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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/_links/properties/self.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/_links/properties/self
 */
@Serializable(with = InlineWebhooksPullRequest5LinksSelfX4b1081ad.Serializer::class)
public class InlineWebhooksPullRequest5LinksSelfX4b1081ad(
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

    public fun build(): InlineWebhooksPullRequest5LinksSelfX4b1081ad {
      check(hrefValue != null) { "href is required" }
      return InlineWebhooksPullRequest5LinksSelfX4b1081ad(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhooksPullRequest5LinksSelfX4b1081ad = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhooksPullRequest5LinksSelfX4b1081ad> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5LinksSelfX4b1081ad {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksPullRequest5LinksSelfX4b1081ad")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksPullRequest5LinksSelfX4b1081ad must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhooksPullRequest5LinksSelfX4b1081ad(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5LinksSelfX4b1081ad) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksPullRequest5LinksSelfX4b1081ad")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhooksPullRequest5LinksSelfX4b1081ad(block: InlineWebhooksPullRequest5LinksSelfX4b1081ad.Builder.() -> Unit): InlineWebhooksPullRequest5LinksSelfX4b1081ad = InlineWebhooksPullRequest5LinksSelfX4b1081ad.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhooksPullRequest5LinksSelfX4b1081ad is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
