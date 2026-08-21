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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-labeled/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-labeled/properties/action
 */
@Serializable(with = InlineWebhookDiscussionLabeledActionX7adc75a0.Serializer::class)
public sealed class InlineWebhookDiscussionLabeledActionX7adc75a0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `labeled`.
   */
  public data object Labeled : InlineWebhookDiscussionLabeledActionX7adc75a0() {
    public override val `value`: String = "labeled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookDiscussionLabeledActionX7adc75a0()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookDiscussionLabeledActionX7adc75a0 = when (value) {
      Labeled.value -> Labeled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookDiscussionLabeledActionX7adc75a0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookDiscussionLabeledActionX7adc75a0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookDiscussionLabeledActionX7adc75a0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDiscussionLabeledActionX7adc75a0) {
      encoder.encodeString(value.value)
    }
  }
}
