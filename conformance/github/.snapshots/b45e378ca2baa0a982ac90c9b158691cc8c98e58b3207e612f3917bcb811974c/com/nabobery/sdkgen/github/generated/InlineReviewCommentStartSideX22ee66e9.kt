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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/review-comment/properties/start_side
 */
@Serializable(with = InlineReviewCommentStartSideX22ee66e9.Serializer::class)
public sealed class InlineReviewCommentStartSideX22ee66e9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `LEFT`.
   */
  public data object Left : InlineReviewCommentStartSideX22ee66e9() {
    public override val `value`: String = "LEFT"
  }

  /**
   * Documented value. Wire value: `RIGHT`.
   */
  public data object Right : InlineReviewCommentStartSideX22ee66e9() {
    public override val `value`: String = "RIGHT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReviewCommentStartSideX22ee66e9()

  public companion object {
    public fun fromValue(`value`: String): InlineReviewCommentStartSideX22ee66e9 = when (value) {
      Left.value -> Left
      Right.value -> Right
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReviewCommentStartSideX22ee66e9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReviewCommentStartSideX22ee66e9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReviewCommentStartSideX22ee66e9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReviewCommentStartSideX22ee66e9) {
      encoder.encodeString(value.value)
    }
  }
}
