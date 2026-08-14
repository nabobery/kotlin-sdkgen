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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/reason.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/reason
 */
@Serializable(with = InlineWebhookPullRequestDequeuedReasonXc688727e.Serializer::class)
public sealed class InlineWebhookPullRequestDequeuedReasonXc688727e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `UNKNOWN_REMOVAL_REASON`.
   */
  public data object UnknownRemovalReason : InlineWebhookPullRequestDequeuedReasonXc688727e() {
    public override val `value`: String = "UNKNOWN_REMOVAL_REASON"
  }

  /**
   * Documented value. Wire value: `MANUAL`.
   */
  public data object Manual : InlineWebhookPullRequestDequeuedReasonXc688727e() {
    public override val `value`: String = "MANUAL"
  }

  /**
   * Documented value. Wire value: `MERGE`.
   */
  public data object Merge : InlineWebhookPullRequestDequeuedReasonXc688727e() {
    public override val `value`: String = "MERGE"
  }

  /**
   * Documented value. Wire value: `MERGE_CONFLICT`.
   */
  public data object MergeConflict : InlineWebhookPullRequestDequeuedReasonXc688727e() {
    public override val `value`: String = "MERGE_CONFLICT"
  }

  /**
   * Documented value. Wire value: `CI_FAILURE`.
   */
  public data object CiFailure : InlineWebhookPullRequestDequeuedReasonXc688727e() {
    public override val `value`: String = "CI_FAILURE"
  }

  /**
   * Documented value. Wire value: `CI_TIMEOUT`.
   */
  public data object CiTimeout : InlineWebhookPullRequestDequeuedReasonXc688727e() {
    public override val `value`: String = "CI_TIMEOUT"
  }

  /**
   * Documented value. Wire value: `ALREADY_MERGED`.
   */
  public data object AlreadyMerged : InlineWebhookPullRequestDequeuedReasonXc688727e() {
    public override val `value`: String = "ALREADY_MERGED"
  }

  /**
   * Documented value. Wire value: `QUEUE_CLEARED`.
   */
  public data object QueueCleared : InlineWebhookPullRequestDequeuedReasonXc688727e() {
    public override val `value`: String = "QUEUE_CLEARED"
  }

  /**
   * Documented value. Wire value: `ROLL_BACK`.
   */
  public data object RollBack : InlineWebhookPullRequestDequeuedReasonXc688727e() {
    public override val `value`: String = "ROLL_BACK"
  }

  /**
   * Documented value. Wire value: `BRANCH_PROTECTIONS`.
   */
  public data object BranchProtections : InlineWebhookPullRequestDequeuedReasonXc688727e() {
    public override val `value`: String = "BRANCH_PROTECTIONS"
  }

  /**
   * Documented value. Wire value: `GIT_TREE_INVALID`.
   */
  public data object GitTreeInvalid : InlineWebhookPullRequestDequeuedReasonXc688727e() {
    public override val `value`: String = "GIT_TREE_INVALID"
  }

  /**
   * Documented value. Wire value: `INVALID_MERGE_COMMIT`.
   */
  public data object InvalidMergeCommit : InlineWebhookPullRequestDequeuedReasonXc688727e() {
    public override val `value`: String = "INVALID_MERGE_COMMIT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestDequeuedReasonXc688727e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestDequeuedReasonXc688727e = when (value) {
      UnknownRemovalReason.value -> UnknownRemovalReason
      Manual.value -> Manual
      Merge.value -> Merge
      MergeConflict.value -> MergeConflict
      CiFailure.value -> CiFailure
      CiTimeout.value -> CiTimeout
      AlreadyMerged.value -> AlreadyMerged
      QueueCleared.value -> QueueCleared
      RollBack.value -> RollBack
      BranchProtections.value -> BranchProtections
      GitTreeInvalid.value -> GitTreeInvalid
      InvalidMergeCommit.value -> InvalidMergeCommit
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestDequeuedReasonXc688727e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestDequeuedReasonXc688727e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestDequeuedReasonXc688727e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestDequeuedReasonXc688727e) {
      encoder.encodeString(value.value)
    }
  }
}
