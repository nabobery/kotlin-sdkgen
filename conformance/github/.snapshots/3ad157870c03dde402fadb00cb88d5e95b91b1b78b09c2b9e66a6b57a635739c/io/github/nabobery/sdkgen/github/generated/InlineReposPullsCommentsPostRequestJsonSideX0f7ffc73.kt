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
 * In a split diff view, the side of the diff that the pull request's changes appear on. Can be `LEFT` or `RIGHT`. Use
 * `LEFT` for deletions that appear in red. Use `RIGHT` for additions that appear in green or unchanged lines that
 * appear in white and are shown for context. For a multi-line comment, side represents whether the last line of the
 * comment range is a deletion or addition. For more information, see "[Diff view
 * options](https://docs.github.com/articles/about-comparing-branches-in-pull-requests#diff-view-options)" in the GitHub
 * Help documentation.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1comments/post/requestBody/content
 * /application~1json/schema/properties/side
 */
@Serializable(with = InlineReposPullsCommentsPostRequestJsonSideX0f7ffc73.Serializer::class)
public sealed class InlineReposPullsCommentsPostRequestJsonSideX0f7ffc73 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `LEFT`.
   */
  public data object Left : InlineReposPullsCommentsPostRequestJsonSideX0f7ffc73() {
    public override val `value`: String = "LEFT"
  }

  /**
   * Documented value. Wire value: `RIGHT`.
   */
  public data object Right : InlineReposPullsCommentsPostRequestJsonSideX0f7ffc73() {
    public override val `value`: String = "RIGHT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPullsCommentsPostRequestJsonSideX0f7ffc73()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPullsCommentsPostRequestJsonSideX0f7ffc73 = when (value) {
      Left.value -> Left
      Right.value -> Right
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposPullsCommentsPostRequestJsonSideX0f7ffc73> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposPullsCommentsPostRequestJsonSideX0f7ffc73", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPullsCommentsPostRequestJsonSideX0f7ffc73 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsCommentsPostRequestJsonSideX0f7ffc73) {
      encoder.encodeString(value.value)
    }
  }
}
