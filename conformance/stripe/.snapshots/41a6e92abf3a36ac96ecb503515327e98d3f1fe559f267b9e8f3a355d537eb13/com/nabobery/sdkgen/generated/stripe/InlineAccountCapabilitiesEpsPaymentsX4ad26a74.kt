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
 * The status of the EPS payments capability of the account, or whether the account can directly process EPS charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/eps_payments
 */
@Serializable(with = InlineAccountCapabilitiesEpsPaymentsX4ad26a74.Serializer::class)
public sealed class InlineAccountCapabilitiesEpsPaymentsX4ad26a74 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesEpsPaymentsX4ad26a74() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesEpsPaymentsX4ad26a74() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesEpsPaymentsX4ad26a74() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesEpsPaymentsX4ad26a74()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesEpsPaymentsX4ad26a74 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountCapabilitiesEpsPaymentsX4ad26a74> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesEpsPaymentsX4ad26a74", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesEpsPaymentsX4ad26a74 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesEpsPaymentsX4ad26a74) {
      encoder.encodeString(value.value)
    }
  }
}
