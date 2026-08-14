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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/pull_request/propertie
 * s/auto_merge/properties/merge_method
 */
@Serializable(with = InlineWebhookPullRequestReviewEditedPullRequestAutoMergeMergeMethodX665d2c6d.Serializer::class)
public sealed class InlineWebhookPullRequestReviewEditedPullRequestAutoMergeMergeMethodX665d2c6d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merge`.
   */
  public data object Merge : InlineWebhookPullRequestReviewEditedPullRequestAutoMergeMergeMethodX665d2c6d() {
    public override val `value`: String = "merge"
  }

  /**
   * Documented value. Wire value: `squash`.
   */
  public data object Squash : InlineWebhookPullRequestReviewEditedPullRequestAutoMergeMergeMethodX665d2c6d() {
    public override val `value`: String = "squash"
  }

  /**
   * Documented value. Wire value: `rebase`.
   */
  public data object Rebase : InlineWebhookPullRequestReviewEditedPullRequestAutoMergeMergeMethodX665d2c6d() {
    public override val `value`: String = "rebase"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewEditedPullRequestAutoMergeMergeMethodX665d2c6d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewEditedPullRequestAutoMergeMergeMethodX665d2c6d = when (value) {
      Merge.value -> Merge
      Squash.value -> Squash
      Rebase.value -> Rebase
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewEditedPullRequestAutoMergeMergeMethodX665d2c6d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewEditedPullRequestAutoMergeMergeMethodX665d2c6d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewEditedPullRequestAutoMergeMergeMethodX665d2c6d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewEditedPullRequestAutoMergeMergeMethodX665d2c6d) {
      encoder.encodeString(value.value)
    }
  }
}
