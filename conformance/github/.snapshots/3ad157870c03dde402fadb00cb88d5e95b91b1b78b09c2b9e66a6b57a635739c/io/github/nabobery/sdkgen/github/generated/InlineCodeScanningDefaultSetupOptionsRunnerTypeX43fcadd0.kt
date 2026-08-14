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
 * Whether to use labeled runners or standard GitHub runners.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-default-setup-options/properties/runner_type
 */
@Serializable(with = InlineCodeScanningDefaultSetupOptionsRunnerTypeX43fcadd0.Serializer::class)
public sealed class InlineCodeScanningDefaultSetupOptionsRunnerTypeX43fcadd0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineCodeScanningDefaultSetupOptionsRunnerTypeX43fcadd0() {
    public override val `value`: String = "standard"
  }

  /**
   * Documented value. Wire value: `labeled`.
   */
  public data object Labeled : InlineCodeScanningDefaultSetupOptionsRunnerTypeX43fcadd0() {
    public override val `value`: String = "labeled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineCodeScanningDefaultSetupOptionsRunnerTypeX43fcadd0() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeScanningDefaultSetupOptionsRunnerTypeX43fcadd0()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeScanningDefaultSetupOptionsRunnerTypeX43fcadd0 = when (value) {
      Standard.value -> Standard
      Labeled.value -> Labeled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeScanningDefaultSetupOptionsRunnerTypeX43fcadd0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCodeScanningDefaultSetupOptionsRunnerTypeX43fcadd0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeScanningDefaultSetupOptionsRunnerTypeX43fcadd0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningDefaultSetupOptionsRunnerTypeX43fcadd0) {
      encoder.encodeString(value.value)
    }
  }
}
