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
 * The type of the pricing details.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_pricing_pricing/properties/type
 */
@Serializable(with = InlineBillingBillResourceInvoicingPricingPricingTypeX8164aff2.Serializer::class)
public sealed class InlineBillingBillResourceInvoicingPricingPricingTypeX8164aff2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `price_details`.
   */
  public data object PriceDetails : InlineBillingBillResourceInvoicingPricingPricingTypeX8164aff2() {
    public override val `value`: String = "price_details"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingBillResourceInvoicingPricingPricingTypeX8164aff2()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingBillResourceInvoicingPricingPricingTypeX8164aff2 = when (value) {
      PriceDetails.value -> PriceDetails
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineBillingBillResourceInvoicingPricingPricingTypeX8164aff2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBillingBillResourceInvoicingPricingPricingTypeX8164aff2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingBillResourceInvoicingPricingPricingTypeX8164aff2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingBillResourceInvoicingPricingPricingTypeX8164aff2) {
      encoder.encodeString(value.value)
    }
  }
}
