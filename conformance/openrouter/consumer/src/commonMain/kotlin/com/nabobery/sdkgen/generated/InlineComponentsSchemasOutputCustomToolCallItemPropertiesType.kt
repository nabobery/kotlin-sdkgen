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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputCustomToolCallItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputCustomToolCallItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputCustomToolCallItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom_tool_call`.
   */
  public data object CustomToolCall : InlineComponentsSchemasOutputCustomToolCallItemPropertiesType() {
    public override val `value`: String = "custom_tool_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputCustomToolCallItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputCustomToolCallItemPropertiesType =
      when (value) {
      CustomToolCall.value -> CustomToolCall
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputCustomToolCallItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputCustomToolCallItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputCustomToolCallItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputCustomToolCallItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
