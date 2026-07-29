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
 * The side of the first line of the range for a multi-line comment.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/thread/prop
 * erties/comments/items/properties/side
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemSideXecd55854.Serializer::class)
public sealed class InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemSideXecd55854 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `LEFT`.
   */
  public data object Left : InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemSideXecd55854() {
    public override val `value`: String = "LEFT"
  }

  /**
   * Documented value. Wire value: `RIGHT`.
   */
  public data object Right : InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemSideXecd55854() {
    public override val `value`: String = "RIGHT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemSideXecd55854()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemSideXecd55854 = when (value) {
      Left.value -> Left
      Right.value -> Right
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemSideXecd55854> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemSideXecd55854", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemSideXecd55854 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadUnresolvedThreadCommentsItemSideXecd55854) {
      encoder.encodeString(value.value)
    }
  }
}
