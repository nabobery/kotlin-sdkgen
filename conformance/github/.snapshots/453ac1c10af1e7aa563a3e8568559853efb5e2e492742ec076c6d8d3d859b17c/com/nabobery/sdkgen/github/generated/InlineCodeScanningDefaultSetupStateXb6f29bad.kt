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
 * Code scanning default setup has been configured or not.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-default-setup/properties/state
 */
@Serializable(with = InlineCodeScanningDefaultSetupStateXb6f29bad.Serializer::class)
public sealed class InlineCodeScanningDefaultSetupStateXb6f29bad {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `configured`.
   */
  public data object Configured : InlineCodeScanningDefaultSetupStateXb6f29bad() {
    public override val `value`: String = "configured"
  }

  /**
   * Documented value. Wire value: `not-configured`.
   */
  public data object NotConfigured : InlineCodeScanningDefaultSetupStateXb6f29bad() {
    public override val `value`: String = "not-configured"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeScanningDefaultSetupStateXb6f29bad()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeScanningDefaultSetupStateXb6f29bad = when (value) {
      Configured.value -> Configured
      NotConfigured.value -> NotConfigured
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCodeScanningDefaultSetupStateXb6f29bad> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeScanningDefaultSetupStateXb6f29bad", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeScanningDefaultSetupStateXb6f29bad = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningDefaultSetupStateXb6f29bad) {
      encoder.encodeString(value.value)
    }
  }
}
