package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/pull_request/
 * properties/auto_merge/properties/merge_method
 */
@Serializable(with = InlineWebhookPullRequestRe0df9PullRequestAutoMergeMergeMethodX0407f1ad.Serializer::class)
public sealed class InlineWebhookPullRequestRe0df9PullRequestAutoMergeMergeMethodX0407f1ad {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merge`.
   */
  public data object Merge : InlineWebhookPullRequestRe0df9PullRequestAutoMergeMergeMethodX0407f1ad() {
    public override val `value`: String = "merge"
  }

  /**
   * Documented value. Wire value: `squash`.
   */
  public data object Squash : InlineWebhookPullRequestRe0df9PullRequestAutoMergeMergeMethodX0407f1ad() {
    public override val `value`: String = "squash"
  }

  /**
   * Documented value. Wire value: `rebase`.
   */
  public data object Rebase : InlineWebhookPullRequestRe0df9PullRequestAutoMergeMergeMethodX0407f1ad() {
    public override val `value`: String = "rebase"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe0df9PullRequestAutoMergeMergeMethodX0407f1ad()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe0df9PullRequestAutoMergeMergeMethodX0407f1ad = when (value) {
      Merge.value -> Merge
      Squash.value -> Squash
      Rebase.value -> Rebase
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe0df9PullRequestAutoMergeMergeMethodX0407f1ad> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe0df9PullRequestAutoMergeMergeMethodX0407f1ad", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe0df9PullRequestAutoMergeMergeMethodX0407f1ad = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe0df9PullRequestAutoMergeMergeMethodX0407f1ad) {
      encoder.encodeString(value.value)
    }
  }
}
