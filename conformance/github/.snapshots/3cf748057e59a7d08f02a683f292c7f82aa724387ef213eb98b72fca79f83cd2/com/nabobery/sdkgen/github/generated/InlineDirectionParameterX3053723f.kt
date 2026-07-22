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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/direction/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/direction/schema
 */
@Serializable(with = InlineDirectionParameterX3053723f.Serializer::class)
public sealed class InlineDirectionParameterX3053723f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `asc`.
   */
  public data object Asc : InlineDirectionParameterX3053723f() {
    public override val `value`: String = "asc"
  }

  /**
   * Documented value. Wire value: `desc`.
   */
  public data object Desc : InlineDirectionParameterX3053723f() {
    public override val `value`: String = "desc"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDirectionParameterX3053723f()

  public companion object {
    public fun fromValue(`value`: String): InlineDirectionParameterX3053723f = when (value) {
      Asc.value -> Asc
      Desc.value -> Desc
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineDirectionParameterX3053723f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineDirectionParameterX3053723f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDirectionParameterX3053723f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDirectionParameterX3053723f) {
      encoder.encodeString(value.value)
    }
  }
}
