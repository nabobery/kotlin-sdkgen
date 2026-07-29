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
 * Code quality setup has been configured or not.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-quality-setup/properties/state
 */
@Serializable(with = InlineCodeQualitySetupStateX9853e72e.Serializer::class)
public sealed class InlineCodeQualitySetupStateX9853e72e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `configured`.
   */
  public data object Configured : InlineCodeQualitySetupStateX9853e72e() {
    public override val `value`: String = "configured"
  }

  /**
   * Documented value. Wire value: `not-configured`.
   */
  public data object NotConfigured : InlineCodeQualitySetupStateX9853e72e() {
    public override val `value`: String = "not-configured"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeQualitySetupStateX9853e72e()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeQualitySetupStateX9853e72e = when (value) {
      Configured.value -> Configured
      NotConfigured.value -> NotConfigured
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCodeQualitySetupStateX9853e72e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeQualitySetupStateX9853e72e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeQualitySetupStateX9853e72e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeQualitySetupStateX9853e72e) {
      encoder.encodeString(value.value)
    }
  }
}
