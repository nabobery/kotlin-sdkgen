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
 * The bank transfer type that this PaymentIntent is allowed to use for funding Permitted values include:
 * `eu_bank_transfer`, `gb_bank_transfer`, `jp_bank_transfer`, `mx_bank_transfer`, or `us_bank_transfer`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/checkout_customer_balance_bank_transfer_payment_method_options/prope
 * rties/type
 */
@Serializable(with = InlineCheckoutCustomerBalanceBankTransferPaymentMethodOptionsTypeX92b83e1e.Serializer::class)
public sealed class InlineCheckoutCustomerBalanceBankTransferPaymentMethodOptionsTypeX92b83e1e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `eu_bank_transfer`.
   */
  public data object EuBankTransfer : InlineCheckoutCustomerBalanceBankTransferPaymentMethodOptionsTypeX92b83e1e() {
    public override val `value`: String = "eu_bank_transfer"
  }

  /**
   * Documented value. Wire value: `gb_bank_transfer`.
   */
  public data object GbBankTransfer : InlineCheckoutCustomerBalanceBankTransferPaymentMethodOptionsTypeX92b83e1e() {
    public override val `value`: String = "gb_bank_transfer"
  }

  /**
   * Documented value. Wire value: `jp_bank_transfer`.
   */
  public data object JpBankTransfer : InlineCheckoutCustomerBalanceBankTransferPaymentMethodOptionsTypeX92b83e1e() {
    public override val `value`: String = "jp_bank_transfer"
  }

  /**
   * Documented value. Wire value: `mx_bank_transfer`.
   */
  public data object MxBankTransfer : InlineCheckoutCustomerBalanceBankTransferPaymentMethodOptionsTypeX92b83e1e() {
    public override val `value`: String = "mx_bank_transfer"
  }

  /**
   * Documented value. Wire value: `us_bank_transfer`.
   */
  public data object UsBankTransfer : InlineCheckoutCustomerBalanceBankTransferPaymentMethodOptionsTypeX92b83e1e() {
    public override val `value`: String = "us_bank_transfer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutCustomerBalanceBankTransferPaymentMethodOptionsTypeX92b83e1e()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutCustomerBalanceBankTransferPaymentMethodOptionsTypeX92b83e1e = when (value) {
      EuBankTransfer.value -> EuBankTransfer
      GbBankTransfer.value -> GbBankTransfer
      JpBankTransfer.value -> JpBankTransfer
      MxBankTransfer.value -> MxBankTransfer
      UsBankTransfer.value -> UsBankTransfer
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCheckoutCustomerBalanceBankTransferPaymentMethodOptionsTypeX92b83e1e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutCustomerBalanceBankTransferPaymentMethodOptionsTypeX92b83e1e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutCustomerBalanceBankTransferPaymentMethodOptionsTypeX92b83e1e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutCustomerBalanceBankTransferPaymentMethodOptionsTypeX92b83e1e) {
      encoder.encodeString(value.value)
    }
  }
}
