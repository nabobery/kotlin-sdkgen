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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-milestone-opened/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-milestone-opened/properties/action
 */
@Serializable(with = InlineWebhookMilestoneOpenedActionX01462efb.Serializer::class)
public sealed class InlineWebhookMilestoneOpenedActionX01462efb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `opened`.
   */
  public data object Opened : InlineWebhookMilestoneOpenedActionX01462efb() {
    public override val `value`: String = "opened"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookMilestoneOpenedActionX01462efb()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookMilestoneOpenedActionX01462efb = when (value) {
      Opened.value -> Opened
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookMilestoneOpenedActionX01462efb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookMilestoneOpenedActionX01462efb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookMilestoneOpenedActionX01462efb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMilestoneOpenedActionX01462efb) {
      encoder.encodeString(value.value)
    }
  }
}
