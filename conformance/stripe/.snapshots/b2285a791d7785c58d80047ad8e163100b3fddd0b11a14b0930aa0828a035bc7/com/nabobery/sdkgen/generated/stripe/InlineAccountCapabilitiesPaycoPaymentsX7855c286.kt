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
 * The status of the Payco capability of the account, or whether the account can directly process Payco payments.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/payco_payments
 */
@Serializable(with = InlineAccountCapabilitiesPaycoPaymentsX7855c286.Serializer::class)
public sealed class InlineAccountCapabilitiesPaycoPaymentsX7855c286 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesPaycoPaymentsX7855c286() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesPaycoPaymentsX7855c286() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesPaycoPaymentsX7855c286() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesPaycoPaymentsX7855c286()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesPaycoPaymentsX7855c286 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountCapabilitiesPaycoPaymentsX7855c286> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesPaycoPaymentsX7855c286", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesPaycoPaymentsX7855c286 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesPaycoPaymentsX7855c286) {
      encoder.encodeString(value.value)
    }
  }
}
