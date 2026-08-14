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
 * The type of the activity that was performed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/activity/properties/activity_type
 */
@Serializable(with = InlineActivityActivityTypeX3192d8e3.Serializer::class)
public sealed class InlineActivityActivityTypeX3192d8e3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `push`.
   */
  public data object Push : InlineActivityActivityTypeX3192d8e3() {
    public override val `value`: String = "push"
  }

  /**
   * Documented value. Wire value: `force_push`.
   */
  public data object ForcePush : InlineActivityActivityTypeX3192d8e3() {
    public override val `value`: String = "force_push"
  }

  /**
   * Documented value. Wire value: `branch_deletion`.
   */
  public data object BranchDeletion : InlineActivityActivityTypeX3192d8e3() {
    public override val `value`: String = "branch_deletion"
  }

  /**
   * Documented value. Wire value: `branch_creation`.
   */
  public data object BranchCreation : InlineActivityActivityTypeX3192d8e3() {
    public override val `value`: String = "branch_creation"
  }

  /**
   * Documented value. Wire value: `pr_merge`.
   */
  public data object PrMerge : InlineActivityActivityTypeX3192d8e3() {
    public override val `value`: String = "pr_merge"
  }

  /**
   * Documented value. Wire value: `merge_queue_merge`.
   */
  public data object MergeQueueMerge : InlineActivityActivityTypeX3192d8e3() {
    public override val `value`: String = "merge_queue_merge"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineActivityActivityTypeX3192d8e3()

  public companion object {
    public fun fromValue(`value`: String): InlineActivityActivityTypeX3192d8e3 = when (value) {
      Push.value -> Push
      ForcePush.value -> ForcePush
      BranchDeletion.value -> BranchDeletion
      BranchCreation.value -> BranchCreation
      PrMerge.value -> PrMerge
      MergeQueueMerge.value -> MergeQueueMerge
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineActivityActivityTypeX3192d8e3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineActivityActivityTypeX3192d8e3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineActivityActivityTypeX3192d8e3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineActivityActivityTypeX3192d8e3) {
      encoder.encodeString(value.value)
    }
  }
}
