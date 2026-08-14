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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-repository-webhooks/properties/merge_commit_message
 */
@Serializable(with = InlineNullableRepositoryWebhooksMergeCommitMessageXa05d6245.Serializer::class)
public sealed class InlineNullableRepositoryWebhooksMergeCommitMessageXa05d6245 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineNullableRepositoryWebhooksMergeCommitMessageXa05d6245() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineNullableRepositoryWebhooksMergeCommitMessageXa05d6245() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineNullableRepositoryWebhooksMergeCommitMessageXa05d6245() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineNullableRepositoryWebhooksMergeCommitMessageXa05d6245()

  public companion object {
    public fun fromValue(`value`: String): InlineNullableRepositoryWebhooksMergeCommitMessageXa05d6245 = when (value) {
      PrBody.value -> PrBody
      PrTitle.value -> PrTitle
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineNullableRepositoryWebhooksMergeCommitMessageXa05d6245> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineNullableRepositoryWebhooksMergeCommitMessageXa05d6245", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineNullableRepositoryWebhooksMergeCommitMessageXa05d6245 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineNullableRepositoryWebhooksMergeCommitMessageXa05d6245) {
      encoder.encodeString(value.value)
    }
  }
}
