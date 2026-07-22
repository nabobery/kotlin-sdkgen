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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/parameters/secret-scanning-custom-pattern-push-protection/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/secret-scanning-custom-pattern-push-protection/schema
 */
@Serializable(with = InlineSecretScanningCustomPatternPushProtectionParameterXf4799756.Serializer::class)
public sealed class InlineSecretScanningCustomPatternPushProtectionParameterXf4799756 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineSecretScanningCustomPatternPushProtectionParameterXf4799756() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineSecretScanningCustomPatternPushProtectionParameterXf4799756() {
    public override val `value`: String = "disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecretScanningCustomPatternPushProtectionParameterXf4799756()

  public companion object {
    public fun fromValue(`value`: String): InlineSecretScanningCustomPatternPushProtectionParameterXf4799756 = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSecretScanningCustomPatternPushProtectionParameterXf4799756> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSecretScanningCustomPatternPushProtectionParameterXf4799756", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecretScanningCustomPatternPushProtectionParameterXf4799756 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecretScanningCustomPatternPushProtectionParameterXf4799756) {
      encoder.encodeString(value.value)
    }
  }
}
