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
 * sdkgen://source/openapi.yaml#/paths/~1user~1repos/post/requestBody/content/application~1json/schema/properties/merge_
 * commit_message
 */
@Serializable(with = InlineUserReposPostRequestJsonMergeCommitMessageX0c0cfebd.Serializer::class)
public sealed class InlineUserReposPostRequestJsonMergeCommitMessageX0c0cfebd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineUserReposPostRequestJsonMergeCommitMessageX0c0cfebd() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineUserReposPostRequestJsonMergeCommitMessageX0c0cfebd() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineUserReposPostRequestJsonMergeCommitMessageX0c0cfebd() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUserReposPostRequestJsonMergeCommitMessageX0c0cfebd()

  public companion object {
    public fun fromValue(`value`: String): InlineUserReposPostRequestJsonMergeCommitMessageX0c0cfebd = when (value) {
      PrBody.value -> PrBody
      PrTitle.value -> PrTitle
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUserReposPostRequestJsonMergeCommitMessageX0c0cfebd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineUserReposPostRequestJsonMergeCommitMessageX0c0cfebd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUserReposPostRequestJsonMergeCommitMessageX0c0cfebd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUserReposPostRequestJsonMergeCommitMessageX0c0cfebd) {
      encoder.encodeString(value.value)
    }
  }
}
