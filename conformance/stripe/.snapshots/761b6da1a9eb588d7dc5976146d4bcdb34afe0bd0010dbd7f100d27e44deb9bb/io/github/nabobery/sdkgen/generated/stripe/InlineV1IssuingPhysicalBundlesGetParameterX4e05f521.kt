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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1physical_bundles/get/parameters/4/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1issuing~1physical_bundles/get/parameters/4/schema
 */
@Serializable(with = InlineV1IssuingPhysicalBundlesGetParameterX4e05f521.Serializer::class)
public sealed class InlineV1IssuingPhysicalBundlesGetParameterX4e05f521 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineV1IssuingPhysicalBundlesGetParameterX4e05f521() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineV1IssuingPhysicalBundlesGetParameterX4e05f521() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `review`.
   */
  public data object Review : InlineV1IssuingPhysicalBundlesGetParameterX4e05f521() {
    public override val `value`: String = "review"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingPhysicalBundlesGetParameterX4e05f521()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingPhysicalBundlesGetParameterX4e05f521 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Review.value -> Review
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingPhysicalBundlesGetParameterX4e05f521> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingPhysicalBundlesGetParameterX4e05f521", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingPhysicalBundlesGetParameterX4e05f521 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingPhysicalBundlesGetParameterX4e05f521) {
      encoder.encodeString(value.value)
    }
  }
}
