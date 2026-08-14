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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/review-comment/properties/side
 */
@Serializable(with = InlineReviewCommentSideX34b23eac.Serializer::class)
public sealed class InlineReviewCommentSideX34b23eac {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `LEFT`.
   */
  public data object Left : InlineReviewCommentSideX34b23eac() {
    public override val `value`: String = "LEFT"
  }

  /**
   * Documented value. Wire value: `RIGHT`.
   */
  public data object Right : InlineReviewCommentSideX34b23eac() {
    public override val `value`: String = "RIGHT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReviewCommentSideX34b23eac()

  public companion object {
    public fun fromValue(`value`: String): InlineReviewCommentSideX34b23eac = when (value) {
      Left.value -> Left
      Right.value -> Right
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReviewCommentSideX34b23eac> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReviewCommentSideX34b23eac", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReviewCommentSideX34b23eac = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReviewCommentSideX34b23eac) {
      encoder.encodeString(value.value)
    }
  }
}
