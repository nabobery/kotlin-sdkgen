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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-deleted/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-deleted/properties/action
 */
@Serializable(with = InlineWebhookDiscussionDeletedActionX7770b796.Serializer::class)
public sealed class InlineWebhookDiscussionDeletedActionX7770b796 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineWebhookDiscussionDeletedActionX7770b796() {
    public override val `value`: String = "deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDiscussionDeletedActionX7770b796()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDiscussionDeletedActionX7770b796 = when (value) {
      Deleted.value -> Deleted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDiscussionDeletedActionX7770b796> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDiscussionDeletedActionX7770b796", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDiscussionDeletedActionX7770b796 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDiscussionDeletedActionX7770b796) {
      encoder.encodeString(value.value)
    }
  }
}
