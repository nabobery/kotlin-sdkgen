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
 * Sets the state of the secret scanning alert. You must provide `resolution` when you set the state to `resolved`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-alert-state
 */
@Serializable(with = SecretScanningAlertState.Serializer::class)
public sealed class SecretScanningAlertState {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : SecretScanningAlertState() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `resolved`.
   */
  public data object Resolved : SecretScanningAlertState() {
    public override val `value`: String = "resolved"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : SecretScanningAlertState()

  public companion object {
    public fun fromValue(`value`: String): SecretScanningAlertState = when (value) {
      Open.value -> Open
      Resolved.value -> Resolved
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<SecretScanningAlertState> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.SecretScanningAlertState", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): SecretScanningAlertState = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: SecretScanningAlertState) {
      encoder.encodeString(value.value)
    }
  }
}
