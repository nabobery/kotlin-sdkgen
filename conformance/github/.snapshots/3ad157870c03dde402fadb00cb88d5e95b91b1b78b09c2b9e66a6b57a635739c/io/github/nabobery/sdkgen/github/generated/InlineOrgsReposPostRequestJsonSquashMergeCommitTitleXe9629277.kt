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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1repos/post/requestBody/content/application~1json/schema/properties
 * /squash_merge_commit_title
 */
@Serializable(with = InlineOrgsReposPostRequestJsonSquashMergeCommitTitleXe9629277.Serializer::class)
public sealed class InlineOrgsReposPostRequestJsonSquashMergeCommitTitleXe9629277 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineOrgsReposPostRequestJsonSquashMergeCommitTitleXe9629277() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `COMMIT_OR_PR_TITLE`.
   */
  public data object CommitOrPrTitle : InlineOrgsReposPostRequestJsonSquashMergeCommitTitleXe9629277() {
    public override val `value`: String = "COMMIT_OR_PR_TITLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsReposPostRequestJsonSquashMergeCommitTitleXe9629277()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsReposPostRequestJsonSquashMergeCommitTitleXe9629277 = when (value) {
      PrTitle.value -> PrTitle
      CommitOrPrTitle.value -> CommitOrPrTitle
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsReposPostRequestJsonSquashMergeCommitTitleXe9629277> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsReposPostRequestJsonSquashMergeCommitTitleXe9629277", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsReposPostRequestJsonSquashMergeCommitTitleXe9629277 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsReposPostRequestJsonSquashMergeCommitTitleXe9629277) {
      encoder.encodeString(value.value)
    }
  }
}
