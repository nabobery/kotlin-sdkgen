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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/_
 * links/properties/html.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/_
 * links/properties/html
 */
@Serializable(with = InlineWebhookPullRequestUnassignedPullRequestLinksHtmlXb5a74810.Serializer::class)
public class InlineWebhookPullRequestUnassignedPullRequestLinksHtmlXb5a74810(
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

    public fun build(): InlineWebhookPullRequestUnassignedPullRequestLinksHtmlXb5a74810 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestUnassignedPullRequestLinksHtmlXb5a74810(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestUnassignedPullRequestLinksHtmlXb5a74810 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnassignedPullRequestLinksHtmlXb5a74810> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnassignedPullRequestLinksHtmlXb5a74810 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestUnassignedPullRequestLinksHtmlXb5a74810")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestUnassignedPullRequestLinksHtmlXb5a74810 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestUnassignedPullRequestLinksHtmlXb5a74810(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnassignedPullRequestLinksHtmlXb5a74810) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestUnassignedPullRequestLinksHtmlXb5a74810")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestUnassignedPullRequestLinksHtmlXb5a74810(block: InlineWebhookPullRequestUnassignedPullRequestLinksHtmlXb5a74810.Builder.() -> Unit): InlineWebhookPullRequestUnassignedPullRequestLinksHtmlXb5a74810 = InlineWebhookPullRequestUnassignedPullRequestLinksHtmlXb5a74810.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestUnassignedPullRequestLinksHtmlXb5a74810 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
