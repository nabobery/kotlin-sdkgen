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
 * The type of credit balance transaction (credit or debit).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.credit_balance_transaction/properties/type
 */
@Serializable(with = InlineBillingCreditBalanceTransactionTypeX43796971.Serializer::class)
public sealed class InlineBillingCreditBalanceTransactionTypeX43796971 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `credit`.
   */
  public data object Credit : InlineBillingCreditBalanceTransactionTypeX43796971() {
    public override val `value`: String = "credit"
  }

  /**
   * Documented value. Wire value: `debit`.
   */
  public data object Debit : InlineBillingCreditBalanceTransactionTypeX43796971() {
    public override val `value`: String = "debit"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBillingCreditBalanceTransactionTypeX43796971()

  public companion object {
    public fun fromValue(`value`: String): InlineBillingCreditBalanceTransactionTypeX43796971 = when (value) {
      Credit.value -> Credit
      Debit.value -> Debit
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBillingCreditBalanceTransactionTypeX43796971> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineBillingCreditBalanceTransactionTypeX43796971", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBillingCreditBalanceTransactionTypeX43796971 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBillingCreditBalanceTransactionTypeX43796971) {
      encoder.encodeString(value.value)
    }
  }
}
