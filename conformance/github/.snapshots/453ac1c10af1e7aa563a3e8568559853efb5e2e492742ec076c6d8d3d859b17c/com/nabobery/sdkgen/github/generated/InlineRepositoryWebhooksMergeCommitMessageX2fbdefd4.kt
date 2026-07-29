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
 * The default value for a merge commit message.
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `PR_BODY` - default to the pull request's body.
 * - `BLANK` - default to a blank commit message.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-webhooks/properties/merge_commit_message
 */
@Serializable(with = InlineRepositoryWebhooksMergeCommitMessageX2fbdefd4.Serializer::class)
public sealed class InlineRepositoryWebhooksMergeCommitMessageX2fbdefd4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineRepositoryWebhooksMergeCommitMessageX2fbdefd4() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineRepositoryWebhooksMergeCommitMessageX2fbdefd4() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineRepositoryWebhooksMergeCommitMessageX2fbdefd4() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryWebhooksMergeCommitMessageX2fbdefd4()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryWebhooksMergeCommitMessageX2fbdefd4 = when (value) {
      PrBody.value -> PrBody
      PrTitle.value -> PrTitle
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineRepositoryWebhooksMergeCommitMessageX2fbdefd4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryWebhooksMergeCommitMessageX2fbdefd4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryWebhooksMergeCommitMessageX2fbdefd4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryWebhooksMergeCommitMessageX2fbdefd4) {
      encoder.encodeString(value.value)
    }
  }
}
