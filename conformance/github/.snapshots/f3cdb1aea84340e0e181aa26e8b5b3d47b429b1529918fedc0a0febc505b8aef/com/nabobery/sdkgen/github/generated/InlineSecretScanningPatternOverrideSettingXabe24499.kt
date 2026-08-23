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
 * The current push protection setting for this pattern. If this is `not-set`, then it inherits either the enterprise
 * setting if it exists or the default setting.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-pattern-override/properties/setting
 */
@Serializable(with = InlineSecretScanningPatternOverrideSettingXabe24499.Serializer::class)
public sealed class InlineSecretScanningPatternOverrideSettingXabe24499 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `not-set`.
   */
  public data object NotSet : InlineSecretScanningPatternOverrideSettingXabe24499() {
    public override val `value`: String = "not-set"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineSecretScanningPatternOverrideSettingXabe24499() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineSecretScanningPatternOverrideSettingXabe24499() {
    public override val `value`: String = "enabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecretScanningPatternOverrideSettingXabe24499()

  public companion object {
    public fun fromValue(`value`: String): InlineSecretScanningPatternOverrideSettingXabe24499 = when (value) {
      NotSet.value -> NotSet
      Disabled.value -> Disabled
      Enabled.value -> Enabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSecretScanningPatternOverrideSettingXabe24499> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSecretScanningPatternOverrideSettingXabe24499", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecretScanningPatternOverrideSettingXabe24499 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecretScanningPatternOverrideSettingXabe24499) {
      encoder.encodeString(value.value)
    }
  }
}
