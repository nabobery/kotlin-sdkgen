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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/full-repository/properties/merge_commit_message
 */
@Serializable(with = InlineFullRepositoryMergeCommitMessageX0baec2f1.Serializer::class)
public sealed class InlineFullRepositoryMergeCommitMessageX0baec2f1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineFullRepositoryMergeCommitMessageX0baec2f1() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineFullRepositoryMergeCommitMessageX0baec2f1() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineFullRepositoryMergeCommitMessageX0baec2f1() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFullRepositoryMergeCommitMessageX0baec2f1()

  public companion object {
    public fun fromValue(`value`: String): InlineFullRepositoryMergeCommitMessageX0baec2f1 = when (value) {
      PrBody.value -> PrBody
      PrTitle.value -> PrTitle
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineFullRepositoryMergeCommitMessageX0baec2f1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineFullRepositoryMergeCommitMessageX0baec2f1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFullRepositoryMergeCommitMessageX0baec2f1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFullRepositoryMergeCommitMessageX0baec2f1) {
      encoder.encodeString(value.value)
    }
  }
}
