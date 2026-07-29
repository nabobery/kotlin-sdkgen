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
 * The status of the upi payments capability of the account, or whether the account can directly process upi charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/upi_payments
 */
@Serializable(with = InlineAccountCapabilitiesUpiPaymentsXaa0dc75d.Serializer::class)
public sealed class InlineAccountCapabilitiesUpiPaymentsXaa0dc75d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesUpiPaymentsXaa0dc75d() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesUpiPaymentsXaa0dc75d() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesUpiPaymentsXaa0dc75d() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesUpiPaymentsXaa0dc75d()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesUpiPaymentsXaa0dc75d = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountCapabilitiesUpiPaymentsXaa0dc75d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesUpiPaymentsXaa0dc75d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesUpiPaymentsXaa0dc75d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesUpiPaymentsXaa0dc75d) {
      encoder.encodeString(value.value)
    }
  }
}
