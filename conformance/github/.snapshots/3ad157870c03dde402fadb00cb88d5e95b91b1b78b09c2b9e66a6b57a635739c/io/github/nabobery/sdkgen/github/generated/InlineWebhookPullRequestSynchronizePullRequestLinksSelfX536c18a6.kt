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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * _links/properties/self.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * _links/properties/self
 */
@Serializable(with = InlineWebhookPullRequestSynchronizePullRequestLinksSelfX536c18a6.Serializer::class)
public class InlineWebhookPullRequestSynchronizePullRequestLinksSelfX536c18a6(
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

    public fun build(): InlineWebhookPullRequestSynchronizePullRequestLinksSelfX536c18a6 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestSynchronizePullRequestLinksSelfX536c18a6(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestSynchronizePullRequestLinksSelfX536c18a6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestSynchronizePullRequestLinksSelfX536c18a6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestSynchronizePullRequestLinksSelfX536c18a6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestSynchronizePullRequestLinksSelfX536c18a6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestSynchronizePullRequestLinksSelfX536c18a6 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestSynchronizePullRequestLinksSelfX536c18a6(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestSynchronizePullRequestLinksSelfX536c18a6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestSynchronizePullRequestLinksSelfX536c18a6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestSynchronizePullRequestLinksSelfX536c18a6(block: InlineWebhookPullRequestSynchronizePullRequestLinksSelfX536c18a6.Builder.() -> Unit): InlineWebhookPullRequestSynchronizePullRequestLinksSelfX536c18a6 = InlineWebhookPullRequestSynchronizePullRequestLinksSelfX536c18a6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestSynchronizePullRequestLinksSelfX536c18a6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
