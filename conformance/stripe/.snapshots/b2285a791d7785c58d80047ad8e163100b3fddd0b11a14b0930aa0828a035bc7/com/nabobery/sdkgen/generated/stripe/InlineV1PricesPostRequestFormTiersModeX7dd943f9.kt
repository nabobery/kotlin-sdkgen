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
 * within a period determines the per unit price, in `graduated` tiering pricing can successively change as the quantity
 * grows.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/tiers_mode
 */
@Serializable(with = InlineV1PricesPostRequestFormTiersModeX7dd943f9.Serializer::class)
public sealed class InlineV1PricesPostRequestFormTiersModeX7dd943f9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `graduated`.
   */
  public data object Graduated : InlineV1PricesPostRequestFormTiersModeX7dd943f9() {
    public override val `value`: String = "graduated"
  }

  /**
   * Documented value. Wire value: `volume`.
   */
  public data object Volume : InlineV1PricesPostRequestFormTiersModeX7dd943f9() {
    public override val `value`: String = "volume"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PricesPostRequestFormTiersModeX7dd943f9()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PricesPostRequestFormTiersModeX7dd943f9 = when (value) {
      Graduated.value -> Graduated
      Volume.value -> Volume
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PricesPostRequestFormTiersModeX7dd943f9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PricesPostRequestFormTiersModeX7dd943f9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PricesPostRequestFormTiersModeX7dd943f9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesPostRequestFormTiersModeX7dd943f9) {
      encoder.encodeString(value.value)
    }
  }
}
