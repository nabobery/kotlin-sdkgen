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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputBrowserUseServerToolItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputBrowserUseServerToolItem/properties/type
 */
@Serializable(with = InlineOutputBrowserUseServerToolItemTypeX96bf58e6.Serializer::class)
public sealed class InlineOutputBrowserUseServerToolItemTypeX96bf58e6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:browser_use`.
   */
  public data object OpenrouterBrowserUse : InlineOutputBrowserUseServerToolItemTypeX96bf58e6() {
    public override val `value`: String = "openrouter:browser_use"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputBrowserUseServerToolItemTypeX96bf58e6()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputBrowserUseServerToolItemTypeX96bf58e6 = when (value) {
      OpenrouterBrowserUse.value -> OpenrouterBrowserUse
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputBrowserUseServerToolItemTypeX96bf58e6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputBrowserUseServerToolItemTypeX96bf58e6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputBrowserUseServerToolItemTypeX96bf58e6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputBrowserUseServerToolItemTypeX96bf58e6) {
      encoder.encodeString(value.value)
    }
  }
}
