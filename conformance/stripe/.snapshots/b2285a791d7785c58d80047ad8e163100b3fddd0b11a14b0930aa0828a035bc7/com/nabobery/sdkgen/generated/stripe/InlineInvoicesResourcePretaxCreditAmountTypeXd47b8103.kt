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
 * Type of the pretax credit amount referenced.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_resource_pretax_credit_amount/properties/type
 */
@Serializable(with = InlineInvoicesResourcePretaxCreditAmountTypeXd47b8103.Serializer::class)
public sealed class InlineInvoicesResourcePretaxCreditAmountTypeXd47b8103 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `credit_balance_transaction`.
   */
  public data object CreditBalanceTransaction : InlineInvoicesResourcePretaxCreditAmountTypeXd47b8103() {
    public override val `value`: String = "credit_balance_transaction"
  }

  /**
   * Documented value. Wire value: `discount`.
   */
  public data object Discount : InlineInvoicesResourcePretaxCreditAmountTypeXd47b8103() {
    public override val `value`: String = "discount"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInvoicesResourcePretaxCreditAmountTypeXd47b8103()

  public companion object {
    public fun fromValue(`value`: String): InlineInvoicesResourcePretaxCreditAmountTypeXd47b8103 = when (value) {
      CreditBalanceTransaction.value -> CreditBalanceTransaction
      Discount.value -> Discount
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineInvoicesResourcePretaxCreditAmountTypeXd47b8103> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInvoicesResourcePretaxCreditAmountTypeXd47b8103", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInvoicesResourcePretaxCreditAmountTypeXd47b8103 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInvoicesResourcePretaxCreditAmountTypeXd47b8103) {
      encoder.encodeString(value.value)
    }
  }
}
