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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/_li
 * nks/properties/commits.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/_li
 * nks/properties/commits
 */
@Serializable(with = InlineWebhookPullRequestAssignedPullRequestLinksCommitsX59ac6d03.Serializer::class)
public class InlineWebhookPullRequestAssignedPullRequestLinksCommitsX59ac6d03(
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

    public fun build(): InlineWebhookPullRequestAssignedPullRequestLinksCommitsX59ac6d03 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestAssignedPullRequestLinksCommitsX59ac6d03(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestAssignedPullRequestLinksCommitsX59ac6d03 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestAssignedPullRequestLinksCommitsX59ac6d03> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAssignedPullRequestLinksCommitsX59ac6d03 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestAssignedPullRequestLinksCommitsX59ac6d03")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestAssignedPullRequestLinksCommitsX59ac6d03 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestAssignedPullRequestLinksCommitsX59ac6d03(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAssignedPullRequestLinksCommitsX59ac6d03) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestAssignedPullRequestLinksCommitsX59ac6d03")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestAssignedPullRequestLinksCommitsX59ac6d03(block: InlineWebhookPullRequestAssignedPullRequestLinksCommitsX59ac6d03.Builder.() -> Unit): InlineWebhookPullRequestAssignedPullRequestLinksCommitsX59ac6d03 = InlineWebhookPullRequestAssignedPullRequestLinksCommitsX59ac6d03.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestAssignedPullRequestLinksCommitsX59ac6d03 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
