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
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_push_protection/pro
 * perties/status.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_push_protection/pro
 * perties/status
 */
@Serializable(with = InlineSecurityAndAnalysisSecretScanningPushProtectionStatusX7a06657b.Serializer::class)
public sealed class InlineSecurityAndAnalysisSecretScanningPushProtectionStatusX7a06657b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineSecurityAndAnalysisSecretScanningPushProtectionStatusX7a06657b() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineSecurityAndAnalysisSecretScanningPushProtectionStatusX7a06657b() {
    public override val `value`: String = "disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecurityAndAnalysisSecretScanningPushProtectionStatusX7a06657b()

  public companion object {
    public fun fromValue(`value`: String): InlineSecurityAndAnalysisSecretScanningPushProtectionStatusX7a06657b = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSecurityAndAnalysisSecretScanningPushProtectionStatusX7a06657b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineSecurityAndAnalysisSecretScanningPushProtectionStatusX7a06657b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecurityAndAnalysisSecretScanningPushProtectionStatusX7a06657b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecurityAndAnalysisSecretScanningPushProtectionStatusX7a06657b) {
      encoder.encodeString(value.value)
    }
  }
}
