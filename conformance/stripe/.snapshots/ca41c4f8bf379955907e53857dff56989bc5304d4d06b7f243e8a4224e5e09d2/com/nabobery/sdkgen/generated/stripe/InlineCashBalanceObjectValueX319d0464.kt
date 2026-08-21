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
 * Source: sdkgen://source/openapi.json#/components/schemas/cash_balance/properties/object
 */
@Serializable(with = InlineCashBalanceObjectValueX319d0464.Serializer::class)
public sealed class InlineCashBalanceObjectValueX319d0464 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cash_balance`.
   */
  public data object CashBalance : InlineCashBalanceObjectValueX319d0464() {
    public override val `value`: String = "cash_balance"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCashBalanceObjectValueX319d0464()

  public companion object {
    public fun fromValue(`value`: String): InlineCashBalanceObjectValueX319d0464 = when (value) {
      CashBalance.value -> CashBalance
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCashBalanceObjectValueX319d0464> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCashBalanceObjectValueX319d0464", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCashBalanceObjectValueX319d0464 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCashBalanceObjectValueX319d0464) {
      encoder.encodeString(value.value)
    }
  }
}
