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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/order/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/order/schema
 */
@Serializable(with = InlineOrderParameterXdbee056c.Serializer::class)
public sealed class InlineOrderParameterXdbee056c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `desc`.
   */
  public data object Desc : InlineOrderParameterXdbee056c() {
    public override val `value`: String = "desc"
  }

  /**
   * Documented value. Wire value: `asc`.
   */
  public data object Asc : InlineOrderParameterXdbee056c() {
    public override val `value`: String = "asc"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrderParameterXdbee056c()

  public companion object {
    public fun fromValue(`value`: String): InlineOrderParameterXdbee056c = when (value) {
      Desc.value -> Desc
      Asc.value -> Asc
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrderParameterXdbee056c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrderParameterXdbee056c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrderParameterXdbee056c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrderParameterXdbee056c) {
      encoder.encodeString(value.value)
    }
  }
}
