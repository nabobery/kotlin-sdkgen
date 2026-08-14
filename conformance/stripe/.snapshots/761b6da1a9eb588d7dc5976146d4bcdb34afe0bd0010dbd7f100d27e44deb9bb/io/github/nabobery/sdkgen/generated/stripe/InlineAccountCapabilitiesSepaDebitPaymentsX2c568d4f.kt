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
 * The status of the SEPA Direct Debits payments capability of the account, or whether the account can directly process
 * SEPA Direct Debits charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/sepa_debit_payments
 */
@Serializable(with = InlineAccountCapabilitiesSepaDebitPaymentsX2c568d4f.Serializer::class)
public sealed class InlineAccountCapabilitiesSepaDebitPaymentsX2c568d4f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesSepaDebitPaymentsX2c568d4f() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesSepaDebitPaymentsX2c568d4f() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesSepaDebitPaymentsX2c568d4f() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesSepaDebitPaymentsX2c568d4f()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesSepaDebitPaymentsX2c568d4f = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesSepaDebitPaymentsX2c568d4f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesSepaDebitPaymentsX2c568d4f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesSepaDebitPaymentsX2c568d4f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesSepaDebitPaymentsX2c568d4f) {
      encoder.encodeString(value.value)
    }
  }
}
