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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/changes/properties/bod
 * y.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/changes/properties/bod
 * y
 */
@Serializable(with = InlineWebhookPullRequestReviewEditedChangesBodyX88091c3b.Serializer::class)
public class InlineWebhookPullRequestReviewEditedChangesBodyX88091c3b(
  /**
   * The previous version of the body if the action was `edited`.
   */
  public val from: String,
) {
  public class Builder {
    private var fromValue: String? = null

    public var from: String
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    public fun build(): InlineWebhookPullRequestReviewEditedChangesBodyX88091c3b {
      check(fromValue != null) { "from is required" }
      return InlineWebhookPullRequestReviewEditedChangesBodyX88091c3b(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestReviewEditedChangesBodyX88091c3b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewEditedChangesBodyX88091c3b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewEditedChangesBodyX88091c3b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestReviewEditedChangesBodyX88091c3b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestReviewEditedChangesBodyX88091c3b must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookPullRequestReviewEditedChangesBodyX88091c3b(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewEditedChangesBodyX88091c3b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestReviewEditedChangesBodyX88091c3b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestReviewEditedChangesBodyX88091c3b(block: InlineWebhookPullRequestReviewEditedChangesBodyX88091c3b.Builder.() -> Unit): InlineWebhookPullRequestReviewEditedChangesBodyX88091c3b = InlineWebhookPullRequestReviewEditedChangesBodyX88091c3b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestReviewEditedChangesBodyX88091c3b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
