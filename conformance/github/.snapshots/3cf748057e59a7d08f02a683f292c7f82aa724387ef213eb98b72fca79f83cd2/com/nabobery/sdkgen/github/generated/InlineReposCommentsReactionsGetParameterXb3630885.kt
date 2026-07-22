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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1comments~1{comment_id}~1reactions/get/parameters/3/sche
 * ma.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1comments~1{comment_id}~1reactions/get/parameters/3/sche
 * ma
 */
@Serializable(with = InlineReposCommentsReactionsGetParameterXb3630885.Serializer::class)
public sealed class InlineReposCommentsReactionsGetParameterXb3630885 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `+1`.
   */
  public data object _1 : InlineReposCommentsReactionsGetParameterXb3630885() {
    public override val `value`: String = "+1"
  }

  /**
   * Documented value. Wire value: `-1`.
   */
  public data object _12 : InlineReposCommentsReactionsGetParameterXb3630885() {
    public override val `value`: String = "-1"
  }

  /**
   * Documented value. Wire value: `laugh`.
   */
  public data object Laugh : InlineReposCommentsReactionsGetParameterXb3630885() {
    public override val `value`: String = "laugh"
  }

  /**
   * Documented value. Wire value: `confused`.
   */
  public data object Confused : InlineReposCommentsReactionsGetParameterXb3630885() {
    public override val `value`: String = "confused"
  }

  /**
   * Documented value. Wire value: `heart`.
   */
  public data object Heart : InlineReposCommentsReactionsGetParameterXb3630885() {
    public override val `value`: String = "heart"
  }

  /**
   * Documented value. Wire value: `hooray`.
   */
  public data object Hooray : InlineReposCommentsReactionsGetParameterXb3630885() {
    public override val `value`: String = "hooray"
  }

  /**
   * Documented value. Wire value: `rocket`.
   */
  public data object Rocket : InlineReposCommentsReactionsGetParameterXb3630885() {
    public override val `value`: String = "rocket"
  }

  /**
   * Documented value. Wire value: `eyes`.
   */
  public data object Eyes : InlineReposCommentsReactionsGetParameterXb3630885() {
    public override val `value`: String = "eyes"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposCommentsReactionsGetParameterXb3630885()

  public companion object {
    public fun fromValue(`value`: String): InlineReposCommentsReactionsGetParameterXb3630885 = when (value) {
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

  public object Serializer : KSerializer<InlineReposCommentsReactionsGetParameterXb3630885> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposCommentsReactionsGetParameterXb3630885", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposCommentsReactionsGetParameterXb3630885 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposCommentsReactionsGetParameterXb3630885) {
      encoder.encodeString(value.value)
    }
  }
}
