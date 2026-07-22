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
 * Threat model to be used for code scanning analysis. Use `remote` to analyze only network sources and
 * `remote_and_local` to include local sources like filesystem access, command-line arguments, database reads,
 * environment variable and standard input.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-default-setup-update/properties/threat_model
 */
@Serializable(with = InlineCodeScanningDefaultSetupUpdateThreatModelX53e1c95e.Serializer::class)
public sealed class InlineCodeScanningDefaultSetupUpdateThreatModelX53e1c95e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `remote`.
   */
  public data object Remote : InlineCodeScanningDefaultSetupUpdateThreatModelX53e1c95e() {
    public override val `value`: String = "remote"
  }

  /**
   * Documented value. Wire value: `remote_and_local`.
   */
  public data object RemoteAndLocal : InlineCodeScanningDefaultSetupUpdateThreatModelX53e1c95e() {
    public override val `value`: String = "remote_and_local"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeScanningDefaultSetupUpdateThreatModelX53e1c95e()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeScanningDefaultSetupUpdateThreatModelX53e1c95e = when (value) {
      Remote.value -> Remote
      RemoteAndLocal.value -> RemoteAndLocal
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCodeScanningDefaultSetupUpdateThreatModelX53e1c95e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeScanningDefaultSetupUpdateThreatModelX53e1c95e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeScanningDefaultSetupUpdateThreatModelX53e1c95e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningDefaultSetupUpdateThreatModelX53e1c95e) {
      encoder.encodeString(value.value)
    }
  }
}
