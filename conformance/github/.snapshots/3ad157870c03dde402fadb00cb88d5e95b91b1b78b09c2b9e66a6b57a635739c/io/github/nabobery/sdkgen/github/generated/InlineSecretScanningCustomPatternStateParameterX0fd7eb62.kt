package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/parameters/secret-scanning-custom-pattern-state/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/secret-scanning-custom-pattern-state/schema
 */
@Serializable(with = InlineSecretScanningCustomPatternStateParameterX0fd7eb62.Serializer::class)
public sealed class InlineSecretScanningCustomPatternStateParameterX0fd7eb62 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `published`.
   */
  public data object Published : InlineSecretScanningCustomPatternStateParameterX0fd7eb62() {
    public override val `value`: String = "published"
  }

  /**
   * Documented value. Wire value: `unpublished`.
   */
  public data object Unpublished : InlineSecretScanningCustomPatternStateParameterX0fd7eb62() {
    public override val `value`: String = "unpublished"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecretScanningCustomPatternStateParameterX0fd7eb62()

  public companion object {
    public fun fromValue(`value`: String): InlineSecretScanningCustomPatternStateParameterX0fd7eb62 = when (value) {
      Published.value -> Published
      Unpublished.value -> Unpublished
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSecretScanningCustomPatternStateParameterX0fd7eb62> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineSecretScanningCustomPatternStateParameterX0fd7eb62", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecretScanningCustomPatternStateParameterX0fd7eb62 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecretScanningCustomPatternStateParameterX0fd7eb62) {
      encoder.encodeString(value.value)
    }
  }
}
