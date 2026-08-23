package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * If Stripe disabled automatic tax, this enum describes why.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/schedules_phase_automatic_tax/properties/disabled_reason
 */
@Serializable(with = InlineSchedulesPhaseAutomaticTaxDisabledReasonX2a6b0e67.Serializer::class)
public sealed class InlineSchedulesPhaseAutomaticTaxDisabledReasonX2a6b0e67 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `requires_location_inputs`.
   */
  public data object RequiresLocationInputs : InlineSchedulesPhaseAutomaticTaxDisabledReasonX2a6b0e67() {
    public override val `value`: String = "requires_location_inputs"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSchedulesPhaseAutomaticTaxDisabledReasonX2a6b0e67()

  public companion object {
    public fun fromValue(`value`: String): InlineSchedulesPhaseAutomaticTaxDisabledReasonX2a6b0e67 = when (value) {
      RequiresLocationInputs.value -> RequiresLocationInputs
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSchedulesPhaseAutomaticTaxDisabledReasonX2a6b0e67> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSchedulesPhaseAutomaticTaxDisabledReasonX2a6b0e67", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSchedulesPhaseAutomaticTaxDisabledReasonX2a6b0e67 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSchedulesPhaseAutomaticTaxDisabledReasonX2a6b0e67) {
      encoder.encodeString(value.value)
    }
  }
}
