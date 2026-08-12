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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/pull_request/properties/au
 * to_merge/properties/merge_method
 */
@Serializable(with = InlineWebhookPullRequestUnlabeledPullRequestAutoMergeMergeMethodXfa1dea47.Serializer::class)
public sealed class InlineWebhookPullRequestUnlabeledPullRequestAutoMergeMergeMethodXfa1dea47 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merge`.
   */
  public data object Merge : InlineWebhookPullRequestUnlabeledPullRequestAutoMergeMergeMethodXfa1dea47() {
    public override val `value`: String = "merge"
  }

  /**
   * Documented value. Wire value: `squash`.
   */
  public data object Squash : InlineWebhookPullRequestUnlabeledPullRequestAutoMergeMergeMethodXfa1dea47() {
    public override val `value`: String = "squash"
  }

  /**
   * Documented value. Wire value: `rebase`.
   */
  public data object Rebase : InlineWebhookPullRequestUnlabeledPullRequestAutoMergeMergeMethodXfa1dea47() {
    public override val `value`: String = "rebase"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUnlabeledPullRequestAutoMergeMergeMethodXfa1dea47()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUnlabeledPullRequestAutoMergeMergeMethodXfa1dea47 = when (value) {
      Merge.value -> Merge
      Squash.value -> Squash
      Rebase.value -> Rebase
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnlabeledPullRequestAutoMergeMergeMethodXfa1dea47> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUnlabeledPullRequestAutoMergeMergeMethodXfa1dea47", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlabeledPullRequestAutoMergeMergeMethodXfa1dea47 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlabeledPullRequestAutoMergeMergeMethodXfa1dea47) {
      encoder.encodeString(value.value)
    }
  }
}
