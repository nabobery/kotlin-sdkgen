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
 * Source: sdkgen://source/openapi.json#/components/schemas/transform_quantity/properties/round
 */
@Serializable(with = InlineTransformQuantityRoundX2bdb6f5a.Serializer::class)
public sealed class InlineTransformQuantityRoundX2bdb6f5a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `down`.
   */
  public data object Down : InlineTransformQuantityRoundX2bdb6f5a() {
    public override val `value`: String = "down"
  }

  /**
   * Documented value. Wire value: `up`.
   */
  public data object Up : InlineTransformQuantityRoundX2bdb6f5a() {
    public override val `value`: String = "up"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTransformQuantityRoundX2bdb6f5a()

  public companion object {
    public fun fromValue(`value`: String): InlineTransformQuantityRoundX2bdb6f5a = when (value) {
      Down.value -> Down
      Up.value -> Up
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTransformQuantityRoundX2bdb6f5a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTransformQuantityRoundX2bdb6f5a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTransformQuantityRoundX2bdb6f5a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTransformQuantityRoundX2bdb6f5a) {
      encoder.encodeString(value.value)
    }
  }
}
