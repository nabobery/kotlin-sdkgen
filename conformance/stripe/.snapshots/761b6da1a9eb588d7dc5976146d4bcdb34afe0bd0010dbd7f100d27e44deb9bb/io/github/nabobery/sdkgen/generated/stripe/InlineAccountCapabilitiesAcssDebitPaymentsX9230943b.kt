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
 * The status of the Canadian pre-authorized debits payments capability of the account, or whether the account can
 * directly process Canadian pre-authorized debits charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/acss_debit_payments
 */
@Serializable(with = InlineAccountCapabilitiesAcssDebitPaymentsX9230943b.Serializer::class)
public sealed class InlineAccountCapabilitiesAcssDebitPaymentsX9230943b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesAcssDebitPaymentsX9230943b() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesAcssDebitPaymentsX9230943b() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesAcssDebitPaymentsX9230943b() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesAcssDebitPaymentsX9230943b()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesAcssDebitPaymentsX9230943b = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesAcssDebitPaymentsX9230943b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesAcssDebitPaymentsX9230943b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesAcssDebitPaymentsX9230943b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesAcssDebitPaymentsX9230943b) {
      encoder.encodeString(value.value)
    }
  }
}
