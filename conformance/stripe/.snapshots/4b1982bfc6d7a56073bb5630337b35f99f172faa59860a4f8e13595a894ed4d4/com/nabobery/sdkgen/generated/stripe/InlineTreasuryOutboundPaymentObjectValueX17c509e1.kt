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
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.outbound_payment/properties/object
 */
@Serializable(with = InlineTreasuryOutboundPaymentObjectValueX17c509e1.Serializer::class)
public sealed class InlineTreasuryOutboundPaymentObjectValueX17c509e1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `treasury.outbound_payment`.
   */
  public data object TreasuryOutboundPayment : InlineTreasuryOutboundPaymentObjectValueX17c509e1() {
    public override val `value`: String = "treasury.outbound_payment"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryOutboundPaymentObjectValueX17c509e1()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryOutboundPaymentObjectValueX17c509e1 = when (value) {
      TreasuryOutboundPayment.value -> TreasuryOutboundPayment
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryOutboundPaymentObjectValueX17c509e1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryOutboundPaymentObjectValueX17c509e1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryOutboundPaymentObjectValueX17c509e1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryOutboundPaymentObjectValueX17c509e1) {
      encoder.encodeString(value.value)
    }
  }
}
