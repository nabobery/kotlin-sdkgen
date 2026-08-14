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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/_li
 * nks/properties/comments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/_li
 * nks/properties/comments
 */
@Serializable(with = InlineWebhookPullRequestAssignedPullRequestLinksCommentsX39655c80.Serializer::class)
public class InlineWebhookPullRequestAssignedPullRequestLinksCommentsX39655c80(
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

    public fun build(): InlineWebhookPullRequestAssignedPullRequestLinksCommentsX39655c80 {
      check(hrefValue != null) { "href is required" }
      return InlineWebhookPullRequestAssignedPullRequestLinksCommentsX39655c80(
        href = href,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestAssignedPullRequestLinksCommentsX39655c80 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAssignedPullRequestLinksCommentsX39655c80> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAssignedPullRequestLinksCommentsX39655c80 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestAssignedPullRequestLinksCommentsX39655c80")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestAssignedPullRequestLinksCommentsX39655c80 must be a JSON object")
      val href = json.decodeRequired<String>(rawObject, "href")
      return InlineWebhookPullRequestAssignedPullRequestLinksCommentsX39655c80(
        href = href,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAssignedPullRequestLinksCommentsX39655c80) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestAssignedPullRequestLinksCommentsX39655c80")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("href", value.href)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestAssignedPullRequestLinksCommentsX39655c80(block: InlineWebhookPullRequestAssignedPullRequestLinksCommentsX39655c80.Builder.() -> Unit): InlineWebhookPullRequestAssignedPullRequestLinksCommentsX39655c80 = InlineWebhookPullRequestAssignedPullRequestLinksCommentsX39655c80.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestAssignedPullRequestLinksCommentsX39655c80 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
