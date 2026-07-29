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
 * The status of the `app_distribution` capability of the account, or whether the platform can distribute apps to other
 * accounts.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/app_distribution
 */
@Serializable(with = InlineAccountCapabilitiesAppDistributionX29b556d0.Serializer::class)
public sealed class InlineAccountCapabilitiesAppDistributionX29b556d0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesAppDistributionX29b556d0() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesAppDistributionX29b556d0() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesAppDistributionX29b556d0() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesAppDistributionX29b556d0()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesAppDistributionX29b556d0 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountCapabilitiesAppDistributionX29b556d0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesAppDistributionX29b556d0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesAppDistributionX29b556d0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesAppDistributionX29b556d0) {
      encoder.encodeString(value.value)
    }
  }
}
