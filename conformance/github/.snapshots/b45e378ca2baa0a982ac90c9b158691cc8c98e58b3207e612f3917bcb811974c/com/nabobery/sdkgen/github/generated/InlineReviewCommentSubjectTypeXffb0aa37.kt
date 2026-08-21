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
 * The level at which the comment is targeted, can be a diff line or a file.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/review-comment/properties/subject_type
 */
@Serializable(with = InlineReviewCommentSubjectTypeXffb0aa37.Serializer::class)
public sealed class InlineReviewCommentSubjectTypeXffb0aa37 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `line`.
   */
  public data object Line : InlineReviewCommentSubjectTypeXffb0aa37() {
    public override val `value`: String = "line"
  }

  /**
   * Documented value. Wire value: `file`.
   */
  public data object File : InlineReviewCommentSubjectTypeXffb0aa37() {
    public override val `value`: String = "file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReviewCommentSubjectTypeXffb0aa37()

  public companion object {
    public fun fromValue(`value`: String): InlineReviewCommentSubjectTypeXffb0aa37 = when (value) {
      Line.value -> Line
      File.value -> File
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReviewCommentSubjectTypeXffb0aa37> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReviewCommentSubjectTypeXffb0aa37", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReviewCommentSubjectTypeXffb0aa37 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReviewCommentSubjectTypeXffb0aa37) {
      encoder.encodeString(value.value)
    }
  }
}
