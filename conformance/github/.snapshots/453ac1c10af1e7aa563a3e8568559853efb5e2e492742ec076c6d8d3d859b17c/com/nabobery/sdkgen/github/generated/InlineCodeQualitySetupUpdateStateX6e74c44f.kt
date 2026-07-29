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
 * The desired state of code quality setup.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-quality-setup-update/properties/state
 */
@Serializable(with = InlineCodeQualitySetupUpdateStateX6e74c44f.Serializer::class)
public sealed class InlineCodeQualitySetupUpdateStateX6e74c44f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `configured`.
   */
  public data object Configured : InlineCodeQualitySetupUpdateStateX6e74c44f() {
    public override val `value`: String = "configured"
  }

  /**
   * Documented value. Wire value: `not-configured`.
   */
  public data object NotConfigured : InlineCodeQualitySetupUpdateStateX6e74c44f() {
    public override val `value`: String = "not-configured"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeQualitySetupUpdateStateX6e74c44f()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeQualitySetupUpdateStateX6e74c44f = when (value) {
      Configured.value -> Configured
      NotConfigured.value -> NotConfigured
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCodeQualitySetupUpdateStateX6e74c44f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeQualitySetupUpdateStateX6e74c44f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeQualitySetupUpdateStateX6e74c44f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeQualitySetupUpdateStateX6e74c44f) {
      encoder.encodeString(value.value)
    }
  }
}
