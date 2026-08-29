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
 * amount (specified in `unit_amount` or `unit_amount_decimal`) will be charged per unit in `quantity` (for prices with
 * `usage_type=licensed`), or per unit of total usage (for prices with `usage_type=metered`). `tiered` indicates that
 * the unit pricing will be computed using a tiering strategy as defined using the `tiers` and `tiers_mode` attributes.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/price/properties/billing_scheme
 */
@Serializable(with = InlinePriceBillingSchemeXc4ec9d28.Serializer::class)
public sealed class InlinePriceBillingSchemeXc4ec9d28 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `per_unit`.
   */
  public data object PerUnit : InlinePriceBillingSchemeXc4ec9d28() {
    public override val `value`: String = "per_unit"
  }

  /**
   * Documented value. Wire value: `tiered`.
   */
  public data object Tiered : InlinePriceBillingSchemeXc4ec9d28() {
    public override val `value`: String = "tiered"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePriceBillingSchemeXc4ec9d28()

  public companion object {
    public fun fromValue(`value`: String): InlinePriceBillingSchemeXc4ec9d28 = when (value) {
      PerUnit.value -> PerUnit
      Tiered.value -> Tiered
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePriceBillingSchemeXc4ec9d28> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePriceBillingSchemeXc4ec9d28", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePriceBillingSchemeXc4ec9d28 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePriceBillingSchemeXc4ec9d28) {
      encoder.encodeString(value.value)
    }
  }
}
