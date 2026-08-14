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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1activity/get/parameters/9/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1activity/get/parameters/9/schema
 */
@Serializable(with = InlineReposActivityGetParameterXf0e1e394.Serializer::class)
public sealed class InlineReposActivityGetParameterXf0e1e394 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `push`.
   */
  public data object Push : InlineReposActivityGetParameterXf0e1e394() {
    public override val `value`: String = "push"
  }

  /**
   * Documented value. Wire value: `force_push`.
   */
  public data object ForcePush : InlineReposActivityGetParameterXf0e1e394() {
    public override val `value`: String = "force_push"
  }

  /**
   * Documented value. Wire value: `branch_creation`.
   */
  public data object BranchCreation : InlineReposActivityGetParameterXf0e1e394() {
    public override val `value`: String = "branch_creation"
  }

  /**
   * Documented value. Wire value: `branch_deletion`.
   */
  public data object BranchDeletion : InlineReposActivityGetParameterXf0e1e394() {
    public override val `value`: String = "branch_deletion"
  }

  /**
   * Documented value. Wire value: `pr_merge`.
   */
  public data object PrMerge : InlineReposActivityGetParameterXf0e1e394() {
    public override val `value`: String = "pr_merge"
  }

  /**
   * Documented value. Wire value: `merge_queue_merge`.
   */
  public data object MergeQueueMerge : InlineReposActivityGetParameterXf0e1e394() {
    public override val `value`: String = "merge_queue_merge"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposActivityGetParameterXf0e1e394()

  public companion object {
    public fun fromValue(`value`: String): InlineReposActivityGetParameterXf0e1e394 = when (value) {
      Push.value -> Push
      ForcePush.value -> ForcePush
      BranchCreation.value -> BranchCreation
      BranchDeletion.value -> BranchDeletion
      PrMerge.value -> PrMerge
      MergeQueueMerge.value -> MergeQueueMerge
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposActivityGetParameterXf0e1e394> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposActivityGetParameterXf0e1e394", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposActivityGetParameterXf0e1e394 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposActivityGetParameterXf0e1e394) {
      encoder.encodeString(value.value)
    }
  }
}
