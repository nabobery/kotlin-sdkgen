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
 * The side of the first line of the range for a multi-line comment.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/thread/proper
 * ties/comments/items/properties/start_side
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemStartSideX19ad2f14.Serializer::class)
public sealed class InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemStartSideX19ad2f14 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `LEFT`.
   */
  public data object Left : InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemStartSideX19ad2f14() {
    public override val `value`: String = "LEFT"
  }

  /**
   * Documented value. Wire value: `RIGHT`.
   */
  public data object Right : InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemStartSideX19ad2f14() {
    public override val `value`: String = "RIGHT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemStartSideX19ad2f14()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemStartSideX19ad2f14 = when (value) {
      Left.value -> Left
      Right.value -> Right
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemStartSideX19ad2f14> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemStartSideX19ad2f14", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemStartSideX19ad2f14 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemStartSideX19ad2f14) {
      encoder.encodeString(value.value)
    }
  }
}
