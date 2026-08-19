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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CustomToolCallItem/properties/type
 */
@Serializable(with = InlineCustomToolCallItemTypeX522cffb3.Serializer::class)
public sealed class InlineCustomToolCallItemTypeX522cffb3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom_tool_call`.
   */
  public data object CustomToolCall : InlineCustomToolCallItemTypeX522cffb3() {
    public override val `value`: String = "custom_tool_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomToolCallItemTypeX522cffb3()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomToolCallItemTypeX522cffb3 = when (value) {
      CustomToolCall.value -> CustomToolCall
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomToolCallItemTypeX522cffb3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineCustomToolCallItemTypeX522cffb3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomToolCallItemTypeX522cffb3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomToolCallItemTypeX522cffb3) {
      encoder.encodeString(value.value)
    }
  }
}
