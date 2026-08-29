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
 * inks/properties/self.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/pull_request/properties/_l
 * inks/properties/self
 */
@Serializable(with = InlineWebhookPullRequestUnlabeledPullRequestLinksSelfX1b0e71f7.Serializer::class)
public class InlineWebhookPullRequestUnlabeledPullRequestLinksSelfX1b0e71f7(
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

    public fun build(): InlineWebhookPullRequestUnlabeledPullRequestLinksSelfX1b0e71f7 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestUnlabeledPullRequestLinksSelfX1b0e71f7(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestUnlabeledPullRequestLinksSelfX1b0e71f7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnlabeledPullRequestLinksSelfX1b0e71f7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlabeledPullRequestLinksSelfX1b0e71f7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestUnlabeledPullRequestLinksSelfX1b0e71f7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestUnlabeledPullRequestLinksSelfX1b0e71f7 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestUnlabeledPullRequestLinksSelfX1b0e71f7(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlabeledPullRequestLinksSelfX1b0e71f7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestUnlabeledPullRequestLinksSelfX1b0e71f7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestUnlabeledPullRequestLinksSelfX1b0e71f7(block: InlineWebhookPullRequestUnlabeledPullRequestLinksSelfX1b0e71f7.Builder.() -> Unit): InlineWebhookPullRequestUnlabeledPullRequestLinksSelfX1b0e71f7 = InlineWebhookPullRequestUnlabeledPullRequestLinksSelfX1b0e71f7.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestUnlabeledPullRequestLinksSelfX1b0e71f7 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
