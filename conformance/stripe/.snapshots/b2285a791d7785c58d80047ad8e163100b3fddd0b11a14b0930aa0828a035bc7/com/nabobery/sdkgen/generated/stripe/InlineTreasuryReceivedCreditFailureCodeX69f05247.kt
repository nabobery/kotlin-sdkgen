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
 * Reason for the failure. A ReceivedCredit might fail because the receiving FinancialAccount is closed or frozen.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.received_credit/properties/failure_code
 */
@Serializable(with = InlineTreasuryReceivedCreditFailureCodeX69f05247.Serializer::class)
public sealed class InlineTreasuryReceivedCreditFailureCodeX69f05247 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account_closed`.
   */
  public data object AccountClosed : InlineTreasuryReceivedCreditFailureCodeX69f05247() {
    public override val `value`: String = "account_closed"
  }

  /**
   * Documented value. Wire value: `account_frozen`.
   */
  public data object AccountFrozen : InlineTreasuryReceivedCreditFailureCodeX69f05247() {
    public override val `value`: String = "account_frozen"
  }

  /**
   * Documented value. Wire value: `international_transaction`.
   */
  public data object InternationalTransaction : InlineTreasuryReceivedCreditFailureCodeX69f05247() {
    public override val `value`: String = "international_transaction"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineTreasuryReceivedCreditFailureCodeX69f05247() {
    public override val `value`: String = "other"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryReceivedCreditFailureCodeX69f05247()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryReceivedCreditFailureCodeX69f05247 = when (value) {
      AccountClosed.value -> AccountClosed
      AccountFrozen.value -> AccountFrozen
      InternationalTransaction.value -> InternationalTransaction
      Other.value -> Other
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTreasuryReceivedCreditFailureCodeX69f05247> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryReceivedCreditFailureCodeX69f05247", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryReceivedCreditFailureCodeX69f05247 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryReceivedCreditFailureCodeX69f05247) {
      encoder.encodeString(value.value)
    }
  }
}
