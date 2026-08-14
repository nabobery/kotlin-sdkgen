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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/1/properties/pull_
 * request/properties/auto_merge/properties/merge_method
 */
@Serializable(with = InlineWebhookPullRequestReacd1OneOf2PullRequestAutoMergeMergeMethodX3fcb0162.Serializer::class)
public sealed class InlineWebhookPullRequestReacd1OneOf2PullRequestAutoMergeMergeMethodX3fcb0162 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merge`.
   */
  public data object Merge : InlineWebhookPullRequestReacd1OneOf2PullRequestAutoMergeMergeMethodX3fcb0162() {
    public override val `value`: String = "merge"
  }

  /**
   * Documented value. Wire value: `squash`.
   */
  public data object Squash : InlineWebhookPullRequestReacd1OneOf2PullRequestAutoMergeMergeMethodX3fcb0162() {
    public override val `value`: String = "squash"
  }

  /**
   * Documented value. Wire value: `rebase`.
   */
  public data object Rebase : InlineWebhookPullRequestReacd1OneOf2PullRequestAutoMergeMergeMethodX3fcb0162() {
    public override val `value`: String = "rebase"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReacd1OneOf2PullRequestAutoMergeMergeMethodX3fcb0162()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReacd1OneOf2PullRequestAutoMergeMergeMethodX3fcb0162 = when (value) {
      Merge.value -> Merge
      Squash.value -> Squash
      Rebase.value -> Rebase
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReacd1OneOf2PullRequestAutoMergeMergeMethodX3fcb0162> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReacd1OneOf2PullRequestAutoMergeMergeMethodX3fcb0162", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReacd1OneOf2PullRequestAutoMergeMergeMethodX3fcb0162 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReacd1OneOf2PullRequestAutoMergeMergeMethodX3fcb0162) {
      encoder.encodeString(value.value)
    }
  }
}
