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
 * The merge method to use.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/aut
 * o_merge/properties/merge_method
 */
@Serializable(with = InlineWebhookPullRequestAssignedPullRequestAutoMergeMergeMethodX0644235b.Serializer::class)
public sealed class InlineWebhookPullRequestAssignedPullRequestAutoMergeMergeMethodX0644235b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merge`.
   */
  public data object Merge : InlineWebhookPullRequestAssignedPullRequestAutoMergeMergeMethodX0644235b() {
    public override val `value`: String = "merge"
  }

  /**
   * Documented value. Wire value: `squash`.
   */
  public data object Squash : InlineWebhookPullRequestAssignedPullRequestAutoMergeMergeMethodX0644235b() {
    public override val `value`: String = "squash"
  }

  /**
   * Documented value. Wire value: `rebase`.
   */
  public data object Rebase : InlineWebhookPullRequestAssignedPullRequestAutoMergeMergeMethodX0644235b() {
    public override val `value`: String = "rebase"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAssignedPullRequestAutoMergeMergeMethodX0644235b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAssignedPullRequestAutoMergeMergeMethodX0644235b = when (value) {
      Merge.value -> Merge
      Squash.value -> Squash
      Rebase.value -> Rebase
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAssignedPullRequestAutoMergeMergeMethodX0644235b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAssignedPullRequestAutoMergeMergeMethodX0644235b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAssignedPullRequestAutoMergeMergeMethodX0644235b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAssignedPullRequestAutoMergeMergeMethodX0644235b) {
      encoder.encodeString(value.value)
    }
  }
}
