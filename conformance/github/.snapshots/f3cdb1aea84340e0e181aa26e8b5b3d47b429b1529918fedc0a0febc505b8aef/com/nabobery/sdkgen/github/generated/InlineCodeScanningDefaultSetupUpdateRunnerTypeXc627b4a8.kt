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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-default-setup-update/properties/runner_type
 */
@Serializable(with = InlineCodeScanningDefaultSetupUpdateRunnerTypeXc627b4a8.Serializer::class)
public sealed class InlineCodeScanningDefaultSetupUpdateRunnerTypeXc627b4a8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineCodeScanningDefaultSetupUpdateRunnerTypeXc627b4a8() {
    public override val `value`: String = "standard"
  }

  /**
   * Documented value. Wire value: `labeled`.
   */
  public data object Labeled : InlineCodeScanningDefaultSetupUpdateRunnerTypeXc627b4a8() {
    public override val `value`: String = "labeled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeScanningDefaultSetupUpdateRunnerTypeXc627b4a8()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeScanningDefaultSetupUpdateRunnerTypeXc627b4a8 = when (value) {
      Standard.value -> Standard
      Labeled.value -> Labeled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeScanningDefaultSetupUpdateRunnerTypeXc627b4a8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeScanningDefaultSetupUpdateRunnerTypeXc627b4a8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeScanningDefaultSetupUpdateRunnerTypeXc627b4a8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningDefaultSetupUpdateRunnerTypeXc627b4a8) {
      encoder.encodeString(value.value)
    }
  }
}
