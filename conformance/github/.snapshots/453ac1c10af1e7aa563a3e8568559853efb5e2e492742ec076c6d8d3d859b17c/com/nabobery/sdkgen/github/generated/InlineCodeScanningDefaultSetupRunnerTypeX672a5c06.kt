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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-default-setup/properties/runner_type
 */
@Serializable(with = InlineCodeScanningDefaultSetupRunnerTypeX672a5c06.Serializer::class)
public sealed class InlineCodeScanningDefaultSetupRunnerTypeX672a5c06 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineCodeScanningDefaultSetupRunnerTypeX672a5c06() {
    public override val `value`: String = "standard"
  }

  /**
   * Documented value. Wire value: `labeled`.
   */
  public data object Labeled : InlineCodeScanningDefaultSetupRunnerTypeX672a5c06() {
    public override val `value`: String = "labeled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeScanningDefaultSetupRunnerTypeX672a5c06()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeScanningDefaultSetupRunnerTypeX672a5c06 = when (value) {
      Standard.value -> Standard
      Labeled.value -> Labeled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCodeScanningDefaultSetupRunnerTypeX672a5c06> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeScanningDefaultSetupRunnerTypeX672a5c06", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeScanningDefaultSetupRunnerTypeX672a5c06 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningDefaultSetupRunnerTypeX672a5c06) {
      encoder.encodeString(value.value)
    }
  }
}
