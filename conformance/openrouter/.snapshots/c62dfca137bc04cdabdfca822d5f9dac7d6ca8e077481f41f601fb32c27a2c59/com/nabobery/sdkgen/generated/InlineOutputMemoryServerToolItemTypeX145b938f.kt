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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/OutputMemoryServerToolItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputMemoryServerToolItem/properties/type
 */
@Serializable(with = InlineOutputMemoryServerToolItemTypeX145b938f.Serializer::class)
public sealed class InlineOutputMemoryServerToolItemTypeX145b938f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:memory`.
   */
  public data object OpenrouterMemory : InlineOutputMemoryServerToolItemTypeX145b938f() {
    public override val `value`: String = "openrouter:memory"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputMemoryServerToolItemTypeX145b938f()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputMemoryServerToolItemTypeX145b938f = when (value) {
      OpenrouterMemory.value -> OpenrouterMemory
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputMemoryServerToolItemTypeX145b938f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputMemoryServerToolItemTypeX145b938f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputMemoryServerToolItemTypeX145b938f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputMemoryServerToolItemTypeX145b938f) {
      encoder.encodeString(value.value)
    }
  }
}
