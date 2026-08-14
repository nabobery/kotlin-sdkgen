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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-enabled/properties/pull_request/prop
 * erties/_links/properties/commits.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-enabled/properties/pull_request/prop
 * erties/_links/properties/commits
 */
@Serializable(with = InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommitsX7e9669c9.Serializer::class)
public class InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommitsX7e9669c9(
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

    public fun build(): InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommitsX7e9669c9 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommitsX7e9669c9(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommitsX7e9669c9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommitsX7e9669c9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommitsX7e9669c9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommitsX7e9669c9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommitsX7e9669c9 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommitsX7e9669c9(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommitsX7e9669c9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommitsX7e9669c9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommitsX7e9669c9(block: InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommitsX7e9669c9.Builder.() -> Unit): InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommitsX7e9669c9 = InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommitsX7e9669c9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestAutoMergeEnabledPullRequestLinksCommitsX7e9669c9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
