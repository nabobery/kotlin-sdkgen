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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/review/properties/s
 * tate.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/review/properties/s
 * tate
 */
@Serializable(with = InlineWebhookPullRequestReviewDismissedReviewStateX05ee8b47.Serializer::class)
public sealed class InlineWebhookPullRequestReviewDismissedReviewStateX05ee8b47 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `dismissed`.
   */
  public data object Dismissed : InlineWebhookPullRequestReviewDismissedReviewStateX05ee8b47() {
    public override val `value`: String = "dismissed"
  }

  /**
   * Documented value. Wire value: `approved`.
   */
  public data object Approved : InlineWebhookPullRequestReviewDismissedReviewStateX05ee8b47() {
    public override val `value`: String = "approved"
  }

  /**
   * Documented value. Wire value: `changes_requested`.
   */
  public data object ChangesRequested : InlineWebhookPullRequestReviewDismissedReviewStateX05ee8b47() {
    public override val `value`: String = "changes_requested"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewDismissedReviewStateX05ee8b47()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewDismissedReviewStateX05ee8b47 = when (value) {
      Dismissed.value -> Dismissed
      Approved.value -> Approved
      ChangesRequested.value -> ChangesRequested
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewDismissedReviewStateX05ee8b47> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewDismissedReviewStateX05ee8b47", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewDismissedReviewStateX05ee8b47 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewDismissedReviewStateX05ee8b47) {
      encoder.encodeString(value.value)
    }
  }
}
