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
 * After division, either round the result `up` or `down`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/transform_usage/properties/round
 */
@Serializable(with = InlineTransformUsageRoundX228c2a46.Serializer::class)
public sealed class InlineTransformUsageRoundX228c2a46 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `down`.
   */
  public data object Down : InlineTransformUsageRoundX228c2a46() {
    public override val `value`: String = "down"
  }

  /**
   * Documented value. Wire value: `up`.
   */
  public data object Up : InlineTransformUsageRoundX228c2a46() {
    public override val `value`: String = "up"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTransformUsageRoundX228c2a46()

  public companion object {
    public fun fromValue(`value`: String): InlineTransformUsageRoundX228c2a46 = when (value) {
      Down.value -> Down
      Up.value -> Up
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTransformUsageRoundX228c2a46> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTransformUsageRoundX228c2a46", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTransformUsageRoundX228c2a46 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTransformUsageRoundX228c2a46) {
      encoder.encodeString(value.value)
    }
  }
}
