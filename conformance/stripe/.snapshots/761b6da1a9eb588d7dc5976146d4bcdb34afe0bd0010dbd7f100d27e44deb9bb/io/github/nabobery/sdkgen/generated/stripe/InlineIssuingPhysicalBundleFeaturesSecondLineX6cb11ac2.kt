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
 * The policy for how to use a second line on a card with this physical bundle.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_physical_bundle_features/properties/second_line
 */
@Serializable(with = InlineIssuingPhysicalBundleFeaturesSecondLineX6cb11ac2.Serializer::class)
public sealed class InlineIssuingPhysicalBundleFeaturesSecondLineX6cb11ac2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `optional`.
   */
  public data object Optional : InlineIssuingPhysicalBundleFeaturesSecondLineX6cb11ac2() {
    public override val `value`: String = "optional"
  }

  /**
   * Documented value. Wire value: `required`.
   */
  public data object Required : InlineIssuingPhysicalBundleFeaturesSecondLineX6cb11ac2() {
    public override val `value`: String = "required"
  }

  /**
   * Documented value. Wire value: `unsupported`.
   */
  public data object Unsupported : InlineIssuingPhysicalBundleFeaturesSecondLineX6cb11ac2() {
    public override val `value`: String = "unsupported"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingPhysicalBundleFeaturesSecondLineX6cb11ac2()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingPhysicalBundleFeaturesSecondLineX6cb11ac2 = when (value) {
      Optional.value -> Optional
      Required.value -> Required
      Unsupported.value -> Unsupported
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingPhysicalBundleFeaturesSecondLineX6cb11ac2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingPhysicalBundleFeaturesSecondLineX6cb11ac2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingPhysicalBundleFeaturesSecondLineX6cb11ac2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingPhysicalBundleFeaturesSecondLineX6cb11ac2) {
      encoder.encodeString(value.value)
    }
  }
}
