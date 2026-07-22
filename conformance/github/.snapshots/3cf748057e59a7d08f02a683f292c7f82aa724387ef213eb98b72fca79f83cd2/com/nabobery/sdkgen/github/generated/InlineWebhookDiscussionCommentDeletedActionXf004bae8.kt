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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-comment-deleted/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-comment-deleted/properties/action
 */
@Serializable(with = InlineWebhookDiscussionCommentDeletedActionXf004bae8.Serializer::class)
public sealed class InlineWebhookDiscussionCommentDeletedActionXf004bae8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineWebhookDiscussionCommentDeletedActionXf004bae8() {
    public override val `value`: String = "deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDiscussionCommentDeletedActionXf004bae8()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDiscussionCommentDeletedActionXf004bae8 = when (value) {
      Deleted.value -> Deleted
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookDiscussionCommentDeletedActionXf004bae8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDiscussionCommentDeletedActionXf004bae8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDiscussionCommentDeletedActionXf004bae8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDiscussionCommentDeletedActionXf004bae8) {
      encoder.encodeString(value.value)
    }
  }
}
