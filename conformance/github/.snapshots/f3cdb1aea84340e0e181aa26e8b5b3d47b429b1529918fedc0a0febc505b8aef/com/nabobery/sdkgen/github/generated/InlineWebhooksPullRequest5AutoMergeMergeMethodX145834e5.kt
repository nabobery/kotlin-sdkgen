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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/auto_merge/properties/merge_metho
 * d
 */
@Serializable(with = InlineWebhooksPullRequest5AutoMergeMergeMethodX145834e5.Serializer::class)
public sealed class InlineWebhooksPullRequest5AutoMergeMergeMethodX145834e5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `merge`.
   */
  public data object Merge : InlineWebhooksPullRequest5AutoMergeMergeMethodX145834e5() {
    public override val `value`: String = "merge"
  }

  /**
   * Documented value. Wire value: `squash`.
   */
  public data object Squash : InlineWebhooksPullRequest5AutoMergeMergeMethodX145834e5() {
    public override val `value`: String = "squash"
  }

  /**
   * Documented value. Wire value: `rebase`.
   */
  public data object Rebase : InlineWebhooksPullRequest5AutoMergeMergeMethodX145834e5() {
    public override val `value`: String = "rebase"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksPullRequest5AutoMergeMergeMethodX145834e5()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksPullRequest5AutoMergeMergeMethodX145834e5 = when (value) {
      Merge.value -> Merge
      Squash.value -> Squash
      Rebase.value -> Rebase
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksPullRequest5AutoMergeMergeMethodX145834e5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksPullRequest5AutoMergeMergeMethodX145834e5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5AutoMergeMergeMethodX145834e5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5AutoMergeMergeMethodX145834e5) {
      encoder.encodeString(value.value)
    }
  }
}
