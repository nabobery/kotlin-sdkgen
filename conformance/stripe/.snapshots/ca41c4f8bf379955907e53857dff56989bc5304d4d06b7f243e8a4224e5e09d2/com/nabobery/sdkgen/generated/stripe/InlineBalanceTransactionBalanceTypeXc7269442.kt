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
 * The balance that this transaction impacts.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/balance_transaction/properties/balance_type
 */
@Serializable(with = InlineBalanceTransactionBalanceTypeXc7269442.Serializer::class)
public sealed class InlineBalanceTransactionBalanceTypeXc7269442 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `issuing`.
   */
  public data object Issuing : InlineBalanceTransactionBalanceTypeXc7269442() {
    public override val `value`: String = "issuing"
  }

  /**
   * Documented value. Wire value: `payments`.
   */
  public data object Payments : InlineBalanceTransactionBalanceTypeXc7269442() {
    public override val `value`: String = "payments"
  }

  /**
   * Documented value. Wire value: `refund_and_dispute_prefunding`.
   */
  public data object RefundAndDisputePrefunding : InlineBalanceTransactionBalanceTypeXc7269442() {
    public override val `value`: String = "refund_and_dispute_prefunding"
  }

  /**
   * Documented value. Wire value: `risk_reserved`.
   */
  public data object RiskReserved : InlineBalanceTransactionBalanceTypeXc7269442() {
    public override val `value`: String = "risk_reserved"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBalanceTransactionBalanceTypeXc7269442()

  public companion object {
    public fun fromValue(`value`: String): InlineBalanceTransactionBalanceTypeXc7269442 = when (value) {
      Issuing.value -> Issuing
      Payments.value -> Payments
      RefundAndDisputePrefunding.value -> RefundAndDisputePrefunding
      RiskReserved.value -> RiskReserved
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBalanceTransactionBalanceTypeXc7269442> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBalanceTransactionBalanceTypeXc7269442", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBalanceTransactionBalanceTypeXc7269442 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBalanceTransactionBalanceTypeXc7269442) {
      encoder.encodeString(value.value)
    }
  }
}
