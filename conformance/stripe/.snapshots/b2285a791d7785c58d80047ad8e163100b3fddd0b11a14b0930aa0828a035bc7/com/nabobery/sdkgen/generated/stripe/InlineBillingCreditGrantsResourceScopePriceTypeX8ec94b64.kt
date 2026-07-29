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
 * The price type that credit grants can apply to. We currently only support the `metered` price type. This refers to
 * prices that have a [Billing Meter](https://docs.stripe.com/api/billing/meter) attached to them. Cannot be used in
 * combination with `prices`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_credit_grants_resource_scope/properties/price_type
 */
@Serializable(with = InlineBillingCreditGrantsResourceScopePriceTypeX8ec94b64.Serializer::class)
public sealed class InlineBillingCreditGrantsResourceScopePriceTypeX8ec94b64 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `metered`.
   */
  public data object Metered : InlineBillingCreditGrantsResourceScopePriceTypeX8ec94b64() {
    public override val `value`: String = "metered"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingCreditGrantsResourceScopePriceTypeX8ec94b64()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingCreditGrantsResourceScopePriceTypeX8ec94b64 = when (value) {
      Metered.value -> Metered
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineBillingCreditGrantsResourceScopePriceTypeX8ec94b64> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBillingCreditGrantsResourceScopePriceTypeX8ec94b64", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingCreditGrantsResourceScopePriceTypeX8ec94b64 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingCreditGrantsResourceScopePriceTypeX8ec94b64) {
      encoder.encodeString(value.value)
    }
  }
}
