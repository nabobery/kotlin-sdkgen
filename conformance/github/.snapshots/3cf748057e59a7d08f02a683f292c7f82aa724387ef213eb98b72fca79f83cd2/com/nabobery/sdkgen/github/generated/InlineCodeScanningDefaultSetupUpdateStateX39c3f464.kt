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
 * The desired state of code scanning default setup.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-default-setup-update/properties/state
 */
@Serializable(with = InlineCodeScanningDefaultSetupUpdateStateX39c3f464.Serializer::class)
public sealed class InlineCodeScanningDefaultSetupUpdateStateX39c3f464 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `configured`.
   */
  public data object Configured : InlineCodeScanningDefaultSetupUpdateStateX39c3f464() {
    public override val `value`: String = "configured"
  }

  /**
   * Documented value. Wire value: `not-configured`.
   */
  public data object NotConfigured : InlineCodeScanningDefaultSetupUpdateStateX39c3f464() {
    public override val `value`: String = "not-configured"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeScanningDefaultSetupUpdateStateX39c3f464()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeScanningDefaultSetupUpdateStateX39c3f464 = when (value) {
      Configured.value -> Configured
      NotConfigured.value -> NotConfigured
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCodeScanningDefaultSetupUpdateStateX39c3f464> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeScanningDefaultSetupUpdateStateX39c3f464", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeScanningDefaultSetupUpdateStateX39c3f464 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningDefaultSetupUpdateStateX39c3f464) {
      encoder.encodeString(value.value)
    }
  }
}
