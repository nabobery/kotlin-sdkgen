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
 * Runner type to be used.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-quality-setup-update/properties/runner_type
 */
@Serializable(with = InlineCodeQualitySetupUpdateRunnerTypeX77663197.Serializer::class)
public sealed class InlineCodeQualitySetupUpdateRunnerTypeX77663197 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineCodeQualitySetupUpdateRunnerTypeX77663197() {
    public override val `value`: String = "standard"
  }

  /**
   * Documented value. Wire value: `labeled`.
   */
  public data object Labeled : InlineCodeQualitySetupUpdateRunnerTypeX77663197() {
    public override val `value`: String = "labeled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeQualitySetupUpdateRunnerTypeX77663197()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeQualitySetupUpdateRunnerTypeX77663197 = when (value) {
      Standard.value -> Standard
      Labeled.value -> Labeled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeQualitySetupUpdateRunnerTypeX77663197> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeQualitySetupUpdateRunnerTypeX77663197", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeQualitySetupUpdateRunnerTypeX77663197 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeQualitySetupUpdateRunnerTypeX77663197) {
      encoder.encodeString(value.value)
    }
  }
}
