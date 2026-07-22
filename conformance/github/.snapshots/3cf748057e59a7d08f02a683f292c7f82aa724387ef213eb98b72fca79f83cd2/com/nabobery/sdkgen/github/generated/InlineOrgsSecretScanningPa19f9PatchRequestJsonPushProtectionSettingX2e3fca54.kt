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
 * Push protection setting to set for the pattern.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1secret-scanning~1pattern-configurations/patch/requestBody/content/
 * application~1json/schema/properties/custom_pattern_settings/items/properties/push_protection_setting
 */
@Serializable(with = InlineOrgsSecretScanningPa19f9PatchRequestJsonPushProtectionSettingX2e3fca54.Serializer::class)
public sealed class InlineOrgsSecretScanningPa19f9PatchRequestJsonPushProtectionSettingX2e3fca54 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineOrgsSecretScanningPa19f9PatchRequestJsonPushProtectionSettingX2e3fca54() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineOrgsSecretScanningPa19f9PatchRequestJsonPushProtectionSettingX2e3fca54() {
    public override val `value`: String = "enabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsSecretScanningPa19f9PatchRequestJsonPushProtectionSettingX2e3fca54()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsSecretScanningPa19f9PatchRequestJsonPushProtectionSettingX2e3fca54 = when (value) {
      Disabled.value -> Disabled
      Enabled.value -> Enabled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsSecretScanningPa19f9PatchRequestJsonPushProtectionSettingX2e3fca54> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsSecretScanningPa19f9PatchRequestJsonPushProtectionSettingX2e3fca54", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsSecretScanningPa19f9PatchRequestJsonPushProtectionSettingX2e3fca54 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsSecretScanningPa19f9PatchRequestJsonPushProtectionSettingX2e3fca54) {
      encoder.encodeString(value.value)
    }
  }
}
