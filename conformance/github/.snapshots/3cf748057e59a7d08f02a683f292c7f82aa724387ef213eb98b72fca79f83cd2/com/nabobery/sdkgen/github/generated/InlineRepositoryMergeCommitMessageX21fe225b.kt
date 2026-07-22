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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository/properties/merge_commit_message
 */
@Serializable(with = InlineRepositoryMergeCommitMessageX21fe225b.Serializer::class)
public sealed class InlineRepositoryMergeCommitMessageX21fe225b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineRepositoryMergeCommitMessageX21fe225b() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineRepositoryMergeCommitMessageX21fe225b() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineRepositoryMergeCommitMessageX21fe225b() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryMergeCommitMessageX21fe225b()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryMergeCommitMessageX21fe225b = when (value) {
      PrBody.value -> PrBody
      PrTitle.value -> PrTitle
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineRepositoryMergeCommitMessageX21fe225b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryMergeCommitMessageX21fe225b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryMergeCommitMessageX21fe225b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryMergeCommitMessageX21fe225b) {
      encoder.encodeString(value.value)
    }
  }
}
