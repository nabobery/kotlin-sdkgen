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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_cost/anyOf/0/properties/shipping_rate_data/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_cost/anyOf/0/properties/shipping_rate_data/properties/type
 */
@Serializable(with = InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataTypeX258b19c4.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataTypeX258b19c4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fixed_amount`.
   */
  public data object FixedAmount : InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataTypeX258b19c4() {
    public override val `value`: String = "fixed_amount"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataTypeX258b19c4()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataTypeX258b19c4 = when (value) {
      FixedAmount.value -> FixedAmount
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataTypeX258b19c4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataTypeX258b19c4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataTypeX258b19c4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataTypeX258b19c4) {
      encoder.encodeString(value.value)
    }
  }
}
