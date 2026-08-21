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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1repos/post/requestBody/content/application~1json/schema/properties
 * /squash_merge_commit_message
 */
@Serializable(with = InlineOrgsReposPostRequestJsonSquashMergeCommitMessageX79090936.Serializer::class)
public sealed class InlineOrgsReposPostRequestJsonSquashMergeCommitMessageX79090936 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineOrgsReposPostRequestJsonSquashMergeCommitMessageX79090936() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `COMMIT_MESSAGES`.
   */
  public data object CommitMessages : InlineOrgsReposPostRequestJsonSquashMergeCommitMessageX79090936() {
    public override val `value`: String = "COMMIT_MESSAGES"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineOrgsReposPostRequestJsonSquashMergeCommitMessageX79090936() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsReposPostRequestJsonSquashMergeCommitMessageX79090936()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsReposPostRequestJsonSquashMergeCommitMessageX79090936 = when (value) {
      PrBody.value -> PrBody
      CommitMessages.value -> CommitMessages
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsReposPostRequestJsonSquashMergeCommitMessageX79090936> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsReposPostRequestJsonSquashMergeCommitMessageX79090936", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsReposPostRequestJsonSquashMergeCommitMessageX79090936 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsReposPostRequestJsonSquashMergeCommitMessageX79090936) {
      encoder.encodeString(value.value)
    }
  }
}
