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
 * The [reaction type](https://docs.github.com/rest/reactions/reactions#about-reactions) to add to the issue.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1reactions/post/requestBody/cont
 * ent/application~1json/schema/properties/content
 */
@Serializable(with = InlineReposIssuesReactionsPostRequestJsonContentXf9df98c8.Serializer::class)
public sealed class InlineReposIssuesReactionsPostRequestJsonContentXf9df98c8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `+1`.
   */
  public data object _1 : InlineReposIssuesReactionsPostRequestJsonContentXf9df98c8() {
    public override val `value`: String = "+1"
  }

  /**
   * Documented value. Wire value: `-1`.
   */
  public data object _12 : InlineReposIssuesReactionsPostRequestJsonContentXf9df98c8() {
    public override val `value`: String = "-1"
  }

  /**
   * Documented value. Wire value: `laugh`.
   */
  public data object Laugh : InlineReposIssuesReactionsPostRequestJsonContentXf9df98c8() {
    public override val `value`: String = "laugh"
  }

  /**
   * Documented value. Wire value: `confused`.
   */
  public data object Confused : InlineReposIssuesReactionsPostRequestJsonContentXf9df98c8() {
    public override val `value`: String = "confused"
  }

  /**
   * Documented value. Wire value: `heart`.
   */
  public data object Heart : InlineReposIssuesReactionsPostRequestJsonContentXf9df98c8() {
    public override val `value`: String = "heart"
  }

  /**
   * Documented value. Wire value: `hooray`.
   */
  public data object Hooray : InlineReposIssuesReactionsPostRequestJsonContentXf9df98c8() {
    public override val `value`: String = "hooray"
  }

  /**
   * Documented value. Wire value: `rocket`.
   */
  public data object Rocket : InlineReposIssuesReactionsPostRequestJsonContentXf9df98c8() {
    public override val `value`: String = "rocket"
  }

  /**
   * Documented value. Wire value: `eyes`.
   */
  public data object Eyes : InlineReposIssuesReactionsPostRequestJsonContentXf9df98c8() {
    public override val `value`: String = "eyes"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposIssuesReactionsPostRequestJsonContentXf9df98c8()

  public companion object {
    public fun fromValue(`value`: String): InlineReposIssuesReactionsPostRequestJsonContentXf9df98c8 = when (value) {
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

  public object Serializer : KSerializer<InlineReposIssuesReactionsPostRequestJsonContentXf9df98c8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposIssuesReactionsPostRequestJsonContentXf9df98c8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposIssuesReactionsPostRequestJsonContentXf9df98c8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesReactionsPostRequestJsonContentXf9df98c8) {
      encoder.encodeString(value.value)
    }
  }
}
