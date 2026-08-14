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
 * The policy for how to use card logo images in a card design with this physical bundle.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_physical_bundle_features/properties/card_logo
 */
@Serializable(with = InlineIssuingPhysicalBundleFeaturesCardLogoX39f3dc2e.Serializer::class)
public sealed class InlineIssuingPhysicalBundleFeaturesCardLogoX39f3dc2e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `optional`.
   */
  public data object Optional : InlineIssuingPhysicalBundleFeaturesCardLogoX39f3dc2e() {
    public override val `value`: String = "optional"
  }

  /**
   * Documented value. Wire value: `required`.
   */
  public data object Required : InlineIssuingPhysicalBundleFeaturesCardLogoX39f3dc2e() {
    public override val `value`: String = "required"
  }

  /**
   * Documented value. Wire value: `unsupported`.
   */
  public data object Unsupported : InlineIssuingPhysicalBundleFeaturesCardLogoX39f3dc2e() {
    public override val `value`: String = "unsupported"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingPhysicalBundleFeaturesCardLogoX39f3dc2e()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingPhysicalBundleFeaturesCardLogoX39f3dc2e = when (value) {
      Optional.value -> Optional
      Required.value -> Required
      Unsupported.value -> Unsupported
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingPhysicalBundleFeaturesCardLogoX39f3dc2e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingPhysicalBundleFeaturesCardLogoX39f3dc2e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingPhysicalBundleFeaturesCardLogoX39f3dc2e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingPhysicalBundleFeaturesCardLogoX39f3dc2e) {
      encoder.encodeString(value.value)
    }
  }
}
