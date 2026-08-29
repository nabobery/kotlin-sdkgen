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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-pinned/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-pinned/properties/action
 */
@Serializable(with = InlineWebhookDiscussionPinnedActionXee0d50f6.Serializer::class)
public sealed class InlineWebhookDiscussionPinnedActionXee0d50f6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pinned`.
   */
  public data object Pinned : InlineWebhookDiscussionPinnedActionXee0d50f6() {
    public override val `value`: String = "pinned"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDiscussionPinnedActionXee0d50f6()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDiscussionPinnedActionXee0d50f6 = when (value) {
      Pinned.value -> Pinned
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDiscussionPinnedActionXee0d50f6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDiscussionPinnedActionXee0d50f6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDiscussionPinnedActionXee0d50f6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDiscussionPinnedActionXee0d50f6) {
      encoder.encodeString(value.value)
    }
  }
}
