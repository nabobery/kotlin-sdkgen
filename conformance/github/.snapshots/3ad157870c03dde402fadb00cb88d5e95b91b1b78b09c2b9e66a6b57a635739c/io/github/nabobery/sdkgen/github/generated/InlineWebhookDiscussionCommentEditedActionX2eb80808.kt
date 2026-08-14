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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-comment-edited/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-comment-edited/properties/action
 */
@Serializable(with = InlineWebhookDiscussionCommentEditedActionX2eb80808.Serializer::class)
public sealed class InlineWebhookDiscussionCommentEditedActionX2eb80808 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `edited`.
   */
  public data object Edited : InlineWebhookDiscussionCommentEditedActionX2eb80808() {
    public override val `value`: String = "edited"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDiscussionCommentEditedActionX2eb80808()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDiscussionCommentEditedActionX2eb80808 = when (value) {
      Edited.value -> Edited
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDiscussionCommentEditedActionX2eb80808> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookDiscussionCommentEditedActionX2eb80808", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDiscussionCommentEditedActionX2eb80808 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDiscussionCommentEditedActionX2eb80808) {
      encoder.encodeString(value.value)
    }
  }
}
