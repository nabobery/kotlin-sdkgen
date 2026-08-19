package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Status of a shell call or its output.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ShellCallStatus
 */
@Serializable(with = ShellCallStatus.Serializer::class)
public sealed class ShellCallStatus {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : ShellCallStatus() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : ShellCallStatus() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `incomplete`.
   */
  public data object Incomplete : ShellCallStatus() {
    public override val `value`: String = "incomplete"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ShellCallStatus()

  public companion object {
    public fun fromValue(`value`: String): ShellCallStatus = when (value) {
      InProgress.value -> InProgress
      Completed.value -> Completed
      Incomplete.value -> Incomplete
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<ShellCallStatus> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.ShellCallStatus", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ShellCallStatus = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ShellCallStatus) {
      encoder.encodeString(value.value)
    }
  }
}
