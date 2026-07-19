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
 */
@Serializable(with = InlineComponentsSchemasStopServerToolsWhenMaxCostPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasStopServerToolsWhenMaxCostPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `max_cost`.
   */
  public data object MaxCost : InlineComponentsSchemasStopServerToolsWhenMaxCostPropertiesType() {
    public override val `value`: String = "max_cost"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasStopServerToolsWhenMaxCostPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasStopServerToolsWhenMaxCostPropertiesType =
      when (value) {
      MaxCost.value -> MaxCost
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasStopServerToolsWhenMaxCostPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasStopServerToolsWhenMaxCostPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasStopServerToolsWhenMaxCostPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasStopServerToolsWhenMaxCostPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
