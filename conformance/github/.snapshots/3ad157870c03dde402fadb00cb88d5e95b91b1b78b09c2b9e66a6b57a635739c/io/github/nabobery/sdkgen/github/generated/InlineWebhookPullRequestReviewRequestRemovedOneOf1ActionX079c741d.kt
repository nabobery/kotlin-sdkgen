package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/0/properties/actio
 * n.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/0/properties/actio
 * n
 */
@Serializable(with = InlineWebhookPullRequestReviewRequestRemovedOneOf1ActionX079c741d.Serializer::class)
public sealed class InlineWebhookPullRequestReviewRequestRemovedOneOf1ActionX079c741d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `review_request_removed`.
   */
  public data object ReviewRequestRemoved : InlineWebhookPullRequestReviewRequestRemovedOneOf1ActionX079c741d() {
    public override val `value`: String = "review_request_removed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewRequestRemovedOneOf1ActionX079c741d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewRequestRemovedOneOf1ActionX079c741d = when (value) {
      ReviewRequestRemoved.value -> ReviewRequestRemoved
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewRequestRemovedOneOf1ActionX079c741d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewRequestRemovedOneOf1ActionX079c741d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewRequestRemovedOneOf1ActionX079c741d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewRequestRemovedOneOf1ActionX079c741d) {
      encoder.encodeString(value.value)
    }
  }
}
