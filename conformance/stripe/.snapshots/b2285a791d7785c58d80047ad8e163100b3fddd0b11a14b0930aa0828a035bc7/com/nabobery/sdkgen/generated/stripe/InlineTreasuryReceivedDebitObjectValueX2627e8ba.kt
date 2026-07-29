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
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.received_debit/properties/object
 */
@Serializable(with = InlineTreasuryReceivedDebitObjectValueX2627e8ba.Serializer::class)
public sealed class InlineTreasuryReceivedDebitObjectValueX2627e8ba {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `treasury.received_debit`.
   */
  public data object TreasuryReceivedDebit : InlineTreasuryReceivedDebitObjectValueX2627e8ba() {
    public override val `value`: String = "treasury.received_debit"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryReceivedDebitObjectValueX2627e8ba()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryReceivedDebitObjectValueX2627e8ba = when (value) {
      TreasuryReceivedDebit.value -> TreasuryReceivedDebit
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTreasuryReceivedDebitObjectValueX2627e8ba> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryReceivedDebitObjectValueX2627e8ba", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryReceivedDebitObjectValueX2627e8ba = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryReceivedDebitObjectValueX2627e8ba) {
      encoder.encodeString(value.value)
    }
  }
}
