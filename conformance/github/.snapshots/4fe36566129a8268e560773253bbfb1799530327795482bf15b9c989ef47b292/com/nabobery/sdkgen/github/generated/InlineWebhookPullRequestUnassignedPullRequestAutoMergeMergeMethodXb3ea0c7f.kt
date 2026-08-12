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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/a
 * uto_merge/properties/merge_method
 */
@Serializable(with = InlineWebhookPullRequestUnassignedPullRequestAutoMergeMergeMethodXb3ea0c7f.Serializer::class)
public sealed class InlineWebhookPullRequestUnassignedPullRequestAutoMergeMergeMethodXb3ea0c7f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merge`.
   */
  public data object Merge : InlineWebhookPullRequestUnassignedPullRequestAutoMergeMergeMethodXb3ea0c7f() {
    public override val `value`: String = "merge"
  }

  /**
   * Documented value. Wire value: `squash`.
   */
  public data object Squash : InlineWebhookPullRequestUnassignedPullRequestAutoMergeMergeMethodXb3ea0c7f() {
    public override val `value`: String = "squash"
  }

  /**
   * Documented value. Wire value: `rebase`.
   */
  public data object Rebase : InlineWebhookPullRequestUnassignedPullRequestAutoMergeMergeMethodXb3ea0c7f() {
    public override val `value`: String = "rebase"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUnassignedPullRequestAutoMergeMergeMethodXb3ea0c7f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUnassignedPullRequestAutoMergeMergeMethodXb3ea0c7f = when (value) {
      Merge.value -> Merge
      Squash.value -> Squash
      Rebase.value -> Rebase
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnassignedPullRequestAutoMergeMergeMethodXb3ea0c7f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUnassignedPullRequestAutoMergeMergeMethodXb3ea0c7f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnassignedPullRequestAutoMergeMergeMethodXb3ea0c7f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnassignedPullRequestAutoMergeMergeMethodXb3ea0c7f) {
      encoder.encodeString(value.value)
    }
  }
}
