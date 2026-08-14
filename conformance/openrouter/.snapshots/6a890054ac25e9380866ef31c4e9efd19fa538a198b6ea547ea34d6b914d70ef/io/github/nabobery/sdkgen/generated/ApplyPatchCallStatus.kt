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
 * Lifecycle state of an `apply_patch_call` output item.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchCallStatus
 */
@Serializable(with = ApplyPatchCallStatus.Serializer::class)
public sealed class ApplyPatchCallStatus {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : ApplyPatchCallStatus() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : ApplyPatchCallStatus() {
    public override val `value`: String = "completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ApplyPatchCallStatus()

  public companion object {
    public fun fromValue(`value`: String): ApplyPatchCallStatus = when (value) {
      InProgress.value -> InProgress
      Completed.value -> Completed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<ApplyPatchCallStatus> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.ApplyPatchCallStatus", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ApplyPatchCallStatus = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ApplyPatchCallStatus) {
      encoder.encodeString(value.value)
    }
  }
}
