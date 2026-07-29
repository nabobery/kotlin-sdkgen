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
 * Source: sdkgen://source/openapi.json#/components/schemas/climate.product/properties/object
 */
@Serializable(with = InlineClimateProductObjectValueX0611ac1a.Serializer::class)
public sealed class InlineClimateProductObjectValueX0611ac1a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `climate.product`.
   */
  public data object ClimateProduct : InlineClimateProductObjectValueX0611ac1a() {
    public override val `value`: String = "climate.product"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineClimateProductObjectValueX0611ac1a()

  public companion object {
    public fun fromValue(`value`: String): InlineClimateProductObjectValueX0611ac1a = when (value) {
      ClimateProduct.value -> ClimateProduct
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineClimateProductObjectValueX0611ac1a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineClimateProductObjectValueX0611ac1a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineClimateProductObjectValueX0611ac1a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineClimateProductObjectValueX0611ac1a) {
      encoder.encodeString(value.value)
    }
  }
}
