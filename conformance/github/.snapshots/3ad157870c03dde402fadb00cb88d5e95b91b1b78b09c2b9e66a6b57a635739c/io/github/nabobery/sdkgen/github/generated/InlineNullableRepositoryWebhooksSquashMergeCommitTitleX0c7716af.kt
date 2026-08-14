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
 * The default value for a squash merge commit title:
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more
 * than one commit).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/nullable-repository-webhooks/properties/squash_merge_commit_title
 */
@Serializable(with = InlineNullableRepositoryWebhooksSquashMergeCommitTitleX0c7716af.Serializer::class)
public sealed class InlineNullableRepositoryWebhooksSquashMergeCommitTitleX0c7716af {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineNullableRepositoryWebhooksSquashMergeCommitTitleX0c7716af() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `COMMIT_OR_PR_TITLE`.
   */
  public data object CommitOrPrTitle : InlineNullableRepositoryWebhooksSquashMergeCommitTitleX0c7716af() {
    public override val `value`: String = "COMMIT_OR_PR_TITLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineNullableRepositoryWebhooksSquashMergeCommitTitleX0c7716af()

  public companion object {
    public fun fromValue(`value`: String): InlineNullableRepositoryWebhooksSquashMergeCommitTitleX0c7716af = when (value) {
      PrTitle.value -> PrTitle
      CommitOrPrTitle.value -> CommitOrPrTitle
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineNullableRepositoryWebhooksSquashMergeCommitTitleX0c7716af> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineNullableRepositoryWebhooksSquashMergeCommitTitleX0c7716af", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineNullableRepositoryWebhooksSquashMergeCommitTitleX0c7716af = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineNullableRepositoryWebhooksSquashMergeCommitTitleX0c7716af) {
      encoder.encodeString(value.value)
    }
  }
}
