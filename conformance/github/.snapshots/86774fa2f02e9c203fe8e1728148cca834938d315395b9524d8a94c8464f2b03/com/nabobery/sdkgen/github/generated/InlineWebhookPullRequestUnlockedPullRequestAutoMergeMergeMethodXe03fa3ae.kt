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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlocked/properties/pull_request/properties/aut
 * o_merge/properties/merge_method
 */
@Serializable(with = InlineWebhookPullRequestUnlockedPullRequestAutoMergeMergeMethodXe03fa3ae.Serializer::class)
public sealed class InlineWebhookPullRequestUnlockedPullRequestAutoMergeMergeMethodXe03fa3ae {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merge`.
   */
  public data object Merge : InlineWebhookPullRequestUnlockedPullRequestAutoMergeMergeMethodXe03fa3ae() {
    public override val `value`: String = "merge"
  }

  /**
   * Documented value. Wire value: `squash`.
   */
  public data object Squash : InlineWebhookPullRequestUnlockedPullRequestAutoMergeMergeMethodXe03fa3ae() {
    public override val `value`: String = "squash"
  }

  /**
   * Documented value. Wire value: `rebase`.
   */
  public data object Rebase : InlineWebhookPullRequestUnlockedPullRequestAutoMergeMergeMethodXe03fa3ae() {
    public override val `value`: String = "rebase"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUnlockedPullRequestAutoMergeMergeMethodXe03fa3ae()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUnlockedPullRequestAutoMergeMergeMethodXe03fa3ae = when (value) {
      Merge.value -> Merge
      Squash.value -> Squash
      Rebase.value -> Rebase
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnlockedPullRequestAutoMergeMergeMethodXe03fa3ae> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUnlockedPullRequestAutoMergeMergeMethodXe03fa3ae", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnlockedPullRequestAutoMergeMergeMethodXe03fa3ae = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnlockedPullRequestAutoMergeMergeMethodXe03fa3ae) {
      encoder.encodeString(value.value)
    }
  }
}
