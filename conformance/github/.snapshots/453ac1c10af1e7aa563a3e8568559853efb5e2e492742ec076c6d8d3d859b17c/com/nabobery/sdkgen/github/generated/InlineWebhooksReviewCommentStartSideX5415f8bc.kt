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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_review_comment/properties/start_side
 */
@Serializable(with = InlineWebhooksReviewCommentStartSideX5415f8bc.Serializer::class)
public sealed class InlineWebhooksReviewCommentStartSideX5415f8bc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `LEFT`.
   */
  public data object Left : InlineWebhooksReviewCommentStartSideX5415f8bc() {
    public override val `value`: String = "LEFT"
  }

  /**
   * Documented value. Wire value: `RIGHT`.
   */
  public data object Right : InlineWebhooksReviewCommentStartSideX5415f8bc() {
    public override val `value`: String = "RIGHT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksReviewCommentStartSideX5415f8bc()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksReviewCommentStartSideX5415f8bc = when (value) {
      Left.value -> Left
      Right.value -> Right
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksReviewCommentStartSideX5415f8bc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksReviewCommentStartSideX5415f8bc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksReviewCommentStartSideX5415f8bc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksReviewCommentStartSideX5415f8bc) {
      encoder.encodeString(value.value)
    }
  }
}
