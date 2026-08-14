package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ToolCallStatus.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ToolCallStatus
 */
@Serializable(with = ToolCallStatus.Serializer::class)
public sealed class ToolCallStatus {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : ToolCallStatus() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : ToolCallStatus() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `incomplete`.
   */
  public data object Incomplete : ToolCallStatus() {
    public override val `value`: String = "incomplete"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ToolCallStatus()

  public companion object {
    public fun fromValue(`value`: String): ToolCallStatus = when (value) {
      InProgress.value -> InProgress
      Completed.value -> Completed
      Incomplete.value -> Incomplete
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<ToolCallStatus> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.ToolCallStatus", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ToolCallStatus = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ToolCallStatus) {
      encoder.encodeString(value.value)
    }
  }
}
