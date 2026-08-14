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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}/patch/requestBody/content/application~1json/schema/prope
 * rties/merge_commit_message
 */
@Serializable(with = InlineReposPatchRequestJsonMergeCommitMessageX5456f66a.Serializer::class)
public sealed class InlineReposPatchRequestJsonMergeCommitMessageX5456f66a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineReposPatchRequestJsonMergeCommitMessageX5456f66a() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineReposPatchRequestJsonMergeCommitMessageX5456f66a() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineReposPatchRequestJsonMergeCommitMessageX5456f66a() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPatchRequestJsonMergeCommitMessageX5456f66a()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPatchRequestJsonMergeCommitMessageX5456f66a = when (value) {
      PrBody.value -> PrBody
      PrTitle.value -> PrTitle
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposPatchRequestJsonMergeCommitMessageX5456f66a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposPatchRequestJsonMergeCommitMessageX5456f66a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPatchRequestJsonMergeCommitMessageX5456f66a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPatchRequestJsonMergeCommitMessageX5456f66a) {
      encoder.encodeString(value.value)
    }
  }
}
