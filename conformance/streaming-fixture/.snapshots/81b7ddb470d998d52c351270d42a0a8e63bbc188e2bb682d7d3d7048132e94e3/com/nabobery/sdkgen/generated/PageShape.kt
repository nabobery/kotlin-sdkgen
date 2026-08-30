package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/PageShape.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/PageShape
 */
@Serializable(with = PageShape.Serializer::class)
public sealed class PageShape {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter`.
   */
  public data object Openrouter : PageShape() {
    public override val `value`: String = "openrouter"
  }

  /**
   * Documented value. Wire value: `openai`.
   */
  public data object Openai : PageShape() {
    public override val `value`: String = "openai"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : PageShape()

  public companion object {
    public fun fromValue(`value`: String): PageShape = when (value) {
      Openrouter.value -> Openrouter
      Openai.value -> Openai
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<PageShape> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.PageShape", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): PageShape = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: PageShape) {
      encoder.encodeString(value.value)
    }
  }
}
