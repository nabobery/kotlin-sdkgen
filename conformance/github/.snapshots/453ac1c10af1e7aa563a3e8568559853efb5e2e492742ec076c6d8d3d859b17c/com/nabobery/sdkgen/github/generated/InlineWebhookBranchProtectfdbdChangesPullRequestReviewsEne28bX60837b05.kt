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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited/properties/changes/properties/
 * pull_request_reviews_enforcement_level.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-branch-protection-rule-edited/properties/changes/properties/
 * pull_request_reviews_enforcement_level
 */
@Serializable(with = InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bX60837b05.Serializer::class)
public class InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bX60837b05(
  public val from: InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bFromX2334e6ed,
) {
  public class Builder {
    private var fromValue:
        InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bFromX2334e6ed? = null

    public var from: InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bFromX2334e6ed
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    public fun build(): InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bX60837b05 {
      check(fromValue != null) { "from is required" }
      return InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bX60837b05(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bX60837b05 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bX60837b05> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bX60837b05 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bX60837b05")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bX60837b05 must be a JSON object")
      val from = json.decodeRequired<InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bFromX2334e6ed>(rawObject, "from")
      return InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bX60837b05(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bX60837b05) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bX60837b05")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", json.encodeToJsonElement(value.from))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bX60837b05(block: InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bX60837b05.Builder.() -> Unit): InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bX60837b05 = InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bX60837b05.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookBranchProtectfdbdChangesPullRequestReviewsEne28bX60837b05 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
