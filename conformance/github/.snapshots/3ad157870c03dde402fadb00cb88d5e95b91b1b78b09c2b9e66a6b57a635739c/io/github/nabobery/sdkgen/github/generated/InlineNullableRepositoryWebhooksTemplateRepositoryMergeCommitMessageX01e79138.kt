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
 * The default value for a merge commit message.
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `PR_BODY` - default to the pull request's body.
 * - `BLANK` - default to a blank commit message.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/nullable-repository-webhooks/properties/template_repository/properti
 * es/merge_commit_message
 */
@Serializable(with = InlineNullableRepositoryWebhooksTemplateRepositoryMergeCommitMessageX01e79138.Serializer::class)
public sealed class InlineNullableRepositoryWebhooksTemplateRepositoryMergeCommitMessageX01e79138 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineNullableRepositoryWebhooksTemplateRepositoryMergeCommitMessageX01e79138() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineNullableRepositoryWebhooksTemplateRepositoryMergeCommitMessageX01e79138() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineNullableRepositoryWebhooksTemplateRepositoryMergeCommitMessageX01e79138() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineNullableRepositoryWebhooksTemplateRepositoryMergeCommitMessageX01e79138()

  public companion object {
    public fun fromValue(`value`: String): InlineNullableRepositoryWebhooksTemplateRepositoryMergeCommitMessageX01e79138 = when (value) {
      PrBody.value -> PrBody
      PrTitle.value -> PrTitle
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineNullableRepositoryWebhooksTemplateRepositoryMergeCommitMessageX01e79138> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineNullableRepositoryWebhooksTemplateRepositoryMergeCommitMessageX01e79138", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineNullableRepositoryWebhooksTemplateRepositoryMergeCommitMessageX01e79138 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineNullableRepositoryWebhooksTemplateRepositoryMergeCommitMessageX01e79138) {
      encoder.encodeString(value.value)
    }
  }
}
