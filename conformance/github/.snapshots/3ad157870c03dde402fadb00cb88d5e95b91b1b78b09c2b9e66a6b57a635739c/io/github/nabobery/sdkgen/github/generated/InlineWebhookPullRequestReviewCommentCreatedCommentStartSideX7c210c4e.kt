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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/comment/prope
 * rties/start_side
 */
@Serializable(with = InlineWebhookPullRequestReviewCommentCreatedCommentStartSideX7c210c4e.Serializer::class)
public sealed class InlineWebhookPullRequestReviewCommentCreatedCommentStartSideX7c210c4e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `LEFT`.
   */
  public data object Left : InlineWebhookPullRequestReviewCommentCreatedCommentStartSideX7c210c4e() {
    public override val `value`: String = "LEFT"
  }

  /**
   * Documented value. Wire value: `RIGHT`.
   */
  public data object Right : InlineWebhookPullRequestReviewCommentCreatedCommentStartSideX7c210c4e() {
    public override val `value`: String = "RIGHT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewCommentCreatedCommentStartSideX7c210c4e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewCommentCreatedCommentStartSideX7c210c4e = when (value) {
      Left.value -> Left
      Right.value -> Right
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewCommentCreatedCommentStartSideX7c210c4e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewCommentCreatedCommentStartSideX7c210c4e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewCommentCreatedCommentStartSideX7c210c4e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewCommentCreatedCommentStartSideX7c210c4e) {
      encoder.encodeString(value.value)
    }
  }
}
