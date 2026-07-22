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
 * The [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions) to add to the issue comment.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1comments~1{comment_id}~1reactions/post/requestB
 * ody/content/application~1json/schema/properties/content
 */
@Serializable(with = InlineReposIssuesCommentsReactionsPostRequestJsonContentX0653f44a.Serializer::class)
public sealed class InlineReposIssuesCommentsReactionsPostRequestJsonContentX0653f44a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `+1`.
   */
  public data object _1 : InlineReposIssuesCommentsReactionsPostRequestJsonContentX0653f44a() {
    public override val `value`: String = "+1"
  }

  /**
   * Documented value. Wire value: `-1`.
   */
  public data object _12 : InlineReposIssuesCommentsReactionsPostRequestJsonContentX0653f44a() {
    public override val `value`: String = "-1"
  }

  /**
   * Documented value. Wire value: `laugh`.
   */
  public data object Laugh : InlineReposIssuesCommentsReactionsPostRequestJsonContentX0653f44a() {
    public override val `value`: String = "laugh"
  }

  /**
   * Documented value. Wire value: `confused`.
   */
  public data object Confused : InlineReposIssuesCommentsReactionsPostRequestJsonContentX0653f44a() {
    public override val `value`: String = "confused"
  }

  /**
   * Documented value. Wire value: `heart`.
   */
  public data object Heart : InlineReposIssuesCommentsReactionsPostRequestJsonContentX0653f44a() {
    public override val `value`: String = "heart"
  }

  /**
   * Documented value. Wire value: `hooray`.
   */
  public data object Hooray : InlineReposIssuesCommentsReactionsPostRequestJsonContentX0653f44a() {
    public override val `value`: String = "hooray"
  }

  /**
   * Documented value. Wire value: `rocket`.
   */
  public data object Rocket : InlineReposIssuesCommentsReactionsPostRequestJsonContentX0653f44a() {
    public override val `value`: String = "rocket"
  }

  /**
   * Documented value. Wire value: `eyes`.
   */
  public data object Eyes : InlineReposIssuesCommentsReactionsPostRequestJsonContentX0653f44a() {
    public override val `value`: String = "eyes"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposIssuesCommentsReactionsPostRequestJsonContentX0653f44a()

  public companion object {
    public fun fromValue(`value`: String): InlineReposIssuesCommentsReactionsPostRequestJsonContentX0653f44a = when (value) {
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

  public object Serializer : KSerializer<InlineReposIssuesCommentsReactionsPostRequestJsonContentX0653f44a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposIssuesCommentsReactionsPostRequestJsonContentX0653f44a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposIssuesCommentsReactionsPostRequestJsonContentX0653f44a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesCommentsReactionsPostRequestJsonContentX0653f44a) {
      encoder.encodeString(value.value)
    }
  }
}
