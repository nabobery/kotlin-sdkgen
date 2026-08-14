package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/transform_quantity/properties/round.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/transform_quantity/properties/round
 */
@Serializable(with = InlineV1PricesPostRequestFormTransformQuantityRoundXec72de8f.Serializer::class)
public sealed class InlineV1PricesPostRequestFormTransformQuantityRoundXec72de8f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `down`.
   */
  public data object Down : InlineV1PricesPostRequestFormTransformQuantityRoundXec72de8f() {
    public override val `value`: String = "down"
  }

  /**
   * Documented value. Wire value: `up`.
   */
  public data object Up : InlineV1PricesPostRequestFormTransformQuantityRoundXec72de8f() {
    public override val `value`: String = "up"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PricesPostRequestFormTransformQuantityRoundXec72de8f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PricesPostRequestFormTransformQuantityRoundXec72de8f = when (value) {
      Down.value -> Down
      Up.value -> Up
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PricesPostRequestFormTransformQuantityRoundXec72de8f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PricesPostRequestFormTransformQuantityRoundXec72de8f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PricesPostRequestFormTransformQuantityRoundXec72de8f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesPostRequestFormTransformQuantityRoundXec72de8f) {
      encoder.encodeString(value.value)
    }
  }
}
