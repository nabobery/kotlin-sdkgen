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
 * The level at which the comment is targeted, can be a diff line or a file.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request-review-comment/properties/subject_type
 */
@Serializable(with = InlinePullRequestReviewCommentSubjectTypeX42f2712d.Serializer::class)
public sealed class InlinePullRequestReviewCommentSubjectTypeX42f2712d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `line`.
   */
  public data object Line : InlinePullRequestReviewCommentSubjectTypeX42f2712d() {
    public override val `value`: String = "line"
  }

  /**
   * Documented value. Wire value: `file`.
   */
  public data object File : InlinePullRequestReviewCommentSubjectTypeX42f2712d() {
    public override val `value`: String = "file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePullRequestReviewCommentSubjectTypeX42f2712d()

  public companion object {
    public fun fromValue(`value`: String): InlinePullRequestReviewCommentSubjectTypeX42f2712d = when (value) {
      Line.value -> Line
      File.value -> File
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePullRequestReviewCommentSubjectTypeX42f2712d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlinePullRequestReviewCommentSubjectTypeX42f2712d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePullRequestReviewCommentSubjectTypeX42f2712d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestReviewCommentSubjectTypeX42f2712d) {
      encoder.encodeString(value.value)
    }
  }
}
