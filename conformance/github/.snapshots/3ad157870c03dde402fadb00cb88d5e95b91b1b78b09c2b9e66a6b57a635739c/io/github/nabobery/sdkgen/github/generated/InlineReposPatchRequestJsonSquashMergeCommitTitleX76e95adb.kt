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
 * Required when using `squash_merge_commit_message`.
 *
 * The default value for a squash merge commit title:
 *
 * - `PR_TITLE` - default to the pull request's title.
 * - `COMMIT_OR_PR_TITLE` - default to the commit's title (if only one commit) or the pull request's title (when more
 * than one commit).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}/patch/requestBody/content/application~1json/schema/prope
 * rties/squash_merge_commit_title
 */
@Serializable(with = InlineReposPatchRequestJsonSquashMergeCommitTitleX76e95adb.Serializer::class)
public sealed class InlineReposPatchRequestJsonSquashMergeCommitTitleX76e95adb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineReposPatchRequestJsonSquashMergeCommitTitleX76e95adb() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `COMMIT_OR_PR_TITLE`.
   */
  public data object CommitOrPrTitle : InlineReposPatchRequestJsonSquashMergeCommitTitleX76e95adb() {
    public override val `value`: String = "COMMIT_OR_PR_TITLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPatchRequestJsonSquashMergeCommitTitleX76e95adb()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPatchRequestJsonSquashMergeCommitTitleX76e95adb = when (value) {
      PrTitle.value -> PrTitle
      CommitOrPrTitle.value -> CommitOrPrTitle
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposPatchRequestJsonSquashMergeCommitTitleX76e95adb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposPatchRequestJsonSquashMergeCommitTitleX76e95adb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPatchRequestJsonSquashMergeCommitTitleX76e95adb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPatchRequestJsonSquashMergeCommitTitleX76e95adb) {
      encoder.encodeString(value.value)
    }
  }
}
