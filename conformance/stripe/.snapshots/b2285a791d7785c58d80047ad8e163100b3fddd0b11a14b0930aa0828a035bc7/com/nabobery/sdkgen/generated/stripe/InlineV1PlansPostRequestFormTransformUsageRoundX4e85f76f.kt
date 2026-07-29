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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1plans/post/requestBody/content/application~1x-www-form-urlencoded/schema/pr
 * operties/transform_usage/properties/round.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1plans/post/requestBody/content/application~1x-www-form-urlencoded/schema/pr
 * operties/transform_usage/properties/round
 */
@Serializable(with = InlineV1PlansPostRequestFormTransformUsageRoundX4e85f76f.Serializer::class)
public sealed class InlineV1PlansPostRequestFormTransformUsageRoundX4e85f76f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `down`.
   */
  public data object Down : InlineV1PlansPostRequestFormTransformUsageRoundX4e85f76f() {
    public override val `value`: String = "down"
  }

  /**
   * Documented value. Wire value: `up`.
   */
  public data object Up : InlineV1PlansPostRequestFormTransformUsageRoundX4e85f76f() {
    public override val `value`: String = "up"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PlansPostRequestFormTransformUsageRoundX4e85f76f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PlansPostRequestFormTransformUsageRoundX4e85f76f = when (value) {
      Down.value -> Down
      Up.value -> Up
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PlansPostRequestFormTransformUsageRoundX4e85f76f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PlansPostRequestFormTransformUsageRoundX4e85f76f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PlansPostRequestFormTransformUsageRoundX4e85f76f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PlansPostRequestFormTransformUsageRoundX4e85f76f) {
      encoder.encodeString(value.value)
    }
  }
}
