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
 * The push protection setting for this pattern set at the enterprise level. Only present for partner patterns when the
 * organization has a parent enterprise.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-pattern-override/properties/enterprise_setting
 */
@Serializable(with = InlineSecretScanningPatternOverrideEnterpriseSettingXeb08904e.Serializer::class)
public sealed class InlineSecretScanningPatternOverrideEnterpriseSettingXeb08904e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `not-set`.
   */
  public data object NotSet : InlineSecretScanningPatternOverrideEnterpriseSettingXeb08904e() {
    public override val `value`: String = "not-set"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineSecretScanningPatternOverrideEnterpriseSettingXeb08904e() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineSecretScanningPatternOverrideEnterpriseSettingXeb08904e() {
    public override val `value`: String = "enabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecretScanningPatternOverrideEnterpriseSettingXeb08904e()

  public companion object {
    public fun fromValue(`value`: String): InlineSecretScanningPatternOverrideEnterpriseSettingXeb08904e = when (value) {
      NotSet.value -> NotSet
      Disabled.value -> Disabled
      Enabled.value -> Enabled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSecretScanningPatternOverrideEnterpriseSettingXeb08904e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSecretScanningPatternOverrideEnterpriseSettingXeb08904e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecretScanningPatternOverrideEnterpriseSettingXeb08904e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecretScanningPatternOverrideEnterpriseSettingXeb08904e) {
      encoder.encodeString(value.value)
    }
  }
}
