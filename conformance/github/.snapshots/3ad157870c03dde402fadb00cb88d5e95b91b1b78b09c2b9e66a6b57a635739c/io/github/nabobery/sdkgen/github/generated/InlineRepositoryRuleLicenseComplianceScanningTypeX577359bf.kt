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
 * sdkgen://source/openapi.yaml#/components/schemas/repository-rule-license-compliance-scanning/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-rule-license-compliance-scanning/properties/type
 */
@Serializable(with = InlineRepositoryRuleLicenseComplianceScanningTypeX577359bf.Serializer::class)
public sealed class InlineRepositoryRuleLicenseComplianceScanningTypeX577359bf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `license_compliance_scanning`.
   */
  public data object LicenseComplianceScanning : InlineRepositoryRuleLicenseComplianceScanningTypeX577359bf() {
    public override val `value`: String = "license_compliance_scanning"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryRuleLicenseComplianceScanningTypeX577359bf()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryRuleLicenseComplianceScanningTypeX577359bf = when (value) {
      LicenseComplianceScanning.value -> LicenseComplianceScanning
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryRuleLicenseComplianceScanningTypeX577359bf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineRepositoryRuleLicenseComplianceScanningTypeX577359bf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryRuleLicenseComplianceScanningTypeX577359bf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryRuleLicenseComplianceScanningTypeX577359bf) {
      encoder.encodeString(value.value)
    }
  }
}
