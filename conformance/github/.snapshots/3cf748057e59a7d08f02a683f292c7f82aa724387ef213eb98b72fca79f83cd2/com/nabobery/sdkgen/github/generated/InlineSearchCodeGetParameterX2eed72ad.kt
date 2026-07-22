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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1search~1code/get/parameters/2/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1search~1code/get/parameters/2/schema
 */
@Serializable(with = InlineSearchCodeGetParameterX2eed72ad.Serializer::class)
public sealed class InlineSearchCodeGetParameterX2eed72ad {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `desc`.
   */
  public data object Desc : InlineSearchCodeGetParameterX2eed72ad() {
    public override val `value`: String = "desc"
  }

  /**
   * Documented value. Wire value: `asc`.
   */
  public data object Asc : InlineSearchCodeGetParameterX2eed72ad() {
    public override val `value`: String = "asc"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSearchCodeGetParameterX2eed72ad()

  public companion object {
    public fun fromValue(`value`: String): InlineSearchCodeGetParameterX2eed72ad = when (value) {
      Desc.value -> Desc
      Asc.value -> Asc
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSearchCodeGetParameterX2eed72ad> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSearchCodeGetParameterX2eed72ad", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSearchCodeGetParameterX2eed72ad = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSearchCodeGetParameterX2eed72ad) {
      encoder.encodeString(value.value)
    }
  }
}
