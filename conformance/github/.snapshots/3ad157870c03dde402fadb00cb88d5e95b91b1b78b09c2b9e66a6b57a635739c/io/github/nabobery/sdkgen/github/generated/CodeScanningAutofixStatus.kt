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
 * The status of an autofix.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-autofix-status
 */
@Serializable(with = CodeScanningAutofixStatus.Serializer::class)
public sealed class CodeScanningAutofixStatus {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : CodeScanningAutofixStatus() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : CodeScanningAutofixStatus() {
    public override val `value`: String = "error"
  }

  /**
   * Documented value. Wire value: `success`.
   */
  public data object Success : CodeScanningAutofixStatus() {
    public override val `value`: String = "success"
  }

  /**
   * Documented value. Wire value: `outdated`.
   */
  public data object Outdated : CodeScanningAutofixStatus() {
    public override val `value`: String = "outdated"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : CodeScanningAutofixStatus()

  public companion object {
    public fun fromValue(`value`: String): CodeScanningAutofixStatus = when (value) {
      Pending.value -> Pending
      Error.value -> Error
      Success.value -> Success
      Outdated.value -> Outdated
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<CodeScanningAutofixStatus> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.CodeScanningAutofixStatus", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): CodeScanningAutofixStatus = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: CodeScanningAutofixStatus) {
      encoder.encodeString(value.value)
    }
  }
}
