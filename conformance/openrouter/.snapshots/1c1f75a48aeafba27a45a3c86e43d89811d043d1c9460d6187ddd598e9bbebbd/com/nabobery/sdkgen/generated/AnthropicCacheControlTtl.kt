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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicCacheControlTtl.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCacheControlTtl
 */
@Serializable(with = AnthropicCacheControlTtl.Serializer::class)
public sealed class AnthropicCacheControlTtl {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `5m`.
   */
  public data object _5m : AnthropicCacheControlTtl() {
    public override val `value`: String = "5m"
  }

  /**
   * Documented value. Wire value: `1h`.
   */
  public data object _1h : AnthropicCacheControlTtl() {
    public override val `value`: String = "1h"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : AnthropicCacheControlTtl()

  public companion object {
    public fun fromValue(`value`: String): AnthropicCacheControlTtl = when (value) {
      _5m.value -> _5m
      _1h.value -> _1h
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<AnthropicCacheControlTtl> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.AnthropicCacheControlTtl", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): AnthropicCacheControlTtl = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: AnthropicCacheControlTtl) {
      encoder.encodeString(value.value)
    }
  }
}
