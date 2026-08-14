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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/pull_request/proper
 * ties/auto_merge/properties/merge_method
 */
@Serializable(with = InlineWebhookPullRequestReviewDismissedPullRequestAutoMergeMergeMethodXaf68dc30.Serializer::class)
public sealed class InlineWebhookPullRequestReviewDismissedPullRequestAutoMergeMergeMethodXaf68dc30 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merge`.
   */
  public data object Merge : InlineWebhookPullRequestReviewDismissedPullRequestAutoMergeMergeMethodXaf68dc30() {
    public override val `value`: String = "merge"
  }

  /**
   * Documented value. Wire value: `squash`.
   */
  public data object Squash : InlineWebhookPullRequestReviewDismissedPullRequestAutoMergeMergeMethodXaf68dc30() {
    public override val `value`: String = "squash"
  }

  /**
   * Documented value. Wire value: `rebase`.
   */
  public data object Rebase : InlineWebhookPullRequestReviewDismissedPullRequestAutoMergeMergeMethodXaf68dc30() {
    public override val `value`: String = "rebase"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewDismissedPullRequestAutoMergeMergeMethodXaf68dc30()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewDismissedPullRequestAutoMergeMergeMethodXaf68dc30 = when (value) {
      Merge.value -> Merge
      Squash.value -> Squash
      Rebase.value -> Rebase
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewDismissedPullRequestAutoMergeMergeMethodXaf68dc30> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewDismissedPullRequestAutoMergeMergeMethodXaf68dc30", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewDismissedPullRequestAutoMergeMergeMethodXaf68dc30 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewDismissedPullRequestAutoMergeMergeMethodXaf68dc30) {
      encoder.encodeString(value.value)
    }
  }
}
