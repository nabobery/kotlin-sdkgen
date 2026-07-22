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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * auto_merge/properties/merge_method
 */
@Serializable(with = InlineWebhookPullRequestSynchronizePullRequestAutoMergeMergeMethodXba8ab73f.Serializer::class)
public sealed class InlineWebhookPullRequestSynchronizePullRequestAutoMergeMergeMethodXba8ab73f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merge`.
   */
  public data object Merge : InlineWebhookPullRequestSynchronizePullRequestAutoMergeMergeMethodXba8ab73f() {
    public override val `value`: String = "merge"
  }

  /**
   * Documented value. Wire value: `squash`.
   */
  public data object Squash : InlineWebhookPullRequestSynchronizePullRequestAutoMergeMergeMethodXba8ab73f() {
    public override val `value`: String = "squash"
  }

  /**
   * Documented value. Wire value: `rebase`.
   */
  public data object Rebase : InlineWebhookPullRequestSynchronizePullRequestAutoMergeMergeMethodXba8ab73f() {
    public override val `value`: String = "rebase"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestSynchronizePullRequestAutoMergeMergeMethodXba8ab73f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestSynchronizePullRequestAutoMergeMergeMethodXba8ab73f = when (value) {
      Merge.value -> Merge
      Squash.value -> Squash
      Rebase.value -> Rebase
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestSynchronizePullRequestAutoMergeMergeMethodXba8ab73f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestSynchronizePullRequestAutoMergeMergeMethodXba8ab73f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestSynchronizePullRequestAutoMergeMergeMethodXba8ab73f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestSynchronizePullRequestAutoMergeMergeMethodXba8ab73f) {
      encoder.encodeString(value.value)
    }
  }
}
