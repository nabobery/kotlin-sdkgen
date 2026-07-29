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
 * Source: sdkgen://source/openapi.json#/components/schemas/fee_refund/properties/object
 */
@Serializable(with = InlineFeeRefundObjectValueX4e9deb45.Serializer::class)
public sealed class InlineFeeRefundObjectValueX4e9deb45 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fee_refund`.
   */
  public data object FeeRefund : InlineFeeRefundObjectValueX4e9deb45() {
    public override val `value`: String = "fee_refund"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFeeRefundObjectValueX4e9deb45()

  public companion object {
    public fun fromValue(`value`: String): InlineFeeRefundObjectValueX4e9deb45 = when (value) {
      FeeRefund.value -> FeeRefund
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineFeeRefundObjectValueX4e9deb45> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineFeeRefundObjectValueX4e9deb45", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFeeRefundObjectValueX4e9deb45 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFeeRefundObjectValueX4e9deb45) {
      encoder.encodeString(value.value)
    }
  }
}
