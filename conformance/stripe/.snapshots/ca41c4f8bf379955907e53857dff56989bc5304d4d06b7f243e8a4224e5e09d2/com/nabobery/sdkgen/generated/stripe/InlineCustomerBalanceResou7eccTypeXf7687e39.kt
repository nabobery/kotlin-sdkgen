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
 * The funding method type used to fund the customer balance. Permitted values include: `eu_bank_transfer`,
 * `gb_bank_transfer`, `jp_bank_transfer`, `mx_bank_transfer`, or `us_bank_transfer`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/customer_balance_resource_cash_balance_transaction_resource_funded_t
 * ransaction_resource_bank_transfer/properties/type
 */
@Serializable(with = InlineCustomerBalanceResou7eccTypeXf7687e39.Serializer::class)
public sealed class InlineCustomerBalanceResou7eccTypeXf7687e39 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `eu_bank_transfer`.
   */
  public data object EuBankTransfer : InlineCustomerBalanceResou7eccTypeXf7687e39() {
    public override val `value`: String = "eu_bank_transfer"
  }

  /**
   * Documented value. Wire value: `gb_bank_transfer`.
   */
  public data object GbBankTransfer : InlineCustomerBalanceResou7eccTypeXf7687e39() {
    public override val `value`: String = "gb_bank_transfer"
  }

  /**
   * Documented value. Wire value: `jp_bank_transfer`.
   */
  public data object JpBankTransfer : InlineCustomerBalanceResou7eccTypeXf7687e39() {
    public override val `value`: String = "jp_bank_transfer"
  }

  /**
   * Documented value. Wire value: `mx_bank_transfer`.
   */
  public data object MxBankTransfer : InlineCustomerBalanceResou7eccTypeXf7687e39() {
    public override val `value`: String = "mx_bank_transfer"
  }

  /**
   * Documented value. Wire value: `us_bank_transfer`.
   */
  public data object UsBankTransfer : InlineCustomerBalanceResou7eccTypeXf7687e39() {
    public override val `value`: String = "us_bank_transfer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomerBalanceResou7eccTypeXf7687e39()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomerBalanceResou7eccTypeXf7687e39 = when (value) {
      EuBankTransfer.value -> EuBankTransfer
      GbBankTransfer.value -> GbBankTransfer
      JpBankTransfer.value -> JpBankTransfer
      MxBankTransfer.value -> MxBankTransfer
      UsBankTransfer.value -> UsBankTransfer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerBalanceResou7eccTypeXf7687e39> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCustomerBalanceResou7eccTypeXf7687e39", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomerBalanceResou7eccTypeXf7687e39 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomerBalanceResou7eccTypeXf7687e39) {
      encoder.encodeString(value.value)
    }
  }
}
