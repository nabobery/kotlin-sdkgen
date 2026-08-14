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
 * Threat model to be used for code scanning analysis. Use `remote` to analyze only network sources and
 * `remote_and_local` to include local sources like filesystem access, command-line arguments, database reads,
 * environment variable and standard input.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-default-setup/properties/threat_model
 */
@Serializable(with = InlineCodeScanningDefaultSetupThreatModelX2e887bf0.Serializer::class)
public sealed class InlineCodeScanningDefaultSetupThreatModelX2e887bf0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `remote`.
   */
  public data object Remote : InlineCodeScanningDefaultSetupThreatModelX2e887bf0() {
    public override val `value`: String = "remote"
  }

  /**
   * Documented value. Wire value: `remote_and_local`.
   */
  public data object RemoteAndLocal : InlineCodeScanningDefaultSetupThreatModelX2e887bf0() {
    public override val `value`: String = "remote_and_local"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeScanningDefaultSetupThreatModelX2e887bf0()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeScanningDefaultSetupThreatModelX2e887bf0 = when (value) {
      Remote.value -> Remote
      RemoteAndLocal.value -> RemoteAndLocal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeScanningDefaultSetupThreatModelX2e887bf0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCodeScanningDefaultSetupThreatModelX2e887bf0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeScanningDefaultSetupThreatModelX2e887bf0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningDefaultSetupThreatModelX2e887bf0) {
      encoder.encodeString(value.value)
    }
  }
}
