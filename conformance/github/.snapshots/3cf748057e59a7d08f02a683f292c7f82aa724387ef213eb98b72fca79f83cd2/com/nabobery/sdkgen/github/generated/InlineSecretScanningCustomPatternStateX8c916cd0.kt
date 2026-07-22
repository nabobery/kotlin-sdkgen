package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The state of the custom pattern.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-custom-pattern/properties/state
 */
@Serializable(with = InlineSecretScanningCustomPatternStateX8c916cd0.Serializer::class)
public sealed class InlineSecretScanningCustomPatternStateX8c916cd0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `published`.
   */
  public data object Published : InlineSecretScanningCustomPatternStateX8c916cd0() {
    public override val `value`: String = "published"
  }

  /**
   * Documented value. Wire value: `unpublished`.
   */
  public data object Unpublished : InlineSecretScanningCustomPatternStateX8c916cd0() {
    public override val `value`: String = "unpublished"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecretScanningCustomPatternStateX8c916cd0()

  public companion object {
    public fun fromValue(`value`: String): InlineSecretScanningCustomPatternStateX8c916cd0 = when (value) {
      Published.value -> Published
      Unpublished.value -> Unpublished
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSecretScanningCustomPatternStateX8c916cd0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSecretScanningCustomPatternStateX8c916cd0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecretScanningCustomPatternStateX8c916cd0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecretScanningCustomPatternStateX8c916cd0) {
      encoder.encodeString(value.value)
    }
  }
}
