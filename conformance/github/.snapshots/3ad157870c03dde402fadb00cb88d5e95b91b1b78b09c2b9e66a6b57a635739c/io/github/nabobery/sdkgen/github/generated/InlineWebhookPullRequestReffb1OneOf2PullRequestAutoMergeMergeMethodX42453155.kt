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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/1/properties/pull_reques
 * t/properties/auto_merge/properties/merge_method
 */
@Serializable(with = InlineWebhookPullRequestReffb1OneOf2PullRequestAutoMergeMergeMethodX42453155.Serializer::class)
public sealed class InlineWebhookPullRequestReffb1OneOf2PullRequestAutoMergeMergeMethodX42453155 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merge`.
   */
  public data object Merge : InlineWebhookPullRequestReffb1OneOf2PullRequestAutoMergeMergeMethodX42453155() {
    public override val `value`: String = "merge"
  }

  /**
   * Documented value. Wire value: `squash`.
   */
  public data object Squash : InlineWebhookPullRequestReffb1OneOf2PullRequestAutoMergeMergeMethodX42453155() {
    public override val `value`: String = "squash"
  }

  /**
   * Documented value. Wire value: `rebase`.
   */
  public data object Rebase : InlineWebhookPullRequestReffb1OneOf2PullRequestAutoMergeMergeMethodX42453155() {
    public override val `value`: String = "rebase"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReffb1OneOf2PullRequestAutoMergeMergeMethodX42453155()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReffb1OneOf2PullRequestAutoMergeMergeMethodX42453155 = when (value) {
      Merge.value -> Merge
      Squash.value -> Squash
      Rebase.value -> Rebase
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReffb1OneOf2PullRequestAutoMergeMergeMethodX42453155> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReffb1OneOf2PullRequestAutoMergeMergeMethodX42453155", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReffb1OneOf2PullRequestAutoMergeMergeMethodX42453155 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReffb1OneOf2PullRequestAutoMergeMergeMethodX42453155) {
      encoder.encodeString(value.value)
    }
  }
}
