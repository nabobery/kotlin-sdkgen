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
 * The side of the diff to which the comment applies. The side of the last line of the range for a multi-line comment
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-comment/properties/side
 */
@Serializable(with = InlinePullRequestReviewCommentSideX7997f0f6.Serializer::class)
public sealed class InlinePullRequestReviewCommentSideX7997f0f6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `LEFT`.
   */
  public data object Left : InlinePullRequestReviewCommentSideX7997f0f6() {
    public override val `value`: String = "LEFT"
  }

  /**
   * Documented value. Wire value: `RIGHT`.
   */
  public data object Right : InlinePullRequestReviewCommentSideX7997f0f6() {
    public override val `value`: String = "RIGHT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePullRequestReviewCommentSideX7997f0f6()

  public companion object {
    public fun fromValue(`value`: String): InlinePullRequestReviewCommentSideX7997f0f6 = when (value) {
      Left.value -> Left
      Right.value -> Right
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePullRequestReviewCommentSideX7997f0f6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlinePullRequestReviewCommentSideX7997f0f6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePullRequestReviewCommentSideX7997f0f6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestReviewCommentSideX7997f0f6) {
      encoder.encodeString(value.value)
    }
  }
}
