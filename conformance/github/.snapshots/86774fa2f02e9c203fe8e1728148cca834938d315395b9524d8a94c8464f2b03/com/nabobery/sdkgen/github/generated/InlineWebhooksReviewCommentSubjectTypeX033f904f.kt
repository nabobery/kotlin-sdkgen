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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_review_comment/properties/subject_type
 */
@Serializable(with = InlineWebhooksReviewCommentSubjectTypeX033f904f.Serializer::class)
public sealed class InlineWebhooksReviewCommentSubjectTypeX033f904f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `line`.
   */
  public data object Line : InlineWebhooksReviewCommentSubjectTypeX033f904f() {
    public override val `value`: String = "line"
  }

  /**
   * Documented value. Wire value: `file`.
   */
  public data object File : InlineWebhooksReviewCommentSubjectTypeX033f904f() {
    public override val `value`: String = "file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksReviewCommentSubjectTypeX033f904f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksReviewCommentSubjectTypeX033f904f = when (value) {
      Line.value -> Line
      File.value -> File
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksReviewCommentSubjectTypeX033f904f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksReviewCommentSubjectTypeX033f904f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksReviewCommentSubjectTypeX033f904f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksReviewCommentSubjectTypeX033f904f) {
      encoder.encodeString(value.value)
    }
  }
}
