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
 * The customer’s tax exempt status after a completed Checkout Session.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_customer_details/properties/tax_exemp
 * t
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionCustomerDetailsTaxExemptX0d80dad5.Serializer::class)
public sealed class InlinePaymentPagesCheckoutSessionCustomerDetailsTaxExemptX0d80dad5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `exempt`.
   */
  public data object Exempt : InlinePaymentPagesCheckoutSessionCustomerDetailsTaxExemptX0d80dad5() {
    public override val `value`: String = "exempt"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlinePaymentPagesCheckoutSessionCustomerDetailsTaxExemptX0d80dad5() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `reverse`.
   */
  public data object Reverse : InlinePaymentPagesCheckoutSessionCustomerDetailsTaxExemptX0d80dad5() {
    public override val `value`: String = "reverse"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentPagesCheckoutSessionCustomerDetailsTaxExemptX0d80dad5()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentPagesCheckoutSessionCustomerDetailsTaxExemptX0d80dad5 = when (value) {
      Exempt.value -> Exempt
      None.value -> None
      Reverse.value -> Reverse
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionCustomerDetailsTaxExemptX0d80dad5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentPagesCheckoutSessionCustomerDetailsTaxExemptX0d80dad5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionCustomerDetailsTaxExemptX0d80dad5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionCustomerDetailsTaxExemptX0d80dad5) {
      encoder.encodeString(value.value)
    }
  }
}
