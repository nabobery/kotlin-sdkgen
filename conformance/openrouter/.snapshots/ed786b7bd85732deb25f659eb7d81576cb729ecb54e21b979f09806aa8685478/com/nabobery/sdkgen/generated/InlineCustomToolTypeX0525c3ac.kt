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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/CustomTool/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CustomTool/properties/type
 */
@Serializable(with = InlineCustomToolTypeX0525c3ac.Serializer::class)
public sealed class InlineCustomToolTypeX0525c3ac {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom`.
   */
  public data object Custom : InlineCustomToolTypeX0525c3ac() {
    public override val `value`: String = "custom"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomToolTypeX0525c3ac()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomToolTypeX0525c3ac = when (value) {
      Custom.value -> Custom
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomToolTypeX0525c3ac> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineCustomToolTypeX0525c3ac", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomToolTypeX0525c3ac = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomToolTypeX0525c3ac) {
      encoder.encodeString(value.value)
    }
  }
}
