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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1search~1code/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1search~1code/get/parameters/1/schema
 */
@Serializable(with = InlineSearchCodeGetParameterX80cd8ae0.Serializer::class)
public sealed class InlineSearchCodeGetParameterX80cd8ae0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `indexed`.
   */
  public data object Indexed : InlineSearchCodeGetParameterX80cd8ae0() {
    public override val `value`: String = "indexed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSearchCodeGetParameterX80cd8ae0()

  public companion object {
    public fun fromValue(`value`: String): InlineSearchCodeGetParameterX80cd8ae0 = when (value) {
      Indexed.value -> Indexed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSearchCodeGetParameterX80cd8ae0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSearchCodeGetParameterX80cd8ae0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSearchCodeGetParameterX80cd8ae0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSearchCodeGetParameterX80cd8ae0) {
      encoder.encodeString(value.value)
    }
  }
}
