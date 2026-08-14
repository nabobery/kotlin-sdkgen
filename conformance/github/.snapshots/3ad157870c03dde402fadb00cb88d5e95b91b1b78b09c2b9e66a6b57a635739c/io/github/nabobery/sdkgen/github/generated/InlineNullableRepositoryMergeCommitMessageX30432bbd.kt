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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-repository/properties/merge_commit_message
 */
@Serializable(with = InlineNullableRepositoryMergeCommitMessageX30432bbd.Serializer::class)
public sealed class InlineNullableRepositoryMergeCommitMessageX30432bbd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `PR_BODY`.
   */
  public data object PrBody : InlineNullableRepositoryMergeCommitMessageX30432bbd() {
    public override val `value`: String = "PR_BODY"
  }

  /**
   * Documented value. Wire value: `PR_TITLE`.
   */
  public data object PrTitle : InlineNullableRepositoryMergeCommitMessageX30432bbd() {
    public override val `value`: String = "PR_TITLE"
  }

  /**
   * Documented value. Wire value: `BLANK`.
   */
  public data object Blank : InlineNullableRepositoryMergeCommitMessageX30432bbd() {
    public override val `value`: String = "BLANK"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineNullableRepositoryMergeCommitMessageX30432bbd()

  public companion object {
    public fun fromValue(`value`: String): InlineNullableRepositoryMergeCommitMessageX30432bbd = when (value) {
      PrBody.value -> PrBody
      PrTitle.value -> PrTitle
      Blank.value -> Blank
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineNullableRepositoryMergeCommitMessageX30432bbd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineNullableRepositoryMergeCommitMessageX30432bbd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineNullableRepositoryMergeCommitMessageX30432bbd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineNullableRepositoryMergeCommitMessageX30432bbd) {
      encoder.encodeString(value.value)
    }
  }
}
