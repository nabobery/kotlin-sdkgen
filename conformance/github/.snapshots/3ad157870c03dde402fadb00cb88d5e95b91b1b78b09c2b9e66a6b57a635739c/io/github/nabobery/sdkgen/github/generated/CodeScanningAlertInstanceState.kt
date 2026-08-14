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
 * State of a code scanning alert instance.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-alert-instance-state
 */
@Serializable(with = CodeScanningAlertInstanceState.Serializer::class)
public sealed class CodeScanningAlertInstanceState {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : CodeScanningAlertInstanceState() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : CodeScanningAlertInstanceState() {
    public override val `value`: String = "fixed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : CodeScanningAlertInstanceState()

  public companion object {
    public fun fromValue(`value`: String): CodeScanningAlertInstanceState = when (value) {
      Open.value -> Open
      Fixed.value -> Fixed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<CodeScanningAlertInstanceState> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.CodeScanningAlertInstanceState", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): CodeScanningAlertInstanceState = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: CodeScanningAlertInstanceState) {
      encoder.encodeString(value.value)
    }
  }
}
