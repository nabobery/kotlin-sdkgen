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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/_lin
 * ks/properties/self.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/_lin
 * ks/properties/self
 */
@Serializable(with = InlineWebhookPullRequestLabeledPullRequestLinksSelfX7d08e1bf.Serializer::class)
public class InlineWebhookPullRequestLabeledPullRequestLinksSelfX7d08e1bf(
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

    public fun build(): InlineWebhookPullRequestLabeledPullRequestLinksSelfX7d08e1bf {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestLabeledPullRequestLinksSelfX7d08e1bf(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestLabeledPullRequestLinksSelfX7d08e1bf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestLabeledPullRequestLinksSelfX7d08e1bf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLabeledPullRequestLinksSelfX7d08e1bf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestLabeledPullRequestLinksSelfX7d08e1bf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestLabeledPullRequestLinksSelfX7d08e1bf must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestLabeledPullRequestLinksSelfX7d08e1bf(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLabeledPullRequestLinksSelfX7d08e1bf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestLabeledPullRequestLinksSelfX7d08e1bf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestLabeledPullRequestLinksSelfX7d08e1bf(block: InlineWebhookPullRequestLabeledPullRequestLinksSelfX7d08e1bf.Builder.() -> Unit): InlineWebhookPullRequestLabeledPullRequestLinksSelfX7d08e1bf = InlineWebhookPullRequestLabeledPullRequestLinksSelfX7d08e1bf.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestLabeledPullRequestLinksSelfX7d08e1bf is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
