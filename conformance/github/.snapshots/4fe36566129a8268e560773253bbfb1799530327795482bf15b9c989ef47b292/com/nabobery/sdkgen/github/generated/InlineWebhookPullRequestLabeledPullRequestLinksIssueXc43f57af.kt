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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/_lin
 * ks/properties/issue.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/_lin
 * ks/properties/issue
 */
@Serializable(with = InlineWebhookPullRequestLabeledPullRequestLinksIssueXc43f57af.Serializer::class)
public class InlineWebhookPullRequestLabeledPullRequestLinksIssueXc43f57af(
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

    public fun build(): InlineWebhookPullRequestLabeledPullRequestLinksIssueXc43f57af {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestLabeledPullRequestLinksIssueXc43f57af(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestLabeledPullRequestLinksIssueXc43f57af = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestLabeledPullRequestLinksIssueXc43f57af> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLabeledPullRequestLinksIssueXc43f57af {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestLabeledPullRequestLinksIssueXc43f57af")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestLabeledPullRequestLinksIssueXc43f57af must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestLabeledPullRequestLinksIssueXc43f57af(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLabeledPullRequestLinksIssueXc43f57af) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestLabeledPullRequestLinksIssueXc43f57af")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestLabeledPullRequestLinksIssueXc43f57af(block: InlineWebhookPullRequestLabeledPullRequestLinksIssueXc43f57af.Builder.() -> Unit): InlineWebhookPullRequestLabeledPullRequestLinksIssueXc43f57af = InlineWebhookPullRequestLabeledPullRequestLinksIssueXc43f57af.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestLabeledPullRequestLinksIssueXc43f57af is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
