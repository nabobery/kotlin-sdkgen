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
 * Runner type to be used.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-quality-setup/properties/runner_type
 */
@Serializable(with = InlineCodeQualitySetupRunnerTypeX186aa28c.Serializer::class)
public sealed class InlineCodeQualitySetupRunnerTypeX186aa28c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineCodeQualitySetupRunnerTypeX186aa28c() {
    public override val `value`: String = "standard"
  }

  /**
   * Documented value. Wire value: `labeled`.
   */
  public data object Labeled : InlineCodeQualitySetupRunnerTypeX186aa28c() {
    public override val `value`: String = "labeled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeQualitySetupRunnerTypeX186aa28c()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeQualitySetupRunnerTypeX186aa28c = when (value) {
      Standard.value -> Standard
      Labeled.value -> Labeled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeQualitySetupRunnerTypeX186aa28c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCodeQualitySetupRunnerTypeX186aa28c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeQualitySetupRunnerTypeX186aa28c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeQualitySetupRunnerTypeX186aa28c) {
      encoder.encodeString(value.value)
    }
  }
}
