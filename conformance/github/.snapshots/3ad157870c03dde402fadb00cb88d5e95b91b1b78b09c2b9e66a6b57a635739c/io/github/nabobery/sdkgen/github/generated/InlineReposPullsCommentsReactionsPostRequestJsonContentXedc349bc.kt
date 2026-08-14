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
 * The [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions) to add to the pull request
 * review comment.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1comments~1{comment_id}~1reactions/post/requestBo
 * dy/content/application~1json/schema/properties/content
 */
@Serializable(with = InlineReposPullsCommentsReactionsPostRequestJsonContentXedc349bc.Serializer::class)
public sealed class InlineReposPullsCommentsReactionsPostRequestJsonContentXedc349bc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `+1`.
   */
  public data object _1 : InlineReposPullsCommentsReactionsPostRequestJsonContentXedc349bc() {
    public override val `value`: String = "+1"
  }

  /**
   * Documented value. Wire value: `-1`.
   */
  public data object _12 : InlineReposPullsCommentsReactionsPostRequestJsonContentXedc349bc() {
    public override val `value`: String = "-1"
  }

  /**
   * Documented value. Wire value: `laugh`.
   */
  public data object Laugh : InlineReposPullsCommentsReactionsPostRequestJsonContentXedc349bc() {
    public override val `value`: String = "laugh"
  }

  /**
   * Documented value. Wire value: `confused`.
   */
  public data object Confused : InlineReposPullsCommentsReactionsPostRequestJsonContentXedc349bc() {
    public override val `value`: String = "confused"
  }

  /**
   * Documented value. Wire value: `heart`.
   */
  public data object Heart : InlineReposPullsCommentsReactionsPostRequestJsonContentXedc349bc() {
    public override val `value`: String = "heart"
  }

  /**
   * Documented value. Wire value: `hooray`.
   */
  public data object Hooray : InlineReposPullsCommentsReactionsPostRequestJsonContentXedc349bc() {
    public override val `value`: String = "hooray"
  }

  /**
   * Documented value. Wire value: `rocket`.
   */
  public data object Rocket : InlineReposPullsCommentsReactionsPostRequestJsonContentXedc349bc() {
    public override val `value`: String = "rocket"
  }

  /**
   * Documented value. Wire value: `eyes`.
   */
  public data object Eyes : InlineReposPullsCommentsReactionsPostRequestJsonContentXedc349bc() {
    public override val `value`: String = "eyes"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPullsCommentsReactionsPostRequestJsonContentXedc349bc()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPullsCommentsReactionsPostRequestJsonContentXedc349bc = when (value) {
      _1.value -> _1
      _12.value -> _12
      Laugh.value -> Laugh
      Confused.value -> Confused
      Heart.value -> Heart
      Hooray.value -> Hooray
      Rocket.value -> Rocket
      Eyes.value -> Eyes
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposPullsCommentsReactionsPostRequestJsonContentXedc349bc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposPullsCommentsReactionsPostRequestJsonContentXedc349bc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPullsCommentsReactionsPostRequestJsonContentXedc349bc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsCommentsReactionsPostRequestJsonContentXedc349bc) {
      encoder.encodeString(value.value)
    }
  }
}
