package com.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-requested/properties/reviewers/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-deployment-review-requested/properties/reviewers/items
 */
@Serializable(with = InlineWebhookDeploymentReviewRequestedReviewersItemX5b7d7e77.Serializer::class)
public class InlineWebhookDeploymentReviewRequestedReviewersItemX5b7d7e77(
  public val reviewer: InlineWebhookDeploymentReviewRequestedReviewersItemReviewerX3781e2df? = null,
  public val type: InlineWebhookDeploymentReviewRequestedReviewersItemTypeXba625e5b? = null,
) {
  public class Builder {
    public var reviewer: InlineWebhookDeploymentReviewRequestedReviewersItemReviewerX3781e2df? =
        null

    public var type: InlineWebhookDeploymentReviewRequestedReviewersItemTypeXba625e5b? = null

    public fun build(): InlineWebhookDeploymentReviewRequestedReviewersItemX5b7d7e77 = InlineWebhookDeploymentReviewRequestedReviewersItemX5b7d7e77(
      reviewer = reviewer,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDeploymentReviewRequestedReviewersItemX5b7d7e77 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookDeploymentReviewRequestedReviewersItemX5b7d7e77> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDeploymentReviewRequestedReviewersItemX5b7d7e77 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDeploymentReviewRequestedReviewersItemX5b7d7e77")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDeploymentReviewRequestedReviewersItemX5b7d7e77 must be a JSON object")
      return InlineWebhookDeploymentReviewRequestedReviewersItemX5b7d7e77(
        reviewer = rawObject["reviewer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookDeploymentReviewRequestedReviewersItemReviewerX3781e2df?>(element) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineWebhookDeploymentReviewRequestedReviewersItemTypeXba625e5b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDeploymentReviewRequestedReviewersItemX5b7d7e77) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDeploymentReviewRequestedReviewersItemX5b7d7e77")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.reviewer?.let { put("reviewer", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookDeploymentReviewRequestedReviewersItemX5b7d7e77(block: InlineWebhookDeploymentReviewRequestedReviewersItemX5b7d7e77.Builder.() -> Unit): InlineWebhookDeploymentReviewRequestedReviewersItemX5b7d7e77 = InlineWebhookDeploymentReviewRequestedReviewersItemX5b7d7e77.build(block)
