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
 * **Required when using multi-line comments unless using `in_reply_to`**. The `start_side` is the starting side of the
 * diff that the comment applies to. Can be `LEFT` or `RIGHT`. To learn more about multi-line comments, see "[Commenting
 * on a pull
 * request](https://docs.github.com/articles/commenting-on-a-pull-request#adding-line-comments-to-a-pull-request)" in
 * the GitHub Help documentation. See `side` in this table for additional context.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1comments/post/requestBody/content
 * /application~1json/schema/properties/start_side
 */
@Serializable(with = InlineReposPullsCommentsPostRequestJsonStartSideX76f5bc57.Serializer::class)
public sealed class InlineReposPullsCommentsPostRequestJsonStartSideX76f5bc57 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `LEFT`.
   */
  public data object Left : InlineReposPullsCommentsPostRequestJsonStartSideX76f5bc57() {
    public override val `value`: String = "LEFT"
  }

  /**
   * Documented value. Wire value: `RIGHT`.
   */
  public data object Right : InlineReposPullsCommentsPostRequestJsonStartSideX76f5bc57() {
    public override val `value`: String = "RIGHT"
  }

  /**
   * Documented value. Wire value: `side`.
   */
  public data object Side : InlineReposPullsCommentsPostRequestJsonStartSideX76f5bc57() {
    public override val `value`: String = "side"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPullsCommentsPostRequestJsonStartSideX76f5bc57()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPullsCommentsPostRequestJsonStartSideX76f5bc57 = when (value) {
      Left.value -> Left
      Right.value -> Right
      Side.value -> Side
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposPullsCommentsPostRequestJsonStartSideX76f5bc57> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposPullsCommentsPostRequestJsonStartSideX76f5bc57", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPullsCommentsPostRequestJsonStartSideX76f5bc57 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsCommentsPostRequestJsonStartSideX76f5bc57) {
      encoder.encodeString(value.value)
    }
  }
}
