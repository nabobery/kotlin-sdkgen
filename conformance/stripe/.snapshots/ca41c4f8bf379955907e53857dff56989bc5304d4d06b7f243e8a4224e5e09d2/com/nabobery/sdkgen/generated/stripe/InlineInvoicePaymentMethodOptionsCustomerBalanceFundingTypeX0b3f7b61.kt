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
 * The funding method type to be used when there are not enough funds in the customer balance. Permitted values include:
 * `bank_transfer`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_customer_balance/properties/funding_t
 * ype
 */
@Serializable(with = InlineInvoicePaymentMethodOptionsCustomerBalanceFundingTypeX0b3f7b61.Serializer::class)
public sealed class InlineInvoicePaymentMethodOptionsCustomerBalanceFundingTypeX0b3f7b61 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bank_transfer`.
   */
  public data object BankTransfer : InlineInvoicePaymentMethodOptionsCustomerBalanceFundingTypeX0b3f7b61() {
    public override val `value`: String = "bank_transfer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInvoicePaymentMethodOptionsCustomerBalanceFundingTypeX0b3f7b61()

  public companion object {
    public fun fromValue(`value`: String): InlineInvoicePaymentMethodOptionsCustomerBalanceFundingTypeX0b3f7b61 = when (value) {
      BankTransfer.value -> BankTransfer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInvoicePaymentMethodOptionsCustomerBalanceFundingTypeX0b3f7b61> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInvoicePaymentMethodOptionsCustomerBalanceFundingTypeX0b3f7b61", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInvoicePaymentMethodOptionsCustomerBalanceFundingTypeX0b3f7b61 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInvoicePaymentMethodOptionsCustomerBalanceFundingTypeX0b3f7b61) {
      encoder.encodeString(value.value)
    }
  }
}
