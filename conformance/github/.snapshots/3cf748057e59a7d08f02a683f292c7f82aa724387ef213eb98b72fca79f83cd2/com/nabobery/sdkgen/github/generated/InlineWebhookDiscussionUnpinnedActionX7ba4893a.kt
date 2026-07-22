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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-unpinned/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-unpinned/properties/action
 */
@Serializable(with = InlineWebhookDiscussionUnpinnedActionX7ba4893a.Serializer::class)
public sealed class InlineWebhookDiscussionUnpinnedActionX7ba4893a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unpinned`.
   */
  public data object Unpinned : InlineWebhookDiscussionUnpinnedActionX7ba4893a() {
    public override val `value`: String = "unpinned"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDiscussionUnpinnedActionX7ba4893a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDiscussionUnpinnedActionX7ba4893a = when (value) {
      Unpinned.value -> Unpinned
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookDiscussionUnpinnedActionX7ba4893a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDiscussionUnpinnedActionX7ba4893a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDiscussionUnpinnedActionX7ba4893a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDiscussionUnpinnedActionX7ba4893a) {
      encoder.encodeString(value.value)
    }
  }
}
