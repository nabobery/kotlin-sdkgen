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
 * The status of the Sunbit capability of the account, or whether the account can directly process Sunbit payments.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/sunbit_payments
 */
@Serializable(with = InlineAccountCapabilitiesSunbitPaymentsX2f50af72.Serializer::class)
public sealed class InlineAccountCapabilitiesSunbitPaymentsX2f50af72 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesSunbitPaymentsX2f50af72() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesSunbitPaymentsX2f50af72() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesSunbitPaymentsX2f50af72() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesSunbitPaymentsX2f50af72()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesSunbitPaymentsX2f50af72 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountCapabilitiesSunbitPaymentsX2f50af72> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesSunbitPaymentsX2f50af72", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesSunbitPaymentsX2f50af72 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesSunbitPaymentsX2f50af72) {
      encoder.encodeString(value.value)
    }
  }
}
