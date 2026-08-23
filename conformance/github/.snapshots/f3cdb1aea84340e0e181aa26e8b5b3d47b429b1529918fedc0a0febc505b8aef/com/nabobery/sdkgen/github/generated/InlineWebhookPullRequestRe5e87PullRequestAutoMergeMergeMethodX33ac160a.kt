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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/pull_reques
 * t/properties/auto_merge/properties/merge_method
 */
@Serializable(with = InlineWebhookPullRequestRe5e87PullRequestAutoMergeMergeMethodX33ac160a.Serializer::class)
public sealed class InlineWebhookPullRequestRe5e87PullRequestAutoMergeMergeMethodX33ac160a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merge`.
   */
  public data object Merge : InlineWebhookPullRequestRe5e87PullRequestAutoMergeMergeMethodX33ac160a() {
    public override val `value`: String = "merge"
  }

  /**
   * Documented value. Wire value: `squash`.
   */
  public data object Squash : InlineWebhookPullRequestRe5e87PullRequestAutoMergeMergeMethodX33ac160a() {
    public override val `value`: String = "squash"
  }

  /**
   * Documented value. Wire value: `rebase`.
   */
  public data object Rebase : InlineWebhookPullRequestRe5e87PullRequestAutoMergeMergeMethodX33ac160a() {
    public override val `value`: String = "rebase"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe5e87PullRequestAutoMergeMergeMethodX33ac160a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe5e87PullRequestAutoMergeMergeMethodX33ac160a = when (value) {
      Merge.value -> Merge
      Squash.value -> Squash
      Rebase.value -> Rebase
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe5e87PullRequestAutoMergeMergeMethodX33ac160a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe5e87PullRequestAutoMergeMergeMethodX33ac160a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe5e87PullRequestAutoMergeMergeMethodX33ac160a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe5e87PullRequestAutoMergeMergeMethodX33ac160a) {
      encoder.encodeString(value.value)
    }
  }
}
