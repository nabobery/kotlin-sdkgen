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
 * The status of the Mexican customer_balance payments (MXN currency) capability of the account, or whether the account
 * can directly process Mexican customer_balance charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/mx_bank_transfer_payments
 */
@Serializable(with = InlineAccountCapabilitiesMxBankTransferPaymentsX2a9ab982.Serializer::class)
public sealed class InlineAccountCapabilitiesMxBankTransferPaymentsX2a9ab982 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesMxBankTransferPaymentsX2a9ab982() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesMxBankTransferPaymentsX2a9ab982() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesMxBankTransferPaymentsX2a9ab982() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesMxBankTransferPaymentsX2a9ab982()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesMxBankTransferPaymentsX2a9ab982 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesMxBankTransferPaymentsX2a9ab982> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesMxBankTransferPaymentsX2a9ab982", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesMxBankTransferPaymentsX2a9ab982 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesMxBankTransferPaymentsX2a9ab982) {
      encoder.encodeString(value.value)
    }
  }
}
