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
 * The status of the MB WAY payments capability of the account, or whether the account can directly process MB WAY
 * charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/mb_way_payments
 */
@Serializable(with = InlineAccountCapabilitiesMbWayPaymentsX82cdbce6.Serializer::class)
public sealed class InlineAccountCapabilitiesMbWayPaymentsX82cdbce6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesMbWayPaymentsX82cdbce6() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesMbWayPaymentsX82cdbce6() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesMbWayPaymentsX82cdbce6() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesMbWayPaymentsX82cdbce6()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesMbWayPaymentsX82cdbce6 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountCapabilitiesMbWayPaymentsX82cdbce6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesMbWayPaymentsX82cdbce6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesMbWayPaymentsX82cdbce6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesMbWayPaymentsX82cdbce6) {
      encoder.encodeString(value.value)
    }
  }
}
