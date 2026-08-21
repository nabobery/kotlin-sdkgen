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
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1repos/post/requestBody/content/application~1json/schema/properties
 * /merge_commit_message
 */
@Serializable(with = InlineOrgsReposPostRequestJsonMergeCommitMessageXb26cc696.Serializer::class)
public sealed class InlineOrgsReposPostRequestJsonMergeCommitMessageXb26cc696 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineOrgsReposPostRequestJsonMergeCommitMessageXb26cc696() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineOrgsReposPostRequestJsonMergeCommitMessageXb26cc696() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineOrgsReposPostRequestJsonMergeCommitMessageXb26cc696() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsReposPostRequestJsonMergeCommitMessageXb26cc696()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsReposPostRequestJsonMergeCommitMessageXb26cc696 = when (value) {
      PrBody.value -> PrBody
      PrTitle.value -> PrTitle
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsReposPostRequestJsonMergeCommitMessageXb26cc696> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsReposPostRequestJsonMergeCommitMessageXb26cc696", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsReposPostRequestJsonMergeCommitMessageXb26cc696 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsReposPostRequestJsonMergeCommitMessageXb26cc696) {
      encoder.encodeString(value.value)
    }
  }
}
