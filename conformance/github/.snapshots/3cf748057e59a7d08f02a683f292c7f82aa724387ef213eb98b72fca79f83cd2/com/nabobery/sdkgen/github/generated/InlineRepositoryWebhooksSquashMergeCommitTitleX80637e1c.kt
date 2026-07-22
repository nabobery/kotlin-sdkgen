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
 * The default value for a squash merge commit title:
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more
 * than one commit).
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-webhooks/properties/squash_merge_commit_title
 */
@Serializable(with = InlineRepositoryWebhooksSquashMergeCommitTitleX80637e1c.Serializer::class)
public sealed class InlineRepositoryWebhooksSquashMergeCommitTitleX80637e1c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineRepositoryWebhooksSquashMergeCommitTitleX80637e1c() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `COMMIT_OR_PR_TITLE`.
   */
  public data object CommitOrPrTitle : InlineRepositoryWebhooksSquashMergeCommitTitleX80637e1c() {
    public override val `value`: String = "COMMIT_OR_PR_TITLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryWebhooksSquashMergeCommitTitleX80637e1c()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryWebhooksSquashMergeCommitTitleX80637e1c = when (value) {
      PrTitle.value -> PrTitle
      CommitOrPrTitle.value -> CommitOrPrTitle
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineRepositoryWebhooksSquashMergeCommitTitleX80637e1c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryWebhooksSquashMergeCommitTitleX80637e1c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryWebhooksSquashMergeCommitTitleX80637e1c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryWebhooksSquashMergeCommitTitleX80637e1c) {
      encoder.encodeString(value.value)
    }
  }
}
