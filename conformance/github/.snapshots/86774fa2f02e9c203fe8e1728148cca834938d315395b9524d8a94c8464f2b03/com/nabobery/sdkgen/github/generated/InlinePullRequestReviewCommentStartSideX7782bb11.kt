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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-comment/properties/start_side
 */
@Serializable(with = InlinePullRequestReviewCommentStartSideX7782bb11.Serializer::class)
public sealed class InlinePullRequestReviewCommentStartSideX7782bb11 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `LEFT`.
   */
  public data object Left : InlinePullRequestReviewCommentStartSideX7782bb11() {
    public override val `value`: String = "LEFT"
  }

  /**
   * Documented value. Wire value: `RIGHT`.
   */
  public data object Right : InlinePullRequestReviewCommentStartSideX7782bb11() {
    public override val `value`: String = "RIGHT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePullRequestReviewCommentStartSideX7782bb11()

  public companion object {
    public fun fromValue(`value`: String): InlinePullRequestReviewCommentStartSideX7782bb11 = when (value) {
      Left.value -> Left
      Right.value -> Right
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePullRequestReviewCommentStartSideX7782bb11> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlinePullRequestReviewCommentStartSideX7782bb11", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePullRequestReviewCommentStartSideX7782bb11 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestReviewCommentStartSideX7782bb11) {
      encoder.encodeString(value.value)
    }
  }
}
