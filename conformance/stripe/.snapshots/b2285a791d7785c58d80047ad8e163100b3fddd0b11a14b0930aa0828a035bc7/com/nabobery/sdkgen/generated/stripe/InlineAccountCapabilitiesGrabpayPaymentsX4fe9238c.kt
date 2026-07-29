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
 * The status of the GrabPay payments capability of the account, or whether the account can directly process GrabPay
 * charges.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities/properties/grabpay_payments
 */
@Serializable(with = InlineAccountCapabilitiesGrabpayPaymentsX4fe9238c.Serializer::class)
public sealed class InlineAccountCapabilitiesGrabpayPaymentsX4fe9238c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineAccountCapabilitiesGrabpayPaymentsX4fe9238c() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineAccountCapabilitiesGrabpayPaymentsX4fe9238c() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineAccountCapabilitiesGrabpayPaymentsX4fe9238c() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountCapabilitiesGrabpayPaymentsX4fe9238c()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountCapabilitiesGrabpayPaymentsX4fe9238c = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountCapabilitiesGrabpayPaymentsX4fe9238c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountCapabilitiesGrabpayPaymentsX4fe9238c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountCapabilitiesGrabpayPaymentsX4fe9238c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountCapabilitiesGrabpayPaymentsX4fe9238c) {
      encoder.encodeString(value.value)
    }
  }
}
