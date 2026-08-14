package io.github.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/automatic_tax/properties/disabled_reason
 */
@Serializable(with = InlineAutomaticTaxDisabledReasonXdaa0977e.Serializer::class)
public sealed class InlineAutomaticTaxDisabledReasonXdaa0977e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `finalization_requires_location_inputs`.
   */
  public data object FinalizationRequiresLocationInputs : InlineAutomaticTaxDisabledReasonXdaa0977e() {
    public override val `value`: String = "finalization_requires_location_inputs"
  }

  /**
   * Documented value. Wire value: `finalization_system_error`.
   */
  public data object FinalizationSystemError : InlineAutomaticTaxDisabledReasonXdaa0977e() {
    public override val `value`: String = "finalization_system_error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAutomaticTaxDisabledReasonXdaa0977e()

  public companion object {
    public fun fromValue(`value`: String): InlineAutomaticTaxDisabledReasonXdaa0977e = when (value) {
      FinalizationRequiresLocationInputs.value -> FinalizationRequiresLocationInputs
      FinalizationSystemError.value -> FinalizationSystemError
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAutomaticTaxDisabledReasonXdaa0977e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineAutomaticTaxDisabledReasonXdaa0977e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAutomaticTaxDisabledReasonXdaa0977e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAutomaticTaxDisabledReasonXdaa0977e) {
      encoder.encodeString(value.value)
    }
  }
}
