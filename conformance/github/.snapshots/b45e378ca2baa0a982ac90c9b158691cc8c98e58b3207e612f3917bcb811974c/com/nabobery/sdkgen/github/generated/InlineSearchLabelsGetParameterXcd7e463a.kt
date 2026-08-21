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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1search~1labels/get/parameters/2/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1search~1labels/get/parameters/2/schema
 */
@Serializable(with = InlineSearchLabelsGetParameterXcd7e463a.Serializer::class)
public sealed class InlineSearchLabelsGetParameterXcd7e463a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineSearchLabelsGetParameterXcd7e463a() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineSearchLabelsGetParameterXcd7e463a() {
    public override val `value`: String = "updated"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSearchLabelsGetParameterXcd7e463a()

  public companion object {
    public fun fromValue(`value`: String): InlineSearchLabelsGetParameterXcd7e463a = when (value) {
      Created.value -> Created
      Updated.value -> Updated
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSearchLabelsGetParameterXcd7e463a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSearchLabelsGetParameterXcd7e463a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSearchLabelsGetParameterXcd7e463a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSearchLabelsGetParameterXcd7e463a) {
      encoder.encodeString(value.value)
    }
  }
}
