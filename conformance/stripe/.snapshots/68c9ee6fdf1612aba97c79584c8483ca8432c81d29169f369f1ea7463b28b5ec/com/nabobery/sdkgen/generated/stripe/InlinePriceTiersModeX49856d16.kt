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
 * Defines if the tiering price should be `graduated` or `volume` based. In `volume`-based tiering, the maximum quantity
 * within a period determines the per unit price. In `graduated` tiering, pricing can change as the quantity grows.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/price/properties/tiers_mode
 */
@Serializable(with = InlinePriceTiersModeX49856d16.Serializer::class)
public sealed class InlinePriceTiersModeX49856d16 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `graduated`.
   */
  public data object Graduated : InlinePriceTiersModeX49856d16() {
    public override val `value`: String = "graduated"
  }

  /**
   * Documented value. Wire value: `volume`.
   */
  public data object Volume : InlinePriceTiersModeX49856d16() {
    public override val `value`: String = "volume"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePriceTiersModeX49856d16()

  public companion object {
    public fun fromValue(`value`: String): InlinePriceTiersModeX49856d16 = when (value) {
      Graduated.value -> Graduated
      Volume.value -> Volume
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePriceTiersModeX49856d16> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePriceTiersModeX49856d16", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePriceTiersModeX49856d16 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePriceTiersModeX49856d16) {
      encoder.encodeString(value.value)
    }
  }
}
