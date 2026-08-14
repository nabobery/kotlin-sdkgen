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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/_links/properties/commits.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-disabled/properties/pull_request/pro
 * perties/_links/properties/commits
 */
@Serializable(with = InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommitsX6257ee12.Serializer::class)
public class InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommitsX6257ee12(
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

    public fun build(): InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommitsX6257ee12 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommitsX6257ee12(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommitsX6257ee12 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommitsX6257ee12> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommitsX6257ee12 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommitsX6257ee12")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommitsX6257ee12 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommitsX6257ee12(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommitsX6257ee12) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommitsX6257ee12")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommitsX6257ee12(block: InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommitsX6257ee12.Builder.() -> Unit): InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommitsX6257ee12 = InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommitsX6257ee12.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestAutoMergeDisabledPullRequestLinksCommitsX6257ee12 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
