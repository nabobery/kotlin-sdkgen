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
 * The reaction to use
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/reaction/properties/content
 */
@Serializable(with = InlineReactionContentX0b4d4a00.Serializer::class)
public sealed class InlineReactionContentX0b4d4a00 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `+1`.
   */
  public data object _1 : InlineReactionContentX0b4d4a00() {
    public override val `value`: String = "+1"
  }

  /**
   * Documented value. Wire value: `-1`.
   */
  public data object _12 : InlineReactionContentX0b4d4a00() {
    public override val `value`: String = "-1"
  }

  /**
   * Documented value. Wire value: `laugh`.
   */
  public data object Laugh : InlineReactionContentX0b4d4a00() {
    public override val `value`: String = "laugh"
  }

  /**
   * Documented value. Wire value: `confused`.
   */
  public data object Confused : InlineReactionContentX0b4d4a00() {
    public override val `value`: String = "confused"
  }

  /**
   * Documented value. Wire value: `heart`.
   */
  public data object Heart : InlineReactionContentX0b4d4a00() {
    public override val `value`: String = "heart"
  }

  /**
   * Documented value. Wire value: `hooray`.
   */
  public data object Hooray : InlineReactionContentX0b4d4a00() {
    public override val `value`: String = "hooray"
  }

  /**
   * Documented value. Wire value: `rocket`.
   */
  public data object Rocket : InlineReactionContentX0b4d4a00() {
    public override val `value`: String = "rocket"
  }

  /**
   * Documented value. Wire value: `eyes`.
   */
  public data object Eyes : InlineReactionContentX0b4d4a00() {
    public override val `value`: String = "eyes"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReactionContentX0b4d4a00()

  public companion object {
    public fun fromValue(`value`: String): InlineReactionContentX0b4d4a00 = when (value) {
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

  internal object Serializer : KSerializer<InlineReactionContentX0b4d4a00> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReactionContentX0b4d4a00", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReactionContentX0b4d4a00 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReactionContentX0b4d4a00) {
      encoder.encodeString(value.value)
    }
  }
}
