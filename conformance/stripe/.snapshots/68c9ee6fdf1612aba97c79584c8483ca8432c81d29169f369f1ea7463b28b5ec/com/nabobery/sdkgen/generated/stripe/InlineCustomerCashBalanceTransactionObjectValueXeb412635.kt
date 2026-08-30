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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_cash_balance_transaction/properties/object
 */
@Serializable(with = InlineCustomerCashBalanceTransactionObjectValueXeb412635.Serializer::class)
public sealed class InlineCustomerCashBalanceTransactionObjectValueXeb412635 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `customer_cash_balance_transaction`.
   */
  public data object CustomerCashBalanceTransaction : InlineCustomerCashBalanceTransactionObjectValueXeb412635() {
    public override val `value`: String = "customer_cash_balance_transaction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomerCashBalanceTransactionObjectValueXeb412635()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomerCashBalanceTransactionObjectValueXeb412635 = when (value) {
      CustomerCashBalanceTransaction.value -> CustomerCashBalanceTransaction
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerCashBalanceTransactionObjectValueXeb412635> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCustomerCashBalanceTransactionObjectValueXeb412635", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomerCashBalanceTransactionObjectValueXeb412635 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomerCashBalanceTransactionObjectValueXeb412635) {
      encoder.encodeString(value.value)
    }
  }
}
