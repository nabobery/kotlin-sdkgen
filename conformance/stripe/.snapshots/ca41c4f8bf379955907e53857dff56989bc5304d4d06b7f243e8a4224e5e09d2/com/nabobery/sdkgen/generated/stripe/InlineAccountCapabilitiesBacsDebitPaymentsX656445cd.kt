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
 * The status of the Bacs Direct Debits payments capability of the account, or whether the account can directly process
 * Bacs Direct Debits charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/bacs_debit_payments
 */
@Serializable(with = InlineAccountCapabilitiesBacsDebitPaymentsX656445cd.Serializer::class)
public sealed class InlineAccountCapabilitiesBacsDebitPaymentsX656445cd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesBacsDebitPaymentsX656445cd() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesBacsDebitPaymentsX656445cd() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesBacsDebitPaymentsX656445cd() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesBacsDebitPaymentsX656445cd()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesBacsDebitPaymentsX656445cd = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesBacsDebitPaymentsX656445cd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesBacsDebitPaymentsX656445cd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesBacsDebitPaymentsX656445cd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesBacsDebitPaymentsX656445cd) {
      encoder.encodeString(value.value)
    }
  }
}
