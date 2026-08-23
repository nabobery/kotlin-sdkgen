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
 * sdkgen://source/openapi.yaml#/components/schemas/StopServerToolsWhenMaxCost/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/StopServerToolsWhenMaxCost/properties/type
 */
@Serializable(with = InlineStopServerToolsWhenMaxCostTypeXb96d6305.Serializer::class)
public sealed class InlineStopServerToolsWhenMaxCostTypeXb96d6305 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `max_cost`.
   */
  public data object MaxCost : InlineStopServerToolsWhenMaxCostTypeXb96d6305() {
    public override val `value`: String = "max_cost"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineStopServerToolsWhenMaxCostTypeXb96d6305()

  public companion object {
    public fun fromValue(`value`: String): InlineStopServerToolsWhenMaxCostTypeXb96d6305 = when (value) {
      MaxCost.value -> MaxCost
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineStopServerToolsWhenMaxCostTypeXb96d6305> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineStopServerToolsWhenMaxCostTypeXb96d6305", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineStopServerToolsWhenMaxCostTypeXb96d6305 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineStopServerToolsWhenMaxCostTypeXb96d6305) {
      encoder.encodeString(value.value)
    }
  }
}
