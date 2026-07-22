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
 * nks/properties/commits.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlocked/properties/pull_request/properties/_li
 * nks/properties/commits
 */
@Serializable(with = InlineWebhookPullRequestUnlockedPullRequestLinksCommitsXf06ef3af.Serializer::class)
public class InlineWebhookPullRequestUnlockedPullRequestLinksCommitsXf06ef3af(
  public val href: String,
) {
  public class Builder {
    private var hrefValue: String? = null

    public var href: String
      get() = requireNotNull(hrefValue) { "href is required" }
      set(`value`) {
        hrefValue = value
      }

    public fun build(): InlineWebhookPullRequestUnlockedPullRequestLinksCommitsXf06ef3af {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestUnlockedPullRequestLinksCommitsXf06ef3af(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestUnlockedPullRequestLinksCommitsXf06ef3af = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestUnlockedPullRequestLinksCommitsXf06ef3af> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlockedPullRequestLinksCommitsXf06ef3af {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestUnlockedPullRequestLinksCommitsXf06ef3af")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestUnlockedPullRequestLinksCommitsXf06ef3af must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestUnlockedPullRequestLinksCommitsXf06ef3af(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlockedPullRequestLinksCommitsXf06ef3af) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestUnlockedPullRequestLinksCommitsXf06ef3af")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestUnlockedPullRequestLinksCommitsXf06ef3af(block: InlineWebhookPullRequestUnlockedPullRequestLinksCommitsXf06ef3af.Builder.() -> Unit): InlineWebhookPullRequestUnlockedPullRequestLinksCommitsXf06ef3af = InlineWebhookPullRequestUnlockedPullRequestLinksCommitsXf06ef3af.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestUnlockedPullRequestLinksCommitsXf06ef3af is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
