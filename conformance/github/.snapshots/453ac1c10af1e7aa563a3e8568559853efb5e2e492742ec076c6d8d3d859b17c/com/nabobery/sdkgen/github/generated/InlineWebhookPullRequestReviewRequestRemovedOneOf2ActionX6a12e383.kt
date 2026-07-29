package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/1/properties/actio
 * n.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/1/properties/actio
 * n
 */
@Serializable(with = InlineWebhookPullRequestReviewRequestRemovedOneOf2ActionX6a12e383.Serializer::class)
public sealed class InlineWebhookPullRequestReviewRequestRemovedOneOf2ActionX6a12e383 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `review_request_removed`.
   */
  public data object ReviewRequestRemoved : InlineWebhookPullRequestReviewRequestRemovedOneOf2ActionX6a12e383() {
    public override val `value`: String = "review_request_removed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewRequestRemovedOneOf2ActionX6a12e383()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewRequestRemovedOneOf2ActionX6a12e383 = when (value) {
      ReviewRequestRemoved.value -> ReviewRequestRemoved
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewRequestRemovedOneOf2ActionX6a12e383> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewRequestRemovedOneOf2ActionX6a12e383", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewRequestRemovedOneOf2ActionX6a12e383 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewRequestRemovedOneOf2ActionX6a12e383) {
      encoder.encodeString(value.value)
    }
  }
}
