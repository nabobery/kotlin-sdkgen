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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/CustomToolCallItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasCustomToolCallItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasCustomToolCallItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom_tool_call`.
   */
  public data object CustomToolCall : InlineComponentsSchemasCustomToolCallItemPropertiesType() {
    public override val `value`: String = "custom_tool_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasCustomToolCallItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasCustomToolCallItemPropertiesType = when (value) {
      CustomToolCall.value -> CustomToolCall
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCustomToolCallItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasCustomToolCallItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCustomToolCallItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasCustomToolCallItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
