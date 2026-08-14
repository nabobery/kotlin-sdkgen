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
 * The default push protection setting for this pattern.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-pattern-override/properties/default_setting
 */
@Serializable(with = InlineSecretScanningPatternOverrideDefaultSettingXd4fb7ef5.Serializer::class)
public sealed class InlineSecretScanningPatternOverrideDefaultSettingXd4fb7ef5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineSecretScanningPatternOverrideDefaultSettingXd4fb7ef5() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineSecretScanningPatternOverrideDefaultSettingXd4fb7ef5() {
    public override val `value`: String = "enabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecretScanningPatternOverrideDefaultSettingXd4fb7ef5()

  public companion object {
    public fun fromValue(`value`: String): InlineSecretScanningPatternOverrideDefaultSettingXd4fb7ef5 = when (value) {
      Disabled.value -> Disabled
      Enabled.value -> Enabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSecretScanningPatternOverrideDefaultSettingXd4fb7ef5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineSecretScanningPatternOverrideDefaultSettingXd4fb7ef5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecretScanningPatternOverrideDefaultSettingXd4fb7ef5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecretScanningPatternOverrideDefaultSettingXd4fb7ef5) {
      encoder.encodeString(value.value)
    }
  }
}
