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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/secret-scanning-alert-state/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/secret-scanning-alert-state/schema
 */
@Serializable(with = InlineSecretScanningAlertStateParameterX609aff21.Serializer::class)
public sealed class InlineSecretScanningAlertStateParameterX609aff21 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineSecretScanningAlertStateParameterX609aff21() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `resolved`.
   */
  public data object Resolved : InlineSecretScanningAlertStateParameterX609aff21() {
    public override val `value`: String = "resolved"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecretScanningAlertStateParameterX609aff21()

  public companion object {
    public fun fromValue(`value`: String): InlineSecretScanningAlertStateParameterX609aff21 = when (value) {
      Open.value -> Open
      Resolved.value -> Resolved
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSecretScanningAlertStateParameterX609aff21> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineSecretScanningAlertStateParameterX609aff21", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecretScanningAlertStateParameterX609aff21 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecretScanningAlertStateParameterX609aff21) {
      encoder.encodeString(value.value)
    }
  }
}
