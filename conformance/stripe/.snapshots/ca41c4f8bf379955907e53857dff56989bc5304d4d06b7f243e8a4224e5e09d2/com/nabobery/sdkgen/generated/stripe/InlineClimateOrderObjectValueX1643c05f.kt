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
 * Source: sdkgen://source/openapi.json#/components/schemas/climate.order/properties/object
 */
@Serializable(with = InlineClimateOrderObjectValueX1643c05f.Serializer::class)
public sealed class InlineClimateOrderObjectValueX1643c05f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `climate.order`.
   */
  public data object ClimateOrder : InlineClimateOrderObjectValueX1643c05f() {
    public override val `value`: String = "climate.order"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineClimateOrderObjectValueX1643c05f()

  public companion object {
    public fun fromValue(`value`: String): InlineClimateOrderObjectValueX1643c05f = when (value) {
      ClimateOrder.value -> ClimateOrder
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineClimateOrderObjectValueX1643c05f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineClimateOrderObjectValueX1643c05f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineClimateOrderObjectValueX1643c05f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineClimateOrderObjectValueX1643c05f) {
      encoder.encodeString(value.value)
    }
  }
}
