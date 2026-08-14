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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_review_comment/properties/side
 */
@Serializable(with = InlineWebhooksReviewCommentSideX43294ba2.Serializer::class)
public sealed class InlineWebhooksReviewCommentSideX43294ba2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `LEFT`.
   */
  public data object Left : InlineWebhooksReviewCommentSideX43294ba2() {
    public override val `value`: String = "LEFT"
  }

  /**
   * Documented value. Wire value: `RIGHT`.
   */
  public data object Right : InlineWebhooksReviewCommentSideX43294ba2() {
    public override val `value`: String = "RIGHT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksReviewCommentSideX43294ba2()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksReviewCommentSideX43294ba2 = when (value) {
      Left.value -> Left
      Right.value -> Right
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksReviewCommentSideX43294ba2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksReviewCommentSideX43294ba2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksReviewCommentSideX43294ba2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksReviewCommentSideX43294ba2) {
      encoder.encodeString(value.value)
    }
  }
}
