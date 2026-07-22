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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1search~1issues/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1search~1issues/get/parameters/1/schema
 */
@Serializable(with = InlineSearchIssuesGetParameterXb2138b73.Serializer::class)
public sealed class InlineSearchIssuesGetParameterXb2138b73 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `comments`.
   */
  public data object Comments : InlineSearchIssuesGetParameterXb2138b73() {
    public override val `value`: String = "comments"
  }

  /**
   * Documented value. Wire value: `reactions`.
   */
  public data object Reactions : InlineSearchIssuesGetParameterXb2138b73() {
    public override val `value`: String = "reactions"
  }

  /**
   * Documented value. Wire value: `reactions-+1`.
   */
  public data object Reactions1 : InlineSearchIssuesGetParameterXb2138b73() {
    public override val `value`: String = "reactions-+1"
  }

  /**
   * Documented value. Wire value: `reactions--1`.
   */
  public data object Reactions12 : InlineSearchIssuesGetParameterXb2138b73() {
    public override val `value`: String = "reactions--1"
  }

  /**
   * Documented value. Wire value: `reactions-smile`.
   */
  public data object ReactionsSmile : InlineSearchIssuesGetParameterXb2138b73() {
    public override val `value`: String = "reactions-smile"
  }

  /**
   * Documented value. Wire value: `reactions-thinking_face`.
   */
  public data object ReactionsThinkingFace : InlineSearchIssuesGetParameterXb2138b73() {
    public override val `value`: String = "reactions-thinking_face"
  }

  /**
   * Documented value. Wire value: `reactions-heart`.
   */
  public data object ReactionsHeart : InlineSearchIssuesGetParameterXb2138b73() {
    public override val `value`: String = "reactions-heart"
  }

  /**
   * Documented value. Wire value: `reactions-tada`.
   */
  public data object ReactionsTada : InlineSearchIssuesGetParameterXb2138b73() {
    public override val `value`: String = "reactions-tada"
  }

  /**
   * Documented value. Wire value: `interactions`.
   */
  public data object Interactions : InlineSearchIssuesGetParameterXb2138b73() {
    public override val `value`: String = "interactions"
  }

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineSearchIssuesGetParameterXb2138b73() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineSearchIssuesGetParameterXb2138b73() {
    public override val `value`: String = "updated"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSearchIssuesGetParameterXb2138b73()

  public companion object {
    public fun fromValue(`value`: String): InlineSearchIssuesGetParameterXb2138b73 = when (value) {
      Comments.value -> Comments
      Reactions.value -> Reactions
      Reactions1.value -> Reactions1
      Reactions12.value -> Reactions12
      ReactionsSmile.value -> ReactionsSmile
      ReactionsThinkingFace.value -> ReactionsThinkingFace
      ReactionsHeart.value -> ReactionsHeart
      ReactionsTada.value -> ReactionsTada
      Interactions.value -> Interactions
      Created.value -> Created
      Updated.value -> Updated
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSearchIssuesGetParameterXb2138b73> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSearchIssuesGetParameterXb2138b73", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSearchIssuesGetParameterXb2138b73 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSearchIssuesGetParameterXb2138b73) {
      encoder.encodeString(value.value)
    }
  }
}
