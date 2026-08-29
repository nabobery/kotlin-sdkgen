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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/full-repository/properties/squash_merge_commit_message
 */
@Serializable(with = InlineFullRepositorySquashMergeCommitMessageX17602f43.Serializer::class)
public sealed class InlineFullRepositorySquashMergeCommitMessageX17602f43 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineFullRepositorySquashMergeCommitMessageX17602f43() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `COMMIT_MESSAGES`.
   */
  public data object CommitMessages : InlineFullRepositorySquashMergeCommitMessageX17602f43() {
    public override val `value`: String = "COMMIT_MESSAGES"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineFullRepositorySquashMergeCommitMessageX17602f43() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFullRepositorySquashMergeCommitMessageX17602f43()

  public companion object {
    public fun fromValue(`value`: String): InlineFullRepositorySquashMergeCommitMessageX17602f43 = when (value) {
      PrBody.value -> PrBody
      CommitMessages.value -> CommitMessages
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFullRepositorySquashMergeCommitMessageX17602f43> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineFullRepositorySquashMergeCommitMessageX17602f43", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFullRepositorySquashMergeCommitMessageX17602f43 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFullRepositorySquashMergeCommitMessageX17602f43) {
      encoder.encodeString(value.value)
    }
  }
}
