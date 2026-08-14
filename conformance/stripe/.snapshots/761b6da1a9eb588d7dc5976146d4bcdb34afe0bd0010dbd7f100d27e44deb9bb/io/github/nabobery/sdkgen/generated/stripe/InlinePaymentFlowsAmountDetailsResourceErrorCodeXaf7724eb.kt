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
 * The code of the error that occurred when validating the current amount details.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_flows_amount_details_resource_error/properties/code
 */
@Serializable(with = InlinePaymentFlowsAmountDetailsResourceErrorCodeXaf7724eb.Serializer::class)
public sealed class InlinePaymentFlowsAmountDetailsResourceErrorCodeXaf7724eb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `amount_details_amount_mismatch`.
   */
  public data object AmountDetailsAmountMismatch : InlinePaymentFlowsAmountDetailsResourceErrorCodeXaf7724eb() {
    public override val `value`: String = "amount_details_amount_mismatch"
  }

  /**
   * Documented value. Wire value: `amount_details_tax_shipping_discount_greater_than_amount`.
   */
  public data object AmountDetailsTaxShippingDiscountGreaterThanAmount : InlinePaymentFlowsAmountDetailsResourceErrorCodeXaf7724eb() {
    public override val `value`: String = "amount_details_tax_shipping_discount_greater_than_amount"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentFlowsAmountDetailsResourceErrorCodeXaf7724eb()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentFlowsAmountDetailsResourceErrorCodeXaf7724eb = when (value) {
      AmountDetailsAmountMismatch.value -> AmountDetailsAmountMismatch
      AmountDetailsTaxShippingDiscountGreaterThanAmount.value -> AmountDetailsTaxShippingDiscountGreaterThanAmount
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentFlowsAmountDetailsResourceErrorCodeXaf7724eb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentFlowsAmountDetailsResourceErrorCodeXaf7724eb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentFlowsAmountDetailsResourceErrorCodeXaf7724eb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentFlowsAmountDetailsResourceErrorCodeXaf7724eb) {
      encoder.encodeString(value.value)
    }
  }
}
