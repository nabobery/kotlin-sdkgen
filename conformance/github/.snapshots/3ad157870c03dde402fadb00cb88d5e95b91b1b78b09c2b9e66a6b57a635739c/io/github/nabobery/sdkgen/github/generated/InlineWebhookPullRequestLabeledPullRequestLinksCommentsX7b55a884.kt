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
 * ks/properties/comments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/_lin
 * ks/properties/comments
 */
@Serializable(with = InlineWebhookPullRequestLabeledPullRequestLinksCommentsX7b55a884.Serializer::class)
public class InlineWebhookPullRequestLabeledPullRequestLinksCommentsX7b55a884(
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

    public fun build(): InlineWebhookPullRequestLabeledPullRequestLinksCommentsX7b55a884 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestLabeledPullRequestLinksCommentsX7b55a884(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestLabeledPullRequestLinksCommentsX7b55a884 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestLabeledPullRequestLinksCommentsX7b55a884> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLabeledPullRequestLinksCommentsX7b55a884 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestLabeledPullRequestLinksCommentsX7b55a884")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestLabeledPullRequestLinksCommentsX7b55a884 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestLabeledPullRequestLinksCommentsX7b55a884(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLabeledPullRequestLinksCommentsX7b55a884) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestLabeledPullRequestLinksCommentsX7b55a884")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestLabeledPullRequestLinksCommentsX7b55a884(block: InlineWebhookPullRequestLabeledPullRequestLinksCommentsX7b55a884.Builder.() -> Unit): InlineWebhookPullRequestLabeledPullRequestLinksCommentsX7b55a884 = InlineWebhookPullRequestLabeledPullRequestLinksCommentsX7b55a884.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestLabeledPullRequestLinksCommentsX7b55a884 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
