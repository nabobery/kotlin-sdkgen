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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1comments~1{comment_id}~1reactions/get/parameter
 * s/3/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1comments~1{comment_id}~1reactions/get/parameter
 * s/3/schema
 */
@Serializable(with = InlineReposIssuesCommentsReactionsGetParameterX82035019.Serializer::class)
public sealed class InlineReposIssuesCommentsReactionsGetParameterX82035019 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `+1`.
   */
  public data object _1 : InlineReposIssuesCommentsReactionsGetParameterX82035019() {
    public override val `value`: String = "+1"
  }

  /**
   * Documented value. Wire value: `-1`.
   */
  public data object _12 : InlineReposIssuesCommentsReactionsGetParameterX82035019() {
    public override val `value`: String = "-1"
  }

  /**
   * Documented value. Wire value: `laugh`.
   */
  public data object Laugh : InlineReposIssuesCommentsReactionsGetParameterX82035019() {
    public override val `value`: String = "laugh"
  }

  /**
   * Documented value. Wire value: `confused`.
   */
  public data object Confused : InlineReposIssuesCommentsReactionsGetParameterX82035019() {
    public override val `value`: String = "confused"
  }

  /**
   * Documented value. Wire value: `heart`.
   */
  public data object Heart : InlineReposIssuesCommentsReactionsGetParameterX82035019() {
    public override val `value`: String = "heart"
  }

  /**
   * Documented value. Wire value: `hooray`.
   */
  public data object Hooray : InlineReposIssuesCommentsReactionsGetParameterX82035019() {
    public override val `value`: String = "hooray"
  }

  /**
   * Documented value. Wire value: `rocket`.
   */
  public data object Rocket : InlineReposIssuesCommentsReactionsGetParameterX82035019() {
    public override val `value`: String = "rocket"
  }

  /**
   * Documented value. Wire value: `eyes`.
   */
  public data object Eyes : InlineReposIssuesCommentsReactionsGetParameterX82035019() {
    public override val `value`: String = "eyes"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposIssuesCommentsReactionsGetParameterX82035019()

  public companion object {
    public fun fromValue(`value`: String): InlineReposIssuesCommentsReactionsGetParameterX82035019 = when (value) {
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

  public object Serializer : KSerializer<InlineReposIssuesCommentsReactionsGetParameterX82035019> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposIssuesCommentsReactionsGetParameterX82035019", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposIssuesCommentsReactionsGetParameterX82035019 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesCommentsReactionsGetParameterX82035019) {
      encoder.encodeString(value.value)
    }
  }
}
