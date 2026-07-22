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
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `MERGE_MESSAGE` - default to the classic title for a merge message (e.g., Merge pull request #123 from
 * branch-name).
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-repository-webhooks/properties/merge_commit_title
 */
@Serializable(with = InlineNullableRepositoryWebhooksMergeCommitTitleX7377c8ff.Serializer::class)
public sealed class InlineNullableRepositoryWebhooksMergeCommitTitleX7377c8ff {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineNullableRepositoryWebhooksMergeCommitTitleX7377c8ff() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `MERGE_MESSAGE`.
   */
  public data object MergeMessage : InlineNullableRepositoryWebhooksMergeCommitTitleX7377c8ff() {
    public override val `value`: String = "MERGE_MESSAGE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineNullableRepositoryWebhooksMergeCommitTitleX7377c8ff()

  public companion object {
    public fun fromValue(`value`: String): InlineNullableRepositoryWebhooksMergeCommitTitleX7377c8ff = when (value) {
      PrTitle.value -> PrTitle
      MergeMessage.value -> MergeMessage
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineNullableRepositoryWebhooksMergeCommitTitleX7377c8ff> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineNullableRepositoryWebhooksMergeCommitTitleX7377c8ff", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineNullableRepositoryWebhooksMergeCommitTitleX7377c8ff = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineNullableRepositoryWebhooksMergeCommitTitleX7377c8ff) {
      encoder.encodeString(value.value)
    }
  }
}
