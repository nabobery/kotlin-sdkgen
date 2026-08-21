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
 * The default value for a squash merge commit message:
 *
 * - `PR_BODY` - default to the pull request's body.
 * - `COMMIT_MESSAGES` - default to the branch's commit messages.
 * - `BLANK` - default to a blank commit message.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1repos/post/requestBody/content/application~1json/schema/properties/squash
 * _merge_commit_message
 */
@Serializable(with = InlineUserReposPostRequestJsonSquashMergeCommitMessageXcdc7ea1a.Serializer::class)
public sealed class InlineUserReposPostRequestJsonSquashMergeCommitMessageXcdc7ea1a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineUserReposPostRequestJsonSquashMergeCommitMessageXcdc7ea1a() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `COMMIT_MESSAGES`.
   */
  public data object CommitMessages : InlineUserReposPostRequestJsonSquashMergeCommitMessageXcdc7ea1a() {
    public override val `value`: String = "COMMIT_MESSAGES"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineUserReposPostRequestJsonSquashMergeCommitMessageXcdc7ea1a() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUserReposPostRequestJsonSquashMergeCommitMessageXcdc7ea1a()

  public companion object {
    public fun fromValue(`value`: String): InlineUserReposPostRequestJsonSquashMergeCommitMessageXcdc7ea1a = when (value) {
      PrBody.value -> PrBody
      CommitMessages.value -> CommitMessages
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUserReposPostRequestJsonSquashMergeCommitMessageXcdc7ea1a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUserReposPostRequestJsonSquashMergeCommitMessageXcdc7ea1a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUserReposPostRequestJsonSquashMergeCommitMessageXcdc7ea1a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUserReposPostRequestJsonSquashMergeCommitMessageXcdc7ea1a) {
      encoder.encodeString(value.value)
    }
  }
}
