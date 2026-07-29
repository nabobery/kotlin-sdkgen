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
 * Source: sdkgen://source/openapi.json#/components/schemas/charge/properties/object
 */
@Serializable(with = InlineChargeObjectValueX4f045e0d.Serializer::class)
public sealed class InlineChargeObjectValueX4f045e0d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `charge`.
   */
  public data object Charge : InlineChargeObjectValueX4f045e0d() {
    public override val `value`: String = "charge"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChargeObjectValueX4f045e0d()

  public companion object {
    public fun fromValue(`value`: String): InlineChargeObjectValueX4f045e0d = when (value) {
      Charge.value -> Charge
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineChargeObjectValueX4f045e0d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineChargeObjectValueX4f045e0d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChargeObjectValueX4f045e0d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChargeObjectValueX4f045e0d) {
      encoder.encodeString(value.value)
    }
  }
}
