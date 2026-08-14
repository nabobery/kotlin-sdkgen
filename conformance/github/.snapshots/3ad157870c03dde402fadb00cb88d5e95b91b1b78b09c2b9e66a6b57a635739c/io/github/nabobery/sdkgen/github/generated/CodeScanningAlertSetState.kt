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
 * Sets the state of the code scanning alert. You must provide `dismissed_reason` when you set the state to `dismissed`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-alert-set-state
 */
@Serializable(with = CodeScanningAlertSetState.Serializer::class)
public sealed class CodeScanningAlertSetState {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : CodeScanningAlertSetState() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `dismissed`.
   */
  public data object Dismissed : CodeScanningAlertSetState() {
    public override val `value`: String = "dismissed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : CodeScanningAlertSetState()

  public companion object {
    public fun fromValue(`value`: String): CodeScanningAlertSetState = when (value) {
      Open.value -> Open
      Dismissed.value -> Dismissed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<CodeScanningAlertSetState> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.CodeScanningAlertSetState", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): CodeScanningAlertSetState = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: CodeScanningAlertSetState) {
      encoder.encodeString(value.value)
    }
  }
}
