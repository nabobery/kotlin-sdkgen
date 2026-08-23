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
 * Describes how to compute the price per period. Either `per_unit` or `tiered`. `per_unit` indicates that the fixed
 * amount (specified in `amount`) will be charged per unit in `quantity` (for plans with `usage_type=licensed`), or per
 * unit of total usage (for plans with `usage_type=metered`). `tiered` indicates that the unit pricing will be computed
 * using a tiering strategy as defined using the `tiers` and `tiers_mode` attributes.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/plan/properties/billing_scheme
 */
@Serializable(with = InlinePlanBillingSchemeX6d8a7e86.Serializer::class)
public sealed class InlinePlanBillingSchemeX6d8a7e86 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `per_unit`.
   */
  public data object PerUnit : InlinePlanBillingSchemeX6d8a7e86() {
    public override val `value`: String = "per_unit"
  }

  /**
   * Documented value. Wire value: `tiered`.
   */
  public data object Tiered : InlinePlanBillingSchemeX6d8a7e86() {
    public override val `value`: String = "tiered"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePlanBillingSchemeX6d8a7e86()

  public companion object {
    public fun fromValue(`value`: String): InlinePlanBillingSchemeX6d8a7e86 = when (value) {
      PerUnit.value -> PerUnit
      Tiered.value -> Tiered
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePlanBillingSchemeX6d8a7e86> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePlanBillingSchemeX6d8a7e86", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePlanBillingSchemeX6d8a7e86 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePlanBillingSchemeX6d8a7e86) {
      encoder.encodeString(value.value)
    }
  }
}
