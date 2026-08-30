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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-repository/properties/squash_merge_commit_message
 */
@Serializable(with = InlineNullableRepositorySquashMergeCommitMessageX500ccd65.Serializer::class)
public sealed class InlineNullableRepositorySquashMergeCommitMessageX500ccd65 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineNullableRepositorySquashMergeCommitMessageX500ccd65() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `COMMIT_MESSAGES`.
   */
  public data object CommitMessages : InlineNullableRepositorySquashMergeCommitMessageX500ccd65() {
    public override val `value`: String = "COMMIT_MESSAGES"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineNullableRepositorySquashMergeCommitMessageX500ccd65() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineNullableRepositorySquashMergeCommitMessageX500ccd65()

  public companion object {
    public fun fromValue(`value`: String): InlineNullableRepositorySquashMergeCommitMessageX500ccd65 = when (value) {
      PrBody.value -> PrBody
      CommitMessages.value -> CommitMessages
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineNullableRepositorySquashMergeCommitMessageX500ccd65> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineNullableRepositorySquashMergeCommitMessageX500ccd65", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineNullableRepositorySquashMergeCommitMessageX500ccd65 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineNullableRepositorySquashMergeCommitMessageX500ccd65) {
      encoder.encodeString(value.value)
    }
  }
}
