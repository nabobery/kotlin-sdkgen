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
 * The status of the SamsungPay capability of the account, or whether the account can directly process SamsungPay
 * payments.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/samsung_pay_payments
 */
@Serializable(with = InlineAccountCapabilitiesSamsungPayPaymentsXe41ba902.Serializer::class)
public sealed class InlineAccountCapabilitiesSamsungPayPaymentsXe41ba902 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesSamsungPayPaymentsXe41ba902() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesSamsungPayPaymentsXe41ba902() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesSamsungPayPaymentsXe41ba902() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesSamsungPayPaymentsXe41ba902()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesSamsungPayPaymentsXe41ba902 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountCapabilitiesSamsungPayPaymentsXe41ba902> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesSamsungPayPaymentsXe41ba902", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesSamsungPayPaymentsXe41ba902 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesSamsungPayPaymentsXe41ba902) {
      encoder.encodeString(value.value)
    }
  }
}
