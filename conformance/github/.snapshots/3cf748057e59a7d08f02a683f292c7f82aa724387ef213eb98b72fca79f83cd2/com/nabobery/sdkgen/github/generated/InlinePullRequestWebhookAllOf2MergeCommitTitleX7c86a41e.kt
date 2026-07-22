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
 * The default value for a merge commit title.
 * - `PR_TITLE` - default to the pull request's title.
 * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., "Merge pull request #123 from
 * branch-name").
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request-webhook/allOf/1/properties/merge_commit_title
 */
@Serializable(with = InlinePullRequestWebhookAllOf2MergeCommitTitleX7c86a41e.Serializer::class)
public sealed class InlinePullRequestWebhookAllOf2MergeCommitTitleX7c86a41e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlinePullRequestWebhookAllOf2MergeCommitTitleX7c86a41e() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `MERGE_MESSAGE`.
   */
  public data object MergeMessage : InlinePullRequestWebhookAllOf2MergeCommitTitleX7c86a41e() {
    public override val `value`: String = "MERGE_MESSAGE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePullRequestWebhookAllOf2MergeCommitTitleX7c86a41e()

  public companion object {
    public fun fromValue(`value`: String): InlinePullRequestWebhookAllOf2MergeCommitTitleX7c86a41e = when (value) {
      PrTitle.value -> PrTitle
      MergeMessage.value -> MergeMessage
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePullRequestWebhookAllOf2MergeCommitTitleX7c86a41e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlinePullRequestWebhookAllOf2MergeCommitTitleX7c86a41e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePullRequestWebhookAllOf2MergeCommitTitleX7c86a41e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestWebhookAllOf2MergeCommitTitleX7c86a41e) {
      encoder.encodeString(value.value)
    }
  }
}
