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
 * The status of the New Zealand BECS Direct Debit payments capability of the account, or whether the account can
 * directly process New Zealand BECS Direct Debit charges.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/nz_bank_account_becs_debit_payments
 */
@Serializable(with = InlineAccountCapabilitiesNzBankAccountBecsDebitPaymentsX3e997848.Serializer::class)
public sealed class InlineAccountCapabilitiesNzBankAccountBecsDebitPaymentsX3e997848 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesNzBankAccountBecsDebitPaymentsX3e997848() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesNzBankAccountBecsDebitPaymentsX3e997848() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesNzBankAccountBecsDebitPaymentsX3e997848() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesNzBankAccountBecsDebitPaymentsX3e997848()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesNzBankAccountBecsDebitPaymentsX3e997848 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesNzBankAccountBecsDebitPaymentsX3e997848> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesNzBankAccountBecsDebitPaymentsX3e997848", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesNzBankAccountBecsDebitPaymentsX3e997848 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesNzBankAccountBecsDebitPaymentsX3e997848) {
      encoder.encodeString(value.value)
    }
  }
}
