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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-milestone-edited/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-milestone-edited/properties/action
 */
@Serializable(with = InlineWebhookMilestoneEditedActionX30373da6.Serializer::class)
public sealed class InlineWebhookMilestoneEditedActionX30373da6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `edited`.
   */
  public data object Edited : InlineWebhookMilestoneEditedActionX30373da6() {
    public override val `value`: String = "edited"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMilestoneEditedActionX30373da6()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMilestoneEditedActionX30373da6 = when (value) {
      Edited.value -> Edited
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookMilestoneEditedActionX30373da6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookMilestoneEditedActionX30373da6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMilestoneEditedActionX30373da6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMilestoneEditedActionX30373da6) {
      encoder.encodeString(value.value)
    }
  }
}
