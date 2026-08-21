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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/auto
 * _merge/properties/merge_method
 */
@Serializable(with = InlineWebhookPullRequestStackedPullRequestAutoMergeMergeMethodXd3606b79.Serializer::class)
public sealed class InlineWebhookPullRequestStackedPullRequestAutoMergeMergeMethodXd3606b79 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merge`.
   */
  public data object Merge : InlineWebhookPullRequestStackedPullRequestAutoMergeMergeMethodXd3606b79() {
    public override val `value`: String = "merge"
  }

  /**
   * Documented value. Wire value: `squash`.
   */
  public data object Squash : InlineWebhookPullRequestStackedPullRequestAutoMergeMergeMethodXd3606b79() {
    public override val `value`: String = "squash"
  }

  /**
   * Documented value. Wire value: `rebase`.
   */
  public data object Rebase : InlineWebhookPullRequestStackedPullRequestAutoMergeMergeMethodXd3606b79() {
    public override val `value`: String = "rebase"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestStackedPullRequestAutoMergeMergeMethodXd3606b79()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestStackedPullRequestAutoMergeMergeMethodXd3606b79 = when (value) {
      Merge.value -> Merge
      Squash.value -> Squash
      Rebase.value -> Rebase
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestStackedPullRequestAutoMergeMergeMethodXd3606b79> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestStackedPullRequestAutoMergeMergeMethodXd3606b79", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestStackedPullRequestAutoMergeMergeMethodXd3606b79 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestStackedPullRequestAutoMergeMergeMethodXd3606b79) {
      encoder.encodeString(value.value)
    }
  }
}
